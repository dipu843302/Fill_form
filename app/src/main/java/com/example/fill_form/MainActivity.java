package com.example.fill_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText organisation1;
private EditText cusmerid1;
private EditText mobileid1;
private EditText emailidetv1;
private EditText manufactorid1;
private EditText addressid1;
private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        organisation1=findViewById(R.id.organisation);
        mobileid1=findViewById(R.id.mobileid);
        cusmerid1=findViewById(R.id.cusmerid);
        emailidetv1=findViewById(R.id.emailidetv);
        manufactorid1=findViewById(R.id.manufactorid);
        addressid1=findViewById(R.id.addressid);
        button1=findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=organisation1.getText().toString();
                String cust=cusmerid1.getText().toString();
                String mob=mobileid1.getText().toString();
                String emai=emailidetv1.getText().toString();
                String manu=manufactorid1.getText().toString();
                String add=addressid1.getText().toString();
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("data",data);
                intent.putExtra("cust",cust);
                intent.putExtra("mob",mob);
                intent.putExtra("emai",emai);
                intent.putExtra("manu",manu);
                intent.putExtra("add",add);

                startActivity(intent);
            }
        });
    }
}