package com.yth520web.second;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    TextView tex;
    Button btu1;
    Button btu2;
    Button btu3;
    Button reset;
    int numA=0;
    int numB=0;
    Button team;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tex= findViewById(R.id.textview);
        team=findViewById(R.id.team);
        btu1 = findViewById(R.id.button1);
        btu2 = findViewById(R.id.button2);
        btu3 = findViewById(R.id.button3);
        reset = findViewById(R.id.reset);

        team.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

               String t= (String)team.getText();
                if(t.equals("TEAMA")) {
                    team.setText("TEAMB");
                    String str = "" + (numB + "");
                    tex.setText(str);
                    //Toast.makeText(MainActivity.this,"You click TEAMA",Toast.LENGTH_SHORT).show();
                }
                else{
                    team.setText("TEAMA");
                    String str = "" + (numA + "");
                    tex.setText(str);
                    //Toast.makeText(MainActivity.this,"You click TEAMB",Toast.LENGTH_SHORT).show();
                }
            }
        });


        btu1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String t= (String)team.getText();
                if(t.equals("TEAMA")) {
                    String str = "" + (numA + 1);
                    tex.setText(str);
                    numA= numA + 1;
                }
                else{
                    String str = "" + (numB + 1);
                    tex.setText(str);
                    numB= numB + 1;
                }
            }
        });

        btu2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String t= (String)team.getText();
                if(t.equals("TEAMA")) {
                    String str = "" + (numA+ 2);
                    tex.setText(str);
                    numA = numA + 2;
                }
                else{
                    String str = "" + (numB + 2);
                    tex.setText(str);
                    numB= numB + 2;
                }
            }
        });

        btu3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String t= (String)team.getText();
                if(t.equals("TEAMA")) {
                    String str = "" + (numA + 3);
                    tex.setText(str);
                    numA = numA + 3;
                }
                else{
                    String str = "" + (numB + 3);
                    tex.setText(str);
                    numB= numB + 3;
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                numA=0;
                String str= ""+(numA+0);
                numB=0;
                tex.setText(str);
            }
        });

    }

    @Override
    public void onClick(View v) {

    }
}
