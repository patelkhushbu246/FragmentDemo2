package com.khushi.win10.fragmentdemo2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Win10 on 01-02-2017.
 */

public class Fragment1 extends Fragment {
    private Button btnGoToPink;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
     {
        View view=inflater.inflate(R.layout.f1,container,false );

        btnGoToPink=(Button)view.findViewById(R.id .btnGoToPink);
         btnGoToPink.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                Fragment2 f2=new Fragment2();
                 getFragmentManager().beginTransaction() .replace(R.id.l1,f2).addToBackStack("").commit();
                // getFragmentManager().popBackStack();
             }
         });
         return view;
    }
}
