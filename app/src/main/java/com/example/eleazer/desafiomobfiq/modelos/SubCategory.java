
package com.example.eleazer.desafiomobfiq.modelos;

import java.util.HashMap;
import java.util.Map;

public class SubCategory {

    private Integer id;
    private String name;
    private Object image;
    private Redirect_ redirect;
    private Object subCategories;
    private Boolean highlight;
    private Object icon;
    private Integer categoryListOrder;
    private Integer categoryTreeOrder;
    private Integer linkId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}