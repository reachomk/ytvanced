package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bcwx */
final class bcwx extends AtomicLong implements bcuc {
    public static final long serialVersionUID = 3534218984725836979L;
    private final bcup a;
    private final Object[] b;
    private int c;

    public bcwx(bcup bcup, Object[] objArr) {
        this.a = bcup;
        this.b = objArr;
    }

    /* JADX WARNING: Missing block: B:34:0x0079, code skipped:
            r10.c = r5;
            r11 = addAndGet(r6);
     */
    /* JADX WARNING: Missing block: B:35:0x0081, code skipped:
            if (r11 == 0) goto L_0x0084;
     */
    public final void a(long r11) {
        /*
        r10 = this;
        r0 = 0;
        r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1));
        if (r2 < 0) goto L_0x0085;
    L_0x0006:
        r2 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x0037;
    L_0x000f:
        r11 = defpackage.bcvu.a(r10, r11);
        r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1));
        if (r2 != 0) goto L_0x0084;
    L_0x0017:
        r11 = r10.a;
        r12 = r10.b;
        r0 = r12.length;
        r1 = 0;
    L_0x001d:
        if (r1 >= r0) goto L_0x002d;
    L_0x001f:
        r2 = r12[r1];
        r3 = r11.c();
        if (r3 != 0) goto L_0x0084;
    L_0x0027:
        r11.e_(r2);
        r1 = r1 + 1;
        goto L_0x001d;
    L_0x002d:
        r12 = r11.c();
        if (r12 != 0) goto L_0x0084;
    L_0x0033:
        r11.bM_();
        goto L_0x0084;
    L_0x0037:
        r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1));
        if (r2 == 0) goto L_0x0084;
    L_0x003b:
        r2 = defpackage.bcvu.a(r10, r11);
        r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r4 != 0) goto L_0x0084;
    L_0x0043:
        r2 = r10.a;
        r3 = r10.b;
        r4 = r3.length;
        r5 = r10.c;
    L_0x004a:
        r6 = r0;
    L_0x004b:
        r8 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1));
        if (r8 != 0) goto L_0x0050;
    L_0x004f:
        goto L_0x0070;
    L_0x0050:
        if (r5 == r4) goto L_0x0070;
    L_0x0052:
        r8 = r2.c();
        if (r8 != 0) goto L_0x0084;
    L_0x0058:
        r8 = r3[r5];
        r2.e_(r8);
        r5 = r5 + 1;
        if (r5 == r4) goto L_0x0066;
    L_0x0061:
        r8 = -1;
        r11 = r11 + r8;
        r6 = r6 + r8;
        goto L_0x004b;
    L_0x0066:
        r11 = r2.c();
        if (r11 != 0) goto L_0x0084;
    L_0x006c:
        r2.bM_();
        return;
    L_0x0070:
        r11 = r10.get();
        r11 = r11 + r6;
        r8 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1));
        if (r8 != 0) goto L_0x004b;
    L_0x0079:
        r10.c = r5;
        r11 = r10.addAndGet(r6);
        r6 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1));
        if (r6 == 0) goto L_0x0084;
    L_0x0083:
        goto L_0x004a;
    L_0x0084:
        return;
    L_0x0085:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "n >= 0 required but it was ";
        r1.append(r2);
        r1.append(r11);
        r11 = r1.toString();
        r0.<init>(r11);
        goto L_0x009d;
    L_0x009c:
        throw r0;
    L_0x009d:
        goto L_0x009c;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcwx.a(long):void");
    }
}
