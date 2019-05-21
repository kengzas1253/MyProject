package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Seaguokoy extends AppCompatActivity {
    ImageButton sgk1,sgk2,sgk3,sgk4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seaguokoy);
        sgk1 = (ImageButton) findViewById(R.id.isgk1);
        sgk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent S1 = new Intent(Seaguokoy.this,Bietaybark.class);
                startActivity(S1);
            }
        });
        sgk2 = (ImageButton) findViewById(R.id.isgk3);
        sgk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent S2 = new Intent(Seaguokoy.this,Candy.class);
                startActivity(S2);
            }
        });
        sgk3 = (ImageButton) findViewById(R.id.isgk5);
        sgk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent S3 = new Intent(Seaguokoy.this,BuntekoyMap.class);
                startActivity(S3);
            }
        });
        sgk4 = (ImageButton) findViewById(R.id.isgk2);
        sgk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  S4 = new Intent(Seaguokoy.this,Chaitawkoy.class);
                startActivity(S4);
            }
        });
    }
}
