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

public class Fragment2 extends Fragment  {
    private Button btnGoToOrenge;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.f2,container,false );

        btnGoToOrenge=(Button)view.findViewById(R.id.btnGoToOrenge );
        btnGoToOrenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment3 f3=new Fragment3();
                getFragmentManager().beginTransaction() .replace(R.id.l1,f3).addToBackStack("").commit();

               // getFragmentManager().popBackStack();
            }
        });
        return view ;

    }
}
