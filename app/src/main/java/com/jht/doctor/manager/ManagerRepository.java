package com.jht.doctor.manager;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author: ZhaoYun
 * @date: 2017/11/1
 * @project: customer-android-2th
 * @detail:
 */
@Singleton
public final class ManagerRepository {

    private final ToastManager mToastManager;
    private final ActManager mActManager;
    private final CrashHandler mCrashHandler;

    @Inject
    public ManagerRepository(ToastManager toastManager , ActManager actManager , CrashHandler crashHandler){
        mToastManager = toastManager;
        mActManager = actManager;
        mCrashHandler = crashHandler;
    }

    public ToastManager toastMgr(){
        return mToastManager;
    }

    public ActManager actMgr(){
        return mActManager;
    }

    public CrashHandler crashHandler(){
        return mCrashHandler;
    }

}
