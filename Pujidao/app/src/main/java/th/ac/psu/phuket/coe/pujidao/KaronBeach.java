package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class KaronBeach extends AppCompatActivity {
    ImageButton karon1,karon2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karon_beach);
        karon1 = (ImageButton) findViewById(R.id.ikaron3);
        karon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gr1 = new Intent(KaronBeach.this,Beaches.class);
                startActivity(Gr1);
            }
        });
        karon2 = (ImageButton) findViewById(R.id.ikaron2);
        karon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gr2 = new Intent(KaronBeach.this,KatanoiBeach.class);
                startActivity(Gr2);
            }
        });
    }
}
