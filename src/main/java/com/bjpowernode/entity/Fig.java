package com.bjpowernode.entity;

public class Fig {

    private Integer figId;
    private String name;
    private String profession;
    private String specialty;
    private String hobby;
    private String position;
    private Integer teamId;

    public Integer getFigId() {
        return figId;
    }

    public void setFigId(Integer figId) {
        this.figId = figId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return "Fig{" +
                "figId=" + figId +
                ", name='" + name + '\'' +
                ", profession='" + profession + '\'' +
                ", specialty='" + specialty + '\'' +
                ", hobby='" + hobby + '\'' +
                ", position='" + position + '\'' +
                ", teamId=" + teamId +
                '}';
    }
}
