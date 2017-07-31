package example.jianghao.mvp.presenter;

import java.util.List;

import example.jianghao.mvp.bean.GirlBean;
import example.jianghao.mvp.model.GirlModelImplV2;
import example.jianghao.mvp.model.IGirlModel;
import example.jianghao.mvp.view.IGirlView;

/**
 * girl presenter
 * 绑定View 和 Model
 * Created by jianghao on 2017/7/29.
 */

public class GirlPresenterV2 {

    //view interface
    IGirlView mGirlView;

    //model interface;
    IGirlModel mGirlModel = new GirlModelImplV2();

    /**
     * 通过构造方法实例化
     *
     * @param mGirlView IGirlView
     */
    public GirlPresenterV2(IGirlView mGirlView) {
        super();
        this.mGirlView = mGirlView;
    }

    /**
     * 绑定 view 和 model
     */
    public void fetch() {
        //显示进度
        mGirlView.showLoading();
        //让model load data
        if (mGirlModel != null) {
            mGirlModel.loadGirl(new IGirlModel.OnLoadListener() {
                @Override
                public void onComplete(List<GirlBean> girls) {
                    //给view显示
                    mGirlView.showGirls(girls);
                }
            });
        }
    }

    /*
     * 策略模式
     *      1.可能是加载本地数据
     *      2.可能是加载网络数据
     *
     *      在调用fetch()之前，调用setGirlModel设置
     * /
     /*public void setGirlModel(int i){
     *   switch (i){
     *       case 1:
     *           mGirlModel = new GirlModelImplV1();
     *           break;
     *       case 2:
     *           mGirlModel = new GirlModelImplV2();
     *           break;
     *   }
     }*/
}
