package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: okc */
public final class okc implements ofm {
    public static final long a = ((long) ozp.f("AC-3"));
    public static final long b = ((long) ozp.f("EAC3"));
    public static final long c = ((long) ozp.f("AC-4"));
    public static final long d = ((long) ozp.f("HEVC"));
    public final int e;
    public final List f;
    public final oki g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public ofo k;
    public int l;
    public boolean m;
    public okh n;
    public int o;
    private final oza p;
    private final SparseIntArray q;
    private final okd r;
    private okb s;
    private boolean t;
    private boolean u;
    private int v;

    public okc() {
        this(1);
    }

    public final void c() {
    }

    public okc(int i) {
        ozo ozo = new ozo(0);
        this.g = (oki) oxz.a(new oja((byte) 0));
        this.e = i;
        if (i == 1 || i == 2) {
            this.f = Collections.singletonList(ozo);
        } else {
            this.f = new ArrayList();
            this.f.add(ozo);
        }
        this.p = new oza(new byte[9400], 0);
        this.i = new SparseBooleanArray();
        this.j = new SparseBooleanArray();
        this.h = new SparseArray();
        this.q = new SparseIntArray();
        this.r = new okd();
        this.o = -1;
        this.i.clear();
        this.h.clear();
        SparseArray a = this.g.a();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.h.put(a.keyAt(i2), (okh) a.valueAt(i2));
        }
        this.h.put(0, new ojw(new okf(this)));
        this.n = null;
    }

    public final boolean a(ofp ofp) {
        byte[] bArr = this.p.a;
        ofp.c(bArr, 0, 940);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 < 5) {
                if (bArr[(i2 * 188) + i] == (byte) 71) {
                    i2++;
                } else {
                    i++;
                }
            }
            ofp.a(i);
            return true;
        }
        return false;
    }

    public final void a(ofo ofo) {
        this.k = ofo;
    }

    public final void a(long j, long j2) {
        oxz.b(this.e != 2);
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            ozo ozo = (ozo) this.f.get(i);
            if (ozo.a() == -9223372036854775807L || !(ozo.a() == 0 || ozo.a == j2)) {
                ozo.b();
                ozo.a(j2);
            }
        }
        if (j2 != 0) {
            okb okb = this.s;
            if (okb != null) {
                okb.a(j2);
            }
        }
        this.p.a();
        this.q.clear();
        for (size = 0; size < this.h.size(); size++) {
            ((okh) this.h.valueAt(size)).a();
        }
        this.v = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0141  */
    public final int a(defpackage.ofp r19, defpackage.ofv r20) {
        /*
        r18 = this;
        r0 = r18;
        r1 = r19;
        r2 = r20;
        r3 = r1;
        r3 = (defpackage.ofl) r3;
        r11 = r3.b;
        r4 = r0.m;
        r13 = -1;
        r10 = 2;
        if (r4 == 0) goto L_0x016d;
    L_0x0012:
        r4 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r16 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));
        if (r16 != 0) goto L_0x0021;
    L_0x001b:
        r6 = 0;
        r8 = 0;
        r9 = 1;
        goto L_0x00fa;
    L_0x0021:
        r13 = r0.e;
        if (r13 == r10) goto L_0x001b;
    L_0x0025:
        r13 = r0.r;
        r14 = r13.c;
        if (r14 != 0) goto L_0x001b;
    L_0x002b:
        r10 = r0.o;
        if (r10 <= 0) goto L_0x00f5;
    L_0x002f:
        r14 = r13.e;
        r15 = 71;
        r8 = 112800; // 0x1b8a0 float:1.58066E-40 double:5.57306E-319;
        if (r14 == 0) goto L_0x00b0;
    L_0x0038:
        r6 = r13.g;
        r14 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r14 != 0) goto L_0x0044;
    L_0x003e:
        r8 = r13.a(r1);
        goto L_0x00f9;
    L_0x0044:
        r6 = r13.d;
        if (r6 == 0) goto L_0x006b;
    L_0x0048:
        r2 = r13.f;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 != 0) goto L_0x0054;
    L_0x004e:
        r8 = r13.a(r1);
        goto L_0x00f9;
    L_0x0054:
        r4 = r13.a;
        r2 = r4.b(r2);
        r4 = r13.a;
        r5 = r13.g;
        r4 = r4.b(r5);
        r4 = r4 - r2;
        r13.h = r4;
        r8 = r13.a(r1);
        goto L_0x00f9;
    L_0x006b:
        r6 = java.lang.Math.min(r8, r11);
        r7 = (int) r6;
        r8 = r3.c;
        r11 = 0;
        r3 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1));
        if (r3 != 0) goto L_0x00ab;
    L_0x0078:
        r2 = r13.b;
        r2.a(r7);
        r19.a();
        r2 = r13.b;
        r2 = r2.a;
        r3 = 0;
        r1.c(r2, r3, r7);
        r1 = r13.b;
        r2 = r1.b;
        r3 = r1.c;
    L_0x008e:
        if (r2 >= r3) goto L_0x00a4;
    L_0x0090:
        r6 = r1.a;
        r6 = r6[r2];
        if (r6 != r15) goto L_0x00a1;
    L_0x0096:
        r6 = defpackage.okk.a(r1, r2, r10);
        r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r8 != 0) goto L_0x009f;
    L_0x009e:
        goto L_0x00a1;
    L_0x009f:
        r4 = r6;
        goto L_0x00a4;
    L_0x00a1:
        r2 = r2 + 1;
        goto L_0x008e;
    L_0x00a4:
        r13.f = r4;
        r1 = 1;
        r13.d = r1;
        r8 = 0;
        goto L_0x00f9;
    L_0x00ab:
        r6 = 0;
        r2.a = r6;
        goto L_0x00bf;
    L_0x00b0:
        r6 = java.lang.Math.min(r8, r11);
        r7 = (int) r6;
        r8 = (long) r7;
        r11 = r11 - r8;
        r8 = r3.c;
        r3 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1));
        if (r3 == 0) goto L_0x00c1;
    L_0x00bd:
        r2.a = r11;
    L_0x00bf:
        r8 = 1;
        goto L_0x00f9;
    L_0x00c1:
        r2 = r13.b;
        r2.a(r7);
        r19.a();
        r2 = r13.b;
        r2 = r2.a;
        r8 = 0;
        r1.c(r2, r8, r7);
        r1 = r13.b;
        r2 = r1.b;
        r3 = r1.c;
        r6 = -1;
        r3 = r3 + r6;
    L_0x00d9:
        if (r3 < r2) goto L_0x00ef;
    L_0x00db:
        r6 = r1.a;
        r6 = r6[r3];
        if (r6 != r15) goto L_0x00ec;
    L_0x00e1:
        r6 = defpackage.okk.a(r1, r3, r10);
        r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r9 != 0) goto L_0x00ea;
    L_0x00e9:
        goto L_0x00ec;
    L_0x00ea:
        r4 = r6;
        goto L_0x00ef;
    L_0x00ec:
        r3 = r3 + -1;
        goto L_0x00d9;
    L_0x00ef:
        r13.g = r4;
        r9 = 1;
        r13.e = r9;
        goto L_0x00f9;
    L_0x00f5:
        r8 = r13.a(r1);
    L_0x00f9:
        return r8;
    L_0x00fa:
        r13 = r0.t;
        if (r13 != 0) goto L_0x0139;
    L_0x00fe:
        r0.t = r9;
        r13 = r0.r;
        r14 = r13.h;
        r17 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1));
        if (r17 == 0) goto L_0x012a;
    L_0x0108:
        r5 = new okb;
        r13 = r13.a;
        r4 = r0.o;
        r17 = r4;
        r4 = r5;
        r1 = r5;
        r5 = r13;
        r13 = r3;
        r2 = r6;
        r6 = r14;
        r14 = 1;
        r15 = 0;
        r8 = r11;
        r10 = r17;
        r4.<init>(r5, r6, r8, r10);
        r0.s = r1;
        r1 = r0.k;
        r4 = r0.s;
        r4 = r4.a;
        r1.a(r4);
        goto L_0x013b;
    L_0x012a:
        r13 = r3;
        r2 = r6;
        r1 = 1;
        r4 = 0;
        r5 = r0.k;
        r6 = new ofw;
        r6.<init>(r14);
        r5.a(r6);
        goto L_0x013d;
    L_0x0139:
        r13 = r3;
        r2 = r6;
    L_0x013b:
        r1 = 1;
        r4 = 0;
    L_0x013d:
        r5 = r0.u;
        if (r5 == 0) goto L_0x0154;
    L_0x0141:
        r0.u = r4;
        r0.a(r2, r2);
        r5 = r13;
        r5 = r5.c;
        r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1));
        if (r7 != 0) goto L_0x014e;
    L_0x014d:
        goto L_0x0154;
    L_0x014e:
        r5 = r2;
        r2 = r20;
        r2.a = r5;
        return r1;
    L_0x0154:
        r2 = r20;
        r3 = r0.s;
        if (r3 == 0) goto L_0x016a;
    L_0x015a:
        r3 = r3.a();
        if (r3 != 0) goto L_0x0161;
    L_0x0160:
        goto L_0x016a;
    L_0x0161:
        r1 = r0.s;
        r3 = r19;
        r1 = r1.a(r3, r2);
        return r1;
    L_0x016a:
        r3 = r19;
        goto L_0x0170;
    L_0x016d:
        r3 = r1;
        r1 = 1;
        r4 = 0;
    L_0x0170:
        r2 = r0.p;
        r5 = r2.a;
        r6 = r2.b;
        r6 = 9400 - r6;
        r7 = 188; // 0xbc float:2.63E-43 double:9.3E-322;
        if (r6 < r7) goto L_0x017d;
    L_0x017c:
        goto L_0x018f;
    L_0x017d:
        r2 = r2.b();
        if (r2 <= 0) goto L_0x018a;
    L_0x0183:
        r6 = r0.p;
        r6 = r6.b;
        java.lang.System.arraycopy(r5, r6, r5, r4, r2);
    L_0x018a:
        r6 = r0.p;
        r6.a(r5, r2);
    L_0x018f:
        r2 = r0.p;
        r2 = r2.b();
        if (r2 >= r7) goto L_0x01ac;
    L_0x0197:
        r2 = r0.p;
        r2 = r2.c;
        r6 = 9400 - r2;
        r6 = r3.a(r5, r2, r6);
        r8 = -1;
        if (r6 == r8) goto L_0x01ab;
    L_0x01a4:
        r9 = r0.p;
        r2 = r2 + r6;
        r9.b(r2);
        goto L_0x018f;
    L_0x01ab:
        return r8;
    L_0x01ac:
        r2 = r0.p;
        r3 = r2.b;
        r5 = r2.c;
        r2 = r2.a;
        r2 = defpackage.okk.a(r2, r3, r5);
        r6 = r0.p;
        r6.c(r2);
        r6 = r2 + 188;
        if (r6 <= r5) goto L_0x01d9;
    L_0x01c1:
        r5 = r0.v;
        r2 = r2 - r3;
        r5 = r5 + r2;
        r0.v = r5;
        r2 = r0.e;
        r3 = 2;
        if (r2 != r3) goto L_0x01dc;
    L_0x01cc:
        r2 = 376; // 0x178 float:5.27E-43 double:1.86E-321;
        if (r5 > r2) goto L_0x01d1;
    L_0x01d0:
        goto L_0x01dc;
    L_0x01d1:
        r1 = new oae;
        r2 = "Cannot find sync byte. Most likely not a Transport Stream.";
        r1.<init>(r2);
        throw r1;
    L_0x01d9:
        r3 = 2;
        r0.v = r4;
    L_0x01dc:
        r2 = r0.p;
        r5 = r2.c;
        if (r6 > r5) goto L_0x028e;
    L_0x01e2:
        r2 = r2.k();
        r7 = 8388608; // 0x800000 float:1.17549435E-38 double:4.144523E-317;
        r7 = r7 & r2;
        if (r7 != 0) goto L_0x0289;
    L_0x01eb:
        r7 = 4194304; // 0x400000 float:5.877472E-39 double:2.0722615E-317;
        r7 = r7 & r2;
        if (r7 == 0) goto L_0x01f2;
    L_0x01f0:
        r7 = 1;
        goto L_0x01f3;
    L_0x01f2:
        r7 = 0;
    L_0x01f3:
        r8 = r2 >> 8;
        r8 = r8 & 8191;
        r9 = r2 & 32;
        r10 = r2 & 16;
        if (r10 == 0) goto L_0x0206;
    L_0x01fd:
        r10 = r0.h;
        r10 = r10.get(r8);
        r10 = (defpackage.okh) r10;
        goto L_0x0207;
    L_0x0206:
        r10 = 0;
    L_0x0207:
        if (r10 != 0) goto L_0x020f;
    L_0x0209:
        r1 = r0.p;
        r1.c(r6);
        return r4;
    L_0x020f:
        r13 = r0.e;
        if (r13 == r3) goto L_0x0233;
    L_0x0213:
        r2 = r2 & 15;
        r13 = r0.q;
        r14 = r2 + -1;
        r13 = r13.get(r8, r14);
        r14 = r0.q;
        r14.put(r8, r2);
        if (r13 == r2) goto L_0x022d;
    L_0x0224:
        r13 = r13 + r1;
        r13 = r13 & 15;
        if (r2 == r13) goto L_0x0233;
    L_0x0229:
        r10.a();
        goto L_0x0233;
    L_0x022d:
        r1 = r0.p;
        r1.c(r6);
        return r4;
    L_0x0233:
        if (r9 == 0) goto L_0x0250;
    L_0x0235:
        r2 = r0.p;
        r2 = r2.d();
        r9 = r0.p;
        r9 = r9.d();
        r9 = r9 & 64;
        if (r9 == 0) goto L_0x0247;
    L_0x0245:
        r9 = 2;
        goto L_0x0248;
    L_0x0247:
        r9 = 0;
    L_0x0248:
        r7 = r7 | r9;
        r9 = r0.p;
        r13 = -1;
        r2 = r2 + r13;
        r9.d(r2);
    L_0x0250:
        r2 = r0.m;
        r9 = r0.e;
        if (r9 == r3) goto L_0x0261;
    L_0x0256:
        if (r2 == 0) goto L_0x0259;
    L_0x0258:
        goto L_0x0261;
    L_0x0259:
        r9 = r0.j;
        r8 = r9.get(r8, r4);
        if (r8 != 0) goto L_0x0270;
    L_0x0261:
        r8 = r0.p;
        r8.b(r6);
        r8 = r0.p;
        r10.a(r8, r7);
        r7 = r0.p;
        r7.b(r5);
    L_0x0270:
        r5 = r0.e;
        if (r5 != r3) goto L_0x0275;
    L_0x0274:
        goto L_0x0283;
    L_0x0275:
        if (r2 != 0) goto L_0x0283;
    L_0x0277:
        r2 = r0.m;
        if (r2 == 0) goto L_0x0283;
    L_0x027b:
        r2 = -1;
        r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1));
        if (r5 == 0) goto L_0x0283;
    L_0x0281:
        r0.u = r1;
    L_0x0283:
        r1 = r0.p;
        r1.c(r6);
        return r4;
    L_0x0289:
        r1 = r0.p;
        r1.c(r6);
    L_0x028e:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.okc.a(ofp, ofv):int");
    }
}
