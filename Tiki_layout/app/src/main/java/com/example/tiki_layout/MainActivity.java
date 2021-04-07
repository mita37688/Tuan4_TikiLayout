package com.example.tiki_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SendingData{

    TextView tvThanhTien;
    TextView tvTamTinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvThanhTien = findViewById(R.id.tvThanhTien);
        tvTamTinh = findViewById(R.id.tvTamTinh);
    }

    @Override
    public void sendData(String data) {
        tvThanhTien.setText(data);
        tvTamTinh.setText(data);
    }
}