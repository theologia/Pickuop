package com.theologia.pickuop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button mDriver, mCustomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDriver = (Button) findViewById(R.id.driver);
        mCustomer = (Button) findViewById(R.id.customer);
        getSupportActionBar().hide();
        mDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(MainActivity.this, DriverLoginActivity.class);
                startActivity(intent1);
                finish();
                return;
            }
        });

        mCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 =new Intent(MainActivity.this, CustomerLoginActivity.class);
                startActivity(intent2);
                finish();
                return;
            }
        });
    }
}
