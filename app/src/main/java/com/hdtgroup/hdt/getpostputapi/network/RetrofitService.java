package com.hdtgroup.hdt.getpostputapi.network;

import com.hdtgroup.hdt.getpostputapi.entities.ContactListCustomers;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitService {
    @GET("contacts")
    Call<ContactListCustomers> getAllCustomers(@Query("skip") int skip);
}
