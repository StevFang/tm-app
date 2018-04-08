package com.qs.tm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

/**
 * 主画面
 */
public class MainActivity extends AppCompatActivity {

    private Button loginButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginButton = findViewById(R.id.next_button);
        loginButton.setOnClickListener(new NextButtonClickListener());
    }

    private class NextButtonClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            //Toast.makeText(MainActivity.this,R.string.text_value,Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, IndexActivity.class);
            intent.putExtra("name", "斌斌");
            intent.putExtra("content", "你好");
            startActivity(intent);
        }
    }
}
