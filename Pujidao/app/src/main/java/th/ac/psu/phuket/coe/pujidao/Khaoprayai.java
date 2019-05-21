package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Khaoprayai extends AppCompatActivity {
    ImageButton prayai1,prayai2,prayai3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khaoprayai);
        prayai1 = (ImageButton) findViewById(R.id.iprayai1);
        prayai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gpy1 = new Intent(Khaoprayai.this,Promtepcape.class);
                startActivity(Gpy1);
            }
        });
        prayai2 = (ImageButton) findViewById(R.id.iprayai3);
        prayai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gpy2 = new Intent(Khaoprayai.this,Viewpoint.class);
                startActivity(Gpy2);
            }
        });
        prayai3 = (ImageButton) findViewById(R.id.iprayai2);
        prayai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gpy3 = new Intent(Khaoprayai.this,ThreebeachView.class);
                startActivity(Gpy3);
            }
        });
    }
}
