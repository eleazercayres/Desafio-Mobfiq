
package com.example.eleazer.desafiomobfiq.modelos;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Category implements Serializable {

    @SerializedName("Id")
    private Integer id;
    @SerializedName("Name")
    private String name;
    @SerializedName("Image")
    private Object image;
    @SerializedName("Redirect")
    private Redirect redirect;
    @SerializedName("SubCategories")
    private List<SubCategory> subCategories = null;

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

    public Redirect getRedirect() {
        return redirect;
    }

    public void setRedirect(Redirect redirect) {
        this.redirect = redirect;
    }

    public List<SubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }

}