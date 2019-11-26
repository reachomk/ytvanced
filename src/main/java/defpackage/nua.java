package defpackage;

import java.util.Arrays;

/* renamed from: nua */
final class nua extends ntv {
    private boolean a;
    private final nuj c;
    private final boolean[] d = new boolean[3];
    private final ntz e;
    private final nuf f;
    private final nuf g;
    private final nuf h;
    private long i;
    private long j;
    private final nwz k;

    public nua(nrs nrs, nuj nuj) {
        super(nrs);
        this.c = nuj;
        this.e = new ntz(nrs);
        this.f = new nuf(7);
        this.g = new nuf(8);
        this.h = new nuf(6);
        this.k = new nwz();
    }

    public final void b() {
    }

    public final void a() {
        nwv.a(this.d);
        this.f.a();
        this.g.a();
        this.h.a();
        this.e.a();
        this.i = 0;
    }

    public final void a(long j, boolean z) {
        this.j = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0189  */
    public final void a(defpackage.nwz r26) {
        /*
        r25 = this;
        r0 = r25;
        r1 = r26;
        r2 = r26.b();
        if (r2 <= 0) goto L_0x01ad;
    L_0x000a:
        r2 = r1.b;
        r3 = r1.c;
        r4 = r1.a;
        r5 = r0.i;
        r7 = r26.b();
        r7 = (long) r7;
        r5 = r5 + r7;
        r0.i = r5;
        r5 = r0.b;
        r6 = r26.b();
        r5.a(r1, r6);
    L_0x0023:
        r1 = r0.d;
        r1 = defpackage.nwv.a(r4, r2, r3, r1);
        if (r1 != r3) goto L_0x002f;
    L_0x002b:
        r0.a(r4, r2, r3);
        return;
    L_0x002f:
        r5 = defpackage.nwv.b(r4, r1);
        r6 = r1 - r2;
        if (r6 > 0) goto L_0x0038;
    L_0x0037:
        goto L_0x003b;
    L_0x0038:
        r0.a(r4, r2, r1);
    L_0x003b:
        r2 = r3 - r1;
        r7 = r0.i;
        r9 = (long) r2;
        r7 = r7 - r9;
        if (r6 >= 0) goto L_0x0045;
    L_0x0043:
        r6 = -r6;
        goto L_0x0046;
    L_0x0045:
        r6 = 0;
    L_0x0046:
        r10 = r0.j;
        r12 = r0.a;
        if (r12 != 0) goto L_0x0114;
    L_0x004c:
        r12 = r0.f;
        r12.b(r6);
        r12 = r0.g;
        r12.b(r6);
        r12 = r0.a;
        if (r12 != 0) goto L_0x00da;
    L_0x005a:
        r12 = r0.f;
        r12 = r12.a;
        if (r12 == 0) goto L_0x0114;
    L_0x0060:
        r12 = r0.g;
        r12 = r12.a;
        if (r12 == 0) goto L_0x0114;
    L_0x0066:
        r12 = new java.util.ArrayList;
        r12.<init>();
        r14 = r0.f;
        r15 = r14.b;
        r14 = r14.c;
        r14 = java.util.Arrays.copyOf(r15, r14);
        r12.add(r14);
        r14 = r0.g;
        r15 = r14.b;
        r14 = r14.c;
        r14 = java.util.Arrays.copyOf(r15, r14);
        r12.add(r14);
        r14 = r0.f;
        r14 = defpackage.nua.a(r14);
        r15 = defpackage.nwv.a(r14);
        r14 = r0.g;
        r14 = defpackage.nua.a(r14);
        r14 = defpackage.nwv.b(r14);
        r9 = r0.b;
        r16 = -1;
        r13 = r15.b;
        r21 = r3;
        r3 = r15.c;
        r22 = r4;
        r4 = r15.d;
        r18 = "video/avc";
        r23 = r1;
        r1 = r14;
        r14 = r18;
        r24 = r5;
        r5 = r15;
        r15 = r16;
        r17 = r13;
        r18 = r3;
        r19 = r12;
        r20 = r4;
        r3 = defpackage.nmx.a(r14, r15, r17, r18, r19, r20);
        r9.a(r3);
        r3 = 1;
        r0.a = r3;
        r3 = r0.e;
        r3.a(r5);
        r3 = r0.e;
        r3.a(r1);
        r1 = r0.f;
        r1.a();
        r1 = r0.g;
        r1.a();
        goto L_0x011c;
    L_0x00da:
        r23 = r1;
        r21 = r3;
        r22 = r4;
        r24 = r5;
        r1 = r0.f;
        r3 = r1.a;
        if (r3 == 0) goto L_0x00fb;
    L_0x00e8:
        r1 = defpackage.nua.a(r1);
        r1 = defpackage.nwv.a(r1);
        r3 = r0.e;
        r3.a(r1);
        r1 = r0.f;
        r1.a();
        goto L_0x011c;
    L_0x00fb:
        r1 = r0.g;
        r3 = r1.a;
        if (r3 == 0) goto L_0x011c;
    L_0x0101:
        r1 = defpackage.nua.a(r1);
        r1 = defpackage.nwv.b(r1);
        r3 = r0.e;
        r3.a(r1);
        r1 = r0.g;
        r1.a();
        goto L_0x011c;
    L_0x0114:
        r23 = r1;
        r21 = r3;
        r22 = r4;
        r24 = r5;
    L_0x011c:
        r1 = r0.h;
        r1 = r1.b(r6);
        if (r1 == 0) goto L_0x0144;
    L_0x0124:
        r1 = r0.h;
        r3 = r1.b;
        r1 = r1.c;
        r1 = defpackage.nwv.a(r3, r1);
        r3 = r0.k;
        r4 = r0.h;
        r4 = r4.b;
        r3.a(r4, r1);
        r1 = r0.k;
        r3 = 4;
        r1.c(r3);
        r1 = r0.c;
        r3 = r0.k;
        r1.a(r10, r3);
    L_0x0144:
        r1 = r0.e;
        r3 = r1.i;
        r4 = 9;
        if (r3 != r4) goto L_0x0175;
    L_0x014c:
        r3 = r1.o;
        if (r3 == 0) goto L_0x0166;
    L_0x0150:
        r3 = r1.j;
        r12 = r1.r;
        r5 = r1.p;
        r9 = r1.a;
        r10 = r1.q;
        r5 = r3 - r5;
        r13 = (int) r5;
        r3 = r7 - r3;
        r4 = (int) r3;
        r14 = r2 + r4;
        r15 = 0;
        r9.a(r10, r12, r13, r14, r15);
    L_0x0166:
        r2 = r1.j;
        r1.p = r2;
        r2 = r1.l;
        r1.q = r2;
        r2 = 0;
        r1.r = r2;
        r3 = 1;
        r1.o = r3;
        goto L_0x0177;
    L_0x0175:
        r2 = 0;
        r3 = 1;
    L_0x0177:
        r4 = r1.r;
        r5 = r1.i;
        r6 = 5;
        if (r5 == r6) goto L_0x017f;
    L_0x017e:
        goto L_0x0180;
    L_0x017f:
        r2 = 1;
    L_0x0180:
        r2 = r2 | r4;
        r1.r = r2;
        r1 = r0.j;
        r3 = r0.a;
        if (r3 != 0) goto L_0x0196;
    L_0x0189:
        r3 = r0.f;
        r4 = r24;
        r3.a(r4);
        r3 = r0.g;
        r3.a(r4);
        goto L_0x0198;
    L_0x0196:
        r4 = r24;
    L_0x0198:
        r3 = r0.h;
        r3.a(r4);
        r3 = r0.e;
        r3.i = r4;
        r3.l = r1;
        r3.j = r7;
        r2 = r23 + 3;
        r3 = r21;
        r4 = r22;
        goto L_0x0023;
    L_0x01ad:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nua.a(nwz):void");
    }

    private final void a(byte[] bArr, int i, int i2) {
        if (!this.a) {
            this.f.a(bArr, i, i2);
            this.g.a(bArr, i, i2);
        }
        this.h.a(bArr, i, i2);
        ntz ntz = this.e;
        if (ntz.k) {
            i2 -= i;
            byte[] bArr2 = ntz.g;
            int i3 = ntz.h + i2;
            if (bArr2.length < i3) {
                ntz.g = Arrays.copyOf(bArr2, i3 + i3);
            }
            System.arraycopy(bArr, i, ntz.g, ntz.h, i2);
            int i4 = ntz.h + i2;
            ntz.h = i4;
            ntz.d.a(ntz.g, i4);
            if (ntz.d.a() >= 8) {
                ntz.d.b(1);
                ntz.d.c(2);
                ntz.d.b(5);
                if (ntz.d.c()) {
                    ntz.d.e();
                    if (ntz.d.c()) {
                        i4 = ntz.d.e();
                        ntz.k = false;
                        nuc nuc = ntz.n;
                        nuc.c = i4;
                        nuc.b = true;
                    }
                }
            }
        }
    }

    private static nxa a(nuf nuf) {
        nxa nxa = new nxa(nuf.b, nwv.a(nuf.b, nuf.c));
        nxa.b(32);
        return nxa;
    }
}
