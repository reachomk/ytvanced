package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bbvu */
public final class bbvu extends AtomicInteger implements bboz, Runnable {
    public static final long serialVersionUID = 3880992722410194083L;
    private final bbmo a;
    private final Object b;

    public bbvu(bbmo bbmo, Object obj) {
        this.a = bbmo;
        this.b = obj;
    }

    public final boolean a(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final Object bI_() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.b;
    }

    public final boolean b() {
        return get() != 1;
    }

    public final void e() {
        lazySet(3);
    }

    public final void bK_() {
        set(3);
    }

    public final boolean c() {
        return get() == 3;
    }

    public final int a(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        lazySet(1);
        return 1;
    }

    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            this.a.b_(this.b);
            if (get() == 2) {
                lazySet(3);
                this.a.a();
            }
        }
    }
}
