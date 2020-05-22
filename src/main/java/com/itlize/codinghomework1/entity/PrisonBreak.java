package com.itlize.codinghomework1.entity;

import java.util.List;

public class PrisonBreak {
    private Integer number;
    private List<Prison> cases;

    public PrisonBreak() {
    }

    public PrisonBreak(Integer number, List<Prison> cases) {
        this.number = number;
        this.cases = cases;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public List<Prison> getCases() {
        return cases;
    }

    public void setCases(List<Prison> cases) {
        this.cases = cases;
    }
}
