package example.jianghao.mvp.model;

import android.os.Handler;
import android.os.Message;

import java.util.ArrayList;
import java.util.List;

import example.jianghao.mvp.R;
import example.jianghao.mvp.bean.GirlBean;

/**
 * girl model implementation v1.
 * Created by jianghao on 2017/7/29.
 */

public class GirlModelImplV1 implements IGirlModel {

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };

    @Override
    public void loadGirl(final OnLoadListener listener) {
        final List<GirlBean> data = new ArrayList<GirlBean>();
        data.add(new GirlBean(R.mipmap.girl_1, "美女一号", "这是第一个美女--这是第一个美女--这是第一个美女"));
        data.add(new GirlBean(R.mipmap.girl_2, "美女二号", "这是第二个美女--这是第二个美女--这是第二个美女"));
        data.add(new GirlBean(R.mipmap.girl_3, "美女三号", "这是第三个美女--这是第三个美女--这是第三个美女"));
        data.add(new GirlBean(R.mipmap.girl_1, "美女一号", "这是第一个美女--这是第一个美女--这是第一个美女"));
        data.add(new GirlBean(R.mipmap.girl_2, "美女二号", "这是第二个美女--这是第二个美女--这是第二个美女"));
        data.add(new GirlBean(R.mipmap.girl_3, "美女三号", "这是第三个美女--这是第三个美女--这是第三个美女"));
        data.add(new GirlBean(R.mipmap.girl_1, "美女一号", "这是第一个美女--这是第一个美女--这是第一个美女"));
        data.add(new GirlBean(R.mipmap.girl_2, "美女二号", "这是第二个美女--这是第二个美女--这是第二个美女"));
        data.add(new GirlBean(R.mipmap.girl_3, "美女三号", "这是第三个美女--这是第三个美女--这是第三个美女"));

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onComplete(data);
            }
        }, 10000);
    }

    @Override
    public void run(OnRunListener listener) {
        listener.onComplete(12 + 13);
    }
}
