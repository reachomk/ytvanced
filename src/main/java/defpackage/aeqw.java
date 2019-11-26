package defpackage;

import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: aeqw */
public final class aeqw implements aerg {
    private final float b;
    private final int c;
    private final LinkedList d;
    private final afim e;
    private final ArrayList f;
    private final ArrayList g;

    public aeqw(int i, float f) {
        boolean z = true;
        amqw.a(f > 0.0f);
        if (f >= 1.0f) {
            z = false;
        }
        amqw.a(z);
        this.c = i;
        this.b = f;
        this.d = new LinkedList();
        this.e = new afim();
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    public final void a() {
    }

    public final void a(float f) {
        this.d.addFirst(new aeqv(Math.log10((double) f)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x01d5  */
    public final float b() {
        /*
        r27 = this;
        r0 = r27;
        r1 = r0.f;
        r1.clear();
        r1 = r0.g;
        r1.clear();
        r1 = r0.d;
        r1 = r1.iterator();
        r2 = 0;
    L_0x0013:
        r3 = r1.hasNext();
        if (r3 != 0) goto L_0x001a;
    L_0x0019:
        goto L_0x0033;
    L_0x001a:
        r3 = r27.c();
        if (r3 == 0) goto L_0x0033;
    L_0x0020:
        r2 = r1.next();
        r2 = (defpackage.aeqv) r2;
        r3 = r0.g;
        r4 = r2.a;
        r2 = java.lang.Double.valueOf(r4);
        r3.add(r2);
        r2 = r3;
        goto L_0x0013;
    L_0x0033:
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x0040;
    L_0x0039:
        r1.next();
        r1.remove();
        goto L_0x0033;
    L_0x0040:
        if (r2 == 0) goto L_0x0051;
    L_0x0042:
        r1 = r27.c();
        if (r1 != 0) goto L_0x0051;
    L_0x0048:
        r1 = r2.size();
        r1 = r1 + -1;
        r2.remove(r1);
    L_0x0051:
        r1 = r0.g;
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x0218;
    L_0x0059:
        r1 = r0.e;
        r3 = r0.g;
        r4 = r0.f;
        r5 = r1.e;
        r5 = defpackage.afim.a(r5);
        r7 = 0;
        if (r5 != 0) goto L_0x006a;
    L_0x0069:
        goto L_0x007a;
    L_0x006a:
        r9 = r1.f;
        r5 = defpackage.afim.a(r9);
        if (r5 == 0) goto L_0x007a;
    L_0x0072:
        r9 = r1.f;
        r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r5 == 0) goto L_0x007a;
    L_0x0078:
        r5 = 0;
        goto L_0x00da;
    L_0x007a:
        r5 = r3.size();
        r10 = r7;
        r12 = r10;
        r9 = 0;
    L_0x0081:
        if (r9 >= r5) goto L_0x009c;
    L_0x0083:
        r14 = r3.get(r9);
        r14 = (java.lang.Double) r14;
        r15 = r14.doubleValue();
        r10 = r10 + r15;
        r15 = r14.doubleValue();
        r17 = r14.doubleValue();
        r15 = r15 * r17;
        r12 = r12 + r15;
        r9 = r9 + 1;
        goto L_0x0081;
    L_0x009c:
        r5 = r4.size();
        r9 = 0;
    L_0x00a1:
        if (r9 >= r5) goto L_0x00bc;
    L_0x00a3:
        r14 = r4.get(r9);
        r14 = (java.lang.Double) r14;
        r15 = r14.doubleValue();
        r10 = r10 + r15;
        r15 = r14.doubleValue();
        r17 = r14.doubleValue();
        r15 = r15 * r17;
        r12 = r12 + r15;
        r9 = r9 + 1;
        goto L_0x00a1;
    L_0x00bc:
        r5 = r4.size();
        r9 = r3.size();
        r5 = r5 + r9;
        r14 = (double) r5;
        java.lang.Double.isNaN(r14);
        r10 = r10 / r14;
        r1.e = r10;
        java.lang.Double.isNaN(r14);
        r12 = r12 / r14;
        r10 = r10 * r10;
        r12 = r12 - r10;
        r9 = java.lang.Math.sqrt(r12);
        r1.f = r9;
        goto L_0x0078;
    L_0x00da:
        r9 = r1.e;
        r11 = r1.f;
        r13 = r4.size();
        r15 = r7;
        r17 = r15;
        r14 = 0;
    L_0x00e6:
        if (r14 >= r13) goto L_0x014c;
    L_0x00e8:
        r19 = r4.get(r14);
        r19 = (java.lang.Double) r19;
        r20 = r19.doubleValue();
        r22 = r3;
        r2 = r1.e;
        r6 = r1.f;
        r20 = r20 - r2;
        r2 = r20 / r6;
        r20 = r11;
        r11 = -r2;
        r11 = r11 * r2;
        r23 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r11 = r11 / r23;
        r11 = java.lang.Math.exp(r11);
        r25 = defpackage.afim.b;
        r11 = r11 / r25;
        r6 = r6 * r11;
        r11 = defpackage.afim.a;
        r2 = r2 / r11;
        r11 = 0;
        r8 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1));
        if (r8 >= 0) goto L_0x011f;
    L_0x0118:
        r2 = -r2;
        r2 = defpackage.afhq.a(r2);
        r2 = -r2;
        goto L_0x0123;
    L_0x011f:
        r2 = defpackage.afhq.a(r2);
    L_0x0123:
        r11 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r2 = r2 + r11;
        r2 = r2 / r23;
        r11 = r11 - r2;
        r6 = r6 / r11;
        r2 = r1.e;
        r11 = r1.f;
        r23 = r2 + r6;
        r15 = r15 + r23;
        r23 = r2 * r2;
        r11 = r11 * r11;
        r23 = r23 + r11;
        r11 = r19.doubleValue();
        r2 = r2 + r11;
        r2 = r2 * r6;
        r23 = r23 + r2;
        r17 = r17 + r23;
        r14 = r14 + 1;
        r11 = r20;
        r3 = r22;
        r7 = 0;
        goto L_0x00e6;
    L_0x014c:
        r22 = r3;
        r20 = r11;
        r2 = r22.size();
        r3 = 0;
        r6 = 0;
        r11 = 0;
    L_0x0159:
        if (r3 >= r2) goto L_0x0178;
    L_0x015b:
        r8 = r22;
        r13 = r8.get(r3);
        r13 = (java.lang.Double) r13;
        r23 = r13.doubleValue();
        r6 = r6 + r23;
        r23 = r13.doubleValue();
        r13 = r13.doubleValue();
        r23 = r23 * r13;
        r11 = r11 + r23;
        r3 = r3 + 1;
        goto L_0x0159;
    L_0x0178:
        r8 = r22;
        r2 = r8.size();
        r3 = r4.size();
        r2 = r2 + r3;
        r2 = (double) r2;
        r6 = r6 + r15;
        java.lang.Double.isNaN(r2);
        r6 = r6 / r2;
        r1.e = r6;
        r11 = r11 + r17;
        java.lang.Double.isNaN(r2);
        r11 = r11 / r2;
        r6 = r6 * r6;
        r11 = r11 - r6;
        r2 = java.lang.Math.sqrt(r11);
        r1.f = r2;
        r6 = 1;
        r5 = r5 + r6;
        r2 = r1.e;
        r2 = defpackage.afim.a(r2);
        if (r2 == 0) goto L_0x01ac;
    L_0x01a4:
        r2 = r1.f;
        r2 = defpackage.afim.a(r2);
        if (r2 != 0) goto L_0x01ad;
    L_0x01ac:
        r6 = 0;
    L_0x01ad:
        if (r6 == 0) goto L_0x01d2;
    L_0x01af:
        r2 = r1.c;
        if (r5 >= r2) goto L_0x01d2;
    L_0x01b3:
        r2 = r1.e;
        r2 = r2 - r9;
        r2 = java.lang.Math.abs(r2);
        r11 = r1.f;
        r11 = r11 - r20;
        r11 = java.lang.Math.abs(r11);
        r2 = java.lang.Math.max(r2, r11);
        r11 = r1.d;
        r7 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1));
        if (r7 >= 0) goto L_0x01cd;
    L_0x01cc:
        goto L_0x01d2;
    L_0x01cd:
        r3 = r8;
        r7 = 0;
        goto L_0x00da;
    L_0x01d2:
        if (r6 == 0) goto L_0x01d5;
    L_0x01d4:
        goto L_0x01db;
    L_0x01d5:
        r1.e = r9;
        r2 = r20;
        r1.f = r2;
    L_0x01db:
        if (r6 == 0) goto L_0x0215;
    L_0x01dd:
        r1 = r1.c;
        if (r5 < r1) goto L_0x01e2;
    L_0x01e1:
        goto L_0x0215;
    L_0x01e2:
        r1 = r0.e;
        r2 = r0.b;
        r2 = (double) r2;
        r4 = r1.e;
        r6 = r1.f;
        r8 = defpackage.afim.a;
        r6 = r6 * r8;
        java.lang.Double.isNaN(r2);
        java.lang.Double.isNaN(r2);
        r2 = r2 + r2;
        r8 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
        r2 = r2 + r8;
        r8 = 0;
        r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r1 >= 0) goto L_0x0206;
    L_0x01ff:
        r1 = -r2;
        r1 = defpackage.afhq.b(r1);
        r1 = -r1;
        goto L_0x020a;
    L_0x0206:
        r1 = defpackage.afhq.b(r2);
    L_0x020a:
        r8 = 4621819117588971520; // 0x4024000000000000 float:0.0 double:10.0;
        r6 = r6 * r1;
        r4 = r4 + r6;
        r1 = java.lang.Math.pow(r8, r4);
        r1 = (float) r1;
        return r1;
    L_0x0215:
        r1 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;
        return r1;
    L_0x0218:
        r1 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeqw.b():float");
    }

    private final boolean c() {
        int size = this.f.size();
        int size2 = this.g.size();
        return size + size2 <= this.c || size2 < 2;
    }
}
