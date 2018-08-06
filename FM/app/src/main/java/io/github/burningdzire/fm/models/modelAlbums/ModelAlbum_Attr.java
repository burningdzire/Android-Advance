package io.github.burningdzire.fm.models.modelAlbums;

import com.google.gson.annotations.SerializedName;

public class ModelAlbum_Attr {

    @SerializedName("rank")
    private String rank;

    public String getRank() { return this.rank; }

    public void setRank(String rank) { this.rank = rank; }

}
