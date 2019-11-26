package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bdcv */
public final class bdcv extends AtomicReference {
    public static final long serialVersionUID = 2404266111789071508L;
    public Object a;

    public bdcv(Object obj) {
        this.a = obj;
    }

    public final Object a() {
        Object obj = this.a;
        this.a = null;
        return obj;
    }

    public final bdcv b() {
        return (bdcv) get();
    }
}
