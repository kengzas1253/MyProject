package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Youjakoy extends AppCompatActivity {
    ImageButton yjk1,yjk2,yjk3,yjk4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youjakoy);
        yjk1 = (ImageButton) findViewById(R.id.iyjk1);
        yjk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Yk1 = new Intent(Youjakoy.this,Hunkoy.class);
                startActivity(Yk1);
            }
        });
        yjk2 = (ImageButton) findViewById(R.id.iyjk3);
        yjk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Yk2 = new Intent(Youjakoy.this,Candy.class);
                startActivity(Yk2);
            }
        });
        yjk3 = (ImageButton) findViewById(R.id.iyjk5);
        yjk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Yk3 = new Intent(Youjakoy.this,BuntekoyMap.class);
                startActivity(Yk3);
            }
        });
        yjk4 = (ImageButton) findViewById(R.id.iyjk2);
        yjk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  Yk4 = new Intent(Youjakoy.this,Khawniawheb.class);
                startActivity(Yk4);
            }
        });
    }
}
