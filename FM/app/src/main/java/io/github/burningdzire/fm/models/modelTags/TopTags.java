package io.github.burningdzire.fm.models.modelTags;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class TopTags {
    @SerializedName("@attr")
    private Attr attr;
    @SerializedName("tag")
    private List<Tag> tag;

    public Attr getAttr() {
        return this.attr;
    }

    public void setAttr(Attr attr) {
        this.attr = attr;
    }

    public List<Tag> getTag() {
        return this.tag;
    }

    public void setTag(ArrayList<Tag> tag) {
        this.tag = tag;
    }
}
