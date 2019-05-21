package th.ac.psu.phuket.coe.pujidao;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class PageNativeFood extends AppCompatActivity {
    ImageButton c1,c2,c3;
    TextView cg1,cg2,cg3;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_native_food);
        c1 = (ImageButton) findViewById(R.id.imf3);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent C1 = new Intent(PageNativeFood.this,HomeActivity.class);
                startActivity(C1);
            }
        });
        c2 = (ImageButton) findViewById(R.id.imf1);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent C2 = new Intent(PageNativeFood.this,Food.class);
                startActivity(C2);
            }
        });
        c3 = (ImageButton) findViewById(R.id.imf2);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent C3 = new Intent(PageNativeFood.this,Candy.class);
                startActivity(C3);
            }
        });

        cg1 = (TextView) findViewById(R.id.textView4);
        cg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Cg1 = new Intent(PageNativeFood.this,HomeActivity.class);
                startActivity(Cg1);
            }
        });
        cg2 = (TextView) findViewById(R.id.tf1);
        cg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Cg2 = new Intent(PageNativeFood.this,Food.class);
                startActivity(Cg2);
            }
        });
        cg3 = (TextView) findViewById(R.id.textView3);
        cg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Cg3 = new Intent(PageNativeFood.this,Candy.class);
                startActivity(Cg3);
            }
        });
    }
}
