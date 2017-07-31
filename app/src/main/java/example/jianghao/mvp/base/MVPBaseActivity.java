package example.jianghao.mvp.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * MVP基类Activity
 * Created by jianghao on 2017/7/29.
 */

public abstract class MVPBaseActivity<V, T extends BasePresent<V>> extends AppCompatActivity {

    protected T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //创建Presenter
        mPresenter = createPresenter();
        //内存泄漏
        //关联View
        mPresenter.attachView((V) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //解除关联
        mPresenter.detachView();
    }

    protected abstract T createPresenter();
}
