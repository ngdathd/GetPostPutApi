package com.hdtgroup.hdt.getpostputapi.entities;

import com.google.gson.annotations.SerializedName;

public class ContactOneCustomer {
    @SerializedName("success")
    private boolean success;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private Customer customer;
}
