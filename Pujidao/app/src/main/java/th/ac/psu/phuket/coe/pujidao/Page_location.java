package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Page_location extends AppCompatActivity {

    Button bnt1,bnt2,bnt3,bnt4,bnt5,bnt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_location);
        bnt1 = (Button) findViewById(R.id.bnt_map);
        bnt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bnt1 = new Intent(Page_location.this,My_Locattions.class);
                startActivity(Bnt1);
            }
        });
        bnt2 = (Button)findViewById(R.id.bnt_mc);
        bnt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bnt2 = new Intent(Page_location.this,PagePlace.class);
                startActivity(Bnt2);
            }
        });
        bnt3 = (Button)findViewById(R.id.bnt_view1);
        bnt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bnt3 = new Intent(Page_location.this,Viewpoint.class);
                startActivity(Bnt3);
            }
        });
        bnt4 = (Button)findViewById(R.id.bnt_beach1);
        bnt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bnt2 = new Intent(Page_location.this,Beaches.class);
                startActivity(Bnt2);
            }
        });
        bnt5 = (Button)findViewById(R.id.bnt_temple1);
        bnt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bnt2 = new Intent(Page_location.this,Temple.class);
                startActivity(Bnt2);
            }
        });
        bnt6 = (Button)findViewById(R.id.bnt_shrine1);
        bnt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bnt2 = new Intent(Page_location.this,Shrine.class);
                startActivity(Bnt2);
            }
        });
    }
}
