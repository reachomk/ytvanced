package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbvl */
final class bbvl extends AtomicReference implements bbnc {
    public static final long serialVersionUID = -1100270633763673112L;
    public final bbmo a;

    bbvl(bbmo bbmo) {
        this.a = bbmo;
    }

    public final boolean c() {
        return get() == this;
    }

    public final void bK_() {
        bbvl andSet = getAndSet(this);
        if (andSet != null && andSet != this) {
            ((bbvo) andSet).a(this);
        }
    }
}
