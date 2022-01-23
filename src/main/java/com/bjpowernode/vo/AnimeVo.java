package com.bjpowernode.vo;

public class AnimeVo {

    private String aname;
    private String tname;

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "AnimeVo{" +
                "aname='" + aname + '\'' +
                ", tname='" + tname + '\'' +
                '}';
    }
}
