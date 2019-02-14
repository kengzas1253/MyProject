package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Page_location extends AppCompatActivity {

    Button bnt1,bnt2;

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
    }
}
