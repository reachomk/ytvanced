package defpackage;

import android.content.Context;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: pgv */
public final class pgv {
    public static volatile pgv a;
    public final Context b;
    public volatile pem c;
    public UncaughtExceptionHandler d;
    private final pgy e = new pgy(this);

    public pgv(Context context) {
        Object applicationContext = context.getApplicationContext();
        pzr.a(applicationContext);
        this.b = applicationContext;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        pgr pgr = new pgr();
    }

    public static void a() {
        if (!(Thread.currentThread() instanceof pha)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final void a(Runnable runnable) {
        pzr.a((Object) runnable);
        this.e.submit(runnable);
    }
}
