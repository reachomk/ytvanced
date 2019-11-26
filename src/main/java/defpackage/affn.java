package defpackage;

import android.text.TextUtils;
import java.util.Set;

/* renamed from: affn */
public final class affn implements afev {
    private static final int u = 5;
    private final aeqo a;
    private final xhv b;
    private final aajj c;
    private final aeeu d;
    private final amro e;
    private final float f;
    private final boolean g;
    private final amro h;
    private final affo i;
    private final String j;
    private final afih k;
    private aevh l;
    private int m;
    private int n;
    private long o;
    private float p = 1.0f;
    private boolean q;
    private final int r;
    private afgq s;
    private boolean t;

    public affn(aeqo aeqo, xhv xhv, aajj aajj, aeeu aeeu, boolean z, int i, int i2, afgq afgq, amro amro, float f, String str, afjc afjc, int i3, amro amro2, afih afih) {
        affo affm;
        this.a = aeqo;
        this.b = xhv;
        this.c = aajj;
        this.d = aeeu;
        this.g = z;
        this.m = i;
        this.n = i2;
        this.s = afgq;
        this.e = amro;
        this.f = f;
        this.j = str;
        this.o = Long.MIN_VALUE;
        this.t = false;
        this.r = i3;
        this.h = amro2;
        if (afjc.k() && afjc.b.getBoolean("medialib_diagnostic_profile_format_evaluation", false)) {
            affm = new affm();
        } else {
            affm = new affp();
        }
        this.i = affm;
        this.k = afih;
    }

    public final void a(afjs afjs) {
        this.m = afjs.b;
        this.n = afjs.c;
    }

    public final void a(boolean z) {
        this.t = z;
    }

    public final void a(afgq afgq) {
        this.s = afgq;
    }

    public final void a() {
        this.q = true;
    }

    public final void a(float f) {
        this.p = f;
    }

    public final void a(aevh aevh) {
        this.l = aevh;
    }

