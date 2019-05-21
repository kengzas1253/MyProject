package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class NewPage_location extends AppCompatActivity {
    LinearLayout gtag1,gtag2,gtag3,gtag4,gtag5,gtag6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_page_location);
        gtag1 = (LinearLayout) findViewById(R.id.tag1);
        gtag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent T1 = new Intent(NewPage_location.this,My_Locattions.class);
                startActivity(T1);
            }
        });
        gtag2 = (LinearLayout) findViewById(R.id.tag2);
        gtag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent T2 = new Intent(NewPage_location.this,PagePlace.class);
                startActivity(T2);
            }
        });
        gtag3 = (LinearLayout) findViewById(R.id.tag4);
        gtag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent T3 = new Intent(NewPage_location.this,Beaches.class);
                startActivity(T3);
            }
        });
        gtag4 = (LinearLayout) findViewById(R.id.tag3);
        gtag4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent T4 = new Intent(NewPage_location.this,Viewpoint.class);
                startActivity(T4);
            }
        });
        gtag5 = (LinearLayout) findViewById(R.id.tag5);
        gtag5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent T5 = new Intent(NewPage_location.this,Temple.class);
                startActivity(T5);
            }
        });
        gtag6 = (LinearLayout) findViewById(R.id.tag6);
        gtag6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent T6 = new Intent(NewPage_location.this,Shrine.class);
                startActivity(T6);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_place,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.placeitem1: {
                Intent P1 = new Intent(NewPage_location.this,HomeActivity.class);
                startActivity(P1);
                return true;
            }
            default:  return super.onOptionsItemSelected(item);
        }
    }
}
