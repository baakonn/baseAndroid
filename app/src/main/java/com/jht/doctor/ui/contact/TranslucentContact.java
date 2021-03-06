package com.jht.doctor.ui.contact;

import com.jht.doctor.ui.base.BasePresenter;
import com.jht.doctor.ui.base.BaseView;
import com.jht.doctor.ui.bean.AppUpdateBean;

/**
 * Created by table on 2017/11/29.
 * description:
 */

public interface TranslucentContact {

    interface View extends BaseView<Presenter>{
        void jumpToMain();
        void showUpdateDialog(AppUpdateBean appUpdateBean);
        void apkDownloadSuccess(String localApkPath , String sourceMD5);
        void apkDownloadFailed(Throwable throwable);
    }

    interface Presenter extends BasePresenter{
        void subscribe();
        void downloadApk(String downloadUrl , String destLocaLPath , String sourceMD5 , boolean force);
        void cancelDownload();
        void getRepayment();
        void getBaseCinfig();
    }
}
