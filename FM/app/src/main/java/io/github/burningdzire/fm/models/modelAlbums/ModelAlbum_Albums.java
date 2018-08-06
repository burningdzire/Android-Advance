package io.github.burningdzire.fm.models.modelAlbums;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelAlbum_Albums {

    @SerializedName("album")
    private List<ModelAlbum_Album> album;

    public List<ModelAlbum_Album> getAlbum() { return this.album; }

    public void setAlbum(List<ModelAlbum_Album> album) { this.album = album; }

    @SerializedName("@attr")
    private ModelAlbum_Attr2 attr;

    public ModelAlbum_Attr2 getAttr() { return this.attr; }

    public void setAttr(ModelAlbum_Attr2 attr) { this.attr = attr; }
}
