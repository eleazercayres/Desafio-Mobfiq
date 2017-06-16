package com.example.eleazer.desafiomobfiq.modelos;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Query implements Serializable {

    @SerializedName("Query")
    private String query;

    @SerializedName("Offset")
    private int offset;

    @SerializedName("Size")
    private int size;

    public Query(String query, int Offset, int size) {
        this.query = query;
        this.offset = Offset;
        this.size = size;
    }

    public void setQuery(String query) {
        this.query = query;
    }
    public String getQuery() {
        return query;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
    public int getOffset() {
        return offset;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }

}
