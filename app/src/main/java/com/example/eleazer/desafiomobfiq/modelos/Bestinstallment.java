/* Copyright 2017 freecodeformat.com */
package com.example.eleazer.desafiomobfiq.modelos;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Bestinstallment implements Serializable {

    @SerializedName("Count")
    private int count;
    @SerializedName("Value")
    private double value;
    @SerializedName("Total")
    private double total;
    @SerializedName("Rate")
    private int rate;
    public void setCount(int count) {
         this.count = count;
     }
     public int getCount() {
         return count;
     }

    public void setValue(double value) {
         this.value = value;
     }
     public double getValue() {
         return value;
     }

    public void setTotal(double total) {
         this.total = total;
     }
     public Double getTotal() {
         return total;
     }

    public void setRate(int rate) {
         this.rate = rate;
     }
     public int getRate() {
         return rate;
     }

}