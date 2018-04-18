package com.example.ruchizawar.nodue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstpageDB extends AppCompatActivity {
    DatabaseHandler myDb;

    EditText text11, text21, text31, text41, text51, text61, text71;
    Button submit1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage_db);

        myDb = new DatabaseHandler(this);

        text11 = (EditText) findViewById(R.id.text1);
        text21 = (EditText) findViewById(R.id.text2);
        text31 = (EditText) findViewById(R.id.text3);
        text41 = (EditText) findViewById(R.id.text4);
        text51 = (EditText) findViewById(R.id.text5);
        text61 = (EditText) findViewById(R.id.text6);
        text71 = (EditText) findViewById(R.id.text7);
        submit1 = (Button) findViewById(R.id.submit);




       submit1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
            boolean result = myDb.insertdata(text11.getText().toString(),text21.getText().toString(),text31.getText().toString(),text41.getText().toString(),text51.getText().toString(),text61.getText().toString(),text71.getText().toString() );
           if(result)
           {
               Toast.makeText(FirstpageDB.this," Data Inserted ",Toast.LENGTH_SHORT).show();

           }
           else{
               Toast.makeText(FirstpageDB.this," Data Not Inserted ",Toast.LENGTH_SHORT).show();
           }




           }
       });







    }



}
