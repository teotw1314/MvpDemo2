package com.skyland.mvpdemo2.module.main;

import com.skyland.mvpdemo2.BasePresenter;
import com.skyland.mvpdemo2.BaseView;

/**
 * Created by skyland on 2017/3/8.
 */

public interface MainContract {

    interface View extends BaseView<Presenter>{
        void showLoading();
        void showToast(String text);
    }


    interface Presenter extends BasePresenter{
        void initData();
    }

}
