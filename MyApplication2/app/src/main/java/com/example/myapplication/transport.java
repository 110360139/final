package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

// LayoutSwitcher.java
public class transport {

    private AppCompatActivity activity;
    private Button btnSwitchLayout;


    public LayoutSwitcher(AppCompatActivity activity) {
        this.activity = activity;
        initializeViews();
    }

    private void initializeViews() {
        btnSwitchLayout = activity.findViewById(R.id.btn_start);
        // 可以在這裡添加其他初始化邏輯
    }

    public void setButtonClickListener(View.OnClickListener listener) {
        btnSwitchLayout.setOnClickListener(listener);
    }

    public void switchToAnotherLayout() {
        activity.setContentView(R.layout.MainActivity);
    }
}

