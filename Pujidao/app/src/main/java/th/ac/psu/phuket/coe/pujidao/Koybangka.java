package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Koybangka extends AppCompatActivity {
    ImageButton kbk1,kbk2,kbk3,kbk4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koybangka);
        kbk1 = (ImageButton) findViewById(R.id.ikbk1);
        kbk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Koy1 = new Intent(Koybangka.this,Koshui.class);
                startActivity(Koy1);
            }
        });
        kbk2 = (ImageButton) findViewById(R.id.ikbk3);
        kbk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Koy2 = new Intent(Koybangka.this,Candy.class);
                startActivity(Koy2);
            }
        });
        kbk3 = (ImageButton) findViewById(R.id.ikbk5);
        kbk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Koy3 = new Intent(Koybangka.this,BuntekoyMap.class);
                startActivity(Koy3);
            }
        });
        kbk4 = (ImageButton) findViewById(R.id.ikbk2);
        kbk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  Koy4 = new Intent(Koybangka.this,Aiwpung.class);
                startActivity(Koy4);
            }
        });
    }
}
