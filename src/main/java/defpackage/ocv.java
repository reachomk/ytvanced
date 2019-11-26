package defpackage;

/* renamed from: ocv */
final class ocv extends ock {
    ocv() {
    }

    public final int c() {
        return 2;
    }

    public final boolean a(int i, int i2, int i3) {
        if (i3 == 3 || i3 == 2 || i3 == aocf.UNSET_ENUM_VALUE || i3 == 1073741824) {
            return b(i, i2, i3);
        }
        throw new obp(i, i2, i3);
    }

    public final boolean a() {
        int i = this.e;
        return (i == 0 || i == 2) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060 A:{LOOP_START, PHI: r0 , LOOP:2: B:19:0x0060->B:20:0x0062} */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    public final void a(java.nio.ByteBuffer r8) {
        /*
        r7 = this;
        r0 = r8.position();
        r1 = r8.limit();
        r2 = r1 - r0;
        r3 = r7.e;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r6 = 3;
        if (r3 == r5) goto L_0x0020;
    L_0x0013:
        if (r3 == r6) goto L_0x0021;
    L_0x0015:
        if (r3 != r4) goto L_0x001a;
    L_0x0017:
        r2 = r2 / 2;
        goto L_0x0022;
    L_0x001a:
        r8 = new java.lang.IllegalStateException;
        r8.<init>();
        throw r8;
    L_0x0020:
        r2 = r2 / r6;
    L_0x0021:
        r2 = r2 + r2;
    L_0x0022:
        r2 = r7.a(r2);
        r3 = r7.e;
        if (r3 == r5) goto L_0x0060;
    L_0x002a:
        if (r3 == r6) goto L_0x004b;
    L_0x002c:
        if (r3 != r4) goto L_0x0045;
    L_0x002e:
        if (r0 >= r1) goto L_0x0077;
    L_0x0030:
        r3 = r0 + 2;
        r3 = r8.get(r3);
        r2.put(r3);
        r3 = r0 + 3;
        r3 = r8.get(r3);
        r2.put(r3);
        r0 = r0 + 4;
        goto L_0x002e;
    L_0x0045:
        r8 = new java.lang.IllegalStateException;
        r8.<init>();
        throw r8;
    L_0x004b:
        if (r0 >= r1) goto L_0x0077;
    L_0x004d:
        r3 = 0;
        r2.put(r3);
        r3 = r8.get(r0);
        r3 = r3 & 255;
        r3 = r3 + -128;
        r3 = (byte) r3;
        r2.put(r3);
        r0 = r0 + 1;
        goto L_0x004b;
    L_0x0060:
        if (r0 >= r1) goto L_0x0077;
    L_0x0062:
        r3 = r0 + 1;
        r3 = r8.get(r3);
        r2.put(r3);
        r3 = r0 + 2;
        r3 = r8.get(r3);
        r2.put(r3);
        r0 = r0 + 3;
        goto L_0x0060;
    L_0x0077:
        r0 = r8.limit();
        r8.position(r0);
        r2.flip();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocv.a(java.nio.ByteBuffer):void");
    }
}