    /* JADX WARNING: Removed duplicated region for block: B:162:0x02a2 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0279 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0270 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x028f A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0286 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0293 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0292 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02a2 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02a2 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x015e A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0244 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0243 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02a2 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012b A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0122 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012f A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012e A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x015e A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0243 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0244 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02a2 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0122 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012b A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012e A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012f A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x015e A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0244 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0243 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02a2 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00eb A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0109 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012b A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0122 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012f A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012e A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x015e A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0243 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0244 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02a2 A:{Catch:{ all -> 0x0344, all -> 0x0385 }} */
    /* JADX WARNING: Missing block: B:158:0x029a, code skipped:
            if (r0 < (((long) r2) * 1000)) goto L_0x02a0;
     */
    public final void a(java.util.List r26, long r27, long r29, defpackage.afex[] r31, defpackage.afeu r32) {
        /*
        r25 = this;
        r10 = r25;
        r0 = r26;
        r11 = r27;
        r13 = r29;
        r15 = r32;
        r1 = r10.i;
        r1.a();
        r1 = r10.a;	 Catch:{ all -> 0x0344 }
        r8 = r1.e();	 Catch:{ all -> 0x0344 }
        r3 = r8.b;	 Catch:{ all -> 0x0344 }
        r1 = r10.b;	 Catch:{ all -> 0x0344 }
        r1 = r1.c();	 Catch:{ all -> 0x0344 }
        r5 = 3;
        if (r1 != 0) goto L_0x0048;
    L_0x0020:
        r1 = r11 + r13;
        r6 = r31;
        r1 = r10.a(r6, r1);	 Catch:{ all -> 0x0344 }
        if (r1 == 0) goto L_0x0040;
    L_0x002a:
        r2 = r15.c;	 Catch:{ all -> 0x0344 }
        if (r2 == 0) goto L_0x003e;
    L_0x002e:
        r2 = r2.a();	 Catch:{ all -> 0x0344 }
        r7 = r1.a();	 Catch:{ all -> 0x0344 }
        r2 = android.text.TextUtils.equals(r2, r7);	 Catch:{ all -> 0x0344 }
        if (r2 != 0) goto L_0x003e;
    L_0x003c:
        r15.b = r5;	 Catch:{ all -> 0x0344 }
    L_0x003e:
        r15.c = r1;	 Catch:{ all -> 0x0344 }
    L_0x0040:
        r1 = r15.c;	 Catch:{ all -> 0x0344 }
        if (r1 != 0) goto L_0x0045;
    L_0x0044:
        goto L_0x004a;
    L_0x0045:
        r13 = r8;
        goto L_0x0337;
    L_0x0048:
        r6 = r31;
    L_0x004a:
        r1 = r10.s;	 Catch:{ all -> 0x0344 }
        r1 = r1.a();	 Catch:{ all -> 0x0344 }
        r9 = 0;
        r18 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r7 = 2;
        if (r1 != 0) goto L_0x02d6;
    L_0x0057:
        r1 = r9;
        r10 = r25;
        r9 = r10.s;	 Catch:{ all -> 0x0344 }
        r9 = r9.b();	 Catch:{ all -> 0x0344 }
        if (r9 != 0) goto L_0x02d2;
    L_0x0062:
        r9 = r10.t;	 Catch:{ all -> 0x0344 }
        if (r9 == 0) goto L_0x0068;
    L_0x0066:
        goto L_0x02d2;
    L_0x0068:
        r9 = r10.c;	 Catch:{ all -> 0x0344 }
        r9 = r9.c;	 Catch:{ all -> 0x0344 }
        r1 = r9.a;	 Catch:{ all -> 0x0344 }
        r1 = r1 & r7;
        r2 = 0;
        if (r1 == 0) goto L_0x007b;
    L_0x0072:
        r1 = r9.d;	 Catch:{ all -> 0x0344 }
        if (r1 != 0) goto L_0x0078;
    L_0x0076:
        r1 = defpackage.arhh.bv;	 Catch:{ all -> 0x0344 }
    L_0x0078:
        r1 = r1.I;	 Catch:{ all -> 0x0344 }
        goto L_0x007c;
    L_0x007b:
        r1 = 0;
    L_0x007c:
        r9 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r9 == 0) goto L_0x0081;
    L_0x0080:
        goto L_0x0083;
    L_0x0081:
        r1 = 2139095040; // 0x7f800000 float:Infinity double:1.0568533725E-314;
    L_0x0083:
        r9 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r2 > 0) goto L_0x008a;
    L_0x0089:
        goto L_0x00a5;
    L_0x008a:
        r2 = r10.c;	 Catch:{ all -> 0x0344 }
        r2 = r2.x();	 Catch:{ all -> 0x0344 }
        r2 = r9 - r2;
        r2 = r2 / r1;
        r1 = (float) r13;	 Catch:{ all -> 0x0344 }
        r2 = r2 * r1;
        r1 = 1232348160; // 0x49742400 float:1000000.0 double:6.088608896E-315;
        r2 = r2 / r1;
        r1 = r10.c;	 Catch:{ all -> 0x0344 }
        r1 = r1.x();	 Catch:{ all -> 0x0344 }
        r1 = r1 + r2;
        r9 = java.lang.Math.min(r9, r1);	 Catch:{ all -> 0x0344 }
    L_0x00a5:
        r1 = r10.c;	 Catch:{ all -> 0x0344 }
        r1 = r1.an();	 Catch:{ all -> 0x0344 }
        if (r1 != 0) goto L_0x00ba;
    L_0x00ad:
        r1 = r10.e;	 Catch:{ all -> 0x0344 }
        r1 = r1.get();	 Catch:{ all -> 0x0344 }
        r1 = (java.lang.Integer) r1;	 Catch:{ all -> 0x0344 }
        r1 = r1.intValue();	 Catch:{ all -> 0x0344 }
        goto L_0x00bb;
    L_0x00ba:
        r1 = 0;
    L_0x00bb:
        r2 = (float) r3;	 Catch:{ all -> 0x0344 }
        r2 = r2 * r9;
        r3 = r10.p;	 Catch:{ all -> 0x0344 }
        r2 = r2 / r3;
        r1 = (float) r1;	 Catch:{ all -> 0x0344 }
        r2 = r2 - r1;
        r3 = (long) r2;	 Catch:{ all -> 0x0344 }
        r9 = 1;
        r1 = r25;
        r2 = r31;
        r20 = r3;
        r5 = r27;
        r13 = r8;
        r14 = 2;
        r7 = r29;
        r9 = r1.a(r2, r3, r5, r7, r9);	 Catch:{ all -> 0x0344 }
        r7 = r15.c;	 Catch:{ all -> 0x0344 }
        if (r7 == 0) goto L_0x00e7;
    L_0x00d9:
        r1 = r9.b();	 Catch:{ all -> 0x0344 }
        r2 = r7.b();	 Catch:{ all -> 0x0344 }
        if (r1 > r2) goto L_0x00e4;
    L_0x00e3:
        goto L_0x00e7;
    L_0x00e4:
        r16 = 1;
        goto L_0x00e9;
    L_0x00e7:
        r16 = 0;
    L_0x00e9:
        if (r7 == 0) goto L_0x00f9;
    L_0x00eb:
        r1 = r9.b();	 Catch:{ all -> 0x0344 }
        r2 = r7.b();	 Catch:{ all -> 0x0344 }
        if (r1 < r2) goto L_0x00f6;
    L_0x00f5:
        goto L_0x00f9;
    L_0x00f6:
        r17 = 1;
        goto L_0x00fb;
    L_0x00f9:
        r17 = 0;
    L_0x00fb:
        r1 = r10.q;	 Catch:{ all -> 0x0344 }
        if (r1 == 0) goto L_0x0107;
    L_0x00ff:
        r1 = defpackage.affn.a(r9);	 Catch:{ all -> 0x0344 }
        if (r1 == 0) goto L_0x0107;
    L_0x0105:
        r1 = 1;
        goto L_0x0119;
    L_0x0107:
        if (r7 == 0) goto L_0x0118;
    L_0x0109:
        r1 = r7.d();	 Catch:{ all -> 0x0344 }
        r2 = r10.b;	 Catch:{ all -> 0x0344 }
        r3 = r10.r;	 Catch:{ all -> 0x0344 }
        r1 = defpackage.afgz.a(r1, r2, r3);	 Catch:{ all -> 0x0344 }
        if (r1 == 0) goto L_0x0118;
    L_0x0117:
        goto L_0x0105;
    L_0x0118:
        r1 = 0;
    L_0x0119:
        r2 = r10.c;	 Catch:{ all -> 0x0344 }
        r2 = r2.c;	 Catch:{ all -> 0x0344 }
        r3 = r2.a;	 Catch:{ all -> 0x0344 }
        r3 = r3 & r14;
        if (r3 == 0) goto L_0x012b;
    L_0x0122:
        r2 = r2.d;	 Catch:{ all -> 0x0344 }
        if (r2 != 0) goto L_0x0128;
    L_0x0126:
        r2 = defpackage.arhh.bv;	 Catch:{ all -> 0x0344 }
    L_0x0128:
        r2 = r2.bc;	 Catch:{ all -> 0x0344 }
        goto L_0x012c;
    L_0x012b:
        r2 = 0;
    L_0x012c:
        if (r2 != 0) goto L_0x012f;
    L_0x012e:
        goto L_0x0153;
    L_0x012f:
        r3 = r2.size();	 Catch:{ all -> 0x0344 }
        if (r3 <= 0) goto L_0x0153;
    L_0x0135:
        r3 = r10.b;	 Catch:{ all -> 0x0344 }
        r3 = r3.k();	 Catch:{ all -> 0x0344 }
        r4 = r2.size();	 Catch:{ all -> 0x0344 }
        if (r3 >= r4) goto L_0x014c;
    L_0x0141:
        r2 = r2.get(r3);	 Catch:{ all -> 0x0344 }
        r2 = (java.lang.Integer) r2;	 Catch:{ all -> 0x0344 }
        r2 = r2.intValue();	 Catch:{ all -> 0x0344 }
        goto L_0x0159;
    L_0x014c:
        r2 = r10.c;	 Catch:{ all -> 0x0344 }
        r2 = r2.w();	 Catch:{ all -> 0x0344 }
        goto L_0x0159;
    L_0x0153:
        r2 = r10.c;	 Catch:{ all -> 0x0344 }
        r2 = r2.w();	 Catch:{ all -> 0x0344 }
    L_0x0159:
        r2 = (long) r2;	 Catch:{ all -> 0x0344 }
        r22 = r2 * r18;
        if (r1 != 0) goto L_0x022e;
    L_0x015e:
        if (r16 != 0) goto L_0x0162;
    L_0x0160:
        goto L_0x022e;
    L_0x0162:
        r1 = r10.a(r0, r9);	 Catch:{ all -> 0x0344 }
        r2 = r10.c;	 Catch:{ all -> 0x0344 }
        r3 = u;	 Catch:{ all -> 0x0344 }
        r2 = r2.a(r3);	 Catch:{ all -> 0x0344 }
        r8 = 3;
        if (r2 == r8) goto L_0x0172;
    L_0x0171:
        goto L_0x018a;
    L_0x0172:
        r2 = new aevi;	 Catch:{ all -> 0x0344 }
        r2.<init>(r1);	 Catch:{ all -> 0x0344 }
        r1 = r1.a();	 Catch:{ all -> 0x0344 }
        r3 = r9.b();	 Catch:{ all -> 0x0344 }
        r1 = java.lang.Math.max(r1, r3);	 Catch:{ all -> 0x0344 }
        r2.c(r1);	 Catch:{ all -> 0x0344 }
        r1 = r2.a();	 Catch:{ all -> 0x0344 }
    L_0x018a:
        r2 = r10.c;	 Catch:{ all -> 0x0344 }
        r2 = r2.N();	 Catch:{ all -> 0x0344 }
        if (r2 != 0) goto L_0x0197;
    L_0x0192:
        r1 = r29;
        r24 = r7;
        goto L_0x01a8;
    L_0x0197:
        r3 = r1.c;	 Catch:{ all -> 0x0344 }
        r1 = r1.a();	 Catch:{ all -> 0x0344 }
        r5 = (long) r1;	 Catch:{ all -> 0x0344 }
        r1 = r29;
        r24 = r7;
        r7 = r20;
        r1 = defpackage.affn.a(r1, r3, r5, r7);	 Catch:{ all -> 0x0344 }
    L_0x01a8:
        r3 = r10.h;	 Catch:{ all -> 0x0344 }
        r3 = r3.get();	 Catch:{ all -> 0x0344 }
        r3 = (java.lang.Long) r3;	 Catch:{ all -> 0x0344 }
        r3 = r3.longValue();	 Catch:{ all -> 0x0344 }
        r3 = r3 - r11;
        r7 = 0;
        r3 = java.lang.Math.max(r7, r3);	 Catch:{ all -> 0x0344 }
        r5 = r10.c;	 Catch:{ all -> 0x0344 }
        r5 = r5.c;	 Catch:{ all -> 0x0344 }
        r6 = r5.a;	 Catch:{ all -> 0x0344 }
        r6 = r6 & r14;
        if (r6 == 0) goto L_0x01cd;
    L_0x01c4:
        r5 = r5.d;	 Catch:{ all -> 0x0344 }
        if (r5 != 0) goto L_0x01ca;
    L_0x01c8:
        r5 = defpackage.arhh.bv;	 Catch:{ all -> 0x0344 }
    L_0x01ca:
        r5 = r5.j;	 Catch:{ all -> 0x0344 }
        goto L_0x01ce;
    L_0x01cd:
        r5 = 0;
    L_0x01ce:
        if (r5 == 0) goto L_0x01d1;
    L_0x01d0:
        goto L_0x01d3;
    L_0x01d1:
        r5 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
    L_0x01d3:
        r5 = (long) r5;	 Catch:{ all -> 0x0344 }
        r5 = r5 * r18;
        r3 = java.lang.Math.min(r3, r5);	 Catch:{ all -> 0x0344 }
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 < 0) goto L_0x022a;
    L_0x01de:
        r3 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1));
        if (r3 < 0) goto L_0x029e;
    L_0x01e2:
        r1 = 1;
    L_0x01e3:
        r2 = r26.size();	 Catch:{ all -> 0x0344 }
        if (r1 >= r2) goto L_0x029e;
    L_0x01e9:
        r2 = r0.get(r1);	 Catch:{ all -> 0x0344 }
        r2 = (defpackage.afew) r2;	 Catch:{ all -> 0x0344 }
        r3 = r2.b;	 Catch:{ all -> 0x0344 }
        r3 = r3 - r11;
        r5 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1));
        if (r5 >= 0) goto L_0x01f7;
    L_0x01f6:
        goto L_0x0227;
    L_0x01f7:
        r3 = r2.a;	 Catch:{ all -> 0x0344 }
        r3 = r3.b();	 Catch:{ all -> 0x0344 }
        r4 = r9.b();	 Catch:{ all -> 0x0344 }
        if (r3 >= r4) goto L_0x0227;
    L_0x0203:
        r3 = r2.a;	 Catch:{ all -> 0x0344 }
        r3 = r3.d();	 Catch:{ all -> 0x0344 }
        r4 = r9.d();	 Catch:{ all -> 0x0344 }
        if (r3 >= r4) goto L_0x0227;
    L_0x020f:
        r3 = r2.a;	 Catch:{ all -> 0x0344 }
        r3 = r3.d();	 Catch:{ all -> 0x0344 }
        r4 = 720; // 0x2d0 float:1.009E-42 double:3.557E-321;
        if (r3 >= r4) goto L_0x0227;
    L_0x0219:
        r2 = r2.a;	 Catch:{ all -> 0x0344 }
        r2 = r2.c();	 Catch:{ all -> 0x0344 }
        r3 = 1280; // 0x500 float:1.794E-42 double:6.324E-321;
        if (r2 >= r3) goto L_0x0227;
    L_0x0223:
        r15.a = r1;	 Catch:{ all -> 0x0344 }
        goto L_0x029e;
    L_0x0227:
        r1 = r1 + 1;
        goto L_0x01e3;
    L_0x022a:
        r8 = r24;
        goto L_0x029c;
    L_0x022e:
        r24 = r7;
        if (r1 != 0) goto L_0x029e;
    L_0x0232:
        if (r17 == 0) goto L_0x029e;
    L_0x0234:
        r8 = r24;
        r0 = r10.a(r0, r8);	 Catch:{ all -> 0x0344 }
        r2 = r0.c;	 Catch:{ all -> 0x0344 }
        r0 = r0.a();	 Catch:{ all -> 0x0344 }
        r4 = (long) r0;	 Catch:{ all -> 0x0344 }
        if (r8 != 0) goto L_0x0244;
    L_0x0243:
        goto L_0x02a0;
    L_0x0244:
        r0 = r8.b();	 Catch:{ all -> 0x0344 }
        r0 = (long) r0;	 Catch:{ all -> 0x0344 }
        r6 = r10.c;	 Catch:{ all -> 0x0344 }
        r6 = r6.c;	 Catch:{ all -> 0x0344 }
        r7 = r6.a;	 Catch:{ all -> 0x0344 }
        r7 = r7 & r14;
        if (r7 == 0) goto L_0x0266;
    L_0x0252:
        r6 = r6.d;	 Catch:{ all -> 0x0344 }
        if (r6 != 0) goto L_0x0258;
    L_0x0256:
        r6 = defpackage.arhh.bv;	 Catch:{ all -> 0x0344 }
    L_0x0258:
        r6 = r6.N;	 Catch:{ all -> 0x0344 }
        if (r6 == 0) goto L_0x0266;
    L_0x025c:
        r6 = r20;
        r20 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r20 <= 0) goto L_0x0263;
    L_0x0262:
        goto L_0x0268;
    L_0x0263:
        r20 = r6;
        goto L_0x02a0;
    L_0x0266:
        r6 = r20;
    L_0x0268:
        r0 = r10.c;	 Catch:{ all -> 0x0344 }
        r0 = r0.N();	 Catch:{ all -> 0x0344 }
        if (r0 == 0) goto L_0x0279;
    L_0x0270:
        r0 = r29;
        r20 = r6;
        r0 = defpackage.affn.a(r0, r2, r4, r6);	 Catch:{ all -> 0x0344 }
        goto L_0x027d;
    L_0x0279:
        r20 = r6;
        r0 = r29;
    L_0x027d:
        r2 = r10.c;	 Catch:{ all -> 0x0344 }
        r2 = r2.c;	 Catch:{ all -> 0x0344 }
        r3 = r2.a;	 Catch:{ all -> 0x0344 }
        r3 = r3 & r14;
        if (r3 == 0) goto L_0x028f;
    L_0x0286:
        r2 = r2.d;	 Catch:{ all -> 0x0344 }
        if (r2 != 0) goto L_0x028c;
    L_0x028a:
        r2 = defpackage.arhh.bv;	 Catch:{ all -> 0x0344 }
    L_0x028c:
        r2 = r2.k;	 Catch:{ all -> 0x0344 }
        goto L_0x0290;
    L_0x028f:
        r2 = 0;
    L_0x0290:
        if (r2 == 0) goto L_0x0293;
    L_0x0292:
        goto L_0x0295;
    L_0x0293:
        r2 = 25000; // 0x61a8 float:3.5032E-41 double:1.23516E-319;
    L_0x0295:
        r2 = (long) r2;	 Catch:{ all -> 0x0344 }
        r2 = r2 * r18;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 < 0) goto L_0x02a0;
    L_0x029c:
        r9 = r8;
        goto L_0x02a0;
    L_0x029e:
        r8 = r24;
    L_0x02a0:
        if (r8 == 0) goto L_0x02ca;
    L_0x02a2:
        r0 = r8.equals(r9);	 Catch:{ all -> 0x0344 }
        if (r0 == 0) goto L_0x02a9;
    L_0x02a8:
        goto L_0x02ca;
    L_0x02a9:
        if (r17 == 0) goto L_0x02b4;
    L_0x02ab:
        r0 = r20;
        r2 = defpackage.affn.b(r8, r0);	 Catch:{ all -> 0x0344 }
        if (r2 == 0) goto L_0x02b6;
    L_0x02b3:
        goto L_0x02c1;
    L_0x02b4:
        r0 = r20;
    L_0x02b6:
        if (r16 == 0) goto L_0x02c6;
    L_0x02b8:
        r2 = r10.o;	 Catch:{ all -> 0x0344 }
        r2 = defpackage.affn.b(r9, r2);	 Catch:{ all -> 0x0344 }
        if (r2 != 0) goto L_0x02c1;
    L_0x02c0:
        goto L_0x02c6;
    L_0x02c1:
        r2 = 10001; // 0x2711 float:1.4014E-41 double:4.941E-320;
        r15.b = r2;	 Catch:{ all -> 0x0344 }
        goto L_0x02cc;
    L_0x02c6:
        r2 = 3;
        r15.b = r2;	 Catch:{ all -> 0x0344 }
        goto L_0x02cc;
    L_0x02ca:
        r0 = r20;
    L_0x02cc:
        r10.o = r0;	 Catch:{ all -> 0x0344 }
        r15.c = r9;	 Catch:{ all -> 0x0344 }
        goto L_0x0337;
    L_0x02d2:
        r13 = r8;
        r14 = 2;
        r7 = r1;
        goto L_0x02db;
    L_0x02d6:
        r13 = r8;
        r7 = r9;
        r14 = 2;
        r10 = r25;
    L_0x02db:
        r9 = 0;
        r1 = r25;
        r2 = r31;
        r5 = r27;
        r16 = r7;
        r7 = r29;
        r1 = r1.a(r2, r3, r5, r7, r9);	 Catch:{ all -> 0x0344 }
        r15.c = r1;	 Catch:{ all -> 0x0344 }
        r15.b = r14;	 Catch:{ all -> 0x0344 }
        r1 = r10.s;	 Catch:{ all -> 0x0344 }
        r1 = r1.a();	 Catch:{ all -> 0x0344 }
        if (r1 == 0) goto L_0x030e;
    L_0x02f6:
        r1 = r10.c;	 Catch:{ all -> 0x0344 }
        r1 = r1.c;	 Catch:{ all -> 0x0344 }
        r2 = r1.a;	 Catch:{ all -> 0x0344 }
        r2 = r2 & r14;
        if (r2 == 0) goto L_0x0308;
    L_0x02ff:
        r1 = r1.d;	 Catch:{ all -> 0x0344 }
        if (r1 != 0) goto L_0x0305;
    L_0x0303:
        r1 = defpackage.arhh.bv;	 Catch:{ all -> 0x0344 }
    L_0x0305:
        r9 = r1.m;	 Catch:{ all -> 0x0344 }
        goto L_0x0309;
    L_0x0308:
        r9 = 0;
    L_0x0309:
        r1 = (long) r9;	 Catch:{ all -> 0x0344 }
        r1 = r1 * r18;
        r16 = r1;
    L_0x030e:
        r1 = 1;
    L_0x030f:
        r2 = r26.size();	 Catch:{ all -> 0x0344 }
        if (r1 >= r2) goto L_0x0337;
    L_0x0315:
        r2 = r0.get(r1);	 Catch:{ all -> 0x0344 }
        r2 = (defpackage.afew) r2;	 Catch:{ all -> 0x0344 }
        r3 = r2.b;	 Catch:{ all -> 0x0344 }
        r3 = r3 - r11;
        r2 = r2.a;	 Catch:{ all -> 0x0344 }
        r2 = r2.d();	 Catch:{ all -> 0x0344 }
        r5 = r15.c;	 Catch:{ all -> 0x0344 }
        r5 = r5.d();	 Catch:{ all -> 0x0344 }
        if (r2 != r5) goto L_0x032d;
    L_0x032c:
        goto L_0x0334;
    L_0x032d:
        r2 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1));
        if (r2 < 0) goto L_0x0334;
    L_0x0331:
        r15.a = r1;	 Catch:{ all -> 0x0344 }
        goto L_0x0337;
    L_0x0334:
        r1 = r1 + 1;
        goto L_0x030f;
    L_0x0337:
        r15.d = r13;	 Catch:{ all -> 0x0344 }
        r0 = r10.s;	 Catch:{ all -> 0x0344 }
        r15.e = r0;	 Catch:{ all -> 0x0344 }
        r0 = r10.i;
        r1 = 1;
        r0.a(r1);
        return;
    L_0x0344:
        r0 = move-exception;
        r1 = 1;
        r2 = r10.k;	 Catch:{ all -> 0x0385 }
        if (r2 == 0) goto L_0x0374;
    L_0x034a:
        r3 = new afif;	 Catch:{ all -> 0x0385 }
        r4 = "player.fatalexception";
        r5 = java.util.concurrent.TimeUnit.MICROSECONDS;	 Catch:{ all -> 0x0385 }
        r5 = r5.toMillis(r11);	 Catch:{ all -> 0x0385 }
        r7 = "source.formatevaluator;";
        r8 = defpackage.afht.a(r0);	 Catch:{ all -> 0x0385 }
        r8 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x0385 }
        r9 = r8.length();	 Catch:{ all -> 0x0385 }
        if (r9 != 0) goto L_0x036a;
    L_0x0364:
        r8 = new java.lang.String;	 Catch:{ all -> 0x0385 }
        r8.<init>(r7);	 Catch:{ all -> 0x0385 }
        goto L_0x036e;
    L_0x036a:
        r8 = r7.concat(r8);	 Catch:{ all -> 0x0385 }
    L_0x036e:
        r3.<init>(r4, r5, r8);	 Catch:{ all -> 0x0385 }
        r2.a(r3);	 Catch:{ all -> 0x0385 }
    L_0x0374:
        r2 = r10.i;	 Catch:{ all -> 0x0385 }
        r3 = 0;
        r2.a(r3);	 Catch:{ all -> 0x0385 }
        r2 = r10.k;	 Catch:{ all -> 0x0385 }
        if (r2 == 0) goto L_0x0384;
    L_0x037e:
        r0 = r10.i;
        r0.a(r1);
        return;
    L_0x0384:
        throw r0;	 Catch:{ all -> 0x0385 }
    L_0x0385:
        r0 = move-exception;
        r2 = r10.i;
        r2.a(r1);
        goto L_0x038d;
    L_0x038c:
        throw r0;
    L_0x038d:
        goto L_0x038c;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affn.a(java.util.List, long, long, afex[], afeu):void");
    }

    private static long a(long j, long j2, long j3, long j4) {
        return j4 > 0 ? Math.max(0, (j + j2) - ((j2 * j3) / j4)) : 0;
    }

    /* JADX WARNING: Missing block: B:44:0x00e8, code skipped:
            if (r10.c > 0) goto L_0x00ea;
     */
    private final defpackage.aevj a(java.util.List r10, defpackage.afex r11) {
        /*
        r9 = this;
        r0 = r9.c;
        r1 = u;
        r0 = r0.a(r1);
        r1 = r0 + -1;
        if (r0 == 0) goto L_0x01a2;
    L_0x000c:
        r0 = 2;
        r2 = 3;
        r3 = 0;
        if (r1 == r0) goto L_0x011e;
    L_0x0012:
        if (r1 == r2) goto L_0x0102;
    L_0x0014:
        r0 = 5;
        r2 = 0;
        if (r1 == r0) goto L_0x0059;
    L_0x0018:
        r0 = r10.isEmpty();
        if (r0 != 0) goto L_0x003d;
    L_0x001e:
        r10 = r10.get(r2);
        r10 = (defpackage.afew) r10;
        r0 = r10.c;
        r2 = r10.b;
        r10 = new aevi;
        r10.<init>();
        r0 = r0 - r2;
        r10.a(r0);
        r11 = r11.b();
        r10.c(r11);
        r10 = r10.a();
        return r10;
    L_0x003d:
        r10 = new aevi;
        r10.<init>();
        r0 = r9.c;
        r0 = r0.O();
        r0 = (double) r0;
        r10 = r10.a(r0);
        r11 = r11.b();
        r10.c(r11);
        r10 = r10.a();
        return r10;
    L_0x0059:
        if (r10 != 0) goto L_0x005d;
    L_0x005b:
        r0 = 0;
        goto L_0x0071;
    L_0x005d:
        r0 = r10.isEmpty();
        if (r0 != 0) goto L_0x005b;
    L_0x0063:
        r0 = r10.size();
        r0 = r0 + -1;
        r0 = r10.get(r0);
        r0 = (defpackage.afew) r0;
        r0 = r0.e;
    L_0x0071:
        r1 = r9.l;
        if (r1 == 0) goto L_0x00eb;
    L_0x0075:
        r5 = r11.a();
        r1 = r1.a(r5);
        if (r1 != 0) goto L_0x00d6;
    L_0x007f:
        r1 = r10.isEmpty();
        if (r1 != 0) goto L_0x00eb;
    L_0x0085:
        r10 = r10.get(r2);
        r10 = (defpackage.afew) r10;
        r10 = r10.a;
        if (r10 == 0) goto L_0x00eb;
    L_0x008f:
        r1 = r10.b();
        if (r1 <= 0) goto L_0x00eb;
    L_0x0095:
        r1 = r9.l;
        r2 = r10.a();
        r1 = r1.a(r2);
        if (r1 != 0) goto L_0x00a2;
    L_0x00a1:
        goto L_0x00eb;
    L_0x00a2:
        if (r0 < 0) goto L_0x00eb;
    L_0x00a4:
        r2 = r1.a;
        if (r0 >= r2) goto L_0x00eb;
    L_0x00a8:
        r0 = defpackage.aevg.a(r1, r0);
        r1 = r0.d;
        if (r1 <= 0) goto L_0x00eb;
    L_0x00b0:
        r1 = r0.c;
        r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1));
        if (r5 <= 0) goto L_0x00eb;
    L_0x00b6:
        r11 = r11.b();
        r10 = r10.b();
        r1 = r0.a();
        r2 = new aevi;
        r2.<init>(r0);
        r11 = (float) r11;
        r10 = (float) r10;
        r11 = r11 / r10;
        r10 = (float) r1;
        r11 = r11 * r10;
        r10 = (int) r11;
        r2.c(r10);
        r10 = r2.a();
        goto L_0x00ea;
    L_0x00d6:
        if (r0 < 0) goto L_0x00eb;
    L_0x00d8:
        r10 = r1.a;
        if (r0 >= r10) goto L_0x00eb;
    L_0x00dc:
        r10 = defpackage.aevg.a(r1, r0);
        r0 = r10.d;
        if (r0 <= 0) goto L_0x00eb;
    L_0x00e4:
        r0 = r10.c;
        r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r2 <= 0) goto L_0x00eb;
    L_0x00ea:
        return r10;
    L_0x00eb:
        r10 = new aevi;
        r10.<init>();
        r0 = 4621819117588971520; // 0x4024000000000000 float:0.0 double:10.0;
        r10 = r10.a(r0);
        r11 = r11.b();
        r10.c(r11);
        r10 = r10.a();
        return r10;
    L_0x0102:
        r10 = new aevi;
        r10.<init>();
        r0 = r9.c;
        r0 = r0.O();
        r0 = (double) r0;
        r10 = r10.a(r0);
        r11 = r11.b();
        r10.c(r11);
        r10 = r10.a();
        return r10;
    L_0x011e:
        r0 = r10.isEmpty();
        if (r0 != 0) goto L_0x0186;
    L_0x0124:
        r0 = r10.size();
        r0 = r0 + -1;
        r10 = r10.get(r0);
        r10 = (defpackage.afew) r10;
        r0 = r10.c;
        r5 = r10.b;
        r0 = r0 - r5;
        r5 = (float) r0;
        r6 = 1232348160; // 0x49742400 float:1000000.0 double:6.088608896E-315;
        r5 = r5 / r6;
        r6 = 1101004800; // 0x41a00000 float:20.0 double:5.439686476E-315;
        r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r6 < 0) goto L_0x0141;
    L_0x0140:
        goto L_0x0186;
    L_0x0141:
        r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r6 <= 0) goto L_0x0186;
    L_0x0145:
        r6 = r10.d;
        r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1));
        if (r8 <= 0) goto L_0x0186;
    L_0x014b:
        r3 = r10.a;
        if (r3 == 0) goto L_0x0186;
    L_0x014f:
        r3 = r3.b();
        if (r3 <= 0) goto L_0x0186;
    L_0x0155:
        r3 = r10.d;
        r11 = r11.b();
        r6 = r10.a;
        r6 = r6.b();
        r7 = new aevi;
        r7.<init>();
        r7.a(r0);
        r11 = (float) r11;
        r6 = (float) r6;
        r11 = r11 / r6;
        r2 = r3 << r2;
        r2 = (float) r2;
        r2 = r2 / r5;
        r11 = r11 * r2;
        r11 = (int) r11;
        r7.c(r11);
        r11 = r10.e;
        r7.a(r11);
        r10 = r10.b;
        r10 = r10 + r0;
        r7.b(r10);
        r10 = r7.a();
        return r10;
    L_0x0186:
        r10 = new aevi;
        r10.<init>();
        r0 = r9.c;
        r0 = r0.O();
        r0 = (double) r0;
        r10 = r10.a(r0);
        r11 = r11.b();
        r10.c(r11);
        r10 = r10.a();
        return r10;
    L_0x01a2:
        r10 = 0;
        goto L_0x01a5;
    L_0x01a4:
        throw r10;
    L_0x01a5:
        goto L_0x01a4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affn.a(java.util.List, afex):aevj");
    }

    /* JADX WARNING: Missing block: B:24:0x0051, code skipped:
            if (r0.s.c() == false) goto L_0x0053;
     */
    private final defpackage.afex a(defpackage.afex[] r19, long r20, long r22, long r24, boolean r26) {
        /*
        r18 = this;
        r0 = r18;
        r1 = r19;
        r2 = r18.c();
        r3 = r1.length;
        r4 = -1;
        r3 = r3 + r4;
        r5 = 0;
        r6 = 0;
    L_0x000d:
        r7 = r1.length;
        if (r6 >= r7) goto L_0x001c;
    L_0x0010:
        r8 = r1[r6];
        r8 = r8.d();
        if (r8 <= r2) goto L_0x001b;
    L_0x0018:
        r6 = r6 + 1;
        goto L_0x000d;
    L_0x001b:
        r3 = r6;
    L_0x001c:
        r2 = r18.b();
        r7 = r7 + r4;
    L_0x0021:
        if (r7 < 0) goto L_0x002e;
    L_0x0023:
        r6 = r1[r7];
        r6 = r6.d();
        if (r6 >= r2) goto L_0x002f;
    L_0x002b:
        r7 = r7 + -1;
        goto L_0x0021;
    L_0x002e:
        r7 = 0;
    L_0x002f:
        if (r3 <= r7) goto L_0x0032;
    L_0x0031:
        r7 = r3;
    L_0x0032:
        if (r3 > r7) goto L_0x0100;
    L_0x0034:
        r2 = r1[r3];
        r6 = r0.c;
        r6 = r6.c;
        r8 = r6.a;
        r8 = r8 & 2;
        if (r8 == 0) goto L_0x0053;
    L_0x0040:
        r6 = r6.d;
        if (r6 != 0) goto L_0x0046;
    L_0x0044:
        r6 = defpackage.arhh.bv;
    L_0x0046:
        r6 = r6.bh;
        if (r6 != 0) goto L_0x004b;
    L_0x004a:
        goto L_0x0053;
    L_0x004b:
        r6 = r0.s;
        r6 = r6.c();
        if (r6 != 0) goto L_0x006b;
    L_0x0053:
        r6 = r2.c();
        r8 = r2.d();
        r9 = r0.m;
        r10 = r0.n;
        r11 = r0.f;
        r6 = defpackage.afgz.a(r6, r8, r9, r10, r11);
        if (r6 != 0) goto L_0x006b;
    L_0x0067:
        r8 = r20;
        goto L_0x00fc;
    L_0x006b:
        r8 = r20;
        r6 = defpackage.affn.b(r2, r8);
        if (r6 == 0) goto L_0x00fc;
    L_0x0073:
        r6 = r2.b();
        r10 = (long) r6;
        r12 = r0.s;
        r13 = r0.c;
        r14 = r0.t;
        r6 = r0.e;
        r6 = r6.get();
        r6 = (java.lang.Integer) r6;
        r15 = r6.intValue();
        r6 = r0.b;
        r16 = r6.k();
        r6 = defpackage.afgz.a(r10, r12, r13, r14, r15, r16);
        if (r6 == 0) goto L_0x00fc;
    L_0x0096:
        r6 = r0.s;
        r6 = r6.a();
        if (r6 != 0) goto L_0x00b0;
    L_0x009e:
        r6 = r0.s;
        r6 = r6.b();
        if (r6 != 0) goto L_0x00b0;
    L_0x00a6:
        r6 = r0.q;
        if (r6 == 0) goto L_0x00b0;
    L_0x00aa:
        r6 = defpackage.affn.a(r2);
        if (r6 == 0) goto L_0x00fc;
    L_0x00b0:
        r6 = r2.d();
        r10 = r0.b;
        r11 = r0.r;
        r6 = defpackage.afgz.a(r6, r10, r11);
        if (r6 != 0) goto L_0x00fc;
    L_0x00be:
        r6 = r0.d;
        if (r6 == 0) goto L_0x00f9;
    L_0x00c2:
        r6 = r0.j;
        r6 = android.text.TextUtils.isEmpty(r6);
        if (r6 != 0) goto L_0x00f9;
    L_0x00ca:
        r6 = r0.s;
        r6 = r6.a();
        if (r6 != 0) goto L_0x00f9;
    L_0x00d2:
        r6 = r2.a();
        r6 = defpackage.aajy.a(r6);
        if (r6 == r4) goto L_0x00f9;
    L_0x00dc:
        r6 = r0.c;
        r6 = r6.af();
        if (r6 != 0) goto L_0x00f9;
    L_0x00e4:
        r10 = r0.d;
        r11 = r0.j;
        r12 = r2.a();
        r13 = 0;
        r15 = 1;
        r16 = 3;
        r17 = 3;
        r2 = r10.a(r11, r12, r13, r15, r16, r17);
        if (r2 == 0) goto L_0x00fc;
    L_0x00f9:
        r2 = r1[r3];
        goto L_0x0102;
    L_0x00fc:
        r3 = r3 + 1;
        goto L_0x0032;
    L_0x0100:
        r2 = r1[r7];
    L_0x0102:
        if (r26 == 0) goto L_0x014c;
    L_0x0104:
        r3 = r22 + r24;
        r1 = r0.a(r1, r3);
        if (r1 == 0) goto L_0x014c;
    L_0x010c:
        r6 = r1.d();
        r7 = r2.d();
        r8 = r2.d();
        r9 = r1.d();
        r8 = r8 - r9;
        r9 = r0.c;
        r9 = r9.c;
        r10 = r9.a;
        r10 = r10 & 2;
        if (r10 == 0) goto L_0x0130;
    L_0x0127:
        r9 = r9.d;
        if (r9 != 0) goto L_0x012d;
    L_0x012b:
        r9 = defpackage.arhh.bv;
    L_0x012d:
        r9 = r9.an;
        goto L_0x0131;
    L_0x0130:
        r9 = 0;
    L_0x0131:
        if (r8 > r9) goto L_0x0139;
    L_0x0133:
        r8 = r0.t;
        if (r8 == 0) goto L_0x0138;
    L_0x0137:
        goto L_0x0139;
    L_0x0138:
        r5 = 1;
    L_0x0139:
        if (r6 >= r7) goto L_0x014b;
    L_0x013b:
        r3 = r0.a(r1, r3);
        if (r3 != 0) goto L_0x014b;
    L_0x0141:
        r3 = r0.b;
        r3 = r3.c();
        if (r3 == 0) goto L_0x014b;
    L_0x0149:
        if (r5 == 0) goto L_0x014c;
    L_0x014b:
        return r1;
    L_0x014c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affn.a(afex[], long, long, long, boolean):afex");
    }

    private final afex a(afex[] afexArr, long j) {
        afex[] afexArr2 = afexArr;
        int c = c();
        int b = b();
        afex afex = null;
        for (afex afex2 : afexArr2) {
            if (!a(afex2, j)) {
                if (!(this.d == null || TextUtils.isEmpty(this.j) || this.c.af())) {
                    int i;
                    aeeu aeeu = this.d;
                    String str = this.j;
                    String a = afex2.a();
                    awdg awdg = this.c.c;
                    if ((awdg.a & 2) != 0) {
                        arhh arhh = awdg.d;
                        if (arhh == null) {
                            arhh = arhh.bv;
                        }
                        i = arhh.H;
                    } else {
                        i = 0;
                    }
                    if (!aeeu.a(str, a, j, i != 0 ? i : 10, 0, 1)) {
                        continue;
                    }
                }
            }
            if (afex2.d() <= c && afex2.d() >= b) {
                return afex2;
            }
            if (afex == null) {
                afex = afex2;
            }
        }
        return afex;
    }

    private final int b() {
        return afgz.a(this.s, this.m, this.n, this.f, this.t);
    }

    private final int c() {
        return afgz.b(this.s, this.m, this.n, this.f, this.t);
    }

    private final boolean a(afex afex, long j) {
        return (this.d == null || TextUtils.isEmpty(this.j) || this.c.af() || !this.g || !this.d.a(this.j, afex.a(), j, 0, 0, 0)) ? false : true;
    }

    private static boolean b(afex afex, long j) {
        return ((long) afex.b()) <= j;
    }

    private static boolean a(afex afex) {
        return ((Set) aahv.aD.get()).contains(Integer.valueOf(aajy.a(afex.a())));
    }
}
