package com.qs.tm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * 主画面
 */
public class MainActivity extends AppCompatActivity {

    private Button loginButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new LoginButtonClickListener());
    }

    private class LoginButtonClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,R.string.text_value,Toast.LENGTH_SHORT).show();
        }
    }
}
