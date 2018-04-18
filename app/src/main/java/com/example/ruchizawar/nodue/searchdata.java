package com.example.ruchizawar.nodue;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class searchdata extends AppCompatActivity {
    EditText searchtext;
    Button search;
    TextView t1,t2,t3,t4,t5,t6;

    DatabaseHandler databaseHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchdata);
           databaseHandler=new DatabaseHandler(this);

        search=(Button) findViewById(R.id.search);

        searchtext=(EditText) findViewById(R.id.prnedittext);
        t1=(TextView) findViewById(R.id.textView2);
        t2=(TextView) findViewById(R.id.textView3);
        t3=(TextView) findViewById(R.id.textView4);
        t4=(TextView) findViewById(R.id.textView5);
        t5=(TextView) findViewById(R.id.textView6);
        t6=(TextView) findViewById(R.id.textView7);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Cursor cursor = databaseHandler.getData(searchtext.getText().toString());

               while (cursor.moveToNext())
               {
                   t1.setText(cursor.getString(1));
                   t2.setText(cursor.getString(2));
                   t3.setText(cursor.getString(3));
                   t4.setText(cursor.getString(4));
                   t5.setText(cursor.getString(5));
                   t6.setText(cursor.getString(6));
               }



            }
        });


    }
}
