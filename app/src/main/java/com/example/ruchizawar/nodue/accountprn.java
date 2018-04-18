package com.example.ruchizawar.nodue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class accountprn extends AppCompatActivity {
       Button button;
    Button searchdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accountprn);

        DatabaseHandler databaseHandler = new DatabaseHandler(this);

        button=(Button) findViewById(R.id.addstudent);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });




        searchdata=(Button) findViewById(R.id.accountsearch);
        searchdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(accountprn.this,searchdata.class);
                startActivity(intent);
            }
        });



    }
    public void openActivity2()
    {
        Intent intent=new Intent(this,FirstpageDB.class);
        startActivity(intent);
    }


}
