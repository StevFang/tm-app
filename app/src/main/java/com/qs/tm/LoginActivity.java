package com.qs.tm;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 登录页
 *
 * Created by fbin on 2018/4/9.
 */
public class LoginActivity extends AppCompatActivity {

    private EditText accountEditText;//账号输入框
    private EditText passwordEditText;//密码输入框
    private Button loginButton;//登录按钮

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 登录页设置
        getSupportActionBar().hide();//隐藏Action Bar
        setContentView(R.layout.login);

        accountEditText = findViewById(R.id.accountEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);
        // 登录操作
        loginButton.setOnClickListener(new LoginButtonClickListener());
    }

    /**
     * 登录按钮点击监听实现内部类
     */
    private class LoginButtonClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            String account = accountEditText.getText().toString();
            String password = passwordEditText.getText().toString();
            if("admin".equals(account) && "123456".equals(password)){
                Intent intent = new Intent(LoginActivity.this, IndexActivity.class);
                intent.putExtra("loginUser", account);
                startActivity(intent);
                LoginActivity.this.finish();
            }else{
                Toast.makeText(LoginActivity.this, R.string.login_failed, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
