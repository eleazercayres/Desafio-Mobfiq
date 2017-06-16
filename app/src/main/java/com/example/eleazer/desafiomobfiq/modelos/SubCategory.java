
package com.example.eleazer.desafiomobfiq.modelos;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SubCategory implements Serializable {

    @SerializedName("Id")
    private Integer id;
    @SerializedName("Name")
    private String name;
    @SerializedName("Image")
    private Object image;
    @SerializedName("Redirect")
    private Redirect_ redirect;
    @SerializedName("SubCategories")
    private Object subCategories;
    @SerializedName("Highlight")
    private Boolean highlight;
    @SerializedName("Icon")
    private Object icon;
    @SerializedName("CategoryListOrder")
    private Integer categoryListOrder;
    @SerializedName("CategoryTreeOrder")
    private Integer categoryTreeOrder;
    @SerializedName("LinkId")
    private Integer linkId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public Redirect_ getRedirect() {
        return redirect;
    }

    public void setRedirect(Redirect_ redirect) {
        this.redirect = redirect;
    }

    public Object getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(Object subCategories) {
        this.subCategories = subCategories;
    }

    public Boolean getHighlight() {
        return highlight;
    }

    public void setHighlight(Boolean highlight) {
        this.highlight = highlight;
    }

    public Object getIcon() {
        return icon;
    }

    public void setIcon(Object icon) {
        this.icon = icon;
    }

    public Integer getCategoryListOrder() {
        return categoryListOrder;
    }

    public void setCategoryListOrder(Integer categoryListOrder) {
        this.categoryListOrder = categoryListOrder;
    }

    public Integer getCategoryTreeOrder() {
        return categoryTreeOrder;
    }

    public void setCategoryTreeOrder(Integer categoryTreeOrder) {
        this.categoryTreeOrder = categoryTreeOrder;
    }

    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

}