
package com.example.eleazer.desafiomobfiq.modelos;

import java.util.HashMap;
import java.util.Map;

public class Redirect_ {

    private Integer id;
    private SearchCriteria_ searchCriteria;
    private String title;
    private Integer type;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}