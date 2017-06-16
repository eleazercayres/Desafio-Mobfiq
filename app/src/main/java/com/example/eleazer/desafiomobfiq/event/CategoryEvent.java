package com.example.eleazer.desafiomobfiq.event;


import com.example.eleazer.desafiomobfiq.modelos.Categories;

public class CategoryEvent {

    public Categories category;

    public CategoryEvent(Categories category) {
        this.category = category;
    }

    public CategoryEvent() {

    }
}
