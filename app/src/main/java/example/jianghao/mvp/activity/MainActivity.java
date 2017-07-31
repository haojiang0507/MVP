package example.jianghao.mvp.activity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import example.jianghao.mvp.R;
import example.jianghao.mvp.adapter.GirlAdapter;
import example.jianghao.mvp.base.MVPBaseActivity;
import example.jianghao.mvp.bean.GirlBean;
import example.jianghao.mvp.presenter.GirlPresenterV1;
import example.jianghao.mvp.view.IGirlView;

public class MainActivity extends MVPBaseActivity<IGirlView, GirlPresenterV1> implements IGirlView {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.lv);

        //中间者 触发加载数据
//       new GirlPresenterV1(this).fetch();
//        new GirlPresenterV2(this).fetch();

        mPresenter.fetch();
        mPresenter.run();
    }

    @Override
    protected GirlPresenterV1 createPresenter() {
        return new GirlPresenterV1();
    }

    @Override
    public void showLoading() {
        Toast.makeText(this, "正在加载......", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showGirls(List<GirlBean> girls) {
        Toast.makeText(this, "showGirls......", Toast.LENGTH_SHORT).show();
        listView.setAdapter(new GirlAdapter(this, girls));
    }

    @Override
    public void calculator(int count) {
        Toast.makeText(this, " " + count, Toast.LENGTH_SHORT).show();
    }
}
