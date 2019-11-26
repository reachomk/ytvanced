package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbwz */
final class bbwz extends AtomicReference {
    public static final long serialVersionUID = 2404266111789071508L;
    private Object a;

    bbwz() {
    }

    bbwz(Object obj) {
        this.a = obj;
    }

    public final Object a() {
        Object obj = this.a;
        this.a = null;
        return obj;
    }

    public final bbwz b() {
        return (bbwz) get();
    }
}
