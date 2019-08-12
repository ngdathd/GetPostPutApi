package com.hdtgroup.hdt.getpostputapi.ui.get;

import androidx.annotation.NonNull;

import com.hdtgroup.hdt.getpostputapi.entities.ContactListCustomers;
import com.hdtgroup.hdt.getpostputapi.network.RetrofitInstance;
import com.hdtgroup.hdt.getpostputapi.network.RetrofitService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetPresenter implements IGetContract.IGetPresenter {
    private IGetContract.IGetView mIGetView;

    public GetPresenter(IGetContract.IGetView iGetView) {
        this.mIGetView = iGetView;
    }

    @Override
    public void requestDataFromServer(int skip) {
        RetrofitService retrofitService = RetrofitInstance.getRetrofitInstance().create(RetrofitService.class);
        Call<ContactListCustomers> call = retrofitService.getAllCustomers(skip);
        call.enqueue(new Callback<ContactListCustomers>() {
            @Override
            public void onResponse(@NonNull Call<ContactListCustomers> call, @NonNull Response<ContactListCustomers> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        mIGetView.showDataGetSuccess(response.body().getCustomers());
                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<ContactListCustomers> call, @NonNull Throwable t) {
                mIGetView.showGetFailure();
            }
        });
    }
}
