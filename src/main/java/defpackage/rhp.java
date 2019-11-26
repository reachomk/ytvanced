package defpackage;

/* renamed from: rhp */
abstract class rhp {
    rhp() {
    }

    public abstract Object a(Object obj);

    public abstract void a(Object obj, int i, int i2);

    public abstract void a(Object obj, int i, long j);

    public abstract void a(Object obj, int i, Object obj2);

    public abstract void a(Object obj, int i, rdg rdg);

    public abstract void a(Object obj, Object obj2);

    public abstract void a(Object obj, rik rik);

    public abstract boolean a();

    public abstract Object b();

    public abstract Object b(Object obj);

    public abstract void b(Object obj, int i, long j);

    public abstract void b(Object obj, Object obj2);

    public abstract void b(Object obj, rik rik);

    public abstract Object c(Object obj);

    public abstract Object c(Object obj, Object obj2);

    public abstract void d(Object obj);

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    /* Access modifiers changed, original: final */
    public final boolean a(Object obj, rgx rgx) {
        int b = rgx.b();
        int i = b >>> 3;
        b &= 7;
        if (b == 0) {
            a(obj, i, rgx.g());
            return true;
        } else if (b == 1) {
            b(obj, i, rgx.i());
            return true;
        } else if (b == 2) {
            a(obj, i, rgx.n());
            return true;
        } else if (b == 3) {
            Object b2 = b();
            int i2 = 4 | (i << 3);
            while (rgx.a() != Integer.MAX_VALUE) {
                if (!a(b2, rgx)) {
                    break;
                }
            }
            if (i2 == rgx.b()) {
                a(obj, i, a(b2));
                return true;
            }
            throw rfk.e();
        } else if (b == 4) {
            return false;
        } else {
            if (b == 5) {
                a(obj, i, rgx.j());
                return true;
            }
            throw rfk.f();
        }
    }
}
