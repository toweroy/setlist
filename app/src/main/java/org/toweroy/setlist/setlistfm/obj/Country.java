package org.toweroy.setlist.setlistfm.obj;

import com.google.gson.annotations.SerializedName;

/**
 * Country POJO
 *
 * <p>
 * name     type    description
 * name     string  The country's name. Can be a localized name - e.g. "Austria" or "Österreich" for Austria if the German name was requested.
 * code     string  The country's ISO code. E.g. "ie" for Ireland
 * <p>
 *
 * Created by richardtolman on 7/31/16.
 */
public class Country {
    @SerializedName("@name")
    private final String name;
    @SerializedName("@code")
    private final String code;

    public Country(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
