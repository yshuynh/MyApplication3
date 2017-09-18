package com.example.huynh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//public class CustomListItemAdapter extends ArrayAdapter<String>{
//        private LayoutInflater mLayoutInflater;
//
//        }



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("yclc", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ArrayList<String> list = new ArrayList<String>();
//        for (int i=0;i<=20;i++) {
//            list.add("hoge" + i);
//        }
//        ListView listView = (ListView) findViewById(R.id.ListView);
//        CustomListItemAdapter adapter = new CustomListItemAdapter(this,list);
//        listView.setAdapter(adapter);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("yclc", "onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("yclc", "onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("yclc", "onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("yclc", "onStop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("yclc", "onDestroy");

    }
}
