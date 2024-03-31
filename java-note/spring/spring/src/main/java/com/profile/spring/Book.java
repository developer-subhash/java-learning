package com.profile.spring;

import org.springframework.stereotype.Component;

public class Book {
    private int pages;

    public Book() {
    }

    public int getPages() {
        return pages;
    }

    public Book(int pages, String name) {
        this.pages = pages;
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
