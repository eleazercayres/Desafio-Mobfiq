
package com.example.eleazer.desafiomobfiq.modelos;

import java.util.HashMap;
import java.util.Map;

public class SearchCriteria_ {

    private Object query;
    private Integer orderBy;
    private Integer size;
    private Object offset;
    private Object filter;
    private String apiQuery;
    private Object productId;
    private Object hotsite;
    private Object realProductId;
    private Object eAN;
    private Object realProductIdGroup;
    private Object facetItems;
    private Object searchApi;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}