package defpackage;

/* renamed from: nro */
public final class nro {
    public int a = 1000;
    public long[] b = new long[1000];
    public int[] c = new int[1000];
    public int d;
    public int e;
    public int f;
    public int g;
    private int[] h = new int[1000];
    private long[] i = new long[1000];
    private byte[][] j = new byte[1000][];

    public final int a() {
        return this.e + this.d;
    }

    public final synchronized boolean a(nnb nnb, nrn nrn) {
        boolean z;
        if (this.d != 0) {
            long[] jArr = this.i;
            int i = this.f;
            nnb.e = jArr[i];
            nnb.c = this.c[i];
            nnb.d = this.h[i];
            nrn.a = this.b[i];
            nrn.b = this.j[i];
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized long b() {
        long j;
        int i = this.d - 1;
        this.d = i;
        int i2 = this.f;
        int i3 = i2 + 1;
        this.f = i3;
        this.e++;
        if (i3 == this.a) {
            this.f = 0;
            i3 = 0;
        }
        if (i > 0) {
            j = this.b[i3];
        } else {
            j = ((long) this.c[i2]) + this.b[i2];
        }
        return j;
    }

    /* JADX WARNING: Missing block: B:30:0x005f, code skipped:
            return -1;
     */
    public final synchronized long a(long r10) {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r9.d;	 Catch:{ all -> 0x0060 }
        r1 = -1;
        if (r0 == 0) goto L_0x005e;
    L_0x0007:
        r0 = r9.i;	 Catch:{ all -> 0x0060 }
        r3 = r9.f;	 Catch:{ all -> 0x0060 }
        r4 = r0[r3];	 Catch:{ all -> 0x0060 }
        r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r6 < 0) goto L_0x005e;
    L_0x0011:
        r4 = r9.g;	 Catch:{ all -> 0x0060 }
        if (r4 != 0) goto L_0x0017;
    L_0x0015:
        r4 = r9.a;	 Catch:{ all -> 0x0060 }
    L_0x0017:
        r5 = -1;
        r4 = r4 + r5;
        r6 = r0[r4];	 Catch:{ all -> 0x0060 }
        r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
        if (r0 > 0) goto L_0x005c;
    L_0x001f:
        r0 = 0;
        r0 = -1;
        r4 = 0;
    L_0x0022:
        r6 = r9.g;	 Catch:{ all -> 0x0060 }
        if (r3 == r6) goto L_0x0040;
    L_0x0026:
        r6 = r9.i;	 Catch:{ all -> 0x0060 }
        r7 = r6[r3];	 Catch:{ all -> 0x0060 }
        r6 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1));
        if (r6 > 0) goto L_0x0040;
    L_0x002e:
        r6 = r9.h;	 Catch:{ all -> 0x0060 }
        r6 = r6[r3];	 Catch:{ all -> 0x0060 }
        r6 = r6 & 1;
        if (r6 != 0) goto L_0x0037;
    L_0x0036:
        goto L_0x0038;
    L_0x0037:
        r0 = r4;
    L_0x0038:
        r3 = r3 + 1;
        r6 = r9.a;	 Catch:{ all -> 0x0060 }
        r3 = r3 % r6;
        r4 = r4 + 1;
        goto L_0x0022;
    L_0x0040:
        if (r0 == r5) goto L_0x005a;
    L_0x0042:
        r10 = r9.d;	 Catch:{ all -> 0x0060 }
        r10 = r10 - r0;
        r9.d = r10;	 Catch:{ all -> 0x0060 }
        r10 = r9.f;	 Catch:{ all -> 0x0060 }
        r10 = r10 + r0;
        r11 = r9.a;	 Catch:{ all -> 0x0060 }
        r10 = r10 % r11;
        r9.f = r10;	 Catch:{ all -> 0x0060 }
        r11 = r9.e;	 Catch:{ all -> 0x0060 }
        r11 = r11 + r0;
        r9.e = r11;	 Catch:{ all -> 0x0060 }
        r11 = r9.b;	 Catch:{ all -> 0x0060 }
        r10 = r11[r10];	 Catch:{ all -> 0x0060 }
        monitor-exit(r9);
        return r10;
    L_0x005a:
        monitor-exit(r9);
        return r1;
    L_0x005c:
        monitor-exit(r9);
        return r1;
    L_0x005e:
        monitor-exit(r9);
        return r1;
    L_0x0060:
        r10 = move-exception;
        monitor-exit(r9);
        goto L_0x0064;
    L_0x0063:
        throw r10;
    L_0x0064:
        goto L_0x0063;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nro.a(long):long");
    }

    /* JADX WARNING: Missing block: B:11:0x008b, code skipped:
            return;
     */
    public final synchronized void a(long r4, int r6, long r7, int r9, byte[] r10) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.i;	 Catch:{ all -> 0x008c }
        r1 = r3.g;	 Catch:{ all -> 0x008c }
        r0[r1] = r4;	 Catch:{ all -> 0x008c }
        r4 = r3.b;	 Catch:{ all -> 0x008c }
        r4[r1] = r7;	 Catch:{ all -> 0x008c }
        r5 = r3.c;	 Catch:{ all -> 0x008c }
        r5[r1] = r9;	 Catch:{ all -> 0x008c }
        r5 = r3.h;	 Catch:{ all -> 0x008c }
        r5[r1] = r6;	 Catch:{ all -> 0x008c }
        r5 = r3.j;	 Catch:{ all -> 0x008c }
        r5[r1] = r10;	 Catch:{ all -> 0x008c }
        r5 = r3.d;	 Catch:{ all -> 0x008c }
        r5 = r5 + 1;
        r3.d = r5;	 Catch:{ all -> 0x008c }
        r6 = r3.a;	 Catch:{ all -> 0x008c }
        r7 = 0;
        if (r5 != r6) goto L_0x0080;
    L_0x0022:
        r5 = r6 + 1000;
        r8 = new long[r5];	 Catch:{ all -> 0x008c }
        r9 = new long[r5];	 Catch:{ all -> 0x008c }
        r10 = new int[r5];	 Catch:{ all -> 0x008c }
        r0 = new int[r5];	 Catch:{ all -> 0x008c }
        r1 = new byte[r5][];	 Catch:{ all -> 0x008c }
        r2 = r3.f;	 Catch:{ all -> 0x008c }
        r6 = r6 - r2;
        java.lang.System.arraycopy(r4, r2, r8, r7, r6);	 Catch:{ all -> 0x008c }
        r4 = r3.i;	 Catch:{ all -> 0x008c }
        r2 = r3.f;	 Catch:{ all -> 0x008c }
        java.lang.System.arraycopy(r4, r2, r9, r7, r6);	 Catch:{ all -> 0x008c }
        r4 = r3.h;	 Catch:{ all -> 0x008c }
        r2 = r3.f;	 Catch:{ all -> 0x008c }
        java.lang.System.arraycopy(r4, r2, r10, r7, r6);	 Catch:{ all -> 0x008c }
        r4 = r3.c;	 Catch:{ all -> 0x008c }
        r2 = r3.f;	 Catch:{ all -> 0x008c }
        java.lang.System.arraycopy(r4, r2, r0, r7, r6);	 Catch:{ all -> 0x008c }
        r4 = r3.j;	 Catch:{ all -> 0x008c }
        r2 = r3.f;	 Catch:{ all -> 0x008c }
        java.lang.System.arraycopy(r4, r2, r1, r7, r6);	 Catch:{ all -> 0x008c }
        r4 = r3.f;	 Catch:{ all -> 0x008c }
        r2 = r3.b;	 Catch:{ all -> 0x008c }
        java.lang.System.arraycopy(r2, r7, r8, r6, r4);	 Catch:{ all -> 0x008c }
        r2 = r3.i;	 Catch:{ all -> 0x008c }
        java.lang.System.arraycopy(r2, r7, r9, r6, r4);	 Catch:{ all -> 0x008c }
        r2 = r3.h;	 Catch:{ all -> 0x008c }
        java.lang.System.arraycopy(r2, r7, r10, r6, r4);	 Catch:{ all -> 0x008c }
        r2 = r3.c;	 Catch:{ all -> 0x008c }
        java.lang.System.arraycopy(r2, r7, r0, r6, r4);	 Catch:{ all -> 0x008c }
        r2 = r3.j;	 Catch:{ all -> 0x008c }
        java.lang.System.arraycopy(r2, r7, r1, r6, r4);	 Catch:{ all -> 0x008c }
        r3.b = r8;	 Catch:{ all -> 0x008c }
        r3.i = r9;	 Catch:{ all -> 0x008c }
        r3.h = r10;	 Catch:{ all -> 0x008c }
        r3.c = r0;	 Catch:{ all -> 0x008c }
        r3.j = r1;	 Catch:{ all -> 0x008c }
        r3.f = r7;	 Catch:{ all -> 0x008c }
        r4 = r3.a;	 Catch:{ all -> 0x008c }
        r3.g = r4;	 Catch:{ all -> 0x008c }
        r3.d = r4;	 Catch:{ all -> 0x008c }
        r3.a = r5;	 Catch:{ all -> 0x008c }
        goto L_0x008a;
    L_0x0080:
        r1 = r1 + 1;
        r3.g = r1;	 Catch:{ all -> 0x008c }
        if (r1 != r6) goto L_0x008a;
    L_0x0086:
        r3.g = r7;	 Catch:{ all -> 0x008c }
        monitor-exit(r3);
        return;
    L_0x008a:
        monitor-exit(r3);
        return;
    L_0x008c:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nro.a(long, int, long, int, byte[]):void");
    }
}
