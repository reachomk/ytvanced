package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: airo */
final class airo implements xcp {
    public String a;
    public volatile AtomicInteger b = new AtomicInteger();
    public volatile boolean c;
    public volatile boolean d;
    public volatile boolean e = true;
    private volatile boolean f;
    private volatile int g = 3;

    private airo() {
    }

    public final boolean a() {
        return this.g == 2;
    }

    /* synthetic */ airo(byte b) {
    }

    /* JADX WARNING: Missing block: B:15:0x0049, code skipped:
            r7.b.set(0);
            r7.f = false;
            r7.c = false;
            r7.d = false;
     */
    /* JADX WARNING: Missing block: B:18:0x0059, code skipped:
            if (r7.g != 1) goto L_0x005e;
     */
    /* JADX WARNING: Missing block: B:19:0x005b, code skipped:
            r7.g = 2;
     */
    /* JADX WARNING: Missing block: B:20:0x005e, code skipped:
            r7.g = 3;
     */
    public final java.lang.Class[] a(java.lang.Class r8, java.lang.Object r9, int r10) {
        /*
        r7 = this;
        r8 = 5;
        r0 = 4;
        r1 = -1;
        r2 = 3;
        r3 = 2;
        r4 = 0;
        r5 = 1;
        r6 = 0;
        if (r10 == r1) goto L_0x009e;
    L_0x000a:
        if (r10 == 0) goto L_0x007a;
    L_0x000c:
        if (r10 == r5) goto L_0x0069;
    L_0x000e:
        if (r10 == r3) goto L_0x0062;
    L_0x0010:
        if (r10 == r2) goto L_0x0034;
    L_0x0012:
        if (r10 != r0) goto L_0x001b;
    L_0x0014:
        r8 = r7.b;
        r8.incrementAndGet();
        goto L_0x00b4;
    L_0x001b:
        r8 = new java.lang.IllegalStateException;
        r9 = new java.lang.StringBuilder;
        r0 = 32;
        r9.<init>(r0);
        r0 = "unsupported op code: ";
        r9.append(r0);
        r9.append(r10);
        r9 = r9.toString();
        r8.<init>(r9);
        throw r8;
    L_0x0034:
        r9 = (defpackage.aiob) r9;
        r8 = r9.a;
        r9 = r8 + -1;
        if (r8 == 0) goto L_0x0061;
    L_0x003c:
        switch(r9) {
            case 0: goto L_0x0055;
            case 1: goto L_0x0047;
            case 2: goto L_0x0047;
            case 3: goto L_0x0040;
            case 4: goto L_0x0040;
            case 5: goto L_0x0055;
            case 6: goto L_0x0047;
            case 7: goto L_0x0049;
            default: goto L_0x003f;
        };
    L_0x003f:
        goto L_0x0057;
    L_0x0040:
        r7.f = r5;
        r7.c = r5;
        r7.d = r5;
        goto L_0x0057;
    L_0x0047:
        r7.e = r5;
    L_0x0049:
        r8 = r7.b;
        r8.set(r4);
        r7.f = r4;
        r7.c = r4;
        r7.d = r4;
        goto L_0x0057;
    L_0x0055:
        r7.e = r5;
    L_0x0057:
        r8 = r7.g;
        if (r8 != r5) goto L_0x005e;
    L_0x005b:
        r7.g = r3;
        goto L_0x00b4;
    L_0x005e:
        r7.g = r2;
        goto L_0x00b4;
    L_0x0061:
        throw r6;
    L_0x0062:
        r9 = (defpackage.ainy) r9;
        r8 = r9.a;
        r7.a = r8;
        goto L_0x00b4;
    L_0x0069:
        r9 = (defpackage.ainz) r9;
        r8 = r9.ordinal();
        if (r8 == 0) goto L_0x0077;
    L_0x0071:
        if (r8 == r5) goto L_0x0074;
    L_0x0073:
        goto L_0x00b4;
    L_0x0074:
        r7.g = r3;
        return r6;
    L_0x0077:
        r7.g = r5;
        return r6;
    L_0x007a:
        r9 = (defpackage.ahkn) r9;
        r9 = r9.a;
        r9 = r9.ordinal();
        if (r9 == r8) goto L_0x0096;
    L_0x0084:
        r8 = 8;
        if (r9 == r8) goto L_0x0089;
    L_0x0088:
        goto L_0x00b4;
    L_0x0089:
        r8 = r7.f;
        if (r8 != 0) goto L_0x008e;
    L_0x008d:
        goto L_0x00b4;
    L_0x008e:
        r8 = r7.b;
        r8.incrementAndGet();
        r7.f = r4;
        return r6;
    L_0x0096:
        r8 = r7.b;
        r8.set(r4);
        r7.f = r4;
        return r6;
    L_0x009e:
        r6 = new java.lang.Class[r8];
        r8 = defpackage.ahkn.class;
        r6[r4] = r8;
        r8 = defpackage.ainz.class;
        r6[r5] = r8;
        r8 = defpackage.ainy.class;
        r6[r3] = r8;
        r8 = defpackage.aiob.class;
        r6[r2] = r8;
        r8 = defpackage.airq.class;
        r6[r0] = r8;
    L_0x00b4:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.airo.a(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }
}
