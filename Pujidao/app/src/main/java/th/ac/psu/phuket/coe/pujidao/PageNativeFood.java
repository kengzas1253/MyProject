package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PageNativeFood extends AppCompatActivity {
    ImageButton c1,c2,c3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_native_food);
        c1 = (ImageButton) findViewById(R.id.imf3);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent C1 = new Intent(PageNativeFood.this,MainActivity.class);
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
    }
}
