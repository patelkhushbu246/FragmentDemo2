package com.khushi.win10.fragmentdemo2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout l1;
    private Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l1=(LinearLayout )findViewById(R.id.l1 );
        btn1=(Button )findViewById(R.id.btn1 );
        btn2=(Button )findViewById(R.id.btn2 );
        btn3=(Button )findViewById(R.id.btn3 );

        btn1 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment1 f1=new Fragment1() ;
                FragmentManager fm=getSupportFragmentManager() ;
                FragmentTransaction ft=fm.beginTransaction() ;
                ft.replace(R.id.l1,f1);
                ft.addToBackStack("");
                ft.commit();
            }
        }) ;

        btn2 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2 f2=new Fragment2() ;
                FragmentManager fm=getSupportFragmentManager() ;
                FragmentTransaction ft=fm.beginTransaction() ;
                ft.replace(R.id.l1,f2);
                ft.addToBackStack("");
                ft.commit();
            }
        }) ;

        btn3 .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment3 f3=new Fragment3() ;
                FragmentManager fm=getSupportFragmentManager() ;
                FragmentTransaction ft=fm.beginTransaction() ;
                ft.replace(R.id.l1,f3);
                ft.addToBackStack("");
                ft.commit();
            }
        }) ;
    }
}
