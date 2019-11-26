package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbpt */
final class bbpt extends AtomicReference implements bblv {
    public static final long serialVersionUID = -5454794857847146511L;
    private final bbpu a;

    bbpt(bbpu bbpu) {
        this.a = bbpu;
    }

    public final void a(bbnc bbnc) {
        bbnz.c(this, bbnc);
    }

    public final void a_(Throwable th) {
        this.a.b(th);
    }

    public final void bL_() {
        bbpu bbpu = this.a;
        bbpu.a = false;
        bbpu.b();
    }
}
