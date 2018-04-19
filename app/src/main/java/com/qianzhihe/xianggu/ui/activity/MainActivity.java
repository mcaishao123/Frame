package com.qianzhihe.xianggu.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;
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
        Log.e("MainActivity", "onCreate: ");
        sampleText.setText("Ivan");
    }

    @OnClick(R.id.fab)
    public void onViewClicked() {
        Log.e("MainActivity", "onViewClicked: ");
        ARouter.getInstance().build(RouterPath.LOGIN_PATH).navigation();
    }
}
