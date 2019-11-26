package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: afep */
public final class afep extends afbp implements afdr {
    private static final aerl e;
    public final affx a;
    public final affx b;
    public boolean c;
    public boolean d;
    private aeuy f;
    private aeuy g;
    private aeuy h;
    private aajs i;
    private String j;
    private aajj k;
    private afkh l;
    private boolean m;
    private float n;
    private float o;
    private int p = 0;

    public afep(affx affx, affx affx2) {
        super(affx2);
        this.a = affx;
        this.b = affx2;
        this.h = aeuy.e;
    }

    public final afne a(aajs aajs, affa affa, String str, aajj aajj, afkh afkh, aeuy aeuy, float f, float f2, boolean z, int i) {
        aeuy aeuy2 = aeuy;
        this.i = aajs;
        this.j = str;
        this.k = aajj;
        this.h = aeuy2;
        this.f = new afet(new Handler(Looper.getMainLooper(), new afer(this, aeuy2)));
        this.g = new afet(new Handler(Looper.getMainLooper(), new afeo(this, aeuy2)));
        afkh afkh2 = (aajj.o() || aajs.n()) ? null : afkh;
        if (this.l != afkh2) {
            if (afkh2 == null) {
                r();
            } else {
                a(afkh2);
            }
        }
        this.n = f;
        this.o = f2;
        this.p = i;
        if (x()) {
            this.a.a(aajs, affa, str, aajj, afkh2, this.f, f, f2, z, i);
        } else if (aajs.a()) {
            aeuy2.a(new afif("fmt.unplayable", 0));
            this.i = null;
        } else {
            this.b.a(aajs, affa, str, aajj, afkh2, this.g, f, f2, z, i);
        }
        return afne.NATIVE_MEDIA_PLAYER;
    }

    public final afgv a(aajs aajs, aajj aajj, boolean z, afgt afgt, int i) {
        affx affx;
        if (z) {
            affx = this.b;
        } else {
            affx = this.a;
        }
        return affx.a(aajs, aajj, z, afgt, i);
    }

    public final boolean f() {
        boolean z = true;
        if (!super.f()) {
            if (this.c || this.d) {
                return this.m ? z : false;
            } else {
                z = false;
            }
        }
    }

    public final long v() {
        return this.c ? this.a.v() : super.v();
    }

    public final void m() {
        if (this.c) {
            z();
        } else if (this.d) {
            y();
        }
        super.m();
    }

    public final void b(long j) {
        if (this.c) {
            if (this.b.f()) {
                this.a.m();
            }
            z();
        } else if (this.d) {
            y();
        }
        super.b(j);
    }

    public final void a(boolean z) {
        this.a.a(z);
        this.b.a(z);
        this.i = null;
    }

    public final void p() {
        this.a.p();
        this.b.p();
        this.i = null;
    }

    public final void q() {
        this.a.q();
    }

    public final void a(float f) {
        this.n = f;
        super.a(f);
    }

    public final void b(float f) {
        this.o = f;
        super.b(f);
    }

    public final void a(afkh afkh) {
        this.l = afkh;
        this.a.a(afkh);
        if (this.d) {
            this.d = false;
            this.b.a(true);
        } else if (!x()) {
            if (this.b.f()) {
                aajs aajs = this.i;
                if (aajs != null) {
                    if (!this.c) {
                        this.a.a(this.i, new affa(this.b.o() + ((long) (!aajs.m() ? 4000 : 2000))), this.j, this.k, this.l, this.f, this.n, this.o, true, this.p);
                        this.c = true;
                        this.d = false;
                        this.m = this.b.f();
                        return;
                    }
                }
            }
            a(this.a);
            aajs aajs2 = this.i;
            if (aajs2 != null) {
                this.a.a(aajs2, new affa(this.b.o()), this.j, this.k, this.l, this.f, this.n, this.o, false, this.p);
                if (this.b.o() >= super.u()) {
                    this.h.f();
                }
            }
        }
    }

    public final void r() {
        this.l = null;
        aajs aajs = this.i;
        Object obj = (aajs == null || aajs.a() || !(this.a.f() || this.a.g())) ? null : 1;
        this.c = false;
        this.d = true;
        this.m = this.a.f();
        if (x() && obj != null) {
            this.b.a(this.i, new affa(this.a.o() + 200), this.j, this.k, this.l, this.g, this.n, this.o, true, this.p);
        } else {
            y();
        }
        this.a.r();
    }

    public final aerm k() {
        aerl aerl = e;
        aerl.c = this.i;
        return aerl.a();
    }

    public final boolean b(aajs aajs, aajj aajj) {
        boolean z = true;
        if (!aajs.c()) {
            if (aajs.m.isEmpty()) {
                z = false;
            } else if (aajs.o()) {
                return false;
            } else {
                return z;
            }
        }
        return z;
    }

    public final boolean x() {
        return h() == this.a;
    }

    public final void y() {
        this.d = false;
        a(this.b);
        this.a.p();
    }

    public final void z() {
        this.c = false;
        a(this.a);
        this.b.n();
    }

    public final /* bridge */ /* synthetic */ String l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ float s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final /* bridge */ /* synthetic */ int j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ int i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ int w() {
        return super.w();
    }

    public final /* bridge */ /* synthetic */ long u() {
        return super.u();
    }

    public final /* bridge */ /* synthetic */ long t() {
        return super.t();
    }

    public final /* bridge */ /* synthetic */ long o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ aahr e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ aahr d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ void bx_() {
        super.bx_();
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    static {
        aerl aerl = new aerl();
        aerl.a = afne.NATIVE_MEDIA_PLAYER;
        e = aerl;
    }
}
