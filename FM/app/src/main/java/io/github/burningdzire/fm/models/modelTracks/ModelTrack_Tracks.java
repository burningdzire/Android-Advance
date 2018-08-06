package io.github.burningdzire.fm.models.modelTracks;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelTrack_Tracks {

    @SerializedName("track")
    private List<ModelTrack_Track> track;

    public List<ModelTrack_Track> getTrack() { return this.track; }

    public void setTrack(List<ModelTrack_Track> track) { this.track = track; }

    @SerializedName("@attr")
    private ModelTrack_Attr2 attr;

    public ModelTrack_Attr2 getAttr() { return this.attr; }

    public void setAttr(ModelTrack_Attr2 attr) { this.attr = attr; }
}
