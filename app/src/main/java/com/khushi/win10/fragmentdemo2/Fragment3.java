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

public class Fragment3 extends Fragment  {
    private Button btnGoToBack;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.f3,container,false );

        btnGoToBack=(Button)view.findViewById(R.id.btnGoToBack);
        btnGoToBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();
            }
        });
        return view ;

    }
}
