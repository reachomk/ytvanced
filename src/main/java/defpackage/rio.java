package defpackage;

/* renamed from: rio */
public abstract class rio extends riu {
    public riq V;

    /* Access modifiers changed, original: protected */
    public int a() {
        int i = 0;
        if (this.V == null) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            riq riq = this.V;
            if (i >= riq.e) {
                return i2;
            }
            i2 += riq.a(i).a();
            i++;
        }
    }

    public void a(rim rim) {
        if (this.V != null) {
            int i = 0;
            while (true) {
                riq riq = this.V;
                if (i < riq.e) {
                    riq.a(i).a(rim);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b3  */
    public final boolean a(defpackage.rij r11, int r12) {
        /*
        r10 = this;
        r0 = r11.b;
        r1 = r11.b(r12);
        r2 = 0;
        if (r1 == 0) goto L_0x0109;
    L_0x0009:
        r1 = r12 >>> 3;
        r3 = r11.b;
        r3 = r3 - r0;
        if (r3 != 0) goto L_0x0013;
    L_0x0010:
        r11 = defpackage.riv.e;
        goto L_0x001b;
    L_0x0013:
        r4 = new byte[r3];
        r11 = r11.a;
        java.lang.System.arraycopy(r11, r0, r4, r2, r3);
        r11 = r4;
    L_0x001b:
        r0 = new riw;
        r0.<init>(r12, r11);
        r11 = r10.V;
        r12 = 0;
        if (r11 != 0) goto L_0x002e;
    L_0x0025:
        r11 = new riq;
        r11.<init>();
        r10.V = r11;
    L_0x002c:
        r11 = r12;
        goto L_0x0040;
    L_0x002e:
        r3 = r11.c(r1);
        if (r3 < 0) goto L_0x002c;
    L_0x0034:
        r4 = r11.d;
        r4 = r4[r3];
        r5 = defpackage.riq.a;
        if (r4 == r5) goto L_0x002c;
    L_0x003c:
        r11 = r11.d;
        r11 = r11[r3];
    L_0x0040:
        r3 = 1;
        if (r11 != 0) goto L_0x00af;
    L_0x0043:
        r11 = new rip;
        r11.<init>();
        r4 = r10.V;
        r5 = r4.c(r1);
        if (r5 < 0) goto L_0x0055;
    L_0x0050:
        r1 = r4.d;
        r1[r5] = r11;
        goto L_0x00af;
    L_0x0055:
        r5 = r5 ^ -1;
        r6 = r4.e;
        if (r5 >= r6) goto L_0x006c;
    L_0x005b:
        r6 = r4.d;
        r6 = r6[r5];
        r7 = defpackage.riq.a;
        if (r6 != r7) goto L_0x006c;
    L_0x0063:
        r6 = r4.c;
        r6[r5] = r1;
        r1 = r4.d;
        r1[r5] = r11;
        goto L_0x00af;
    L_0x006c:
        r6 = r4.b;
        r6 = r4.e;
        r7 = r4.c;
        r7 = r7.length;
        if (r6 < r7) goto L_0x008e;
    L_0x0075:
        r6 = r6 + r3;
        r6 = defpackage.riq.b(r6);
        r7 = new int[r6];
        r6 = new defpackage.rip[r6];
        r8 = r4.c;
        r9 = r8.length;
        java.lang.System.arraycopy(r8, r2, r7, r2, r9);
        r8 = r4.d;
        r9 = r8.length;
        java.lang.System.arraycopy(r8, r2, r6, r2, r9);
        r4.c = r7;
        r4.d = r6;
    L_0x008e:
        r6 = r4.e;
        r6 = r6 - r5;
        if (r6 == 0) goto L_0x00a2;
    L_0x0093:
        r7 = r4.c;
        r8 = r5 + 1;
        java.lang.System.arraycopy(r7, r5, r7, r8, r6);
        r6 = r4.d;
        r7 = r4.e;
        r7 = r7 - r5;
        java.lang.System.arraycopy(r6, r5, r6, r8, r7);
    L_0x00a2:
        r6 = r4.c;
        r6[r5] = r1;
        r1 = r4.d;
        r1[r5] = r11;
        r1 = r4.e;
        r1 = r1 + r3;
        r4.e = r1;
    L_0x00af:
        r1 = r11.b;
        if (r1 == 0) goto L_0x00b7;
    L_0x00b3:
        r1.add(r0);
        goto L_0x0108;
    L_0x00b7:
        r1 = r11.a;
        r4 = r1 instanceof defpackage.riu;
        if (r4 == 0) goto L_0x00dd;
    L_0x00bd:
        r0 = r0.b;
        r1 = r0.length;
        r0 = defpackage.rij.a(r0, r1);
        r2 = r0.e();
        r4 = defpackage.rim.a(r2);
        r1 = r1 - r4;
        if (r2 != r1) goto L_0x00d8;
    L_0x00cf:
        r1 = r11.a;
        r1 = (defpackage.riu) r1;
        r0 = r1.a(r0);
        goto L_0x0104;
    L_0x00d8:
        r11 = defpackage.rir.a();
        throw r11;
    L_0x00dd:
        r1 = r1 instanceof defpackage.riu[];
        if (r1 == 0) goto L_0x00fd;
    L_0x00e1:
        java.util.Collections.singletonList(r0);
        r0 = defpackage.rin.a();
        r0 = (defpackage.riu[]) r0;
        r1 = r11.a;
        r1 = (defpackage.riu[]) r1;
        r4 = r1.length;
        r5 = r0.length;
        r6 = r4 + r5;
        r1 = java.util.Arrays.copyOf(r1, r6);
        r1 = (defpackage.riu[]) r1;
        java.lang.System.arraycopy(r0, r2, r1, r4, r5);
        r0 = r1;
        goto L_0x0104;
    L_0x00fd:
        java.util.Collections.singletonList(r0);
        r0 = defpackage.rin.a();
    L_0x0104:
        r11.a = r0;
        r11.b = r12;
    L_0x0108:
        return r3;
    L_0x0109:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rio.a(rij, int):boolean");
    }

    /* renamed from: b */
    public rio clone() {
        rio rio = (rio) super.clone();
        ris.a(this, rio);
        return rio;
    }

    public /* synthetic */ riu c() {
        return (rio) clone();
    }
}
