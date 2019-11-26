package defpackage;

/* renamed from: bcqs */
abstract class bcqs extends bcqp {
    private static final int[] G = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] H = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final long[] I = new long[12];
    private static final long[] J = new long[12];
    public static final long serialVersionUID = 538276888268L;

    bcqs(bcpl bcpl, int i) {
        super(bcpl, i);
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a6 A:{RETURN, PHI: r15 } */
    public final int a(long r13, int r15) {
        /*
        r12 = this;
        r0 = r12.b(r15);
        r13 = r13 - r0;
        r0 = 10;
        r13 = r13 >> r0;
        r14 = (int) r13;
        r13 = r12.c(r15);
        r15 = 12;
        r1 = 11;
        r2 = 9;
        r3 = 8;
        r4 = 6;
        r5 = 5;
        r6 = 3;
        r7 = 2;
        r8 = 7;
        r9 = 4;
        r10 = 1;
        r11 = 2615625; // 0x27e949 float:3.665271E-39 double:1.2922905E-317;
        if (r13 != 0) goto L_0x005e;
    L_0x0021:
        r13 = 15271875; // 0xe907c3 float:2.1400455E-38 double:7.545309E-317;
        if (r14 < r13) goto L_0x0044;
    L_0x0026:
        r13 = 23034375; // 0x15f7a07 float:4.1046182E-38 double:1.13804934E-316;
        if (r14 < r13) goto L_0x0038;
    L_0x002b:
        r13 = 25650000; // 0x1876350 float:4.9733674E-38 double:1.2672784E-316;
        if (r14 < r13) goto L_0x0074;
    L_0x0030:
        r13 = 28181250; // 0x1ae0302 float:6.392182E-38 double:1.39233875E-316;
        if (r14 < r13) goto L_0x0037;
    L_0x0035:
        goto L_0x00a6;
    L_0x0037:
        return r1;
    L_0x0038:
        r13 = 17887500; // 0x110f10c float:2.6621566E-38 double:8.837599E-317;
        if (r14 < r13) goto L_0x0085;
    L_0x003d:
        r13 = 20503125; // 0x138da55 float:3.3952108E-38 double:1.01298897E-316;
        if (r14 < r13) goto L_0x0043;
    L_0x0042:
        goto L_0x0081;
    L_0x0043:
        return r3;
    L_0x0044:
        r13 = 7593750; // 0x73df16 float:1.064111E-38 double:3.751811E-317;
        if (r14 < r13) goto L_0x0055;
    L_0x0049:
        r13 = 10125000; // 0x9a7ec8 float:1.4188147E-38 double:5.0024147E-317;
        if (r14 < r13) goto L_0x0099;
    L_0x004e:
        r13 = 12740625; // 0xc26811 float:1.7853418E-38 double:6.294705E-317;
        if (r14 < r13) goto L_0x0054;
    L_0x0053:
        goto L_0x0096;
    L_0x0054:
        return r5;
    L_0x0055:
        if (r14 < r11) goto L_0x00a5;
    L_0x0057:
        r13 = 4978125; // 0x4bf5cd float:6.975839E-39 double:2.4595205E-317;
        if (r14 < r13) goto L_0x005d;
    L_0x005c:
        goto L_0x00a2;
    L_0x005d:
        return r7;
    L_0x005e:
        r13 = 15356250; // 0xea515a float:2.151869E-38 double:7.5869956E-317;
        if (r14 < r13) goto L_0x0087;
    L_0x0063:
        r13 = 23118750; // 0x160c39e float:4.128265E-38 double:1.142218E-316;
        if (r14 < r13) goto L_0x0077;
    L_0x0068:
        r13 = 25734375; // 0x188ace7 float:5.020661E-38 double:1.27144706E-316;
        if (r14 < r13) goto L_0x0074;
    L_0x006d:
        r13 = 28265625; // 0x1af4c99 float:6.439476E-38 double:1.39650743E-316;
        if (r14 < r13) goto L_0x0073;
    L_0x0072:
        goto L_0x00a6;
    L_0x0073:
        return r1;
    L_0x0074:
        r15 = 10;
        goto L_0x00a6;
    L_0x0077:
        r13 = 17971875; // 0x1123aa3 float:2.6858035E-38 double:8.879286E-317;
        if (r14 < r13) goto L_0x0085;
    L_0x007c:
        r13 = 20587500; // 0x13a23ec float:3.4188577E-38 double:1.01715765E-316;
        if (r14 < r13) goto L_0x0084;
    L_0x0081:
        r15 = 9;
        goto L_0x00a6;
    L_0x0084:
        return r3;
    L_0x0085:
        r15 = 7;
        goto L_0x00a6;
    L_0x0087:
        r13 = 7678125; // 0x7528ad float:1.0759345E-38 double:3.793498E-317;
        if (r14 < r13) goto L_0x009b;
    L_0x008c:
        r13 = 10209375; // 0x9bc85f float:1.4306382E-38 double:5.0441015E-317;
        if (r14 < r13) goto L_0x0099;
    L_0x0091:
        r13 = 12825000; // 0xc3b1a8 float:1.7971653E-38 double:6.336392E-317;
        if (r14 < r13) goto L_0x0098;
    L_0x0096:
        r15 = 6;
        goto L_0x00a6;
    L_0x0098:
        return r5;
    L_0x0099:
        r15 = 4;
        goto L_0x00a6;
    L_0x009b:
        if (r14 < r11) goto L_0x00a5;
    L_0x009d:
        r13 = 5062500; // 0x4d3f64 float:7.094073E-39 double:2.5012073E-317;
        if (r14 < r13) goto L_0x00a4;
    L_0x00a2:
        r15 = 3;
        goto L_0x00a6;
    L_0x00a4:
        return r7;
    L_0x00a5:
        r15 = 1;
    L_0x00a6:
        return r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcqs.a(long, int):int");
    }

    /* Access modifiers changed, original: final */
    public final int a(int i, int i2) {
        if (c(i)) {
            return H[i2 - 1];
        }
        return G[i2 - 1];
    }

    /* Access modifiers changed, original: final */
    public final int c(long j, int i) {
        return (i <= 28 && i > 0) ? 28 : f(j);
    }

    /* Access modifiers changed, original: final */
    public final long b(int i, int i2) {
        if (c(i)) {
            return J[i2 - 1];
        }
        return I[i2 - 1];
    }

    /* Access modifiers changed, original: final */
    public final long d(long j, int i) {
        int a = a(j);
        int b = b(j, a);
        int e = bcqp.e(j);
        if (b > 59) {
            if (c(a)) {
                if (!c(i)) {
                    b--;
                }
            } else if (c(i)) {
                b++;
            }
        }
        return a(i, 1, b) + ((long) e);
    }

    static {
        long j = 0;
        int i = 0;
        long j2 = 0;
        while (i < 11) {
            j += ((long) G[i]) * 86400000;
            int i2 = i + 1;
            I[i2] = j;
            j2 += ((long) H[i]) * 86400000;
            J[i2] = j2;
            i = i2;
        }
    }
}
