package com.example.administrator.yuanxingtu;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.widget.RadioGroup;

public class MainActivity extends FragmentActivity {


    private RadioGroup radioGroup;
    private Fragment1 fragment1;
    private Fragment2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获得资源ID
        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);

        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        //将所有的Fragment加载进来

        getSupportFragmentManager().beginTransaction().add(R.id.frameee, fragment2).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.frameee, fragment1).commit();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub

                switch (checkedId) {
                    case R.id.but1:
                        getSupportFragmentManager().beginTransaction().show(fragment1).hide(fragment2).commit();
                        break;
                    case R.id.but2:
                        getSupportFragmentManager().beginTransaction().show(fragment2).hide(fragment1).commit();

                        Log.i("TAG", "222");
                        break;

                    default:
                        break;
                }


            }
        });


    }


}