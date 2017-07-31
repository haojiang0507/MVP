package example.jianghao.mvp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import example.jianghao.mvp.R;

/**
 * Created by jianghao on 2017/7/30.
 */

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        startActivity(new Intent(this, MainActivity.class));
    }
}
