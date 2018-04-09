package com.qs.tm;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.qs.tm.fragment.FragmentIndex;
import com.qs.tm.fragment.FragmentMine;
import com.qs.tm.fragment.FragmentOrder;
import com.qs.tm.view.BottomBar;

/**
 * Created by fbin on 2018/4/8.
 */
public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        Intent intent = getIntent();
        if(intent != null){
            String name = intent.getStringExtra("name");
            String content = intent.getStringExtra("content");
            Toast.makeText(IndexActivity.this, name+","+content, Toast.LENGTH_SHORT).show();
        }

        BottomBar bottomBar = findViewById(R.id.bottom_bar);
        bottomBar.setContainer(R.id.fl_container)
                .setTitleBeforeAndAfterColor("#999999", "#ff5d5e")
                .addItem(FragmentIndex.class,
                        getString(R.string.fragment_index),
                        R.drawable.item1_before,
                        R.drawable.item1_after)
                .addItem(FragmentOrder.class,
                        getString(R.string.fragment_order),
                        R.drawable.item2_before,
                        R.drawable.item2_after)
                .addItem(FragmentMine.class,
                        getString(R.string.fragment_mine),
                        R.drawable.item3_before,
                        R.drawable.item3_after)
                .build();
    }
}
