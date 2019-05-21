package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Watpranangsang extends AppCompatActivity {
    ImageButton pranang1,pranang2,pranang3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watpranangsang);
        pranang1 = (ImageButton) findViewById(R.id.iwatpranang1);
        pranang1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gpn1 = new Intent(Watpranangsang.this,Watkathu.class);
                startActivity(Gpn1);
            }
        });
        pranang2 = (ImageButton) findViewById(R.id.iwatpranang3);
        pranang2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gpn2 = new Intent(Watpranangsang.this,Temple.class);
                startActivity(Gpn2);
            }
        });
        pranang3 = (ImageButton) findViewById(R.id.iwatpranang2);
        pranang3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gpn3 = new Intent(Watpranangsang.this,Watlipon.class);
                startActivity(Gpn3);
            }
        });
    }
}
