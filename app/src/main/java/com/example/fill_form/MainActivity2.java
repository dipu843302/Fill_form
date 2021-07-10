package com.example.fill_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
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
        setContentView(R.layout.activity_main2);
        organisation1=findViewById(R.id.organisation);
        mobileid1=findViewById(R.id.mobileid);
        cusmerid1=findViewById(R.id.cusmerid);
        emailidetv1=findViewById(R.id.emailidetv);
        manufactorid1=findViewById(R.id.manufactorid);
        addressid1=findViewById(R.id.addressid);

        organisation1.setText(getIntent().getStringExtra("data"));
        cusmerid1.setText(getIntent().getStringExtra("cust"));
        mobileid1.setText(getIntent().getStringExtra("mob"));
        emailidetv1.setText(getIntent().getStringExtra("emai"));
        manufactorid1.setText(getIntent().getStringExtra("manu"));
        addressid1.setText(getIntent().getStringExtra("add"));
    }
}