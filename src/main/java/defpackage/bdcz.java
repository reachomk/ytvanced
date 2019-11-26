package defpackage;

/* renamed from: bdcz */
public final class bdcz extends bdcs {
    public bdcz() {
        bdcv bdcv = new bdcv();
        a(bdcv);
        b(bdcv);
        bdcv.lazySet(null);
    }

    public final boolean offer(Object obj) {
        if (obj != null) {
            bdcv bdcv = new bdcv(obj);
            ((bdcv) this.a.get()).lazySet(bdcv);
            a(bdcv);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    public final Object poll() {
        bdcv b = a().b();
        if (b == null) {
            return null;
        }
        Object a = b.a();
        b(b);
        return a;
    }

    public final Object peek() {
        bdcv b = a().b();
        return b != null ? b.a : null;
    }
}
