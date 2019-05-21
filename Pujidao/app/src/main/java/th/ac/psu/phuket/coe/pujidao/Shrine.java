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

public class Shrine extends AppCompatActivity {
    ListView listviewshrine;
    int[] IMshrine ={R.drawable.juituishrine,R.drawable.kathushrine,R.drawable.bangniewshrine,
            R.drawable.samkongshrine,R.drawable.hlongrongrine};
    String[] NameShrine ={"ศาลเจ้าจุ้ยตุ่ยเต้าโบ้เก้ง  ","ศาลเจ้าในทูเต้าบู้เก้ง ","ศาลเจ้าบางเหนียว","ศาลเจ้าหลิมหู้ไท้สู้ ","ศาลเจ้าซุ่ยบุ่นต๋อง "};
    String[] DecShrine = {"ที่อยู่： 283 ซอย ภูธร ถนนระนอง ตำบล ตลาดเหนือ อำเภอเมืองภูเก็ต ภูเก็ต 83000",
            "ที่อยู่: 4020 ตำบล กะทู้ อำเภอ กะทู้ ภูเก็ต 83120",
            "ที่อยู่: 197 ถนนภูเก็ต ตำบล ตลาดใหญ่ อำเภอเมืองภูเก็ต ภูเก็ต 83000",
            "ที่อยู่:  2 ถนน เยาวราช 1 ตำบล รัษฎา อำเภอเมืองภูเก็ต ภูเก็ต 83000",
            "ที่อยู่: ถนนพัฒนา ซอย 8 ตำบล ตลาดเหนือ อำเภอเมืองภูเก็ต ภูเก็ต 83000"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shrine);
        listviewshrine = (ListView)findViewById(R.id.ListView_shrine);
        CustomAdepter_shrine customAdepter_shrine = new CustomAdepter_shrine();
        listviewshrine.setAdapter(customAdepter_shrine);
        listviewshrine.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent Sh1 = new Intent(Shrine.this,Juituishrine.class);
                    startActivity(Sh1);
                }
                if (position == 1) {
                    Intent Sh2 = new Intent(Shrine.this,NaithuShrine.class);
                    startActivity(Sh2);
                }
                if (position == 2) {
                    Intent Sh3 = new Intent(Shrine.this,Bangniewshrine.class);
                    startActivity(Sh3);
                }
                if (position == 3) {
                    Intent Sh4 = new Intent(Shrine.this,Samkongshrine.class);
                    startActivity(Sh4);
                }
                if (position == 4) {
                    Intent Sh5 = new Intent(Shrine.this,HlorongShrine.class);
                    startActivity(Sh5);
                }
            }
        });

    }
    class CustomAdepter_shrine extends BaseAdapter {
        @Override
        public int getCount() {
            return IMshrine.length;
        }
        @Override
        public Object getItem(int imv4) {
            return null;
        }
        @Override
        public long getItemId(int imv4) {
            return 0;
        }
        @Override
        public View getView(int im5, View view9, ViewGroup viewGroup) {
            view9 = getLayoutInflater().inflate(R.layout.layout_shrine,null);

            ImageView imageView8=(ImageView)view9.findViewById(R.id.imv_shrine);
            TextView textView_name8 = (TextView)view9.findViewById(R.id.tx_nameshrine);
            TextView textView_dec8 = (TextView)view9.findViewById(R.id.tx_decshrine);

            imageView8.setImageResource(IMshrine[im5]);
            textView_name8.setText(NameShrine[im5]);
            textView_dec8.setText(DecShrine[im5]);
            return view9;
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
                Intent Sh = new Intent(Shrine.this,NewPage_location.class);
                startActivity(Sh);
                return true;
            }
            default:  return super.onOptionsItemSelected(item);
        }
    }
}
