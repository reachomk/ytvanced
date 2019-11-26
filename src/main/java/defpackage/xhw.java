package defpackage;

import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;

/* renamed from: xhw */
public final class xhw implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private xhw(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static xhw a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new xhw(bcaa, bcaa2, bcaa3);
    }

    public final /* synthetic */ Object get() {
        return new xht((ConnectivityManager) this.a.get(), (WifiManager) this.b.get(), (xrq) this.c.get());
    }
}
