
package com.example.eleazer.desafiomobfiq.modelos;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Redirect_ implements Serializable {

    @SerializedName("Id")
    private Integer id;
    @SerializedName("SearchCriteria")
    private SearchCriteria_ searchCriteria;
    @SerializedName("Title")
    private String title;
    @SerializedName("Type")
    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SearchCriteria_ getSearchCriteria() {
        return searchCriteria;
    }

    public void setSearchCriteria(SearchCriteria_ searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}