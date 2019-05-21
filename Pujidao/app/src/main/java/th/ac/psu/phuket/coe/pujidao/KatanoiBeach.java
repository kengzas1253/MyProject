package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class KatanoiBeach extends AppCompatActivity {
    ImageButton katanoi1,katanoi2,katanoi3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katanoi_beach);
        katanoi1 = (ImageButton) findViewById(R.id.ikatanoi1);
        katanoi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ggta1 = new Intent(KatanoiBeach.this,KaronBeach.class);
                startActivity(Ggta1);
            }
        });
        katanoi2 = (ImageButton) findViewById(R.id.ikatanoi3);
        katanoi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ggata2 = new Intent(KatanoiBeach.this,Beaches.class);
                startActivity(Ggata2);
            }
        });
        katanoi3 = (ImageButton) findViewById(R.id.ikatanoi2);
        katanoi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ggata3 = new Intent(KatanoiBeach.this,PatongBeach.class);
                startActivity(Ggata3);
            }
        });
    }
}
