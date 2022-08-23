package com.example.cw7;

public class Items {
    private String name;
    private String brand;
    private int pic;

    public Items(String name, String brand, int pic) {
        this.name = name;
        this.brand = brand;
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
