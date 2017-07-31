package example.jianghao.mvp.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import example.jianghao.mvp.R;
import example.jianghao.mvp.bean.GirlBean;

public class GirlAdapter extends BaseAdapter {

    private Context context;
    private List<GirlBean> girls;

    public GirlAdapter(Context context, List<GirlBean> girls) {
        this.context = context;
        this.girls = girls;
    }

    @Override
    public int getCount() {
        return girls.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            view = View.inflate(context, R.layout.item_girl, null);
            holder = new ViewHolder();
            holder.ivGirl = view.findViewById(R.id.iv_girl);
            holder.tvTitle = view.findViewById(R.id.tv_title);
            holder.tvDes = view.findViewById(R.id.tv_description);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        holder.ivGirl.setImageResource(girls.get(position).getResource());
        holder.tvTitle.setText(girls.get(position).getTitle());
        holder.tvDes.setText(girls.get(position).getDescription());
        return view;
    }

    private final class ViewHolder {
        ImageView ivGirl;
        TextView tvTitle;
        TextView tvDes;
    }
}
