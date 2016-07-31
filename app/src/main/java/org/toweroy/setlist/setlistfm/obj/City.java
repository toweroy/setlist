package org.toweroy.setlist.setlistfm.obj;

import com.google.gson.annotations.SerializedName;

/**
 * City POJO
 *
 * <p>
 * name         type    description
 * id           string  unique identifier
 * name         string  the city's name, depending on the language valid values are e.g. "Müchen" or Munich
 * state        string  The name of city's state, e.g. "Bavaria" or "Florida"
 * stateCode    string  The code of the city's state. For most countries this two-digit numeric code, with which the state can be identified uniquely in the specific Country. The code can also be a String for other cities. Valid examples are "CA" or "02" which in turn get uniquely identifiable when combined with the state's country: "US.CA" for California, United States or "DE.02" for Bavaria, Germany For a complete list of available states (that aren't necessarily used in this database) is available in a textfile on geonames.org. Note that this code is only unique combined with the city's Country. The code alone is not unique.
 * <p>
 *
 * Created by richardtolman on 7/31/16.
 */
public class City {
    @SerializedName("@id")
    private final String id;
    @SerializedName("@name")
    private final String name;
    @SerializedName("@state")
    private final String state;
    @SerializedName("@stateCode")
    private final String stateCode;
    private final Coords coords;
    private final Country country;

    public City(String id, String name, String state, String stateCode, Coords coords, Country country) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.stateCode = stateCode;
        this.coords = coords;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public String getStateCode() {
        return stateCode;
    }

    public Coords getCoords() {
        return coords;
    }

    public Country getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "City {" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", stateCode='" + stateCode + '\'' +
                ", coords=" + coords +
                ", country=" + country +
                '}';
    }
}
