package io.github.burningdzire.fm.models.modelAlbums;

import com.google.gson.annotations.SerializedName;

public class ModelAlbum_Attr2 {

    @SerializedName("tag")
    private String tag;

    public String getTag() { return this.tag; }

    public void setTag(String tag) { this.tag = tag; }

    @SerializedName("page")
    private String page;

    public String getPage() { return this.page; }

    public void setPage(String page) { this.page = page; }

    @SerializedName("perPage")
    private String perPage;

    public String getPerPage() { return this.perPage; }

    public void setPerPage(String perPage) { this.perPage = perPage; }

    @SerializedName("totalPages")
    private String totalPages;

    public String getTotalPages() { return this.totalPages; }

    public void setTotalPages(String totalPages) { this.totalPages = totalPages; }

    @SerializedName("total")
    private String total;

    public String getTotal() { return this.total; }

    public void setTotal(String total) { this.total = total; }
}
