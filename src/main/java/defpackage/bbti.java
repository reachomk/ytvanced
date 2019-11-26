package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbti */
final class bbti extends AtomicReference implements bbmh, bbnc {
    public static final long serialVersionUID = -3434801548987643227L;
    private final bbmo a;

    bbti(bbmo bbmo) {
        this.a = bbmo;
    }

    public final void a(Object obj) {
        if (obj == null) {
            a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        if (!c()) {
            this.a.b_(obj);
        }
    }

    public final void a(Throwable th) {
        if (c()) {
            bbzf.a(th);
            return;
        }
        try {
            this.a.a(th);
        } finally {
            bbnz.a((AtomicReference) this);
        }
    }

    public final void a(bbnt bbnt) {
        bbnz.a((AtomicReference) this, new bbnx(bbnt));
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
    }

    public final boolean c() {
        return bbnz.a((bbnc) get());
    }

    public final String toString() {
        return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
    }
}
