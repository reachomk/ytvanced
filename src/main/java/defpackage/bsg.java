package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: bsg */
public final class bsg implements brz {
    public Config a = Config.ARGB_8888;
    private int[] b;
    private final int[] c = new int[256];
    private final bsc d;
    private ByteBuffer e;
    private byte[] f;
    private short[] g;
    private byte[] h;
    private byte[] i;
    private byte[] j;
    private int[] k;
    private int l;
    private bse m;
    private Bitmap n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private Boolean t;

    public bsg(bsc bsc, bse bse, ByteBuffer byteBuffer, int i) {
        this.d = bsc;
        this.m = new bse();
        a(bse, byteBuffer, i);
    }

    public final ByteBuffer a() {
        return this.e;
    }

    public final void b() {
        this.l = (this.l + 1) % this.m.c;
    }

    public final int c() {
        bse bse = this.m;
        int i = bse.c;
        if (i > 0) {
            int i2 = this.l;
            if (i2 >= 0) {
                return i2 < i ? ((bsb) bse.e.get(i2)).i : -1;
            }
        }
        return 0;
    }

    public final int d() {
        return this.m.c;
    }

    public final int e() {
        return this.l;
    }

    public final int f() {
        return (this.e.limit() + this.j.length) + (this.k.length << 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00cf  */
    /* JADX WARNING: Missing block: B:224:0x03d1, code skipped:
            if (r0 == 1) goto L_0x03d3;
     */
    /* JADX WARNING: Missing block: B:265:0x04bd, code skipped:
            return null;
     */
    public final synchronized android.graphics.Bitmap g() {
        /*
        r38 = this;
        r1 = r38;
        monitor-enter(r38);
        r0 = r1.m;	 Catch:{ all -> 0x04be }
        r0 = r0.c;	 Catch:{ all -> 0x04be }
        r2 = 1;
        if (r0 <= 0) goto L_0x000e;
    L_0x000a:
        r0 = r1.l;	 Catch:{ all -> 0x04be }
        if (r0 >= 0) goto L_0x0010;
    L_0x000e:
        r1.p = r2;	 Catch:{ all -> 0x04be }
    L_0x0010:
        r0 = r1.p;	 Catch:{ all -> 0x04be }
        r3 = 0;
        if (r0 == r2) goto L_0x04bc;
    L_0x0015:
        r4 = 2;
        if (r0 == r4) goto L_0x04bc;
    L_0x0018:
        r0 = 0;
        r1.p = r0;	 Catch:{ all -> 0x04be }
        r5 = r1.f;	 Catch:{ all -> 0x04be }
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r5 != 0) goto L_0x0029;
    L_0x0021:
        r5 = r1.d;	 Catch:{ all -> 0x04be }
        r5 = r5.a(r6);	 Catch:{ all -> 0x04be }
        r1.f = r5;	 Catch:{ all -> 0x04be }
    L_0x0029:
        r5 = r1.m;	 Catch:{ all -> 0x04be }
        r5 = r5.e;	 Catch:{ all -> 0x04be }
        r7 = r1.l;	 Catch:{ all -> 0x04be }
        r5 = r5.get(r7);	 Catch:{ all -> 0x04be }
        r5 = (defpackage.bsb) r5;	 Catch:{ all -> 0x04be }
        r7 = r1.l;	 Catch:{ all -> 0x04be }
        r8 = -1;
        r7 = r7 + r8;
        if (r7 < 0) goto L_0x0046;
    L_0x003b:
        r9 = r1.m;	 Catch:{ all -> 0x04be }
        r9 = r9.e;	 Catch:{ all -> 0x04be }
        r7 = r9.get(r7);	 Catch:{ all -> 0x04be }
        r7 = (defpackage.bsb) r7;	 Catch:{ all -> 0x04be }
        goto L_0x0047;
    L_0x0046:
        r7 = r3;
    L_0x0047:
        r9 = r5.k;	 Catch:{ all -> 0x04be }
        if (r9 != 0) goto L_0x004f;
    L_0x004b:
        r9 = r1.m;	 Catch:{ all -> 0x04be }
        r9 = r9.a;	 Catch:{ all -> 0x04be }
    L_0x004f:
        r1.b = r9;	 Catch:{ all -> 0x04be }
        r9 = r1.b;	 Catch:{ all -> 0x04be }
        if (r9 != 0) goto L_0x0059;
    L_0x0055:
        r1.p = r2;	 Catch:{ all -> 0x04be }
        monitor-exit(r38);
        return r3;
    L_0x0059:
        r10 = r5.f;	 Catch:{ all -> 0x04be }
        if (r10 == 0) goto L_0x007b;
    L_0x005d:
        r10 = r1.c;	 Catch:{ all -> 0x04be }
        r11 = r9.length;	 Catch:{ all -> 0x04be }
        java.lang.System.arraycopy(r9, r0, r10, r0, r11);	 Catch:{ all -> 0x04be }
        r9 = r1.c;	 Catch:{ all -> 0x04be }
        r1.b = r9;	 Catch:{ all -> 0x04be }
        r9 = r1.b;	 Catch:{ all -> 0x04be }
        r10 = r5.h;	 Catch:{ all -> 0x04be }
        r9[r10] = r0;	 Catch:{ all -> 0x04be }
        r9 = r5.g;	 Catch:{ all -> 0x04be }
        if (r9 != r4) goto L_0x007b;
    L_0x0071:
        r9 = r1.l;	 Catch:{ all -> 0x04be }
        if (r9 != 0) goto L_0x007b;
    L_0x0075:
        r9 = java.lang.Boolean.valueOf(r2);	 Catch:{ all -> 0x04be }
        r1.t = r9;	 Catch:{ all -> 0x04be }
    L_0x007b:
        r9 = r1.k;	 Catch:{ all -> 0x04be }
        if (r7 != 0) goto L_0x008d;
    L_0x007f:
        r10 = r1.n;	 Catch:{ all -> 0x04be }
        if (r10 == 0) goto L_0x0088;
    L_0x0083:
        r11 = r1.d;	 Catch:{ all -> 0x04be }
        r11.a(r10);	 Catch:{ all -> 0x04be }
    L_0x0088:
        r1.n = r3;	 Catch:{ all -> 0x04be }
        java.util.Arrays.fill(r9, r0);	 Catch:{ all -> 0x04be }
    L_0x008d:
        r3 = 3;
        if (r7 == 0) goto L_0x009b;
    L_0x0090:
        r10 = r7.g;	 Catch:{ all -> 0x04be }
        if (r10 != r3) goto L_0x009b;
    L_0x0094:
        r10 = r1.n;	 Catch:{ all -> 0x04be }
        if (r10 != 0) goto L_0x009b;
    L_0x0098:
        java.util.Arrays.fill(r9, r0);	 Catch:{ all -> 0x04be }
    L_0x009b:
        if (r7 == 0) goto L_0x00f3;
    L_0x009d:
        r10 = r7.g;	 Catch:{ all -> 0x04be }
        if (r10 <= 0) goto L_0x00f3;
    L_0x00a1:
        if (r10 != r4) goto L_0x00dd;
    L_0x00a3:
        r10 = r5.f;	 Catch:{ all -> 0x04be }
        if (r10 != 0) goto L_0x00b6;
    L_0x00a7:
        r10 = r1.m;	 Catch:{ all -> 0x04be }
        r11 = r10.l;	 Catch:{ all -> 0x04be }
        r12 = r5.k;	 Catch:{ all -> 0x04be }
        if (r12 == 0) goto L_0x00b7;
    L_0x00af:
        r10 = r10.j;	 Catch:{ all -> 0x04be }
        r12 = r5.h;	 Catch:{ all -> 0x04be }
        if (r10 == r12) goto L_0x00b6;
    L_0x00b5:
        goto L_0x00b7;
    L_0x00b6:
        r11 = 0;
    L_0x00b7:
        r10 = r7.d;	 Catch:{ all -> 0x04be }
        r12 = r1.q;	 Catch:{ all -> 0x04be }
        r10 = r10 / r12;
        r13 = r7.b;	 Catch:{ all -> 0x04be }
        r13 = r13 / r12;
        r14 = r7.c;	 Catch:{ all -> 0x04be }
        r14 = r14 / r12;
        r7 = r7.a;	 Catch:{ all -> 0x04be }
        r7 = r7 / r12;
        r12 = r1.s;	 Catch:{ all -> 0x04be }
        r13 = r13 * r12;
        r13 = r13 + r7;
        r10 = r10 * r12;
        r10 = r10 + r13;
    L_0x00cd:
        if (r13 >= r10) goto L_0x00f3;
    L_0x00cf:
        r7 = r13 + r14;
        r12 = r13;
    L_0x00d2:
        if (r12 < r7) goto L_0x00d8;
    L_0x00d4:
        r7 = r1.s;	 Catch:{ all -> 0x04be }
        r13 = r13 + r7;
        goto L_0x00cd;
    L_0x00d8:
        r9[r12] = r11;	 Catch:{ all -> 0x04be }
        r12 = r12 + 1;
        goto L_0x00d2;
    L_0x00dd:
        if (r10 != r3) goto L_0x00f3;
    L_0x00df:
        r10 = r1.n;	 Catch:{ all -> 0x04be }
        if (r10 == 0) goto L_0x00f3;
    L_0x00e3:
        r7 = r1.s;	 Catch:{ all -> 0x04be }
        r12 = 0;
        r14 = 0;
        r15 = 0;
        r13 = r1.r;	 Catch:{ all -> 0x04be }
        r11 = r9;
        r17 = r13;
        r13 = r7;
        r16 = r7;
        r10.getPixels(r11, r12, r13, r14, r15, r16, r17);	 Catch:{ all -> 0x04be }
    L_0x00f3:
        r7 = r1.e;	 Catch:{ all -> 0x04be }
        r10 = r5.j;	 Catch:{ all -> 0x04be }
        r7.position(r10);	 Catch:{ all -> 0x04be }
        r7 = r5.c;	 Catch:{ all -> 0x04be }
        r10 = r5.d;	 Catch:{ all -> 0x04be }
        r7 = r7 * r10;
        r10 = r1.j;	 Catch:{ all -> 0x04be }
        if (r10 == 0) goto L_0x0107;
    L_0x0104:
        r10 = r10.length;	 Catch:{ all -> 0x04be }
        if (r10 >= r7) goto L_0x010f;
    L_0x0107:
        r10 = r1.d;	 Catch:{ all -> 0x04be }
        r10 = r10.a(r7);	 Catch:{ all -> 0x04be }
        r1.j = r10;	 Catch:{ all -> 0x04be }
    L_0x010f:
        r10 = r1.j;	 Catch:{ all -> 0x04be }
        r11 = r1.g;	 Catch:{ all -> 0x04be }
        r12 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        if (r11 != 0) goto L_0x011b;
    L_0x0117:
        r11 = new short[r12];	 Catch:{ all -> 0x04be }
        r1.g = r11;	 Catch:{ all -> 0x04be }
    L_0x011b:
        r11 = r1.g;	 Catch:{ all -> 0x04be }
        r13 = r1.h;	 Catch:{ all -> 0x04be }
        if (r13 != 0) goto L_0x0125;
    L_0x0121:
        r13 = new byte[r12];	 Catch:{ all -> 0x04be }
        r1.h = r13;	 Catch:{ all -> 0x04be }
    L_0x0125:
        r13 = r1.h;	 Catch:{ all -> 0x04be }
        r14 = r1.i;	 Catch:{ all -> 0x04be }
        if (r14 != 0) goto L_0x0131;
    L_0x012b:
        r14 = 4097; // 0x1001 float:5.741E-42 double:2.024E-320;
        r14 = new byte[r14];	 Catch:{ all -> 0x04be }
        r1.i = r14;	 Catch:{ all -> 0x04be }
    L_0x0131:
        r14 = r1.i;	 Catch:{ all -> 0x04be }
        r15 = r38.i();	 Catch:{ all -> 0x04be }
        r12 = r2 << r15;
        r6 = r12 + 1;
        r18 = r12 + 2;
        r15 = r15 + r2;
        r19 = r2 << r15;
        r19 = r19 + -1;
        r4 = 0;
    L_0x0143:
        if (r4 >= r12) goto L_0x014e;
    L_0x0145:
        r11[r4] = r0;	 Catch:{ all -> 0x04be }
        r8 = (byte) r4;	 Catch:{ all -> 0x04be }
        r13[r4] = r8;	 Catch:{ all -> 0x04be }
        r4 = r4 + 1;
        r8 = -1;
        goto L_0x0143;
    L_0x014e:
        r4 = r1.f;	 Catch:{ all -> 0x04be }
        r24 = r15;
        r30 = r18;
        r23 = r19;
        r2 = 0;
        r8 = 0;
        r21 = 0;
        r22 = 0;
        r25 = -1;
        r26 = 0;
        r27 = 0;
        r28 = 0;
        r29 = 0;
    L_0x0166:
        r31 = 8;
        if (r8 < r7) goto L_0x016c;
    L_0x016a:
        r11 = 0;
        goto L_0x019f;
    L_0x016c:
        if (r21 != 0) goto L_0x0408;
    L_0x016e:
        r3 = r38.i();	 Catch:{ all -> 0x04be }
        if (r3 <= 0) goto L_0x018b;
    L_0x0174:
        r0 = r1.e;	 Catch:{ all -> 0x04be }
        r33 = r8;
        r8 = r1.f;	 Catch:{ all -> 0x04be }
        r34 = r15;
        r15 = r0.remaining();	 Catch:{ all -> 0x04be }
        r15 = java.lang.Math.min(r3, r15);	 Catch:{ all -> 0x04be }
        r35 = r11;
        r11 = 0;
        r0.get(r8, r11, r15);	 Catch:{ all -> 0x04be }
        goto L_0x0191;
    L_0x018b:
        r33 = r8;
        r35 = r11;
        r34 = r15;
    L_0x0191:
        if (r3 <= 0) goto L_0x019b;
    L_0x0193:
        r0 = r2;
        r36 = r9;
        r2 = 1;
        r22 = 0;
        goto L_0x0414;
    L_0x019b:
        r0 = 3;
        r1.p = r0;	 Catch:{ all -> 0x04be }
        goto L_0x016a;
    L_0x019f:
        java.util.Arrays.fill(r10, r2, r7, r11);	 Catch:{ all -> 0x04be }
        r0 = r5.e;	 Catch:{ all -> 0x04be }
        if (r0 != 0) goto L_0x0227;
    L_0x01a6:
        r0 = r1.q;	 Catch:{ all -> 0x04be }
        r2 = 1;
        if (r0 != r2) goto L_0x0227;
    L_0x01ab:
        r0 = r1.k;	 Catch:{ all -> 0x04be }
        r2 = r5.d;	 Catch:{ all -> 0x04be }
        r3 = r5.b;	 Catch:{ all -> 0x04be }
        r4 = r5.c;	 Catch:{ all -> 0x04be }
        r6 = r5.a;	 Catch:{ all -> 0x04be }
        r7 = r1.l;	 Catch:{ all -> 0x04be }
        r8 = r1.s;	 Catch:{ all -> 0x04be }
        r10 = r1.j;	 Catch:{ all -> 0x04be }
        r12 = r1.b;	 Catch:{ all -> 0x04be }
        r13 = 0;
        r14 = -1;
    L_0x01bf:
        if (r13 >= r2) goto L_0x0202;
    L_0x01c1:
        r15 = r13 + r3;
        r15 = r15 * r8;
        r16 = r15 + r6;
        r11 = r16 + r4;
        r15 = r15 + r8;
        if (r15 >= r11) goto L_0x01cd;
    L_0x01cc:
        goto L_0x01ce;
    L_0x01cd:
        r15 = r11;
    L_0x01ce:
        r11 = r5.c;	 Catch:{ all -> 0x04be }
        r11 = r11 * r13;
        r37 = r16;
        r16 = r2;
        r2 = r14;
        r14 = r11;
        r11 = r37;
    L_0x01da:
        if (r11 >= r15) goto L_0x01f7;
    L_0x01dc:
        r17 = r3;
        r3 = r10[r14];	 Catch:{ all -> 0x04be }
        r18 = r4;
        r4 = r3 & 255;
        if (r4 == r2) goto L_0x01ee;
    L_0x01e6:
        r4 = r12[r4];	 Catch:{ all -> 0x04be }
        if (r4 == 0) goto L_0x01ed;
    L_0x01ea:
        r0[r11] = r4;	 Catch:{ all -> 0x04be }
        goto L_0x01ee;
    L_0x01ed:
        r2 = r3;
    L_0x01ee:
        r14 = r14 + 1;
        r11 = r11 + 1;
        r3 = r17;
        r4 = r18;
        goto L_0x01da;
    L_0x01f7:
        r17 = r3;
        r18 = r4;
        r13 = r13 + 1;
        r14 = r2;
        r2 = r16;
        r11 = 0;
        goto L_0x01bf;
    L_0x0202:
        r0 = r1.t;	 Catch:{ all -> 0x04be }
        if (r0 == 0) goto L_0x0210;
    L_0x0206:
        r0 = r0.booleanValue();	 Catch:{ all -> 0x04be }
        if (r0 != 0) goto L_0x020d;
    L_0x020c:
        goto L_0x0210;
    L_0x020d:
        r32 = 1;
        goto L_0x021d;
    L_0x0210:
        r0 = r1.t;	 Catch:{ all -> 0x04be }
        if (r0 == 0) goto L_0x0217;
    L_0x0214:
        r32 = 0;
        goto L_0x021d;
    L_0x0217:
        if (r7 != 0) goto L_0x0214;
    L_0x0219:
        r0 = -1;
        if (r14 == r0) goto L_0x0214;
    L_0x021c:
        goto L_0x020d;
    L_0x021d:
        r0 = java.lang.Boolean.valueOf(r32);	 Catch:{ all -> 0x04be }
        r1.t = r0;	 Catch:{ all -> 0x04be }
        r36 = r9;
        goto L_0x03c7;
    L_0x0227:
        r0 = r1.k;	 Catch:{ all -> 0x04be }
        r2 = r5.d;	 Catch:{ all -> 0x04be }
        r3 = r1.q;	 Catch:{ all -> 0x04be }
        r2 = r2 / r3;
        r4 = r5.b;	 Catch:{ all -> 0x04be }
        r4 = r4 / r3;
        r6 = r5.c;	 Catch:{ all -> 0x04be }
        r6 = r6 / r3;
        r7 = r5.a;	 Catch:{ all -> 0x04be }
        r7 = r7 / r3;
        r8 = r1.l;	 Catch:{ all -> 0x04be }
        if (r8 == 0) goto L_0x023d;
    L_0x023b:
        r8 = 0;
        goto L_0x023e;
    L_0x023d:
        r8 = 1;
    L_0x023e:
        r10 = r1.s;	 Catch:{ all -> 0x04be }
        r11 = r1.r;	 Catch:{ all -> 0x04be }
        r12 = r1.j;	 Catch:{ all -> 0x04be }
        r13 = r1.b;	 Catch:{ all -> 0x04be }
        r14 = r1.t;	 Catch:{ all -> 0x04be }
        r36 = r9;
        r15 = r14;
        r9 = 0;
        r14 = 0;
        r16 = 8;
        r18 = 1;
    L_0x0251:
        if (r14 >= r2) goto L_0x03b3;
    L_0x0253:
        r19 = r15;
        r15 = r5.e;	 Catch:{ all -> 0x04be }
        if (r15 != 0) goto L_0x0260;
    L_0x0259:
        r15 = r18;
        r18 = r2;
        r2 = r9;
        r9 = r14;
        goto L_0x0282;
    L_0x0260:
        if (r9 >= r2) goto L_0x0267;
    L_0x0262:
        r15 = r18;
        r18 = r2;
        goto L_0x0280;
    L_0x0267:
        r15 = r18 + 1;
        r18 = r2;
        r2 = 2;
        if (r15 == r2) goto L_0x027e;
    L_0x026e:
        r2 = 3;
        if (r15 == r2) goto L_0x0279;
    L_0x0271:
        r2 = 4;
        if (r15 == r2) goto L_0x0275;
    L_0x0274:
        goto L_0x0280;
    L_0x0275:
        r9 = 1;
        r16 = 2;
        goto L_0x0280;
    L_0x0279:
        r2 = 4;
        r9 = 2;
        r16 = 4;
        goto L_0x0280;
    L_0x027e:
        r2 = 4;
        r9 = 4;
    L_0x0280:
        r2 = r9 + r16;
    L_0x0282:
        r9 = r9 + r4;
        if (r9 >= r11) goto L_0x038f;
    L_0x0285:
        r9 = r9 * r10;
        r20 = r9 + r7;
        r21 = r2;
        r2 = r20 + r6;
        r9 = r9 + r10;
        if (r9 >= r2) goto L_0x0291;
    L_0x0290:
        r2 = r9;
    L_0x0291:
        r9 = r14 * r3;
        r22 = r4;
        r4 = r5.c;	 Catch:{ all -> 0x04be }
        r9 = r9 * r4;
        r4 = 1;
        if (r3 == r4) goto L_0x0362;
    L_0x029c:
        r4 = r2 - r20;
        r4 = r4 * r3;
        r4 = r4 + r9;
        r37 = r20;
        r20 = r9;
        r9 = r37;
    L_0x02a7:
        if (r9 >= r2) goto L_0x0393;
    L_0x02a9:
        r23 = r6;
        r6 = r5.c;	 Catch:{ all -> 0x04be }
        r24 = r7;
        r30 = r10;
        r7 = r20;
        r25 = 0;
        r26 = 0;
        r27 = 0;
        r28 = 0;
        r29 = 0;
    L_0x02bd:
        r10 = r1.q;	 Catch:{ all -> 0x04be }
        r10 = r20 + r10;
        if (r7 < r10) goto L_0x02c8;
    L_0x02c3:
        r33 = r11;
    L_0x02c5:
        r34 = r15;
        goto L_0x02f9;
    L_0x02c8:
        r10 = r1.j;	 Catch:{ all -> 0x04be }
        r33 = r11;
        r11 = r10.length;	 Catch:{ all -> 0x04be }
        if (r7 >= r11) goto L_0x02c5;
    L_0x02cf:
        if (r7 >= r4) goto L_0x02c5;
    L_0x02d1:
        r10 = r10[r7];	 Catch:{ all -> 0x04be }
        r11 = r1.b;	 Catch:{ all -> 0x04be }
        r34 = r15;
        r15 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r10 = r10 & r15;
        r10 = r11[r10];	 Catch:{ all -> 0x04be }
        if (r10 == 0) goto L_0x02f2;
    L_0x02de:
        r11 = r10 >>> 24;
        r29 = r29 + r11;
        r11 = r10 >> 16;
        r11 = r11 & r15;
        r26 = r26 + r11;
        r11 = r10 >> 8;
        r11 = r11 & r15;
        r27 = r27 + r11;
        r10 = r10 & 255;
        r28 = r28 + r10;
        r25 = r25 + 1;
    L_0x02f2:
        r7 = r7 + 1;
        r11 = r33;
        r15 = r34;
        goto L_0x02bd;
    L_0x02f9:
        r6 = r20 + r6;
        r7 = r6;
    L_0x02fc:
        r10 = r1.q;	 Catch:{ all -> 0x04be }
        r10 = r10 + r6;
        if (r7 >= r10) goto L_0x032a;
    L_0x0301:
        r10 = r1.j;	 Catch:{ all -> 0x04be }
        r11 = r10.length;	 Catch:{ all -> 0x04be }
        if (r7 >= r11) goto L_0x032a;
    L_0x0306:
        if (r7 >= r4) goto L_0x032a;
    L_0x0308:
        r10 = r10[r7];	 Catch:{ all -> 0x04be }
        r11 = r1.b;	 Catch:{ all -> 0x04be }
        r15 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r10 = r10 & r15;
        r10 = r11[r10];	 Catch:{ all -> 0x04be }
        if (r10 == 0) goto L_0x0327;
    L_0x0313:
        r11 = r10 >>> 24;
        r29 = r29 + r11;
        r11 = r10 >> 16;
        r11 = r11 & r15;
        r26 = r26 + r11;
        r11 = r10 >> 8;
        r11 = r11 & r15;
        r27 = r27 + r11;
        r10 = r10 & 255;
        r28 = r28 + r10;
        r25 = r25 + 1;
    L_0x0327:
        r7 = r7 + 1;
        goto L_0x02fc;
    L_0x032a:
        if (r25 == 0) goto L_0x033f;
    L_0x032c:
        r29 = r29 / r25;
        r6 = r29 << 24;
        r26 = r26 / r25;
        r7 = r26 << 16;
        r6 = r6 | r7;
        r27 = r27 / r25;
        r7 = r27 << 8;
        r6 = r6 | r7;
        r28 = r28 / r25;
        r6 = r6 | r28;
        goto L_0x0340;
    L_0x033f:
        r6 = 0;
    L_0x0340:
        if (r6 == 0) goto L_0x0345;
    L_0x0342:
        r0[r9] = r6;	 Catch:{ all -> 0x04be }
        goto L_0x0352;
    L_0x0345:
        if (r8 != 0) goto L_0x0348;
    L_0x0347:
        goto L_0x0352;
    L_0x0348:
        if (r19 == 0) goto L_0x034b;
    L_0x034a:
        goto L_0x0352;
    L_0x034b:
        r6 = 1;
        r7 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x04be }
        r19 = r7;
    L_0x0352:
        r20 = r20 + r3;
        r9 = r9 + 1;
        r6 = r23;
        r7 = r24;
        r10 = r30;
        r11 = r33;
        r15 = r34;
        goto L_0x02a7;
    L_0x0362:
        r23 = r6;
        r24 = r7;
        r30 = r10;
        r33 = r11;
        r34 = r15;
        r4 = r20;
    L_0x036e:
        if (r4 < r2) goto L_0x0371;
    L_0x0370:
        goto L_0x039d;
    L_0x0371:
        r6 = r12[r9];	 Catch:{ all -> 0x04be }
        r7 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r6 = r6 & r7;
        r6 = r13[r6];	 Catch:{ all -> 0x04be }
        if (r6 == 0) goto L_0x037d;
    L_0x037a:
        r0[r4] = r6;	 Catch:{ all -> 0x04be }
        goto L_0x038a;
    L_0x037d:
        if (r8 != 0) goto L_0x0380;
    L_0x037f:
        goto L_0x038a;
    L_0x0380:
        if (r19 == 0) goto L_0x0383;
    L_0x0382:
        goto L_0x038a;
    L_0x0383:
        r6 = 1;
        r7 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x04be }
        r19 = r7;
    L_0x038a:
        r9 = r9 + 1;
        r4 = r4 + 1;
        goto L_0x036e;
    L_0x038f:
        r21 = r2;
        r22 = r4;
    L_0x0393:
        r23 = r6;
        r24 = r7;
        r30 = r10;
        r33 = r11;
        r34 = r15;
    L_0x039d:
        r15 = r19;
        r14 = r14 + 1;
        r2 = r18;
        r9 = r21;
        r4 = r22;
        r6 = r23;
        r7 = r24;
        r10 = r30;
        r11 = r33;
        r18 = r34;
        goto L_0x0251;
    L_0x03b3:
        r19 = r15;
        r0 = r1.t;	 Catch:{ all -> 0x04be }
        if (r0 != 0) goto L_0x03c7;
    L_0x03b9:
        if (r19 == 0) goto L_0x03c0;
    L_0x03bb:
        r0 = r19.booleanValue();	 Catch:{ all -> 0x04be }
        goto L_0x03c1;
    L_0x03c0:
        r0 = 0;
    L_0x03c1:
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ all -> 0x04be }
        r1.t = r0;	 Catch:{ all -> 0x04be }
    L_0x03c7:
        r0 = r1.o;	 Catch:{ all -> 0x04be }
        if (r0 == 0) goto L_0x03f0;
    L_0x03cb:
        r0 = r5.g;	 Catch:{ all -> 0x04be }
        if (r0 != 0) goto L_0x03d0;
    L_0x03cf:
        goto L_0x03d3;
    L_0x03d0:
        r2 = 1;
        if (r0 != r2) goto L_0x03f0;
    L_0x03d3:
        r0 = r1.n;	 Catch:{ all -> 0x04be }
        if (r0 != 0) goto L_0x03dd;
    L_0x03d7:
        r0 = r38.j();	 Catch:{ all -> 0x04be }
        r1.n = r0;	 Catch:{ all -> 0x04be }
    L_0x03dd:
        r10 = r1.n;	 Catch:{ all -> 0x04be }
        r0 = r1.s;	 Catch:{ all -> 0x04be }
        r12 = 0;
        r14 = 0;
        r15 = 0;
        r2 = r1.r;	 Catch:{ all -> 0x04be }
        r11 = r36;
        r13 = r0;
        r16 = r0;
        r17 = r2;
        r10.setPixels(r11, r12, r13, r14, r15, r16, r17);	 Catch:{ all -> 0x04be }
    L_0x03f0:
        r0 = r38.j();	 Catch:{ all -> 0x04be }
        r2 = r1.s;	 Catch:{ all -> 0x04be }
        r12 = 0;
        r14 = 0;
        r15 = 0;
        r3 = r1.r;	 Catch:{ all -> 0x04be }
        r10 = r0;
        r11 = r36;
        r13 = r2;
        r16 = r2;
        r17 = r3;
        r10.setPixels(r11, r12, r13, r14, r15, r16, r17);	 Catch:{ all -> 0x04be }
        monitor-exit(r38);
        return r0;
    L_0x0408:
        r0 = r2;
        r33 = r8;
        r36 = r9;
        r35 = r11;
        r34 = r15;
        r2 = 1;
        r3 = r21;
    L_0x0414:
        r8 = r4[r22];	 Catch:{ all -> 0x04be }
        r9 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r8 = r8 & r9;
        r8 = r8 << r26;
        r27 = r27 + r8;
        r26 = r26 + 8;
        r22 = r22 + 1;
        r8 = -1;
        r21 = r3 + -1;
        r15 = r0;
        r3 = r24;
        r9 = r25;
        r0 = r26;
        r11 = r28;
        r2 = r30;
    L_0x042f:
        if (r0 < r3) goto L_0x04a3;
    L_0x0431:
        r8 = r27 & r23;
        r27 = r27 >> r3;
        r0 = r0 - r3;
        if (r8 != r12) goto L_0x0441;
    L_0x0438:
        r2 = r18;
        r23 = r19;
        r3 = r34;
        r8 = -1;
        r9 = -1;
        goto L_0x042f;
    L_0x0441:
        if (r8 == r6) goto L_0x04a3;
    L_0x0443:
        r24 = r0;
        r0 = -1;
        if (r9 != r0) goto L_0x0456;
    L_0x0448:
        r9 = r13[r8];	 Catch:{ all -> 0x04be }
        r10[r15] = r9;	 Catch:{ all -> 0x04be }
        r15 = r15 + 1;
        r33 = r33 + 1;
        r9 = r8;
        r11 = r9;
        r0 = r24;
    L_0x0454:
        r8 = -1;
        goto L_0x042f;
    L_0x0456:
        if (r8 < r2) goto L_0x045f;
    L_0x0458:
        r11 = (byte) r11;	 Catch:{ all -> 0x04be }
        r14[r29] = r11;	 Catch:{ all -> 0x04be }
        r29 = r29 + 1;
        r11 = r9;
        goto L_0x0460;
    L_0x045f:
        r11 = r8;
    L_0x0460:
        if (r11 < r12) goto L_0x046b;
    L_0x0462:
        r20 = r13[r11];	 Catch:{ all -> 0x04be }
        r14[r29] = r20;	 Catch:{ all -> 0x04be }
        r29 = r29 + 1;
        r11 = r35[r11];	 Catch:{ all -> 0x04be }
        goto L_0x0460;
    L_0x046b:
        r11 = r13[r11];	 Catch:{ all -> 0x04be }
        r0 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r11 = r11 & r0;
        r0 = (byte) r11;	 Catch:{ all -> 0x04be }
        r10[r15] = r0;	 Catch:{ all -> 0x04be }
    L_0x0473:
        r15 = r15 + 1;
        r33 = r33 + 1;
        if (r29 <= 0) goto L_0x0480;
    L_0x0479:
        r29 = r29 + -1;
        r25 = r14[r29];	 Catch:{ all -> 0x04be }
        r10[r15] = r25;	 Catch:{ all -> 0x04be }
        goto L_0x0473;
    L_0x0480:
        r25 = r4;
        r4 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        if (r2 >= r4) goto L_0x049b;
    L_0x0486:
        r4 = (short) r9;	 Catch:{ all -> 0x04be }
        r35[r2] = r4;	 Catch:{ all -> 0x04be }
        r13[r2] = r0;	 Catch:{ all -> 0x04be }
        r2 = r2 + 1;
        r0 = r2 & r23;
        if (r0 == 0) goto L_0x0492;
    L_0x0491:
        goto L_0x049b;
    L_0x0492:
        r0 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        if (r2 >= r0) goto L_0x049d;
    L_0x0496:
        r3 = r3 + 1;
        r23 = r23 + r2;
        goto L_0x049d;
    L_0x049b:
        r0 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
    L_0x049d:
        r9 = r8;
        r0 = r24;
        r4 = r25;
        goto L_0x0454;
    L_0x04a3:
        r24 = r0;
        r30 = r2;
        r25 = r9;
        r28 = r11;
        r2 = r15;
        r26 = r24;
        r8 = r33;
        r15 = r34;
        r11 = r35;
        r9 = r36;
        r0 = 0;
        r24 = r3;
        r3 = 3;
        goto L_0x0166;
    L_0x04bc:
        monitor-exit(r38);
        return r3;
    L_0x04be:
        r0 = move-exception;
        monitor-exit(r38);
        goto L_0x04c2;
    L_0x04c1:
        throw r0;
    L_0x04c2:
        goto L_0x04c1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsg.g():android.graphics.Bitmap");
    }

    public final void h() {
        this.m = null;
        byte[] bArr = this.j;
        if (bArr != null) {
            this.d.a(bArr);
        }
        int[] iArr = this.k;
        if (iArr != null) {
            this.d.a(iArr);
        }
        Bitmap bitmap = this.n;
        if (bitmap != null) {
            this.d.a(bitmap);
        }
        this.n = null;
        this.e = null;
        this.t = null;
        byte[] bArr2 = this.f;
        if (bArr2 != null) {
            this.d.a(bArr2);
        }
    }

    private final synchronized void a(bse bse, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            i = Integer.highestOneBit(i);
            this.p = 0;
            this.m = bse;
            this.l = -1;
            this.e = byteBuffer.asReadOnlyBuffer();
            this.e.position(0);
            this.e.order(ByteOrder.LITTLE_ENDIAN);
            this.o = false;
            for (bsb bsb : bse.e) {
                if (bsb.g == 3) {
                    this.o = true;
                    break;
                }
            }
            this.q = i;
            int i2 = bse.f;
            this.s = i2 / i;
            int i3 = bse.g;
            this.r = i3 / i;
            this.j = this.d.a(i2 * i3);
            this.k = this.d.b(this.s * this.r);
        } else {
            StringBuilder stringBuilder = new StringBuilder(41);
            stringBuilder.append("Sample size must be >=0, not: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private final int i() {
        return this.e.get() & 255;
    }

    private final Bitmap j() {
        Config config;
        Boolean bool = this.t;
        if (bool == null || bool.booleanValue()) {
            config = Config.ARGB_8888;
        } else {
            config = this.a;
        }
        Bitmap a = this.d.a(this.s, this.r, config);
        a.setHasAlpha(true);
        return a;
    }

    static {
        bsg.class.getSimpleName();
    }
}
