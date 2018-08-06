package io.github.burningdzire.fm.models.modelTracks;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelTrack_Track {

    @SerializedName("name")
    private String name;

    public String getName() { return this.name; }

    public void setName(String name) { this.name = name; }

    @SerializedName("duration")
    private String duration;

    public String getDuration() { return this.duration; }

    public void setDuration(String duration) { this.duration = duration; }

    @SerializedName("mbid")
    private String mbid;

    public String getMbid() { return this.mbid; }

    public void setMbid(String mbid) { this.mbid = mbid; }

    @SerializedName("url")
    private String url;

    public String getUrl() { return this.url; }

    public void setUrl(String url) { this.url = url; }

    @SerializedName("streamable")
    private ModelTrack_Streamable streamable;

    public ModelTrack_Streamable getStreamable() { return this.streamable; }

    public void setStreamable(ModelTrack_Streamable streamable) { this.streamable = streamable; }

    @SerializedName("artist")
    private ModelTrack_Artist artist;

    public ModelTrack_Artist getArtist() { return this.artist; }

    public void setArtist(ModelTrack_Artist artist) { this.artist = artist; }

    @SerializedName("image")
    private List<ModelTrack_Image> image;

    public List<ModelTrack_Image> getImage() { return this.image; }

    public void setImage(List<ModelTrack_Image> image) { this.image = image; }

    @SerializedName("@attr")
    private ModelTrack_Attr attr;

    public ModelTrack_Attr getAttr() { return this.attr; }

    public void setAttr(ModelTrack_Attr attr) { this.attr = attr; }
}
