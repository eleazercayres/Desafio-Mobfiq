
package com.example.eleazer.desafiomobfiq.modelos;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SearchCriteria_ implements Serializable {

    @SerializedName("Query")
    private Object query;
    @SerializedName("OrderBy")
    private Integer orderBy;
    @SerializedName("Size")
    private Integer size;
    @SerializedName("Offset")
    private Object offset;
    @SerializedName("Filter")
    private Object filter;
    @SerializedName("ApiQuery")
    private String apiQuery;
    @SerializedName("ProductId")
    private Object productId;
    @SerializedName("Hotsite")
    private Object hotsite;
    @SerializedName("RealProductId")
    private Object realProductId;
    @SerializedName("EAN")
    private Object eAN;
    @SerializedName("RealProductIdGroup")
    private Object realProductIdGroup;
    @SerializedName("FacetItems")
    private Object facetItems;
    @SerializedName("SearchApi")
    private Object searchApi;

    public Object getQuery() {
        return query;
    }

    public void setQuery(Object query) {
        this.query = query;
    }

    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Object getOffset() {
        return offset;
    }

    public void setOffset(Object offset) {
        this.offset = offset;
    }

    public Object getFilter() {
        return filter;
    }

    public void setFilter(Object filter) {
        this.filter = filter;
    }

    public String getApiQuery() {
        return apiQuery;
    }

    public void setApiQuery(String apiQuery) {
        this.apiQuery = apiQuery;
    }

    public Object getProductId() {
        return productId;
    }

    public void setProductId(Object productId) {
        this.productId = productId;
    }

    public Object getHotsite() {
        return hotsite;
    }

    public void setHotsite(Object hotsite) {
        this.hotsite = hotsite;
    }

    public Object getRealProductId() {
        return realProductId;
    }

    public void setRealProductId(Object realProductId) {
        this.realProductId = realProductId;
    }

    public Object getEAN() {
        return eAN;
    }

    public void setEAN(Object eAN) {
        this.eAN = eAN;
    }

    public Object getRealProductIdGroup() {
        return realProductIdGroup;
    }

    public void setRealProductIdGroup(Object realProductIdGroup) {
        this.realProductIdGroup = realProductIdGroup;
    }

    public Object getFacetItems() {
        return facetItems;
    }

    public void setFacetItems(Object facetItems) {
        this.facetItems = facetItems;
    }

    public Object getSearchApi() {
        return searchApi;
    }

    public void setSearchApi(Object searchApi) {
        this.searchApi = searchApi;
    }

}