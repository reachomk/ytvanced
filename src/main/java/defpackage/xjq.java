package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: xjq */
final class xjq extends xjo {
    private volatile transient xji f;
    private volatile transient boolean g;
    private volatile transient boolean h;
    private volatile transient boolean i;
    private volatile transient boolean j;
    private volatile transient xlg k;
    private volatile transient boolean l;
    private volatile transient ThreadPoolExecutor m;
    private volatile transient ThreadPoolExecutor n;

    xjq(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, boolean z, xax xax, xsc xsc, aosr aosr, ScheduledExecutorService scheduledExecutorService, xgv xgv, Executor executor, xhl xhl, bqa bqa, xhj xhj, int i, long j, Executor executor2, xkl xkl, xkl xkl2) {
        super(bcaa, bcaa2, bcaa3, z, xax, xsc, aosr, scheduledExecutorService, xgv, executor, xhl, bqa, xhj, i, j, executor2, xkl, xkl2);
    }

    public final xji j() {
        if (this.f == null) {
            synchronized (this) {
                if (this.f == null) {
                    this.f = super.j();
                    if (this.f == null) {
                        throw new NullPointerException("obscuraProxy() cannot return null");
                    }
                }
            }
        }
        return this.f;
    }

    public final boolean h() {
        if (!this.h) {
            synchronized (this) {
                if (!this.h) {
                    this.g = super.h();
                    this.h = true;
                }
            }
        }
        return this.g;
    }

    public final boolean u() {
        if (!this.j) {
            synchronized (this) {
                if (!this.j) {
                    aotf aotf = this.a.f().j;
                    if (aotf == null) {
                        aotf = aotf.c;
                    }
                    boolean z = false;
                    if ((this.a.f().a & 512) != 0 && aotf.b) {
                        z = true;
                    }
                    this.i = z;
                    this.j = true;
                }
            }
        }
        return this.i;
    }

    public final xlg v() {
        if (!this.l) {
            synchronized (this) {
                if (!this.l) {
                    this.k = this.b.a().c() ? new xlg() : null;
                    this.l = true;
                }
            }
        }
        return this.k;
    }

    public final ThreadPoolExecutor w() {
        if (this.m == null) {
            synchronized (this) {
                if (this.m == null) {
                    this.m = this.d.a(this);
                    if (this.m == null) {
                        throw new NullPointerException("normalExecutor() cannot return null");
                    }
                }
            }
        }
        return this.m;
    }

    public final ThreadPoolExecutor x() {
        if (this.n == null) {
            synchronized (this) {
                if (this.n == null) {
                    this.n = this.e.a(this);
                    if (this.n == null) {
                        throw new NullPointerException("priorityExecutor() cannot return null");
                    }
                }
            }
        }
        return this.n;
    }
}
