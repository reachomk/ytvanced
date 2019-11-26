package defpackage;

/* renamed from: oqj */
final class oqj implements ofy {
    public nzw a;
    private final int b;
    private final int c;
    private final nzw d;
    private final ofn e = new ofn();
    private ofy f;
    private long g;

    public oqj(int i, int i2, nzw nzw) {
        this.b = i;
        this.c = i2;
        this.d = nzw;
    }

    public final void a(oqi oqi, long j) {
        if (oqi != null) {
            this.g = j;
            this.f = oqi.a(this.b, this.c);
            nzw nzw = this.a;
            if (nzw != null) {
                this.f.a(nzw);
            }
            return;
        }
        this.f = this.e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009c  */
    public final void a(defpackage.nzw r36) {
        /*
        r35 = this;
        r0 = r35;
        r1 = r36;
        r2 = r0.d;
        if (r2 != 0) goto L_0x000a;
    L_0x0008:
        goto L_0x0102;
    L_0x000a:
        if (r1 != r2) goto L_0x000e;
    L_0x000c:
        goto L_0x0102;
    L_0x000e:
        r3 = r1.i;
        r3 = defpackage.oyu.g(r3);
        r5 = r2.a;
        r4 = r2.b;
        if (r4 != 0) goto L_0x001c;
    L_0x001a:
        r4 = r1.b;
    L_0x001c:
        r6 = r4;
        r4 = r1.A;
        r7 = 3;
        r8 = 1;
        if (r3 != r7) goto L_0x0024;
    L_0x0023:
        goto L_0x0027;
    L_0x0024:
        if (r3 == r8) goto L_0x0027;
    L_0x0026:
        goto L_0x002b;
    L_0x0027:
        r7 = r2.A;
        if (r7 != 0) goto L_0x002e;
    L_0x002b:
        r32 = r4;
        goto L_0x0030;
    L_0x002e:
        r32 = r7;
    L_0x0030:
        r4 = r1.e;
        r7 = -1;
        if (r4 != r7) goto L_0x0037;
    L_0x0035:
        r4 = r2.e;
    L_0x0037:
        r9 = r4;
        r4 = r1.f;
        if (r4 != 0) goto L_0x007f;
    L_0x003c:
        r7 = r2.f;
        r7 = defpackage.ozp.h(r7);
        r10 = r7.length;
        r11 = 0;
        if (r10 == 0) goto L_0x0076;
    L_0x0046:
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r13 = 0;
    L_0x004c:
        if (r13 >= r10) goto L_0x006c;
    L_0x004e:
        r14 = r7[r13];
        r15 = defpackage.oyu.f(r14);
        r15 = defpackage.oyu.g(r15);
        if (r3 == r15) goto L_0x005b;
    L_0x005a:
        goto L_0x0069;
    L_0x005b:
        r15 = r12.length();
        if (r15 <= 0) goto L_0x0066;
    L_0x0061:
        r15 = ",";
        r12.append(r15);
    L_0x0066:
        r12.append(r14);
    L_0x0069:
        r13 = r13 + 1;
        goto L_0x004c;
    L_0x006c:
        r7 = r12.length();
        if (r7 <= 0) goto L_0x0076;
    L_0x0072:
        r11 = r12.toString();
    L_0x0076:
        r7 = defpackage.ozp.h(r11);
        r7 = r7.length;
        if (r7 != r8) goto L_0x007f;
    L_0x007d:
        r10 = r11;
        goto L_0x0080;
    L_0x007f:
        r10 = r4;
    L_0x0080:
        r4 = r1.g;
        if (r4 != 0) goto L_0x0088;
    L_0x0084:
        r4 = r2.g;
    L_0x0086:
        r11 = r4;
        goto L_0x0094;
    L_0x0088:
        r7 = r2.g;
        if (r7 != 0) goto L_0x008d;
    L_0x008c:
        goto L_0x0086;
    L_0x008d:
        r7 = r7.a;
        r4 = r4.a(r7);
        goto L_0x0086;
    L_0x0094:
        r4 = r1.p;
        r7 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r7 != 0) goto L_0x00a4;
    L_0x009c:
        r7 = 2;
        if (r3 != r7) goto L_0x00a4;
    L_0x009f:
        r3 = r2.p;
        r21 = r3;
        goto L_0x00a6;
    L_0x00a4:
        r21 = r4;
    L_0x00a6:
        r3 = r1.c;
        r7 = r2.c;
        r8 = r1.d;
        r12 = r2.d;
        r2 = r2.l;
        r4 = r1.l;
        r16 = defpackage.odq.a(r2, r4);
        r2 = new nzw;
        r4 = r2;
        r7 = r7 | r3;
        r8 = r8 | r12;
        r12 = r1.h;
        r13 = r1.i;
        r14 = r1.j;
        r15 = r1.k;
        r34 = r2;
        r2 = r1.m;
        r17 = r2;
        r2 = r1.n;
        r19 = r2;
        r2 = r1.o;
        r20 = r2;
        r2 = r1.q;
        r22 = r2;
        r2 = r1.r;
        r23 = r2;
        r2 = r1.t;
        r24 = r2;
        r2 = r1.s;
        r25 = r2;
        r2 = r1.u;
        r26 = r2;
        r2 = r1.v;
        r27 = r2;
        r2 = r1.w;
        r28 = r2;
        r2 = r1.x;
        r29 = r2;
        r2 = r1.y;
        r30 = r2;
        r2 = r1.z;
        r31 = r2;
        r1 = r1.B;
        r33 = r1;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33);
        r1 = r34;
    L_0x0102:
        r0.a = r1;
        r1 = r0.f;
        r2 = r0.a;
        r1.a(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oqj.a(nzw):void");
    }

    public final int a(ofp ofp, int i, boolean z) {
        return this.f.a(ofp, i, z);
    }

    public final void a(oza oza, int i) {
        this.f.a(oza, i);
    }

    public final void a(long j, int i, int i2, int i3, ogb ogb) {
        long j2 = this.g;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.f = this.e;
        }
        this.f.a(j, i, i2, i3, ogb);
    }
}
