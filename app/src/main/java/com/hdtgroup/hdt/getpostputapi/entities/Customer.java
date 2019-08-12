package com.hdtgroup.hdt.getpostputapi.entities;

import com.google.gson.annotations.SerializedName;

public class Customer {
    @SerializedName("name")
    private String name;
    @SerializedName("gender")
    private String gender;
    @SerializedName("email")
    private String email;
    @SerializedName("phone")
    private String phone;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
