package com.hdtgroup.hdt.getpostputapi.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hdtgroup.hdt.getpostputapi.R;
import com.hdtgroup.hdt.getpostputapi.entities.Customer;

import java.util.List;

public class CustomerAdapter extends RecyclerView.Adapter {
    private List<Customer> customers;

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_customer, parent, false);
        return new CustomerVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        CustomerVH customerVH = (CustomerVH) holder;
        customerVH.bindView(position);
    }

    @Override
    public int getItemCount() {
        return customers.size();
    }

    private class CustomerVH extends RecyclerView.ViewHolder {
        private TextView name;

        public CustomerVH(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
        }

        private void bindView(int position) {
            name.setText(customers.get(position).getName());
        }
    }
}
