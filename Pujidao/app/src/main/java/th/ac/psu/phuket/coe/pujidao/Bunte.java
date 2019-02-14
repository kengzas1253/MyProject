package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bunte extends AppCompatActivity {
    Button bbt1,bbt2,bbt3,bbt4,bbt5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bunte);
        bbt1= (Button) findViewById(R.id.btFamily);
        bbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Btt1 = new Intent(Bunte.this,PLanguage.class);
                startActivity(Btt1);
            }
        });
        bbt2= (Button) findViewById(R.id.btSurname);
        bbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Btt2 = new Intent(Bunte.this,Bunte_name.class);
                startActivity(Btt2);
            }
        });
        bbt3= (Button) findViewById(R.id.btFruit);
        bbt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Btt3 = new Intent(Bunte.this,Bunte_fruit.class);
                startActivity(Btt3);
            }
        });
        bbt4= (Button) findViewById(R.id.btPlace);
        bbt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Btt4 = new Intent(Bunte.this,Bunte_place.class);
                startActivity(Btt4);
            }
        });
        bbt5= (Button) findViewById(R.id.btDic);
        bbt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Btt5 = new Intent(Bunte.this,Dictionary.class);
                startActivity(Btt5);
            }
        });
    }
}
