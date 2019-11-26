package defpackage;

import android.util.Base64;
import java.util.Map;

/* renamed from: qqd */
final class qqd implements Runnable {
    private final /* synthetic */ Map a;
    private final /* synthetic */ qps b;
    private final /* synthetic */ qqe c;

    qqd(qqe qqe, Map map, qps qps) {
        this.c = qqe;
        this.a = map;
        this.b = qps;
    }

    public final void run() {
        Object encodeToString;
        try {
            encodeToString = Base64.encodeToString(this.c.a.a(this.a), 11);
        } catch (Exception e) {
            this.c.b = qqm.a(e.toString());
            encodeToString = this.c.b;
            this.c.a();
        }
        this.b.a(encodeToString);
    }
}
