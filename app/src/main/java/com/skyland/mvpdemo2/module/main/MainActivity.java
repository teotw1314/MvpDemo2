package com.skyland.mvpdemo2.module.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.skyland.mvpdemo2.R;
import com.skyland.mvpdemo2.base.BaseActivity;

/**
 * Created by skyland on 2017/3/8.
 */

public class MainActivity extends BaseActivity implements MainContract.View{

    private MainContract.Presenter mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainPresenter(this);

        mPresenter.initData();
    }


    @Override
    public void showLoading() {

    }

    @Override
    public void showToast(String text) {
        Toast.makeText(mContext, text, Toast.LENGTH_SHORT).show();
    }
}
