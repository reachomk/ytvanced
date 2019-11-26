package defpackage;

import java.util.ArrayDeque;

/* renamed from: ogj */
final class ogj implements ogk {
    private final byte[] a = new byte[8];
    private final ArrayDeque b = new ArrayDeque();
    private final ogq c = new ogq();
    private ogl d;
    private int e;
    private int f;
    private long g;

    public final void a(ogl ogl) {
        this.d = ogl;
    }

    public final void a() {
        this.e = 0;
        this.b.clear();
        this.c.a();
    }

    /* JADX WARNING: Missing block: B:23:0x0080, code skipped:
            if (r0 == 1) goto L_0x0082;
     */
    public final boolean a(defpackage.ofp r12) {
        /*
        r11 = this;
        r0 = r11.d;
        defpackage.oxz.a(r0);
    L_0x0005:
        r0 = r11.b;
        r0 = r0.isEmpty();
        r1 = 1;
        if (r0 == 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0032;
    L_0x000f:
        r0 = r12;
        r0 = (defpackage.ofl) r0;
        r2 = r0.c;
        r0 = r11.b;
        r0 = r0.peek();
        r0 = (defpackage.ogi) r0;
        r4 = r0.b;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 < 0) goto L_0x0032;
    L_0x0022:
        r12 = r11.d;
        r0 = r11.b;
        r0 = r0.pop();
        r0 = (defpackage.ogi) r0;
        r0 = r0.a;
        r12.c(r0);
        return r1;
    L_0x0032:
        r0 = r11.e;
        r2 = 2;
        r3 = 4;
        r4 = 0;
        if (r0 != 0) goto L_0x0080;
    L_0x0039:
        r0 = r11.c;
        r5 = r0.a(r12, r1, r4, r3);
        r7 = -2;
        r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r0 != 0) goto L_0x0073;
    L_0x0045:
        r12.a();
    L_0x0048:
        r0 = r11.a;
        r12.c(r0, r4, r3);
        r0 = r11.a;
        r0 = r0[r4];
        r0 = defpackage.ogq.a(r0);
        r5 = -1;
        if (r0 != r5) goto L_0x0059;
    L_0x0058:
        goto L_0x006f;
    L_0x0059:
        if (r0 > r3) goto L_0x006f;
    L_0x005b:
        r5 = r11.a;
        r5 = defpackage.ogq.a(r5, r0, r4);
        r6 = (int) r5;
        r5 = r11.d;
        r5 = r5.b(r6);
        if (r5 == 0) goto L_0x006f;
    L_0x006a:
        r12.a(r0);
        r5 = (long) r6;
        goto L_0x0073;
    L_0x006f:
        r12.a(r1);
        goto L_0x0048;
    L_0x0073:
        r7 = -1;
        r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r0 == 0) goto L_0x007f;
    L_0x0079:
        r0 = (int) r5;
        r11.f = r0;
        r11.e = r1;
        goto L_0x0082;
    L_0x007f:
        return r4;
    L_0x0080:
        if (r0 != r1) goto L_0x008e;
    L_0x0082:
        r0 = r11.c;
        r5 = 8;
        r5 = r0.a(r12, r4, r1, r5);
        r11.g = r5;
        r11.e = r2;
    L_0x008e:
        r0 = r11.d;
        r5 = r11.f;
        r0 = r0.a(r5);
        if (r0 == 0) goto L_0x01a2;
    L_0x0098:
        if (r0 == r1) goto L_0x0183;
    L_0x009a:
        r5 = 8;
        if (r0 == r2) goto L_0x0155;
    L_0x009e:
        r2 = 3;
        if (r0 == r2) goto L_0x010e;
    L_0x00a1:
        if (r0 == r3) goto L_0x0101;
    L_0x00a3:
        r2 = 5;
        if (r0 != r2) goto L_0x00e8;
    L_0x00a6:
        r7 = r11.g;
        r9 = 4;
        r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r0 != 0) goto L_0x00af;
    L_0x00ae:
        goto L_0x00b3;
    L_0x00af:
        r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1));
        if (r0 != 0) goto L_0x00cf;
    L_0x00b3:
        r0 = r11.d;
        r2 = r11.f;
        r5 = (int) r7;
        r6 = r11.a(r12, r5);
        if (r5 != r3) goto L_0x00c5;
    L_0x00be:
        r12 = (int) r6;
        r12 = java.lang.Float.intBitsToFloat(r12);
        r5 = (double) r12;
        goto L_0x00c9;
    L_0x00c5:
        r5 = java.lang.Double.longBitsToDouble(r6);
    L_0x00c9:
        r0.a(r2, r5);
        r11.e = r4;
        return r1;
    L_0x00cf:
        r12 = new oae;
        r0 = new java.lang.StringBuilder;
        r1 = 40;
        r0.<init>(r1);
        r1 = "Invalid float size: ";
        r0.append(r1);
        r0.append(r7);
        r0 = r0.toString();
        r12.<init>(r0);
        throw r12;
    L_0x00e8:
        r12 = new oae;
        r1 = new java.lang.StringBuilder;
        r2 = 32;
        r1.<init>(r2);
        r2 = "Invalid element type ";
        r1.append(r2);
        r1.append(r0);
        r0 = r1.toString();
        r12.<init>(r0);
        throw r12;
    L_0x0101:
        r0 = r11.d;
        r2 = r11.f;
        r5 = r11.g;
        r3 = (int) r5;
        r0.a(r2, r3, r12);
        r11.e = r4;
        return r1;
    L_0x010e:
        r2 = r11.g;
        r5 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r0 > 0) goto L_0x013c;
    L_0x0117:
        r0 = r11.d;
        r5 = r11.f;
        r3 = (int) r2;
        if (r3 != 0) goto L_0x0121;
    L_0x011e:
        r12 = "";
        goto L_0x0136;
    L_0x0121:
        r2 = new byte[r3];
        r12.b(r2, r4, r3);
    L_0x0126:
        if (r3 <= 0) goto L_0x0131;
    L_0x0128:
        r12 = r3 + -1;
        r6 = r2[r12];
        if (r6 == 0) goto L_0x012f;
    L_0x012e:
        goto L_0x0131;
    L_0x012f:
        r3 = r12;
        goto L_0x0126;
    L_0x0131:
        r12 = new java.lang.String;
        r12.<init>(r2, r4, r3);
    L_0x0136:
        r0.a(r5, r12);
        r11.e = r4;
        return r1;
    L_0x013c:
        r12 = new oae;
        r0 = new java.lang.StringBuilder;
        r1 = 41;
        r0.<init>(r1);
        r1 = "String element size: ";
        r0.append(r1);
        r0.append(r2);
        r0 = r0.toString();
        r12.<init>(r0);
        throw r12;
    L_0x0155:
        r2 = r11.g;
        r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1));
        if (r0 > 0) goto L_0x016a;
    L_0x015b:
        r0 = r11.d;
        r5 = r11.f;
        r3 = (int) r2;
        r2 = r11.a(r12, r3);
        r0.a(r5, r2);
        r11.e = r4;
        return r1;
    L_0x016a:
        r12 = new oae;
        r0 = new java.lang.StringBuilder;
        r1 = 42;
        r0.<init>(r1);
        r1 = "Invalid integer size: ";
        r0.append(r1);
        r0.append(r2);
        r0 = r0.toString();
        r12.<init>(r0);
        throw r12;
    L_0x0183:
        r12 = (defpackage.ofl) r12;
        r7 = r12.c;
        r2 = r11.g;
        r12 = r11.b;
        r0 = new ogi;
        r5 = r11.f;
        r2 = r2 + r7;
        r0.<init>(r5, r2);
        r12.push(r0);
        r5 = r11.d;
        r6 = r11.f;
        r9 = r11.g;
        r5.a(r6, r7, r9);
        r11.e = r4;
        return r1;
    L_0x01a2:
        r0 = r11.g;
        r1 = (int) r0;
        r12.a(r1);
        r11.e = r4;
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogj.a(ofp):boolean");
    }

    private final long a(ofp ofp, int i) {
        int i2 = 0;
        ofp.b(this.a, 0, i);
        long j = 0;
        while (i2 < i) {
            j = (j << 8) | ((long) (this.a[i2] & 255));
            i2++;
        }
        return j;
    }
}
