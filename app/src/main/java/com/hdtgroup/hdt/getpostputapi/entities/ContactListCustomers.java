package com.hdtgroup.hdt.getpostputapi.entities;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ContactListCustomers {
    @SerializedName("success")
    private boolean success;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private List<Customer> customers;

    public List<Customer> getCustomers() {
        return customers;
    }
}
