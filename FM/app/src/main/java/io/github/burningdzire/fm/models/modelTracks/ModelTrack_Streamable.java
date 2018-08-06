package io.github.burningdzire.fm.models.modelTracks;

import com.google.gson.annotations.SerializedName;

public class ModelTrack_Streamable {

    @SerializedName("#text")
    private String text;

    public String getText() { return this.text; }

    public void setText(String text) { this.text = text; }

    @SerializedName("fulltrack")
    private String fulltrack;

    public String getFulltrack() { return this.fulltrack; }

    public void setFulltrack(String fulltrack) { this.fulltrack = fulltrack; }
}
