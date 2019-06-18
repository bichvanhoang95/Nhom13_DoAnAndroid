package com.example.dack_renthouse;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MyRoomActivity extends AppCompatActivity {
    ImageButton ibtnHome;
    ImageButton ibtnMyRoom;
    ImageButton ibtnPay;
    ImageButton ibtnMessage;
    ImageButton ibtnAccount;

    ImageButton ibtnRoomInfor;
    ImageButton ibtnContract;
    ImageButton ibtnBill;
    ImageButton ibtnStatistical;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_myroom);

        ibtnHome = (ImageButton) findViewById(R.id.ibtnHome);
        ibtnMyRoom = (ImageButton) findViewById(R.id.ibtnMyRoom);
        ibtnPay = (ImageButton) findViewById(R.id.ibtnPay);
        ibtnMessage = (ImageButton) findViewById(R.id.ibtnMessage);
        ibtnAccount = (ImageButton) findViewById(R.id.ibtnAccount);
        ibtnMyRoom.setColorFilter(Color.parseColor("#C97C18"));

        ibtnRoomInfor = (ImageButton) findViewById(R.id.ibtnRoomInfor);
        ibtnContract = (ImageButton) findViewById(R.id.ibtnContract);
        ibtnBill = (ImageButton) findViewById(R.id.ibtnBill);
        ibtnStatistical = (ImageButton) findViewById(R.id.ibtnStatistical);

        ibtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent DashboardActivity = new Intent( MyRoomActivity.this, DashboardActivity.class);
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
                Intent MessageActivity = new Intent( MyRoomActivity.this, MessageActivity.class);
                startActivity(MessageActivity);
            }
        });

        ibtnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ibtnRoomInfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RoomInforActivity = new Intent( MyRoomActivity.this, RoomInforActivity.class);
                startActivity(RoomInforActivity);
            }
        });

        ibtnContract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ContractActivity = new Intent( MyRoomActivity.this, ContractActivity.class);
                startActivity(ContractActivity);
            }
        });

        ibtnBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ibtnStatistical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
