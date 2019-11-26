package defpackage;

/* renamed from: aoar */
abstract class aoar {
    aoar() {
    }

    public abstract Object a(Object obj);

    public abstract void a(Object obj, int i, int i2);

    public abstract void a(Object obj, int i, long j);

    public abstract void a(Object obj, int i, anvu anvu);

    public abstract void a(Object obj, int i, Object obj2);

    public abstract void a(Object obj, aobl aobl);

    public abstract void a(Object obj, Object obj2);

    public abstract boolean a();

    public abstract Object b();

    public abstract Object b(Object obj);

    public abstract void b(Object obj, int i, long j);

    public abstract void b(Object obj, aobl aobl);

    public abstract void b(Object obj, Object obj2);

    public abstract Object c(Object obj);

    public abstract Object c(Object obj, Object obj2);

    public abstract void d(Object obj);

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    /* Access modifiers changed, original: final */
    public final boolean a(Object obj, anzt anzt) {
        int b = anzt.b();
        int b2 = aobj.b(b);
        b = aobj.a(b);
        if (b == 0) {
            a(obj, b2, anzt.g());
            return true;
        } else if (b == 1) {
            b(obj, b2, anzt.i());
            return true;
        } else if (b == 2) {
            a(obj, b2, anzt.n());
            return true;
        } else if (b == 3) {
            Object b3 = b();
            int a = aobj.a(b2, 4);
            while (anzt.a() != Integer.MAX_VALUE) {
                if (!a(b3, anzt)) {
                    break;
                }
            }
            if (a == anzt.b()) {
                a(obj, b2, a(b3));
                return true;
            }
            throw anyg.e();
        } else if (b == 4) {
            return false;
        } else {
            if (b == 5) {
                a(obj, b2, anzt.j());
                return true;
            }
            throw anyg.f();
        }
    }
}
