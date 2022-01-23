package com.bjpowernode.entity;

public class Anime {

    private Integer animeId;
    private String name;
    private String type;
    private String date;

    public Integer getAnimeId() {
        return animeId;
    }

    public void setAnimeId(Integer animeId) {
        this.animeId = animeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "animeId=" + animeId +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
