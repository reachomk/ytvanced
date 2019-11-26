package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: waw */
public final class waw {
    public final afti a;
    public final wan b;
    public final war c;
    public final vug d;
    public final vrk e;
    public final Map f = new HashMap();
    public final Map g = new HashMap();
    public wao h;
    public volatile was i;

    public waw(afti afti, wan wan, war war, vug vug, vrk vrk, ajam ajam, bctz bctz) {
        this.a = afti;
        this.b = wan;
        this.c = war;
        this.d = vug;
        this.e = vrk;
        ajam.Q().b.a(new wav(this), way.a);
        ajam.Q().a.a(new waz(this), wbc.a);
        ajam.Q().d.a(new wbb(this), wbe.a);
        bctz.c().c(wbd.a).a(new wbg(this), wbf.a);
        bctz.c().c(wbi.a).a(new wax(this), wba.a);
    }

    public final void a(String str, vqy vqy, vso vso) {
        if (this.i != null) {
            this.i.b();
        }
        g();
        this.i = this.c.b(this.d.a(vqy, vso), str, vqy, vso);
    }

    public final void a(aagr aagr, String str) {
        xak.a();
        this.i = this.c.a(this.d.a((aage) aagr), aagr, str);
    }

    public final boolean a(aakj aakj) {
        return (this.i != null || aakj == null || vmv.a(aakj) == null) ? false : true;
    }

    public final void a(vra vra) {
        xak.a();
        if (this.i != null) {
            this.i.a(vra);
        }
    }

    public final void a(ahkm ahkm, boolean z) {
        xak.a();
        if (z == (this.i instanceof wbt)) {
            if (this.i != null) {
                this.i.a(ahkm);
            }
            wao wao = this.h;
            if (wao != null) {
                wao.a(ahkm);
            }
        }
    }

    public final void a() {
        xak.a();
        if (this.i != null) {
            this.i.g();
        }
    }

    public final void b() {
        xak.a();
        if (this.i != null) {
            this.i.e();
        }
    }

    public final void a(int i, int i2) {
        xak.a();
        if (this.i != null) {
            this.i.a(i, i2);
        }
    }

    public final void a(vtb vtb) {
        xak.a();
        if (this.i != null) {
            this.i.a(vtb);
        }
    }

    public final void c() {
        xak.a();
        if (this.i != null) {
            this.i.f();
        }
    }

    public final void d() {
        xak.a();
        if (this.i != null) {
            this.i.j();
        }
    }

    public final void e() {
        if (this.i != null) {
            this.i.l();
        }
        g();
    }

    private final void g() {
        if (this.i != null) {
            this.i.b();
            this.i = null;
        }
    }

    public final void a(vqy vqy) {
        if (vqy != null) {
            if (this.h == null) {
                this.h = this.b.a(this.d.a((vtl) vqy), vqy);
            }
            this.h.a();
        }
    }

    public final void f() {
        wao wao = this.h;
        if (wao != null) {
            wao.b();
            this.h = null;
        }
    }
}
