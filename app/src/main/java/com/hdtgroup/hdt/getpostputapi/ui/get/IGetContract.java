package com.hdtgroup.hdt.getpostputapi.ui.get;

import com.hdtgroup.hdt.getpostputapi.entities.Customer;

import java.util.List;

public interface IGetContract {
    interface IGetPresenter {
        void requestDataFromServer(int skip);
    }

    interface IGetView {
        void showDataGetSuccess(List<Customer> customers);

        void showGetFailure();
    }
}
