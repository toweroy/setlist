package org.toweroy.setlist.setlistfm.obj;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/**
 * Group of Setlists
 *
 * <p>Child Elements</p>
 * name (type)      min/max occurs  description
 * setlist          0/unbounded     result list of setlists
 *
 * Created by richardtolman on 7/31/16.
 */

public class Setlists {
    @SerializedName("@itemsPerPage")
    private final int itemsPerPage;
    @SerializedName("@page")
    private final int page;
    @SerializedName("@total")
    private final int total;
    @SerializedName("setlist")
    private final List<Setlist> setlists;

    public Setlists(int itemsPerPage, int page, int total, List<Setlist> setlists) {
        this.itemsPerPage = itemsPerPage;
        this.page = page;
        this.total = total;
        this.setlists = setlists;
    }

    public List<Setlist> getSetlists() {
        return setlists;
    }

    public int getItemsPerPage() {
        return itemsPerPage;
    }

    public int getPage() {
        return page;
    }

    public int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        StringBuilder setlistsText = new StringBuilder();
        boolean first = true;
        if (setlists != null) {
            try {
                Class<?> fieldType = Setlists.class.getField("setlists").getType();
                System.out.println("Setlists CLASS: " + getSimpleTypeName(fieldType));
            } catch (SecurityException e) {
            } catch (NoSuchFieldException e) {
            }
            for (Setlist item : setlists) {
                if (first) {
                    first = false;
                } else {
                    setlistsText.append("; ");
                }
                setlistsText.append(item.toString());
            }
        }
        return "Setlists {" +
                "itemsPerPage='" + itemsPerPage + '\'' +
                ", page='" + page + '\'' +
                ", total='" + total + '\'' +
                ", [SETLISTS: " + setlistsText.toString() + "]}";
    }

    @SuppressWarnings("unchecked")
    public static String getSimpleTypeName(Type type) {
        if (type == null) {
            return "null";
        }
        if (type instanceof Class) {
            return ((Class) type).getSimpleName();
        } else if (type instanceof ParameterizedType) {
            ParameterizedType pType = (ParameterizedType) type;
            StringBuilder sb = new StringBuilder(getSimpleTypeName(pType.getRawType()));
            sb.append('<');
            boolean first = true;
            for (Type argumentType : pType.getActualTypeArguments()) {
                if (first) {
                    first = false;
                } else {
                    sb.append(',');
                }
                sb.append(getSimpleTypeName(argumentType));
            }
            sb.append('>');
            return sb.toString();
        } else if (type instanceof WildcardType) {
            return "?";
        }
        return type.toString();
    }

    public static class SetlistsTypeAdapter implements JsonDeserializer<List<Setlists>> {
        public List<Setlists> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext ctx) {
            List<Setlists> vals = new ArrayList<>();
            if (json.isJsonArray()) {
                for (JsonElement e : json.getAsJsonArray()) {
                    vals.add((Setlists) ctx.deserialize(e, Setlists.class));
                }
            } else if (json.isJsonObject()) {
                vals.add((Setlists) ctx.deserialize(json, Setlists.class));
            } else {
                throw new RuntimeException("Unexpected JSON type: " + json.getClass());
            }
            return vals;
        }
    }

    public static Setlists toSetlists(String data) {
        Type setlistType = new TypeToken<List<Setlist>>() {}.getType();
        Type artistSetListType = new TypeToken<List<ArtistSet>>() {}.getType();
        Type artistSetListsType = new TypeToken<List<ArtistSets>>() {}.getType();
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(setlistType, new Setlist.SetlistTypeAdapter())
                .registerTypeAdapter(artistSetListType, new ArtistSet.ArtistSetTypeAdapter())
                .registerTypeAdapter(artistSetListsType, new ArtistSets.ArtistSetsTypeAdapter())
                .create();
        return gson.fromJson(data, Setlists.class);
    }
}
