package com.itlize.codinghomework1.entity;

import java.util.List;

public class Prison {
    private Integer size;
    private List<List<Integer>> cells;

    public Prison() {
    }

    public Prison(Integer size, List<List<Integer>> cells) {
        this.size = size;
        this.cells = cells;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public List<List<Integer>> getCells() {
        return cells;
    }

    public void setCells(List<List<Integer>> cells) {
        this.cells = cells;
    }
}
