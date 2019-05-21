package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Koshui extends AppCompatActivity {
    ImageButton koshui1,koshui2,koshui3,koshui4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koshui);
        koshui1 = (ImageButton) findViewById(R.id.ikoshui1);
        koshui1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ko1 = new Intent(Koshui.this,beaheji.class);
                startActivity(Ko1);
            }
        });
        koshui2 = (ImageButton) findViewById(R.id.ikoshui3);
        koshui2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ko2 = new Intent(Koshui.this,Candy.class);
                startActivity(Ko2);
            }
        });
        koshui3 = (ImageButton) findViewById(R.id.ikoshui5);
        koshui3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Ko3 = new Intent(Koshui.this,BuntekoyMap.class);
                startActivity(Ko3);
            }
        });
        koshui4 = (ImageButton) findViewById(R.id.ikoshui2);
        koshui4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  Bo4 = new Intent(Koshui.this,Koybangka.class);
                startActivity(Bo4);
            }
        });
    }
}
