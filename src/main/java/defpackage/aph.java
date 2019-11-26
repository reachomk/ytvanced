package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aph */
public abstract class aph {
    private final ArrayList a = new ArrayList();
    public apj h = null;
    public final long i = 120;
    public final long j = 120;
    public final long k = 250;
    public final long l = 250;

    public abstract void a();

    public abstract boolean a(aqj aqj, api api, api api2);

    public abstract boolean a(aqj aqj, aqj aqj2, api api, api api2);

    public abstract boolean b();

    public abstract boolean b(aqj aqj, api api, api api2);

    public abstract void c(aqj aqj);

    public abstract boolean c(aqj aqj, api api, api api2);

    public abstract void d();

    public void g(aqj aqj) {
    }

    public boolean h(aqj aqj) {
        throw null;
    }

    public static api d(aqj aqj) {
        api f = aph.f();
        f.a(aqj);
        return f;
    }

    public static int e(aqj aqj) {
        int i = aqj.j & 14;
        if (aqj.j()) {
            return 4;
        }
        if ((i & 4) == 0) {
            int i2 = aqj.d;
            int d = aqj.d();
            if (!(i2 == -1 || d == -1 || i2 == d)) {
                return i | 2048;
            }
        }
        return i;
    }

    public final void f(aqj aqj) {
        g(aqj);
        apj apj = this.h;
        if (apj != null) {
            apj.a(aqj);
        }
    }

    public final boolean a(apg apg) {
        boolean b = b();
        if (apg != null) {
            if (b) {
                this.a.add(apg);
            } else {
                apg.a();
            }
        }
        return b;
    }

    public boolean a(aqj aqj, List list) {
        return h(aqj);
    }

    public final void e() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((apg) this.a.get(i)).a();
        }
        this.a.clear();
    }

    public static api f() {
        return new api();
    }
}
