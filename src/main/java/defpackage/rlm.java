package defpackage;

@qlp
/* renamed from: rlm */
public class rlm extends pbc {
    public final Object a = new Object();
    public pbc b;

    public final void c() {
        synchronized (this.a) {
            pbc pbc = this.b;
            if (pbc != null) {
                pbc.c();
            }
        }
    }

    public void a(int i) {
        synchronized (this.a) {
            pbc pbc = this.b;
            if (pbc != null) {
                pbc.a(i);
            }
        }
    }

    public final void d() {
        synchronized (this.a) {
            pbc pbc = this.b;
            if (pbc != null) {
                pbc.d();
            }
        }
    }

    public final void b() {
        synchronized (this.a) {
            pbc pbc = this.b;
            if (pbc != null) {
                pbc.b();
            }
        }
    }

    public void a() {
        synchronized (this.a) {
            pbc pbc = this.b;
            if (pbc != null) {
                pbc.a();
            }
        }
    }
}
