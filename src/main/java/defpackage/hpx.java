package defpackage;

import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: hpx */
public final class hpx {
    public static final long a = TimeUnit.SECONDS.toMillis(10);
    public final hpt b;
    public final Handler c;
    public final Map d = new HashMap();
    public hpw e;

    public hpx(hpt hpt, Handler handler) {
        this.b = hpt;
        this.c = handler;
    }
}
