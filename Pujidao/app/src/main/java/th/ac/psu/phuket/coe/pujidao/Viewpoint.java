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

public class Viewpoint extends AppCompatActivity {
    ListView listviewpoint;
    int[] IMView ={R.drawable.khaoranghill,R.drawable.khaokhad,R.drawable.promtepcape,
            R.drawable.khaoprayai,R.drawable.threebeachview};
    String[] NameV ={"จุดชมวิวเขารัง ","หอชมวิวเขาขาด ","แหลมพรหมเทพ ","พระพุทธมิ่งมงคลเอกนาค","จุดชมวิวสามอ่าว "};
    String[] DecV = {"ที่ตั้ง ถนนคอซิมบี้ ต.ตลาดใหญ่ อ.เมืองภูเก็ต ระยะทางถึงยอดเขาประมาณ 1.8 กิโลเมตร) ",
            "ที่ตั้ง ทางหลวงหมายเลข 4023  ต.วิชิต อ.เมืองภูเก็ต (ระยะทางขึ้นเขาประมาณ 1.5 กิโลเมตร) ",
            "ที่ตั้ง ทางหลวงแผ่นดินหมายเลข 4233    ต.ราไวย์ อ.เมืองภูเก็ต",
            "ที่ตั้ง ซอย ยอดเสน่ห์ 1 ต.ฉลอง อ.เมืองภูเก็ต (ระยะทางจากปากซอยยอดเสน่ห์ 1 ถึงฐานพระประมาณ 5.4 กิโลเมตร) ",
            "ที่ตั้ง ทางหลวงหมายเลข 4233 ต.กะรน อ.เมืองภูเก็ต"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpoint);
        listviewpoint = (ListView)findViewById(R.id.ListView_viewpoint);
        CustomAdepter_viewpoint customAdepter_viewpoint = new CustomAdepter_viewpoint();
        listviewpoint.setAdapter(customAdepter_viewpoint);
        listviewpoint.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent V1 = new Intent(Viewpoint.this,Khaoranghill.class);
                    startActivity(V1);
                }
                if (position == 1) {
                    Intent V2 = new Intent(Viewpoint.this,khaokhad.class);
                    startActivity(V2);
                }
                if (position == 2) {
                    Intent V3 = new Intent(Viewpoint.this,Promtepcape.class);
                    startActivity(V3);
                }
                if (position == 3) {
                    Intent V4 = new Intent(Viewpoint.this,Khaoprayai.class);
                    startActivity(V4);
                }
                if (position == 4) {
                    Intent V5 = new Intent(Viewpoint.this,ThreebeachView.class);
                    startActivity(V5);
                }
            }
        });

    }
    class CustomAdepter_viewpoint extends BaseAdapter {
        @Override
        public int getCount() {
            return IMView.length;
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
            view9 = getLayoutInflater().inflate(R.layout.layout_viewpoint,null);

            ImageView imageView8=(ImageView)view9.findViewById(R.id.imv_viewpoint);
            TextView textView_name8 = (TextView)view9.findViewById(R.id.tx_nameView);
            TextView textView_dec8 = (TextView)view9.findViewById(R.id.tx_DecView);

            imageView8.setImageResource(IMView[im5]);
            textView_name8.setText(NameV[im5]);
            textView_dec8.setText(DecV[im5]);
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
                Intent View = new Intent(Viewpoint.this,NewPage_location.class);
                startActivity(View);
                return true;
            }
            default:  return super.onOptionsItemSelected(item);
        }
    }
}
