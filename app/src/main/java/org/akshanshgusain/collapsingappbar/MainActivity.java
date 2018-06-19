package org.akshanshgusain.collapsingappbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
     private RecyclerView mRecyclerView;
     private Adapter mAdapter;
     private RecyclerView.LayoutManager mLayoutManager;
     private List<String> mArrayList=new ArrayList<>();
     private Toolbar mToolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar=(Toolbar)findViewById(R.id.myToolbar);
        setSupportActionBar(mToolbar);
        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        mLayoutManager = new GridLayoutManager(this, 2);
        initArrayList();
       mRecyclerView.setLayoutManager(mLayoutManager);
       mAdapter= new Adapter(this, mArrayList);
       mRecyclerView.setAdapter(mAdapter);


    }

    private void initArrayList() {
        for (int i=0; i<20;i++){
                 if(i%2== 0) {
                     mArrayList.add("1");
                 }
                 else{
                     mArrayList.add("0");
                 }
        }

    }
}
