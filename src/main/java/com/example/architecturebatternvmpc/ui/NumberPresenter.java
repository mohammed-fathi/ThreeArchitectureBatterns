package com.example.architecturebatternvmpc.ui;

import com.example.architecturebatternvmpc.pojo.DataBase;

public class NumberPresenter {
   private NumberView view;

    public NumberPresenter(NumberView view) {
        this.view = view;
    }

    public void getDivNumbers(int firstNum , int socendNum){
        view.getDivNumbers(firstNum/socendNum);
    }
}
