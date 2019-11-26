package defpackage;

/* renamed from: onq */
public final class onq implements ooi, ooj {
    public final ooj a;
    public long b;
    public long c;
    private ooi d;
    private ont[] e = new ont[0];
    private long f;

    public onq(ooj ooj, boolean z, long j) {
        this.a = ooj;
        this.f = !z ? -9223372036854775807L : 0;
        this.b = 0;
        this.c = j;
    }

    public final void a(ooi ooi, long j) {
        this.d = ooi;
        this.a.a((ooi) this, j);
    }

    public final void aT_() {
        this.a.aT_();
    }

    public final opz b() {
        return this.a.b();
    }

    /* JADX WARNING: Missing block: B:14:0x004d, code skipped:
            if (r4 > r7) goto L_0x0050;
     */
    public final long a(defpackage.oum[] r14, boolean[] r15, defpackage.opr[] r16, boolean[] r17, long r18) {
        /*
        r13 = this;
        r0 = r13;
        r1 = r16;
        r2 = r1.length;
        r3 = new defpackage.ont[r2];
        r0.e = r3;
        r2 = new defpackage.opr[r2];
        r3 = 0;
        r4 = 0;
    L_0x000c:
        r5 = r1.length;
        r11 = 0;
        if (r4 >= r5) goto L_0x0021;
    L_0x0010:
        r5 = r0.e;
        r6 = r1[r4];
        r6 = (defpackage.ont) r6;
        r5[r4] = r6;
        if (r6 == 0) goto L_0x001c;
    L_0x001a:
        r11 = r6.a;
    L_0x001c:
        r2[r4] = r11;
        r4 = r4 + 1;
        goto L_0x000c;
    L_0x0021:
        r4 = r0.a;
        r5 = r14;
        r6 = r15;
        r7 = r2;
        r8 = r17;
        r9 = r18;
        r4 = r4.a(r5, r6, r7, r8, r9);
        r13.f();
        r6 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r0.f = r6;
        r6 = 1;
        r7 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1));
        if (r7 == 0) goto L_0x0051;
    L_0x003d:
        r7 = 0;
        r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r9 < 0) goto L_0x0050;
    L_0x0043:
        r7 = r0.c;
        r9 = -9223372036854775808;
        r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r12 == 0) goto L_0x0051;
    L_0x004b:
        r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r9 > 0) goto L_0x0050;
    L_0x004f:
        goto L_0x0051;
    L_0x0050:
        r6 = 0;
    L_0x0051:
        defpackage.oxz.b(r6);
    L_0x0054:
        r6 = r1.length;
        if (r3 >= r6) goto L_0x007e;
    L_0x0057:
        r6 = r2[r3];
        if (r6 != 0) goto L_0x0060;
    L_0x005b:
        r6 = r0.e;
        r6[r3] = r11;
        goto L_0x0075;
    L_0x0060:
        r7 = r1[r3];
        if (r7 == 0) goto L_0x006c;
    L_0x0064:
        r7 = r0.e;
        r7 = r7[r3];
        r7 = r7.a;
        if (r7 == r6) goto L_0x0075;
    L_0x006c:
        r7 = r0.e;
        r8 = new ont;
        r8.<init>(r13, r6);
        r7[r3] = r8;
    L_0x0075:
        r6 = r0.e;
        r6 = r6[r3];
        r1[r3] = r6;
        r3 = r3 + 1;
        goto L_0x0054;
    L_0x007e:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.onq.a(oum[], boolean[], opr[], boolean[], long):long");
    }

    public final void a(long j, boolean z) {
        this.a.a(j, z);
    }

    public final void a(long j) {
        this.a.a(j);
    }

    public final long c() {
        long j;
        if (f()) {
            j = this.f;
            this.f = -9223372036854775807L;
            long c = c();
            return c != -9223372036854775807L ? c : j;
        } else {
            j = this.a.c();
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            boolean z = true;
            oxz.b(j >= 0);
            long j2 = this.c;
            if (j2 != Long.MIN_VALUE && j > j2) {
                z = false;
            }
            oxz.b(z);
            return j;
        }
    }

    public final long d() {
        long d = this.a.d();
        if (d != Long.MIN_VALUE) {
            long j = this.c;
            if (j == Long.MIN_VALUE || d < j) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARNING: Missing block: B:13:0x0033, code skipped:
            if (r0 > r8) goto L_0x0036;
     */
    public final long b(long r8) {
        /*
        r7 = this;
        r0 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r7.f = r0;
        r0 = r7.e;
        r1 = r0.length;
        r2 = 0;
        r3 = 0;
    L_0x000c:
        if (r3 >= r1) goto L_0x0018;
    L_0x000e:
        r4 = r0[r3];
        if (r4 != 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r4.b = r2;
    L_0x0015:
        r3 = r3 + 1;
        goto L_0x000c;
    L_0x0018:
        r0 = r7.a;
        r0 = r0.b(r8);
        r3 = 1;
        r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r4 == 0) goto L_0x0037;
    L_0x0023:
        r8 = 0;
        r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r4 < 0) goto L_0x0036;
    L_0x0029:
        r8 = r7.c;
        r4 = -9223372036854775808;
        r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r6 == 0) goto L_0x0037;
    L_0x0031:
        r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r4 > 0) goto L_0x0036;
    L_0x0035:
        goto L_0x0037;
    L_0x0036:
        r3 = 0;
    L_0x0037:
        defpackage.oxz.b(r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.onq.b(long):long");
    }

    public final long a(long j, oap oap) {
        if (j == 0) {
            return 0;
        }
        long a = ozp.a(oap.c, 0, j);
        long j2 = oap.d;
        long j3 = this.c;
        j2 = ozp.a(j2, 0, j3 != Long.MIN_VALUE ? j3 - j : Long.MAX_VALUE);
        if (!(a == oap.c && j2 == oap.d)) {
            oap = new oap(a, j2);
        }
        return this.a.a(j, oap);
    }

    public final long e() {
        long e = this.a.e();
        if (e != Long.MIN_VALUE) {
            long j = this.c;
            if (j == Long.MIN_VALUE || e < j) {
                return e;
            }
        }
        return Long.MIN_VALUE;
    }

    public final boolean c(long j) {
        return this.a.c(j);
    }

    public final void a(ooj ooj) {
        this.d.a(this);
    }

    /* Access modifiers changed, original: final */
    public final boolean f() {
        return this.f != -9223372036854775807L;
    }
}
