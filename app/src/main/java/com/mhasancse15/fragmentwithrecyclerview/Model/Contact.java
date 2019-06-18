package com.mhasancse15.fragmentwithrecyclerview.Model;

public class Contact {
    private String Name;
    private String Phone;
    private int image;

    public Contact() {
    }

    public Contact(String name, String phone, int image) {
        Name = name;
        Phone = phone;
        this.image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
