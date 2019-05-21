package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Kiakoy extends AppCompatActivity {
   ImageButton kak1,kak2,kak3,kak4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiakoy);
        kak1 = (ImageButton) findViewById(R.id.ikak1);
        kak1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ka1 = new Intent(Kiakoy.this,Khawniawheb.class);
                startActivity(ka1);
            }
        });
        kak2 = (ImageButton) findViewById(R.id.ikak3);
        kak2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ka2 = new Intent(Kiakoy.this,Candy.class);
                startActivity(ka2);
            }
        });
        kak3 = (ImageButton) findViewById(R.id.ikak5);
        kak3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ka3 = new Intent(Kiakoy.this,BuntekoyMap.class);
                startActivity(ka3);
            }
        });
        kak4 = (ImageButton) findViewById(R.id.ikak2);
        kak4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  ka4 = new Intent(Kiakoy.this,Kiamkoy.class);
                startActivity(ka4);
            }
        });
    }
}
