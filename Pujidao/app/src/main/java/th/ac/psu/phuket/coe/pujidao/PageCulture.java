package th.ac.psu.phuket.coe.pujidao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PageCulture extends AppCompatActivity {
    ImageButton cul1,cul2,cul3,cul4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_culture);
        cul1 = (ImageButton) findViewById(R.id.imcl2);
        cul1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CUL1 = new Intent(PageCulture.this,NewBunte.class);
                startActivity(CUL1);
            }
        });
        cul2 = (ImageButton) findViewById(R.id.imcul1);
        cul2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CUL2 = new Intent(PageCulture.this,C_Culture.class);
                startActivity(CUL2);
            }
        });
        cul3 = (ImageButton) findViewById(R.id.imcul3);
        cul3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CUL3 = new Intent(PageCulture.this,PagePeople.class);
                startActivity(CUL3);
            }
        });
        cul4 = (ImageButton) findViewById(R.id.imcul4);
        cul4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CUL2 = new Intent(PageCulture.this,PageOldpicture.class);
                startActivity(CUL2);
            }
        });
    }
}
