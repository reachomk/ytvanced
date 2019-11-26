package defpackage;

import java.util.Observable;
import java.util.Observer;

/* renamed from: aiqf */
public final class aiqf implements aiqi, Observer {
    public final aiqh a;
    public final afjv b;
    public float c;
    public afjt d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public aiqy p = aiqy.a();
    public int q;
    public int r = 1;
    public int s = 1;
    private aiqd t;
    private boolean u;

    public aiqf(aiqh aiqh) {
        this.a = aiqh;
        this.b = new aiqe(this);
        this.c = 1.0f;
        this.q = 1;
        c();
    }

    public final float a() {
        if (this.p.b()) {
            return 0.0f;
        }
        return this.c;
    }

    private final void c(boolean z) {
        if (z != this.j) {
            this.j = z;
            g();
            e();
        }
    }

    public final void a(boolean z) {
        if (z != this.i) {
            this.i = z;
            g();
        }
    }

    public final void b() {
        a(false);
    }

    public final void a(aiqd aiqd) {
        aiqd aiqd2 = this.t;
        if (aiqd2 != null) {
            aiqd2.deleteObserver(this);
        }
        this.t = aiqd;
        aiqd = this.t;
        if (aiqd != null) {
            aiqd.addObserver(this);
        }
    }

    public final void update(Observable observable, Object obj) {
        if (observable == this.t && (obj instanceof Integer)) {
            airc n = n();
            int intValue = ((Integer) obj).intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue == 3 && n == airc.MINIMIZED) {
                            g();
                        }
                    } else if (n == airc.INLINE_IN_FEED) {
                        g();
                    }
                } else if (n == airc.FULLSCREEN) {
                    g();
                }
            } else if (n == airc.DEFAULT) {
                g();
            }
        }
    }

    public final void c() {
        a(null);
        this.d = null;
    }

    public final void b(boolean z) {
        if (z != this.m) {
            this.m = z;
            g();
        }
    }

    public final void a(aiqy aiqy) {
        if (!aiqy.equals(this.p)) {
            this.p = aiqy;
        }
    }

    public final aiqy d() {
        return this.p;
    }

    public final void e() {
        this.a.a.e_(new ahkl(this.r, this.j));
    }

    public final boolean f() {
        return this.j;
    }

    public final void g() {
        this.a.b.e_(j());
        this.b.notifyObservers();
    }

    public final int h() {
        if (this.t != null) {
            int ordinal = n().ordinal();
            if (ordinal == 0) {
                return this.t.a().b;
            }
            if (ordinal == 1) {
                return this.t.d().b;
            }
            if (ordinal == 2) {
                return this.t.b().b;
            }
            if (ordinal == 4) {
                return this.t.c().b;
            }
        }
        return -1;
    }

    public final int i() {
        if (this.t != null) {
            int ordinal = n().ordinal();
            if (ordinal == 0) {
                return this.t.a().c;
            }
            if (ordinal == 1) {
                return this.t.d().c;
            }
            if (ordinal == 2) {
                return this.t.b().c;
            }
            if (ordinal == 4) {
                return this.t.c().c;
            }
        }
        return -1;
    }

    public final ahjn j() {
        airc k = k();
        airc n = n();
        int h = h();
        int i = i();
        afjt afjt = this.d;
        boolean z = false;
        if (afjt != null && afjt.j()) {
            z = true;
        }
        return new ahjn(k, n, h, i, z, this.o);
    }

    public final void a(boolean z, aepu aepu) {
        if (z) {
            z = this.u;
            boolean z2 = this.j;
            this.u = z | (z2 ^ 1);
            if (!z2) {
                aepu.r();
                c(true);
            }
        } else if (this.u && this.j) {
            c(false);
            afjt afjt = this.d;
            if (afjt != null) {
                aepu.a(afjt);
            } else {
                xtl.c("Error: no UI elements available to display video");
            }
            this.u = false;
        }
    }

    private final airc n() {
        if (this.f) {
            return airc.FULLSCREEN;
        }
        if (this.e) {
            return airc.MINIMIZED;
        }
        if (this.l) {
            return airc.INLINE_IN_FEED;
        }
        return airc.DEFAULT;
    }

    public final airc k() {
        if (this.k) {
            return airc.REMOTE;
        }
        if (this.i) {
            return airc.BACKGROUND;
        }
        if (this.m) {
            return airc.VIRTUAL_REALITY;
        }
        if (this.g) {
            return airc.PICTURE_IN_PICTURE;
        }
        return n();
    }

    public final aiqg l() {
        return new aiqg(this.e, this.f, this.i, this.j, this.k, this.l, this.m, this.o, this.g, this.p, this.r);
    }

    public final int m() {
        return this.r;
    }
}
