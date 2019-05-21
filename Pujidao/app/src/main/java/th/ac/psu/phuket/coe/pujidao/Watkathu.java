package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Watkathu extends AppCompatActivity {
    ImageButton kathu1,kathu2,kathu3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watkathu);
        kathu1 = (ImageButton) findViewById(R.id.ikathu1);
        kathu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gwth1 = new Intent(Watkathu.this,Watpratong.class);
                startActivity(Gwth1);
            }
        });
        kathu2 = (ImageButton) findViewById(R.id.ikathu3);
        kathu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gwth2 = new Intent(Watkathu.this,Temple.class);
                startActivity(Gwth2);
            }
        });
        kathu3 = (ImageButton) findViewById(R.id.ikathu2);
        kathu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gwth3 = new Intent(Watkathu.this,Watpranangsang.class);
                startActivity(Gwth3);
            }
        });
    }
}
