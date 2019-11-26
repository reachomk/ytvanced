package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbzu */
final class bbzu extends AtomicReference implements bbnc {
    public static final long serialVersionUID = -7650903191002190468L;
    public final bblv a;

    bbzu(bblv bblv, bbzr bbzr) {
        this.a = bblv;
        lazySet(bbzr);
    }

    public final void bK_() {
        bbzr bbzr = (bbzr) getAndSet(null);
        if (bbzr != null) {
            bbzr.a(this);
        }
    }

    public final boolean c() {
        return get() == null;
    }
}
