package io.github.burningdzire.fm.models.modelTags;

import com.google.gson.annotations.SerializedName;

public class Attr {

    @SerializedName("offset")
    private int offset;
    @SerializedName("num_res")
    private int num_res;
    @SerializedName("total")
    private int total;

    public int getOffset() {
        return this.offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getNumRes() {
        return this.num_res;
    }

    public void setNumRes(int num_res) {
        this.num_res = num_res;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
