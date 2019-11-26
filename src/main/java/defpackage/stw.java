package defpackage;

/* renamed from: stw */
final class stw {
    private final bcaa a;
    private volatile Object b = null;

    public stw(bcaa bcaa) {
        this.a = bcaa;
    }

    public final Object a() {
        Object obj = this.b;
        if (obj == null) {
            synchronized (this) {
                obj = this.b;
                if (obj == null) {
                    obj = this.a.get();
                    this.b = obj;
                }
            }
        }
        return obj;
    }
}
