package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aeds */
final class aeds implements afis {
    private final /* synthetic */ String a;
    private final /* synthetic */ aedf b;
    private final /* synthetic */ zzl c;
    private final /* synthetic */ aajl d;
    private final /* synthetic */ Executor e;
    private final /* synthetic */ aewn f;
    private final /* synthetic */ aeqo g;
    private final /* synthetic */ afjq h;
    private final /* synthetic */ aeep i;
    private final /* synthetic */ aelg j;
    private final /* synthetic */ xsd k;
    private final /* synthetic */ afio l;
    private final /* synthetic */ aelh m;
    private final /* synthetic */ ScheduledExecutorService n;
    private final /* synthetic */ xsc o;
    private final /* synthetic */ bcaa p;
    private final /* synthetic */ aenq q;
    private final /* synthetic */ xhv r;
    private final /* synthetic */ aelt s;
    private final /* synthetic */ aekt t;
    private final /* synthetic */ afjc u;
    private final /* synthetic */ afjv v;
    private final /* synthetic */ afjq w;

    aeds(String str, aedf aedf, zzl zzl, aajl aajl, Executor executor, aewn aewn, aeqo aeqo, afjq afjq, aeep aeep, aelg aelg, xsd xsd, afio afio, aelh aelh, ScheduledExecutorService scheduledExecutorService, xsc xsc, bcaa bcaa, aenq aenq, xhv xhv, aelt aelt, aekt aekt, afjc afjc, afjv afjv, afjq afjq2) {
        this.a = str;
        this.b = aedf;
        this.c = zzl;
        this.d = aajl;
        this.e = executor;
        this.f = aewn;
        this.g = aeqo;
        this.h = afjq;
        this.i = aeep;
        this.j = aelg;
        this.k = xsd;
        this.l = afio;
        this.m = aelh;
        this.n = scheduledExecutorService;
        this.o = xsc;
        this.p = bcaa;
        this.q = aenq;
        this.r = xhv;
        this.s = aelt;
        this.t = aekt;
        this.u = afjc;
        this.v = afjv;
        this.w = afjq2;
    }

    public final afiq a(aajj aajj, int i) {
        return a(aajj, null, i, aeuy.e, afhi.l);
    }

    public final afiq a(aajj aajj, aeoj aeoj, int i, aeuy aeuy, afhi afhi) {
        int i2 = i;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 != 0) {
                if (i3 == 1 || i3 == 2) {
                    return new aect(this.a, this.b, aajj, this.c, aeoj, this.d, this.e, i2 == 2 ? new owt[]{this.w} : new owt[0], null, null, this.k, null, null, this.n, this.o, afhi, this.p, this.q, this.r, aeni.a, aekr.a, i, false, this.u, this.v, aeuy.e);
                } else if (!(i3 == 3 || i3 == 4)) {
                    return null;
                }
            }
            int i4 = i;
            return new aect(this.a, this.b, aajj, this.c, aeoj, this.d, this.e, new owt[]{this.f, this.g.c, this.h}, this.i, this.j, this.k, i4 != 1 ? this.l : null, this.m, this.n, this.o, afhi, this.p, this.q, this.r, this.s, this.t, i, i4 == 5, this.u, this.v, aeuy);
        }
        throw null;
    }
}
