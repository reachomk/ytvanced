package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: xju */
public final class xju implements xhf {
    private final xku a;
    private final boolean b;
    private final ThreadPoolExecutor c;
    private final ThreadPoolExecutor d;
    private final xkj e;

    public xju(xkj xkj) {
        this.e = xkj;
        this.b = xkj.g().b;
        this.c = xkj.x();
        this.d = xkj.w();
        this.a = xkj.u() ? new xkb(this) : xku.b;
    }

    public final void a() {
        if (this.b) {
            this.d.prestartAllCoreThreads();
            ThreadPoolExecutor threadPoolExecutor = this.c;
            if (threadPoolExecutor != this.d) {
                threadPoolExecutor.prestartAllCoreThreads();
            }
        }
    }

    public final anjv a(xle xle) {
        anko f = anko.f();
        xjp xkq = new xkq(f, this.e.o(), xle);
        if (!this.a.a(xle, xkq)) {
            a(xle, xkq);
        }
        return f;
    }

    public final xle b(xle xle) {
        xjp xks = new xks(this.e.r(), this.e.o(), xle);
        return !this.a.a(xle, xks) ? a(xle, xks) : xle;
    }

    /* Access modifiers changed, original: final */
    public final xle a(xle xle, xjp xjp) {
        ExecutorService executorService;
        if (xle.j) {
            executorService = this.c;
        } else {
            executorService = this.d;
        }
        try {
            executorService.execute(new xkw(executorService, xle, this.e, this.a, xjp));
        } catch (RejectedExecutionException e) {
            xjp.a(xle, bqh.a(new bqn(e)));
        }
        return xle;
    }
}
