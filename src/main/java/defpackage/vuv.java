package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: vuv */
public final class vuv {
    public final bcaa a;
    public final vod b;
    public final Set c;
    public vvt d;
    public apxu e;
    public apxu f;
    public aoiu g;
    public apxu h;
    public apxu i;
    public Uri j;
    private final abka k;
    private final xci l;
    private final zzl m;
    private WeakReference n = new WeakReference(null);
    private boolean o;
    private boolean p;
    private ajwf q;

    public vuv(abka abka, bcaa bcaa, vod vod, xci xci, zzl zzl) {
        this.k = abka;
        this.a = bcaa;
        this.b = vod;
        this.l = xci;
        this.m = zzl;
        this.c = new HashSet();
    }

    @Deprecated
    public final void a(vuu vuu) {
        this.c.add(vuu);
    }

    @Deprecated
    public final void b(vuu vuu) {
        this.c.remove(vuu);
    }

    public final void a(aaga aaga, aakj aakj, boolean z, boolean z2) {
        b();
        this.o = z;
        this.p = z2;
        this.i = aaga.V();
        this.j = aaga.U();
        this.q = aaga.ag();
        this.f = aaga.am();
        if (!(aaga.q() == null || aaga.q().e() == null)) {
            apxu apxu = aaga.q().e().b;
            if (apxu == null) {
                apxu = apxu.d;
            }
            this.e = apxu;
        }
        if (TextUtils.isEmpty(aaga.d())) {
            vxf g = this.d.g();
            z2 = false;
            boolean z3 = aaga.U() != null;
            if (z3) {
                g.a(vyc.d().b(true).a((CharSequence) "<NONE>").a());
            }
            if (this.f != null) {
                z2 = true;
            }
            if (z2) {
                g.a(g.d().b().a(true).a());
            } else {
                afpc.a(2, afpf.ad, "No WTA for non-YT hosted ad.");
            }
            if (z3 || z2) {
                if (!wcf.e(this.m)) {
                    for (vuu a : this.c) {
                        a.a(aakj);
                    }
                }
                this.d.h();
                this.l.d(new vvk(null, z3, z2));
            }
            this.g = null;
        } else if (this.k != null && (this.p || !wcf.e(this.m))) {
            abkg a2 = this.k.a();
            a2.c(aaga.d());
            a2.n();
            if (aaga.j() == null || aaga.j().length <= 0) {
                xtl.c("Ad Watch Next Request Missing Tracking Params. See b/22612847");
            } else {
                a2.a(aaga.j());
            }
            String str = "";
            a2.d(!TextUtils.isEmpty(aaga.h()) ? aaga.h() : str);
            if (!TextUtils.isEmpty(aaga.i())) {
                str = aaga.i();
            }
            a2.e(str);
            this.n = new WeakReference(new vux(this, aakj, aaga.d(), aaga.l()));
            this.k.a(a2, (afsw) this.n.get());
        }
    }

    public final void a() {
        if (this.n.get() != null) {
            ((vux) this.n.get()).a = true;
            this.n.clear();
        }
    }

    public final void a(apxu apxu, Map map) {
        aaas i = this.d.i();
        if (i != null) {
            i.a(apxu, map);
        } else {
            afpc.a(2, afpf.ad, "EndpointResolver is not available in AdClickthroughController.");
        }
    }

    public final void b() {
        a();
        this.e = null;
        this.f = null;
        this.h = null;
        this.o = false;
        this.p = false;
        this.i = null;
        this.j = null;
        this.q = null;
        this.b.b(this.d.f());
    }

