package com.example.lenovo.class2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
         {
    @Override
    protected void onCreate(Bundle savedInstanceState) { // oncreate is first func. called when app is create
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//set content from file layout.mainactivity


        Button button = (Button) findViewById(R.id.Button1);
        button.setOnClickListener(this);//this is activity handling click of button
        // or
        Button button2 = (Button) findViewById(R.id.Button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            //here by new keyword anonymus class is formed that implement onClickListenerInterface
            public void onClick(View v) { //it will only be called when button is clicked even if it is in onCreatefuction
                //here this means anonymus class object not main Activity class object
                // Toast t=Toast.makeText(this,"button clicked",Toast.Length_SHORT); shows error as this class is not a subclass of context class but our main activity is subclass of context class and it only take context or its subclass object
                Toast t = Toast.makeText(MainActivity.this, "button clicked", Toast.LENGTH_LONG);
                t.show();
            }

        });

    }


    boolean flag=true;
    public void Button1clicked(View v) {
        if (flag = true) {
            flag = false;
            TextView v1 = (TextView) findViewById(R.id.text2);
            v1.setText("button 1 disabled");
        } else {
            flag=true;
            TextView v1 = (TextView) findViewById(R.id.text2);
            v1.setText("button 1 enabled");
        }
    }
    public void Button2clicked(View v){
        if(flag==true){
            makeText(this,"Button1 is enabled", Toast.LENGTH_SHORT);
        }else{
            makeText(this,"Button1 is disabled",Toast.LENGTH_SHORT);
        }
    }

    @Override
    public void onClick(View v) {

    }
}



