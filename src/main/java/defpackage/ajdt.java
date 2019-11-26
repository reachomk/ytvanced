package defpackage;

import android.text.TextUtils;

/* renamed from: ajdt */
public final class ajdt implements xcp {
    public final ajcz a;
    public final xci b;
    public final ajfi c;
    public ajfd d;
    public ajfm e;
    private ajcx f;
    private final ajeb g;
    private ajdw h;
    private final ajfs i;
    private String j;
    private ajdv k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;

    public ajdt(ajcz ajcz, ajeb ajeb, ajfi ajfi, ajfs ajfs, xci xci) {
        this.a = (ajcz) amqw.a((Object) ajcz);
        this.g = (ajeb) amqw.a((Object) ajeb);
        this.c = (ajfi) amqw.a((Object) ajfi);
        this.i = (ajfs) amqw.a((Object) ajfs);
        this.b = xci;
    }

    public final ajdv a() {
        ajdv ajdv = this.k;
        if (ajdv == null) {
            if (this.j != null) {
                ajfh ajfh;
                ajfd ajfd = this.d;
                if (ajfd == null) {
                    ajfh = null;
                } else {
                    ajfh = new ajfh(ajfd.a, ajfd.b, ajfd.c, ajfd.e, ajfd.v, ajfd.J, ajfd.f, ajfd.g, ajfd.h, ajfd.i, ajfd.x, ajfd.w, ajfd.j, ajfd.k, ajfd.y, ajfd.z, ajfd.A, ajfd.E, ajfd.N, ajfd.D, ajfd.F, ajfd.G, ajfd.H, ajfd.I, ajfd.q, ajfd.r, ajfd.s, ajfd.M, ajfd.K, ajfd.L);
                }
                String str = this.j;
                ajcx ajcx = this.f;
                ajcy b = ajcx != null ? ajcx.b() : null;
                ajdw ajdw = this.h;
                ajed a = ajdw != null ? ajdw.a() : null;
                ajfm ajfm = this.e;
                return new ajdv(str, b, a, ajfh, ajfm != null ? ajfm.a() : null);
            }
            ajdv = null;
        }
        return ajdv;
    }

    public final void a(ajdv ajdv) {
        this.k = ajdv;
        if (!this.l) {
            xtl.c("ERROR initFromState called without reset being called. Clients in incorrect state");
        }
    }

    public final void b() {
        this.l = true;
        this.o = false;
        this.m = false;
        this.n = false;
        this.j = null;
        this.k = null;
        f();
    }

    public final void a(aakj aakj, String str, int i) {
        if (!this.n) {
            if (!this.l) {
                xtl.c("ERROR onPlayAd called for new ad without reset being called. Clients in incorrect state");
            }
            this.n = true;
            this.l = false;
            if (a(aakj.b())) {
                if (!aakj.b().equals(this.j)) {
                    e();
                }
            } else if (!TextUtils.isEmpty(aakj.b())) {
                aakh m = aakj.m();
                if (m.f == null || m.b == null) {
                    xtl.d("Missing QoE or Vss base url");
                } else {
                    if (!aakj.n().k()) {
                        this.h = this.g.a(m.g, m.h, str);
                    }
                    this.d = this.c.a(aakj, str, i);
                    if (!(aakj.n().j() || aakj.t() == null || m.a == null)) {
                        this.e = this.i.a(aakj.t(), m.a, str, aakj.h());
                    }
                }
            }
            this.k = null;
            this.j = aakj.b();
        }
    }

