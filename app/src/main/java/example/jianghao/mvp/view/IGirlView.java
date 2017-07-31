package example.jianghao.mvp.view;

import java.util.List;

import example.jianghao.mvp.bean.GirlBean;

/**
 * Created by jianghao on 2017/7/29.
 */

public interface IGirlView {

    /**
     * 加载进度
     */
    void showLoading();

    /**
     * 显示数据
     * @param girls
     */
    void showGirls(List<GirlBean> girls);

    void calculator(int count);
}
