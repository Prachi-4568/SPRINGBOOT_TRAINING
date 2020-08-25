package com.example.demo.model;

public class Scholar {
    private String iNumber;
    private String name;
    private String batch;
    private Integer joining;
    private Integer duration;

    public void setJoining(Integer joining) {
        this.joining = joining;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getJoining() {
        return joining;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getiNumber() {
        return iNumber;
    }

    public String getName() {
        return name;
    }

    public String getBatch() {
        return batch;
    }

    public void setiNumber(String iNumber) {
        this.iNumber = iNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
}
