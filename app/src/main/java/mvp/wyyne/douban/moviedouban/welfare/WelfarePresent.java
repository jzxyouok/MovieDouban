package mvp.wyyne.douban.moviedouban.welfare;

import android.util.Log;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import mvp.wyyne.douban.moviedouban.api.RetrofitService;
import mvp.wyyne.douban.moviedouban.api.bean.WelfarePhotoList;

/**
 * Created by XXW on 2017/6/25.
 */

public class WelfarePresent implements IWelfarePresent {
    IWelfareMain mMain;

    public WelfarePresent(IWelfareMain main) {
        mMain = main;
    }

    @Override
    public void getData() {
        RetrofitService.getPhotoList(0)
                .subscribe(new Observer<WelfarePhotoList>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull WelfarePhotoList welfarePhotoList) {
                        mMain.showImg(welfarePhotoList.getResults());
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.d("XXW", e.toString());
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }
}
