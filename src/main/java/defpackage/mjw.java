package defpackage;

import android.content.res.Configuration;
import android.view.View;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import java.io.IOException;

/* renamed from: mjw */
public final class mjw implements exw, fjf, fjk, fjm, fjo {
    public final lyl a;
    public final fjg b;
    public final mjo c;
    public final exu d;
    public fiw e;
    public ezq f;
    public jpa g;
    public View h;
    public int i = 1;
    private final zzf j;
    private final fhk k;
    private final jtw l;
    private final lwc m;
    private final ebk n;
    private final hsr o;
    private final edz p;
    private final jjp q;
    private final zyw r;
    private final zzl s;
    private final bcaa t;
    private final bcaa u;
    private final bcaa v;
    private final bcaa w;
    private final bcaa x;

    public mjw(lyl lyl, zzf zzf, fjg fjg, fhk fhk, jtw jtw, lwc lwc, ebk ebk, hsr hsr, edz edz, jjp jjp, mjo mjo, exu exu, zyw zyw, zzl zzl, bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.k = fhk;
        this.a = lyl;
        this.j = zzf;
        this.b = fjg;
        this.l = jtw;
        this.m = lwc;
        this.n = ebk;
        this.o = hsr;
        this.p = edz;
        this.q = jjp;
        this.c = mjo;
        this.d = exu;
        this.r = zyw;
        this.s = zzl;
        this.t = bcaa;
        this.u = bcaa2;
        this.v = bcaa3;
        this.w = bcaa4;
        this.x = bcaa5;
    }

    /* Access modifiers changed, original: final */
    public final fiw h() {
        return this.b.a();
    }

    public final String b() {
        fja e = e();
        return e != null ? e.ag() : null;
    }

    public final void a(fiw fiw) {
        amqw.a((Object) fiw);
        a(fiw, this.i | 1);
    }

    public final fiw a() {
        return h();
    }

    public final void c() {
        b(false);
    }

    /* Access modifiers changed, original: final */
    public final void b(boolean z) {
        fiw h = h();
        int i = !z ? 0 : 2;
        fiw fiw = this.e;
        if (fiw != null) {
            a(fiw, this.i | i);
            this.e = null;
        } else if (z || h == null || fil.a(h)) {
            a(i(), (this.i | i) & -2);
        }
    }

    public final void a(boolean z) {
        if (!this.b.f()) {
            if (z) {
                this.a.finish();
            } else {
                a(i(), this.i | 2);
            }
        }
    }

