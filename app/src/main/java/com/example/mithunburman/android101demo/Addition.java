package com.example.mithunburman.android101demo;

/**
 * Created by Mithun Burman on 04-09-2017.
 */


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Addition extends Fragment {


        EditText edtNum;
        Button click;
        TextView txtView;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.activity_main, container, false);
            edtNum = (EditText) view.findViewById(R.id.fragmentdemo);

            click = (Button) view.findViewById(R.id.demoButton);
            txtView = (TextView) view.findViewById(R.id.textV);

            click.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // in here getting String for edtNum
                    String enter=edtNum.getText().toString();
                    //setting the text
                    txtView.setText(enter);
                    Toast.makeText(getActivity(),"Swing In Text",Toast.LENGTH_SHORT).show();
                }
            });
            return view;

        }

    }

