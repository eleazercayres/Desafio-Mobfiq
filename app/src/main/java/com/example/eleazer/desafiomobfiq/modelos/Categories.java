package com.example.eleazer.desafiomobfiq.modelos;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by eleazer on 15/06/2017.
 */

public class Categories implements Serializable {

    @SerializedName("Id")
    private Long id;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    private List<Category> categories;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
