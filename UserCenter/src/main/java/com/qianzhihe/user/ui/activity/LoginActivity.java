package com.qianzhihe.user.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.qianzhihe.provider.router.RouterPath;
import com.qianzhihe.user.R;

@Route(path = RouterPath.LOGIN_PATH)
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

}
