package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: aapn */
public final class aapn extends aanf implements aana {
    private static final Set g = Collections.emptySet();
    public final xci a;
    public final Set b;
    private final String h;
    private final aapq i;
    private final zzl j;
    private final Set k;
    private final boolean l;
    private final Executor m;
    private final aanl n;

    public aapn(amqp amqp, aamn aamn, aamd aamd, afpu afpu, xhf xhf, zzf zzf, zzl zzl, xci xci, Executor executor) {
        xhf xhf2 = xhf;
        this(aamn, aamd, afpu, xhf2, zzf, zzl, g, new aapq(aamn, xhf2, Collections.emptySet()), xci, Collections.emptySet(), executor);
    }

    public aapn(aamn aamn, aamd aamd, afpu afpu, xhf xhf, zzf zzf, zzl zzl, Set set, aapq aapq, xci xci, Set set2, Executor executor) {
        super(aamd, afpu, xhf);
        this.h = "browse";
        this.l = zzf.p();
        this.j = zzl;
        this.k = (Set) amqw.a((Object) set);
        this.i = (aapq) amqw.a((Object) aapq);
        this.a = (xci) amqw.a((Object) xci);
        this.b = set2;
        this.m = executor;
        this.n = a(ajrr.class, aamn, aapm.a);
    }

    @Deprecated
    public final void a(aaps aaps, afsw afsw) {
        anjv b = b(aaps);
        aniv aniv = aniv.a;
        aapp aapp = new aapp(afsw);
        afsw.getClass();
        xan.a(b, aniv, aapp, new aapo(afsw));
    }

    @Deprecated
    private final anjv b(aaps aaps) {
        return a(aaps, this.m);
    }

    public final anjv a(aaps aaps, Executor executor) {
        return anic.a(this.n.a((aaml) aaps, executor), new aapr(this), aniv.a);
    }

    @Deprecated
    public final aaff a(aaps aaps) {
        try {
            return (aaff) b(aaps).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new aanq(e);
        }
    }

    /* renamed from: b */
    public final aaps a(ajtf ajtf) {
        aaps a = a();
        a.c = aali.b(ajtf.a());
        a.a(ajtf.b());
        return a;
    }

    public final void a(aaml aaml, aand aand, afsw afsw) {
        this.i.a((aaps) aaml, aand, afsw);
    }

    public final aaps a() {
        return a(null);
    }

    public final aaps a(xhs xhs) {
        aaps aaps = new aaps(this.h, this.c, this.d.c(), this.j, this.l);
        aaps.n = xhs;
        for (aapv a : this.k) {
            a.a(aaps);
        }
        return aaps;
    }
}
