package com.example.dack_renthouse;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class DashboardActivity extends AppCompatActivity {
    ImageButton ibtnHome;
    ImageButton ibtnMyRoom;
    ImageButton ibtnPay;
    ImageButton ibtnMessage;
    ImageButton ibtnAccount;

    ImageButton ibtnDBMyRoom;
    ImageButton ibtnDBPay;
    ImageButton ibtnDBMessage;
    ImageButton ibtnDBAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ibtnHome = (ImageButton) findViewById(R.id.ibtnHome);
        ibtnMyRoom = (ImageButton) findViewById(R.id.ibtnMyRoom);
        ibtnPay = (ImageButton) findViewById(R.id.ibtnPay);
        ibtnMessage = (ImageButton) findViewById(R.id.ibtnMessage);
        ibtnAccount = (ImageButton) findViewById(R.id.ibtnAccount);
        ibtnHome.setColorFilter(Color.parseColor("#C97C18"));

        ibtnDBMyRoom = (ImageButton) findViewById(R.id.ibtnDBMyRoom);
        ibtnDBPay = (ImageButton) findViewById(R.id.ibtnDBPay);
        ibtnDBMessage = (ImageButton) findViewById(R.id.ibtnDBMessage);
        ibtnDBAccount = (ImageButton) findViewById(R.id.ibtnDBAccount);

        ibtnMyRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent MyRoomActivity = new Intent( DashboardActivity.this, MyRoomActivity.class);
            startActivity(MyRoomActivity);
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
                Intent MessageActivity = new Intent( DashboardActivity.this, MessageActivity.class);
                startActivity(MessageActivity);
            }
        });

        ibtnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AccountActivity = new Intent(DashboardActivity.this, AccountActivity.class);
                startActivity(AccountActivity);

            }
        });

        ibtnDBMyRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent MyRoomActivity = new Intent( DashboardActivity.this, MyRoomActivity.class);
            startActivity(MyRoomActivity);
            }
        });

        ibtnDBPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ibtnDBMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MessageActivity = new Intent( DashboardActivity.this, MessageActivity.class);
                startActivity(MessageActivity);
            }
        });

        ibtnDBAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AccountActivity = new Intent(DashboardActivity.this, AccountActivity.class);
                startActivity(AccountActivity);
            }
        });
    }
}
