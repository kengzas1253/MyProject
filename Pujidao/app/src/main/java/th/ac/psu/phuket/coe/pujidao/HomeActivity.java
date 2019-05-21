package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private static final String TAG = "MainActivity";
    Fragment currentFragment;

    DrawerLayout drawerLayout;
    NavigationView navigationView;

    ImageButton b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        b1 = (ImageButton) findViewById(R.id.imbGo1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B1 = new Intent(HomeActivity.this,PageCommunity.class);
                startActivity(B1);
            }
        });
        b2 = (ImageButton) findViewById(R.id.imbGo2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B2 = new Intent(HomeActivity.this,PageNativeFood.class);
                startActivity(B2);
            }
        });
        b3 = (ImageButton) findViewById(R.id.imbG03);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B3 = new Intent(HomeActivity.this,NewPage_location.class);
                startActivity(B3);
            }
        });
        b4 = (ImageButton) findViewById(R.id.imbGo4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent B4 = new Intent(HomeActivity.this,PageGame.class);
                startActivity(B4);
            }
        });
        //Toolbar toolbar = findViewById(R.id.toolbar);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        //toolbar.setTitleTextColor(Color.WHITE);
        //setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_apps_black_24dp);

        navigationView.setNavigationItemSelectedListener(this);
    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        item.setChecked(true);
        switch (item.getItemId()) {
            case R.id.menu_item1:{
                Intent Bi1 = new Intent(HomeActivity.this,Dictionary.class);
                startActivity(Bi1);
                return true;
            }
            case R.id.menu_item2:{
                Intent Bi2 = new Intent(HomeActivity.this,My_Locattions.class);
                startActivity(Bi2);
                return true;
            }
            case R.id.menu_item3: {
                Intent Bi3 = new Intent(HomeActivity.this,PageCulture.class);
                startActivity(Bi3);
                return true;
            }
            case R.id.menu_item4: {
                Toast.makeText(this, "Design By Naratip Thongtaluang 5735512153 CoE Prince of Songkla University", Toast.LENGTH_SHORT).show();
                return true;
            }

        }

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container, currentFragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();

        drawerLayout.closeDrawers();
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
