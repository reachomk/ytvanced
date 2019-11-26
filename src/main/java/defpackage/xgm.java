package defpackage;

import android.net.NetworkInfo;
import java.net.UnknownHostException;

/* renamed from: xgm */
public final class xgm {
    private final xgo a;
    private final bcaa b;

    public xgm(bcaa bcaa) {
        xgl xgl = new xgl();
        this.b = bcaa;
        this.a = xgl;
    }

    public final void a(String str) {
        xak.b();
        NetworkInfo b = ((xhu) this.b.get()).b();
        if (b != null && b.isConnected()) {
            try {
                this.a.a(str);
            } catch (UnknownHostException unused) {
                String.valueOf(str).length();
            }
        }
    }
}
