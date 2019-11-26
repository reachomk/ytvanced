package defpackage;

import java.util.Collection;

/* renamed from: bbwh */
final class bbwh implements bbmo, bbnc {
    private final bbmr a;
    private Collection b;
    private bbnc c;

    bbwh(bbmr bbmr, Collection collection) {
        this.a = bbmr;
        this.b = collection;
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.c, bbnc)) {
            this.c = bbnc;
            this.a.a(this);
        }
    }

    public final void bK_() {
        this.c.bK_();
    }

    public final boolean c() {
        return this.c.c();
    }

    public final void b_(Object obj) {
        this.b.add(obj);
    }

    public final void a(Throwable th) {
        this.b = null;
        this.a.a_(th);
    }

    public final void a() {
        Collection collection = this.b;
        this.b = null;
        this.a.d_(collection);
    }
}