    /* JADX WARNING: Removed duplicated region for block: B:99:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0185  */
    public final void a(defpackage.aafv r11, defpackage.aakj r12, java.lang.String r13, boolean r14, boolean r15) {
        /*
        r10 = this;
        r0 = r10.d;
        r0 = r0.g();
        r1 = r10.d;
        r1 = r1.j();
        if (r1 == 0) goto L_0x001d;
    L_0x000e:
        r2 = new acvs;
        r3 = r11.b();
        r2.<init>(r3);
        r1.a(r2);
        r1.a(r13);
    L_0x001d:
        r1 = r11.a;
        r1 = r1.e;
        r2 = 0;
        if (r1 == 0) goto L_0x0027;
    L_0x0024:
        r1 = r1.a;
        goto L_0x0028;
    L_0x0027:
        r1 = r2;
    L_0x0028:
        r3 = 2;
        r4 = 0;
        r5 = 1;
        if (r1 != 0) goto L_0x003d;
    L_0x002d:
        r6 = r10.i;
        if (r6 != 0) goto L_0x003d;
    L_0x0031:
        r6 = r10.j;
        if (r6 != 0) goto L_0x003d;
    L_0x0035:
        r6 = r10.f;
        if (r6 != 0) goto L_0x003d;
    L_0x0039:
        r10.g = r2;
        goto L_0x01a5;
    L_0x003d:
        if (r1 != 0) goto L_0x0041;
    L_0x003f:
        r1 = defpackage.aoiu.m;
    L_0x0041:
        r6 = r1.f;
        if (r6 != 0) goto L_0x0047;
    L_0x0045:
        r6 = defpackage.aois.c;
    L_0x0047:
        r6 = r6.a;
        r7 = 105631473; // 0x64bcef1 float:3.8332093E-35 double:5.2188882E-316;
        if (r6 != r7) goto L_0x006c;
    L_0x004e:
        r6 = r1.f;
        if (r6 != 0) goto L_0x0054;
    L_0x0052:
        r6 = defpackage.aois.c;
    L_0x0054:
        r8 = r6.a;
        if (r8 != r7) goto L_0x005d;
    L_0x0058:
        r6 = r6.b;
        r6 = (defpackage.aoiq) r6;
        goto L_0x005f;
    L_0x005d:
        r6 = defpackage.aoiq.d;
    L_0x005f:
        r6 = r6.a;
        r6 = r6 & r3;
        if (r6 == 0) goto L_0x0065;
    L_0x0064:
        goto L_0x006c;
    L_0x0065:
        r6 = defpackage.afpf.ad;
        r7 = "Received AdPlayerOverlayLearnMoreCTARenderer with no clickthroughEndpoint set.";
        defpackage.afpc.a(r3, r6, r7);
    L_0x006c:
        r10.g = r1;
        r1 = new vxd;
        r6 = r10.g;
        r7 = r6.a;
        r7 = r7 & r5;
        if (r7 == 0) goto L_0x007e;
    L_0x0077:
        r6 = r6.b;
        if (r6 != 0) goto L_0x007f;
    L_0x007b:
        r6 = defpackage.arml.f;
        goto L_0x007f;
    L_0x007e:
        r6 = r2;
    L_0x007f:
        r6 = defpackage.ajqy.a(r6);
        r7 = r10.g;
        r8 = r7.a;
        r8 = r8 & 4;
        if (r8 == 0) goto L_0x0092;
    L_0x008b:
        r7 = r7.c;
        if (r7 != 0) goto L_0x0093;
    L_0x008f:
        r7 = defpackage.arml.f;
        goto L_0x0093;
    L_0x0092:
        r7 = r2;
    L_0x0093:
        r7 = defpackage.ajqy.a(r7);
        r8 = r10.g;
        r9 = r8.a;
        r9 = r9 & 64;
        if (r9 == 0) goto L_0x00a6;
    L_0x009f:
        r8 = r8.g;
        if (r8 != 0) goto L_0x00a7;
    L_0x00a3:
        r8 = defpackage.aygk.f;
        goto L_0x00a7;
    L_0x00a6:
        r8 = r2;
    L_0x00a7:
        r1.<init>(r6, r7, r8);
        r6 = r10.q;
        if (r6 == 0) goto L_0x00b3;
    L_0x00ae:
        r6 = r6.a;
        r6 = r6.length;
        if (r6 != 0) goto L_0x00d8;
    L_0x00b3:
        r6 = r0.f();
        r7 = defpackage.vxi.a();
        r6 = r6.b();
        r6 = r7.a(r6);
        r6 = r6.a(r1);
        r6 = r6.a();
        r0.a(r6);
        r6 = r10.g;
        r6 = r6.i;
        if (r6 != 0) goto L_0x00d6;
    L_0x00d4:
        r6 = defpackage.apxu.d;
    L_0x00d6:
        r10.h = r6;
    L_0x00d8:
        r6 = r10.g;
        r6 = defpackage.vuv.a(r6);
        r7 = "<NONE>";
        if (r6 != 0) goto L_0x00e3;
    L_0x00e2:
        goto L_0x010a;
    L_0x00e3:
        r8 = r6.a;
        r8 = r8 & r5;
        if (r8 == 0) goto L_0x00ef;
    L_0x00e8:
        r8 = r6.b;
        if (r8 != 0) goto L_0x00f0;
    L_0x00ec:
        r8 = defpackage.arml.f;
        goto L_0x00f0;
    L_0x00ef:
        r8 = r2;
    L_0x00f0:
        r8 = defpackage.ajqy.a(r8);
        r8 = android.text.TextUtils.isEmpty(r8);
        if (r8 != 0) goto L_0x010a;
    L_0x00fa:
        r7 = r6.a;
        r7 = r7 & r5;
        if (r7 == 0) goto L_0x0105;
    L_0x00ff:
        r2 = r6.b;
        if (r2 != 0) goto L_0x0105;
    L_0x0103:
        r2 = defpackage.arml.f;
    L_0x0105:
        r7 = defpackage.ajqy.a(r2);
        goto L_0x0112;
    L_0x010a:
        if (r6 != 0) goto L_0x010d;
    L_0x010c:
        goto L_0x0114;
    L_0x010d:
        r6 = r6.a;
        r6 = r6 & r3;
        if (r6 == 0) goto L_0x0114;
    L_0x0112:
        r2 = 1;
        goto L_0x014c;
    L_0x0114:
        r6 = r10.g;
        r8 = r6.a;
        r8 = r8 & 8;
        if (r8 == 0) goto L_0x0123;
    L_0x011c:
        r6 = r6.d;
        if (r6 != 0) goto L_0x0124;
    L_0x0120:
        r6 = defpackage.arml.f;
        goto L_0x0124;
    L_0x0123:
        r6 = r2;
    L_0x0124:
        r6 = defpackage.ajqy.a(r6);
        r6 = android.text.TextUtils.isEmpty(r6);
        if (r6 == 0) goto L_0x0130;
    L_0x012e:
        r2 = 0;
        goto L_0x014c;
    L_0x0130:
        r6 = r10.j;
        if (r6 != 0) goto L_0x0139;
    L_0x0134:
        r6 = r10.i;
        if (r6 != 0) goto L_0x0139;
    L_0x0138:
        goto L_0x012e;
    L_0x0139:
        r6 = r10.g;
        r7 = r6.a;
        r7 = r7 & 8;
        if (r7 == 0) goto L_0x0147;
    L_0x0141:
        r2 = r6.d;
        if (r2 != 0) goto L_0x0147;
    L_0x0145:
        r2 = defpackage.arml.f;
    L_0x0147:
        r7 = defpackage.ajqy.a(r2);
        goto L_0x0112;
    L_0x014c:
        if (r2 == 0) goto L_0x0169;
    L_0x014e:
        r6 = defpackage.vyc.d();
        r8 = r10.o;
        r8 = r8 ^ r5;
        r6 = r6.b(r8);
        r6 = r6.a(r7);
        r6 = r6.a();
        r0.a(r6);
        r6 = r10.d;
        r6.h();
    L_0x0169:
        r6 = r10.f;
        if (r6 != 0) goto L_0x0178;
    L_0x016d:
        r6 = r10.g;
        r6 = r6.a;
        r6 = r6 & 16384;
        if (r6 == 0) goto L_0x0176;
    L_0x0175:
        goto L_0x0178;
    L_0x0176:
        r6 = 0;
        goto L_0x0179;
    L_0x0178:
        r6 = 1;
    L_0x0179:
        r7 = r10.l;
        r8 = new vvk;
        r8.<init>(r1, r2, r6);
        r7.d(r8);
        if (r6 == 0) goto L_0x01a0;
    L_0x0185:
        r1 = r0.d();
        r1 = r1.b();
        r1 = r1.a(r5);
        r2 = r10.o;
        if (r2 == 0) goto L_0x0199;
    L_0x0195:
        r2 = -2;
        r1.a(r2);
    L_0x0199:
        r1 = r1.a();
        r0.a(r1);
    L_0x01a0:
        r1 = r10.d;
        r1.h();
    L_0x01a5:
        r1 = r10.e;
        if (r1 == 0) goto L_0x01ac;
    L_0x01a9:
        r0.b(r5);
    L_0x01ac:
        r0 = r10.d;
        r0 = r0.k();
        r1 = r10.g;
        if (r1 == 0) goto L_0x01c5;
    L_0x01b6:
        if (r0 == 0) goto L_0x01c5;
    L_0x01b8:
        r1 = r0.length;
    L_0x01b9:
        if (r4 >= r1) goto L_0x01c5;
    L_0x01bb:
        r2 = r0[r4];
        r5 = r10.g;
        r2.a(r5);
        r4 = r4 + 1;
        goto L_0x01b9;
    L_0x01c5:
        if (r14 != 0) goto L_0x01c8;
    L_0x01c7:
        goto L_0x01de;
    L_0x01c8:
        r14 = r10.c;
        r14 = r14.iterator();
    L_0x01ce:
        r0 = r14.hasNext();
        if (r0 == 0) goto L_0x01de;
    L_0x01d4:
        r0 = r14.next();
        r0 = (defpackage.vuu) r0;
        r0.a(r13, r12, r11);
        goto L_0x01ce;
    L_0x01de:
        r12 = r10.d;
        r12.h();
        if (r15 == 0) goto L_0x020a;
    L_0x01e5:
        r12 = r10.d;
        r12 = r12.i();
        r13 = r11.a;
        if (r13 == 0) goto L_0x020a;
    L_0x01ef:
        r14 = r13.m;
        if (r14 == 0) goto L_0x020a;
    L_0x01f3:
        if (r12 == 0) goto L_0x0203;
    L_0x01f5:
        r14 = "com.google.android.libraries.youtube.innertube.endpoint.tag";
        r13 = defpackage.amur.a(r14, r13);
        r11 = r11.a;
        r11 = r11.m;
        r12.a(r11, r13);
        goto L_0x020a;
    L_0x0203:
        r11 = defpackage.afpf.ad;
        r12 = "EndpointResolver is not available in AdClickthroughController.";
        defpackage.afpc.a(r3, r11, r12);
    L_0x020a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vuv.a(aafv, aakj, java.lang.String, boolean, boolean):void");
    }

    public static aoiq a(aoiu aoiu) {
        aoiq aoiq;
        aois aois = aoiu.f;
        if (aois == null) {
            aois = aois.c;
        }
        if (aois.a == 105631473) {
            aoiq = (aoiq) aois.b;
        } else {
            aoiq = aoiq.d;
        }
        if ((aoiq.a & 2) == 0) {
            return null;
        }
        aoiq aoiq2;
        if (aois.a == 105631473) {
            aoiq2 = (aoiq) aois.b;
        } else {
            aoiq2 = aoiq.d;
        }
        return aoiq2;
    }
}
