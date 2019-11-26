package defpackage;

import java.util.Collection;

/* renamed from: bbwf */
final class bbwf implements bbmo, bbnc {
    private Collection a;
    private final bbmo b;
    private bbnc c;

    bbwf(bbmo bbmo, Collection collection) {
        this.b = bbmo;
        this.a = collection;
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.c, bbnc)) {
            this.c = bbnc;
            this.b.a((bbnc) this);
        }
    }

    public final void bK_() {
        this.c.bK_();
    }

    public final boolean c() {
        return this.c.c();
    }

    public final void b_(Object obj) {
        this.a.add(obj);
    }

    public final void a(Throwable th) {
        this.a = null;
        this.b.a(th);
    }

    public final void a() {
        Collection collection = this.a;
        this.a = null;
        this.b.b_(collection);
        this.b.a();
    }
}
