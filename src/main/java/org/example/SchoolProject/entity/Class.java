package org.example.SchoolProject.entity;

public class Class {
    String year1;
    String year2;

    @Override
    public String toString() {
        return "Class{" +
                "year1='" + year1 + '\'' +
                ", year2='" + year2 + '\'' +
                ", year3='" + year3 + '\'' +
                ", year4='" + year4 + '\'' +
                '}';
    }

    public String getYear1() {
        return year1;
    }

    public void setYear1(String year1) {
        this.year1 = year1;
    }

    public String getYear2() {
        return year2;
    }

    public void setYear2(String year2) {
        this.year2 = year2;
    }

    public String getYear3() {
        return year3;
    }

    public void setYear3(String year3) {
        this.year3 = year3;
    }

    public String getYear4() {
        return year4;
    }

    public void setYear4(String year4) {
        this.year4 = year4;
    }

    public Class(String year1, String year2, String year3, String year4) {
        this.year1 = year1;
        this.year2 = year2;
        this.year3 = year3;
        this.year4 = year4;
    }

    String year3;
    String year4;
}
