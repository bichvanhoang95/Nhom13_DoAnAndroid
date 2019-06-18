package com.example.dack_renthouse;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MessageActivity extends AppCompatActivity {
    ImageButton ibtnHome;
    ImageButton ibtnMyRoom;
    ImageButton ibtnPay;
    ImageButton ibtnMessage;
    ImageButton ibtnAccount;
    ImageButton ibtnMessageSend;
    ListView lvMessage;
    EditText edtMessage;

    ArrayList<String> ListMessage=new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_message);
        ListMessage.add("Xin chào");
        ListMessage.add("Bạn khỏe không?");

        ibtnHome = (ImageButton) findViewById(R.id.ibtnHome);
        ibtnMyRoom = (ImageButton) findViewById(R.id.ibtnMyRoom);
        ibtnPay = (ImageButton) findViewById(R.id.ibtnPay);
        ibtnMessage = (ImageButton) findViewById(R.id.ibtnMessage);
        ibtnAccount = (ImageButton) findViewById(R.id.ibtnAccount);
        edtMessage = (EditText) findViewById(R.id.edtMessage);
        ibtnMessage.setColorFilter(Color.parseColor("#C97C18"));

        ibtnMessageSend = (ImageButton) findViewById(R.id.ibtnMessageSend);
        ibtnMessageSend.setColorFilter(Color.parseColor("#FF1654"));

        lvMessage = (ListView) findViewById(R.id.lvMessage);
        final ArrayAdapter<String> ListMessageAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ListMessage);
        lvMessage.setAdapter(ListMessageAdapter);

        ibtnMessageSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListMessage.add(edtMessage.getText().toString());
                edtMessage.setText("");
                ListMessageAdapter.notifyDataSetChanged();
            }
        });


        ibtnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DashboardActivity = new Intent( MessageActivity.this, DashboardActivity.class);
                startActivity(DashboardActivity);
            }
        });

        ibtnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ibtnMyRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MyRoomActivity  = new Intent( MessageActivity.this, MyRoomActivity.class);
                startActivity(MyRoomActivity);
            }
        });

        ibtnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
