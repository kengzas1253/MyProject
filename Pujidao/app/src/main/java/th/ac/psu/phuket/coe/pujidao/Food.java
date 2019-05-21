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

public class Food extends AppCompatActivity {
    ListView foodList;
    int [] Imid = {R.drawable.meehokkian,R.drawable.otao,R.drawable.meehun,R.drawable.loba,
                   R.drawable.moohong,R.drawable.kian,R.drawable.oeaw,R.drawable.bagudtea,
                   R.drawable.bobie,R.drawable.huche,R.drawable.namprikkung};
    String[] NameFood ={"หมี่ฮกเกี้ยน","โอต้าว","หมี่หุ้นป้าช่าง","โลบะ","หมูฮ้อง","เกี้ยน","โอ้เอ๋ว","บักกุ๊ดเต๋","ปอเปี้ยะสด",
                        "ฮูแช้","น้ำพริกภูเก็ต"};
    String[] Detial = {"หมี่ผัดฮกเกี้ยนจากหมี่เหลืองผัดกับหมู เปลี่ยนมาใส่ปลา กุ้ง ปลาหมึก ที่หากินได้ง่ายในแถบจังหวัดภูเก็ต",
            "ลักษณะคล้ายกับหอยทอด แต่แป้งจะมีลักษณะนุ่มกว่า ใช้หอยนางรมตัวเล็ก ผัดกับแป้ง เผือก และไข่",
            "เป็นหมี่ผัดแห้งรับประทานกับน้ำซุปกระดูกหมู ที่ได้ชื่อว่าหมี่หุ้นป้าช้างเพราะ เดิมหมี่ผัด และน้ำต้มกระดูกหมูนี้ขายโดยป้าชื่อช้าง ที่โรงหนังเฉลิมตัน(เดิม) " +
                    "ปัจจุบันคือบริเวณสี่แยกถนนเยาวราชตัดกับถนนดีบุก \"หมี่หุ้นป้าช้าง\" ถ้าอ่านแบบสำเนียงทางใต้จะออกเสียงว่า \"หมี่-หุ้น-ปา-ฉ่าง\" ",
            "เป็นเครื่องในหมูปรุงกับเครื่องพะโล้ นำมาทอดรับประทานกับเต้าหู้ทอดราดน้ำจิ้ม",
            "เป็นอาหารที่มีอยู่แพร่หลายในจังหวัดภูเก็ต จนถึง ปีนัง สิงคโปร์ จากชาวจีนฮกเกี้ยนที่อพยพมาตามเมืองเหล่านี้ ได้หอบเอาสูตรอาหารที่อร่อยๆ เข้ามาด้วย อย่าง หมูฮ้อง " +
                    "ร้านอาหารที่ภูเก็ตจะพบเจอเมนู หมูฮ้อง อยู่ทุกร้าน รสชาติก็จะอร่อยแตกต่างกันไป ",
            "ไส้กรอกหมูพะโล้ผสมกับมันแกวและเผือก ห่อฟองเต้าหู้ทอด",
    "โอ้เอ๋วเป็นอาหารท้องถิ่นของจังหวัดภูเก็ตได้จากวุ้นของเมล็ดโอ้เอ๋วซึ่งเป็นพืชจำพวกมะเดื่อชนิดหนึ่งใช้เมือกโอ้เอ้วมาผสมกับเมือกของกล้วยน้ำว้าใส่เจี่ยกอ " +
            "เพื่อให้โอ้เอ๋ว เกาะตัวเป็นก้อน นำมาใส่น้ำเชื่อมและน้ำแข็งใส กินแก้ร้อนใน และลดการกระหายน้ำ",

    "บักกุ๊ดเต๋  เป็นน้ำแกงแบบจีนที่นิยมรับประทานในมาเลเซีย สิงคโปร์ จีน ไต้หวัน หาดใหญ่และภูเก็ตในไทย ชื่อบักกุ๊ดเต๋แปลตามตัวอักษรได้ว่า \"กระดูกหมูและน้ำชา\"",

    "ปอเปี้ยะสดของเมืองภูเก็ต จะเป็นปอเปี้ยะสดตามสูตรของชาวจีนฮกเกี้ยน มีไส้เป็นมันแกวผัด ราดด้วยน้ำจิ้มรสเผ็ดนิดหน่อย ปอเปี้ยะสดแบบนี้จะมีทั่วไปที่ สิงห์โปร์ มาเลซีย ปีนัง ภูเก็ต",

    "ฮูแช้ หรือ สลัดผักสไตล์คนภูเก็ต ที่เริ่มหากินยากขึ้นทุกที ซึ่งสมัยก่อน เป็นเมนูที่นิยมทานกันในช่วงบ่าย เบาๆ กำลังดี ไม่หนักจนเกินไป",
    "น้ำพริกกุ้งสด หรือที่คนภูเก็ตเรียกว่า “น้ำชุบหยำ”  หน้าตาอาจจะคล้ายน้ำพริกกะปิ แต่จะมีความเหลวมากกว่า รสชาติเปรี้ยว เค็ม หวาน และเผ็ดขึ้นกับความชอบของผู้ทาน"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        foodList = (ListView)findViewById(R.id.ListView1);
        CustomAdapter1 customAdapter1 = new CustomAdapter1();
        foodList.setAdapter(customAdapter1);
        foodList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent Gof1 = new Intent(Food.this,Meehokkian.class);
                    startActivity(Gof1);
                }
                if(position == 1){
                    Intent Gof2 = new Intent(Food.this,Otaw.class);
                    startActivity(Gof2);
                }
                if(position == 2){
                    Intent Gof3 = new Intent(Food.this,Meehunbachang.class);
                    startActivity(Gof3);
                }
                if(position == 3){
                    Intent Gof4 = new Intent(Food.this,Loba.class);
                    startActivity(Gof4);
                }
                if(position == 4){
                    Intent Gof5 = new Intent(Food.this,Loba.class);
                    startActivity(Gof5);
                }
                if(position == 5){
                    Intent Gof6 = new Intent(Food.this,Kian.class);
                    startActivity(Gof6);
                }
                if(position == 6){
                    Intent Gof7 = new Intent(Food.this,Oeaw.class);
                    startActivity(Gof7);
                }
                if(position == 7){
                    Intent Gof8 = new Intent(Food.this,Bagudtea.class);
                    startActivity(Gof8);
                }
                if(position == 8){
                    Intent Gof9 = new Intent(Food.this,Bobiesod.class);
                    startActivity(Gof9);
                }
                if(position == 9){
                    Intent Gof10 = new Intent(Food.this,Huche.class);
                    startActivity(Gof10);
                }
                if(position == 10){
                    Intent Gof11 = new Intent(Food.this,Namprikkung.class);
                    startActivity(Gof11);
                }
            }
        });
    }
    class CustomAdapter1 extends BaseAdapter{


        @Override
        public int getCount() {
            return Imid.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i ,View view, ViewGroup viewGroup) {
            view  = getLayoutInflater().inflate(R.layout.customlayout1,null);

            ImageView imageView = (ImageView)view.findViewById(R.id.imageView1);
            TextView textView_name = (TextView)view.findViewById(R.id.Tfood);
            TextView textView_detial = (TextView)view.findViewById(R.id.tDetial1);

            imageView.setImageResource(Imid[i]);
            textView_name.setText(NameFood[i]);
            textView_detial.setText(Detial[i]);

            return view;
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
                Intent Food1 = new Intent(Food.this,HomeActivity.class);
                startActivity(Food1);
                return true;
            }

            default:  return super.onOptionsItemSelected(item);
        }

    }
}
