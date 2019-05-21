package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Khawniawheb extends AppCompatActivity {
    ImageButton knn1,knn2,knn3,knn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khawniawheb);
        knn1 = (ImageButton) findViewById(R.id.iknn1);
        knn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k1 = new Intent(Khawniawheb.this,Youjakoy.class);
                startActivity(k1);
            }
        });
        knn2 = (ImageButton) findViewById(R.id.iknn3);
        knn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k2 = new Intent(Khawniawheb.this,Candy.class);
                startActivity(k2);
            }
        });
        knn3 = (ImageButton) findViewById(R.id.iknn5);
        knn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k3 = new Intent(Khawniawheb.this,BuntekoyMap.class);
                startActivity(k3);
            }
        });
        knn4 = (ImageButton) findViewById(R.id.iknn2);
        knn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  k4 = new Intent(Khawniawheb.this,Kiakoy.class);
                startActivity(k4);
            }
        });
    }
}
