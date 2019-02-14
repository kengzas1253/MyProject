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

public class Bunte_name extends AppCompatActivity {
    ListView hnList;
    ArrayList<String> listItems2;
    ArrayAdapter<String> adapter2;
    EditText sEtext2;
    String[] hnword={"1.我 หว้า   ฉัน",
            "2.汝 ลู่   เธอ",
            "3.伊 อี เขา",
            "4.我儂 หว้าหลัง พวกฉัน",
            "5.汝儂  ลู่หลัง  พวกเธอ",
            "6.伊儂 อีหลัง  พวกเขา",
            "7.查某伊 จาบ้ออี  เขา(ผู้หญิง)",
            "8.查埔伊 จาป่อ เขา(ผู้ชาย)",
            "จบ"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bunte_name);
        hnList = (ListView)findViewById(R.id.LtPname);
        sEtext2 = (EditText) findViewById(R.id.bnnsearch);
        initList();
        sEtext2.addTextChangedListener(new TextWatcher() {
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
        for (String hword1:hnword){
            if (!hword1.contains(textToSearch)){
                listItems2.remove(hword1);
            }
        }
        adapter2.notifyDataSetChanged();
    }
    public void initList(){

        listItems2 = new ArrayList<>(Arrays.asList(hnword));
        adapter2 = new ArrayAdapter<String>(this,R.layout.customlayout4,R.id.textlang,listItems2);
        hnList.setAdapter(adapter2);

    }
}
