package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (ImageButton) findViewById(R.id.imbGo1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B1 = new Intent(MainActivity.this,PageCommunity.class);
                startActivity(B1);
            }
        });
        b2 = (ImageButton) findViewById(R.id.imbGo2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B2 = new Intent(MainActivity.this,PageNativeFood.class);
                startActivity(B2);
            }
        });
        b3 = (ImageButton) findViewById(R.id.imbG03);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B3 = new Intent(MainActivity.this,Page_location.class);
                startActivity(B3);
            }
        });
        b4 = (ImageButton) findViewById(R.id.imbGo4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B4 = new Intent(MainActivity.this,PageGame.class);
                startActivity(B4);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.subitem1: {
                Intent Bi1 = new Intent(MainActivity.this,Dictionary.class);
                startActivity(Bi1);
                return true;
            }
            case R.id.subitem2: {
                Intent Bi2 = new Intent(MainActivity.this,My_Locattions.class);
                startActivity(Bi2);
                return true;
            }
            case R.id.subitem3: {
                Intent Bi3 = new Intent(MainActivity.this,PageCulture.class);
                startActivity(Bi3);
                return true;
            }
            case R.id.subitem4: {
                Toast.makeText(this, "Design By Narawadee Thongtaluang 5735512153 CoE Prince of Songkla University", Toast.LENGTH_SHORT).show();
                return true;
            }

            default:  return super.onOptionsItemSelected(item);
        }

    }
}
