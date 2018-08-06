package io.github.burningdzire.fm.models.modelAlbums;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ModelAlbum_Album {

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

    @SerializedName("artist")
    private ModelAlbum_Artist artist;

    public ModelAlbum_Artist getArtist() { return this.artist; }

    public void setArtist(ModelAlbum_Artist artist) { this.artist = artist; }

    @SerializedName("image")
    private List<ModelAlbum_Image> image;

    public List<ModelAlbum_Image> getImage() { return this.image; }

    public void setImage(List<ModelAlbum_Image> image) { this.image = image; }

    @SerializedName("@attr")
    private ModelAlbum_Attr attr;

    public ModelAlbum_Attr getAttr() { return this.attr; }

    public void setAttr(ModelAlbum_Attr attr) { this.attr = attr; }
}
