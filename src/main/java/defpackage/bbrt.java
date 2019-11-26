package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbrt */
final class bbrt extends AtomicReference implements bbmd, bbnc {
    public static final long serialVersionUID = 4375739915521278546L;
    public final bbmd a;
    private final bbnv b;
    private final bbnv c;
    private final Callable d;
    private bbnc e;

    bbrt(bbmd bbmd, bbnv bbnv, bbnv bbnv2, Callable callable) {
        this.a = bbmd;
        this.b = bbnv;
        this.c = bbnv2;
        this.d = callable;
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
        this.e.bK_();
    }

    public final boolean c() {
        return bbnz.a((bbnc) get());
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.e, bbnc)) {
            this.e = bbnc;
            this.a.a(this);
        }
    }

    public final void d_(Object obj) {
        try {
            ((bbmg) bbow.a(this.b.a(obj), "The onSuccessMapper returned a null MaybeSource")).b(new bbrw(this));
        } catch (Exception e) {
            bbnm.a(e);
            this.a.a_(e);
        }
    }

    public final void a_(Throwable th) {
        try {
            ((bbmg) bbow.a(this.c.a(th), "The onErrorMapper returned a null MaybeSource")).b(new bbrw(this));
        } catch (Exception e) {
            bbnm.a(e);
            this.a.a_(new bbnf(th, e));
        }
    }

    public final void bL_() {
        try {
            ((bbmg) bbow.a(this.d.call(), "The onCompleteSupplier returned a null MaybeSource")).b(new bbrw(this));
        } catch (Exception e) {
            bbnm.a(e);
            this.a.a_(e);
        }
    }
}
