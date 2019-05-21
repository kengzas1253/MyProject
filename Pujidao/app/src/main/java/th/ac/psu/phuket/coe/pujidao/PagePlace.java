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
import android.widget.Toast;

public class PagePlace extends AppCompatActivity {
    ListView placeList;
    int[] idp ={R.drawable.taihuamuseum,R.drawable.banchinpracha,R.drawable.banprisai,
            R.drawable.armsangdam,R.drawable.banprapritak,R.drawable.banpraaram,
            R.drawable.charterbank,R.drawable.policeoffice};
    String[] NamePlace = {"พิพิธภัณฑ์ภูเก็ตไทยหัว","บ้านชินประชา","บ้านพระพิไสยสรรพกิจ",
                           "ศาลเจ้าแสงธรรม(เต่งก้องต๋อง)","บ้านพระพิทักษ์","บ้านพระอร่ามสาครเขตร",
                          "ธนาคารชาร์เตอร์","สถานีตำรวจตำบลตลาดใหญ่"};
    String[] detailP ={"พิพิธภัณฑ์ภูเก็ตไทยหัวเดิมเป็นโรงเรียนสอนภาษาจีนในจังหวัดภูเก็ต ก่อตั้งเมื่อ พ.ศ. 2454 " +
            "โดยชาวจีนเพื่อจัดสอนภาษาจีนแบบโบราณ เดิมชื่อโรงเรียนฮั่วบุ๋น ต่อมาเปลี่ยนชื่อโรงเรียนเป็น" +
            " “โรงเรียนภูเก็ตจุงหัว”แต่ล้มเลิกกิจการและก่อตั้งใหม่เป็น “โรงเรียนภูเก็ตไทยหัว” " +
            "ปัจจุบันโรงเรียนภูเก็ตไทยหัวได้ย้ายไปอยู่บริเวณถนนวิชิตสงครามใน พ.ศ.2538" +
            "ซึ่งในส่วนของอาคารโรงเรียนเก่านั้นได้รับการบูรณะและจัดทำเป็นพิพิธภัณฑ์ใน พ.ศ.2553 ",

            "บ้านชินประชา สร้างขึ้นในปี พ.ศ. 2446หรือในปลายรัชสมัยรัชกาลที่ 5 " +
                    "โดยพระพิทักษ์ชินประชา(ตันเหนี่ยวยี่) ท่านถือกำเนิดในประเทศจีนมณฑลฮกเกี้ยน " +
                    "รับราชการทหารในตำแหน่ง “บู้เต๊กจงกุน” ต่อมาท่านได้เดินทางมาในประเทศไทยในปี พ.ศ.2397 " +
                    "ได้ประกอบกิจการทำเหมียงแร่ดีบุกที่เกาะภูเก็ต และกิจการค้าชายที่เกาะปีนัง ในนามยี่ห้อ “เหลียนบี้”(ดอกบัว)" +
                    " พระพิทักษ์ชินประชา(ตันม่าเสียง) ถือกำเนิดที่เกาะภูเก็ตในปี พ.ศ.2426เมื่ออายุได้ 20 ปี " +
                    "ท่านได้สร้างบ้านหลังนี้ตามแบบ”ชิโน-โปรตุกิส” เป็นหลังแรกในจังหวัดภูเก็ต หรือที่เรียกกันว่า “อังม่อเหลา” ",
            "พระพิไสยสรรพกิจ (ตันม้าส่าย) เป็นบุตรของหลวงบำรุงจีนประเทศ และเป็นพี่ชายพระพิทักษ์ชินประชา" +
                    " (ตันม้าเสียง)ท่านได้สร้างบ้านพักอาศัยก่ออิฐฉาบปูน 2 ชั้น " +
                    "รูปแบบสถาปัตยกรรมแบบผสมผสานระหว่างตะวันตกและจีนขึ้นมาในปี พ.ศ. 2453 ซึ่งเป็นช่วงเวลาที่กิจการทำเหมืองแร่ดีบุกบนเกาะภูเก็ตเจริญรุ่งเรือง",
             "เป็นศาลเจ้าเล็ก ๆ แต่ชาวบ้านให้ความนับถือมากมาย ซึ่งศาลเจ้าแห่งนี้มีหลายชื่อเรียกด้วยกัน ไม่ว่าจะเป็นศาลเจ้าเต่งก้องต๋อง หรือศาลเจ้าซิงเจียกอง " +
                     "หรืออ๊ามเตงก่องต๋อง ที่นี่สร้างขึ้นเมื่อปี พ.ศ. 2434 โดยหลวงอำนาจนรารักษ์ (ดันด้วด) เพื่อเป็นที่ประดิษฐานเทพเจ้าจีนที่สายตระกูลนับถือมาแต่เดิม " +
                     "ทั้งนี้ ศาลเจ้าแสงธรรมนั้นได้รับการออกแบบสถาปัตยกรรมตามวัฒนธรรมจีน สง่างามด้วยอาคารที่มีรูปทรงคล้ายเก๋งจีนขนาดเล็ก " +
                     "มีหลังคาปูนปั้นรูปมังกรและตุ๊กตาจีนอันเป็นที่นิยมอย่างมากในมณฑลฮกเกี้ยน ",
             "พระพิทักษ์ชินประชา(ตันม้าเสียง) สร้างขึ้นราวปี พ.ศ. 2484 เป็นคฤหาสน์หลังงามและมีบริเวณกว้างขวางที่สุดหลังหนึ่งในภูเก็ต " +
                     "ช่วงสงครามโลกครั้งที่ 2 ได้นำต้นมะพร้าวมาปลูกในสนามหญ้าเพื่อกันไม่ให้ทหารญี่ปุ่นใช้เป็นที่ฝึก",
             "บ้านพระอร่ามอร่ามสาครเขตร(ตันเพ็กฮวด ตัณฑัยย์) ตั้งอยู่ถนนระนอง ตลาดสดอำเภอเมืองภูเก็ต ปัจจุบันเป็นที่ทำการบริษัทการบินไทย " +
                     "สาขาภูเก็ต บ้านหลังนี้มีความยาวตั้งแต่หน้าบ้านถนนระนองไปจดถนนกระบี่ ซึ่งดูเหมือนเป็นบ้านอีกบ้านหนึ่งที่หันหลังชนกัน" +
                     " รูปทรงบ้านมีปีกทั้งสองข้าง ลักษณะคล้ายบ้านพระพิทักษ์ชินประชาส่วนที่รื้อไปก่อนแล้ว",
             "เป็นธนาคารแห่งแรกที่ตั้งขึ้นในภูมิภาคนี้ประมาณปี พ.ศ.2450 สมัยรัชกาลที่5 โดยดำริของพระยารัษฎานุประดิษฐ์ มหิศรภักดีฯ " +
                     "เจ้าเมืองภูเก็ตที่มองการณ์ไกล พัฒนาระบบเศรษฐกิจ การเงินการธนาคารของเมืองภูเก็ตสู่ระบบสากล ในการค้าขายแร่ดีบุก" +
                     " ยางพาราและสินค้าต่างๆไปยังต่างประเทศ ยังความเจริญรุ่งเรืองเกิดแก่ภูเก็ตในสมัยนั้นเป็นอย่างยิ่ง",
            "สถานีตำรวจตลาดใหญ่เป็นสถานีตำรวจแห่งแรกสร้างขึ้นเมื่อ ปี พ.ศ.2453 ตั้งอยู่ ถนนพังงาใจกลางเมืองภูเก็ต สนับสนุนการก่อสร้างโดยธนาคารชาร์เตอร์"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_place);

