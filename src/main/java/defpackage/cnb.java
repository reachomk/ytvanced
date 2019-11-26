package defpackage;

import android.os.Process;
import com.facebook.litho.ComponentTree;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cnb */
public final class cnb {
    public volatile int a;
    public volatile boolean b = false;
    public volatile cpg c = null;
    public final /* synthetic */ ComponentTree d;
    private final AtomicInteger e = new AtomicInteger(-1);
    private final cmg f;
    private final cma g;
    private final int h;
    private final int i;
    private final FutureTask j;

    public final synchronized void a() {
        if (!this.b) {
            this.c = null;
            this.b = true;
        }
    }

    public final cpg b() {
        int i;
        if (this.e.compareAndSet(-1, Process.myTid())) {
            this.j.run();
        }
        int i2 = this.e.get();
        Object obj = null;
        if (!cro.a() || this.j.isDone() || i2 == Process.myTid()) {
            i = 0;
        } else {
            i = Process.getThreadPriority(i2);
            int i3 = -4;
            while (obj == null && i3 < i) {
                try {
                    Process.setThreadPriority(i2, i3);
                    obj = 1;
                } catch (SecurityException unused) {
                    i3++;
                }
            }
            obj = 1;
        }
        try {
            cpg cpg = (cpg) this.j.get();
            if (obj != null) {
                try {
                    Process.setThreadPriority(i2, i);
                } catch (IllegalArgumentException | SecurityException unused2) {
                }
            }
            if (cpg == null) {
                return null;
            }
            synchronized (this) {
                if (this.b) {
                    return null;
                }
                return cpg;
            }
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(e.getMessage(), e);
        } catch (InterruptedException | CancellationException e2) {
            throw new RuntimeException(e2.getMessage(), e2);
        } catch (Throwable th) {
            if (obj != null) {
                try {
                    Process.setThreadPriority(i2, i);
                } catch (IllegalArgumentException | SecurityException unused3) {
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cnb cnb = (cnb) obj;
            return this.h == cnb.h && this.i == cnb.i && this.f.equals(cnb.f) && this.g.j == cnb.g.j;
        }
    }

    public final int hashCode() {
        return (((((this.f.hashCode() * 31) + this.g.j) * 31) + this.h) * 31) + this.i;
    }

    public /* synthetic */ cnb(ComponentTree componentTree, cmg cmg, cma cma, int i, int i2, boolean z, cpg cpg, csq csq, int i3, String str) {
        this.d = componentTree;
        cmg cmg2 = cmg;
        this.f = cmg2;
        cma cma2 = cma;
        this.g = cma2;
        int i4 = i;
        this.h = i4;
        int i5 = i2;
        this.i = i5;
        this.j = new FutureTask(new cne(this, cmg2, cma2, i4, i5, z, cpg, csq, i3, str));
    }
}
