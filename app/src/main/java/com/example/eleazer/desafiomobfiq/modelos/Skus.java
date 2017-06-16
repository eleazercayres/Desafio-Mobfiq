/* Copyright 2017 freecodeformat.com */
package com.example.eleazer.desafiomobfiq.modelos;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;
public class Skus implements Serializable {

    @SerializedName("Id")
    private String id;
    @SerializedName("Name")
    private String name;
    @SerializedName("Order")
    private String order;
    @SerializedName("Sellers")
    private List<Sellers> sellers;
    @SerializedName("Images")
    private List<Images> images;
    @SerializedName("Variations")
    private Variations variations;
    @SerializedName("SkuName")
    private String skuname;
    @SerializedName("UnitMultiplier")
    private int unitmultiplier;
    @SerializedName("ComplementName")
    private String complementname;
    @SerializedName("MeasurementUnit")
    private String measurementunit;
    @SerializedName("ReferenceId")
    private List<Referenceid> referenceid;
    @SerializedName("EAN")
    private String ean;
    public void setId(String id) {
         this.id = id;
     }
     public String getId() {
         return id;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setOrder(String order) {
         this.order = order;
     }
     public String getOrder() {
         return order;
     }

    public void setSellers(List<Sellers> sellers) {
         this.sellers = sellers;
     }
     public List<Sellers> getSellers() {
         return sellers;
     }

    public void setImages(List<Images> images) {
         this.images = images;
     }
     public List<Images> getImages() {
         return images;
     }

    public void setVariations(Variations variations) {
         this.variations = variations;
     }
     public Variations getVariations() {
         return variations;
     }

    public void setSkuname(String skuname) {
         this.skuname = skuname;
     }
     public String getSkuname() {
         return skuname;
     }

    public void setUnitmultiplier(int unitmultiplier) {
         this.unitmultiplier = unitmultiplier;
     }
     public int getUnitmultiplier() {
         return unitmultiplier;
     }

    public void setComplementname(String complementname) {
         this.complementname = complementname;
     }
     public String getComplementname() {
         return complementname;
     }

    public void setMeasurementunit(String measurementunit) {
         this.measurementunit = measurementunit;
     }
     public String getMeasurementunit() {
         return measurementunit;
     }

    public void setReferenceid(List<Referenceid> referenceid) {
         this.referenceid = referenceid;
     }
     public List<Referenceid> getReferenceid() {
         return referenceid;
     }

    public void setEan(String ean) {
         this.ean = ean;
     }
     public String getEan() {
         return ean;
     }

}