package com.example.architecturebatternvmpc.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviderKt;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.architecturebatternvmpc.R;
import com.example.architecturebatternvmpc.databinding.ActivityMainBinding;
import com.example.architecturebatternvmpc.pojo.DataBase;

public class MainActivity extends AppCompatActivity implements NumberView{
    ActivityMainBinding binding;
    private NumberPresenter Presenter;
    DataBase dataBase = new DataBase();
    MainViweModel mainViweModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         binding = DataBindingUtil.setContentView(this,R.layout.activity_main);


        // plus on click mvc
        binding.plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {binding.plusTv.setText(String.valueOf(getNumberFromeDataBase().getNumbers().plus()));}});

        //Div on click mvp
        Presenter = new NumberPresenter(this);
        binding.divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Presenter.getDivNumbers(dataBase.getNumbers().getFirstNum(),dataBase.getNumbers().getSecondNum());
            }});
        //MVVM
        mainViweModel = ViewModelProviders.of(this).get(MainViweModel.class);
        binding.setViweModel(mainViweModel);
        binding.setData(getNumberFromeDataBase().getNumbers());
        binding.setLifecycleOwner(this);

    }
    //mvc
    public DataBase getNumberFromeDataBase(){
        return new DataBase();
    }


    //mvp
    @Override
    public void getDivNumbers(int result) {
        binding.divTv.setText(new StringBuilder().append(result));
    }
}