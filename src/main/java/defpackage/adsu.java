package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: adsu */
public abstract class adsu extends adqy {
    private final Context e;
    private final xoi f;
    private final List g = new ArrayList();
    private int h;
    public final adtw m;
    public adpw n;
    public adtq o;

    adsu(Context context, adtw adtw, xoi xoi, int i) {
        super(i);
        this.e = context;
        this.m = adtw;
        this.f = xoi;
        this.h = 0;
    }

    public abstract void L();

    public abstract boolean M();

    public abstract void a(boolean z, boolean z2);

    /* Access modifiers changed, original: protected|final */
    public final void a(adtq adtq) {
        boolean z = true;
        amqw.b(this.n != null);
        if (this.o != null) {
            z = false;
        }
        amqw.b(z);
        this.o = adtq;
        for (adqg a : this.g) {
            this.o.a(a);
        }
        this.g.clear();
        adtq.a(this.n);
    }

    public final void a(adpr adpr) {
        this.f.a(this.e.getString(adpr.h, new Object[]{h().bv_()}));
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(adpw adpw) {
        this.h = 0;
        this.n = adpw;
        L();
        this.m.a(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final adtw Q() {
        return new adst(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void J() {
        if (this.h != 2) {
            this.h = 2;
            int i = this.d;
            boolean z = false;
            boolean z2 = i == 2;
            if (z2 && G()) {
                z = true;
            }
            a(z, z2);
            adtq adtq = this.o;
            if (adtq != null) {
                adtq.b(i);
                return;
            }
            this.m.a(this);
        }
    }

    public final boolean G() {
        adtq adtq = this.o;
        if (adtq == null) {
            return false;
        }
        return adtq.G();
    }

    public final int d() {
        adtq adtq = this.o;
        if (adtq != null) {
            return adtq.d();
        }
        return this.h;
    }

    public final boolean b() {
        adtq adtq = this.o;
        return adtq != null ? adtq.d() == 0 : this.h == 0;
    }

    public final Integer c() {
        Integer num = this.b;
        if (num == null) {
            adtq adtq = this.o;
            if (adtq != null) {
                return adtq.c();
            }
            num = null;
        }
        return num;
    }

    public boolean f() {
        adtq adtq = this.o;
        if (adtq == null) {
            return false;
        }
        return adtq.f();
    }

    public final String g() {
        adtq adtq = this.o;
        return adtq != null ? adtq.g() : null;
    }

    public final void i() {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.i();
        }
    }

    public final void a(adqg adqg) {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.a(adqg);
        } else {
            this.g.add(adqg);
        }
    }

    public final void b(adqg adqg) {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.b(adqg);
        } else {
            this.g.remove(adqg);
        }
    }

    public final void b(adpw adpw) {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.b(adpw);
        } else {
            this.n = adpw;
        }
    }

    public void j() {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.j();
        }
    }

    public void k() {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.k();
        }
    }

    public final void l() {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.l();
        }
    }

    public final void m() {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.m();
        }
    }

    public final void n() {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.n();
        }
    }

    public final void a(long j) {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.a(j);
        }
    }

    public final long o() {
        adtq adtq = this.o;
        if (adtq == null) {
            return 0;
        }
        return adtq.o();
    }

    public final long p() {
        adtq adtq = this.o;
        if (adtq == null) {
            return 0;
        }
        return adtq.p();
    }

    public final long q() {
        adtq adtq = this.o;
        if (adtq == null) {
            return -1;
        }
        return adtq.q();
    }

    public final long r() {
        adtq adtq = this.o;
        if (adtq == null) {
            return -1;
        }
        return adtq.r();
    }

    public final String s() {
        adtq adtq = this.o;
        if (adtq != null) {
            return adtq.s();
        }
        return adpw.k.a();
    }

    public final String t() {
        adtq adtq = this.o;
        if (adtq != null) {
            return adtq.t();
        }
        return adpw.k.e();
    }

    public final boolean a(String str, String str2) {
        adtq adtq = this.o;
        if (adtq == null) {
            return true;
        }
        return adtq.a(str, str2);
    }

    public final adpy u() {
        adtq adtq = this.o;
        if (adtq != null) {
            return adtq.u();
        }
        return adpy.UNSTARTED;
    }

    public void a(int i, int i2) {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.a(i, i2);
        }
    }

    public void a(int i) {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.a(i);
        }
    }

    public final int v() {
        adtq adtq = this.o;
        if (adtq == null) {
            return 30;
        }
        return adtq.v();
    }

    public final void w() {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.w();
        }
    }

    public final void a(adih adih) {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.a(adih);
        }
    }

    public final adih x() {
        adtq adtq = this.o;
        if (adtq != null) {
            return adtq.x();
        }
        return adih.UNSUPPORTED;
    }

    public final void a(boolean z) {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.a(z);
        }
    }

    public final boolean y() {
        adtq adtq = this.o;
        return adtq != null && adtq.y();
    }

    public final void b(boolean z) {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.b(z);
        }
    }

    public final boolean z() {
        adtq adtq = this.o;
        return adtq != null && adtq.z();
    }

    public final void a(String str) {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.a(str);
        }
    }

    public final void a(ajis ajis) {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.a(ajis);
        }
    }

    public final aagr A() {
        adtq adtq = this.o;
        return adtq != null ? adtq.A() : null;
    }

    public final wxf B() {
        adtq adtq = this.o;
        return adtq != null ? adtq.B() : null;
    }

    public final void C() {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.C();
        }
    }

    public final void b(String str) {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.b(str);
        }
    }

    public final void a(List list) {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.a(list);
        }
    }

    public final void c(String str) {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.c(str);
        }
    }

    public final void d(String str) {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.d(str);
        }
    }

    public final void b(List list) {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.b(list);
        }
    }

    public final void e(String str) {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.e(str);
        }
    }

    public final void f(String str) {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.f(str);
        }
    }

    public final void D() {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.D();
        }
    }

    public final String E() {
        adtq adtq = this.o;
        if (adtq != null) {
            return adtq.E();
        }
        return adpw.k.e();
    }

    public final String F() {
        adtq adtq = this.o;
        if (adtq != null) {
            return adtq.F();
        }
        return adpw.k.a();
    }

    public final boolean H() {
        adtq adtq = this.o;
        if (adtq == null) {
            return false;
        }
        return adtq.H();
    }

    public final void g(String str) {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.g(str);
        }
    }

    public final void a(int i, String str, String str2) {
        adtq adtq = this.o;
        if (adtq != null) {
            adtq.a(i, str, str2);
        }
    }

    public final boolean a(adqd adqd) {
        adtq adtq = this.o;
        if (adtq == null) {
            return false;
        }
        return adtq.a(adqd);
    }

    static {
        xtl.b("MDX.DelegatingSession");
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(adpr adpr, int i, int i2) {
        a(adpr, i, Integer.valueOf(i2));
    }

    /* Access modifiers changed, original: protected */
    public void a(adpr adpr, int i) {
        a(adpr, i, null);
    }

    private final void a(adpr adpr, int i, Integer num) {
        amqw.b(this.o == null);
        a(adpr);
        if (num == null) {
            b(i);
        } else {
            b(i, num.intValue());
        }
    }

    public final int I() {
        int i = this.d;
        if (i != 1) {
            return i;
        }
        adtq adtq = this.o;
        if (adtq != null) {
            return adtq.I();
        }
        return 1;
    }
}
