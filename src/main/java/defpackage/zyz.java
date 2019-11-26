package defpackage;

import android.os.ConditionVariable;
import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: zyz */
public final class zyz implements IdleHandler, zyt {
    public final xti b;
    public final ConditionVariable c = new ConditionVariable();
    public volatile int d;
    public final FutureTask e = new FutureTask(new zyy(this));
    public final zyu f;
    public zyv g;
    private final Executor h;

    public zyz(xti xti, Executor executor, zyu zyu) {
        this.b = xti;
        this.h = executor;
        this.f = zyu;
    }

    public final boolean queueIdle() {
        this.h.execute(new zzb(this));
        return false;
    }

    public final ConditionVariable a() {
        return this.c;
    }

    public final Future c() {
        return this.e;
    }

    public final void a(Executor executor) {
        executor.execute(this.e);
    }

    public final void a(zyv zyv) {
        xak.a();
        this.g = zyv;
        Looper.myQueue().addIdleHandler(this);
    }

    public final void b() {
        zyu zyu = this.f;
        xak.a();
        zyu.a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(zyu);
    }
}
