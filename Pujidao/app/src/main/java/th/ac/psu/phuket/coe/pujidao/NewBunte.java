package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class NewBunte extends AppCompatActivity {
    LinearLayout tagb1,tagb2,tagb3,tagb4,tagb5,tagb6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_bunte);
        tagb1 = (LinearLayout) findViewById(R.id.bunte1);
        tagb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent T1 = new Intent(NewBunte.this,PLanguage.class);
                startActivity(T1);
            }
        });
        tagb2 = (LinearLayout) findViewById(R.id.bunte2);
        tagb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent T2 = new Intent(NewBunte.this,Bunte_name.class);
                startActivity(T2);
            }
        });
        tagb3 = (LinearLayout) findViewById(R.id.bunte3);
        tagb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent T3 = new Intent(NewBunte.this,Bunte_fruit.class);
                startActivity(T3);
            }
        });
        tagb4 = (LinearLayout) findViewById(R.id.bunte4);
        tagb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent T4 = new Intent(NewBunte.this,Bunte_place.class);
                startActivity(T4);
            }
        });
        tagb5 = (LinearLayout) findViewById(R.id.bunte5);
        tagb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent T5 = new Intent(NewBunte.this,Dictionary.class);
                startActivity(T5);
            }
        });
        tagb6 = (LinearLayout) findViewById(R.id.bunte6);
        tagb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent T6 = new Intent(NewBunte.this,HomeActivity.class);
                startActivity(T6);
            }
        });
    }
}
