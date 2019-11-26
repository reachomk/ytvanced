package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbtc */
final class bbtc extends AtomicReference implements bbmo {
    public static final long serialVersionUID = 2620149119579502636L;
    private final bbmo a;
    private final bbsz b;

    bbtc(bbmo bbmo, bbsz bbsz) {
        this.a = bbmo;
        this.b = bbsz;
    }

    public final void a(bbnc bbnc) {
        bbnz.c(this, bbnc);
    }

    public final void b_(Object obj) {
        this.a.b_(obj);
    }

    public final void a(Throwable th) {
        bbsz bbsz = this.b;
        if (bbyw.a(bbsz.a, th)) {
            if (!bbsz.b) {
                bbsz.c.bK_();
            }
            bbsz.d = false;
            bbsz.b();
            return;
        }
        bbzf.a(th);
    }

    public final void a() {
        bbsz bbsz = this.b;
        bbsz.d = false;
        bbsz.b();
    }
}
