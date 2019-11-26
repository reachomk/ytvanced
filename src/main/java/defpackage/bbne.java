package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbne */
abstract class bbne extends AtomicReference implements bbnc {
    public static final long serialVersionUID = 6537757548749041217L;

    bbne(Object obj) {
        super(bbow.a(obj, "value is null"));
    }

    public abstract void a(Object obj);

    public final void bK_() {
        if (get() != null) {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                a(andSet);
            }
        }
    }

    public final boolean c() {
        return get() == null;
    }
}
