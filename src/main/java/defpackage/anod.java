package defpackage;

/* renamed from: anod */
final class anod implements anqq {
    private static final Object a = new Object();
    private volatile Object b = a;
    private volatile anqq c;

    anod(annq annq, annp annp) {
        this.c = new anog(annq, annp);
    }

    public final Object a() {
        Object obj = this.b;
        if (obj == a) {
            synchronized (this) {
                obj = this.b;
                if (obj == a) {
                    obj = this.c.a();
                    this.b = obj;
                    this.c = null;
                }
            }
        }
        return obj;
    }
}
