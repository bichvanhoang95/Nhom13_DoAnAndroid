package com.example.dack_renthouse;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class AccountActivity extends AppCompatActivity {
    ImageButton ibtnHome;
    ImageButton ibtnMyRoom;
    ImageButton ibtnPay;
    ImageButton ibtnMessage;
    ImageButton ibtnAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account_layout);


        ibtnHome = (ImageButton) findViewById(R.id.ibtnHome);
        ibtnMyRoom = (ImageButton) findViewById(R.id.ibtnMyRoom);
        ibtnPay = (ImageButton) findViewById(R.id.ibtnPay);
        ibtnMessage = (ImageButton) findViewById(R.id.ibtnMessage);
        ibtnAccount = (ImageButton) findViewById(R.id.ibtnAccount);
        ibtnAccount.setColorFilter(Color.parseColor("#C97C18"));

        ibtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DashboardActivity = new Intent( AccountActivity.this, DashboardActivity.class);
                startActivity(DashboardActivity);
            }
        });

        ibtnMyRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MyRoomActivity = new Intent(AccountActivity.this, MyRoomActivity.class);
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
                Intent MessageActivity = new Intent(AccountActivity.this, MessageActivity.class);
                startActivity(MessageActivity);
            }
        });






    }
}
