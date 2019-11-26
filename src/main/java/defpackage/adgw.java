package defpackage;

import android.text.TextUtils;

/* renamed from: adgw */
public final class adgw extends bbe implements xcp {
    private static final String c = xtl.b("MDX.MediaRouteManager");
    public bbs a;
    public adhs b;
    private final bapu d;
    private final xci e;
    private final bapu f;
    private final bapu g;
    private final bapu h;
    private final bapu i;
    private final bapu j;
    private final bapu k;
    private final bapu l;
    private final bapu m;
    private final bapu n;
    private final bapu o;
    private final bapu p;
    private int q = 0;
    private boolean r;
    private adqe s;
    private adis t;
    private wxg u;
    private adgz v;

    public adgw(bapu bapu, xci xci, bapu bapu2, bapu bapu3, bapu bapu4, bapu bapu5, bapu bapu6, bapu bapu7, bapu bapu8, bapu bapu9, bapu bapu10, bapu bapu11, bapu bapu12) {
        this.d = bapu;
        this.e = xci;
        this.g = bapu2;
        this.h = bapu3;
        this.i = bapu4;
        this.j = bapu5;
        this.k = bapu6;
        this.l = bapu7;
        this.n = bapu8;
        this.f = bapu9;
        this.m = bapu10;
        this.o = bapu11;
        this.p = bapu12;
    }

    private final synchronized void a(boolean z) {
        adhs adhs = this.b;
        if (adhs != null) {
            String str = adhs.a;
            int a = adhs.a();
            String str2 = a != 1 ? a != 2 ? a != 3 ? a != 4 ? "null" : "BLUETOOTH" : "CAST" : "DIAL" : "CLOUD";
            String.valueOf(str).length();
            str2.length();
        }
        this.e.d(new adht(this.b, z));
    }

    private final void g() {
        this.e.d(new adhu());
    }

    public final void d() {
        xak.a();
        h();
        int i = this.q;
        this.q = i + 1;
        if (i == 0) {
            b((Object) this);
            admk admk = (admk) this.o.get();
            admk.g.a(admk.d.a(admk.f));
            admk.g.a(admk.e.a(admk.f));
            ((bbb) this.d.get()).a((baz) this.h.get(), (bbe) this);
            adgt adgt = (adgt) this.l.get();
            if (adgt.g.a()) {
                adgt.f.a(adgt.h);
                adgt.a();
            }
            adqe adqe = this.s;
            this.b = e(bbb.c());
            if (this.b != null) {
                this.a = bbb.c();
                this.s = ((adqf) this.g.get()).c();
                if (this.b.a() == 4 && this.i.get() != null) {
                    ((aiqf) this.i.get()).a(new aiqy(5, 3));
                }
            } else {
                if (this.s != null) {
                    xtl.c(c, "onStart: disconnecting previously selected mdx session");
                    this.s.a();
                }
                this.a = null;
                this.s = null;
            }
            if (adqe != this.s) {
                a(false);
            }
        }
    }

    public final void a(Object obj) {
        xak.a();
        h();
        ((adfc) this.n.get()).a(obj, true);
    }

    public final void b(Object obj) {
        xak.a();
        h();
        ((adfc) this.n.get()).a(obj, false);
    }

    public final void c(Object obj) {
        xak.a();
        ((adfc) this.n.get()).a(obj);
        i();
    }

    private final void h() {
        if (!this.r) {
            ((adqf) this.g.get()).a();
            this.r = true;
        }
    }

    private final void i() {
        if (this.r) {
            Object obj;
            adfc adfc = (adfc) this.n.get();
            xak.a();
            synchronized (adfc.c) {
                obj = 1;
                if (adfc.a.isEmpty()) {
                    if (adfc.b.isEmpty()) {
                        obj = null;
                    }
                }
            }
            if (obj == null && this.q <= 0) {
                ((adqf) this.g.get()).b();
                this.r = false;
            }
        }
    }

