package defpackage;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Pair;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aixy */
public final class aixy implements Runnable {
    public final aiqq a;
    public final int b;
    public final aiye c;
    public final xoi d;
    public volatile boolean e;
    private final aixi f;
    private final aakj g;
    private final String h;
    private final boolean i;
    private final Handler j;
    private final long k;
    private final long l;
    private final aiqw m;
    private volatile boolean n = true;
    private aafv o = null;
    private Exception p = null;
    private aakj q = null;
    private Exception r = null;
    private final ConditionVariable s = new ConditionVariable();

    public aixy(aiqq aiqq, int i, aixi aixi, aakj aakj, String str, boolean z, Handler handler, long j, long j2, xoi xoi, aiye aiye, aiqw aiqw) {
        this.a = aiqq;
        this.b = i;
        this.f = aixi;
        this.g = aakj;
        this.h = str;
        this.i = z;
        this.j = handler;
        this.k = j;
        this.l = j2;
        this.d = xoi;
        this.c = aiye;
        this.m = aiqw;
    }

    public final boolean a(boolean z) {
        if (!this.n && !z) {
            return false;
        }
        this.e = true;
        a();
        return true;
    }

    public final synchronized void a() {
        this.s.open();
    }

    private final void b(boolean z) {
        Pair a = this.f.a(this.a, this.h, this.m);
        Future future = (Future) a.second;
        try {
            this.q = (aakj) ((anjv) a.first).get(this.l, TimeUnit.MILLISECONDS);
            this.n = false;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            xtl.a("Problem fetching player response", e);
            this.r = e;
        }
        if (z) {
            aakj aakj = this.q;
            if (aakj != null) {
                a(aakj);
            } else {
                Exception exception = this.r;
                if (exception != null) {
                    a(exception);
                }
            }
        }
        long j = this.k;
        if (j > 0) {
            this.s.block(j);
        }
        if (!this.e) {
            try {
                this.o = (aafv) future.get();
            } catch (InterruptedException | ExecutionException e2) {
                xtl.a("Problem fetching WatchNext response", e2);
                this.p = e2;
            }
        }
    }

    private final void b() {
        try {
            aixi aixi = this.f;
            this.a.b();
            this.q = (aakj) aixi.a(this.h, this.a, this.m).get(this.l, TimeUnit.MILLISECONDS);
            a(this.q);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            a(e);
        }
    }

    public final void run() {
        if (!(Looper.myLooper() == Looper.getMainLooper() || Process.getThreadPriority(Process.myTid()) == 0)) {
            xtl.c("Request being made from non-critical thread");
        }
        this.c.a();
        int i = this.b;
        if (i == 0) {
            b();
        } else if (i == 1) {
            this.q = this.g;
            anjv a = this.f.a(this.a);
            if (!this.e) {
                try {
                    this.o = (aafv) a.get();
                } catch (InterruptedException | ExecutionException e) {
                    this.p = e;
                }
            }
            c();
        } else if (i == 2) {
            boolean z = false;
            b(false);
            aafv aafv = this.o;
            if (!(aafv == null && this.p == null)) {
                Object obj = (this.q == null && this.r == null) ? null : 1;
                Object obj2 = (aafv == null && this.p == null) ? null : 1;
                if (!(obj == null || obj2 == null)) {
                    z = true;
                }
                amqw.b(z);
                Exception exception = this.r;
                if (exception == null && this.p == null) {
                    a(this.o);
                    a(this.q);
                } else {
                    if (exception == null) {
                        exception = this.p;
                    }
                    a(exception);
                }
            }
        } else if (i == 3) {
            b(true);
            c();
        } else {
            return;
        }
        if (!(this.b == 0 || this.q == null || this.o == null)) {
            this.j.post(new aiyd(this));
        }
    }

    private final void c() {
        aafv aafv = this.o;
        if (aafv != null) {
            a(aafv);
            return;
        }
        Exception exception = this.p;
        if (exception != null) {
            this.j.post(new aiyf(this, exception));
        }
    }

    private final void a(aakj aakj) {
        aiyb aiyb = new aiyb(this, aakj);
        if (this.i) {
            this.j.post(aiyb);
        } else {
            this.j.postAtFrontOfQueue(aiyb);
        }
    }

    private final void a(Exception exception) {
        this.j.post(new aiya(this, exception));
    }

    private final void a(aafv aafv) {
        this.j.post(new aiyc(this, aafv));
    }
}
