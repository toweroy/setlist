package org.toweroy.setlist.setlistfm.obj;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/**
 * Attended events object
 *
 * <p>Child Elements</p>
 * name (type)      min/max occurs  description
 * setlists         0/unbounded     result list of setlists
 *
 * Created by richardtolman on 7/31/16.
 */
public class Attended {
    private final List<Setlists> setlists;

    public Attended(List<Setlists> setlists) {
        this.setlists = setlists;
    }

    public List<Setlists> getSetlists() {
        return setlists;
    }

    @Override
    public String toString() {
        StringBuilder setlistsText = new StringBuilder();
        boolean first = true;
        if (setlists != null) {
            try {
                Class<?> fieldType = Setlists.class.getField("setlists").getType();
                System.out.println("Attended CLASS: " + getSimpleTypeName(fieldType));
            } catch (SecurityException e) {
            } catch (NoSuchFieldException e) {
            }
            for (Setlists item : setlists) {
                if (first) {
                    first = false;
                } else {
                    setlistsText.append("; ");
                }
                setlistsText.append(item);
            }
        }
        return "Attended {[SETLISTS: " + setlistsText.toString() + "]}";
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

    public static Attended toAttended(String data) {
        Type artistSetListType = new TypeToken<List<ArtistSet>>() {}.getType();
        Type artistSetListsType = new TypeToken<List<ArtistSets>>() {}.getType();
        Type setlistType = new TypeToken<List<Setlist>>() {}.getType();
        Type setlistsType = new TypeToken<List<Setlists>>() {}.getType();
        Type songType = new TypeToken<List<Song>>() {}.getType();
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(artistSetListType, new ArtistSet.ArtistSetTypeAdapter())
                .registerTypeAdapter(artistSetListsType, new ArtistSets.ArtistSetsTypeAdapter())
                .registerTypeAdapter(setlistType, new Setlist.SetlistTypeAdapter())
                .registerTypeAdapter(setlistsType, new Setlists.SetlistsTypeAdapter())
                .registerTypeAdapter(songType, new Song.SongTypeAdapter())
                .create();
        return gson.fromJson(data, Attended.class);
    }
}
