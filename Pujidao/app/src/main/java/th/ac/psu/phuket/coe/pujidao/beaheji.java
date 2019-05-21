package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class beaheji extends AppCompatActivity {
    ImageButton bhj1,bhj2,bhj3,bhj4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaheji);
        bhj1 = (ImageButton) findViewById(R.id.ibhj1);
        bhj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bo1 = new Intent(beaheji.this,Bowlang.class);
                startActivity(Bo1);
            }
        });
        bhj2 = (ImageButton) findViewById(R.id.ibhj3);
        bhj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bo2 = new Intent(beaheji.this,Candy.class);
                startActivity(Bo2);
            }
        });
        bhj3 = (ImageButton) findViewById(R.id.ibhj5);
        bhj3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Bo3 = new Intent(beaheji.this,BuntekoyMap.class);
                startActivity(Bo3);
            }
        });
        bhj4 = (ImageButton) findViewById(R.id.ibhj2);
        bhj4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  Bo4 = new Intent(beaheji.this,Koshui.class);
                startActivity(Bo4);
            }
        });
    }
}
