package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: rj */
abstract class rj {
    private static Handler a;
    public final FutureTask b = new rl(this, new ri(this));
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public volatile int e = 1;

    rj() {
    }

    public abstract Object a();

    /* Access modifiers changed, original: protected */
    public void a(Object obj) {
    }

    /* Access modifiers changed, original: protected */
    public void b() {
    }

    /* Access modifiers changed, original: final */
    public final void b(Object obj) {
        if (!this.d.get()) {
            c(obj);
        }
    }

    /* Access modifiers changed, original: final */
    public final void c(Object obj) {
        Handler handler;
        synchronized (rj.class) {
            if (a == null) {
                a = new Handler(Looper.getMainLooper());
            }
            handler = a;
        }
        handler.post(new rk(this, obj));
    }

    public final boolean c() {
        return this.c.get();
    }
}
