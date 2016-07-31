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

    public static class ArtistSetTypeAdapter implements JsonDeserializer<List<ArtistSet>> {
        public List<ArtistSet> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext ctx) {
            List<ArtistSet> vals = new ArrayList<>();
            if (json.isJsonArray()) {
                for (JsonElement e : json.getAsJsonArray()) {
                    vals.add((ArtistSet) ctx.deserialize(e, ArtistSet.class));
                }
            } else if (json.isJsonObject()) {
                vals.add((ArtistSet) ctx.deserialize(json, ArtistSet.class));
            } else {
                throw new RuntimeException("Unexpected JSON type: " + json.getClass());
            }
            return vals;
        }
    }
}
