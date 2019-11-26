package defpackage;

import java.util.List;

/* renamed from: aexa */
final class aexa extends oty implements oam {
    private final afev a;
    private final afeu b;
    private final oye f;
    private final afak g;
    private final aeoj h;
    private List i = amul.g();
    private long j = -9223372036854775807L;
    private final long k;

    aexa(afev afev, opx opx, afak afak, aeoj aeoj, long j, int... iArr) {
        oye oye = oye.a;
        super(opx, iArr);
        this.a = afev;
        this.b = new afeu();
        this.f = oye;
        this.g = afak;
        this.h = aeoj;
        this.k = j;
    }

    public final void a(int i, Object obj) {
        if (obj instanceof afjs) {
            this.a.a((afjs) obj);
        } else if (obj instanceof afgq) {
            this.a.a((afgq) obj);
        }
    }

    public final void a(long j, long j2, long j3, List list) {
        a(j, j2, list);
    }

    public final int b() {
        nzw nzw;
        afex afex = this.b.c;
        if (afex instanceof aexd) {
            aexd aexd = (aexd) afex;
            nzw = aexd.b == null ? aexd.a : aexd.b;
        } else {
            nzw = null;
        }
        return nzw != null ? a(nzw) : 0;
    }

    public final int c() {
        return this.b.b;
    }

    public final Object d() {
        afak afak = this.g;
        aequ aequ = this.b.d;
        if (aequ == null) {
            aequ = aequ.a;
        }
        return new afak(afak.a, afak.b, afak.d, aequ);
    }

