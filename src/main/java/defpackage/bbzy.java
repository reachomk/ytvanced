package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbzy */
final class bbzy extends AtomicReference implements bbnc {
    public static final long serialVersionUID = -7650903191002190468L;
    public final bbmr a;

    bbzy(bbmr bbmr, bbzv bbzv) {
        this.a = bbmr;
        lazySet(bbzv);
    }

    public final void bK_() {
        bbzv bbzv = (bbzv) getAndSet(null);
        if (bbzv != null) {
            bbzv.a(this);
        }
    }

    public final boolean c() {
        return get() == null;
    }
}
