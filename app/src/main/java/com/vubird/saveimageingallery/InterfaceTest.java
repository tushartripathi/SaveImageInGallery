package com.vubird.saveimageingallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class InterfaceTest extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interface_test);

        btn = findViewById(R.id.button);
        final Boxer boxer = new Boxer();

        KickBoxer kickBoxer = new KickBoxer();
        Toast.makeText(InterfaceTest.this,kickBoxer.throwJab(),Toast.LENGTH_SHORT).show();


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(InterfaceTest.this,boxer.throwJab(),Toast.LENGTH_SHORT).show();


            }
        });

    }


}
