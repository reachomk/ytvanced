package defpackage;

import android.os.Bundle;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: vvh */
public final class vvh implements aity, vve, vvt, xcp {
    public final bapu a;
    public final bapu b;
    public final bapu c;
    public final vxf d = vxc.a();
    public final bapu e;
    public boolean f;
    public boolean g;
    public boolean h;
    private final bapu i;
    private final xsc j;
    private final airt k;
    private vvf l;
    private aaga m;

    public vvh(bapu bapu, bapu bapu2, bapu bapu3, bapu bapu4, bapu bapu5, xci xci, xsc xsc, ajam ajam) {
        this.i = bapu;
        this.e = bapu2;
        this.a = bapu3;
        this.b = bapu4;
        this.c = bapu5;
        this.j = xsc;
        this.k = ajam.I();
        xci.a((Object) this);
        ajam.P().b.a(new vvg(this));
        ajam.Q().a.a(new vvj(this));
        ajam.Q().b.a(new vvi(this));
    }

    public final void a(vvf vvf) {
        vvf vvf2 = this.l;
        if (vvf2 != null) {
            vvf2.e = null;
        }
        this.l = vvf;
        vvf = this.l;
        if (vvf != null) {
            vvf.e = this;
        }
        if (!this.h) {
            ((vvr) this.e.get()).e = (vvt) amqw.a((Object) this);
            ((vuv) this.i.get()).d = (vvt) amqw.a((Object) this);
            this.h = true;
        }
    }

    public final void e() {
        a(null);
    }

    public final vvd f() {
        vvf vvf = this.l;
        return vvf != null ? vvf.a : null;
    }

    public final vxf g() {
        return this.d;
    }

    public final void h() {
        vvf vvf = this.l;
        if (vvf != null) {
            vvf.a.a(this.d.i());
        }
    }

    public final aaas i() {
        vvf vvf = this.l;
        return vvf != null ? vvf.c : null;
    }

    public final acvx j() {
        vvf vvf = this.l;
        return vvf != null ? vvf.b : null;
    }

    public final vva[] k() {
        vvf vvf = this.l;
        return vvf != null ? vvf.d : null;
    }

    public final void l() {
        this.m = null;
        this.g = false;
        this.d.a(((vvr) this.e.get()).a());
        ((vuv) this.i.get()).b();
        vxf vxf = this.d;
        vxf.a(false);
        vxf.b(false);
        vxf.a(-1);
        vxf.b(-1);
        vxf.c(-1);
        vxf.a(vxe.a().a());
        vxf.a(vyc.d().a());
        vxf.a(vxi.a().a());
        vxf.a(vxg.a().a());
        vxf.a(vya.h().a());
        h();
    }

    public final void a() {
        vuv vuv = (vuv) this.i.get();
        vvd f = vuv.d.f();
        if (!(f == null || vuv.b.a(f))) {
            boolean z = true;
            zj zjVar = new zj(1);
            zjVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", f);
            aoiu aoiu = vuv.g;
            apxu apxu;
            if (aoiu != null && vuv.a(aoiu) != null) {
                aoiq a = vuv.a(vuv.g);
                if ((a.a & 2) == 0) {
                    z = false;
                }
                amqw.b(z);
                apxu = a.c;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                vuv.a(apxu, zjVar);
            } else if (!(vuv.j == null && vuv.i == null)) {
                ((waw) vuv.a.get()).c();
                aoiu = vuv.g;
                if (aoiu == null || (aoiu.a & 16) == 0) {
                    apxu = vuv.i;
                    if (apxu != null) {
                        vuv.a(apxu, zjVar);
                        return;
                    }
                    vuv.a(aaax.a(vuv.j), zjVar);
                } else {
                    apxu = aoiu.e;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    vuv.a(apxu, zjVar);
                }
            }
        }
    }

    public final void a(Bundle bundle) {
        vuv vuv = (vuv) this.i.get();
        zj zjVar = new zj(2);
        if (bundle != null) {
            zjVar.put("com.google.android.libraries.youtube.innertube.bundle", bundle);
        }
        vvd f = vuv.d.f();
        if (f != null) {
            apxu apxu = vuv.f;
            if (apxu == null) {
                aoiu aoiu = vuv.g;
                if (aoiu != null) {
                    apxu = aoiu.k;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                }
            }
            if (apxu != null) {
                zjVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", f);
                vuv.a(apxu, zjVar);
            }
        }
    }

