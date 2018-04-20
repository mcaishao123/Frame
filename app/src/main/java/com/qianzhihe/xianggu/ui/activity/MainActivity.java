package com.qianzhihe.xianggu.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.orhanobut.logger.Logger;
import com.qianzhihe.provider.router.RouterPath;
import com.qianzhihe.xianggu.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.sample_text)
    TextView sampleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ARouter.getInstance().build(RouterPath.LOGIN_PATH).navigation();

    }

    @OnClick(R.id.fab)
    public void onViewClicked() {
        Logger.d("hello");
        ARouter.getInstance().build(RouterPath.LOGIN_PATH).navigation();
    }
}
