package defpackage;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: ocm */
public final class ocm implements oca {
    private int A;
    private long B;
    private float C;
    private obq[] D;
    private ByteBuffer[] E;
    private ByteBuffer F;
    private ByteBuffer G;
    private byte[] H;
    private int I;
    private int J;
    private boolean K;
    private boolean L;
    private boolean M;
    private int N;
    private och O;
    private boolean P;
    public final ConditionVariable a = new ConditionVariable(true);
    public ocb b;
    public long c;
    private final obk d;
    private final oco e;
    private final ocj f = new ocj();
    private final odb g = new odb();
    private final obq[] h;
    private final obq[] i;
    private final ocf j = new ocf(new ocs(this));
    private final ArrayDeque k;
    private ocn l;
    private ocn m;
    private AudioTrack n;
    private obi o;
    private oag p;
    private oag q;
    private long r;
    private long s;
    private ByteBuffer t;
    private int u;
    private long v;
    private long w;
    private long x;
    private long y;
    private int z;

    public ocm(obk obk, obq[] obqArr) {
        Object ocq = new ocq(obqArr);
        this.d = obk;
        this.e = (oco) oxz.a(ocq);
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new ock[]{new ocv(), this.f, this.g});
        Collections.addAll(arrayList, ocq.a);
        this.h = (obq[]) arrayList.toArray(new obq[0]);
        this.i = new obq[]{new ocu()};
        this.C = 1.0f;
        this.A = 0;
        this.o = obi.a;
        this.N = 0;
        this.O = new och();
        this.q = oag.a;
        this.J = -1;
        this.D = new obq[0];
        this.E = new ByteBuffer[0];
        this.k = new ArrayDeque();
    }

    public final boolean a(int i, int i2) {
        boolean z = false;
        if (ozp.c(i2)) {
            return i2 != 4 || ozp.a >= 21;
        } else {
            obk obk = this.d;
            if (obk != null && Arrays.binarySearch(obk.a, i2) >= 0) {
                if (i == -1) {
                    z = true;
                } else if (i > this.d.b) {
                    return z;
                } else {
                    return true;
                }
            }
            return z;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0240  */
    /* JADX WARNING: Missing block: B:36:0x00c5, code skipped:
            if (r3 == false) goto L_0x0160;
     */
    public final long a(boolean r27) {
        /*
        r26 = this;
        r0 = r26;
        r1 = r26.q();
        if (r1 == 0) goto L_0x0271;
    L_0x0008:
        r1 = r0.A;
        if (r1 == 0) goto L_0x0271;
    L_0x000c:
        r1 = r0.j;
        r2 = r1.c;
        r2 = defpackage.oxz.a(r2);
        r2 = (android.media.AudioTrack) r2;
        r2 = r2.getPlayState();
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = 3;
        r7 = 2;
        r8 = 1;
        if (r2 == r6) goto L_0x0024;
    L_0x0021:
        r2 = 0;
        goto L_0x01ad;
    L_0x0024:
        r16 = r1.b();
        r14 = 0;
        r2 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1));
        if (r2 == 0) goto L_0x0021;
    L_0x002e:
        r9 = java.lang.System.nanoTime();
        r12 = r9 / r4;
        r9 = r1.k;
        r9 = r12 - r9;
        r18 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r2 = 0;
        r11 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1));
        if (r11 < 0) goto L_0x006f;
    L_0x003f:
        r9 = r1.b;
        r10 = r1.t;
        r18 = r16 - r12;
        r9[r10] = r18;
        r10 = r10 + r8;
        r9 = 10;
        r10 = r10 % r9;
        r1.t = r10;
        r10 = r1.u;
        if (r10 >= r9) goto L_0x0054;
    L_0x0051:
        r10 = r10 + r8;
        r1.u = r10;
    L_0x0054:
        r1.k = r12;
        r1.j = r14;
        r9 = 0;
    L_0x0059:
        r10 = r1.u;
        if (r9 >= r10) goto L_0x006f;
    L_0x005d:
        r14 = r1.j;
        r11 = r1.b;
        r20 = r11[r9];
        r10 = (long) r10;
        r20 = r20 / r10;
        r14 = r14 + r20;
        r1.j = r14;
        r9 = r9 + 1;
        r14 = 0;
        goto L_0x0059;
    L_0x006f:
        r9 = r1.h;
        if (r9 != 0) goto L_0x0021;
    L_0x0073:
        r9 = r1.f;
        r9 = defpackage.oxz.a(r9);
        r14 = r9;
        r14 = (defpackage.ocd) r14;
        r9 = r14.a;
        r20 = 500000; // 0x7a120 float:7.00649E-40 double:2.47033E-318;
        r22 = 5000000; // 0x4c4b40 float:7.006492E-39 double:2.470328E-317;
        if (r9 == 0) goto L_0x0160;
    L_0x0086:
        r10 = r14.e;
        r10 = r12 - r10;
        r3 = r14.d;
        r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1));
        if (r5 < 0) goto L_0x0160;
    L_0x0090:
        r14.e = r12;
        r3 = r9.a;
        r4 = r9.b;
        r3 = r3.getTimestamp(r4);
        if (r3 == 0) goto L_0x00b8;
    L_0x009c:
        r4 = r9.b;
        r4 = r4.framePosition;
        r10 = r9.d;
        r15 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r15 <= 0) goto L_0x00ae;
    L_0x00a6:
        r10 = r9.c;
        r24 = 1;
        r10 = r10 + r24;
        r9.c = r10;
    L_0x00ae:
        r9.d = r4;
        r10 = r9.c;
        r15 = 32;
        r10 = r10 << r15;
        r4 = r4 + r10;
        r9.e = r4;
    L_0x00b8:
        r4 = r14.b;
        r5 = 4;
        if (r4 == 0) goto L_0x00f1;
    L_0x00bd:
        if (r4 == r8) goto L_0x00dc;
    L_0x00bf:
        if (r4 == r7) goto L_0x00d5;
    L_0x00c1:
        if (r4 == r6) goto L_0x00cf;
    L_0x00c3:
        if (r4 != r5) goto L_0x00c9;
    L_0x00c5:
        if (r3 != 0) goto L_0x0108;
    L_0x00c7:
        goto L_0x0160;
    L_0x00c9:
        r1 = new java.lang.IllegalStateException;
        r1.<init>();
        throw r1;
    L_0x00cf:
        if (r3 == 0) goto L_0x0160;
    L_0x00d1:
        r14.b();
        goto L_0x0108;
    L_0x00d5:
        if (r3 != 0) goto L_0x0108;
    L_0x00d7:
        r14.b();
        goto L_0x0160;
    L_0x00dc:
        if (r3 != 0) goto L_0x00e3;
    L_0x00de:
        r14.b();
        goto L_0x0160;
    L_0x00e3:
        r3 = r14.a;
        r3 = r3.e;
        r9 = r14.f;
        r6 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1));
        if (r6 <= 0) goto L_0x0108;
    L_0x00ed:
        r14.a(r7);
        goto L_0x0108;
    L_0x00f1:
        if (r3 == 0) goto L_0x0150;
    L_0x00f3:
        r3 = r14.a;
        r3 = r3.a();
        r9 = r14.c;
        r6 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1));
        if (r6 < 0) goto L_0x0160;
    L_0x00ff:
        r3 = r14.a;
        r3 = r3.e;
        r14.f = r3;
        r14.a(r8);
    L_0x0108:
        r3 = r14.c();
        r10 = r14.d();
        r24 = r3 - r12;
        r24 = java.lang.Math.abs(r24);
        r6 = (r24 > r22 ? 1 : (r24 == r22 ? 0 : -1));
        if (r6 <= 0) goto L_0x012a;
    L_0x011a:
        r9 = r1.a;
        r5 = r12;
        r12 = r3;
        r3 = r14;
        r7 = 0;
        r14 = r5;
        r9.b(r10, r12, r14, r16);
        r3.a();
        r3 = r5;
        goto L_0x0163;
    L_0x012a:
        r6 = r14;
        r7 = 0;
        r14 = r12;
        r12 = r1.b(r10);
        r12 = r12 - r16;
        r12 = java.lang.Math.abs(r12);
        r9 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1));
        if (r9 <= 0) goto L_0x0147;
    L_0x013c:
        r9 = r1.a;
        r12 = r3;
        r3 = r14;
        r9.a(r10, r12, r14, r16);
        r6.a();
        goto L_0x0163;
    L_0x0147:
        r3 = r14;
        r9 = r6.b;
        if (r9 != r5) goto L_0x0163;
    L_0x014c:
        r6.b();
        goto L_0x0163;
    L_0x0150:
        r3 = r12;
        r9 = r14;
        r7 = 0;
        r10 = r9.c;
        r12 = r3 - r10;
        r5 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1));
        if (r5 <= 0) goto L_0x0163;
    L_0x015c:
        r9.a(r6);
        goto L_0x0163;
    L_0x0160:
        r3 = r12;
        r7 = 0;
    L_0x0163:
        r5 = r1.o;
        if (r5 == 0) goto L_0x0021;
    L_0x0167:
        r5 = r1.l;
        if (r5 == 0) goto L_0x0021;
    L_0x016b:
        r9 = r1.p;
        r12 = r3 - r9;
        r6 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1));
        if (r6 < 0) goto L_0x0021;
    L_0x0173:
        r6 = r1.c;	 Catch:{ Exception -> 0x01a8 }
        r6 = defpackage.oxz.a(r6);	 Catch:{ Exception -> 0x01a8 }
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x01a8 }
        r2 = r5.invoke(r6, r2);	 Catch:{ Exception -> 0x01a8 }
        r2 = (java.lang.Integer) r2;	 Catch:{ Exception -> 0x01a8 }
        r2 = defpackage.ozp.a(r2);	 Catch:{ Exception -> 0x01a8 }
        r2 = (java.lang.Integer) r2;	 Catch:{ Exception -> 0x01a8 }
        r2 = r2.intValue();	 Catch:{ Exception -> 0x01a8 }
        r5 = (long) r2;	 Catch:{ Exception -> 0x01a8 }
        r9 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r5 = r5 * r9;
        r9 = r1.i;	 Catch:{ Exception -> 0x01a8 }
        r5 = r5 - r9;
        r1.m = r5;	 Catch:{ Exception -> 0x01a8 }
        r5 = java.lang.Math.max(r5, r7);	 Catch:{ Exception -> 0x01a8 }
        r1.m = r5;	 Catch:{ Exception -> 0x01a8 }
        r2 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1));
        if (r2 <= 0) goto L_0x01a6;
    L_0x019f:
        r2 = r1.a;	 Catch:{ Exception -> 0x01a8 }
        r2.a(r5);	 Catch:{ Exception -> 0x01a8 }
        r1.m = r7;	 Catch:{ Exception -> 0x01a8 }
    L_0x01a6:
        r2 = 0;
        goto L_0x01ab;
    L_0x01a8:
        r2 = 0;
        r1.l = r2;
    L_0x01ab:
        r1.p = r3;
    L_0x01ad:
        r3 = java.lang.System.nanoTime();
        r5 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r3 = r3 / r5;
        r5 = r1.f;
        r5 = defpackage.oxz.a(r5);
        r5 = (defpackage.ocd) r5;
        r6 = r5.b;
        r7 = 1;
        if (r6 != r7) goto L_0x01c2;
    L_0x01c1:
        goto L_0x01d8;
    L_0x01c2:
        r7 = 2;
        if (r6 == r7) goto L_0x01d8;
    L_0x01c5:
        r5 = r1.u;
        if (r5 != 0) goto L_0x01ce;
    L_0x01c9:
        r3 = r1.b();
        goto L_0x01d1;
    L_0x01ce:
        r5 = r1.j;
        r3 = r3 + r5;
    L_0x01d1:
        if (r27 == 0) goto L_0x01d4;
    L_0x01d3:
        goto L_0x01ed;
    L_0x01d4:
        r5 = r1.m;
        r3 = r3 - r5;
        goto L_0x01ed;
    L_0x01d8:
        r6 = r5.d();
        r6 = r1.b(r6);
        r1 = r5.b;
        r8 = 2;
        if (r1 != r8) goto L_0x01ec;
    L_0x01e5:
        r8 = r5.c();
        r3 = r3 - r8;
        r3 = r3 + r6;
        goto L_0x01ed;
    L_0x01ec:
        r3 = r6;
    L_0x01ed:
        r1 = r0.m;
        r5 = r26.l();
        r5 = r1.a(r5);
        r3 = java.lang.Math.min(r3, r5);
        r5 = r0.B;
    L_0x01fd:
        r1 = r0.k;
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x021d;
    L_0x0205:
        r1 = r0.k;
        r1 = r1.getFirst();
        r1 = (defpackage.ocp) r1;
        r7 = r1.c;
        r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r1 < 0) goto L_0x021d;
    L_0x0213:
        r1 = r0.k;
        r1 = r1.remove();
        r2 = r1;
        r2 = (defpackage.ocp) r2;
        goto L_0x01fd;
    L_0x021d:
        if (r2 != 0) goto L_0x0220;
    L_0x021f:
        goto L_0x022f;
    L_0x0220:
        r1 = r2.a;
        r0.q = r1;
        r7 = r2.c;
        r0.s = r7;
        r1 = r2.b;
        r7 = r0.B;
        r1 = r1 - r7;
        r0.r = r1;
    L_0x022f:
        r1 = r0.q;
        r1 = r1.b;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r1 != 0) goto L_0x0240;
    L_0x0239:
        r1 = r0.r;
        r3 = r3 + r1;
        r1 = r0.s;
        r3 = r3 - r1;
        goto L_0x0262;
    L_0x0240:
        r1 = r0.k;
        r1 = r1.isEmpty();
        if (r1 == 0) goto L_0x0254;
    L_0x0248:
        r1 = r0.r;
        r7 = r0.e;
        r8 = r0.s;
        r3 = r3 - r8;
        r3 = r7.a(r3);
        goto L_0x0261;
    L_0x0254:
        r1 = r0.r;
        r7 = r0.s;
        r3 = r3 - r7;
        r7 = r0.q;
        r7 = r7.b;
        r3 = defpackage.ozp.a(r3, r7);
    L_0x0261:
        r3 = r3 + r1;
    L_0x0262:
        r1 = r0.m;
        r2 = r0.e;
        r7 = r2.a();
        r1 = r1.a(r7);
        r3 = r3 + r1;
        r5 = r5 + r3;
        return r5;
    L_0x0271:
        r1 = -9223372036854775808;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocm.a(boolean):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARNING: Missing block: B:42:0x0098, code skipped:
            if (r2 != 5) goto L_0x009e;
     */
    public final void a(int r20, int r21, int r22, int[] r23, int r24, int r25) {
        /*
        r19 = this;
        r1 = r19;
        r0 = defpackage.ozp.a;
        r2 = 8;
        r3 = 6;
        r4 = 0;
        r5 = 21;
        if (r0 < r5) goto L_0x000f;
    L_0x000c:
        r0 = r21;
        goto L_0x001f;
    L_0x000f:
        r0 = r21;
        if (r0 != r2) goto L_0x001f;
    L_0x0013:
        if (r23 != 0) goto L_0x001f;
    L_0x0015:
        r5 = new int[r3];
        r6 = 0;
    L_0x0018:
        if (r6 >= r3) goto L_0x0021;
    L_0x001a:
        r5[r6] = r6;
        r6 = r6 + 1;
        goto L_0x0018;
    L_0x001f:
        r5 = r23;
    L_0x0021:
        r7 = defpackage.ozp.c(r20);
        r6 = 4;
        r15 = 1;
        if (r7 != 0) goto L_0x002e;
    L_0x0029:
        r8 = r20;
    L_0x002b:
        r16 = 0;
        goto L_0x0035;
    L_0x002e:
        r8 = r20;
        if (r8 != r6) goto L_0x0033;
    L_0x0032:
        goto L_0x002b;
    L_0x0033:
        r16 = 1;
    L_0x0035:
        r14 = r1.h;
        if (r16 == 0) goto L_0x0081;
    L_0x0039:
        r9 = r1.g;
        r10 = r24;
        r9.b = r10;
        r10 = r25;
        r9.g = r10;
        r9 = r1.f;
        r9.b = r5;
        r5 = r14.length;
        r13 = r22;
        r10 = r0;
        r11 = r8;
        r9 = 0;
        r12 = 0;
    L_0x004e:
        if (r9 >= r5) goto L_0x0079;
    L_0x0050:
        r2 = r14[r9];
        r17 = r2.a(r13, r10, r11);	 Catch:{ obp -> 0x0071 }
        r12 = r12 | r17;
        r17 = r2.a();
        if (r17 == 0) goto L_0x006c;
    L_0x005e:
        r10 = r2.b();
        r11 = r2.d();
        r2 = r2.c();
        r13 = r11;
        r11 = r2;
    L_0x006c:
        r9 = r9 + 1;
        r2 = 8;
        goto L_0x004e;
    L_0x0071:
        r0 = move-exception;
        r2 = r0;
        r0 = new obz;
        r0.<init>(r2);
        throw r0;
    L_0x0079:
        r2 = r10;
        r5 = r12;
        r18 = r13;
        r13 = r11;
        r11 = r18;
        goto L_0x0086;
    L_0x0081:
        r11 = r22;
        r2 = r0;
        r13 = r8;
        r5 = 0;
    L_0x0086:
        r9 = defpackage.ozp.a;
        r10 = 28;
        if (r9 <= r10) goto L_0x008d;
    L_0x008c:
        goto L_0x009e;
    L_0x008d:
        if (r7 != 0) goto L_0x009e;
    L_0x008f:
        r9 = 7;
        if (r2 == r9) goto L_0x009b;
    L_0x0092:
        r9 = 3;
        if (r2 == r9) goto L_0x009f;
    L_0x0095:
        if (r2 == r6) goto L_0x009f;
    L_0x0097:
        r6 = 5;
        if (r2 != r6) goto L_0x009e;
    L_0x009a:
        goto L_0x009f;
    L_0x009b:
        r3 = 8;
        goto L_0x009f;
    L_0x009e:
        r3 = r2;
    L_0x009f:
        r6 = defpackage.ozp.a;
        r9 = 26;
        if (r6 > r9) goto L_0x00b6;
    L_0x00a5:
        r6 = defpackage.ozp.b;
        r9 = "fugu";
        r6 = r9.equals(r6);
        if (r6 != 0) goto L_0x00b0;
    L_0x00af:
        goto L_0x00b6;
    L_0x00b0:
        if (r7 != 0) goto L_0x00b6;
    L_0x00b2:
        if (r3 == r15) goto L_0x00b5;
    L_0x00b4:
        goto L_0x00b6;
    L_0x00b5:
        r3 = 2;
    L_0x00b6:
        r12 = defpackage.ozp.e(r3);
        if (r12 == 0) goto L_0x00ff;
    L_0x00bc:
        r3 = -1;
        if (r7 == 0) goto L_0x00c5;
    L_0x00bf:
        r0 = defpackage.ozp.b(r20, r21);
        r8 = r0;
        goto L_0x00c6;
    L_0x00c5:
        r8 = -1;
    L_0x00c6:
        if (r7 == 0) goto L_0x00ce;
    L_0x00c8:
        r0 = defpackage.ozp.b(r13, r2);
        r10 = r0;
        goto L_0x00cf;
    L_0x00ce:
        r10 = -1;
    L_0x00cf:
        r0 = new ocn;
        r6 = r0;
        r9 = r22;
        r2 = r14;
        r14 = r16;
        r3 = 1;
        r15 = r16;
        r16 = r2;
        r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
        if (r5 != 0) goto L_0x00e7;
    L_0x00e1:
        r2 = r1.l;
        if (r2 == 0) goto L_0x00e6;
    L_0x00e5:
        goto L_0x00e7;
    L_0x00e6:
        r3 = 0;
    L_0x00e7:
        r2 = r19.q();
        if (r2 == 0) goto L_0x00fc;
    L_0x00ed:
        r2 = r1.m;
        r2 = r0.a(r2);
        if (r2 != 0) goto L_0x00f6;
    L_0x00f5:
        goto L_0x00f9;
    L_0x00f6:
        if (r3 != 0) goto L_0x00f9;
    L_0x00f8:
        goto L_0x00fc;
    L_0x00f9:
        r1.l = r0;
        return;
    L_0x00fc:
        r1.m = r0;
        return;
    L_0x00ff:
        r0 = new obz;
        r3 = new java.lang.StringBuilder;
        r4 = 38;
        r3.<init>(r4);
        r4 = "Unsupported channel count: ";
        r3.append(r4);
        r3.append(r2);
        r2 = r3.toString();
        r0.<init>(r2);
        goto L_0x0119;
    L_0x0118:
        throw r0;
    L_0x0119:
        goto L_0x0118;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocm.a(int, int, int, int[], int, int):void");
    }

    private final void m() {
        obq[] obqArr = this.m.k;
        ArrayList arrayList = new ArrayList();
        for (obq obq : obqArr) {
            if (obq.a()) {
                arrayList.add(obq);
            } else {
                obq.h();
            }
        }
        int size = arrayList.size();
        this.D = (obq[]) arrayList.toArray(new obq[size]);
        this.E = new ByteBuffer[size];
        n();
    }

    private final void n() {
        int i = 0;
        while (true) {
            obq[] obqArr = this.D;
            if (i < obqArr.length) {
                obq obq = obqArr[i];
                obq.h();
                this.E[i] = obq.f();
                i++;
            } else {
                return;
            }
        }
    }

    public final void a() {
        this.M = true;
        if (q()) {
            ((ocd) oxz.a(this.j.f)).b();
            this.n.play();
        }
    }

    public final void b() {
        if (this.A == 1) {
            this.A = 2;
        }
    }

    /* JADX WARNING: Missing block: B:73:0x01e1, code skipped:
            if (r4.c() == 0) goto L_0x01e3;
     */
    public final boolean a(java.nio.ByteBuffer r25, long r26) {
        /*
        r24 = this;
        r0 = r24;
        r1 = r25;
        r2 = r26;
        r4 = r0.F;
        r5 = 0;
        r6 = 1;
        if (r4 != 0) goto L_0x000e;
    L_0x000c:
        r4 = 1;
        goto L_0x0012;
    L_0x000e:
        if (r1 != r4) goto L_0x0011;
    L_0x0010:
        goto L_0x000c;
    L_0x0011:
        r4 = 0;
    L_0x0012:
        defpackage.oxz.a(r4);
        r4 = r0.l;
        r7 = 0;
        if (r4 == 0) goto L_0x0056;
    L_0x001a:
        r4 = r24.o();
        if (r4 == 0) goto L_0x0055;
    L_0x0020:
        r4 = r0.l;
        r8 = r0.m;
        r4 = r4.a(r8);
        if (r4 != 0) goto L_0x0038;
    L_0x002a:
        r24.r();
        r4 = r24.e();
        if (r4 != 0) goto L_0x0037;
    L_0x0033:
        r24.i();
        goto L_0x003e;
    L_0x0037:
        return r5;
    L_0x0038:
        r4 = r0.l;
        r0.m = r4;
        r0.l = r7;
    L_0x003e:
        r4 = r0.m;
        r4 = r4.j;
        if (r4 == 0) goto L_0x004d;
    L_0x0044:
        r4 = r0.e;
        r8 = r0.q;
        r4 = r4.a(r8);
        goto L_0x004f;
    L_0x004d:
        r4 = defpackage.oag.a;
    L_0x004f:
        r0.q = r4;
        r24.m();
        goto L_0x0056;
    L_0x0055:
        return r5;
    L_0x0056:
        r4 = r24.q();
        r8 = 6;
        r9 = 5;
        if (r4 == 0) goto L_0x0060;
    L_0x005e:
        goto L_0x01b8;
    L_0x0060:
        r4 = r0.a;
        r4.block();
        r4 = r0.m;
        r4 = defpackage.oxz.a(r4);
        r4 = (defpackage.ocn) r4;
        r14 = r0.P;
        r15 = r0.o;
        r7 = r0.N;
        r10 = defpackage.ozp.a;
        r11 = 21;
        if (r10 >= r11) goto L_0x00ba;
    L_0x0079:
        r10 = r15.d;
        r15 = defpackage.ozp.f(r10);
        if (r7 != 0) goto L_0x009c;
    L_0x0081:
        r7 = new android.media.AudioTrack;
        r10 = r4.e;
        r11 = r4.f;
        r14 = r4.g;
        r5 = r4.h;
        r20 = 1;
        r18 = r14;
        r14 = r7;
        r16 = r10;
        r17 = r11;
        r19 = r5;
        r14.<init>(r15, r16, r17, r18, r19, r20);
        r5 = r7;
        goto L_0x0123;
    L_0x009c:
        r5 = new android.media.AudioTrack;
        r10 = r4.e;
        r11 = r4.f;
        r14 = r4.g;
        r12 = r4.h;
        r22 = 1;
        r16 = r5;
        r17 = r15;
        r18 = r10;
        r19 = r11;
        r20 = r14;
        r21 = r12;
        r23 = r7;
        r16.<init>(r17, r18, r19, r20, r21, r22, r23);
        goto L_0x0123;
    L_0x00ba:
        if (r14 == 0) goto L_0x00d6;
    L_0x00bc:
        r5 = new android.media.AudioAttributes$Builder;
        r5.<init>();
        r10 = 3;
        r5 = r5.setContentType(r10);
        r10 = 16;
        r5 = r5.setFlags(r10);
        r5 = r5.setUsage(r6);
        r5 = r5.build();
    L_0x00d4:
        r11 = r5;
        goto L_0x00fa;
    L_0x00d6:
        r5 = r15.e;
        if (r5 != 0) goto L_0x00f7;
    L_0x00da:
        r5 = new android.media.AudioAttributes$Builder;
        r5.<init>();
        r10 = r15.b;
        r5 = r5.setContentType(r10);
        r10 = r15.c;
        r5 = r5.setFlags(r10);
        r10 = r15.d;
        r5 = r5.setUsage(r10);
        r5 = r5.build();
        r15.e = r5;
    L_0x00f7:
        r5 = r15.e;
        goto L_0x00d4;
    L_0x00fa:
        r5 = new android.media.AudioFormat$Builder;
        r5.<init>();
        r10 = r4.f;
        r5 = r5.setChannelMask(r10);
        r10 = r4.g;
        r5 = r5.setEncoding(r10);
        r10 = r4.e;
        r5 = r5.setSampleRate(r10);
        r12 = r5.build();
        r5 = new android.media.AudioTrack;
        r13 = r4.h;
        if (r7 == 0) goto L_0x011d;
    L_0x011b:
        r15 = r7;
        goto L_0x011e;
    L_0x011d:
        r15 = 0;
    L_0x011e:
        r14 = 1;
        r10 = r5;
        r10.<init>(r11, r12, r13, r14, r15);
    L_0x0123:
        r7 = r5.getState();
        if (r7 != r6) goto L_0x0382;
    L_0x0129:
        r0.n = r5;
        r4 = r0.n;
        r4 = r4.getAudioSessionId();
        r5 = r0.N;
        if (r5 == r4) goto L_0x013e;
    L_0x0135:
        r0.N = r4;
        r5 = r0.b;
        if (r5 == 0) goto L_0x013e;
    L_0x013b:
        r5.a(r4);
    L_0x013e:
        r4 = r0.m;
        r4 = r4.j;
        if (r4 == 0) goto L_0x014d;
    L_0x0144:
        r4 = r0.e;
        r5 = r0.q;
        r4 = r4.a(r5);
        goto L_0x014f;
    L_0x014d:
        r4 = defpackage.oag.a;
    L_0x014f:
        r0.q = r4;
        r24.m();
        r4 = r0.j;
        r5 = r0.n;
        r7 = r0.m;
        r10 = r7.g;
        r11 = r7.d;
        r7 = r7.h;
        r4.c = r5;
        r4.d = r11;
        r4.e = r7;
        r12 = new ocd;
        r12.<init>(r5);
        r4.f = r12;
        r5 = r5.getSampleRate();
        r4.g = r5;
        r5 = defpackage.ozp.a;
        r12 = 23;
        if (r5 < r12) goto L_0x017b;
    L_0x0179:
        r5 = 0;
        goto L_0x0180;
    L_0x017b:
        if (r10 == r9) goto L_0x017f;
    L_0x017d:
        if (r10 != r8) goto L_0x0179;
    L_0x017f:
        r5 = 1;
    L_0x0180:
        r4.h = r5;
        r5 = defpackage.ozp.c(r10);
        r4.o = r5;
        if (r5 == 0) goto L_0x0191;
    L_0x018a:
        r7 = r7 / r11;
        r10 = (long) r7;
        r10 = r4.b(r10);
        goto L_0x0196;
    L_0x0191:
        r10 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
    L_0x0196:
        r4.i = r10;
        r10 = 0;
        r4.q = r10;
        r4.r = r10;
        r4.s = r10;
        r5 = 0;
        r4.n = r5;
        r12 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r4.v = r12;
        r4.w = r12;
        r4.m = r10;
        r24.p();
        r4 = r0.M;
        if (r4 == 0) goto L_0x01b8;
    L_0x01b5:
        r24.a();
    L_0x01b8:
        r4 = r0.j;
        r10 = r24.l();
        r5 = r4.c;
        r5 = defpackage.oxz.a(r5);
        r5 = (android.media.AudioTrack) r5;
        r5 = r5.getPlayState();
        r7 = r4.h;
        r12 = 2;
        if (r7 != 0) goto L_0x01d0;
    L_0x01cf:
        goto L_0x01e4;
    L_0x01d0:
        if (r5 != r12) goto L_0x01d6;
    L_0x01d2:
        r7 = 0;
        r4.n = r7;
        goto L_0x01e3;
    L_0x01d6:
        r7 = 0;
        if (r5 != r6) goto L_0x01e4;
    L_0x01d9:
        r13 = r4.c();
        r15 = 0;
        r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1));
        if (r17 != 0) goto L_0x01e4;
    L_0x01e3:
        return r7;
    L_0x01e4:
        r7 = r4.n;
        r10 = r4.a(r10);
        r4.n = r10;
        if (r7 != 0) goto L_0x01ef;
    L_0x01ee:
        goto L_0x0202;
    L_0x01ef:
        if (r10 != 0) goto L_0x0202;
    L_0x01f1:
        if (r5 == r6) goto L_0x0202;
    L_0x01f3:
        r5 = r4.a;
        if (r5 == 0) goto L_0x0202;
    L_0x01f7:
        r7 = r4.e;
        r10 = r4.i;
        r10 = defpackage.nyr.a(r10);
        r5.a(r7, r10);
    L_0x0202:
        r4 = r0.F;
        r5 = "AudioTrack";
        if (r4 != 0) goto L_0x0338;
    L_0x0208:
        r4 = r25.hasRemaining();
        if (r4 == 0) goto L_0x0337;
    L_0x020e:
        r4 = r0.m;
        r7 = r4.a;
        if (r7 != 0) goto L_0x026f;
    L_0x0214:
        r7 = r0.z;
        if (r7 != 0) goto L_0x026f;
    L_0x0218:
        r4 = r4.g;
        r7 = 7;
        if (r4 == r7) goto L_0x0265;
    L_0x021d:
        r7 = 8;
        if (r4 == r7) goto L_0x0265;
    L_0x0221:
        if (r4 != r9) goto L_0x0228;
    L_0x0223:
        r4 = defpackage.obe.a();
        goto L_0x0269;
    L_0x0228:
        if (r4 != r8) goto L_0x022f;
    L_0x022a:
        r4 = defpackage.obe.a(r25);
        goto L_0x0269;
    L_0x022f:
        r7 = 17;
        if (r4 != r7) goto L_0x0238;
    L_0x0233:
        r4 = defpackage.obg.a(r25);
        goto L_0x0269;
    L_0x0238:
        r7 = 14;
        if (r4 != r7) goto L_0x024c;
    L_0x023c:
        r4 = defpackage.obe.b(r25);
        r7 = -1;
        if (r4 == r7) goto L_0x024a;
    L_0x0243:
        r4 = defpackage.obe.a(r1, r4);
        r4 = r4 << 4;
        goto L_0x0269;
    L_0x024a:
        r4 = 0;
        goto L_0x0269;
    L_0x024c:
        r1 = new java.lang.IllegalStateException;
        r2 = new java.lang.StringBuilder;
        r3 = 38;
        r2.<init>(r3);
        r3 = "Unexpected audio encoding: ";
        r2.append(r3);
        r2.append(r4);
        r2 = r2.toString();
        r1.<init>(r2);
        throw r1;
    L_0x0265:
        r4 = defpackage.ocr.a(r25);
    L_0x0269:
        r0.z = r4;
        if (r4 == 0) goto L_0x026e;
    L_0x026d:
        goto L_0x026f;
    L_0x026e:
        return r6;
    L_0x026f:
        r4 = r0.p;
        if (r4 == 0) goto L_0x02a5;
    L_0x0273:
        r4 = r24.o();
        if (r4 == 0) goto L_0x02a3;
    L_0x0279:
        r4 = r0.p;
        r7 = 0;
        r0.p = r7;
        r7 = r0.e;
        r14 = r7.a(r4);
        r4 = r0.k;
        r7 = new ocp;
        r8 = 0;
        r15 = java.lang.Math.max(r8, r2);
        r8 = r0.m;
        r9 = r24.l();
        r17 = r8.a(r9);
        r13 = r7;
        r13.<init>(r14, r15, r17);
        r4.add(r7);
        r24.m();
        goto L_0x02a5;
    L_0x02a3:
        r4 = 0;
        return r4;
    L_0x02a5:
        r4 = r0.A;
        if (r4 != 0) goto L_0x02b4;
    L_0x02a9:
        r7 = 0;
        r9 = java.lang.Math.max(r7, r2);
        r0.B = r9;
        r0.A = r6;
        goto L_0x031b;
    L_0x02b4:
        r7 = r0.B;
        r4 = r0.m;
        r9 = r24.k();
        r11 = r0.g;
        r13 = r11.h;
        r9 = r9 - r13;
        r13 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r9 = r9 * r13;
        r4 = r4.c;
        r13 = (long) r4;
        r9 = r9 / r13;
        r7 = r7 + r9;
        r4 = r0.A;
        if (r4 != r6) goto L_0x0301;
    L_0x02cf:
        r9 = r7 - r2;
        r9 = java.lang.Math.abs(r9);
        r13 = 200000; // 0x30d40 float:2.8026E-40 double:9.8813E-319;
        r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1));
        if (r4 <= 0) goto L_0x0301;
    L_0x02dc:
        r4 = new java.lang.StringBuilder;
        r9 = 80;
        r4.<init>(r9);
        r9 = "Discontinuity detected [expected ";
        r4.append(r9);
        r4.append(r7);
        r9 = ", got ";
        r4.append(r9);
        r4.append(r2);
        r9 = "]";
        r4.append(r9);
        r4 = r4.toString();
        defpackage.oyp.b(r5, r4);
        r0.A = r12;
    L_0x0301:
        r4 = r0.A;
        if (r4 != r12) goto L_0x031b;
    L_0x0305:
        r7 = r2 - r7;
        r9 = r0.B;
        r9 = r9 + r7;
        r0.B = r9;
        r0.A = r6;
        r4 = r0.b;
        if (r4 == 0) goto L_0x031b;
    L_0x0312:
        r9 = 0;
        r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r11 == 0) goto L_0x031b;
    L_0x0318:
        r4.a();
    L_0x031b:
        r4 = r0.m;
        r4 = r4.a;
        if (r4 == 0) goto L_0x032c;
    L_0x0321:
        r7 = r0.v;
        r4 = r25.remaining();
        r9 = (long) r4;
        r7 = r7 + r9;
        r0.v = r7;
        goto L_0x0334;
    L_0x032c:
        r7 = r0.w;
        r4 = r0.z;
        r9 = (long) r4;
        r7 = r7 + r9;
        r0.w = r7;
    L_0x0334:
        r0.F = r1;
        goto L_0x0338;
    L_0x0337:
        return r6;
    L_0x0338:
        r1 = r0.m;
        r1 = r1.i;
        if (r1 == 0) goto L_0x0342;
    L_0x033e:
        r0.a(r2);
        goto L_0x0347;
    L_0x0342:
        r1 = r0.F;
        r0.b(r1, r2);
    L_0x0347:
        r1 = r0.F;
        r1 = r1.hasRemaining();
        if (r1 != 0) goto L_0x0353;
    L_0x034f:
        r1 = 0;
        r0.F = r1;
        return r6;
    L_0x0353:
        r1 = r0.j;
        r2 = r24.l();
        r7 = r1.w;
        r9 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r4 == 0) goto L_0x0380;
    L_0x0364:
        r7 = 0;
        r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r4 <= 0) goto L_0x0380;
    L_0x036a:
        r2 = android.os.SystemClock.elapsedRealtime();
        r7 = r1.w;
        r2 = r2 - r7;
        r7 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r1 < 0) goto L_0x0380;
    L_0x0377:
        r1 = "Resetting stalled audio track";
        defpackage.oyp.a(r5, r1);
        r24.i();
        return r6;
    L_0x0380:
        r1 = 0;
        return r1;
    L_0x0382:
        r5.release();	 Catch:{ Exception -> 0x0385 }
    L_0x0385:
        r1 = new occ;
        r2 = r4.e;
        r3 = r4.f;
        r4 = r4.h;
        r1.<init>(r7, r2, r3, r4);
        goto L_0x0392;
    L_0x0391:
        throw r1;
    L_0x0392:
        goto L_0x0391;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocm.a(java.nio.ByteBuffer, long):boolean");
    }

    private final void a(long j) {
        int length = this.D.length;
        int i = length;
        while (i >= 0) {
            ByteBuffer byteBuffer;
            if (i > 0) {
                byteBuffer = this.E[i - 1];
            } else {
                byteBuffer = this.F;
                if (byteBuffer == null) {
                    byteBuffer = obq.a;
                }
            }
            if (i == length) {
                b(byteBuffer, j);
            } else {
                obq obq = this.D[i];
                obq.a(byteBuffer);
                ByteBuffer f = obq.f();
                this.E[i] = f;
                if (f.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Missing block: B:41:0x00dd, code skipped:
            if (r11 >= r10) goto L_0x00df;
     */
    private final void b(java.nio.ByteBuffer r9, long r10) {
        /*
        r8 = this;
        r0 = r9.hasRemaining();
        if (r0 == 0) goto L_0x0118;
    L_0x0006:
        r0 = r8.G;
        r1 = 21;
        r2 = 1;
        r3 = 0;
        if (r0 != 0) goto L_0x0032;
    L_0x000e:
        r8.G = r9;
        r0 = defpackage.ozp.a;
        if (r0 >= r1) goto L_0x003a;
    L_0x0014:
        r0 = r9.remaining();
        r4 = r8.H;
        if (r4 == 0) goto L_0x001f;
    L_0x001c:
        r4 = r4.length;
        if (r4 >= r0) goto L_0x0023;
    L_0x001f:
        r4 = new byte[r0];
        r8.H = r4;
    L_0x0023:
        r4 = r9.position();
        r5 = r8.H;
        r9.get(r5, r3, r0);
        r9.position(r4);
        r8.I = r3;
        goto L_0x003a;
    L_0x0032:
        if (r0 != r9) goto L_0x0036;
    L_0x0034:
        r0 = 1;
        goto L_0x0037;
    L_0x0036:
        r0 = 0;
    L_0x0037:
        defpackage.oxz.a(r0);
    L_0x003a:
        r0 = r9.remaining();
        r4 = defpackage.ozp.a;
        if (r4 >= r1) goto L_0x0075;
    L_0x0042:
        r10 = r8.j;
        r1 = r8.x;
        r4 = r10.c();
        r11 = r10.d;
        r10 = r10.e;
        r6 = (long) r11;
        r4 = r4 * r6;
        r1 = r1 - r4;
        r11 = (int) r1;
        r10 = r10 - r11;
        if (r10 <= 0) goto L_0x00ee;
    L_0x0056:
        r10 = java.lang.Math.min(r0, r10);
        r11 = r8.n;
        r1 = r8.H;
        r2 = r8.I;
        r3 = r11.write(r1, r2, r10);
        if (r3 <= 0) goto L_0x00ee;
    L_0x0066:
        r10 = r8.I;
        r10 = r10 + r3;
        r8.I = r10;
        r10 = r9.position();
        r10 = r10 + r3;
        r9.position(r10);
        goto L_0x00ee;
    L_0x0075:
        r1 = r8.P;
        if (r1 != 0) goto L_0x0081;
    L_0x0079:
        r10 = r8.n;
        r3 = defpackage.ocm.a(r10, r9, r0);
        goto L_0x00ee;
    L_0x0081:
        r4 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r1 == 0) goto L_0x008c;
    L_0x008a:
        r1 = 1;
        goto L_0x008d;
    L_0x008c:
        r1 = 0;
    L_0x008d:
        defpackage.oxz.b(r1);
        r1 = r8.n;
        r4 = r8.t;
        if (r4 != 0) goto L_0x00ad;
    L_0x0096:
        r4 = 16;
        r4 = java.nio.ByteBuffer.allocate(r4);
        r8.t = r4;
        r4 = r8.t;
        r5 = java.nio.ByteOrder.BIG_ENDIAN;
        r4.order(r5);
        r4 = r8.t;
        r5 = 1431633921; // 0x55550001 float:1.46372496E13 double:7.07321138E-315;
        r4.putInt(r5);
    L_0x00ad:
        r4 = r8.u;
        if (r4 != 0) goto L_0x00c9;
    L_0x00b1:
        r4 = r8.t;
        r5 = 4;
        r4.putInt(r5, r0);
        r4 = r8.t;
        r5 = 8;
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r10 = r10 * r6;
        r4.putLong(r5, r10);
        r10 = r8.t;
        r10.position(r3);
        r8.u = r0;
    L_0x00c9:
        r10 = r8.t;
        r10 = r10.remaining();
        if (r10 <= 0) goto L_0x00df;
    L_0x00d1:
        r11 = r8.t;
        r11 = r1.write(r11, r10, r2);
        if (r11 >= 0) goto L_0x00dd;
    L_0x00d9:
        r8.u = r3;
        r3 = r11;
        goto L_0x00ee;
    L_0x00dd:
        if (r11 < r10) goto L_0x00ee;
    L_0x00df:
        r9 = defpackage.ocm.a(r1, r9, r0);
        if (r9 >= 0) goto L_0x00e8;
    L_0x00e5:
        r8.u = r3;
        goto L_0x00ed;
    L_0x00e8:
        r10 = r8.u;
        r10 = r10 - r9;
        r8.u = r10;
    L_0x00ed:
        r3 = r9;
    L_0x00ee:
        r9 = android.os.SystemClock.elapsedRealtime();
        r8.c = r9;
        if (r3 < 0) goto L_0x0112;
    L_0x00f6:
        r9 = r8.m;
        r9 = r9.a;
        if (r9 == 0) goto L_0x0102;
    L_0x00fc:
        r10 = r8.x;
        r1 = (long) r3;
        r10 = r10 + r1;
        r8.x = r10;
    L_0x0102:
        if (r3 != r0) goto L_0x0111;
    L_0x0104:
        if (r9 != 0) goto L_0x010e;
    L_0x0106:
        r9 = r8.y;
        r11 = r8.z;
        r0 = (long) r11;
        r9 = r9 + r0;
        r8.y = r9;
    L_0x010e:
        r9 = 0;
        r8.G = r9;
    L_0x0111:
        return;
    L_0x0112:
        r9 = new oce;
        r9.<init>(r3);
        throw r9;
    L_0x0118:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocm.b(java.nio.ByteBuffer, long):void");
    }

    public final void c() {
        if (!this.K && q() && o()) {
            r();
            this.K = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003e  */
    private final boolean o() {
        /*
        r9 = this;
        r0 = r9.J;
        r1 = -1;
        r2 = 1;
        r3 = 0;
        if (r0 != r1) goto L_0x0016;
    L_0x0007:
        r0 = r9.m;
        r0 = r0.i;
        if (r0 != 0) goto L_0x0011;
    L_0x000d:
        r0 = r9.D;
        r0 = r0.length;
        goto L_0x0012;
    L_0x0011:
        r0 = 0;
    L_0x0012:
        r9.J = r0;
    L_0x0014:
        r0 = 1;
        goto L_0x0017;
    L_0x0016:
        r0 = 0;
    L_0x0017:
        r4 = r9.J;
        r5 = r9.D;
        r6 = r5.length;
        r7 = -9223372036854775807; // 0x8000000000000001 float:1.4E-45 double:-4.9E-324;
        if (r4 >= r6) goto L_0x003a;
    L_0x0023:
        r4 = r5[r4];
        if (r0 == 0) goto L_0x002a;
    L_0x0027:
        r4.e();
    L_0x002a:
        r9.a(r7);
        r0 = r4.g();
        if (r0 == 0) goto L_0x0039;
    L_0x0033:
        r0 = r9.J;
        r0 = r0 + r2;
        r9.J = r0;
        goto L_0x0014;
    L_0x0039:
        return r3;
    L_0x003a:
        r0 = r9.G;
        if (r0 == 0) goto L_0x0047;
    L_0x003e:
        r9.b(r0, r7);
        r0 = r9.G;
        if (r0 != 0) goto L_0x0046;
    L_0x0045:
        goto L_0x0047;
    L_0x0046:
        return r3;
    L_0x0047:
        r9.J = r1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ocm.o():boolean");
    }

    public final boolean d() {
        boolean z = true;
        if (q()) {
            if (this.K) {
                return !e() ? z : false;
            } else {
                z = false;
            }
        }
    }

    public final boolean e() {
        return q() && this.j.a(l());
    }

    public final oag a(oag oag) {
        ocn ocn = this.m;
        if (ocn == null || ocn.j) {
            Object obj = this.p;
            if (obj == null) {
                if (this.k.isEmpty()) {
                    obj = this.q;
                } else {
                    obj = ((ocp) this.k.getLast()).a;
                }
            }
            if (!oag.equals(obj)) {
                if (q()) {
                    this.p = oag;
                } else {
                    this.q = this.e.a(oag);
                }
            }
            return this.q;
        }
        this.q = oag.a;
        return this.q;
    }

    public final oag f() {
        return this.q;
    }

    public final void a(obi obi) {
        if (!this.o.equals(obi)) {
            this.o = obi;
            if (!this.P) {
                i();
                this.N = 0;
            }
        }
    }

    public final void a(och och) {
        if (!this.O.equals(och)) {
            this.O = och;
        }
    }

    public final void a(int i) {
        oxz.b(ozp.a >= 21);
        if (!this.P || this.N != i) {
            this.P = true;
            this.N = i;
            i();
        }
    }

    public final void g() {
        if (this.P) {
            this.P = false;
            this.N = 0;
            i();
        }
    }

    public final void a(float f) {
        if (this.C != f) {
            this.C = f;
            p();
        }
    }

    private final void p() {
        if (!q()) {
            return;
        }
        if (ozp.a >= 21) {
            this.n.setVolume(this.C);
            return;
        }
        AudioTrack audioTrack = this.n;
        float f = this.C;
        audioTrack.setStereoVolume(f, f);
    }

    public final void h() {
        this.M = false;
        if (q()) {
            ocf ocf = this.j;
            ocf.a();
            if (ocf.v == -9223372036854775807L) {
                ((ocd) oxz.a(ocf.f)).b();
                this.n.pause();
            }
        }
    }

    public final void i() {
        if (q()) {
            this.v = 0;
            this.w = 0;
            this.x = 0;
            this.y = 0;
            this.z = 0;
            oag oag = this.p;
            if (oag != null) {
                this.q = oag;
                this.p = null;
            } else if (!this.k.isEmpty()) {
                this.q = ((ocp) this.k.getLast()).a;
            }
            this.k.clear();
            this.r = 0;
            this.s = 0;
            this.g.h = 0;
            n();
            this.F = null;
            this.G = null;
            this.L = false;
            this.K = false;
            this.J = -1;
            this.t = null;
            this.u = 0;
            this.A = 0;
            if (((AudioTrack) oxz.a(this.j.c)).getPlayState() == 3) {
                this.n.pause();
            }
            AudioTrack audioTrack = this.n;
            this.n = null;
            ocn ocn = this.l;
            if (ocn != null) {
                this.m = ocn;
                this.l = null;
            }
            ocf ocf = this.j;
            ocf.a();
            ocf.c = null;
            ocf.f = null;
            this.a.close();
            new ocl(this, audioTrack).start();
        }
    }

    public final void j() {
        i();
        for (obq i : this.h) {
            i.i();
        }
        for (obq i2 : this.i) {
            i2.i();
        }
        this.N = 0;
        this.M = false;
    }

    private final boolean q() {
        return this.n != null;
    }

    public final long k() {
        ocn ocn = this.m;
        if (ocn.a) {
            return this.v / ((long) ocn.b);
        }
        return this.w;
    }

    public final long l() {
        ocn ocn = this.m;
        if (ocn.a) {
            return this.x / ((long) ocn.d);
        }
        return this.y;
    }

    private static int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    private final void r() {
        if (!this.L) {
            this.L = true;
            ocf ocf = this.j;
            long l = l();
            ocf.x = ocf.c();
            ocf.v = SystemClock.elapsedRealtime() * 1000;
            ocf.y = l;
            this.n.stop();
            this.u = 0;
        }
    }
}
