package org.toweroy.setlist.setlistfm.obj;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by richardtolman on 7/31/16.
 */
public class ArtistSets {
    @SerializedName("set")
    private final List<ArtistSet> sets;

    public ArtistSets(List<ArtistSet> sets) {
        this.sets = sets;
    }

    public List<ArtistSet> getSets() {
        return sets;
    }

    @Override
    public String toString() {
        return "ArtistSets {" +
                "sets=" + sets +
                '}';
    }

    public static class ArtistSetsTypeAdapter implements JsonDeserializer<List<ArtistSets>> {
        public List<ArtistSets> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext ctx) {
            List<ArtistSets> vals = new ArrayList<>();
            if (json.isJsonArray()) {
                for (JsonElement e : json.getAsJsonArray()) {
                    vals.add((ArtistSets) ctx.deserialize(e, ArtistSets.class));
                }
            } else if (json.isJsonObject()) {
                vals.add((ArtistSets) ctx.deserialize(json, ArtistSets.class));
            } else if (json.isJsonPrimitive()) {
                vals = new ArrayList<>();
            } else {
                throw new RuntimeException("Unexpected JSON type: " + json.getClass());
            }
            return vals;
        }
    }
}
