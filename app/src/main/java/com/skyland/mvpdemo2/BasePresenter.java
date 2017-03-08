package com.skyland.mvpdemo2;

/**
 * Created by skyland on 2017/3/8.
 */

public interface BasePresenter {

    //    作用:presenter开始获取数据并调用view中方法改变界面显示，其调用时机是在Fragment类的onResume方法中
    void start();

}
