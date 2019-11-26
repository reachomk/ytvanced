package defpackage;

import java.util.List;
import java.util.Set;

/* renamed from: abnw */
public abstract class abnw {
    public abstract String a();

    public abstract String b();

    public abstract int c();

    public abstract int d();

    public abstract List e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract boolean j();

    public abstract int k();

    public abstract Set l();

    public abstract int m();

    public abstract int n();

    public abstract String o();

    public abstract int p();

    public static athg a(abnv abnv, int i) {
        athf athf = (athf) athg.f.createBuilder();
        if (i < 0) {
            i = -1;
        }
        athf.copyOnWrite();
        athg athg = (athg) athf.instance;
        athg.a |= 1;
        athg.b = i;
        i = abnv.c;
        athf.copyOnWrite();
        athg = (athg) athf.instance;
        athg.a |= 2;
        athg.c = i;
        List a = anhe.a(abnv.d);
        athf.copyOnWrite();
        athg = (athg) athf.instance;
        if (!athg.d.a()) {
            athg.d = anxl.mutableCopy(athg.d);
        }
        anvf.addAll(a, athg.d);
        int i2 = abnv.m;
        athf.copyOnWrite();
        athg athg2 = (athg) athf.instance;
        if (i2 != 0) {
            athg2.a |= 8;
            athg2.e = i2 - 1;
            return (athg) ((anxl) athf.build());
        }
        throw new NullPointerException();
    }
}
