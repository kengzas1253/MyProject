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

public class Bunte_fruit extends AppCompatActivity {
    ListView hfList;
    ArrayList<String> listItems3;
    ArrayAdapter<String> adapter3;
    EditText sEtext3;
    String[] hfword={"1.弓蕉  กินเจ๋ว   กล้วยหอม",
            "2.米蕉  บี่เจ๋ว   กล้วยข้าว",
            "3.蘋果  เป๋งโก่ แอปเปิล",
            "4.西瓜  ซีกั้ว แตงโม",
            "5.塗豆  ถ่อต่าว  ถั่วลิสง",
            "6.榴莲  ถ่อเหลียน  ทุเรียน",
            "7.木瓜  บกกั้ว  มะละกอ",
            "8.葡萄  โป่โต๋ องุ่น",
            "จบ"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bunte_fruit);
        hfList = (ListView)findViewById(R.id.Lhfruit);
        sEtext3  = (EditText) findViewById(R.id.bnFsearch);
        initList();
        sEtext3.addTextChangedListener(new TextWatcher() {
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
        for (String hword1:hfword){
            if (!hword1.contains(textToSearch)){
                listItems3.remove(hword1);
            }
        }
        adapter3.notifyDataSetChanged();
    }
    public void initList(){

        listItems3 = new ArrayList<>(Arrays.asList(hfword));
        adapter3 = new ArrayAdapter<String>(this,R.layout.customlayout4,R.id.textlang,listItems3);
        hfList.setAdapter(adapter3);
    }

}
