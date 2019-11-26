package defpackage;

/* renamed from: fdl */
abstract class fdl implements fbr {
    fdl() {
    }

    public abstract boolean c();

    public abstract int d();

    public abstract aybc e();

    public abstract ayao f();

    public abstract axzw g();

    public abstract ayaa h();

    public abstract feb i();

    public abstract CharSequence j();

    public abstract int k();

    public abstract apxu l();

    public abstract String m();

    public abstract fdo n();

    public abstract int o();

    public abstract int p();

    public final int q() {
        return 3;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(aybc aybc) {
        int d = d();
        Object obj;
        if (d == 1) {
            ayao f = f();
            if (f != null) {
                obj = aybc.b;
                if (obj == null) {
                    obj = ayao.n;
                }
                if (f.equals(obj)) {
                    return true;
                }
            }
            return false;
        } else if (d == 2) {
            axzw g = g();
            if (g != null) {
                obj = aybc.c;
                if (obj == null) {
                    obj = axzw.k;
                }
                if (g.equals(obj)) {
                    return true;
                }
            }
            return false;
        } else if (d != 3) {
            return false;
        } else {
            ayaa h = h();
            if (h != null) {
                obj = aybc.e;
                if (obj == null) {
                    obj = ayaa.h;
                }
                if (h.equals(obj)) {
                    return true;
                }
            }
            return false;
        }
    }
}
