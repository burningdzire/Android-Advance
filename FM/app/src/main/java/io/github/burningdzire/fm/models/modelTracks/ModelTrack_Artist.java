package io.github.burningdzire.fm.models.modelTracks;

import com.google.gson.annotations.SerializedName;

public class ModelTrack_Artist {

    @SerializedName("name")
    private String name;

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    @SerializedName("mbid")
    private String mbid;

    public String getMbid() { return this.mbid; }

    public void setMbid(String mbid) { this.mbid = mbid; }

    @SerializedName("url")
    private String url;

    public String getUrl() { return this.url; }

    public void setUrl(String url) { this.url = url; }

}
