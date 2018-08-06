package io.github.burningdzire.fm.models.modelArtists;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelArtist_Artist {

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

    @SerializedName("streamable")
    private String streamable;

    public String getStreamable() { return this.streamable; }

    public void setStreamable(String streamable) { this.streamable = streamable; }

    @SerializedName("image")
    private List<ModelArtist_Image> image;

    public List<ModelArtist_Image> getImage() { return this.image; }

    public void setImage(List<ModelArtist_Image> image) { this.image = image; }

    @SerializedName("@attr")
    private ModelArtist_Attr attr;

    public ModelArtist_Attr getAttr() { return this.attr; }

    public void setAttr(ModelArtist_Attr attr) { this.attr = attr; }
}
