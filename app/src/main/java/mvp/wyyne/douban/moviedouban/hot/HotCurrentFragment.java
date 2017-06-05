package mvp.wyyne.douban.moviedouban.hot;

import android.content.Context;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import mvp.wyyne.douban.moviedouban.R;
import mvp.wyyne.douban.moviedouban.adapter.CurrentAdapter;
import mvp.wyyne.douban.moviedouban.main.BaseFragment;

/**
 * Created by XXW on 2017/6/4.
 */

public class HotCurrentFragment extends BaseFragment {
    public static final String TAG ="HotCurrentFragment";
    @BindView(R.id.current_rv)
    RecyclerView mCurrentRv;
    Unbinder unbinder;
    private View mContentView;
    private List<String> mList;
    private CurrentAdapter mAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_hot_current;
    }

    @Override
    protected void initView() {
        mList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mList.add("" + i);
        }
        mAdapter = new CurrentAdapter(getActivity(), mList);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        manager.setOrientation(LinearLayoutManager.VERTICAL);

        mCurrentRv.setLayoutManager(manager);
        mCurrentRv.setAdapter(mAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        mContentView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, mContentView);
        Log.d("XXW","onCreate");
        return mContentView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("XXW","onCreate");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("XXW","onCreate");
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("XXW","onCreate");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("XXW","onCreate");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
        Log.d("XXW","onCreate");
    }
}