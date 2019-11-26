package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: lrh */
public final class lrh implements exv, lrb {
    public lqz a;
    public int b = 0;
    private final exu c;
    private final exw d;
    private final List e = new ArrayList();
    private final List f = new ArrayList();

    public lrh(exu exu, lrj lrj) {
        this.c = exu;
        lrj.getClass();
        this.d = new lrk(lrj);
    }

    public static boolean a(int i) {
        return (i & 2) != 0;
    }

    public static boolean b(int i) {
        return (i & 1) != 0;
    }

    public final void a(lqz lqz) {
        lqz lqz2 = this.a;
        if (lqz != lqz2) {
            this.a = lqz;
            Object obj = null;
            Object obj2 = lqz2 == null ? null : 1;
            if (lqz != null) {
                obj = 1;
            }
            if (obj2 != null) {
                lqz2.b((lrb) this);
            }
            if (obj != null) {
                lqz.a((lrb) this);
            }
            if (obj2 != obj) {
                if (lqz != null) {
                    this.c.a((exv) this);
                    this.c.a(this.d);
                } else {
                    this.c.b((exv) this);
                    this.c.b(this.d);
                }
            }
            for (lra a : this.e) {
                a.a(lqz2, lqz);
            }
            c();
        }
    }

    public final void a(lra lra) {
        if (!this.e.contains(lra)) {
            this.e.add(lra);
        }
    }

    public final void a(lrm lrm) {
        if (!this.f.contains(lrm)) {
            this.f.add(lrm);
        }
    }

    public final void a() {
        c();
    }

    public final void b() {
        c();
    }

    public final void a(lqz lqz, int i) {
        if (this.a == lqz && (i & 1) != 0) {
            c();
        }
    }

    private final void c() {
        boolean z;
        boolean z2;
        lqz lqz = this.a;
        int i = 0;
        if (lqz != null) {
            z = this.c.a;
            z2 = lqz.b;
        } else {
            z2 = false;
            z = false;
        }
        int i2 = this.b;
        if (z) {
            i = z2 ? 3 : 1;
        } else if (z2) {
            i = 2;
        }
        if (i2 != i) {
            this.b = i;
            for (lrm a : this.f) {
                a.a(i2, i);
            }
        }
    }
}
