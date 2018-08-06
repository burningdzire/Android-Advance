package io.github.burningdzire.fm.models.modelArtists;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelArtists_TopArtists {

    @SerializedName("artist")
    private List<ModelArtist_Artist> artist;

    public List<ModelArtist_Artist> getArtist() { return this.artist; }

    public void setArtist(List<ModelArtist_Artist> artist) { this.artist = artist; }

    @SerializedName("@attr")
    private ModelArtist_Attr2 attr;

    public ModelArtist_Attr2 getAttr() { return this.attr; }

    public void setAttr(ModelArtist_Attr2 attr) { this.attr = attr; }
}