    public final fiw i() {
        if (!this.n.a) {
            return gwd.aG();
        }
        fiw a;
        String str = "FElibrary";
        if (((eki) this.x.get()).b() && xss.c(this.a) == 4) {
            apgd apgd = (apgd) apge.j.createBuilder();
            apgd.a(str);
            apxx apxx = (apxx) apxu.d.createBuilder();
            apxx.a(BrowseEndpointOuterClass.browseEndpoint, (apge) ((anxl) apgd.build()));
            a = gwl.a((apxu) ((anxl) apxx.build()));
        } else if (!((eki) this.x.get()).b()) {
            eav eav = (eav) this.w.get();
            try {
                if (!((eki) this.x.get()).b()) {
                    a = gwd.aH();
                } else if (eav.b() == null) {
                    a = gwd.aG();
                } else {
                    a = gub.a(aaax.b(str), true);
                }
            } catch (IOException e) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 32);
                stringBuilder.append("Failed to get offline response: ");
                stringBuilder.append(valueOf);
                xtl.c(stringBuilder.toString());
            }
        } else if (((eki) this.x.get()).g()) {
            apxn a2 = this.r.a();
            if (a2 != null) {
                aulu aulu = a2.e;
                if (aulu == null) {
                    aulu = aulu.bw;
                }
                if (aulu.av) {
                    a = hrt.f();
                }
            }
            a = gwd.aH();
        } else {
            a = hrt.f();
        }
        return a;
    }

    /* Access modifiers changed, original: final */
    public final void a(fiw fiw, int i) {
        boolean a = fil.a(fiw);
        mkj mkj = (mkj) this.u.get();
        if (!this.a.U && (a || mkj.j != 0)) {
            int i2 = this.i;
            this.i = i;
            if (fiw.b.getBoolean("detail_pane", false)) {
                this.b.b(fiw);
            } else {
                this.b.a(fiw);
            }
            this.i = i2;
            return;
        }
        this.e = fiw;
    }

    public final fja d() {
        return this.b.b();
    }

    public final fja e() {
        fja d = d();
        if (d != null) {
            if (this.j.r() && d.v()) {
                return d;
            }
            if (!this.j.r() && d.u()) {
                return d;
            }
        }
        return null;
    }

    public final void f() {
        this.b.h();
    }

    public final void g() {
        this.b.m();
    }

    public final fjc a(fjc fjc) {
        boolean z = true;
        int i = this.i & 1;
        if (((mjy) this.t.get()).j() && i != 0) {
            this.m.e(true);
        }
        if (fjc.b() == 0) {
            fiw a = this.b.a();
            fiw a2 = fjc.a();
            if (!((this.i & 2) != 0 || gub.d(a2) || a2.e() || fjc.c())) {
                z = false;
            }
            if (a == null || !a.equals(a2) || fqb.a(a) || frf.a(a) || irr.a(a) || gub.c(a)) {
                ((jle) this.v.get()).a(a2);
                fjc = fjc.e().a(z).a();
            } else {
                if (z) {
                    this.b.h();
                }
                return fjc.e().a(-1).a();
            }
        }
        return fjc;
    }

    public final boolean a(fiw fiw, fiw fiw2) {
        amqv amqv = fiw2.c;
        if ((amqv != null && amqv.a(fiw)) || fiw.equals(fiw2) || fiw2.e() || gub.d(fiw2) || fil.a(fiw)) {
            return true;
        }
        if ((fqb.a(fiw) && fqb.a(fiw2)) || (frf.a(fiw) && frf.a(fiw2))) {
            return true;
        }
        if (hrt.a(fiw) && hrt.a(fiw2)) {
            return true;
        }
        if (gub.h(fiw) && gub.h(fiw2)) {
            return true;
        }
        if (irr.a(fiw)) {
            if (fiw2.b.getBoolean("preserve_search_nav_history", false)) {
                return false;
            }
            apxu a = fiw.a();
            if (a != null) {
                anxr access$000 = anxl.checkIsLite(SearchEndpointOuterClass.searchEndpoint);
                a.a(access$000);
                Object b = a.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                if (!((axcv) b).e.isEmpty()) {
                    return true;
                }
            }
            if (irr.a(fiw2)) {
                String str = "search_query";
                return fiw.a(str).equals(fiw2.a(str));
            }
        }
        return fiw.b.getBoolean("no_history", false);
    }

    public final void a(fjl fjl) {
        if (this.b.a() != null) {
            j();
            int i = fjl.a;
            boolean z = false;
            if (i == 0) {
                i = this.i;
                hsr hsr = this.o;
                if (((i & 1) ^ 1) != 0) {
                    z = true;
                }
                hsr.a(z);
            } else if (i == 1 || i == 2) {
                this.o.a(false);
            }
        }
    }

    public final void a(fja fja) {
        this.g.a(fja);
        this.a.r();
        this.a.J.b();
    }

    public final void a(int i, int i2) {
        if (this.b.a() != null) {
            j();
            this.o.a(false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
    private final void j() {
        /*
        r4 = this;
        r0 = r4.b;
        r0 = r0.a();
        if (r0 == 0) goto L_0x0093;
    L_0x0008:
        r1 = r4.h;
        if (r1 == 0) goto L_0x003c;
    L_0x000c:
        r1 = r0.a();
        r2 = r4.s;
        r1 = defpackage.gzd.a(r1, r2);
        r2 = 3;
        if (r1 != r2) goto L_0x002d;
    L_0x0019:
        r1 = r4.a;
        r1 = r1.getResources();
        r2 = 2131558451; // 0x7f0d0033 float:1.8742218E38 double:1.0531298027E-314;
        r3 = r4.a;
        r3 = r3.getTheme();
        r1 = defpackage.rz.b(r1, r2, r3);
        goto L_0x0037;
    L_0x002d:
        r1 = r4.a;
        r2 = 2130772256; // 0x7f010120 float:1.7147625E38 double:1.052741371E-314;
        r3 = 0;
        r1 = defpackage.xwe.a(r1, r2, r3);
    L_0x0037:
        r2 = r4.h;
        r2.setBackgroundColor(r1);
    L_0x003c:
        r1 = defpackage.iqu.a(r0);
        if (r1 == 0) goto L_0x004f;
    L_0x0042:
        r1 = r4.p;
        r1 = r1.a;
        r2 = new edf;
        r2.<init>();
        r1.d(r2);
        goto L_0x0060;
    L_0x004f:
        r1 = defpackage.fil.a(r0);
        if (r1 != 0) goto L_0x0060;
    L_0x0055:
        r1 = defpackage.gwd.i(r0);
        if (r1 != 0) goto L_0x0060;
    L_0x005b:
        r1 = r4.p;
        r1.a();
    L_0x0060:
        r1 = r4.r;
        r1 = defpackage.foh.I(r1);
        r2 = 0;
        if (r1 == 0) goto L_0x0071;
    L_0x0069:
        r1 = r4.k;
        if (r1 == 0) goto L_0x0071;
    L_0x006d:
        r1.a(r2);
        goto L_0x0078;
    L_0x0071:
        r1 = r4.l;
        if (r1 == 0) goto L_0x0078;
    L_0x0075:
        r1.a(r2);
    L_0x0078:
        r1 = r4.q;
        r1.b();
        r0 = defpackage.gub.a(r0);
        if (r0 != 0) goto L_0x0088;
    L_0x0083:
        r0 = r4.f;
        r0.j();
    L_0x0088:
        r0 = r4.t;
        r0 = r0.get();
        r0 = (defpackage.mjy) r0;
        r0.i();
    L_0x0093:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mjw.j():void");
    }

    /* Access modifiers changed, original: final|varargs */
    public final void a(int... iArr) {
        this.i = iArr[0] | this.i;
    }

    public final void a(Configuration configuration) {
        fja d = d();
        if (d != null) {
            int ad = d.ad();
            if ((Math.min(configuration.screenWidthDp, configuration.screenHeightDp) >= ad && !d().ac()) || (Math.min(configuration.screenWidthDp, configuration.screenHeightDp) < ad && d().ac())) {
                this.b.i();
            }
        }
    }
}
