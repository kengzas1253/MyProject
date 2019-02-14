package th.ac.psu.phuket.coe.pujidao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Candy extends AppCompatActivity {
    ListView cList;
    int[] IMAGS={R.drawable.beakunkoy,R.drawable.bunjiankoi,R.drawable.daopao,
            R.drawable.huadkoy,R.drawable.hunkoy,R.drawable.youjakoy,
            R.drawable.knoniaw,R.drawable.kiakoy,R.drawable.kiamkoy,
            R.drawable.koytalam,R.drawable.moji,R.drawable.anggu,R.drawable.abong,
            R.drawable.bowlang,R.drawable.beaheyji,R.drawable.koshui,R.drawable.koybangka,
            R.drawable.aiwpung,R.drawable.bietaybark,R.drawable.seaguokoy,R.drawable.chaitawkoy};
    String[] NameCandy ={"แป๊ะถึ่งโก้ย","บั้นเจียนโก้ย","ต๋าวป่าวโก้ย","ฮวดโก้ย","หุนโก้ย"
            ,"เจี๊ยะโก้ย","ข้าวเหนียวหีบ","กีอาโก้ย","เกี่ยมโก้ย","โก้ยตาล้าม","มอจี๋","อังกู๊","อาโป๊ง"
            ,"ป่าวหล้าง","เบเฮ่จี่","โกสุ้ย","โก้ยเบ่งก๊า","อิ่วปึ่ง","บี้ถ่ายบาก","ซีกั๊วโก้ย","ฉ้ายถาวโก้ย"};
    String[] Dec ={"แปะถึ่งโก้ยคล้ายๆขนมถ้วยฟูหรือขนมน้ำตาลทรายขาวเป็นขนมที่หาทานยาก ตัวขนมสีขาวๆเนื้อฟูด้วยหน้าจะมีสีแดง",
            "บั้นเจียนโก้ย เป็นขนมที่มีลักษณะคล้ายๆ ขนมถังแตกตัวขนมเป็นเหมือนฟองน้ำ มีฟองน้ำอากาศพรุนเป็นรูๆ มีไส้ถั่วผสมน้ำตาล" +
                    "  รสชาสติหวานๆ",
            "ต๋าวป๋าวอ๊ะโก้ยหรือขนมหัวล้านคล้ายขนมต้มด้านฝนเป็นไส้ถั่วเขียวกวนเนื้อขนมหนึบหนับๆเคี้ยวเพลิน",
            "ฮวดโก้ยหรือขนมถ้วยฟูเนื้อขนมทำมาจากแป้งข้าวเจ้าน้ำตาลทราย ยีสต์ ผงฟู และเติมสีผสมอาหารลงไปเพื่อเพิ่มสีสัน",
            "หุนโก้ยเป็นขนมทำจากแป้งไส้ด้านในถั่วกวนด้านในมีไส้ผัดมะพร้าวและถั่วเป็นขนมที่หาทานยากไม่ค่อยทำขายแล้ว",
            "เจี๊ยะโก้ยหรือที่รู้จักกันว่าปาท่องโก๋ก็คือชนิดเดียวกันแต่เรียกคนละชื่อ เจี๊ยดก้ยขายเป็นคู่ๆตัวใหญ่ๆทานกับขนมข้น สังขยา",
            "ข้าวเหนียวหีบหรือข้าวเหนียวอัดเป็นข้าวเหนียวมูนสีม่วงอัดจนแน่น สีม่วงมาจากน้ำอัญชันทำให้สีสันของข้าวเหนียวหีบมีสีม่วงมาคู่กับสังขยาใบเตย",
            "อีกาโก้ยหรือเรียกกันสั้นๆว่ากีโก้ยเป็นขนมที่ทำมาจากแป้งผสมถั่วเหลือและน้ำด่างตัวขนมมีความนุ่มละยืดหยุ่นมาก ๆมาพร้อมน้ำเชื่อมสีน้ำตาล",
            "เกี่ยมโก้ยเป็นขนมถ้วยสีขาวๆตัวขนมมีความหนึบหนับของแป้งสีขาวนึ่งเพิ่มรสชาติด้วยการโรยหน้าด้วยกุ้งแห้งทอดบดหอมเจียวและต้นหอมซอย",
            "โก้ยตาล้ามเป็นขนมสีเขียวเนื้อนิ่มๆ คล้ายๆตะโก้ใบเตย ด้านบนจะเป็นกะทิสีขาว",
            "มอจี๋ คือ ขนมที่ใช้แป้งข้าวเหนียวปั้นเป็นก้อนกลมๆนิ่มๆหนุ่ยๆ ด้านนอกตัวขนมโรยด้วยแป้งขาวๆไส้ด้านในเป็นถั่วลิสงบดหยาบๆ คลุกกับน้ำตาลทราย",
            "ขนมอังกู๊หรือขนมเต่าเป็นขนมมงคลที่คนภูเก็ตเชื้อสายจีนนำมาใช้ประกอบพิธีบวงสวงเทพเจ้า พิธีไหว้บรรพุบุรุษต่างๆ ",
            "อาโป๊งหรืออาโป้งเป็นขนมพื้นเมืองเลื่องชื่อของจังหวัดภูเก็ตมีหน้าตาคล้ายขนมถังแตกทำจากแป้งข้าวเจ้าน้ำตาลทราย ไข่ไก่ เอาแต่ไข่แดง น้ำ น้ำกะทิ และยีสต์",

             "ป่าวหล้างเป็นข้าวเหนียวปิ้งไส้มะพร้าวผสมกับกุ้งแห้งป่น และพริกไทย ห่อด้วยใบตอง ม้วนเป็นแท่ง แล้วใช้ไม้กลัดทั้งหัวและท้าย",

             "เบเฮ่จี่หรือเรียกอีกชื่อว่าขนมสี่ขาลักษณะคล้ายๆปาท่องโก๋แต่ตัวแป้งจะถูกบิดให้เป็นเกลียวมีลักษณะเป็นสี่ขาและที่ต่างไปจากปาท่องโก๋คือที่ตัวแป้งจะมีเกร็ดน้ำตาล",

             "โกสุ้ยเป็นขนมถ้วยอีกชนิดหนึ่ง ตัวขนมมีสีน้ำตาล ทำจากแป้งข้าวเจ้า แป้งมัน น้ำด่าง และน้ำตาลทรายแดง ",

              "โก้ยเบ่งก๊าคือขนมที่ทำจากหัวมันสำปะหลังสีเหลืองผสมกับมะพร้าวและน้ำตาลที่กวนจนเนียนเข้ากันเป็นเนื้อเดียวกันแล้วค่อยนำไปอบอีก",

              "อิ่วปึ่งคือข้าวเหนียวผัดกับกุ้งแห้ง ปรุงรสด้วยซีอิ้วขาวและดำ โรยหน้าด้วยหมูแดงและหอมเจียว มีไข่ต้มเป็นเครื่องเคียง",

              "บี้ถ่ายบากหรือลอดช่องสิงคโปร์ ถือเป็นขนมหวานพื้นเมืองภูเก็ตที่หาทานยาก มีตัวแป้งเส้นสีขาวและแดงสั้นๆ คล้ายกับเส้นขนมจีน แต่เส้นจะสั้นและเนื้อแน่นกว่า มาพร้อมน้ำเชื่อม หอมกลิ่นใบเตยอ่อนๆ",

               "ซีกั๊วโก้ย เป็นขนมคล้ายกับฟองน้ำสีเหลือง ทำมาจากแป้งข้าวจ้าวและน้ำตาล ส่วนสีเขียวแป้งกวนใบเตยคล้ายๆ กับสังขยา ",

               "ฉ้ายถาวโก้ย คือ ขนมหัวไชเท้า หรือขนมที่ทำมากจากหัวไชเท้า ผสมกับแป้งข้าวจ้าวนึ่งจนสุก ทานได้ทั้งแบบนึ่ง และแบบทอด"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candy);


        cList = (ListView)findViewById(R.id.ListView2);
        CustomAdepter2 customAdepter2 = new CustomAdepter2();
        cList.setAdapter(customAdepter2);
    }
    class CustomAdepter2 extends BaseAdapter{


        @Override
        public int getCount() {
            return IMAGS.length;
        }

        @Override
        public Object getItem(int j) {
            return null;
        }

        @Override
        public long getItemId(int j) {
            return 0;
        }

        @Override
        public View getView(int j, View view2, ViewGroup viewGroup) {
            view2 = getLayoutInflater().inflate(R.layout.customlayout2,null);

            ImageView imageView2=(ImageView)view2.findViewById(R.id.imageView2);
            TextView textView_name2 = (TextView)view2.findViewById(R.id.textCandy);
            TextView textView_dec = (TextView)view2.findViewById(R.id.textDetial2);

            imageView2.setImageResource(IMAGS[j]);
            textView_name2.setText(NameCandy[j]);
            textView_dec.setText(Dec[j]);
            return view2;
        }
    }
}
