package th.ac.psu.phuket.coe.pujidao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Dictionary extends AppCompatActivity {
    ListView hdList;
    ArrayList<String> listItems5;
    ArrayAdapter<String> adapter5;
    EditText sEtext5;
    String[] hdword={"阿爹 อาเตี่ย   พ่อ",
            "阿娘 อามะ   แม่",
            "內公 หล่ายก้อง ปู่",
            "外公 หวั่นก้อง ตา",
            "阿妗 อากิ่ม  ป้าสะใภ้",
            "囝孫 เกี๊ยซู้น  ลูกหลาน",
            "阿哥 อาโก๊   พี่ชาย",
            "阿兄 อาเฮีย พี่ชายคำสุภาพ",
            "大哥 ตัวโก้ พี่ชายคนโต",
            "阿姊 อาจี้ พี่สาว",
            "大姊 ตัวจี้ พี่สาวคนโต",
            "阿爸 อาป๊า พ่อ",
            "阿妈 อาม่า ย่าหรือยาย",
            "阿姨  อาอี๋ น้าสาว",
            "阿弟 อาตี่ น้องชาย",
            "阿妹  อาหม่อย น้องสาว",
            "阿伯 อาแปะ พี่ชายของพ่อ",
            "契囝 เข็วเกี้ย  ลูกเลี้ยง",
            "阿祖 อาจ้อ ทวด",
            "阿姑  อาก๊อ น้องสาวของพ่อ",
            "弓蕉  กินเจ๋ว   กล้วยหอม",
            "米蕉  บี่เจ๋ว   กล้วยข้าว",
            "蘋果  เป๋งโก่ แอปเปิล",
            "西瓜  ซีกั้ว แตงโม",
            "塗豆  ถ่อต่าว  ถั่วลิสง",
            "榴莲  ถ่อเหลียน  ทุเรียน",
            "木瓜  บกกั้ว  มะละกอ",
            "葡萄  โป่โต๋ องุ่น",
            "我 หว้า   ฉัน",
            "汝 ลู่   เธอ",
            "伊 อี เขา",
            "我儂 หว้าหลัง พวกฉัน",
            "汝儂  ลู่หลัง  พวกเธอ",
            "伊儂 อีหลัง  พวกเขา",
            "查某伊 จาบ้ออี  เขา(ผู้หญิง)",
            "查埔伊 จาป่อ เขา(ผู้ชาย)",
            "路   โล้ว   ถนน",
            "醫生館  อี่เส่งก้วน   โรงพยาบาล",
            "客棧  แคะจ่าน  โรงแรม",
            "庵  อ๊าม  ศาลเจ้า",
            "店厝  เตี่ยมฉู่  อาคารพาณิชย์",
            "紅毛樓  อังหม้อหล่าว   คฤหาส",
            "銀行  กิ่นฮัง   ธนาคาร",
            "廚房  ตูปั๋ง  ห้องครัว",
            "จบ"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dictionary);
        hdList = (ListView)findViewById(R.id.ListDic);
        sEtext5 = (EditText) findViewById(R.id.txSdic);
        initList1();
        sEtext5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().equals("")){
                    //reset listview
                    initList1();
                }
                else {
                    //perform search
                    searchItem1(s.toString());

                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                // perform search

            }
        });
    }
    public void searchItem1(String textToSearch){
        for (String hdword1:hdword){
            if (!hdword1.contains(textToSearch)){
                listItems5.remove(hdword1);
            }
        }
        adapter5.notifyDataSetChanged();
    }
    public void initList1(){
        listItems5 = new ArrayList<>(Arrays.asList(hdword));
        adapter5 = new ArrayAdapter<String>(this,R.layout.customlayout4,R.id.textlang,listItems5);
        hdList.setAdapter(adapter5);
    }

}
