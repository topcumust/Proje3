package com.example.mustafatopcu.proje3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Process.*;

public class ekran2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ekran2);


        final TextView out= (TextView) findViewById(R.id.cikti);
        Bundle veriler=getIntent().getExtras();
        String nameveri=veriler.getString("nameveri");
        out.setText(nameveri);

        final Button basadon =(Button) findViewById(R.id.button2);
        final Button exit =(Button) findViewById(R.id.button3);

        final Intent intent= new Intent("com.example.mustafatopcu.proje3.MAIN");

        final Intent intent2 = new Intent(Intent.ACTION_MAIN);


        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent2.putExtra("EXIT", true);
                intent2.addCategory(Intent.CATEGORY_HOME);
                startActivity(intent2);
            }
        });

        basadon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeintent = new Intent(ekran2.this,MainActivity.class);
                startActivity(homeintent);
                ekran2.this.finish();
            }
        });
    }

}
