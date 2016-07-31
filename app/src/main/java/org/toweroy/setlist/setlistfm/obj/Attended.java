package org.toweroy.setlist.setlistfm.obj;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
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
        Type setlistsListType = new TypeToken<List<Setlists>>() {}.getType();
        Type artistSetListType = new TypeToken<List<ArtistSet>>() {}.getType();
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(setlistsListType, new Setlists.SetlistsTypeAdapter())
                .registerTypeAdapter(artistSetListType, new ArtistSets.ArtistSetTypeAdapter())
                .create();
        return gson.fromJson(data, Attended.class);
    }
}