    public final void e() {
        xak.a();
        int i = this.q - 1;
        this.q = i;
        if (i == 0) {
            ((admk) this.o.get()).g.a();
            adgt adgt = (adgt) this.l.get();
            adgt.f.b(adgt.h);
            adgt.b.removeCallbacks(adgt.i);
            if (this.s == null) {
                ((adfc) this.n.get()).a((Object) this);
                ((bbb) this.d.get()).a((bbe) this);
            }
            i();
        }
    }

    public final void a(adis adis, wxg wxg) {
        xak.a();
        if ((adis instanceof adiq) || (adis instanceof adio)) {
            String str = c;
            String valueOf = String.valueOf(adis);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 24);
            stringBuilder.append("Selecting mdx route for ");
            stringBuilder.append(valueOf);
            xtl.c(str, stringBuilder.toString());
            bbs a = a(adis);
            if (a == null) {
                this.t = adis;
                this.u = wxg;
                return;
            }
            f(a);
            wxg.a((Object) adis, Boolean.valueOf(true));
            return;
        }
        wxg.a((Object) adis, new IllegalArgumentException("screen must be DIAL or Cloud"));
    }

    public final boolean a(bbs bbs, adpw adpw) {
        amqw.a((Object) bbs);
        amqw.a((Object) adpw);
        amqw.a(adpw.l());
        return b(bbs, adpw);
    }

    public final void f() {
        this.d.get();
        bbs c = bbb.c();
        bbs b = bbb.b();
        if (b != c) {
            adgc adgc = (adgc) this.m.get();
            String str = c.c;
            adgh a = adgh.b().a(true).a();
            amqw.a(1 ^ TextUtils.isEmpty(str));
            synchronized (adgc.f) {
                adgc.e = amqs.a(str, a);
            }
            f(b);
        }
    }

    public final boolean b(bbs bbs, adpw adpw) {
        xak.a();
        if (d(bbs)) {
            adgc adgc = (adgc) this.m.get();
            String str = bbs.c;
            adgf a = adgf.b().a(adpw).a();
            synchronized (adgc.d) {
                adgc.c = amqs.a(str, a);
            }
            f(bbs);
            return true;
        }
        xtl.b(c, "unable to select non youtube mdx route");
        return false;
    }

    public final bbs a(String str) {
        adis b = ((adqc) this.k.get()).b(str);
        return b != null ? a(b) : null;
    }

    private final bbs a(adis adis) {
        this.d.get();
        for (bbs bbs : bbb.a()) {
            if (adhn.a(bbs) && bbs.r != null) {
                adis a = ((adqc) this.k.get()).a(bbs.r);
                if (a != null && adis.b().equals(a.b())) {
                    return bbs;
                }
            }
        }
        return null;
    }

    public final void a(bbs bbs) {
        String str = c;
        String valueOf = String.valueOf(bbs);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 29);
        stringBuilder.append("MediaRouter.onRouteSelected: ");
        stringBuilder.append(valueOf);
        xtl.c(str, stringBuilder.toString());
        this.b = e(bbs);
        adhs adhs = this.b;
        if (adhs != null) {
            int a = adhs.a();
            int i = a - 1;
            if (a != 0) {
                if (i == 0 || i == 1 || i == 2) {
                    this.s = ((adqf) this.g.get()).c();
                } else if (i == 3 && this.i.get() != null) {
                    ((aiqf) this.i.get()).a(new aiqy(5, 3));
                }
                this.a = bbs;
            } else {
                throw null;
            }
        }
        this.a = null;
        this.s = null;
        this.t = null;
        this.u = null;
        a(true);
    }

    public final void b(bbs bbs) {
        String str = c;
        String valueOf = String.valueOf(bbs);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 31);
        stringBuilder.append("MediaRouter.onRouteUnselected: ");
        stringBuilder.append(valueOf);
        xtl.c(str, stringBuilder.toString());
        bbs bbs2 = this.a;
        if (bbs2 != null && bbs2.equals(bbs)) {
            int a = this.b.a();
            int i = a - 1;
            if (a != 0) {
                if (i == 3) {
                    bapu bapu = this.i;
                    if (bapu != null) {
                        ((aiqf) bapu.get()).a(new aiqy());
                    }
                }
                this.s = null;
                this.b = null;
                this.a = null;
                a(true);
                return;
            }
            throw null;
        }
    }

    public final void a(bbb bbb, bbs bbs) {
        String.valueOf(bbs).length();
        if (!(this.t == null || !adhn.a(bbs) || bbs.r == null)) {
            adis a = ((adqc) this.k.get()).a(bbs.r);
            if (a != null && this.t.b().equals(a.b())) {
                f(bbs);
                wxg wxg = this.u;
                if (wxg != null) {
                    wxg.a(this.t, Boolean.valueOf(true));
                }
                this.t = null;
                this.u = null;
            }
        }
        if (e(bbs) != null) {
            g();
        }
    }

    public final void c(bbb bbb, bbs bbs) {
        String.valueOf(bbs).length();
        if (e(bbs) != null) {
            g();
        }
    }

    public final void b(bbb bbb, bbs bbs) {
        String.valueOf(bbs).length();
        if (e(bbs) != null) {
            g();
        }
    }

    private final adhs e(bbs bbs) {
        this.d.get();
        if (!bbs.equals(bbb.b()) && bbs.a((baz) this.h.get())) {
            adhn adhn = (adhn) this.f.get();
            if (adhn.b(bbs, "android.media.intent.category.LIVE_AUDIO")) {
                adhn.c.get();
                if (!bbs.equals(bbb.b())) {
                    return new adhs(bbs.c, bbs.d, adhr.c);
                }
            }
            String str;
            String valueOf;
            StringBuilder stringBuilder;
            if (adhn.a(bbs)) {
                if (bbs.r != null) {
                    adis a = ((adqc) this.k.get()).a(bbs.r);
                    if (a == null) {
                        xtl.a(c, "Can not get MDx screen from the route info");
                        return null;
                    } else if (a instanceof adio) {
                        return new adhs(bbs.c, bbs.d, adhr.a);
                    } else {
                        if (a instanceof adiq) {
                            return new adhs(bbs.c, bbs.d, new adhr(2));
                        }
                        str = c;
                        valueOf = String.valueOf(a);
                        stringBuilder = new StringBuilder(valueOf.length() + 38);
                        stringBuilder.append("Can not determine the type of screen: ");
                        stringBuilder.append(valueOf);
                        xtl.a(str, stringBuilder.toString());
                        return null;
                    }
                }
                xtl.a(c, "Can not find screen from MDx route");
            } else if (((adhn) this.f.get()).d(bbs)) {
                return new adhs(bbs.c, bbs.d, adhr.b);
            } else {
                valueOf = c;
                str = String.valueOf(bbs);
                stringBuilder = new StringBuilder(str.length() + 28);
                stringBuilder.append("Unknown type of route info: ");
                stringBuilder.append(str);
                xtl.a(valueOf, stringBuilder.toString());
                return null;
            }
        }
        return null;
    }

    public final boolean d(bbs bbs) {
        return ((adhn) this.f.get()).d(bbs) || adhn.a(bbs);
    }

    private final synchronized void f(bbs bbs) {
        if (this.v == null) {
            this.v = (adgz) this.p.get();
        }
        adgz adgz = this.v;
        if (adgz.b && adgz.a.d(bbs)) {
            if (!adgz.c.a) {
                adgz.d.a(bbs);
                return;
            }
        }
        bbs.e();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{adqk.class, ahjl.class};
        } else if (i != 0) {
            if (i == 1) {
                this.d.get();
                bbb.a(((ajlg) this.j.get()).e());
                return null;
            }
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (((adqk) obj).a != null) {
            return null;
        } else {
            this.d.get();
            if (d(bbb.c())) {
                f(bbb.b());
            }
            this.s = null;
            a(false);
            return null;
        }
    }
}
