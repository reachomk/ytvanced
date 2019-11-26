package defpackage;

import java.util.List;

/* renamed from: agit */
final class agit implements agig {
    private final agqr a;
    private final List b;
    private List c;
    private final int d;
    private agqt e;
    private final /* synthetic */ agip f;

    public final List a() {
        List list;
        synchronized (this.f.l) {
            list = this.c;
        }
        return list;
    }

    public final agqt b() {
        agqt agqt;
        synchronized (this.f.l) {
            if (this.e == null) {
                this.e = new agqt(this.a, this.b, this.c, this.d);
            }
            agqt = this.e;
        }
        return agqt;
    }

    public final void a(List list) {
        synchronized (this.f.l) {
            this.c = list;
            this.e = null;
        }
    }

    /* synthetic */ agit(agip agip, agqr agqr, List list, List list2, int i) {
        this.f = agip;
        this.a = (agqr) amqw.a((Object) agqr);
        this.b = (List) amqw.a((Object) list);
        this.c = list2;
        this.d = i;
    }
}
