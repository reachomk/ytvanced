package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.chromium.net.ProxyChangeListener;

/* renamed from: bcki */
public final class bcki extends BroadcastReceiver {
    private final ProxyChangeListener a;

    public bcki(ProxyChangeListener proxyChangeListener) {
        this.a = proxyChangeListener;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
            ProxyChangeListener proxyChangeListener = this.a;
            proxyChangeListener.a(new bckk(proxyChangeListener));
        }
    }
}
