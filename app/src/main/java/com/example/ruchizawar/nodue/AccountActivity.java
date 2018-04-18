package com.example.ruchizawar.nodue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AccountActivity extends AppCompatActivity {
  private Button button;
    EditText u,p;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        button =(Button) findViewById(R.id.search5);

        u=(EditText)findViewById(R.id.username);
        p=(EditText)findViewById(R.id.password);
       button=(Button)findViewById(R.id.search5);



        //login.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View view) {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String un=u.getText().toString();
                String pass=p.getText().toString();
                if (un.equals("admin@gmail.com")&&pass.equals("admin"))
                {
                    openActivity();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"User is not authenticated",Toast.LENGTH_LONG).show();
                }


       // button.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View v) {

             //   openActivity();

            }
        });

        }
    public void openActivity()
    {
        Intent intent=new Intent(this,accountprn.class);
        startActivity(intent);

    }

}
