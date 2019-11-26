package defpackage;

import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import org.chromium.net.ProxyChangeListener;

/* renamed from: bckk */
final /* synthetic */ class bckk implements Runnable {
    private final ProxyChangeListener a;

    bckk(ProxyChangeListener proxyChangeListener) {
        this.a = proxyChangeListener;
    }

    public final void run() {
        bckj bckj;
        ProxyChangeListener proxyChangeListener = this.a;
        ProxyInfo defaultProxy = ((ConnectivityManager) bchn.a.getSystemService("connectivity")).getDefaultProxy();
        if (defaultProxy == null) {
            bckj = bckj.e;
        } else {
            bckj = bckj.a(defaultProxy);
        }
        proxyChangeListener.a(bckj);
    }
}
