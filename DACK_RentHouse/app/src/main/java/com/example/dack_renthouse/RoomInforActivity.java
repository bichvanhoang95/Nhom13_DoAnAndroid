package com.example.dack_renthouse;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class RoomInforActivity extends AppCompatActivity {
    ImageButton ibtnHome;
    ImageButton ibtnMyRoom;
    ImageButton ibtnPay;
    ImageButton ibtnMessage;
    ImageButton ibtnAccount;

    ListView lvThanhVien;
    ListView lvNoiThat;

    String[] ListThanhVien = {"Lương Xuân Trường","Nguyễn Công Phượng","Bùi Tiến Dũng","Đặng Văn Lâm","Nguyễn Quang Hải","Nguyễn Văn Toàn","Đoàn Văn Hậu"};
    String[] ListNoiThat = {"1 Điều hòa","3 Bóng đèn dài","5 Bóng đèn cài", "1 Máy giặt","1 Tủ lạnh","1 Bếp gas","1 Nồi cơm điệm","2 Quạt"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myroom_roominfor);

        ibtnHome = (ImageButton) findViewById(R.id.ibtnHome);
        ibtnMyRoom = (ImageButton) findViewById(R.id.ibtnMyRoom);
        ibtnPay = (ImageButton) findViewById(R.id.ibtnPay);
        ibtnMessage = (ImageButton) findViewById(R.id.ibtnMessage);
        ibtnAccount = (ImageButton) findViewById(R.id.ibtnAccount);
        ibtnMyRoom.setColorFilter(Color.parseColor("#C97C18"));

        lvThanhVien = (ListView)findViewById(R.id.lvThanhVien);
        lvNoiThat = (ListView)findViewById(R.id.lvNoiThat);
        ArrayAdapter<String> ThanhVienAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ListThanhVien);
        ArrayAdapter<String> NoiThatAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ListNoiThat);
        lvThanhVien.setAdapter(ThanhVienAdapter);
        lvNoiThat.setAdapter(NoiThatAdapter);


        ibtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DashboardActivity = new Intent( RoomInforActivity.this, DashboardActivity.class);
                startActivity(DashboardActivity);
            }
        });

        ibtnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ibtnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MessageActivity = new Intent( RoomInforActivity.this, MessageActivity.class);
                startActivity(MessageActivity);
            }
        });

        ibtnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}