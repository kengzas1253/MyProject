package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Namprikkung extends AppCompatActivity {
    ImageButton namprik1, namprik2, namprik3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namprikkung);
        namprik1 = (ImageButton) findViewById(R.id.inamprik1);
        namprik1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent N1 = new Intent(Namprikkung.this,Huche.class);
                startActivity(N1);
            }
        });
        namprik2 = (ImageButton) findViewById(R.id.inamprik3);
        namprik2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent N2 = new Intent(Namprikkung.this,Food.class);
                startActivity(N2);
            }
        });
        namprik3 = (ImageButton) findViewById(R.id.inamprik5);
        namprik3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent N3 = new Intent(Namprikkung.this,MoohongMap.class);
                startActivity(N3);
            }
        });
    }
}
