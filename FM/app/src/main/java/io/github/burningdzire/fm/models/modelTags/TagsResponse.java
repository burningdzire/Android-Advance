package io.github.burningdzire.fm.models.modelTags;

import com.google.gson.annotations.SerializedName;

public class TagsResponse {

    @SerializedName("toptags")
    private TopTags toptags;

    public TopTags getToptags() {
        return this.toptags;
    }

    public void setToptags(TopTags toptags) {
        this.toptags = toptags;
    }
}
