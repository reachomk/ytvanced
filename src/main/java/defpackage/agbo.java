package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

/* renamed from: agbo */
public final class agbo implements aghl {
    public final xsc a;
    public final agbp b = new agbp(this);
    public final bcaa c;
    public final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final Executor g;

    public agbo(xsc xsc, bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, Executor executor) {
        this.a = xsc;
        this.e = bcaa;
        this.f = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.g = executor;
    }

    public final agqn a(String str, agho agho) {
        xvd.a(str);
        return ((agbg) this.d.get()).v() ? ((agfi) this.c.get()).a(str, agho) : null;
    }

    public final agqn a(String str, long j) {
        if (((agbg) this.d.get()).v()) {
            return b(str, j);
        }
        return null;
    }

    public final anjv a(String str) {
        return agbf.a(((agbg) this.d.get()).u(), new agbn(this, str), ampo.a, this.g);
    }

    public final agqn b(String str, long j) {
        if (this.e == null) {
            return null;
        }
        xvd.a(str);
        return a(str, new agdl((agsu) this.f.get(), j));
    }

    public final RunnableFuture b(String str) {
        return new FutureTask(new agbq(this, str));
    }

    public final boolean a(agql agql) {
        if (!((agbg) this.d.get()).v()) {
            return false;
        }
        amqw.a((Object) agql);
        return ((agfi) this.c.get()).a(agql);
    }

    public final boolean a(String str, int i, long j) {
        if (!((agbg) this.d.get()).v()) {
            return false;
        }
        xvd.a(str);
        return ((agfi) this.c.get()).a(str, i, j);
    }

    public final boolean a(String str, int i, String str2) {
        if (!((agbg) this.d.get()).v()) {
            return false;
        }
        ((agfi) this.c.get()).a(str, i, str2);
        return true;
    }

    public final boolean b(agql agql) {
        return ((agbg) this.d.get()).v() ? ((agfi) this.c.get()).b(agql) : false;
    }

    public final boolean a(String str, int i) {
        if (!((agbg) this.d.get()).v()) {
            return false;
        }
        xvd.a(str);
        return ((agfi) this.c.get()).a(str, i);
    }
}
