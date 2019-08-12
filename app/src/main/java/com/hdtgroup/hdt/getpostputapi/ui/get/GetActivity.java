package com.hdtgroup.hdt.getpostputapi.ui.get;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hdtgroup.hdt.getpostputapi.R;
import com.hdtgroup.hdt.getpostputapi.adapters.CustomerAdapter;
import com.hdtgroup.hdt.getpostputapi.entities.Customer;

import java.util.List;

public class GetActivity extends AppCompatActivity implements IGetContract.IGetView {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get);

        IGetContract.IGetPresenter iGetPresenter = new GetPresenter(this);
        iGetPresenter.requestDataFromServer(1);

        recyclerView = findViewById(R.id.rv_customers);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }

    @Override
    public void showDataGetSuccess(List<Customer> customers) {
        CustomerAdapter customerAdapter = new CustomerAdapter();
        customerAdapter.setCustomers(customers);
        recyclerView.setAdapter(customerAdapter);
    }

    @Override
    public void showGetFailure() {

    }
}