    public final void b() {
        vvr vvr = (vvr) this.e.get();
        vvr.a(this.d.b(), vvr.j, vvr.k);
    }

    public final void a(int i, int i2) {
        vvr vvr = (vvr) this.e.get();
        vvr.j = i;
        vvr.k = i2;
    }

    public final void c() {
        vuv vuv = (vuv) this.i.get();
        if (vuv.h != null) {
            waw waw = (waw) vuv.a.get();
            xak.a();
            if (waw.i != null) {
                waw.i.m();
            }
            vuv.a(vuv.h, null);
        }
    }

    public final void d() {
        vuv vuv = (vuv) this.i.get();
        vvd f = vuv.d.f();
        if (vuv.e != null && f != null) {
            zj zjVar = new zj(1);
            zjVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", f);
            vuv.a(vuv.e, zjVar);
        }
    }

    public final void a(boolean z) {
        this.d.a(((vvy) this.c.get()).a(this.d.h(), z));
        h();
    }

    public final void a(float f) {
        vyg b = this.d.b();
        if (b.f() != f) {
            b = b.q().a(f).a();
        }
        this.d.a(b);
        h();
    }

    public final void m() {
        vxf vxf = this.d;
        this.b.get();
        Object g = this.d.g();
        amqw.a(g);
        vxf = vxf.a(g.b().c(false).a());
        this.c.get();
        g = this.d.h();
        amqw.a(g);
        vxf.a(g.i().c(false).a());
        h();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        int i2 = i;
        Class[] clsArr = null;
        Class[] clsArr2;
        switch (i2) {
            case -1:
                clsArr = new Class[]{vou.class, vox.class, vpa.class, vqc.class, vqe.class, vwr.class};
                break;
            case 0:
                a(null);
                break;
            case 1:
                clsArr2 = null;
                a();
                break;
            case 2:
                vpa vpa = (vpa) obj;
                if (!this.h) {
                    clsArr2 = null;
                    break;
                }
                this.f = vpa.a == vpb.AD_VIDEO_PLAYING;
                if (vpa.a.a()) {
                    aaga aaga = vpa.f;
                    if (!(aaga == null || aaga.ah() != null || aagr.a.equalsIgnoreCase(vpa.f.m()))) {
                        if (this.m == null) {
                            int i3;
                            vxf vxf;
                            int convert;
                            vxg a;
                            ajxu ajxu;
                            l();
                            this.m = vpa.f;
                            boolean a2 = this.d.c().a();
                            if (a2 && vpa.d != null) {
                                aaga aaga2 = this.m;
                                if (aaga2 instanceof aagr) {
                                    aagt an = ((aagr) aaga2).an();
                                    an.g = vpa.d.x();
                                    this.m = (aagr) an.b();
                                }
                            }
                            vxf vxf2 = this.d;
                            vvr vvr = (vvr) this.e.get();
                            aaga aaga3 = this.m;
                            vrd vrd = vpa.e;
                            vrh vrh = vpa.c;
                            awdg awdg = vpa.d.n().c;
                            if ((awdg.a & 16777216) != 0) {
                                aoki aoki = awdg.p;
                                if (aoki == null) {
                                    aoki = aoki.c;
                                }
                                i3 = aoki.b;
                            } else {
                                i3 = -1;
                            }
                            vsm vsm = vpa.b;
                            vyg a3 = vvr.a();
                            vvr.f = vrh;
                            vyj q = a3.q();
                            if (aaga3.ai() != null) {
                                q.a(aaga3.ai());
                            }
                            q.a(vrd);
                            if (i3 >= 0) {
                                vxf = vxf2;
                                convert = (int) TimeUnit.SECONDS.convert((long) i3, TimeUnit.MILLISECONDS);
                            } else {
                                vxf = vxf2;
                                convert = -1;
                            }
                            Object obj2 = (!aaga3.p() || aaga3.n() <= 7) ? null : 1;
                            int i4 = obj2 == null ? 2 : 0;
                            vvr.c.d(new voy(i4, vrh));
                            if (obj2 != null) {
                                int i5 = 5000;
                                if (convert >= 0) {
                                    i5 = (int) TimeUnit.MILLISECONDS.convert((long) convert, TimeUnit.SECONDS);
                                    vvr.h = i5;
                                } else {
                                    vvr.h = 5000;
                                }
                                q.b(i5);
                            }
                            convert = (int) TimeUnit.MILLISECONDS.convert((long) aaga3.n(), TimeUnit.SECONDS);
                            vvr.i = convert;
                            q.c(convert);
                            if (aaga3.q() != null) {
                                ajxu ajxu2 = aaga3.q().a;
                                if (ajxu2 != null) {
                                    q.b(ajxu2.y != null);
                                }
                            }
                            q.a(vsm);
                            if (obj2 != null) {
                                vrk vrk = vvr.d;
                                if (vrk.h) {
                                    float f = vrk.i;
                                    convert = vrk.j;
                                    if (f == 0.0f || convert == 0) {
                                        afpc.a(2, afpf.ad, String.format(Locale.ENGLISH, "Unexpected custom dimensions: scaling factor %f, padding %d", new Object[]{Float.valueOf(f), Integer.valueOf(convert)}));
                                    } else {
                                        q.e(true);
                                        q.b(f);
                                        q.d(convert);
                                    }
                                } else if (vrk.g) {
                                    q.d(true);
                                }
                            }
                            vxf a4 = vxf.a(q.a(i4).a());
                            this.b.get();
                            Object obj3 = this.m;
                            airc airc = this.k.g().a;
                            amqw.a(obj3);
                            vxj a5 = vxg.a();
                            aphg aj = obj3.aj();
                            if (aj == null) {
                                a = a5.a();
                            } else {
                                a5.a(aj).a(true);
                                if (obj3.q() != null) {
                                    ajxu = obj3.q().a;
                                    a5.c(vrm.a(ajxu.h) != null);
                                    a5.d(ajxu.y != null);
                                }
                                a = a5.b(airc == airc.FULLSCREEN).a();
                            }
                            a4 = a4.a(a);
                            this.c.get();
                            obj3 = this.m;
                            airc = this.k.g().a;
                            amqw.a(obj3);
                            vyd h = vya.h();
                            apfy ak = obj3.ak();
                            boolean z = ak != null;
                            if (z) {
                                h.a(ak);
                            }
                            if (obj3.q() != null) {
                                ajxu = obj3.q().a;
                                if (ajxu != null) {
                                    h.c(vrm.a(ajxu.h) != null);
                                    h.d(ajxu.y != null);
                                }
                            }
                            h.e(airc == airc.FULLSCREEN);
                            a4.a(h.b(z).a(z ^ 1).a()).a(this.d.d().b().a(vpa.e).a());
                            h();
                            ((vuv) this.i.get()).a(this.m, vpa.d, false, a2);
                        }
                        if (!this.f || !this.m.a(this.j)) {
                            clsArr2 = null;
                            clsArr = clsArr2;
                            break;
                        }
                        aakj aakj = vpa.d;
                        if (this.d.a()) {
                            clsArr = null;
                            break;
                        }
                        vzc a6 = vzc.a(aakj.c(), aakj.g());
                        vxf vxf3 = this.d;
                        vxf3.a(vxf3.b().q().a(a6).a()).a(true);
                        h();
                        return null;
                    }
                }
                clsArr2 = null;
                if (vpa.a == vpb.AD_VIDEO_ENDED) {
                    l();
                    return clsArr2;
                }
                clsArr = clsArr2;
                break;
            case 3:
                vqc vqc = (vqc) obj;
                if (!vqc.c) {
                    l();
                    break;
                } else if (!this.g) {
                    this.g = true;
                    this.d.a(true);
                    this.d.a(vyg.p().a(true).a());
                    ((vuv) this.i.get()).a(vqc.b, vqc.a, true, this.d.c().a());
                    return null;
                }
                break;
            case 4:
                vvr vvr2 = (vvr) this.e.get();
                vyg b = this.d.b();
                if (vvr.a(b)) {
                    vvr2.a(b, -1, -1);
                    return null;
                }
                break;
            case 5:
                vwr vwr = (vwr) obj;
                if (this.h) {
                    vvr vvr3 = (vvr) this.e.get();
                    vvd f2 = vvr3.e.f();
                    if (f2 != null && vwr.a == f2) {
                        if (vwr.a() == 2) {
                            vvr3.g = true;
                            vvr3.b.b();
                            aizy aizy = vvr3.b;
                            if (aizy.D() != null) {
                                aizy.D().k();
                                return null;
                            }
                        } else if (vwr.a() == 3 && vvr3.g) {
                            vvr3.g = false;
                            vrh vrh2 = vvr3.f;
                            if (vrh2 != null) {
                                vrh2.a();
                                return null;
                            }
                        }
                    }
                }
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i2);
                throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
