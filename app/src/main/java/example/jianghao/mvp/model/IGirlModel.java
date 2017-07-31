package example.jianghao.mvp.model;

import java.util.List;

import example.jianghao.mvp.bean.GirlBean;

/**
 * Created by jianghao on 2017/7/29.
 */

public interface IGirlModel {

    /**
     * 用来加载数据
     */
    void loadGirl(OnLoadListener listener);

    /**
     * 加载完成的监听
     */
    interface OnLoadListener {
        void onComplete(List<GirlBean> girls);
    }

    void run(OnRunListener listener);

    interface OnRunListener{
        void onComplete(int count);
    }
}
