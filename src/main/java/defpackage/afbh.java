package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;

/* renamed from: afbh */
public final class afbh implements affx, nlu {
    public afcp a;
    public aajj b;
    private final amro c;
    private final afgz d;
    private final afjj e;
    private final xhv f;
    private final ozb g;
    private final afjc h;
    private final Handler i = new Handler(Looper.getMainLooper());
    private aeuy j = aeuy.e;
    private aahr k;
    private npo l;
    private nlp m;
    private nnj n;
    private float o;
    private String p;
    private int q = 0;
    private int r = 3;

    public afbh(amro amro, afgz afgz, afjj afjj, xhv xhv, ozb ozb, afjc afjc) {
        this.c = amro;
        this.d = afgz;
        this.a = new afcp(new afbg(this), this.j, afjj, "BackgroundPlayer");
        this.e = afjj;
        this.f = xhv;
        this.g = ozb;
        this.h = afjc;
    }

    public final long a(long j) {
        return -1;
    }

    public final void a() {
    }

    public final void a(afkh afkh) {
    }

    public final void a(String str, aajf aajf) {
    }

    public final boolean a(affw affw) {
        return false;
    }

    public final void b() {
    }

    public final void b(float f) {
    }

    public final void bx_() {
    }

    public final void c() {
    }

    public final aahr d() {
        return null;
    }

    public final int i() {
        return -1;
    }

    public final int j() {
        return -1;
    }

    public final void q() {
    }

    public final void r() {
    }

    public final float s() {
        return 1.0f;
    }

    public final long t() {
        return -1;
    }

    public final int w() {
        return -1;
    }

    public final void a(aaje aaje, aeuy aeuy) {
        aaje.i.a(null);
    }

