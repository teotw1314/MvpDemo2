package com.skyland.mvpdemo2.module.main;

/**
 * Created by skyland on 2017/3/8.
 */

public class MainPresenter implements MainContract.Presenter {


    private MainContract.View mView;

    public MainPresenter(MainContract.View view ){
        this.mView = view;
    }

    @Override
    public void start() {

    }

    @Override
    public void initData() {
        mView.showToast("hello");
    }
}
