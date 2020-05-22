package com.itlize.codinghomework1.entity;

import java.util.List;

public class MenuDetail {
    private String header;
    private List<Item> items;

    public MenuDetail() {
    }

    public MenuDetail(String header) {
        this.header = header;
    }

    public MenuDetail(String header, List<Item> items) {
        this.header = header;
        this.items = items;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
