package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import defpackage.bchn;
import defpackage.bcki;
import defpackage.bckj;
import defpackage.bckl;

public class ProxyChangeListener {
    private static boolean a = true;
    private final Looper b = Looper.myLooper();
    private final Handler c = new Handler(this.b);
    private long d;
    private ProxyReceiver e;
    private BroadcastReceiver f;

    public class ProxyReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                ProxyChangeListener.this.a(new bckl(this, intent));
            }
        }

        /* synthetic */ ProxyReceiver() {
        }
    }

    private ProxyChangeListener() {
    }

    private native void nativeProxySettingsChanged(long j);

    private native void nativeProxySettingsChangedTo(long j, String str, int i, String str2, String[] strArr);

    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    public void start(long j) {
        this.d = j;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PROXY_CHANGE");
        this.e = new ProxyReceiver();
        if (VERSION.SDK_INT >= 23) {
            bchn.a.registerReceiver(this.e, new IntentFilter());
            this.f = new bcki(this);
            bchn.a.registerReceiver(this.f, intentFilter);
            return;
        }
        bchn.a.registerReceiver(this.e, intentFilter);
    }

    public void stop() {
        this.d = 0;
        bchn.a.unregisterReceiver(this.e);
        if (this.f != null) {
            bchn.a.unregisterReceiver(this.f);
        }
        this.e = null;
        this.f = null;
    }

    public final void a(bckj bckj) {
        if (a) {
            long j = this.d;
            if (j != 0) {
                if (bckj != null) {
                    nativeProxySettingsChangedTo(j, bckj.a, bckj.b, bckj.c, bckj.d);
                    return;
                }
                nativeProxySettingsChanged(j);
            }
        }
    }

    public final void a(Runnable runnable) {
        if (this.b == Looper.myLooper()) {
            runnable.run();
        } else {
            this.c.post(runnable);
        }
    }
}
