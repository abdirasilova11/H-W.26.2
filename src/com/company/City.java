package com.company;

import javax.management.loading.MLetContent;

public class City implements Comparable<City> {
    private  int code;
    private String name;

    public City(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public  String toString(){
        return " code: " + code +
                " name: " + name;
    }

    @Override
    public int compareTo(City o) {
        if (this.getCode() == o.getCode()){
            return 0;
        } else if (this.getCode() < o.getCode()){
            return -1;
        } else {
            return 1;
        }
    }
}
