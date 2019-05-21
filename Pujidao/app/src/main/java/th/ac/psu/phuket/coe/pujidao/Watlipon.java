package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Watlipon extends AppCompatActivity {
    ImageButton watlipon1,watlipon2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watlipon);
        watlipon1 = (ImageButton) findViewById(R.id.ilipon1);
        watlipon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gwl1 = new Intent(Watlipon.this,Watpranangsang.class);
                startActivity(Gwl1);
            }
        });
        watlipon2 = (ImageButton) findViewById(R.id.ilipon3);
        watlipon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gwl2 = new Intent(Watlipon.this,Temple.class);
                startActivity(Gwl2);
            }
        });
    }
}
