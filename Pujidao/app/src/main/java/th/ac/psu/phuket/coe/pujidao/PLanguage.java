package th.ac.psu.phuket.coe.pujidao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class PLanguage extends AppCompatActivity {
    ListView hList;
    ArrayList<String> listItems;
    ArrayAdapter<String> adapter;
    EditText sEtext;
    String[] hword={"1.阿爹 อาเตี่ย   พ่อ",
                    "2.阿娘 อามะ   แม่",
                    "3.內公 หล่ายก้อง ปู่",
                    "4.外公 หวั่นก้อง ตา",
                    "5.阿妗 อากิ่ม  ป้าสะใภ้",
                    "6.囝孫 เกี๊ยซู้น  ลูกหลาน",
                    "7.阿哥 อาโก๊   พี่ชาย",
                    "8.阿兄 อาเฮีย พี่ชายคำสุภาพ",
                    "9.大哥 ตัวโก้ พี่ชายคนโต",
                    "10.阿姊 อาจี้ พี่สาว",
                    "11.大姊 ตัวจี้ พี่สาวคนโต",
                    "12.阿爸 อาป๊า พ่อ",
                    "13.阿妈 อาม่า ย่าหรือยาย",
                    "14.阿姨  อาอี๋ น้าสาว",
                    "15.阿弟 อาตี่ น้องชาย",
                    "16.阿妹  อาหม่อย น้องสาว",
                    "17.阿伯 อาแปะ พี่ชายของพ่อ",
                    "18.契囝 เข็วเกี้ย  ลูกเลี้ยง",
                    "19.阿祖 อาจ้อ ทวด",
                    "20.阿姑  อาก๊อ น้องสาวของพ่อ",
                    "จบ"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planguage);
        hList = (ListView)findViewById(R.id.ListView4);
        sEtext = (EditText) findViewById(R.id.txtsearch);
        initList();
        sEtext.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                 if (s.toString().equals("")){
                     //reset listview
                     initList();
                 }
                 else {
                  //perform search
                     searchItem(s.toString());

                 }
            }

            @Override
            public void afterTextChanged(Editable s) {
              // perform search

            }
        });

        }
        public void searchItem(String textToSearch) {
           for (String hword1:hword){
               if (!hword1.contains(textToSearch)){
                   listItems.remove(hword1);
               }
           }
           adapter.notifyDataSetChanged();
        }
    public void initList(){

        listItems = new ArrayList<>(Arrays.asList(hword));
        adapter = new ArrayAdapter<String>(this,R.layout.customlayout4,R.id.textlang,listItems);
        hList.setAdapter(adapter);
    }

    }



