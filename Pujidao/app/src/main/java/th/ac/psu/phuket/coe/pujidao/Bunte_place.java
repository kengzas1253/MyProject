package th.ac.psu.phuket.coe.pujidao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Bunte_place extends AppCompatActivity {
    ListView hkpList;
    ArrayList<String> listItems4;
    ArrayAdapter<String> adapter4;
    EditText sEtext4;
    String[] hkpword={"1.路   โล้ว   ถนน",
            "2.醫生館  อี่เส่งก้วน   โรงพยาบาล",
            "3.客棧  แคะจ่าน  โรงแรม",
            "4.庵  อ๊าม  ศาลเจ้า",
            "5.店厝  เตี่ยมฉู่  อาคารพาณิชย์",
            "6.紅毛樓  อังหม้อหล่าว   คฤหาส",
            "7.銀行  กิ่นฮัง   ธนาคาร",
            "8.廚房  ตูปั๋ง  ห้องครัว",
            "จบ"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bunte_place);
        hkpList = (ListView)findViewById(R.id.LhPlace);
        sEtext4  = (EditText) findViewById(R.id.hkpSearch);
        initList();
        sEtext4.addTextChangedListener(new TextWatcher() {
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
        for (String hword1:hkpword){
            if (!hword1.contains(textToSearch)){
                listItems4.remove(hword1);
            }
        }
        adapter4.notifyDataSetChanged();
    }
    public void initList(){

        listItems4 = new ArrayList<>(Arrays.asList(hkpword));
        adapter4 = new ArrayAdapter<String>(this,R.layout.customlayout4,R.id.textlang,listItems4);
        hkpList.setAdapter(adapter4);
    }
}
