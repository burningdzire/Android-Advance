package io.github.burningdzire.fm.models.modelArtists;

import com.google.gson.annotations.SerializedName;

public class ModelArtist_Attr {

    @SerializedName("rank")
    private String rank;

    public String getRank() { return this.rank; }

    public void setRank(String rank) { this.rank = rank; }
}
