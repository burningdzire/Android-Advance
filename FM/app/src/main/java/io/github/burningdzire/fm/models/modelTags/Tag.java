package io.github.burningdzire.fm.models.modelTags;

import com.google.gson.annotations.SerializedName;

public class Tag {
    @SerializedName("name")
    private String name;
    @SerializedName("count")
    private int count;
    @SerializedName("reach")
    private int reach;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getReach() {
        return this.reach;
    }

    public void setReach(int reach) {
        this.reach = reach;
    }
}
