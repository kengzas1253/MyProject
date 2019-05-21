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

public class Temple extends AppCompatActivity {
    ListView listTemple;
    int[] IMtemple ={R.drawable.watchalong,R.drawable.watpratong,R.drawable.watkathu,
            R.drawable.watpranangsang,R.drawable.watlipon};
    String[] NameTem ={"วัดไชยธาราราม","วัดพระทอง ","วัดกะทู้","วัดพระนางสร้าง","วัดศรีสุนทร"};
    String[] DecTem = {"ที่ตั้ง ถนนเจ้าฟ้าตะวันตก ตำบลฉลอง อำเภอเมืองภูเก็ต",
            "ที่ตั้ง ถนนนาใน ตำบลเทพกระษัตรี อำเภอถลาง ",
            "ที่ตั้ง ถนนวิชิตสงคราม ตำบลกะทู้ อำเภอกะทู้",
            "ที่ตั้ง ถนนเทพกระษัตรี ตำบลเทพกระษัตรี อำเภอถลาง",
            "ที่ตั้ง ถนนเทพกระษัตรี ตำบลศรีสุนทร อำเภอถลาง ภูเก็ต"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temple);
        listTemple = (ListView)findViewById(R.id.ListView_temple);
        CustomAdepter_temple customAdepter_temple = new CustomAdepter_temple();
        listTemple.setAdapter(customAdepter_temple);
        listTemple.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent T1 = new Intent(Temple.this,Watchalong.class);
                    startActivity(T1);
                }
                if (position == 1) {
                    Intent T2 = new Intent(Temple.this,Watpratong.class);
                    startActivity(T2);
                }
                if (position == 2) {
                    Intent T3 = new Intent(Temple.this,Watkathu.class);
                    startActivity(T3);
                }
                if (position == 3) {
                    Intent T4 = new Intent(Temple.this,Watpranangsang.class);
                    startActivity(T4);
                }
                if (position == 4) {
                    Intent T5 = new Intent(Temple.this,Watlipon.class);
                    startActivity(T5);
                }
            }
        });
    }
    class CustomAdepter_temple extends BaseAdapter {
        @Override
        public int getCount() {
            return IMtemple.length;
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
            view9 = getLayoutInflater().inflate(R.layout.layout_temple,null);

            ImageView imageView8=(ImageView)view9.findViewById(R.id.imv_temple);
            TextView textView_name8 = (TextView)view9.findViewById(R.id.tx_Ntemple);
            TextView textView_dec8 = (TextView)view9.findViewById(R.id.tx_dectemple);

            imageView8.setImageResource(IMtemple[im5]);
            textView_name8.setText(NameTem[im5]);
            textView_dec8.setText(DecTem[im5]);
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
                Intent Wat = new Intent(Temple.this,NewPage_location.class);
                startActivity(Wat);
                return true;
            }
            default:  return super.onOptionsItemSelected(item);
        }
    }
}
