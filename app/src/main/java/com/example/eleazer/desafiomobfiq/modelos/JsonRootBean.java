/* Copyright 2017 freecodeformat.com */
package com.example.eleazer.desafiomobfiq.modelos;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;
public class JsonRootBean implements Serializable {

    @SerializedName("Size")
    private int size;
    @SerializedName("Offset")
    private int offset;
    @SerializedName("Total")
    private int total;
    @SerializedName("Delay")
    private double delay;
    @SerializedName("Products")
    private List<Products> products;
    @SerializedName("ApiQuery")
    private String apiquery;
    public void setSize(int size) {
         this.size = size;
     }
     public int getSize() {
         return size;
     }

    public void setOffset(int offset) {
         this.offset = offset;
     }
     public int getOffset() {
         return offset;
     }

    public void setTotal(int total) {
         this.total = total;
     }
     public int getTotal() {
         return total;
     }

    public void setDelay(double delay) {
         this.delay = delay;
     }
     public double getDelay() {
         return delay;
     }

    public void setProducts(List<Products> products) {
         this.products = products;
     }
     public List<Products> getProducts() {
         return products;
     }

    public void setApiquery(String apiquery) {
         this.apiquery = apiquery;
     }
     public String getApiquery() {
         return apiquery;
     }

}