package com.example.ruchizawar.nodue;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StudentActivity extends AppCompatActivity {

    EditText searchtext;
    Button searchB;
    TextView t19,t20,t21,t22,t23,t24;

    DatabaseHandler databaseHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        databaseHandler=new DatabaseHandler(this);

        searchB=(Button) findViewById(R.id.search5);

        searchtext=(EditText) findViewById(R.id.prntext);
        t19=(TextView) findViewById(R.id.textView19);
        t20=(TextView) findViewById(R.id.textView20);
        t21=(TextView) findViewById(R.id.textView21);
        t22=(TextView) findViewById(R.id.textView22);
        t23=(TextView) findViewById(R.id.textView23);
        t24=(TextView) findViewById(R.id.textView24);



        searchB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor cursor = databaseHandler.getData(searchtext.getText().toString());

                while (cursor.moveToNext())
                {
                    t19.setText(cursor.getString(1));
                    t20.setText(cursor.getString(2));
                    t21.setText(cursor.getString(3));
                    t22.setText(cursor.getString(4));
                    t23.setText(cursor.getString(5));
                    t24.setText(cursor.getString(6));
                }

                int i=Integer.parseInt((String) t23.getText());
                int j=Integer.parseInt((String) t24.getText());
                CheckBox scheckBox = (CheckBox) findViewById(R.id.checkBox);



                if (i == j) {
                    // System.out.println("Issue Submission card !!!");
                    scheckBox.setChecked(true);
                    Toast.makeText(getApplicationContext(), "Issue Submission card !!!", Toast.LENGTH_LONG).show();

                }
                else
                {
                    // System.out.println("Issue not Submission card !!!");
                    scheckBox.setChecked(false);
                    Toast.makeText(getApplicationContext(), "Issue not Submission card !!!", Toast.LENGTH_LONG).show();
                }




            }
        });


       /* CheckBox scheckBox = (CheckBox) findViewById(R.id.checkBox);
        scheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });*/


    }



    }

