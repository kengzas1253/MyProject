package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class YanuiBeach extends AppCompatActivity {
    ImageButton yanui1,yanui2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yanui_beach);
        yanui1 = (ImageButton) findViewById(R.id.iyanui1);
        yanui1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gyn1 = new Intent(YanuiBeach.this,NaiharnBeach.class);
                startActivity(Gyn1);
            }
        });
        yanui2 = (ImageButton) findViewById(R.id.iyanui3);
        yanui2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gyn2 = new Intent(YanuiBeach.this,Beaches.class);
                startActivity(Gyn2);
            }
        });
    }
}
