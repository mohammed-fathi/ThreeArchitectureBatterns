package com.example.architecturebatternvmpc.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViweModel extends ViewModel {

    public MutableLiveData<Integer> numMutableLiveData = new MutableLiveData<>();

    public void setMulNumber(int firstNum , int socendNum){
        numMutableLiveData.setValue(getMulNumber(firstNum,socendNum));
    }

    private int getMulNumber(int firstNum , int socendNum){
        return firstNum*socendNum;
    }
}
