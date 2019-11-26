package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbwm */
final class bbwm extends AtomicReference implements bbmo, bbnc {
    public static final long serialVersionUID = -312246233408980075L;
    public final bbmo a;
    public final AtomicReference b = new AtomicReference();
    public final AtomicReference c = new AtomicReference();
    private final bbnr d;

    bbwm(bbmo bbmo, bbnr bbnr) {
        this.a = bbmo;
        this.d = bbnr;
    }

    public final void a(bbnc bbnc) {
        bbnz.b(this.b, bbnc);
    }

    public final void b_(Object obj) {
        Object obj2 = get();
        if (obj2 != null) {
            try {
                this.a.b_(bbow.a(this.d.a(obj, obj2), "The combiner returned a null value"));
            } catch (Throwable th) {
                bbnm.a(th);
                bK_();
                this.a.a(th);
            }
        }
    }

    public final void a(Throwable th) {
        bbnz.a(this.c);
        this.a.a(th);
    }

    public final void a() {
        bbnz.a(this.c);
        this.a.a();
    }

    public final void bK_() {
        bbnz.a(this.b);
        bbnz.a(this.c);
    }

    public final boolean c() {
        return bbnz.a((bbnc) this.b.get());
    }
}
