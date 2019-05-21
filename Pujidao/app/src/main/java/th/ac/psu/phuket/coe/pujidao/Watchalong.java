package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Watchalong extends AppCompatActivity {
    ImageButton gochalong1,gochalong2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watchalong);
        gochalong1 = (ImageButton) findViewById(R.id.iwatchalong3);
        gochalong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gl1 = new Intent(Watchalong.this,Temple.class);
                startActivity(Gl1);
            }
        });
        gochalong2 = (ImageButton) findViewById(R.id.iwatchalong2);
        gochalong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gl2 = new Intent(Watchalong.this,Watpratong.class);
                startActivity(Gl2);
            }
        });
    }
}
