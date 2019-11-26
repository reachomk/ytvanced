package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;

/* renamed from: num */
public final class num implements nrc {
    public static final long a = ((long) nxf.c("AC-3"));
    public static final long b = ((long) nxf.c("EAC3"));
    public static final long c = ((long) nxf.c("HEVC"));
    public final nuk d = new nuk();
    public final int e = 0;
    public final SparseArray f = new SparseArray();
    public final SparseBooleanArray g = new SparseBooleanArray();
    public boolean h;
    private final nwz i = new nwz(940);
    private final nxa j = new nxa(new byte[3]);
    private final SparseIntArray k = new SparseIntArray();
    private nre l;
    private int m;

    public num() {
        a();
    }

    public final void c() {
    }

    public final boolean a(nrb nrb) {
        byte[] bArr = this.i.a;
        nrb.c(bArr, 0, 940);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 != 5) {
                if (bArr[(i2 * 188) + i] == (byte) 71) {
                    i2++;
                } else {
                    i++;
                }
            }
            nrb.a(i);
            return true;
        }
        return false;
    }

    public final void a(nre nre) {
        this.l = nre;
        nre.a(nrq.f);
    }

    public final void b() {
        this.d.a();
        this.i.a();
        this.k.clear();
        a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c7  */
    public final int a(defpackage.nrb r10, defpackage.nrm r11) {
        /*
        r9 = this;
        r11 = r9.i;
        r0 = r11.a;
        r1 = r11.b;
        r1 = 940 - r1;
        r2 = 188; // 0xbc float:2.63E-43 double:9.3E-322;
        r3 = 0;
        if (r1 < r2) goto L_0x000e;
    L_0x000d:
        goto L_0x0020;
    L_0x000e:
        r11 = r11.b();
        if (r11 <= 0) goto L_0x001b;
    L_0x0014:
        r1 = r9.i;
        r1 = r1.b;
        java.lang.System.arraycopy(r0, r1, r0, r3, r11);
    L_0x001b:
        r1 = r9.i;
        r1.a(r0, r11);
    L_0x0020:
        r11 = r9.i;
        r11 = r11.b();
        if (r11 >= r2) goto L_0x003d;
    L_0x0028:
        r11 = r9.i;
        r11 = r11.c;
        r1 = 940 - r11;
        r1 = r10.a(r0, r11, r1);
        r4 = -1;
        if (r1 == r4) goto L_0x003c;
    L_0x0035:
        r4 = r9.i;
        r11 = r11 + r1;
        r4.b(r11);
        goto L_0x0020;
    L_0x003c:
        return r4;
    L_0x003d:
        r10 = r9.i;
        r11 = r10.c;
        r10 = r10.b;
    L_0x0043:
        if (r10 >= r11) goto L_0x004e;
    L_0x0045:
        r1 = r0[r10];
        r4 = 71;
        if (r1 == r4) goto L_0x004e;
    L_0x004b:
        r10 = r10 + 1;
        goto L_0x0043;
    L_0x004e:
        r0 = r9.i;
        r0.c(r10);
        r10 = r10 + r2;
        if (r10 > r11) goto L_0x00ff;
    L_0x0056:
        r0 = r9.i;
        r1 = 1;
        r0.d(r1);
        r0 = r9.i;
        r2 = r9.j;
        r4 = 3;
        r0.a(r2, r4);
        r0 = r9.j;
        r0 = r0.b();
        if (r0 == 0) goto L_0x0072;
    L_0x006c:
        r11 = r9.i;
        r11.c(r10);
        return r3;
    L_0x0072:
        r0 = r9.j;
        r0 = r0.b();
        r2 = r9.j;
        r2.b(r1);
        r2 = r9.j;
        r4 = 13;
        r2 = r2.c(r4);
        r4 = r9.j;
        r5 = 2;
        r4.b(r5);
        r4 = r9.j;
        r4 = r4.b();
        r5 = r9.j;
        r5 = r5.b();
        r6 = r9.j;
        r7 = 4;
        r6 = r6.c(r7);
        r7 = r9.k;
        r8 = r6 + -1;
        r7 = r7.get(r2, r8);
        r8 = r9.k;
        r8.put(r2, r6);
        if (r7 == r6) goto L_0x00b5;
    L_0x00ad:
        r7 = r7 + r1;
        r7 = r7 % 16;
        if (r6 != r7) goto L_0x00b3;
    L_0x00b2:
        goto L_0x00b7;
    L_0x00b3:
        r6 = 1;
        goto L_0x00b8;
    L_0x00b5:
        if (r5 != 0) goto L_0x00fa;
    L_0x00b7:
        r6 = 0;
    L_0x00b8:
        if (r4 == 0) goto L_0x00c5;
    L_0x00ba:
        r4 = r9.i;
        r4 = r4.d();
        r7 = r9.i;
        r7.d(r4);
    L_0x00c5:
        if (r5 == 0) goto L_0x00f4;
    L_0x00c7:
        r4 = r9.f;
        r2 = r4.get(r2);
        r2 = (defpackage.nuq) r2;
        if (r2 != 0) goto L_0x00d2;
    L_0x00d1:
        goto L_0x00f4;
    L_0x00d2:
        if (r6 != 0) goto L_0x00d5;
    L_0x00d4:
        goto L_0x00d8;
    L_0x00d5:
        r2.a();
    L_0x00d8:
        r4 = r9.i;
        r4.b(r10);
        r4 = r9.i;
        r5 = r9.l;
        r2.a(r4, r0, r5);
        r0 = r9.i;
        r0 = r0.b;
        if (r0 > r10) goto L_0x00eb;
    L_0x00ea:
        goto L_0x00ec;
    L_0x00eb:
        r1 = 0;
    L_0x00ec:
        defpackage.nwf.b(r1);
        r0 = r9.i;
        r0.b(r11);
    L_0x00f4:
        r11 = r9.i;
        r11.c(r10);
        return r3;
    L_0x00fa:
        r11 = r9.i;
        r11.c(r10);
    L_0x00ff:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.num.a(nrb, nrm):int");
    }

    private final void a() {
        this.g.clear();
        this.f.clear();
        this.f.put(0, new nul(this));
        this.m = 8192;
    }
}
