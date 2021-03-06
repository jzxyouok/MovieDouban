package mvp.wyyne.douban.moviedouban.oneself.setting;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import mvp.wyyne.douban.moviedouban.R;
import mvp.wyyne.douban.moviedouban.home.BaseActivity;

/**
 * Created by XXW on 2017/8/3.
 */

public class SettingActivity extends BaseActivity {
    @BindView(R.id.iv_back)
    ImageView mIvBack;
    @BindView(R.id.tv_stills_title)
    TextView mTvStillsTitle;
    @BindView(R.id.iv_share)
    ImageView mIvShare;

    @Override
    protected void refresh() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_setting;
    }

    @Override
    protected void initView() {
        mIvShare.setVisibility(View.GONE);
        mTvStillsTitle.setText(getString(R.string.str_setting));
    }


}
