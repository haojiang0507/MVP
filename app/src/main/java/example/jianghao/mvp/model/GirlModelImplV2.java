package example.jianghao.mvp.model;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import example.jianghao.mvp.R;
import example.jianghao.mvp.bean.GirlBean;

/**
 * girl model implementation v2.
 * Created by jianghao on 2017/7/29.
 */

public class GirlModelImplV2 implements IGirlModel {

    @Override
    public void loadGirl(OnLoadListener listener) {
        //模拟从网络加载
        Log.d("mvp", "load from internet");

        List<GirlBean> data = new ArrayList<>();
        data.add(new GirlBean(R.mipmap.girl_1, "美女一号", "这是第一个美女--这是第一个美女--这是第一个美女"));
        data.add(new GirlBean(R.mipmap.girl_2, "美女二号", "这是第二个美女--这是第二个美女--这是第二个美女"));
        data.add(new GirlBean(R.mipmap.girl_3, "美女三号", "这是第三个美女--这是第三个美女--这是第三个美女"));
        data.add(new GirlBean(R.mipmap.girl_1, "美女一号", "这是第一个美女--这是第一个美女--这是第一个美女"));
        data.add(new GirlBean(R.mipmap.girl_2, "美女二号", "这是第二个美女--这是第二个美女--这是第二个美女"));
        data.add(new GirlBean(R.mipmap.girl_3, "美女三号", "这是第三个美女--这是第三个美女--这是第三个美女"));
        data.add(new GirlBean(R.mipmap.girl_1, "美女一号", "这是第一个美女--这是第一个美女--这是第一个美女"));
        data.add(new GirlBean(R.mipmap.girl_2, "美女二号", "这是第二个美女--这是第二个美女--这是第二个美女"));
        data.add(new GirlBean(R.mipmap.girl_3, "美女三号", "这是第三个美女--这是第三个美女--这是第三个美女"));

        listener.onComplete(data);
    }

    @Override
    public void run(OnRunListener listener) {

    }
}
