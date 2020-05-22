package com.itlize.codinghomework1.entity;

public class Menu {
    private MenuDetail menuDetail;

    public Menu() {
    }

    public Menu(MenuDetail menuDetail) {
        this.menuDetail = menuDetail;
    }

    public MenuDetail getMenuDetail() {
        return menuDetail;
    }

    public void setMenuDetail(MenuDetail menuDetail) {
        this.menuDetail = menuDetail;
    }
}