    public final int a(long j, List list) {
        long j2 = 0;
        if (!list.isEmpty()) {
            j2 = Math.max(aexa.b((oqr) list.get(list.size() - 1)) - j, 0);
        }
        a(j, j2, list);
        return this.b.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c7 A:{SYNTHETIC, EDGE_INSN: B:54:0x00c7->B:26:0x00c7 ?: BREAK  , EDGE_INSN: B:54:0x00c7->B:26:0x00c7 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARNING: Missing block: B:9:0x005f, code skipped:
            if (r6 == ((defpackage.afew) r4.get(r4.size() - 1)).c) goto L_0x0061;
     */
    private final void a(long r26, long r28, java.util.List r30) {
        /*
        r25 = this;
        r0 = r25;
        r1 = r30;
        r2 = r0.f;
        r2 = r2.a();
        r4 = r30.isEmpty();
        r5 = 0;
        if (r4 == 0) goto L_0x0019;
    L_0x0011:
        r4 = r0.i;
        r4 = r4.isEmpty();
        if (r4 != 0) goto L_0x0061;
    L_0x0019:
        r4 = r30.size();
        r6 = r0.i;
        r6 = r6.size();
        if (r4 != r6) goto L_0x0076;
    L_0x0025:
        r4 = r1.get(r5);
        r4 = (defpackage.oqr) r4;
        r6 = defpackage.aexa.a(r4);
        r4 = r0.i;
        r4 = r4.get(r5);
        r4 = (defpackage.afew) r4;
        r8 = r4.b;
        r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r4 != 0) goto L_0x0076;
    L_0x003d:
        r4 = r30.size();
        r4 = r4 + -1;
        r4 = r1.get(r4);
        r4 = (defpackage.oqr) r4;
        r6 = defpackage.aexa.b(r4);
        r4 = r0.i;
        r8 = r4.size();
        r8 = r8 + -1;
        r4 = r4.get(r8);
        r4 = (defpackage.afew) r4;
        r8 = r4.c;
        r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r4 != 0) goto L_0x0076;
    L_0x0061:
        r6 = r0.j;
        r8 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r4 == 0) goto L_0x0076;
    L_0x006c:
        r6 = r2 - r6;
        r8 = r0.k;
        r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r4 <= 0) goto L_0x0075;
    L_0x0074:
        goto L_0x0076;
    L_0x0075:
        return;
    L_0x0076:
        r4 = r0.b;
        r6 = r30.size();
        r4.a = r6;
        r4 = new java.util.ArrayList;
        r6 = r30.size();
        r4.<init>(r6);
        r1 = r30.iterator();
    L_0x008b:
        r6 = r1.hasNext();
        r7 = 0;
        if (r6 == 0) goto L_0x00c7;
    L_0x0092:
        r6 = r1.next();
        r6 = (defpackage.oqr) r6;
        r14 = new afew;
        r8 = r6.g;
        if (r8 == 0) goto L_0x00a3;
    L_0x009e:
        r7 = new aexd;
        r7.<init>(r8);
    L_0x00a3:
        r9 = r7;
        r10 = defpackage.aexa.a(r6);
        r12 = defpackage.aexa.b(r6);
        r7 = r6.e;
        if (r7 == 0) goto L_0x00b3;
    L_0x00b0:
        r7 = r7.f;
        goto L_0x00b5;
    L_0x00b3:
        r7 = 0;
    L_0x00b5:
        r15 = r7;
        r6 = r6.d();
        r7 = (int) r6;
        r8 = r14;
        r6 = r14;
        r14 = r15;
        r16 = r7;
        r8.<init>(r9, r10, r12, r14, r16);
        r4.add(r6);
        goto L_0x008b;
    L_0x00c7:
        r0.i = r4;
        r0.j = r2;
        r1 = r0.a;
        r2 = r0.i;
        r3 = r0.c;
        r4 = r0.e;
        r6 = r4.length;
        r6 = new defpackage.aexd[r6];
        r8 = 0;
    L_0x00d7:
        r9 = r4.length;
        if (r8 >= r9) goto L_0x00f2;
    L_0x00da:
        r9 = r4[r8];
        r9 = r3.a(r9);
        if (r9 == 0) goto L_0x00ef;
    L_0x00e2:
        r9 = new aexd;
        r10 = r4[r8];
        r10 = r3.a(r10);
        r9.<init>(r10);
        r6[r8] = r9;
    L_0x00ef:
        r8 = r8 + 1;
        goto L_0x00d7;
    L_0x00f2:
        r3 = r0.h;
        if (r3 == 0) goto L_0x0148;
    L_0x00f6:
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = r6.length;
    L_0x00fc:
        if (r5 >= r4) goto L_0x0131;
    L_0x00fe:
        r8 = r6[r5];
        r9 = r0.h;
        r10 = r8.a();
        r9 = r9.a(r10);
        if (r9 == 0) goto L_0x010f;
    L_0x010c:
        r3.add(r8);
    L_0x010f:
        r9 = r0.h;
        r10 = r8.a();
        r9 = r9.a;
        r9 = r9.get(r10);
        r9 = (defpackage.aahr) r9;
        if (r9 == 0) goto L_0x0124;
    L_0x011f:
        r9 = r9.H();
        goto L_0x0125;
    L_0x0124:
        r9 = r7;
    L_0x0125:
        if (r9 != 0) goto L_0x0128;
    L_0x0127:
        goto L_0x012e;
    L_0x0128:
        r10 = r8.a;
        r8.b = r10;
        r8.a = r9;
    L_0x012e:
        r5 = r5 + 1;
        goto L_0x00fc;
    L_0x0131:
        r4 = r3.isEmpty();
        if (r4 == 0) goto L_0x013c;
    L_0x0137:
        r4 = "No formats found within the representationProvider: this should never happen!";
        defpackage.aepe.a(r4);
    L_0x013c:
        r4 = r3.size();
        r4 = new defpackage.aexd[r4];
        r3.toArray(r4);
        r23 = r4;
        goto L_0x014a;
    L_0x0148:
        r23 = r6;
    L_0x014a:
        r3 = r0.b;
        r17 = r1;
        r18 = r2;
        r19 = r26;
        r21 = r28;
        r24 = r3;
        r17.a(r18, r19, r21, r23, r24);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aexa.a(long, long, java.util.List):void");
    }

    private static long a(oqr oqr) {
        if (oqr instanceof aezr) {
            return ((aezr) oqr).q;
        }
        return oqr.j;
    }

    private static long b(oqr oqr) {
        if (oqr instanceof aezr) {
            return ((aezr) oqr).r;
        }
        return oqr.k;
    }
}
