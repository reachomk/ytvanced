package defpackage;

import android.util.Pair;

/* renamed from: onp */
abstract class onp extends oau {
    private final int b;
    private final ops c;

    private static Object d(Object obj) {
        return ((Pair) obj).first;
    }

    public abstract int b(int i);

    public abstract int c(int i);

    public abstract int c(Object obj);

    public abstract int d(int i);

    public abstract oau d();

    public abstract int e(int i);

    public abstract Object f(int i);

    public static Object b(Object obj) {
        return ((Pair) obj).second;
    }

    public onp(ops ops) {
        this.c = ops;
        this.b = ((opv) ops).a;
    }

    public final int a(int i, int i2, boolean z) {
        int c = c(i);
        int e = e(c);
        i = d().a(i - e, i2 == 2 ? 0 : i2, z);
        if (i != -1) {
            return e + i;
        }
        i = a(c, z);
        while (i != -1 && d().c()) {
            i = a(i, z);
        }
        if (i != -1) {
            return e(i) + d().b(z);
        }
        if (i2 == 2) {
            return b(z);
        }
        return -1;
    }

    public final int a(boolean z) {
        int i = this.b;
        if (i == 0) {
            return -1;
        }
        i = z ? this.c.a() : i - 1;
        while (d().c()) {
            i = z ? this.c.b(i) : i > 0 ? i - 1 : -1;
            if (i == -1) {
                return -1;
            }
        }
        return e(i) + d().a(z);
    }

    public final int b(boolean z) {
        if (this.b == 0) {
            return -1;
        }
        int b = z ? this.c.b() : 0;
        while (d().c()) {
            b = a(b, z);
            if (b == -1) {
                return -1;
            }
        }
        return e(b) + d().b(z);
    }

    public final oav a(int i, oav oav, boolean z, long j) {
        int c = c(i);
        int e = e(c);
        c = d(c);
        d().a(i - e, oav, z, j);
        oav.f += c;
        oav.g += c;
        return oav;
    }

    public final oaw a(Object obj, oaw oaw) {
        Object d = onp.d(obj);
        Object b = onp.b(obj);
        int e = e(c(d));
        d().a(b, oaw);
        oaw.b += e;
        oaw.a = obj;
        return oaw;
    }

    public final oaw a(int i, oaw oaw, boolean z) {
        int b = b(i);
        int e = e(b);
        d().a(i - d(b), oaw, z);
        oaw.b += e;
        if (z) {
            oaw.a = Pair.create(f(b), oaw.a);
        }
        return oaw;
    }

    public final int a(Object obj) {
        if (obj instanceof Pair) {
            Object d = onp.d(obj);
            obj = onp.b(obj);
            int c = c(d);
            if (c != -1) {
                int a = d().a(obj);
                if (a != -1) {
                    return d(c) + a;
                }
            }
        }
        return -1;
    }

    public final Object a(int i) {
        int b = b(i);
        return Pair.create(f(b), d().a(i - d(b)));
    }

    private final int a(int i, boolean z) {
        int i2 = -1;
        if (z) {
            i2 = this.c.a(i);
        } else if (i < this.b - 1) {
            return i + 1;
        }
        return i2;
    }
}
