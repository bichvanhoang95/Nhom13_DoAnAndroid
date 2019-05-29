package com.example.dack_renthouse;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;

public class DashboardActivity extends AppCompatActivity {
    GridView gvDashboard;
    ImageButton ibtnHome;
    ImageButton ibtnMyRoom;
    ImageButton ibtnPay;
    ImageButton ibtnMessage;
    ImageButton ibtnAccount;

    Integer[] MyLogo = {R.drawable.dbmyroom, R.drawable.dbpay, R.drawable.dbmessage, R.drawable.dbaccount};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ibtnHome = (ImageButton) findViewById(R.id.ibtnHome);
        ibtnMyRoom = (ImageButton) findViewById(R.id.ibtnMyRoom);
        ibtnPay = (ImageButton) findViewById(R.id.ibtnPay);
        ibtnMessage = (ImageButton) findViewById(R.id.ibtnMessage);
        ibtnAccount = (ImageButton) findViewById(R.id.ibtnAccount);

//        gvDashboard.setAdapter(new MyImageAdapter(this,MyLogo));
//        gvDashboard.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                switch (position)
//                {
//                    case 0:
//                    {
////                        startActivity();
//                        break;
//                    }
//                    case 1:
//                    {
////                        startActivity();
//                        break;
//                    }
//                    case 2:
//                    {
////                        startActivity();
//                        break;
//                    }
//                    case 3:
//                    {
////                        startActivity();
//                        break;
//                    }
//                }
//            }
//        });
    }
}

//class MyImageAdapter extends BaseAdapter {
//    private Context context;
//    private Integer[] MyLogo;
//    public MyImageAdapter(Context context, Integer[] MyLogo)
//    {
//        this.context = context;
//        this.MyLogo = MyLogo;
//    }
//    public int getCount() {
//        return MyLogo.length;
//    }
//    public Object getItem(int position) {
//        return MyLogo[position];
//    }
//    public long getItemId(int position) {
//        return position;
//    }
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ImageView imageView;
//        if (convertView == null) {
//            imageView = new ImageView(context);
//            imageView.setLayoutParams( new GridView.LayoutParams(300, 300) );
//            imageView.setPadding(30, 30, 30, 30);
//        } else {
//            imageView = (ImageView) convertView;
//        }
//        imageView.setImageResource(MyLogo[position]);
//        return imageView;
//    }
//}