        placeList = (ListView)findViewById(R.id.ListView3);
        CustomAdepter3 customAdepter3 = new CustomAdepter3();
        placeList.setAdapter(customAdepter3);placeList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent Gop1 = new Intent(PagePlace.this,Thaihua.class);
                    startActivity(Gop1);
                }
                if(position == 1){
                    Intent Gop2 = new Intent(PagePlace.this,Banchinpracha.class);
                    startActivity(Gop2);
                }
                if(position == 2){
                    Intent Gop3 = new Intent(PagePlace.this,Banprapisai.class);
                    startActivity(Gop3);
                }
                if(position == 3){
                    Intent Gop4 = new Intent(PagePlace.this,Sangtam.class);
                    startActivity(Gop4);
                }
                if(position == 4){
                    Intent Gop5 = new Intent(PagePlace.this,Banprapitak.class);
                    startActivity(Gop5);
                }
                if(position == 5){
                    Intent Gop6 = new Intent(PagePlace.this,Banpraaram.class);
                    startActivity(Gop6);
                }
                if(position == 6){
                    Intent Gop7 = new Intent(PagePlace.this,Charterbank.class);
                    startActivity(Gop7);
                }
                if(position == 7){
                    Intent Gop8 = new Intent(PagePlace.this,Policebox.class);
                    startActivity(Gop8);
                }
             }
        });

    }
    class CustomAdepter3 extends BaseAdapter{


        @Override
        public int getCount() {
            return idp.length;
        }

        @Override
        public Object getItem(int i1) {
            return null;
        }

        @Override
        public long getItemId(int i1) {
            return 0;
        }

        @Override
        public View getView(int i1, View view3, ViewGroup parent) {
            view3= getLayoutInflater().inflate(R.layout.customlayout3,null);
            ImageView imageView3=(ImageView)view3.findViewById(R.id.imvPlace);
            TextView textView_name3 = (TextView)view3.findViewById(R.id.tNameP);
            TextView textView_dec3 = (TextView)view3.findViewById(R.id.dectPlace);

            imageView3.setImageResource(idp[i1]);
            textView_name3.setText(NamePlace[i1]);
            textView_dec3.setText(detailP[i1]);
            return view3;
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
                Intent Bo1 = new Intent(PagePlace.this,HomeActivity.class);
                startActivity(Bo1);
                return true;
            }

            default:  return super.onOptionsItemSelected(item);
        }

    }
}
