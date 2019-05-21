package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Anggu extends AppCompatActivity {
    ImageButton anggu1,anggu2,anggu3,anggu4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anggu);
        anggu1 = (ImageButton) findViewById(R.id.ianggu1);
        anggu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ak1 = new Intent(Anggu.this,Moji.class);
                startActivity(Ak1);
            }
        });
        anggu2 = (ImageButton) findViewById(R.id.ianggu3);
        anggu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ak2 = new Intent(Anggu.this,Candy.class);
                startActivity(Ak2);
            }
        });
        anggu3 = (ImageButton) findViewById(R.id.ianggu5);
        anggu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ak3 = new Intent(Anggu.this,BuntekoyMap.class);
                startActivity(Ak3);
            }
        });
        anggu4 = (ImageButton) findViewById(R.id.ianggu2);
        anggu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  Ak4 = new Intent(Anggu.this,Abong.class);
                startActivity(Ak4);
            }
        });
    }
}
