/* Copyright 2017 freecodeformat.com */
package com.example.eleazer.desafiomobfiq.modelos;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Referenceid implements Serializable {

    @SerializedName("Key")
    private String key;
    @SerializedName("Value")
    private String value;
    public void setKey(String key) {
         this.key = key;
     }
     public String getKey() {
         return key;
     }

    public void setValue(String value) {
         this.value = value;
     }
     public String getValue() {
         return value;
     }

}