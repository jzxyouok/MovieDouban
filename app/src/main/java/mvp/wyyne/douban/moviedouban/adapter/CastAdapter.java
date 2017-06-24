package mvp.wyyne.douban.moviedouban.adapter;

import android.content.Context;

import java.util.List;

import mvp.wyyne.douban.moviedouban.R;
import mvp.wyyne.douban.moviedouban.api.bean.Casts;

/**
 * Created by XXW on 2017/6/24.
 */

public class CastAdapter extends BaseRvAdapter<Casts> {
    private Casts mCasts;

    public CastAdapter(Context context, List<Casts> data) {
        super(context, data);
    }

    public void setList(List<Casts> list) {
        mList = list;
    }

    @Override
    int getLayoutId() {
        return R.layout.item_cast_layout;
    }

    @Override
    void bindView(BaseItemViewHolder holder, int position) {
        mCasts = mList.get(position);
        holder.setText(R.id.tv_identity, mCasts.getName());
        if (mCasts.getAvatars() != null) {
            holder.setImgUrl(R.id.iv_casts, mCasts.getAvatars().getMedium());
        }
    }
}