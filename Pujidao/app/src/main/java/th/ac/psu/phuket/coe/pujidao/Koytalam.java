package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Koytalam extends AppCompatActivity {
    ImageButton ktm1,ktm2,ktm3,ktm4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koytalam);
        ktm1 = (ImageButton) findViewById(R.id.iktm1);
        ktm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent M1 = new Intent(Koytalam.this,Kiamkoy.class);
                startActivity(M1);
            }
        });
        ktm2 = (ImageButton) findViewById(R.id.iktm3);
        ktm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent M2 = new Intent(Koytalam.this,Candy.class);
                startActivity(M2);
            }
        });
        ktm3 = (ImageButton) findViewById(R.id.iktm5);
        ktm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent M3 = new Intent(Koytalam.this,BuntekoyMap.class);
                startActivity(M3);
            }
        });
        ktm4 = (ImageButton) findViewById(R.id.iktm2);
        ktm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  M4 = new Intent(Koytalam.this,Moji.class);
                startActivity(M4);
            }
        });
    }
}
