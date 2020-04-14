package com.example.sightseeen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import java.lang.annotation.Annotation;

public class sightseen extends AppCompatActivity {
    private Button but1;
    private Button but2;
    private Button but3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sightseen);
        but1=(Button)findViewById(R.id.f1_frag);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });

        but2=(Button)findViewById(R.id.button5);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        but3=(Button)findViewById(R.id.f2_frag);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
    }
    public void openActivity1(){
        Intent intent1 = new Intent(this,Sight_Seen_Basic_Rule.class);
        startActivity(intent1);

    }
    public void openActivity2(){
        Intent intent2 = new Intent(this,Sight_Seen_Basic_Rule.class);
        startActivity(intent2);
    }

    public void openActivity3(){
        Intent intent3 = new Intent(this,Sight_Seen_Details_Page.class);
        startActivity(intent3);
    }



    public void tapToBounce(View view) {
        Button button1 = (Button) findViewById(R.id.f1_frag);
        Annotation animation1 = (Annotation) AnimationUtils.loadAnimation(this,R.anim.bounce);
        button1.setAnimation((Animation) animation1);
    }
}
