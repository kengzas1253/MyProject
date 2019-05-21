package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Juituishrine extends AppCompatActivity {
    ImageButton juitui1,juitui2;
    ImageView juitui3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juituishrine);
        juitui1 = (ImageButton) findViewById(R.id.ijuitui3);
        juitui1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gj1 = new Intent(Juituishrine.this,Shrine.class);
                startActivity(Gj1);
            }
        });
        juitui2 = (ImageButton) findViewById(R.id.ijuitui2);
        juitui2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gj2 = new Intent(Juituishrine.this,NaithuShrine.class);
                startActivity(Gj2);
            }
        });
        juitui3 = (ImageView) findViewById(R.id.juituishrineView);
        juitui3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gj3 = new Intent(Juituishrine.this,JuituiView.class);
                startActivity(Gj3);
            }
        });
    }
}
