package defpackage;

import java.util.Arrays;

/* renamed from: oga */
public final class oga implements ofm {
    private static final int[] a = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] b = new int[]{18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] c = ozp.c("#!AMR\n");
    private static final byte[] d = ozp.c("#!AMR-WB\n");
    private static final int e = b[8];
    private final byte[] f;
    private final int g;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private boolean l;
    private long m;
    private int n;
    private int o;
    private long p;
    private ofo q;
    private ofy r;
    private ofu s;
    private boolean t;

    public oga() {
        this((byte) 0);
    }

    public final void c() {
    }

    public oga(byte b) {
        this.g = 0;
        this.f = new byte[1];
        this.n = -1;
    }

    public final boolean a(ofp ofp) {
        return b(ofp);
    }

    public final void a(ofo ofo) {
        this.q = ofo;
        this.r = ofo.a(0, 1);
        ofo.a();
    }

    public final int a(ofp ofp, ofv ofv) {
        if (((ofl) ofp).c != 0 || b(ofp)) {
            if (!this.t) {
                this.t = true;
                boolean z = this.h;
                this.r.a(nzw.a(null, !z ? "audio/3gpp" : "audio/amr-wb", -1, e, 1, !z ? 8000 : 16000, -1, null, null, 0, null));
            }
            int c = c(ofp);
            if (!this.l) {
                this.s = new ofw(-9223372036854775807L);
                this.q.a(this.s);
                this.l = true;
            }
            return c;
        }
        throw new oae("Could not find AMR header.");
    }

    public final void a(long j, long j2) {
        this.i = 0;
        this.j = 0;
        this.k = 0;
        if (j != 0) {
            ofu ofu = this.s;
            if (ofu instanceof ofi) {
                this.p = ((ofi) ofu).a_(j);
                return;
            }
        }
        this.p = 0;
    }

    private final boolean b(ofp ofp) {
        if (oga.a(ofp, c)) {
            this.h = false;
            ofp.a(c.length);
            return true;
        } else if (!oga.a(ofp, d)) {
            return false;
        } else {
            this.h = true;
            ofp.a(d.length);
            return true;
        }
    }

    private static boolean a(ofp ofp, byte[] bArr) {
        ofp.a();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ofp.c(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A:{Catch:{ EOFException -> 0x00c5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036 A:{Catch:{ EOFException -> 0x00c5 }} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    private final int c(defpackage.ofp r11) {
        /*
        r10 = this;
        r0 = r10.k;
        r1 = 1;
        r2 = 0;
        r3 = -1;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        goto L_0x0059;
    L_0x0008:
        r11.a();	 Catch:{ EOFException -> 0x00c5 }
        r0 = r10.f;	 Catch:{ EOFException -> 0x00c5 }
        r11.c(r0, r2, r1);	 Catch:{ EOFException -> 0x00c5 }
        r0 = r10.f;	 Catch:{ EOFException -> 0x00c5 }
        r0 = r0[r2];	 Catch:{ EOFException -> 0x00c5 }
        r4 = r0 & 131;
        if (r4 > 0) goto L_0x00ac;
    L_0x0018:
        r0 = r0 >> 3;
        r0 = r0 & 15;
        r4 = r10.h;	 Catch:{ EOFException -> 0x00c5 }
        if (r4 == 0) goto L_0x0029;
    L_0x0020:
        r5 = 10;
        if (r0 < r5) goto L_0x0034;
    L_0x0024:
        r5 = 13;
        if (r0 <= r5) goto L_0x0029;
    L_0x0028:
        goto L_0x0034;
    L_0x0029:
        if (r4 != 0) goto L_0x0080;
    L_0x002b:
        r5 = 12;
        if (r0 < r5) goto L_0x0034;
    L_0x002f:
        r5 = 14;
        if (r0 > r5) goto L_0x0034;
    L_0x0033:
        goto L_0x0080;
    L_0x0034:
        if (r4 != 0) goto L_0x003b;
    L_0x0036:
        r4 = a;	 Catch:{ EOFException -> 0x00c5 }
        r0 = r4[r0];	 Catch:{ EOFException -> 0x00c5 }
        goto L_0x003f;
    L_0x003b:
        r4 = b;	 Catch:{ EOFException -> 0x00c5 }
        r0 = r4[r0];	 Catch:{ EOFException -> 0x00c5 }
    L_0x003f:
        r10.j = r0;	 Catch:{ EOFException -> 0x00c5 }
        r10.k = r0;
        r4 = r10.n;
        if (r4 == r3) goto L_0x0048;
    L_0x0047:
        goto L_0x0052;
    L_0x0048:
        r4 = r11;
        r4 = (defpackage.ofl) r4;
        r4 = r4.c;
        r10.m = r4;
        r10.n = r0;
        r4 = r0;
    L_0x0052:
        if (r4 != r0) goto L_0x0059;
    L_0x0054:
        r4 = r10.o;
        r4 = r4 + r1;
        r10.o = r4;
    L_0x0059:
        r4 = r10.r;
        r11 = r4.a(r11, r0, r1);
        if (r11 == r3) goto L_0x007f;
    L_0x0061:
        r0 = r10.k;
        r0 = r0 - r11;
        r10.k = r0;
        if (r0 > 0) goto L_0x007e;
    L_0x0068:
        r3 = r10.r;
        r0 = r10.p;
        r4 = r10.i;
        r4 = r4 + r0;
        r6 = 1;
        r7 = r10.j;
        r8 = 0;
        r9 = 0;
        r3.a(r4, r6, r7, r8, r9);
        r0 = r10.i;
        r3 = 20000; // 0x4e20 float:2.8026E-41 double:9.8813E-320;
        r0 = r0 + r3;
        r10.i = r0;
    L_0x007e:
        return r2;
    L_0x007f:
        return r3;
    L_0x0080:
        r11 = new oae;	 Catch:{ EOFException -> 0x00c5 }
        if (r4 != 0) goto L_0x0087;
    L_0x0084:
        r1 = "NB";
        goto L_0x0089;
    L_0x0087:
        r1 = "WB";
    L_0x0089:
        r2 = r1.length();	 Catch:{ EOFException -> 0x00c5 }
        r2 = r2 + 35;
        r4 = new java.lang.StringBuilder;	 Catch:{ EOFException -> 0x00c5 }
        r4.<init>(r2);	 Catch:{ EOFException -> 0x00c5 }
        r2 = "Illegal AMR ";
        r4.append(r2);	 Catch:{ EOFException -> 0x00c5 }
        r4.append(r1);	 Catch:{ EOFException -> 0x00c5 }
        r1 = " frame type ";
        r4.append(r1);	 Catch:{ EOFException -> 0x00c5 }
        r4.append(r0);	 Catch:{ EOFException -> 0x00c5 }
        r0 = r4.toString();	 Catch:{ EOFException -> 0x00c5 }
        r11.<init>(r0);	 Catch:{ EOFException -> 0x00c5 }
        throw r11;	 Catch:{ EOFException -> 0x00c5 }
    L_0x00ac:
        r11 = new oae;	 Catch:{ EOFException -> 0x00c5 }
        r1 = new java.lang.StringBuilder;	 Catch:{ EOFException -> 0x00c5 }
        r2 = 42;
        r1.<init>(r2);	 Catch:{ EOFException -> 0x00c5 }
        r2 = "Invalid padding bits for frame header ";
        r1.append(r2);	 Catch:{ EOFException -> 0x00c5 }
        r1.append(r0);	 Catch:{ EOFException -> 0x00c5 }
        r0 = r1.toString();	 Catch:{ EOFException -> 0x00c5 }
        r11.<init>(r0);	 Catch:{ EOFException -> 0x00c5 }
        throw r11;	 Catch:{ EOFException -> 0x00c5 }
    L_0x00c5:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oga.c(ofp):int");
    }
}
