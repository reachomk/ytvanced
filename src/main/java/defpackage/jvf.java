package defpackage;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jvf */
public final class jvf extends apv implements ajan, OnClickListener, ejc, fgb, fgs, fgt, xcp {
    public final zyw a;
    public final fhk b;
    public final jtw c;
    public final lwc d;
    public final jvj e = new jvj(this);
    public ffx f;
    public jvc g;
    public fgv h;
    private final ffw i;
    private final elv j;
    private final hvc k;
    private final ahml l;
    private final zzl m;
    private final hcy n;
    private final llg o;
    private final jvi p;
    private final fgc q;
    private final jut r;
    private final foj s = new fop(this.e);
    private boolean t;

    public jvf(zyw zyw, fhk fhk, fga fga, ffw ffw, jtw jtw, elv elv, lwc lwc, jur jur, fgc fgc, jup jup, llg llg, jvn jvn, jut jut, jug jug, htw htw, jty jty, ahml ahml, zzl zzl, hcy hcy, jun jun) {
        lwc lwc2 = lwc;
        fgc fgc2 = fgc;
        fgs fgs = jvn;
        fgs fgs2 = jut;
        fgs fgs3 = jug;
        this.a = zyw;
        this.b = fhk;
        this.k = htw;
        this.i = ffw;
        this.c = jtw;
        this.j = elv;
        this.d = lwc2;
        this.l = ahml;
        this.q = fgc2;
        this.r = fgs2;
        this.p = fgs3;
        this.m = zzl;
        this.n = hcy;
        this.o = llg;
        fgc2.a((fgt) this);
        fgc2.a((fgt) jur);
        fgc.a((fgt) jup);
        fgc2.a((fgs) this);
        fgc2.a(fgs3);
        fgc2.a(fgs);
        fgc2.a(fgs2);
        fgc2.a((fgs) jty);
        fgc2.a((fgs) jun);
        lwc.a(this);
        lwc.a(fgs);
        fga.d.add(fgs2);
    }

    public final long e() {
        return 1;
    }

    public final void a(ffx ffx) {
        c(ffx);
    }

    public final void b(ffx ffx) {
        if (this.f == ffx) {
            c(null);
        }
    }

    public final void c(ffx ffx) {
        ffx ffx2 = this.f;
        if (ffx2 != ffx) {
            View a;
            if (!(ffx2 == null || ffx2.a() == null)) {
                a = ffx2.a();
                if (a instanceof RecyclerView) {
                    ((RecyclerView) a).b((apv) this);
                }
            }
            if (!(ffx == null || ffx.a() == null)) {
                a = ffx.a();
                if (a instanceof RecyclerView) {
                    ((RecyclerView) a).a((apv) this);
                }
            }
            ffx2 = this.f;
            if (ffx2 != null) {
                ffx2.a(false);
            }
            this.q.g();
            this.f = ffx;
            if (!foh.I(this.a)) {
                this.c.a(ffx);
            } else if (ffx instanceof fhq) {
                this.b.a((fhq) ffx);
                this.b.g();
            } else {
                this.b.a(null);
            }
            this.r.f = ffx;
            if (ffx != null) {
                ffx.a(true);
            }
        }
    }

