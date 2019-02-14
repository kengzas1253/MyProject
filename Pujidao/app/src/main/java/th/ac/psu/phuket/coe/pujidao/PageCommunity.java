package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PageCommunity extends AppCompatActivity {
    ImageButton a1,a2,a3,a4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_community);
        a1 = (ImageButton) findViewById(R.id.imcGo4);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A1 = new Intent(PageCommunity.this,MainActivity.class);
                startActivity(A1);
            }
        });
        a2 = (ImageButton) findViewById(R.id.imcGo2);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A2 = new Intent(PageCommunity.this,PageCulture.class);
                startActivity(A2);
            }
        });
        a3 = (ImageButton) findViewById(R.id.imcGo3);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A3 = new Intent(PageCommunity.this,Festival.class);
                startActivity(A3);
            }
        });
        a4 = (ImageButton) findViewById(R.id.imcGo1);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A4 = new Intent(PageCommunity.this,Page_History.class);
                startActivity(A4);
            }
        });
    }
}
