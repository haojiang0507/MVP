package example.jianghao.mvp.base;

import java.lang.ref.WeakReference;

/**
 * Present基类
 * Created by jianghao on 2017/7/30.
 */

public class BasePresent<T> {

    /**
     * 当内存不足可释放内存
     */
    protected WeakReference<T> mViewRef;

    /**
     * bind p with v
     *
     * @param view 需要绑定的View
     */
    public void attachView(T view) {
        mViewRef = new WeakReference<>(view);
    }

    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }

    protected T getView() {
        return mViewRef.get();
    }
}
