package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Beatongkoy extends AppCompatActivity {
    ImageButton btk1,btk2,btk3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beatongkoy);
        btk1 = (ImageButton) findViewById(R.id.ibtk3);
        btk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bk2 = new Intent(Beatongkoy.this,Candy.class);
                startActivity(Bk2);
            }
        });
        btk2 = (ImageButton) findViewById(R.id.ibtk5);
        btk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bk3 = new Intent(Beatongkoy.this,BuntekoyMap.class);
                startActivity(Bk3);
            }
        });
        btk3 = (ImageButton) findViewById(R.id.ibtk2);
        btk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bk4 = new Intent(Beatongkoy.this,Banjiankoy.class);
                startActivity(Bk4);
            }
        });
    }
}
