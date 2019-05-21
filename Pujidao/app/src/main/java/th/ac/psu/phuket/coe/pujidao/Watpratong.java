package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Watpratong extends AppCompatActivity {
    ImageButton pratong1,pratong2,pratong3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watpratong);
        pratong1 = (ImageButton) findViewById(R.id.ipratong1);
        pratong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gwt1 = new Intent(Watpratong.this,Watchalong.class);
                startActivity(Gwt1);
            }
        });
        pratong2 = (ImageButton) findViewById(R.id.ipratong3);
        pratong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gwt2 = new Intent(Watpratong.this,Temple.class);
                startActivity(Gwt2);
            }
        });
        pratong3 = (ImageButton) findViewById(R.id.ipratong2);
        pratong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gwt3 = new Intent(Watpratong.this,Watkathu.class);
                startActivity(Gwt3);
            }
        });
    }
}
