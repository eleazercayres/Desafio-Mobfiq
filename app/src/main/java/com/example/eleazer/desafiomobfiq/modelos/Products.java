/* Copyright 2017 freecodeformat.com */
package com.example.eleazer.desafiomobfiq.modelos;
import com.google.gson.annotations.SerializedName;

import java.util.List;
/* Time: 2017-06-16 18:31:8 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class Products {

    @SerializedName("Availability")
    private boolean availability;
    @SerializedName("Skus")
    private List<Skus> skus;
    @SerializedName("Name")
    private String name;
    @SerializedName("Id")
    private String id;
    @SerializedName("Brand")
    private String brand;
    @SerializedName("Description")
    private String description;
    @SerializedName("Category")
    private String category;
    @SerializedName("Categories")
    private List<String> categories;
    @SerializedName("Specifications")
    private Specifications specifications;
    @SerializedName("Variations")
    private List<String> variations;
    @SerializedName("Videos")
    private List<String> videos;
    @SerializedName("Images")
    private String images;
    @SerializedName("RealId")
    private String realid;
    public void setAvailability(boolean availability) {
         this.availability = availability;
     }
     public boolean getAvailability() {
         return availability;
     }

    public void setSkus(List<Skus> skus) {
         this.skus = skus;
     }
     public List<Skus> getSkus() {
         return skus;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setId(String id) {
         this.id = id;
     }
     public String getId() {
         return id;
     }

    public void setBrand(String brand) {
         this.brand = brand;
     }
     public String getBrand() {
         return brand;
     }

    public void setDescription(String description) {
         this.description = description;
     }
     public String getDescription() {
         return description;
     }

    public void setCategory(String category) {
         this.category = category;
     }
     public String getCategory() {
         return category;
     }

    public void setCategories(List<String> categories) {
         this.categories = categories;
     }
     public List<String> getCategories() {
         return categories;
     }

    public void setSpecifications(Specifications specifications) {
         this.specifications = specifications;
     }
     public Specifications getSpecifications() {
         return specifications;
     }

    public void setVariations(List<String> variations) {
         this.variations = variations;
     }
     public List<String> getVariations() {
         return variations;
     }

    public void setVideos(List<String> videos) {
         this.videos = videos;
     }
     public List<String> getVideos() {
         return videos;
     }

    public void setImages(String images) {
         this.images = images;
     }
     public String getImages() {
         return images;
     }

    public void setRealid(String realid) {
         this.realid = realid;
     }
     public String getRealid() {
         return realid;
     }

}