    public final void a(ffu ffu, int i, int i2) {
        fob fob = ffu.b;
        if (i2 != 1) {
            if (i2 == 4) {
                ahml ahml = this.l;
                Object b = fob.b();
                amqw.a(b);
                ahkn ahkn = ahml.f;
                if (ahkn != null) {
                    aakj aakj = ahkn.b;
                    if (aakj != null) {
                        String b2 = aakj.b();
                        if (b2 != null && TextUtils.equals(b, b2)) {
                            aakj aakj2 = ahml.f.b;
                            aakb aakb = (aakj2 == null || aakj2.m() == null) ? null : aakj2.m().e;
                            if (aakb != null) {
                                xvo a = xvo.a((Uri) aakb.b.get());
                                a.b("etype", String.valueOf(18));
                                try {
                                    Uri a2 = ahml.e.a(a.a(), null);
                                    if (!(ahml.f == null || a2 == null || !TextUtils.equals(ahml.e.a(a2.buildUpon().build(), "VSS_CPN", new aftl[0]), ahml.f.e))) {
                                        ahml.a.execute(new ahmm(ahml, a2, new acyp(aakb.c), ahml.d.c()));
                                    }
                                } catch (xwd e) {
                                    String valueOf = String.valueOf(e);
                                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 32);
                                    stringBuilder.append("Failed to substitute URI macros ");
                                    stringBuilder.append(valueOf);
                                    xtl.d(stringBuilder.toString());
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        this.g = new jvc(this.j, this.p, fob);
        if (this.q.a(fob) != 1 && !this.d.c().m()) {
            return;
        }
        if (this.g.a.g()) {
            this.d.l();
        } else if (this.g.a.h()) {
            this.d.m();
        } else {
            this.d.k();
        }
    }

    public final boolean a(fob fob, int i, fgv fgv) {
        boolean z = true;
        if (i == 0) {
            a();
        } else if (i == 3 && this.f != null && b()) {
            i = this.q.a(fob);
            boolean a = this.i.a();
            boolean f = this.f.f();
            Object obj = (i == 1 || a || f) ? 1 : null;
            if (this.d.c().g() && obj != null) {
                i = i == 1 ? 2 : !f ? 0 : 1;
                if (this.q.a(fob) != 3) {
                    z = false;
                }
                return a(i, z, fgv);
            }
        }
        return true;
    }

    public final void a(fob fob) {
        a();
    }

    private final void a() {
        jvc jvc = this.g;
        if (jvc != null) {
            if (jvc.c) {
                d();
                if (b()) {
                    this.p.a(this.g.a());
                }
            }
            c();
            this.g = null;
            if (this.d.c().g() && this.o.aF_()) {
                this.d.g(false);
            }
        }
    }

    private final boolean b() {
        return this.d.c().g() && this.g != null;
    }

    public final void a(ejd ejd, ejd ejd2) {
        this.n.a = ejd2.h();
        if (this.f != null) {
            if (ejd2.a() && this.f.b()) {
                this.f.d();
            } else {
                this.f.e();
            }
            if (this.g != null && ejd.g() && !ejd2.g()) {
                c();
                d();
                this.g.b();
            }
        }
    }

    public final void onClick(View view) {
        if (!b()) {
            return;
        }
        if (this.p.h()) {
            c();
            jvc jvc = this.g;
            if (jvc != null && jvc.c) {
                jvc.b.k();
                return;
            }
            return;
        }
        a(2, false, null);
    }

    public final void a(RecyclerView recyclerView, int i) {
        boolean z = i == 2;
        this.t = z;
        if (!z) {
            this.s.a();
        }
    }

    public final void a(ahkn ahkn) {
        if (b()) {
            jvc jvc = this.g;
            if (jvc.c && TextUtils.equals(jvc.b.g(), jvc.a.b()) && this.f != null && this.i.a() && ahkn.a == airi.ENDED) {
                this.f.c();
            }
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.f().a(emg.a(this.a, 536870912, 1)).a(new jve(this), jvh.a)};
    }

    private final boolean a(int i, boolean z, fgv fgv) {
        c();
        if ((i == 0 || i == 1) && !z && this.t) {
            this.h = fgv;
            this.s.a(new jvg(this, i));
            return false;
        }
        this.g.a(i, z);
        return true;
    }

    private final void c() {
        this.s.b();
        fgv fgv = this.h;
        if (fgv != null) {
            fgv.a();
            this.h = null;
        }
    }

    private final void d() {
        ajmq i = this.p.i();
        if (i != null && this.g != null && i.d() - this.g.a().g() > ((long) foh.d(this.m))) {
            this.k.c();
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
