package th.ac.psu.phuket.coe.pujidao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class PageOldpicture extends AppCompatActivity {
    ListView listoldpic;
    int[] IMPic={R.drawable.wongvienhoy,R.drawable.yaowarad_rd,R.drawable.thalang_rd,
                 R.drawable.anusawalee,R.drawable.kamala};
    String[] NamePicture ={"วงเวียนหอยสะพานหิน","ถนนเยาวราช","ถนนถลาง","อนุสาวรีย์","หาดกมลา"};
    String[] DecPicture = {"อนุสาวรีย์หลัก60ปี(คนภูเก็ตเรียกวงเวียนหอยสะพานหิน)เพื่อเป็นที่ระลึกแก่กัปตันเอ็ดเวิร์ดโธมัสไมล ์ชาวออสเตรเลียผู้นำเรือขุุดแร่ลำแรกมาใช้ที่ภูเก็ต",
                          "ถนนเยาวราชเมืองภูเก็ต ถ่ายเมื่อพ.ศ2495 จุ้ยก้าว(คูน้ำ)ไม่มีฝาปิด วางแผ่นปูนสำหรับรถถีบและคนเข้า-ออกบ้าน",
                          "แยกถนนถลางเมืองภูเก็ตตัดกับถนนเยาวราช ถ่ายเมื่อพ.ศ2476",
                          "อนุสาวรีย์ท้าวเทพกระษัตรีและท้าวศรีสุนทรถ่ายเมื่อปี 2510",
                          "ภาพการลากอวนริมหาดกมลาของชาวบ้าวกมลาเมื่อ 40 ปีก่อน"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_oldpicture);

        listoldpic = (ListView)findViewById(R.id.ListOldpic);
        CustomAdepter9 customAdepter9 = new CustomAdepter9();
        listoldpic.setAdapter(customAdepter9);

    }
    class CustomAdepter9 extends BaseAdapter {


        @Override
        public int getCount() {
            return IMPic.length;
        }

        @Override
        public Object getItem(int im4) {
            return null;
        }

        @Override
        public long getItemId(int im4) {
            return 0;
        }

        @Override
        public View getView(int im4, View view8, ViewGroup viewGroup) {
            view8 = getLayoutInflater().inflate(R.layout.customlayout9,null);

            ImageView imageView7=(ImageView)view8.findViewById(R.id.imVPo);
            TextView textView_name7 = (TextView)view8.findViewById(R.id.tnPic);
            TextView textView_decCul = (TextView)view8.findViewById(R.id.tPdec);

            imageView7.setImageResource(IMPic[im4]);
            textView_name7.setText(NamePicture[im4]);
            textView_decCul.setText(DecPicture[im4]);
            return view8;
        }
    }
}
