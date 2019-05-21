package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Beaches extends AppCompatActivity {
    ListView listBeach;
    int[] IMBeach ={R.drawable.karon,R.drawable.katanoi,R.drawable.patong,
            R.drawable.naiharn,R.drawable.yanui};
    String[] NameB ={"หาดกะรน","หาดกะตะน้อย","หาดป่าตอง","หาดในหาน","หาดยะนุ้ย"};
    String[] DecB = {"ที่ตั้ง ต.กะรน อ.เมืองภูเก็ต ",
            "ที่ตั้ง ต.กะรน อ.เมืองภูเก็ต",
            "ที่ตั้ง ต.ป่าตอง อ.กะทู้ ",
            "ที่ตั้ง ต.ราไวย์ อ.เมืองภูเก็ต",
            "ี่ั้ที่ตั้ง ต.ราไวย์ อ.เมืองภูเก็ต"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaches);
        listBeach = (ListView)findViewById(R.id.ListView_beach);
        CustomAdepter_beach customAdepter_beach = new CustomAdepter_beach();
        listBeach.setAdapter(customAdepter_beach);
        listBeach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent Be1 = new Intent(Beaches.this,KaronBeach.class);
                    startActivity(Be1);
                }
                if (position == 1) {
                    Intent Be2 = new Intent(Beaches.this,KatanoiBeach.class);
                    startActivity(Be2);
                }
                if (position == 2) {
                    Intent Be3 = new Intent(Beaches.this,PatongBeach.class);
                    startActivity(Be3);
                }
                if (position == 3) {
                    Intent Be4 = new Intent(Beaches.this,NaiharnBeach.class);
                    startActivity(Be4);
                }
                if (position == 4) {
                    Intent Be5 = new Intent(Beaches.this,YanuiBeach.class);
                    startActivity(Be5);
                }
            }
        });


    }
    class CustomAdepter_beach extends BaseAdapter {


        @Override
        public int getCount() {
            return IMBeach.length;
        }

        @Override
        public Object getItem(int im6) {
            return null;
        }

        @Override
        public long getItemId(int im6) {
            return 0;
        }

        @Override
        public View getView(int imb6, View view10, ViewGroup viewGroup) {
            view10 = getLayoutInflater().inflate(R.layout.layout_beach,null);

            ImageView imageView8=(ImageView)view10.findViewById(R.id.beachesView);
            TextView textView_name8 = (TextView)view10.findViewById(R.id.textBeach);
            TextView textView_dec8 = (TextView)view10.findViewById(R.id.textDetailBeach);

            imageView8.setImageResource(IMBeach[imb6]);
            textView_name8.setText(NameB[imb6]);
            textView_dec8.setText(DecB[imb6]);
            return view10;
        }
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
                Intent Beach = new Intent(Beaches.this,NewPage_location.class);
                startActivity(Beach);
                return true;
            }
            default:  return super.onOptionsItemSelected(item);
        }
    }
}
