/* Copyright 2017 freecodeformat.com */
package com.example.eleazer.desafiomobfiq.modelos;

import com.google.gson.annotations.SerializedName;

import java.util.List;
public class Variations {

    @SerializedName("Voltagem")
    private List<String> voltagem;
    public void setVoltagem(List<String> voltagem) {
         this.voltagem = voltagem;
     }
     public List<String> getVoltagem() {
         return voltagem;
     }

}