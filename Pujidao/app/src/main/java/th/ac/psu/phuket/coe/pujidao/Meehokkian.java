package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Meehokkian extends AppCompatActivity {
    ImageButton meehok1,meehok2,meehok3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meehokkian);
        meehok1 = (ImageButton) findViewById(R.id.ihb3);
        meehok1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Meehok2 = new Intent(Meehokkian.this,Food.class);
                startActivity(Meehok2);
            }
        });
        meehok2 = (ImageButton) findViewById(R.id.ihb5);
        meehok2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Meehok3 = new Intent(Meehokkian.this,MeehokkianMap.class);
                startActivity(Meehok3);
            }
        });
        meehok3 = (ImageButton) findViewById(R.id.ihb2);
        meehok3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Meehok4 = new Intent(Meehokkian.this,Otaw.class);
                startActivity(Meehok4);
            }
        });
    }
}
