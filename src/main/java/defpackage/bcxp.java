package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bcxp */
final class bcxp extends AtomicBoolean implements bcuc {
    public static final long serialVersionUID = -4015894850868853147L;
    private final /* synthetic */ bcxm a;

    bcxp(bcxm bcxm) {
        this.a = bcxm;
    }

    /* JADX WARNING: Missing block: B:9:0x0038, code skipped:
            if (r13 == 0) goto L_0x004b;
     */
    /* JADX WARNING: Missing block: B:14:0x0049, code skipped:
            if ((r4.get() & Long.MIN_VALUE) == 0) goto L_0x004b;
     */
    public final void a(long r18) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r3 = r0.a;
        r4 = r3.e;
        r5 = r3.d;
        r6 = r3.a;
        r7 = 0;
        r9 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r9 < 0) goto L_0x007e;
    L_0x0012:
        r9 = -9223372036854775808;
        r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r11 == 0) goto L_0x0042;
    L_0x0018:
        r11 = r4.get();
        r13 = r11 & r9;
        r15 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r7 = r11 & r15;
        r7 = defpackage.bcvu.b(r7, r1);
        r7 = r7 | r13;
        r7 = r4.compareAndSet(r11, r7);
        if (r7 == 0) goto L_0x003f;
    L_0x0030:
        r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1));
        if (r7 == 0) goto L_0x003b;
    L_0x0034:
        r7 = 0;
        r4 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1));
        if (r4 != 0) goto L_0x007d;
    L_0x003a:
        goto L_0x004b;
    L_0x003b:
        defpackage.bcvu.a(r4, r5, r6);
        return;
    L_0x003f:
        r7 = 0;
        goto L_0x0018;
    L_0x0042:
        r4 = r4.get();
        r4 = r4 & r9;
        r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r6 != 0) goto L_0x007d;
    L_0x004b:
        r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r4 != 0) goto L_0x0050;
    L_0x004f:
        goto L_0x007d;
    L_0x0050:
        r4 = r17.get();
        if (r4 != 0) goto L_0x0073;
    L_0x0056:
        r4 = 0;
        r5 = 1;
        r4 = r0.compareAndSet(r4, r5);
        if (r4 == 0) goto L_0x0073;
    L_0x005e:
        r4 = r3.c;
        r4 = (long) r4;
        r6 = -1;
        r1 = r1 + r6;
        r1 = defpackage.bcvu.a(r4, r1);
        r4 = r3.b;
        r4 = (long) r4;
        r1 = defpackage.bcvu.b(r1, r4);
        r3.a(r1);
        goto L_0x007d;
    L_0x0073:
        r4 = r3.c;
        r4 = (long) r4;
        r1 = defpackage.bcvu.a(r4, r1);
        r3.a(r1);
    L_0x007d:
        return;
    L_0x007e:
        r3 = new java.lang.IllegalArgumentException;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = "n >= 0 required but it was ";
        r4.append(r5);
        r4.append(r1);
        r1 = r4.toString();
        r3.<init>(r1);
        goto L_0x0096;
    L_0x0095:
        throw r3;
    L_0x0096:
        goto L_0x0095;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcxp.a(long):void");
    }
}
