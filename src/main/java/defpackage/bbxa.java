package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbxa */
public final class bbxa implements bbpd {
    private final AtomicReference a = new AtomicReference();
    private final AtomicReference b = new AtomicReference();

    public bbxa() {
        bbwz bbwz = new bbwz();
        b(bbwz);
        a(bbwz);
    }

    public final boolean a(Object obj) {
        if (obj != null) {
            bbwz bbwz = new bbwz(obj);
            a(bbwz).lazySet(bbwz);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final Object bI_() {
        bbwz bbwz = (bbwz) this.b.get();
        bbwz b = bbwz.b();
        Object a;
        if (b != null) {
            a = b.a();
            b(b);
            return a;
        } else if (bbwz == c()) {
            return null;
        } else {
            do {
                b = bbwz.b();
            } while (b == null);
            a = b.a();
            b(b);
            return a;
        }
    }

    public final void e() {
        while (bI_() != null) {
            if (b()) {
                return;
            }
        }
    }

    private final bbwz c() {
        return (bbwz) this.a.get();
    }

    private final bbwz a(bbwz bbwz) {
        return (bbwz) this.a.getAndSet(bbwz);
    }

    private final void b(bbwz bbwz) {
        this.b.lazySet(bbwz);
    }

    public final boolean b() {
        return ((bbwz) this.b.get()) == c();
    }
}
