package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: adub */
public final class adub {
    private static final long f = TimeUnit.MINUTES.toMillis(1);
    private static final long g = TimeUnit.MINUTES.toMillis(2);
    private static final long h = TimeUnit.MINUTES.toMillis(10);
    public final Handler a;
    public final adud b;
    public adqe c;
    public adug d;
    public final adqg e = new adue(this);
    private final xsc i;

    public adub(xsc xsc) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = handler;
        this.i = xsc;
        this.b = new adud(this);
    }

    public final void a() {
        this.a.postDelayed(this.b, f);
    }

    public final void a(adqe adqe) {
        adug adug = this.d;
        if (adug != null) {
            long max = Math.max(g, adqe.p() - adqe.o());
            if (adqe.x() == adih.ENABLED) {
                max = Math.max(max, h);
            }
            long a = this.i.a();
            adug.a(a, max + a);
        }
    }
}
