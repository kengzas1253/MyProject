package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Meehunbachang extends AppCompatActivity {
    ImageButton meehun1,meehun2,meehun3,meehun4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meehunbachang);
        meehun1 = (ImageButton) findViewById(R.id.imhb1);
        meehun1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Meehun1 = new Intent(Meehunbachang.this,Otaw.class);
                startActivity(Meehun1);
            }
        });
        meehun2 = (ImageButton) findViewById(R.id.imhb3);
        meehun2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Meehun2 = new Intent(Meehunbachang.this,Food.class);
                startActivity(Meehun2);
            }
        });
        meehun3 = (ImageButton) findViewById(R.id.imhb5);
        meehun3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Meehun3 = new Intent(Meehunbachang.this,MeehunbachangMap.class);
                startActivity(Meehun3);
            }
        });
        meehun4 = (ImageButton) findViewById(R.id.imhb2);
        meehun4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Otaw4 = new Intent(Meehunbachang.this,Loba.class);
                startActivity(Otaw4);
            }
        });
    }
}
