package defpackage;

import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* renamed from: bbmy */
final class bbmy extends bbmn {
    private final Handler a;

    bbmy(Handler handler) {
        this.a = handler;
    }

    public final bbnc a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            bbna bbna = new bbna(this.a, bbzf.a(runnable));
            this.a.postDelayed(bbna, Math.max(0, timeUnit.toMillis(j)));
            return bbna;
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    public final bbmp a() {
        return new bbmx(this.a);
    }
}
