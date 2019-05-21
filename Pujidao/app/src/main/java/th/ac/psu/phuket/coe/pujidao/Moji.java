package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Moji extends AppCompatActivity {
    ImageButton moji1,moji2,moji3,moji4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moji);
        moji1 = (ImageButton) findViewById(R.id.imoji1);
        moji1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mo1 = new Intent(Moji.this,Koytalam.class);
                startActivity(Mo1);
            }
        });
        moji2 = (ImageButton) findViewById(R.id.imoji3);
        moji2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mo2 = new Intent(Moji.this,Candy.class);
                startActivity(Mo2);
            }
        });
        moji3 = (ImageButton) findViewById(R.id.imoji5);
        moji3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mo3 = new Intent(Moji.this,BuntekoyMap.class);
                startActivity(Mo3);
            }
        });
        moji4 = (ImageButton) findViewById(R.id.imoji2);
        moji4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  Mo4 = new Intent(Moji.this,Anggu.class);
                startActivity(Mo4);
            }
        });
    }
}
