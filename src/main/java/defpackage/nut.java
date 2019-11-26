package defpackage;

import java.util.Stack;

/* renamed from: nut */
final class nut implements nuv {
    private final byte[] a = new byte[8];
    private final Stack b = new Stack();
    private final nva c = new nva();
    private nuy d;
    private int e;
    private int f;
    private long g;

    nut() {
    }

    public final void a(nuy nuy) {
        this.d = nuy;
    }

    public final void a() {
        this.e = 0;
        this.b.clear();
        this.c.a();
    }

    /* JADX WARNING: Missing block: B:27:0x0085, code skipped:
            if (r0 == 1) goto L_0x0087;
     */
    public final boolean a(defpackage.nrb r12) {
        /*
        r11 = this;
        r0 = r11.d;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0006:
        r0 = 1;
        goto L_0x0009;
    L_0x0008:
        r0 = 0;
    L_0x0009:
        defpackage.nwf.b(r0);
    L_0x000c:
        r0 = r11.b;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0015;
    L_0x0014:
        goto L_0x0038;
    L_0x0015:
        r0 = r12;
        r0 = (defpackage.nqx) r0;
        r3 = r0.c;
        r0 = r11.b;
        r0 = r0.peek();
        r0 = (defpackage.nuw) r0;
        r5 = r0.b;
        r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r0 < 0) goto L_0x0038;
    L_0x0028:
        r12 = r11.d;
        r0 = r11.b;
        r0 = r0.pop();
        r0 = (defpackage.nuw) r0;
        r0 = r0.a;
        r12.c(r0);
        return r1;
    L_0x0038:
        r0 = r11.e;
        r3 = 2;
        r4 = 4;
        if (r0 != 0) goto L_0x0085;
    L_0x003e:
        r0 = r11.c;
        r5 = r0.a(r12, r1, r2, r4);
        r7 = -2;
        r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r0 != 0) goto L_0x0078;
    L_0x004a:
        r12.a();
    L_0x004d:
        r0 = r11.a;
        r12.c(r0, r2, r4);
        r0 = r11.a;
        r0 = r0[r2];
        r0 = defpackage.nva.a(r0);
        r5 = -1;
        if (r0 != r5) goto L_0x005e;
    L_0x005d:
        goto L_0x0074;
    L_0x005e:
        if (r0 > r4) goto L_0x0074;
    L_0x0060:
        r5 = r11.a;
        r5 = defpackage.nva.a(r5, r0, r2);
        r6 = (int) r5;
        r5 = r11.d;
        r5 = r5.b(r6);
        if (r5 == 0) goto L_0x0074;
    L_0x006f:
        r12.a(r0);
        r5 = (long) r6;
        goto L_0x0078;
    L_0x0074:
        r12.a(r1);
        goto L_0x004d;
    L_0x0078:
        r7 = -1;
        r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r0 == 0) goto L_0x0084;
    L_0x007e:
        r0 = (int) r5;
        r11.f = r0;
        r11.e = r1;
        goto L_0x0087;
    L_0x0084:
        return r2;
    L_0x0085:
        if (r0 != r1) goto L_0x0093;
    L_0x0087:
        r0 = r11.c;
        r5 = 8;
        r5 = r0.a(r12, r2, r1, r5);
        r11.g = r5;
        r11.e = r3;
    L_0x0093:
        r0 = r11.d;
        r5 = r11.f;
        r0 = r0.a(r5);
        if (r0 == 0) goto L_0x019c;
    L_0x009d:
        if (r0 == r1) goto L_0x017d;
    L_0x009f:
        r5 = 8;
        if (r0 == r3) goto L_0x014f;
    L_0x00a3:
        r3 = 3;
        if (r0 == r3) goto L_0x0113;
    L_0x00a6:
        if (r0 == r4) goto L_0x0106;
    L_0x00a8:
        r3 = 5;
        if (r0 != r3) goto L_0x00ed;
    L_0x00ab:
        r7 = r11.g;
        r9 = 4;
        r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r0 != 0) goto L_0x00b4;
    L_0x00b3:
        goto L_0x00b8;
    L_0x00b4:
        r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
        if (r0 != 0) goto L_0x00d4;
    L_0x00b8:
        r0 = r11.d;
        r3 = r11.f;
        r5 = (int) r7;
        r6 = r11.a(r12, r5);
        if (r5 != r4) goto L_0x00ca;
    L_0x00c3:
        r12 = (int) r6;
        r12 = java.lang.Float.intBitsToFloat(r12);
        r4 = (double) r12;
        goto L_0x00ce;
    L_0x00ca:
        r4 = java.lang.Double.longBitsToDouble(r6);
    L_0x00ce:
        r0.a(r3, r4);
        r11.e = r2;
        return r1;
    L_0x00d4:
        r12 = new nnc;
        r0 = new java.lang.StringBuilder;
        r1 = 40;
        r0.<init>(r1);
        r1 = "Invalid float size: ";
        r0.append(r1);
        r0.append(r7);
        r0 = r0.toString();
        r12.<init>(r0);
        throw r12;
    L_0x00ed:
        r12 = new nnc;
        r1 = new java.lang.StringBuilder;
        r2 = 32;
        r1.<init>(r2);
        r2 = "Invalid element type ";
        r1.append(r2);
        r1.append(r0);
        r0 = r1.toString();
        r12.<init>(r0);
        throw r12;
    L_0x0106:
        r0 = r11.d;
        r3 = r11.f;
        r4 = r11.g;
        r5 = (int) r4;
        r0.a(r3, r5, r12);
        r11.e = r2;
        return r1;
    L_0x0113:
        r3 = r11.g;
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r0 > 0) goto L_0x0136;
    L_0x011c:
        r0 = r11.d;
        r5 = r11.f;
        r4 = (int) r3;
        if (r4 != 0) goto L_0x0126;
    L_0x0123:
        r12 = "";
        goto L_0x0130;
    L_0x0126:
        r3 = new byte[r4];
        r12.b(r3, r2, r4);
        r12 = new java.lang.String;
        r12.<init>(r3);
    L_0x0130:
        r0.a(r5, r12);
        r11.e = r2;
        return r1;
    L_0x0136:
        r12 = new nnc;
        r0 = new java.lang.StringBuilder;
        r1 = 41;
        r0.<init>(r1);
        r1 = "String element size: ";
        r0.append(r1);
        r0.append(r3);
        r0 = r0.toString();
        r12.<init>(r0);
        throw r12;
    L_0x014f:
        r3 = r11.g;
        r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r0 > 0) goto L_0x0164;
    L_0x0155:
        r0 = r11.d;
        r5 = r11.f;
        r4 = (int) r3;
        r3 = r11.a(r12, r4);
        r0.a(r5, r3);
        r11.e = r2;
        return r1;
    L_0x0164:
        r12 = new nnc;
        r0 = new java.lang.StringBuilder;
        r1 = 42;
        r0.<init>(r1);
        r1 = "Invalid integer size: ";
        r0.append(r1);
        r0.append(r3);
        r0 = r0.toString();
        r12.<init>(r0);
        throw r12;
    L_0x017d:
        r12 = (defpackage.nqx) r12;
        r5 = r12.c;
        r3 = r11.g;
        r12 = r11.b;
        r0 = new nuw;
        r7 = r11.f;
        r3 = r3 + r5;
        r0.<init>(r7, r3);
        r12.add(r0);
        r3 = r11.d;
        r4 = r11.f;
        r7 = r11.g;
        r3.a(r4, r5, r7);
        r11.e = r2;
        return r1;
    L_0x019c:
        r3 = r11.g;
        r0 = (int) r3;
        r12.a(r0);
        r11.e = r2;
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nut.a(nrb):boolean");
    }

    private final long a(nrb nrb, int i) {
        int i2 = 0;
        nrb.b(this.a, 0, i);
        long j = 0;
        while (i2 < i) {
            j = (j << 8) | ((long) (this.a[i2] & 255));
            i2++;
        }
        return j;
    }
}
