/* Copyright 2017 freecodeformat.com */
package com.example.eleazer.desafiomobfiq.modelos;

import com.google.gson.annotations.SerializedName;

/* Time: 2017-06-16 18:31:8 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class Images {

    @SerializedName("ImageUrl")
    private String imageurl;
    @SerializedName("ImageTag")
    private String imagetag;
    @SerializedName("Label")
    private String label;
    public void setImageurl(String imageurl) {
         this.imageurl = imageurl;
     }
     public String getImageurl() {
         return imageurl;
     }

    public void setImagetag(String imagetag) {
         this.imagetag = imagetag;
     }
     public String getImagetag() {
         return imagetag;
     }

    public void setLabel(String label) {
         this.label = label;
     }
     public String getLabel() {
         return label;
     }

}