    /* JADX WARNING: Missing block: B:20:0x005c, code skipped:
            if (r8.c != false) goto L_0x00b8;
     */
    public final void a(java.lang.String r21, defpackage.aakj r22, int r23) {
        /*
        r20 = this;
        r0 = r20;
        r1 = r21;
        r2 = r22;
        r3 = r0.m;
        if (r3 != 0) goto L_0x0106;
    L_0x000a:
        r3 = r0.l;
        if (r3 != 0) goto L_0x0013;
    L_0x000e:
        r3 = "ERROR reset onPlayVideo called for new video with out reset being called. Clients in correct state";
        defpackage.xtl.c(r3);
    L_0x0013:
        defpackage.xvd.a(r21);
        r3 = 1;
        r0.m = r3;
        r4 = 0;
        r0.l = r4;
        r5 = r22.b();
        r6 = r0.j;
        r6 = android.text.TextUtils.equals(r5, r6);
        r7 = 0;
        if (r6 != 0) goto L_0x0102;
    L_0x0029:
        r6 = r0.a(r5);
        if (r6 == 0) goto L_0x0034;
    L_0x002f:
        r20.e();
        goto L_0x0102;
    L_0x0034:
        r6 = r0.o;
        if (r6 != 0) goto L_0x0102;
    L_0x0038:
        r6 = r22.m();
        r0.o = r4;
        r8 = r22.b();
        r8 = r8.isEmpty();
        if (r8 != 0) goto L_0x00b8;
    L_0x0048:
        r8 = r22.n();
        r8 = r8.c;
        r9 = r8.b;
        r9 = r9 & 512;
        if (r9 == 0) goto L_0x005f;
    L_0x0054:
        r8 = r8.A;
        if (r8 != 0) goto L_0x005a;
    L_0x0058:
        r8 = defpackage.aouk.e;
    L_0x005a:
        r8 = r8.c;
        if (r8 == 0) goto L_0x005f;
    L_0x005e:
        goto L_0x00b8;
    L_0x005f:
        r8 = r2.c;
        if (r8 == 0) goto L_0x0069;
    L_0x0063:
        r8 = r8.t;
        if (r8 != 0) goto L_0x0068;
    L_0x0067:
        goto L_0x0069;
    L_0x0068:
        r4 = 1;
    L_0x0069:
        r3 = r0.a;
        r8 = r2.a;
        r8 = r8.c;
        r18 = r22.x();
        r19 = r22.b();
        r9 = r3.g;
        defpackage.amqw.a(r9);
        defpackage.xvd.a(r19);
        r9 = r3.h;
        r9 = r9.e();
        if (r9 == 0) goto L_0x00b5;
    L_0x0087:
        r9 = defpackage.ajcz.a(r8);
        if (r9 == 0) goto L_0x00b5;
    L_0x008d:
        r9 = defpackage.ajcz.a(r18);
        if (r9 != 0) goto L_0x0094;
    L_0x0093:
        goto L_0x00b5;
    L_0x0094:
        if (r4 != 0) goto L_0x0097;
    L_0x0096:
        goto L_0x009c;
    L_0x0097:
        r4 = r8.g;
        if (r4 != 0) goto L_0x009c;
    L_0x009b:
        goto L_0x00b5;
    L_0x009c:
        r4 = new ajcx;
        r10 = r3.a;
        r11 = r3.b;
        r12 = r3.c;
        r13 = r3.d;
        r14 = r3.e;
        r15 = r3.f;
        r3 = r3.g;
        r9 = r4;
        r16 = r3;
        r17 = r8;
        r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        goto L_0x00b6;
    L_0x00b5:
        r4 = r7;
    L_0x00b6:
        r0.f = r4;
    L_0x00b8:
        r3 = r22.n();
        r3 = r3.k();
        if (r3 != 0) goto L_0x00ce;
    L_0x00c2:
        r3 = r0.g;
        r4 = r6.g;
        r8 = r6.h;
        r3 = r3.a(r4, r8, r1);
        r0.h = r3;
    L_0x00ce:
        r3 = r0.d;
        if (r3 != 0) goto L_0x00dc;
    L_0x00d2:
        r3 = r0.c;
        r4 = r23;
        r3 = r3.a(r2, r1, r4);
        r0.d = r3;
    L_0x00dc:
        r3 = r22.n();
        r3 = r3.j();
        if (r3 != 0) goto L_0x0102;
    L_0x00e6:
        r3 = r22.t();
        if (r3 == 0) goto L_0x0102;
    L_0x00ec:
        r3 = r6.g;
        if (r3 == 0) goto L_0x0102;
    L_0x00f0:
        r3 = r0.i;
        r4 = r22.t();
        r6 = r6.a;
        r2 = r22.h();
        r1 = r3.a(r4, r6, r1, r2);
        r0.e = r1;
    L_0x0102:
        r0.j = r5;
        r0.k = r7;
    L_0x0106:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajdt.a(java.lang.String, aakj, int):void");
    }

    private final boolean a(String str) {
        ajdv ajdv = this.k;
        boolean z = false;
        if (ajdv != null) {
            String str2 = ajdv.a;
            if (str2 != null && str2.equals(str)) {
                z = true;
            }
        }
        (!z ? "NEW" : "RESTORED").length();
        String.valueOf(str).length();
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0168  */
    private final void e() {
        /*
        r20 = this;
        r0 = r20;
        r1 = r0.k;
        r1 = r1.b;
        if (r1 == 0) goto L_0x0052;
    L_0x0008:
        r3 = r0.a;
        r4 = r3.g;
        defpackage.amqw.a(r4);
        r4 = r3.h;
        r4 = r4.e();
        if (r4 == 0) goto L_0x0052;
    L_0x0017:
        r4 = r1.a;
        r4 = defpackage.ajcz.a(r4);
        if (r4 == 0) goto L_0x0052;
    L_0x001f:
        r4 = r1.b;
        r4 = defpackage.ajcz.a(r4);
        if (r4 == 0) goto L_0x0052;
    L_0x0027:
        r4 = r1.c;
        r4 = android.text.TextUtils.isEmpty(r4);
        if (r4 != 0) goto L_0x0052;
    L_0x002f:
        r4 = new ajcx;
        r6 = r3.a;
        r7 = r3.b;
        r8 = r3.c;
        r9 = r3.d;
        r10 = r3.e;
        r11 = r3.f;
        r12 = r3.g;
        r13 = r1.a;
        r14 = r1.b;
        r15 = r1.c;
        r5 = r4;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
        r3 = r1.e;
        r4.h = r3;
        r5 = r1.d;
        r4.g = r5;
        goto L_0x0053;
    L_0x0052:
        r4 = 0;
    L_0x0053:
        r0.f = r4;
        r1 = r0.k;
        r1 = r1.c;
        if (r1 != 0) goto L_0x005d;
    L_0x005b:
        r1 = 0;
        goto L_0x0071;
    L_0x005d:
        r3 = r0.g;
        r4 = r1.a;
        r4 = java.util.Arrays.asList(r4);
        r5 = r1.b;
        r5 = java.util.Arrays.asList(r5);
        r1 = r1.c;
        r1 = r3.a(r4, r5, r1);
    L_0x0071:
        r0.h = r1;
        r1 = r0.k;
        r1 = r1.d;
        if (r1 == 0) goto L_0x015f;
    L_0x0079:
        r3 = r0.c;
        r19 = new ajfd;
        r4 = r3.a;
        r4 = r4.get();
        r4 = (java.util.concurrent.ScheduledExecutorService) r4;
        r5 = 1;
        r4 = defpackage.ajfi.a(r4, r5);
        r5 = r4;
        r5 = (java.util.concurrent.ScheduledExecutorService) r5;
        r4 = r3.b;
        r4 = r4.get();
        r4 = (defpackage.afqv) r4;
        r6 = 2;
        r4 = defpackage.ajfi.a(r4, r6);
        r6 = r4;
        r6 = (defpackage.afqv) r6;
        r4 = r3.c;
        r4 = r4.get();
        r4 = (defpackage.afmq) r4;
        r7 = 3;
        r4 = defpackage.ajfi.a(r4, r7);
        r7 = r4;
        r7 = (defpackage.afmq) r7;
        r4 = r3.d;
        r4 = r4.get();
        r4 = (defpackage.xsc) r4;
        r8 = 4;
        r4 = defpackage.ajfi.a(r4, r8);
        r8 = r4;
        r8 = (defpackage.xsc) r8;
        r4 = r3.e;
        r4 = r4.get();
        r4 = (defpackage.xhv) r4;
        r9 = 5;
        r4 = defpackage.ajfi.a(r4, r9);
        r9 = r4;
        r9 = (defpackage.xhv) r9;
        r4 = r3.f;
        r4 = r4.get();
        r4 = (defpackage.xrt) r4;
        r10 = 6;
        r4 = defpackage.ajfi.a(r4, r10);
        r10 = r4;
        r10 = (defpackage.xrt) r10;
        r4 = r3.g;
        r4 = r4.get();
        r4 = (defpackage.afmi) r4;
        r11 = 7;
        r4 = defpackage.ajfi.a(r4, r11);
        r11 = r4;
        r11 = (defpackage.afmi) r11;
        r4 = r3.h;
        r4 = r4.get();
        r4 = (defpackage.afti) r4;
        r12 = 8;
        r4 = defpackage.ajfi.a(r4, r12);
        r12 = r4;
        r12 = (defpackage.afti) r12;
        r4 = r3.i;
        r4 = r4.get();
        r13 = r4;
        r13 = (defpackage.xpt) r13;
        r4 = r3.j;
        r4 = r4.get();
        r4 = (defpackage.ahhq) r4;
        r14 = 10;
        r4 = defpackage.ajfi.a(r4, r14);
        r14 = r4;
        r14 = (defpackage.ahhq) r14;
        r4 = r3.k;
        r4 = r4.get();
        r4 = (defpackage.afpu) r4;
        r15 = 11;
        r4 = defpackage.ajfi.a(r4, r15);
        r15 = r4;
        r15 = (defpackage.afpu) r15;
        r4 = r3.l;
        r4 = r4.get();
        r4 = (defpackage.zzl) r4;
        r2 = 12;
        r2 = defpackage.ajfi.a(r4, r2);
        r16 = r2;
        r16 = (defpackage.zzl) r16;
        r2 = r3.m;
        r2 = r2.get();
        r2 = (defpackage.aiqf) r2;
        r3 = 13;
        r2 = defpackage.ajfi.a(r2, r3);
        r17 = r2;
        r17 = (defpackage.aiqf) r17;
        r2 = 14;
        r1 = defpackage.ajfi.a(r1, r2);
        r18 = r1;
        r18 = (defpackage.ajfh) r18;
        r4 = r19;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);
        r1 = r19;
        goto L_0x0160;
    L_0x015f:
        r1 = 0;
    L_0x0160:
        r0.d = r1;
        r1 = r0.k;
        r1 = r1.e;
        if (r1 == 0) goto L_0x016f;
    L_0x0168:
        r2 = r0.i;
        r2 = r2.a(r1);
        goto L_0x0170;
    L_0x016f:
        r2 = 0;
    L_0x0170:
        r0.e = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajdt.e():void");
    }

    private final void f() {
        ajfd ajfd = this.d;
        if (ajfd != null) {
            if (ajfd.C) {
                xtl.b("VSS2 client released unexpectedly", new Exception());
                ajfd.b();
            }
            afti afti = ajfd.p;
            Object obj = ajfd.o;
            amqw.a(obj);
            String str = "VideoStats2MacroConverter";
            if (afti.a.get(str) == obj) {
                afti.a.remove(str);
            }
        }
        this.d = null;
        this.e = null;
        this.f = null;
        this.h = null;
    }

    public final void c() {
        ajfd ajfd = this.d;
        if (ajfd != null) {
            ajfd.b();
        }
        ajfm ajfm = this.e;
        if (ajfm != null) {
            ajfm.b();
        }
    }

    public final void d() {
        ajfd ajfd = this.d;
        if (ajfd != null) {
            ajfd.e();
            if (ajfd.A) {
                ajfd.a(3);
            }
        }
        ajfm ajfm = this.e;
        if (ajfm != null) {
            ajfm.b();
        }
        f();
    }

    public final void a(long j) {
        ajfd ajfd = this.d;
        if (ajfd != null) {
            ajfd.a(j);
        }
    }

    public final void a(aetv aetv) {
        if (afhz.a(aetv.h)) {
            ajcx ajcx = this.f;
            if (ajcx != null) {
                ajcx.a();
            }
            ajfd ajfd = this.d;
            if (ajfd != null) {
                aahr aahr = aetv.b;
                int i = 0;
                ajfd.F = aahr != null ? aahr.b() : 0;
                aahr aahr2 = aetv.c;
                if (aahr2 != null) {
                    i = aahr2.b();
                }
                ajfd.G = i;
            }
        }
    }

    public final void a(ahkm ahkm) {
        ajcx ajcx = this.f;
        if (ajcx != null) {
            ajcx.a(ahkm);
        }
        ajdw ajdw = this.h;
        if (ajdw != null) {
            ajdw.a(ahkm);
        }
        ajfd ajfd = this.d;
        if (ajfd != null) {
            long j = ahkm.d;
            if (j > 0) {
                ajfd.J = j;
            }
            if (ahkm.g) {
                long j2;
                j = ahkm.a;
                if (!(ajfd.N && aipo.a(ajfd.t).i)) {
                    j2 = ajfd.v;
                    if (j < -5000 + j2 || j > 5000 + j2) {
                        StringBuilder stringBuilder = new StringBuilder(109);
                        stringBuilder.append("Warning: unexpected playback progress ");
                        stringBuilder.append(j);
                        stringBuilder.append(" for current playback position ");
                        stringBuilder.append(j2);
                        xtl.d(stringBuilder.toString());
                        ajfd.a(j);
                    }
                }
                j2 = ajfd.v;
                if (j >= j2) {
                    long j3 = ajfd.x + (j - j2);
                    ajfd.x = j3;
                    ajfd.v = j;
                    ajfd.w = ahkm.b - ahkm.a;
                    ajfd.O = ahkm.f + 30000;
                    ajfd.o.b = j;
                    int a = ajfd.l.a();
                    if (!(a == ajfd.K || ajfd.c())) {
                        ajfd.K = a;
                        ajfd.L = j3;
                    }
                    j3 -= ajfd.L;
                    if (ajfd.c() && j3 > 2000) {
                        ajfd.L = -1;
                        ajfd.K = a;
                        ajfd.e();
                        ajfd.d();
                    }
                    if (!ajfd.A) {
                        ajfd.A = true;
                        ajfd.a(ajfd.d, ajfd.a, ajfd.a());
                    } else if (ajfd.a() && ajfd.P == null) {
                        ajfd.g();
                    }
                    if (aipo.d(ajfd.t)) {
                        ajfd.d();
                    }
                    ajfd.f();
                }
            }
        }
        ajfm ajfm = this.e;
        if (ajfm != null) {
            ajfm.a(ahkm);
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        ajfd ajfd;
        switch (i) {
            case -1:
                clsArr = new Class[]{xgg.class, ahjd.class, ahjn.class, ahke.class, ahkl.class, aioa.class};
                break;
            case 0:
                ajfd = this.d;
                if (ajfd != null) {
                    ajfd.e();
                    ajfd.d();
                    return null;
                }
                break;
            case 1:
                ahjd ahjd = (ahjd) obj;
                ajfd = this.d;
                if (ajfd != null) {
                    float f = ajfd.I;
                    float f2 = ahjd.b;
                    if (f != f2) {
                        ajfd.I = f2;
                        ajfd.e();
                        ajfd.d();
                        return null;
                    }
                }
                break;
            case 2:
                ahjn ahjn = (ahjn) obj;
                ajfd = this.d;
                if (ajfd != null) {
                    ajfk ajfk = ajfd.o;
                    airc airc = ahjn.a;
                    ajfk.a = airc;
                    ahjn ahjn2 = ajfd.u;
                    if (!(ahjn2 != null && ahjn2.a == airc && ahjn2.f == ahjn.f)) {
                        ajfd.e();
                        ajfd.u = ahjn;
                        ajfd.d();
                        return null;
                    }
                }
                break;
            case 3:
                ahke ahke = (ahke) obj;
                ajfd = this.d;
                if (!(ajfd == null || TextUtils.equals(ajfd.H, ahke.a()))) {
                    ajfd.H = ahke.a();
                    ajfd.e();
                    ajfd.d();
                    return null;
                }
            case 4:
                ahkl ahkl = (ahkl) obj;
                ajfd = this.d;
                if (!(ajfd == null || ajfd.Q == ahkl.b)) {
                    ajfd.e();
                    ajfd.Q = ahkl.b;
                    ajfd.d();
                    return null;
                }
            case 5:
                this.o = true;
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