    private final afgv a(aajs aajs, aajj aajj, afgt afgt, int i, String str) {
        aajs aajs2 = aajs;
        if (aajs2 != null) {
            for (Integer intValue : aahv.n()) {
                if (!aajs2.a(intValue.intValue())) {
                } else if (!aajs.a()) {
                    return this.d.a(aajj, aajs2.n, afgt, afgz.b, aahv.i(), false, false, false, true, i, str);
                }
            }
        }
        throw afgr.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00b8  */
    public final defpackage.afne a(defpackage.aajs r27, defpackage.affa r28, java.lang.String r29, defpackage.aajj r30, defpackage.afkh r31, defpackage.aeuy r32, float r33, float r34, boolean r35, int r36) {
        /*
        r26 = this;
        r7 = r26;
        r0 = r28;
        r8 = r29;
        r9 = r30;
        r10 = r32;
        r11 = r35;
        r1 = r33;
        r7.o = r1;
        r7.j = r10;
        r7.p = r8;
        r1 = r36;
        r7.q = r1;
        r1 = new afcp;
        r2 = new afbj;
        r2.<init>(r7);
        r3 = r7.e;
        r4 = "BackgroundPlayer";
        r1.<init>(r2, r10, r3, r4);
        r7.a = r1;
        r4 = 0;
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r12 = 0;
        r14 = 0;
        r1 = r26;
        r2 = r27;
        r3 = r30;
        r6 = r29;
        r1 = r1.a(r2, r3, r4, r5, r6);	 Catch:{ afgr -> 0x00c3 }
        r2 = r1.h;	 Catch:{ afgr -> 0x00c3 }
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r2 == r3) goto L_0x0050;
    L_0x0042:
        r3 = "lmdu";
        r4 = new aetw;	 Catch:{ afgr -> 0x00c3 }
        r2 = java.lang.Integer.toString(r2);	 Catch:{ afgr -> 0x00c3 }
        r4.<init>(r2);	 Catch:{ afgr -> 0x00c3 }
        r10.a(r3, r4);	 Catch:{ afgr -> 0x00c3 }
    L_0x0050:
        r2 = r27;
        r2 = r2.d;
        r10.a(r12, r2);
        r7.b = r9;
        r2 = r1.b;
        r3 = 0;
        r2 = r2[r3];
        r3 = defpackage.aexb.a(r2, r8, r9);
        r4 = r7.m;
        if (r4 == 0) goto L_0x007b;
    L_0x0066:
        r4 = r7.l;
        if (r4 == 0) goto L_0x007b;
    L_0x006a:
        r4 = r4.g;
        r5 = r3.g;
        r4 = r4.equals(r5);
        if (r4 != 0) goto L_0x0075;
    L_0x0074:
        goto L_0x007b;
    L_0x0075:
        r0 = r0.a;
        r7.b(r0);
        goto L_0x00b6;
    L_0x007b:
        r32.j();
        r7.k = r2;
        r7.l = r3;
        r3 = new aetv;
        r16 = 0;
        r18 = 0;
        r4 = r1.d;
        r5 = r1.e;
        r1 = r1.f;
        r22 = 1;
        r23 = -1;
        r25 = 0;
        r15 = r3;
        r17 = r2;
        r19 = r4;
        r20 = r5;
        r21 = r1;
        r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r25);
        r10.a(r3);
        r1 = r7.l;
        r2 = r7.k;
        r2 = r2.c;
        r4 = r0.a;
        r27 = r26;
        r28 = r1;
        r29 = r2;
        r31 = r4;
        r27.a(r28, r29, r31);
    L_0x00b6:
        if (r11 == 0) goto L_0x00bd;
    L_0x00b8:
        r0 = r7.e;
        r0.f();
    L_0x00bd:
        r0 = r7.m;
        r0.a(r11);
        return r14;
    L_0x00c3:
        r0 = move-exception;
        r1 = r0.getMessage();
        defpackage.xtl.c(r1);
        r7.k = r14;
        r7.l = r14;
        r1 = new afif;
        r0 = r0.getMessage();
        r2 = "fmt.noneavailable";
        r1.<init>(r2, r12, r0);
        r10.a(r1);
        return r14;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbh.a(aajs, affa, java.lang.String, aajj, afkh, aeuy, float, float, boolean, int):afne");
    }

    public final afgv a(aajs aajs, aajj aajj, boolean z, afgt afgt, int i) {
        return a(aajs, aajj, afgt, i, afgs.c);
    }

    public final aahr e() {
        return this.k;
    }

    private final void a(npo npo, long j, long j2) {
        npo npo2 = npo;
        nlp nlp = this.m;
        if (nlp != null) {
            nlp.g();
        }
        this.m = nlr.a(1, this.b.L(), this.b.M());
        this.m.a(this);
        this.m.a(j2);
        int y = this.b.y() << 10;
        String str = npo2.d;
        this.n = new afbm(this, new noc(new nou(afbn.a, (nvo) this.c.get(), new noq(), j, 1, npo2), new affs(new nvp(y), aeff.a, new afbi(this), new afbl(this), new afbk(this), this.g, str != null ? xvt.c(Uri.parse(str)) : false), y * this.b.A()), nmg.a, this.i, this.a);
        this.m.a(this.n);
        a(this.o);
        int i = (this.q & 1) == 0 ? 3 : 4;
        if (this.r != i) {
            this.r = i;
            nlp nlp2 = this.m;
            if (nlp2 != null) {
                nnj nnj = this.n;
                if (nnj != null) {
                    nlp2.a(nnj, 3, Integer.valueOf(i));
                }
            }
        }
        m();
    }

    public final void m() {
        npo npo = this.l;
        if (npo != null) {
            nlp nlp = this.m;
            if (nlp == null) {
                a(npo, this.k.c, 0);
                return;
            }
            if (nlp.b() == 5) {
                this.m.a(0);
            }
            this.e.f();
            this.m.a(true);
        }
    }

    public final void n() {
        nlp nlp = this.m;
        if (nlp != null) {
            nlp.a(false);
        }
    }

    public final void b(long j) {
        nlp nlp = this.m;
        if (nlp != null) {
            if (nlp.d()) {
                this.j.a(j);
            } else {
                this.j.b(j);
            }
            this.m.a(j);
        }
    }

    public final void a(boolean z) {
        nlp nlp = this.m;
        if (nlp != null) {
            nlp.g();
            this.m = null;
            this.n = null;
            this.p = null;
            if (z) {
                this.j.e();
            }
        }
    }

    public final String l() {
        return this.p;
    }

    public final void p() {
        a(true);
    }

    public final int a(aajs aajs, aajj aajj) {
        return this.h.i() ? 16 : 0;
    }

    public final long o() {
        nlp nlp = this.m;
        return nlp != null ? nlp.i() : 0;
    }

    public final long u() {
        nlp nlp = this.m;
        return nlp != null ? nlp.h() : 0;
    }

    public final long v() {
        nlp nlp = this.m;
        return nlp != null ? nlp.j() : 0;
    }

    public final aerm k() {
        throw new UnsupportedOperationException();
    }

    public final void a(float f) {
        this.o = f;
        nlp nlp = this.m;
        if (nlp != null) {
            nlp.a(this.n, 1, Float.valueOf(f));
        }
    }

    public final boolean g() {
        nlp nlp = this.m;
        return nlp != null && nlp.b() == 3;
    }

    public final boolean f() {
        nlp nlp = this.m;
        if (nlp == null || !nlp.d()) {
            return false;
        }
        int b = this.m.b();
        if (b == 3 || b == 4) {
            return true;
        }
        return false;
    }

    public final void a(boolean z, int i) {
        xak.a();
        if (i == 2) {
            this.j.a();
        } else if (i != 3) {
            if (i != 4) {
                if (i == 5) {
                    this.j.f();
                }
            } else if (z) {
                this.j.c();
            } else {
                this.j.d();
            }
        } else if (z) {
            this.j.g();
        } else {
            this.j.h();
        }
    }

    public final void a(nlq nlq) {
        this.j.a(aevl.a((Exception) nlq, o(), null, this.f, 0));
    }
}
