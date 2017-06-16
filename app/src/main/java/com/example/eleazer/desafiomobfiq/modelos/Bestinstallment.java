/* Copyright 2017 freecodeformat.com */
package com.example.eleazer.desafiomobfiq.modelos;

import com.google.gson.annotations.SerializedName;
/* Time: 2017-06-16 18:31:8 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class Bestinstallment {

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
     public double getTotal() {
         return total;
     }

    public void setRate(int rate) {
         this.rate = rate;
     }
     public int getRate() {
         return rate;
     }

}