package com.example.mustafatopcu.proje3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name= (EditText) findViewById(R.id.editText);
        final EditText surname= (EditText) findViewById(R.id.editText2);

        final Bundle bundle= new Bundle();

        final Intent intent = new Intent("com.example.mustafatopcu.proje3.EKRANIKI");

        Button button =(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String veri=name.getText().toString()+" "+surname.getText().toString();
                bundle.putString("nameveri",veri);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }


}
