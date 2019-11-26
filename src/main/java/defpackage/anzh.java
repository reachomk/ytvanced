package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

/* renamed from: anzh */
final class anzh implements anzz {
    private static final int[] a = new int[0];
    private static final Unsafe b = aoax.a();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final anze g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int[] l;
    private final int m;
    private final int n;
    private final anzm o;
    private final anyn p;
    private final aoar q;
    private final anxc r;
    private final anyx s;

    private anzh(int[] iArr, Object[] objArr, int i, int i2, anze anze, boolean z, boolean z2, int[] iArr2, int i3, int i4, anzm anzm, anyn anyn, aoar aoar, anxc anxc, anyx anyx) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = anze instanceof anxl;
        this.j = z;
        boolean z3 = false;
        if (anxc != null && anxc.a(anze)) {
            z3 = true;
        }
        this.h = z3;
        this.k = z2;
        this.l = iArr2;
        this.m = i3;
        this.n = i4;
        this.o = anzm;
        this.p = anyn;
        this.q = aoar;
        this.r = anxc;
        this.g = anze;
        this.s = anyx;
    }

    private static int g(int i) {
        return (i >>> 20) & 255;
    }

    private static boolean h(int i) {
        return (i & 536870912) != 0;
    }

    private static long i(int i) {
        return (long) (i & 1048575);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0174  */
    static defpackage.anzh a(defpackage.anzc r27, defpackage.anzm r28, defpackage.anyn r29, defpackage.aoar r30, defpackage.anxc r31, defpackage.anyx r32) {
        /*
        r0 = r27;
        r1 = r0 instanceof defpackage.anzu;
        if (r1 == 0) goto L_0x0018;
    L_0x0006:
        r2 = r0;
        r2 = (defpackage.anzu) r2;
        r3 = r28;
        r4 = r29;
        r5 = r30;
        r6 = r31;
        r7 = r32;
        r0 = defpackage.anzh.a(r2, r3, r4, r5, r6, r7);
        return r0;
    L_0x0018:
        r0 = (defpackage.aoam) r0;
        r1 = r0.d;
        r2 = 2;
        r4 = 0;
        if (r1 != r2) goto L_0x0022;
    L_0x0020:
        r11 = 1;
        goto L_0x0023;
    L_0x0022:
        r11 = 0;
    L_0x0023:
        r1 = r0.b;
        r2 = r1.length;
        if (r2 == 0) goto L_0x0035;
    L_0x0028:
        r5 = r1[r4];
        r5 = r5.d;
        r6 = r2 + -1;
        r6 = r1[r6];
        r6 = r6.d;
        r8 = r5;
        r9 = r6;
        goto L_0x0037;
    L_0x0035:
        r8 = 0;
        r9 = 0;
    L_0x0037:
        r5 = r2 * 3;
        r6 = new int[r5];
        r5 = r2 + r2;
        r7 = new java.lang.Object[r5];
        r5 = 0;
        r10 = 0;
        r12 = 0;
    L_0x0042:
        r13 = 18;
        r14 = 49;
        if (r5 >= r2) goto L_0x0061;
    L_0x0048:
        r15 = r1[r5];
        r4 = r15.b;
        r3 = defpackage.anxi.MAP;
        if (r4 != r3) goto L_0x0053;
    L_0x0050:
        r10 = r10 + 1;
        goto L_0x005d;
    L_0x0053:
        r3 = r15.b;
        r3 = r3.d;
        if (r3 < r13) goto L_0x005d;
    L_0x0059:
        if (r3 > r14) goto L_0x005d;
    L_0x005b:
        r12 = r12 + 1;
    L_0x005d:
        r5 = r5 + 1;
        r4 = 0;
        goto L_0x0042;
    L_0x0061:
        if (r10 <= 0) goto L_0x0066;
    L_0x0063:
        r3 = new int[r10];
        goto L_0x0067;
    L_0x0066:
        r3 = 0;
    L_0x0067:
        if (r12 <= 0) goto L_0x006c;
    L_0x0069:
        r4 = new int[r12];
        goto L_0x006d;
    L_0x006c:
        r4 = 0;
    L_0x006d:
        r5 = r0.a;
        if (r5 != 0) goto L_0x0073;
    L_0x0071:
        r5 = a;
    L_0x0073:
        r10 = 0;
        r12 = 0;
        r15 = 0;
        r17 = 0;
        r18 = 0;
    L_0x007a:
        r2 = r1.length;
        if (r10 >= r2) goto L_0x01ac;
    L_0x007d:
        r2 = r1[r10];
        r13 = r2.d;
        r14 = r2.i;
        if (r14 == 0) goto L_0x00a5;
    L_0x0085:
        r21 = r1;
        r1 = r2.b;
        r1 = r1.d;
        r1 = r1 + 51;
        r22 = r1;
        r1 = r14.b;
        r23 = r8;
        r24 = r9;
        r8 = defpackage.aoax.a(r1);
        r1 = (int) r8;
        r8 = r14.a;
        r8 = defpackage.aoax.a(r8);
        r9 = (int) r8;
        r14 = r1;
        r1 = r9;
    L_0x00a3:
        r8 = 0;
        goto L_0x00e3;
    L_0x00a5:
        r21 = r1;
        r23 = r8;
        r24 = r9;
        r1 = r2.b;
        r8 = r2.a;
        r8 = defpackage.aoax.a(r8);
        r9 = (int) r8;
        r8 = r1.d;
        if (r11 != 0) goto L_0x00d4;
    L_0x00b8:
        r1 = r1.e;
        r14 = r1.e;
        if (r14 == 0) goto L_0x00bf;
    L_0x00be:
        goto L_0x00d4;
    L_0x00bf:
        r14 = defpackage.anxh.MAP;
        if (r1 == r14) goto L_0x00d4;
    L_0x00c3:
        r1 = r2.e;
        r22 = r8;
        r14 = r9;
        r8 = defpackage.aoax.a(r1);
        r1 = (int) r8;
        r8 = r2.f;
        r8 = java.lang.Integer.numberOfTrailingZeros(r8);
        goto L_0x00e3;
    L_0x00d4:
        r22 = r8;
        r14 = r9;
        r1 = r2.j;
        if (r1 != 0) goto L_0x00dd;
    L_0x00db:
        r1 = 0;
        goto L_0x00a3;
    L_0x00dd:
        r8 = defpackage.aoax.a(r1);
        r1 = (int) r8;
        goto L_0x00a3;
    L_0x00e3:
        r9 = r2.d;
        r6[r12] = r9;
        r9 = r12 + 1;
        r25 = r11;
        r11 = r2.h;
        if (r11 != 0) goto L_0x00f3;
    L_0x00ef:
        r26 = r0;
        r11 = 0;
        goto L_0x00f7;
    L_0x00f3:
        r11 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r26 = r0;
    L_0x00f7:
        r0 = r2.g;
        if (r0 != 0) goto L_0x00fd;
    L_0x00fb:
        r0 = 0;
        goto L_0x00ff;
    L_0x00fd:
        r0 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
    L_0x00ff:
        r0 = r0 | r11;
        r11 = r22 << 20;
        r0 = r0 | r11;
        r0 = r0 | r14;
        r6[r9] = r0;
        r0 = r12 + 2;
        r8 = r8 << 20;
        r1 = r1 | r8;
        r6[r0] = r1;
        r0 = r2.b;
        r0 = r0.ordinal();
        r1 = 9;
        if (r0 == r1) goto L_0x0128;
    L_0x0117:
        r1 = 17;
        if (r0 == r1) goto L_0x0128;
    L_0x011b:
        r1 = 27;
        if (r0 == r1) goto L_0x0125;
    L_0x011f:
        r1 = 49;
        if (r0 == r1) goto L_0x0125;
    L_0x0123:
        r0 = 0;
        goto L_0x0133;
    L_0x0125:
        r0 = r2.c;
        goto L_0x0133;
    L_0x0128:
        r0 = r2.a;
        if (r0 != 0) goto L_0x012f;
    L_0x012c:
        r0 = r2.k;
        goto L_0x0133;
    L_0x012f:
        r0 = r0.getType();
    L_0x0133:
        r1 = r2.l;
        if (r1 == 0) goto L_0x014d;
    L_0x0137:
        r8 = r12 / 3;
        r8 = r8 + r8;
        r7[r8] = r1;
        if (r0 == 0) goto L_0x0143;
    L_0x013e:
        r8 = r8 + 1;
        r7[r8] = r0;
        goto L_0x014b;
    L_0x0143:
        r0 = r2.m;
        if (r0 == 0) goto L_0x014b;
    L_0x0147:
        r8 = r8 + 1;
        r7[r8] = r0;
    L_0x014b:
        r8 = 1;
        goto L_0x0162;
    L_0x014d:
        if (r0 == 0) goto L_0x0157;
    L_0x014f:
        r1 = r12 / 3;
        r1 = r1 + r1;
        r8 = 1;
        r1 = r1 + r8;
        r7[r1] = r0;
        goto L_0x0162;
    L_0x0157:
        r8 = 1;
        r0 = r2.m;
        if (r0 == 0) goto L_0x0162;
    L_0x015c:
        r1 = r12 / 3;
        r1 = r1 + r1;
        r1 = r1 + r8;
        r7[r1] = r0;
    L_0x0162:
        r0 = r5.length;
        if (r15 >= r0) goto L_0x016e;
    L_0x0165:
        r0 = r5[r15];
        if (r0 != r13) goto L_0x016e;
    L_0x0169:
        r0 = r15 + 1;
        r5[r15] = r12;
        r15 = r0;
    L_0x016e:
        r0 = r2.b;
        r1 = defpackage.anxi.MAP;
        if (r0 != r1) goto L_0x017f;
    L_0x0174:
        r0 = r17 + 1;
        r3[r17] = r12;
        r17 = r0;
        r1 = 18;
    L_0x017c:
        r9 = 49;
        goto L_0x0198;
    L_0x017f:
        r0 = r2.b;
        r0 = r0.d;
        r1 = 18;
        if (r0 < r1) goto L_0x017c;
    L_0x0187:
        r9 = 49;
        if (r0 > r9) goto L_0x0198;
    L_0x018b:
        r0 = r18 + 1;
        r2 = r2.a;
        r13 = defpackage.aoax.a(r2);
        r2 = (int) r13;
        r4[r18] = r2;
        r18 = r0;
    L_0x0198:
        r10 = r10 + 1;
        r12 = r12 + 3;
        r1 = r21;
        r8 = r23;
        r9 = r24;
        r11 = r25;
        r0 = r26;
        r13 = 18;
        r14 = 49;
        goto L_0x007a;
    L_0x01ac:
        r26 = r0;
        r23 = r8;
        r24 = r9;
        r25 = r11;
        if (r3 != 0) goto L_0x01b8;
    L_0x01b6:
        r3 = a;
    L_0x01b8:
        if (r4 != 0) goto L_0x01bc;
    L_0x01ba:
        r4 = a;
    L_0x01bc:
        r14 = r5.length;
        r0 = r3.length;
        r15 = r14 + r0;
        r1 = r4.length;
        r2 = r15 + r1;
        r13 = new int[r2];
        r2 = 0;
        java.lang.System.arraycopy(r5, r2, r13, r2, r14);
        java.lang.System.arraycopy(r3, r2, r13, r14, r0);
        java.lang.System.arraycopy(r4, r2, r13, r15, r1);
        r0 = new anzh;
        r1 = r26;
        r10 = r1.c;
        r12 = 1;
        r5 = r0;
        r8 = r23;
        r9 = r24;
        r11 = r25;
        r16 = r28;
        r17 = r29;
        r18 = r30;
        r19 = r31;
        r20 = r32;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anzh.a(anzc, anzm, anyn, aoar, anxc, anyx):anzh");
    }

    /* JADX WARNING: Removed duplicated region for block: B:149:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02d8  */
    private static defpackage.anzh a(defpackage.anzu r36, defpackage.anzm r37, defpackage.anyn r38, defpackage.aoar r39, defpackage.anxc r40, defpackage.anyx r41) {
        /*
        r0 = r36;
        r1 = r36.c();
        r2 = 0;
        r4 = 2;
        if (r1 != r4) goto L_0x000c;
    L_0x000a:
        r11 = 1;
        goto L_0x000d;
    L_0x000c:
        r11 = 0;
    L_0x000d:
        r1 = r0.b;
        r4 = r1.length();
        r5 = r1.charAt(r2);
        r7 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r5 < r7) goto L_0x0035;
    L_0x001c:
        r5 = r5 & 8191;
        r8 = r5;
        r5 = 1;
        r9 = 13;
    L_0x0022:
        r10 = r5 + 1;
        r5 = r1.charAt(r5);
        if (r5 < r7) goto L_0x0032;
    L_0x002a:
        r5 = r5 & 8191;
        r5 = r5 << r9;
        r8 = r8 | r5;
        r9 = r9 + 13;
        r5 = r10;
        goto L_0x0022;
    L_0x0032:
        r5 = r5 << r9;
        r5 = r5 | r8;
        goto L_0x0036;
    L_0x0035:
        r10 = 1;
    L_0x0036:
        r8 = r10 + 1;
        r9 = r1.charAt(r10);
        if (r9 < r7) goto L_0x0055;
    L_0x003e:
        r9 = r9 & 8191;
        r10 = 13;
    L_0x0042:
        r12 = r8 + 1;
        r8 = r1.charAt(r8);
        if (r8 < r7) goto L_0x0052;
    L_0x004a:
        r8 = r8 & 8191;
        r8 = r8 << r10;
        r9 = r9 | r8;
        r10 = r10 + 13;
        r8 = r12;
        goto L_0x0042;
    L_0x0052:
        r8 = r8 << r10;
        r9 = r9 | r8;
        goto L_0x0056;
    L_0x0055:
        r12 = r8;
    L_0x0056:
        if (r9 != 0) goto L_0x0064;
    L_0x0058:
        r8 = a;
        r13 = r8;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        goto L_0x019c;
    L_0x0064:
        r8 = r12 + 1;
        r9 = r1.charAt(r12);
        if (r9 < r7) goto L_0x0083;
    L_0x006c:
        r9 = r9 & 8191;
        r10 = 13;
    L_0x0070:
        r12 = r8 + 1;
        r8 = r1.charAt(r8);
        if (r8 < r7) goto L_0x0080;
    L_0x0078:
        r8 = r8 & 8191;
        r8 = r8 << r10;
        r9 = r9 | r8;
        r10 = r10 + 13;
        r8 = r12;
        goto L_0x0070;
    L_0x0080:
        r8 = r8 << r10;
        r8 = r8 | r9;
        goto L_0x0085;
    L_0x0083:
        r12 = r8;
        r8 = r9;
    L_0x0085:
        r9 = r12 + 1;
        r10 = r1.charAt(r12);
        if (r10 < r7) goto L_0x00a4;
    L_0x008d:
        r10 = r10 & 8191;
        r12 = 13;
    L_0x0091:
        r13 = r9 + 1;
        r9 = r1.charAt(r9);
        if (r9 < r7) goto L_0x00a1;
    L_0x0099:
        r9 = r9 & 8191;
        r9 = r9 << r12;
        r10 = r10 | r9;
        r12 = r12 + 13;
        r9 = r13;
        goto L_0x0091;
    L_0x00a1:
        r9 = r9 << r12;
        r10 = r10 | r9;
        goto L_0x00a5;
    L_0x00a4:
        r13 = r9;
    L_0x00a5:
        r9 = r13 + 1;
        r12 = r1.charAt(r13);
        if (r12 < r7) goto L_0x00c5;
    L_0x00ad:
        r12 = r12 & 8191;
        r13 = 13;
    L_0x00b1:
        r14 = r9 + 1;
        r9 = r1.charAt(r9);
        if (r9 < r7) goto L_0x00c1;
    L_0x00b9:
        r9 = r9 & 8191;
        r9 = r9 << r13;
        r12 = r12 | r9;
        r13 = r13 + 13;
        r9 = r14;
        goto L_0x00b1;
    L_0x00c1:
        r9 = r9 << r13;
        r9 = r9 | r12;
        r12 = r9;
        goto L_0x00c6;
    L_0x00c5:
        r14 = r9;
    L_0x00c6:
        r9 = r14 + 1;
        r13 = r1.charAt(r14);
        if (r13 < r7) goto L_0x00e6;
    L_0x00ce:
        r13 = r13 & 8191;
        r14 = 13;
    L_0x00d2:
        r15 = r9 + 1;
        r9 = r1.charAt(r9);
        if (r9 < r7) goto L_0x00e2;
    L_0x00da:
        r9 = r9 & 8191;
        r9 = r9 << r14;
        r13 = r13 | r9;
        r14 = r14 + 13;
        r9 = r15;
        goto L_0x00d2;
    L_0x00e2:
        r9 = r9 << r14;
        r9 = r9 | r13;
        r13 = r9;
        goto L_0x00e7;
    L_0x00e6:
        r15 = r9;
    L_0x00e7:
        r9 = r15 + 1;
        r14 = r1.charAt(r15);
        if (r14 < r7) goto L_0x0109;
    L_0x00ef:
        r14 = r14 & 8191;
        r15 = 13;
    L_0x00f3:
        r16 = r9 + 1;
        r9 = r1.charAt(r9);
        if (r9 < r7) goto L_0x0104;
    L_0x00fb:
        r9 = r9 & 8191;
        r9 = r9 << r15;
        r14 = r14 | r9;
        r15 = r15 + 13;
        r9 = r16;
        goto L_0x00f3;
    L_0x0104:
        r9 = r9 << r15;
        r9 = r9 | r14;
        r14 = r9;
        r9 = r16;
    L_0x0109:
        r15 = r9 + 1;
        r9 = r1.charAt(r9);
        if (r9 < r7) goto L_0x012c;
    L_0x0111:
        r9 = r9 & 8191;
        r16 = 13;
    L_0x0115:
        r17 = r15 + 1;
        r15 = r1.charAt(r15);
        if (r15 < r7) goto L_0x0127;
    L_0x011d:
        r15 = r15 & 8191;
        r15 = r15 << r16;
        r9 = r9 | r15;
        r16 = r16 + 13;
        r15 = r17;
        goto L_0x0115;
    L_0x0127:
        r15 = r15 << r16;
        r9 = r9 | r15;
        r15 = r17;
    L_0x012c:
        r16 = r15 + 1;
        r15 = r1.charAt(r15);
        if (r15 < r7) goto L_0x015a;
    L_0x0134:
        r15 = r15 & 8191;
        r17 = 13;
        r35 = r16;
        r16 = r15;
        r15 = r35;
    L_0x013e:
        r18 = r15 + 1;
        r15 = r1.charAt(r15);
        if (r15 < r7) goto L_0x0151;
    L_0x0146:
        r15 = r15 & 8191;
        r15 = r15 << r17;
        r16 = r16 | r15;
        r17 = r17 + 13;
        r15 = r18;
        goto L_0x013e;
    L_0x0151:
        r15 = r15 << r17;
        r15 = r16 | r15;
        r16 = r15;
        r15 = r18;
        goto L_0x0160;
    L_0x015a:
        r35 = r16;
        r16 = r15;
        r15 = r35;
    L_0x0160:
        r17 = r15 + 1;
        r15 = r1.charAt(r15);
        if (r15 < r7) goto L_0x018b;
    L_0x0168:
        r15 = r15 & 8191;
        r18 = 13;
        r35 = r17;
        r17 = r15;
        r15 = r35;
    L_0x0172:
        r19 = r15 + 1;
        r15 = r1.charAt(r15);
        if (r15 < r7) goto L_0x0185;
    L_0x017a:
        r15 = r15 & 8191;
        r15 = r15 << r18;
        r17 = r17 | r15;
        r18 = r18 + 13;
        r15 = r19;
        goto L_0x0172;
    L_0x0185:
        r15 = r15 << r18;
        r15 = r17 | r15;
        r17 = r19;
    L_0x018b:
        r18 = r15 + r9;
        r2 = r18 + r16;
        r2 = new int[r2];
        r16 = r8 + r8;
        r10 = r16 + r10;
        r16 = r13;
        r13 = r2;
        r2 = r9;
        r9 = r12;
        r12 = r17;
    L_0x019c:
        r6 = b;
        r3 = r0.c;
        r7 = r0.a;
        r7 = r7.getClass();
        r21 = r10;
        r10 = r14 * 3;
        r10 = new int[r10];
        r14 = r14 + r14;
        r14 = new java.lang.Object[r14];
        r2 = r2 + r15;
        r25 = r2;
        r24 = r15;
        r23 = r21;
        r21 = 0;
        r22 = 0;
    L_0x01ba:
        if (r12 >= r4) goto L_0x0408;
    L_0x01bc:
        r26 = r12 + 1;
        r12 = r1.charAt(r12);
        r27 = r4;
        r4 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r12 < r4) goto L_0x01f0;
    L_0x01c9:
        r12 = r12 & 8191;
        r28 = 13;
        r35 = r26;
        r26 = r12;
        r12 = r35;
    L_0x01d3:
        r29 = r12 + 1;
        r12 = r1.charAt(r12);
        if (r12 < r4) goto L_0x01e9;
    L_0x01db:
        r4 = r12 & 8191;
        r4 = r4 << r28;
        r26 = r26 | r4;
        r28 = r28 + 13;
        r12 = r29;
        r4 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        goto L_0x01d3;
    L_0x01e9:
        r4 = r12 << r28;
        r12 = r26 | r4;
        r4 = r29;
        goto L_0x01f2;
    L_0x01f0:
        r4 = r26;
    L_0x01f2:
        r26 = r4 + 1;
        r4 = r1.charAt(r4);
        r28 = r2;
        r2 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r4 < r2) goto L_0x0226;
    L_0x01ff:
        r4 = r4 & 8191;
        r29 = 13;
        r35 = r26;
        r26 = r4;
        r4 = r35;
    L_0x0209:
        r30 = r4 + 1;
        r4 = r1.charAt(r4);
        if (r4 < r2) goto L_0x021f;
    L_0x0211:
        r2 = r4 & 8191;
        r2 = r2 << r29;
        r26 = r26 | r2;
        r29 = r29 + 13;
        r4 = r30;
        r2 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        goto L_0x0209;
    L_0x021f:
        r2 = r4 << r29;
        r4 = r26 | r2;
        r2 = r30;
        goto L_0x0228;
    L_0x0226:
        r2 = r26;
    L_0x0228:
        r26 = r15;
        r15 = r4 & 255;
        r29 = r11;
        r11 = r4 & 1024;
        if (r11 == 0) goto L_0x0238;
    L_0x0232:
        r11 = r21 + 1;
        r13[r21] = r22;
        r21 = r11;
    L_0x0238:
        r11 = 51;
        if (r15 >= r11) goto L_0x0341;
    L_0x023c:
        r11 = r23 + 1;
        r23 = r3[r23];
        r30 = r9;
        r9 = r23;
        r9 = (java.lang.String) r9;
        r9 = defpackage.anzh.a(r7, r9);
        r0 = 9;
        if (r15 != r0) goto L_0x0253;
    L_0x024e:
        r33 = r4;
        r4 = 1;
        goto L_0x02be;
    L_0x0253:
        r0 = 17;
        if (r15 == r0) goto L_0x024e;
    L_0x0257:
        r0 = 27;
        if (r15 != r0) goto L_0x025f;
    L_0x025b:
        r33 = r4;
        r4 = 1;
        goto L_0x02b0;
    L_0x025f:
        r0 = 49;
        if (r15 == r0) goto L_0x025b;
    L_0x0263:
        r0 = 12;
        if (r15 == r0) goto L_0x029e;
    L_0x0267:
        r0 = 30;
        if (r15 == r0) goto L_0x029e;
    L_0x026b:
        r0 = 44;
        if (r15 == r0) goto L_0x029e;
    L_0x026f:
        r0 = 50;
        if (r15 != r0) goto L_0x029a;
    L_0x0273:
        r0 = r24 + 1;
        r13[r24] = r22;
        r24 = r22 / 3;
        r24 = r24 + r24;
        r31 = r11 + 1;
        r11 = r3[r11];
        r14[r24] = r11;
        r11 = r4 & 2048;
        if (r11 == 0) goto L_0x0292;
    L_0x0285:
        r11 = r31 + 1;
        r24 = r24 + 1;
        r31 = r3[r31];
        r14[r24] = r31;
        r24 = r0;
        r33 = r4;
        goto L_0x02c8;
    L_0x0292:
        r24 = r0;
        r33 = r4;
        r0 = r5;
        r11 = r31;
        goto L_0x02c9;
    L_0x029a:
        r33 = r4;
        r4 = 1;
        goto L_0x02c8;
    L_0x029e:
        r0 = r5 & 1;
        r33 = r4;
        r4 = 1;
        if (r0 != r4) goto L_0x02c8;
    L_0x02a5:
        r0 = r22 / 3;
        r18 = r11 + 1;
        r0 = r0 + r0;
        r0 = r0 + r4;
        r11 = r3[r11];
        r14[r0] = r11;
        goto L_0x02ba;
    L_0x02b0:
        r0 = r22 / 3;
        r18 = r11 + 1;
        r0 = r0 + r0;
        r0 = r0 + r4;
        r11 = r3[r11];
        r14[r0] = r11;
    L_0x02ba:
        r0 = r5;
        r11 = r18;
        goto L_0x02c9;
    L_0x02be:
        r0 = r22 / 3;
        r0 = r0 + r0;
        r0 = r0 + r4;
        r18 = r9.getType();
        r14[r0] = r18;
    L_0x02c8:
        r0 = r5;
    L_0x02c9:
        r4 = r6.objectFieldOffset(r9);
        r5 = (int) r4;
        r4 = r0 & 1;
        r9 = 1;
        if (r4 == r9) goto L_0x02d8;
    L_0x02d3:
        r34 = r8;
        r4 = 0;
        r8 = 0;
        goto L_0x0329;
    L_0x02d8:
        r4 = 17;
        if (r15 > r4) goto L_0x02d3;
    L_0x02dc:
        r4 = r2 + 1;
        r2 = r1.charAt(r2);
        r9 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r2 < r9) goto L_0x0304;
    L_0x02e7:
        r2 = r2 & 8191;
        r31 = 13;
    L_0x02eb:
        r32 = r4 + 1;
        r4 = r1.charAt(r4);
        if (r4 < r9) goto L_0x0300;
    L_0x02f3:
        r4 = r4 & 8191;
        r4 = r4 << r31;
        r2 = r2 | r4;
        r31 = r31 + 13;
        r4 = r32;
        r9 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        goto L_0x02eb;
    L_0x0300:
        r4 = r4 << r31;
        r2 = r2 | r4;
        goto L_0x0306;
    L_0x0304:
        r32 = r4;
    L_0x0306:
        r4 = r8 + r8;
        r9 = r2 / 32;
        r4 = r4 + r9;
        r9 = r3[r4];
        r34 = r8;
        r8 = r9 instanceof java.lang.reflect.Field;
        if (r8 == 0) goto L_0x0316;
    L_0x0313:
        r9 = (java.lang.reflect.Field) r9;
        goto L_0x031e;
    L_0x0316:
        r9 = (java.lang.String) r9;
        r9 = defpackage.anzh.a(r7, r9);
        r3[r4] = r9;
    L_0x031e:
        r8 = r6.objectFieldOffset(r9);
        r4 = (int) r8;
        r2 = r2 % 32;
        r8 = r4;
        r4 = r2;
        r2 = r32;
    L_0x0329:
        r9 = 18;
        if (r15 >= r9) goto L_0x032e;
    L_0x032d:
        goto L_0x0338;
    L_0x032e:
        r9 = 49;
        if (r15 > r9) goto L_0x0338;
    L_0x0332:
        r9 = r25 + 1;
        r13[r25] = r5;
        r25 = r9;
    L_0x0338:
        r23 = r11;
        r35 = r12;
        r12 = r2;
        r2 = r35;
        goto L_0x03cc;
    L_0x0341:
        r33 = r4;
        r0 = r5;
        r34 = r8;
        r30 = r9;
        r4 = r2 + 1;
        r2 = r1.charAt(r2);
        r5 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r2 < r5) goto L_0x036a;
    L_0x0353:
        r2 = r2 & 8191;
        r8 = 13;
    L_0x0357:
        r9 = r4 + 1;
        r4 = r1.charAt(r4);
        if (r4 < r5) goto L_0x0367;
    L_0x035f:
        r4 = r4 & 8191;
        r4 = r4 << r8;
        r2 = r2 | r4;
        r8 = r8 + 13;
        r4 = r9;
        goto L_0x0357;
    L_0x0367:
        r4 = r4 << r8;
        r2 = r2 | r4;
        r4 = r9;
    L_0x036a:
        r8 = r15 + -51;
        r9 = 9;
        if (r8 != r9) goto L_0x0371;
    L_0x0370:
        goto L_0x038c;
    L_0x0371:
        r9 = 17;
        if (r8 == r9) goto L_0x038c;
    L_0x0375:
        r9 = 12;
        if (r8 != r9) goto L_0x038a;
    L_0x0379:
        r8 = r0 & 1;
        r9 = 1;
        if (r8 != r9) goto L_0x038a;
    L_0x037e:
        r8 = r22 / 3;
        r11 = r23 + 1;
        r8 = r8 + r8;
        r8 = r8 + r9;
        r9 = r3[r23];
        r14[r8] = r9;
        r23 = r11;
    L_0x038a:
        r11 = 1;
        goto L_0x0399;
    L_0x038c:
        r8 = r22 / 3;
        r9 = r23 + 1;
        r8 = r8 + r8;
        r11 = 1;
        r8 = r8 + r11;
        r18 = r3[r23];
        r14[r8] = r18;
        r23 = r9;
    L_0x0399:
        r2 = r2 + r2;
        r8 = r3[r2];
        r9 = r8 instanceof java.lang.reflect.Field;
        if (r9 == 0) goto L_0x03a3;
    L_0x03a0:
        r8 = (java.lang.reflect.Field) r8;
        goto L_0x03ab;
    L_0x03a3:
        r8 = (java.lang.String) r8;
        r8 = defpackage.anzh.a(r7, r8);
        r3[r2] = r8;
    L_0x03ab:
        r8 = r6.objectFieldOffset(r8);
        r9 = (int) r8;
        r2 = r2 + 1;
        r8 = r3[r2];
        r5 = r8 instanceof java.lang.reflect.Field;
        if (r5 == 0) goto L_0x03bb;
    L_0x03b8:
        r8 = (java.lang.reflect.Field) r8;
        goto L_0x03c3;
    L_0x03bb:
        r8 = (java.lang.String) r8;
        r8 = defpackage.anzh.a(r7, r8);
        r3[r2] = r8;
    L_0x03c3:
        r2 = r12;
        r11 = r6.objectFieldOffset(r8);
        r8 = (int) r11;
        r12 = r4;
        r5 = r9;
        r4 = 0;
    L_0x03cc:
        r9 = r22 + 1;
        r10[r22] = r2;
        r2 = r9 + 1;
        r22 = r0;
        r11 = r33;
        r0 = r11 & 512;
        if (r0 == 0) goto L_0x03dd;
    L_0x03da:
        r0 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        goto L_0x03de;
    L_0x03dd:
        r0 = 0;
    L_0x03de:
        r11 = r11 & 256;
        if (r11 == 0) goto L_0x03e5;
    L_0x03e2:
        r11 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        goto L_0x03e6;
    L_0x03e5:
        r11 = 0;
    L_0x03e6:
        r0 = r0 | r11;
        r11 = r15 << 20;
        r0 = r0 | r11;
        r0 = r0 | r5;
        r10[r9] = r0;
        r0 = r2 + 1;
        r4 = r4 << 20;
        r4 = r4 | r8;
        r10[r2] = r4;
        r5 = r22;
        r15 = r26;
        r4 = r27;
        r2 = r28;
        r11 = r29;
        r9 = r30;
        r8 = r34;
        r22 = r0;
        r0 = r36;
        goto L_0x01ba;
    L_0x0408:
        r28 = r2;
        r30 = r9;
        r29 = r11;
        r26 = r15;
        r0 = new anzh;
        r1 = r36;
        r1 = r1.a;
        r12 = 0;
        r5 = r0;
        r6 = r10;
        r7 = r14;
        r8 = r30;
        r9 = r16;
        r10 = r1;
        r14 = r26;
        r15 = r28;
        r16 = r37;
        r17 = r38;
        r18 = r39;
        r19 = r40;
        r20 = r41;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anzh.a(anzu, anzm, anyn, aoar, anxc, anyx):anzh");
    }

    private static Field a(Class cls, String str) {
        try {
            cls = cls.getDeclaredField(str);
            return cls;
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder stringBuilder = new StringBuilder(((String.valueOf(str).length() + 40) + name.length()) + String.valueOf(arrays).length());
            stringBuilder.append("Field ");
            stringBuilder.append(str);
            stringBuilder.append(" for ");
            stringBuilder.append(name);
            stringBuilder.append(" not found. Known fields are ");
            stringBuilder.append(arrays);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public final Object a() {
        return this.o.a(this.g);
    }

    public final boolean a(Object obj, Object obj2) {
        int length = this.c.length;
        for (int i = 0; i < length; i += 3) {
            boolean a;
            int e = e(i);
            long i2 = anzh.i(e);
            switch (anzh.g(e)) {
                case 0:
                    if (c(obj, obj2, i) && Double.doubleToLongBits(aoax.e(obj, i2)) == Double.doubleToLongBits(aoax.e(obj2, i2))) {
                        continue;
                    }
                case 1:
                    if (c(obj, obj2, i) && Float.floatToIntBits(aoax.d(obj, i2)) == Float.floatToIntBits(aoax.d(obj2, i2))) {
                        continue;
                    }
                case 2:
                    if (c(obj, obj2, i) && aoax.b(obj, i2) == aoax.b(obj2, i2)) {
                        continue;
                    }
                case 3:
                    if (c(obj, obj2, i) && aoax.b(obj, i2) == aoax.b(obj2, i2)) {
                        continue;
                    }
                case 4:
                    if (c(obj, obj2, i) && aoax.a(obj, i2) == aoax.a(obj2, i2)) {
                        continue;
                    }
                case 5:
                    if (c(obj, obj2, i) && aoax.b(obj, i2) == aoax.b(obj2, i2)) {
                        continue;
                    }
                case 6:
                    if (c(obj, obj2, i) && aoax.a(obj, i2) == aoax.a(obj2, i2)) {
                        continue;
                    }
                case 7:
                    if (c(obj, obj2, i) && aoax.c(obj, i2) == aoax.c(obj2, i2)) {
                        continue;
                    }
                case 8:
                    if (c(obj, obj2, i) && aoab.a(aoax.f(obj, i2), aoax.f(obj2, i2))) {
                        continue;
                    }
                case 9:
                    if (c(obj, obj2, i) && aoab.a(aoax.f(obj, i2), aoax.f(obj2, i2))) {
                        continue;
                    }
                case 10:
                    if (c(obj, obj2, i) && aoab.a(aoax.f(obj, i2), aoax.f(obj2, i2))) {
                        continue;
                    }
                case 11:
                    if (c(obj, obj2, i) && aoax.a(obj, i2) == aoax.a(obj2, i2)) {
                        continue;
                    }
                case 12:
                    if (c(obj, obj2, i) && aoax.a(obj, i2) == aoax.a(obj2, i2)) {
                        continue;
                    }
                case 13:
                    if (c(obj, obj2, i) && aoax.a(obj, i2) == aoax.a(obj2, i2)) {
                        continue;
                    }
                case 14:
                    if (c(obj, obj2, i) && aoax.b(obj, i2) == aoax.b(obj2, i2)) {
                        continue;
                    }
                case 15:
                    if (c(obj, obj2, i) && aoax.a(obj, i2) == aoax.a(obj2, i2)) {
                        continue;
                    }
                case 16:
                    if (c(obj, obj2, i) && aoax.b(obj, i2) == aoax.b(obj2, i2)) {
                        continue;
                    }
                case 17:
                    if (c(obj, obj2, i) && aoab.a(aoax.f(obj, i2), aoax.f(obj2, i2))) {
                        continue;
                    }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case cv.aT /*49*/:
                    a = aoab.a(aoax.f(obj, i2), aoax.f(obj2, i2));
                    break;
                case cv.aU /*50*/:
                    a = aoab.a(aoax.f(obj, i2), aoax.f(obj2, i2));
                    break;
                case cv.aV /*51*/:
                case cv.aW /*52*/:
                case cv.aX /*53*/:
                case cv.aY /*54*/:
                case cv.aZ /*55*/:
                case cv.ba /*56*/:
                case cv.bb /*57*/:
                case 58:
                case cv.bc /*59*/:
                case cv.bd /*60*/:
                case cv.be /*61*/:
                case cv.bf /*62*/:
                case cv.bg /*63*/:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long f = (long) (f(i) & 1048575);
                    if (aoax.a(obj, f) == aoax.a(obj2, f) && aoab.a(aoax.f(obj, i2), aoax.f(obj2, i2))) {
                        continue;
                    }
                default:
                    break;
            }
            if (!a) {
                return false;
            }
        }
        if (this.q.b(obj).equals(this.q.b(obj2))) {
            return this.h ? this.r.a(obj).equals(this.r.a(obj2)) : true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Missing block: B:73:0x01c1, code skipped:
            r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Missing block: B:83:0x0225, code skipped:
            r2 = r2 + r3;
     */
    /* JADX WARNING: Missing block: B:84:0x0226, code skipped:
            r1 = r1 + 3;
     */
    public final int a(java.lang.Object r9) {
        /*
        r8 = this;
        r0 = r8.c;
        r0 = r0.length;
        r1 = 0;
        r2 = 0;
    L_0x0005:
        if (r1 >= r0) goto L_0x022a;
    L_0x0007:
        r3 = r8.e(r1);
        r4 = r8.d(r1);
        r5 = defpackage.anzh.i(r3);
        r3 = defpackage.anzh.g(r3);
        r7 = 37;
        switch(r3) {
            case 0: goto L_0x0217;
            case 1: goto L_0x020c;
            case 2: goto L_0x0201;
            case 3: goto L_0x01f6;
            case 4: goto L_0x01ef;
            case 5: goto L_0x01e4;
            case 6: goto L_0x01dd;
            case 7: goto L_0x01d2;
            case 8: goto L_0x01c5;
            case 9: goto L_0x01b7;
            case 10: goto L_0x01ab;
            case 11: goto L_0x01a3;
            case 12: goto L_0x019b;
            case 13: goto L_0x0193;
            case 14: goto L_0x0187;
            case 15: goto L_0x017f;
            case 16: goto L_0x0173;
            case 17: goto L_0x0168;
            case 18: goto L_0x015c;
            case 19: goto L_0x015c;
            case 20: goto L_0x015c;
            case 21: goto L_0x015c;
            case 22: goto L_0x015c;
            case 23: goto L_0x015c;
            case 24: goto L_0x015c;
            case 25: goto L_0x015c;
            case 26: goto L_0x015c;
            case 27: goto L_0x015c;
            case 28: goto L_0x015c;
            case 29: goto L_0x015c;
            case 30: goto L_0x015c;
            case 31: goto L_0x015c;
            case 32: goto L_0x015c;
            case 33: goto L_0x015c;
            case 34: goto L_0x015c;
            case 35: goto L_0x015c;
            case 36: goto L_0x015c;
            case 37: goto L_0x015c;
            case 38: goto L_0x015c;
            case 39: goto L_0x015c;
            case 40: goto L_0x015c;
            case 41: goto L_0x015c;
            case 42: goto L_0x015c;
            case 43: goto L_0x015c;
            case 44: goto L_0x015c;
            case 45: goto L_0x015c;
            case 46: goto L_0x015c;
            case 47: goto L_0x015c;
            case 48: goto L_0x015c;
            case 49: goto L_0x015c;
            case 50: goto L_0x0150;
            case 51: goto L_0x013a;
            case 52: goto L_0x0128;
            case 53: goto L_0x0116;
            case 54: goto L_0x0104;
            case 55: goto L_0x00f6;
            case 56: goto L_0x00e4;
            case 57: goto L_0x00d6;
            case 58: goto L_0x00c4;
            case 59: goto L_0x00b0;
            case 60: goto L_0x009e;
            case 61: goto L_0x008c;
            case 62: goto L_0x007e;
            case 63: goto L_0x0070;
            case 64: goto L_0x0062;
            case 65: goto L_0x0050;
            case 66: goto L_0x0042;
            case 67: goto L_0x0030;
            case 68: goto L_0x001e;
            default: goto L_0x001c;
        };
    L_0x001c:
        goto L_0x0226;
    L_0x001e:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0226;
    L_0x0024:
        r2 = r2 * 53;
        r3 = defpackage.aoax.f(r9, r5);
        r3 = r3.hashCode();
        goto L_0x0225;
    L_0x0030:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0226;
    L_0x0036:
        r2 = r2 * 53;
        r3 = defpackage.anzh.e(r9, r5);
        r3 = defpackage.anxw.a(r3);
        goto L_0x0225;
    L_0x0042:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0226;
    L_0x0048:
        r2 = r2 * 53;
        r3 = defpackage.anzh.d(r9, r5);
        goto L_0x0225;
    L_0x0050:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0226;
    L_0x0056:
        r2 = r2 * 53;
        r3 = defpackage.anzh.e(r9, r5);
        r3 = defpackage.anxw.a(r3);
        goto L_0x0225;
    L_0x0062:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0226;
    L_0x0068:
        r2 = r2 * 53;
        r3 = defpackage.anzh.d(r9, r5);
        goto L_0x0225;
    L_0x0070:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0226;
    L_0x0076:
        r2 = r2 * 53;
        r3 = defpackage.anzh.d(r9, r5);
        goto L_0x0225;
    L_0x007e:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0226;
    L_0x0084:
        r2 = r2 * 53;
        r3 = defpackage.anzh.d(r9, r5);
        goto L_0x0225;
    L_0x008c:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0226;
    L_0x0092:
        r2 = r2 * 53;
        r3 = defpackage.aoax.f(r9, r5);
        r3 = r3.hashCode();
        goto L_0x0225;
    L_0x009e:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0226;
    L_0x00a4:
        r2 = r2 * 53;
        r3 = defpackage.aoax.f(r9, r5);
        r3 = r3.hashCode();
        goto L_0x0225;
    L_0x00b0:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0226;
    L_0x00b6:
        r2 = r2 * 53;
        r3 = defpackage.aoax.f(r9, r5);
        r3 = (java.lang.String) r3;
        r3 = r3.hashCode();
        goto L_0x0225;
    L_0x00c4:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0226;
    L_0x00ca:
        r2 = r2 * 53;
        r3 = defpackage.anzh.f(r9, r5);
        r3 = defpackage.anxw.a(r3);
        goto L_0x0225;
    L_0x00d6:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0226;
    L_0x00dc:
        r2 = r2 * 53;
        r3 = defpackage.anzh.d(r9, r5);
        goto L_0x0225;
    L_0x00e4:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0226;
    L_0x00ea:
        r2 = r2 * 53;
        r3 = defpackage.anzh.e(r9, r5);
        r3 = defpackage.anxw.a(r3);
        goto L_0x0225;
    L_0x00f6:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0226;
    L_0x00fc:
        r2 = r2 * 53;
        r3 = defpackage.anzh.d(r9, r5);
        goto L_0x0225;
    L_0x0104:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0226;
    L_0x010a:
        r2 = r2 * 53;
        r3 = defpackage.anzh.e(r9, r5);
        r3 = defpackage.anxw.a(r3);
        goto L_0x0225;
    L_0x0116:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0226;
    L_0x011c:
        r2 = r2 * 53;
        r3 = defpackage.anzh.e(r9, r5);
        r3 = defpackage.anxw.a(r3);
        goto L_0x0225;
    L_0x0128:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0226;
    L_0x012e:
        r2 = r2 * 53;
        r3 = defpackage.anzh.c(r9, r5);
        r3 = java.lang.Float.floatToIntBits(r3);
        goto L_0x0225;
    L_0x013a:
        r3 = r8.a(r9, r4, r1);
        if (r3 == 0) goto L_0x0226;
    L_0x0140:
        r2 = r2 * 53;
        r3 = defpackage.anzh.b(r9, r5);
        r3 = java.lang.Double.doubleToLongBits(r3);
        r3 = defpackage.anxw.a(r3);
        goto L_0x0225;
    L_0x0150:
        r2 = r2 * 53;
        r3 = defpackage.aoax.f(r9, r5);
        r3 = r3.hashCode();
        goto L_0x0225;
    L_0x015c:
        r2 = r2 * 53;
        r3 = defpackage.aoax.f(r9, r5);
        r3 = r3.hashCode();
        goto L_0x0225;
    L_0x0168:
        r3 = defpackage.aoax.f(r9, r5);
        if (r3 == 0) goto L_0x01c1;
    L_0x016e:
        r7 = r3.hashCode();
        goto L_0x01c1;
    L_0x0173:
        r2 = r2 * 53;
        r3 = defpackage.aoax.b(r9, r5);
        r3 = defpackage.anxw.a(r3);
        goto L_0x0225;
    L_0x017f:
        r2 = r2 * 53;
        r3 = defpackage.aoax.a(r9, r5);
        goto L_0x0225;
    L_0x0187:
        r2 = r2 * 53;
        r3 = defpackage.aoax.b(r9, r5);
        r3 = defpackage.anxw.a(r3);
        goto L_0x0225;
    L_0x0193:
        r2 = r2 * 53;
        r3 = defpackage.aoax.a(r9, r5);
        goto L_0x0225;
    L_0x019b:
        r2 = r2 * 53;
        r3 = defpackage.aoax.a(r9, r5);
        goto L_0x0225;
    L_0x01a3:
        r2 = r2 * 53;
        r3 = defpackage.aoax.a(r9, r5);
        goto L_0x0225;
    L_0x01ab:
        r2 = r2 * 53;
        r3 = defpackage.aoax.f(r9, r5);
        r3 = r3.hashCode();
        goto L_0x0225;
    L_0x01b7:
        r3 = defpackage.aoax.f(r9, r5);
        if (r3 == 0) goto L_0x01c1;
    L_0x01bd:
        r7 = r3.hashCode();
    L_0x01c1:
        r2 = r2 * 53;
        r2 = r2 + r7;
        goto L_0x0226;
    L_0x01c5:
        r2 = r2 * 53;
        r3 = defpackage.aoax.f(r9, r5);
        r3 = (java.lang.String) r3;
        r3 = r3.hashCode();
        goto L_0x0225;
    L_0x01d2:
        r2 = r2 * 53;
        r3 = defpackage.aoax.c(r9, r5);
        r3 = defpackage.anxw.a(r3);
        goto L_0x0225;
    L_0x01dd:
        r2 = r2 * 53;
        r3 = defpackage.aoax.a(r9, r5);
        goto L_0x0225;
    L_0x01e4:
        r2 = r2 * 53;
        r3 = defpackage.aoax.b(r9, r5);
        r3 = defpackage.anxw.a(r3);
        goto L_0x0225;
    L_0x01ef:
        r2 = r2 * 53;
        r3 = defpackage.aoax.a(r9, r5);
        goto L_0x0225;
    L_0x01f6:
        r2 = r2 * 53;
        r3 = defpackage.aoax.b(r9, r5);
        r3 = defpackage.anxw.a(r3);
        goto L_0x0225;
    L_0x0201:
        r2 = r2 * 53;
        r3 = defpackage.aoax.b(r9, r5);
        r3 = defpackage.anxw.a(r3);
        goto L_0x0225;
    L_0x020c:
        r2 = r2 * 53;
        r3 = defpackage.aoax.d(r9, r5);
        r3 = java.lang.Float.floatToIntBits(r3);
        goto L_0x0225;
    L_0x0217:
        r2 = r2 * 53;
        r3 = defpackage.aoax.e(r9, r5);
        r3 = java.lang.Double.doubleToLongBits(r3);
        r3 = defpackage.anxw.a(r3);
    L_0x0225:
        r2 = r2 + r3;
    L_0x0226:
        r1 = r1 + 3;
        goto L_0x0005;
    L_0x022a:
        r2 = r2 * 53;
        r0 = r8.q;
        r0 = r0.b(r9);
        r0 = r0.hashCode();
        r2 = r2 + r0;
        r0 = r8.h;
        if (r0 == 0) goto L_0x0248;
    L_0x023b:
        r2 = r2 * 53;
        r0 = r8.r;
        r9 = r0.a(r9);
        r9 = r9.hashCode();
        r2 = r2 + r9;
    L_0x0248:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anzh.a(java.lang.Object):int");
    }

    public final void b(Object obj, Object obj2) {
        if (obj2 != null) {
            for (int i = 0; i < this.c.length; i += 3) {
                int e = e(i);
                long i2 = anzh.i(e);
                int d = d(i);
                switch (anzh.g(e)) {
                    case 0:
                        if (!a(obj2, i)) {
                            break;
                        }
                        aoax.a(obj, i2, aoax.e(obj2, i2));
                        b(obj, i);
                        break;
                    case 1:
                        if (!a(obj2, i)) {
                            break;
                        }
                        aoax.a(obj, i2, aoax.d(obj2, i2));
                        b(obj, i);
                        break;
                    case 2:
                        if (!a(obj2, i)) {
                            break;
                        }
                        aoax.a(obj, i2, aoax.b(obj2, i2));
                        b(obj, i);
                        break;
                    case 3:
                        if (!a(obj2, i)) {
                            break;
                        }
                        aoax.a(obj, i2, aoax.b(obj2, i2));
                        b(obj, i);
                        break;
                    case 4:
                        if (!a(obj2, i)) {
                            break;
                        }
                        aoax.a(obj, i2, aoax.a(obj2, i2));
                        b(obj, i);
                        break;
                    case 5:
                        if (!a(obj2, i)) {
                            break;
                        }
                        aoax.a(obj, i2, aoax.b(obj2, i2));
                        b(obj, i);
                        break;
                    case 6:
                        if (!a(obj2, i)) {
                            break;
                        }
                        aoax.a(obj, i2, aoax.a(obj2, i2));
                        b(obj, i);
                        break;
                    case 7:
                        if (!a(obj2, i)) {
                            break;
                        }
                        aoax.a(obj, i2, aoax.c(obj2, i2));
                        b(obj, i);
                        break;
                    case 8:
                        if (!a(obj2, i)) {
                            break;
                        }
                        aoax.a(obj, i2, aoax.f(obj2, i2));
                        b(obj, i);
                        break;
                    case 9:
                        a(obj, obj2, i);
                        break;
                    case 10:
                        if (!a(obj2, i)) {
                            break;
                        }
                        aoax.a(obj, i2, aoax.f(obj2, i2));
                        b(obj, i);
                        break;
                    case 11:
                        if (!a(obj2, i)) {
                            break;
                        }
                        aoax.a(obj, i2, aoax.a(obj2, i2));
                        b(obj, i);
                        break;
                    case 12:
                        if (!a(obj2, i)) {
                            break;
                        }
                        aoax.a(obj, i2, aoax.a(obj2, i2));
                        b(obj, i);
                        break;
                    case 13:
                        if (!a(obj2, i)) {
                            break;
                        }
                        aoax.a(obj, i2, aoax.a(obj2, i2));
                        b(obj, i);
                        break;
                    case 14:
                        if (!a(obj2, i)) {
                            break;
                        }
                        aoax.a(obj, i2, aoax.b(obj2, i2));
                        b(obj, i);
                        break;
                    case 15:
                        if (!a(obj2, i)) {
                            break;
                        }
                        aoax.a(obj, i2, aoax.a(obj2, i2));
                        b(obj, i);
                        break;
                    case 16:
                        if (!a(obj2, i)) {
                            break;
                        }
                        aoax.a(obj, i2, aoax.b(obj2, i2));
                        b(obj, i);
                        break;
                    case 17:
                        a(obj, obj2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case cv.aT /*49*/:
                        this.p.a(obj, obj2, i2);
                        break;
                    case cv.aU /*50*/:
                        aoab.a(this.s, obj, obj2, i2);
                        break;
                    case cv.aV /*51*/:
                    case cv.aW /*52*/:
                    case cv.aX /*53*/:
                    case cv.aY /*54*/:
                    case cv.aZ /*55*/:
                    case cv.ba /*56*/:
                    case cv.bb /*57*/:
                    case 58:
                    case cv.bc /*59*/:
                        if (!a(obj2, d, i)) {
                            break;
                        }
                        aoax.a(obj, i2, aoax.f(obj2, i2));
                        b(obj, d, i);
                        break;
                    case cv.bd /*60*/:
                        b(obj, obj2, i);
                        break;
                    case cv.be /*61*/:
                    case cv.bf /*62*/:
                    case cv.bg /*63*/:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!a(obj2, d, i)) {
                            break;
                        }
                        aoax.a(obj, i2, aoax.f(obj2, i2));
                        b(obj, d, i);
                        break;
                    case 68:
                        b(obj, obj2, i);
                        break;
                    default:
                        break;
                }
            }
            if (!this.j) {
                aoab.a(this.q, obj, obj2);
                if (this.h) {
                    aoab.a(this.r, obj, obj2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    private final void a(Object obj, Object obj2, int i) {
        long i2 = anzh.i(e(i));
        if (a(obj2, i)) {
            Object f = aoax.f(obj, i2);
            obj2 = aoax.f(obj2, i2);
            if (f != null && obj2 != null) {
                aoax.a(obj, i2, anxw.a(f, obj2));
                b(obj, i);
            } else if (obj2 != null) {
                aoax.a(obj, i2, obj2);
                b(obj, i);
            }
        }
    }

    private final void b(Object obj, Object obj2, int i) {
        int e = e(i);
        int d = d(i);
        long i2 = anzh.i(e);
        if (a(obj2, d, i)) {
            Object f = aoax.f(obj, i2);
            obj2 = aoax.f(obj2, i2);
            if (f != null && obj2 != null) {
                aoax.a(obj, i2, anxw.a(f, obj2));
                b(obj, d, i);
            } else if (obj2 != null) {
                aoax.a(obj, i2, obj2);
                b(obj, d, i);
            }
        }
    }

    public final int b(Object obj) {
        return !this.j ? e(obj) : f(obj);
    }

    /* JADX WARNING: Missing block: B:162:0x0337, code skipped:
            r3 = r3 + ((r7 + r8) + r6);
     */
    private final int e(java.lang.Object r15) {
        /*
        r14 = this;
        r0 = b;
        r1 = 0;
        r2 = -1;
        r2 = 0;
        r3 = 0;
        r4 = -1;
        r5 = 0;
    L_0x0008:
        r6 = r14.c;
        r6 = r6.length;
        if (r2 >= r6) goto L_0x04fb;
    L_0x000d:
        r6 = r14.e(r2);
        r7 = r14.d(r2);
        r8 = defpackage.anzh.g(r6);
        r9 = 17;
        r10 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        if (r8 > r9) goto L_0x0035;
    L_0x0020:
        r9 = r14.c;
        r11 = r2 + 2;
        r9 = r9[r11];
        r10 = r10 & r9;
        r11 = r9 >>> 20;
        r12 = 1;
        r11 = r12 << r11;
        if (r10 == r4) goto L_0x0051;
    L_0x002e:
        r4 = (long) r10;
        r5 = r0.getInt(r15, r4);
        r4 = r10;
        goto L_0x0051;
    L_0x0035:
        r9 = r14.k;
        if (r9 == 0) goto L_0x004f;
    L_0x0039:
        r9 = defpackage.anxi.DOUBLE_LIST_PACKED;
        r9 = r9.d;
        if (r8 >= r9) goto L_0x0040;
    L_0x003f:
        goto L_0x004f;
    L_0x0040:
        r9 = defpackage.anxi.SINT64_LIST_PACKED;
        r9 = r9.d;
        if (r8 <= r9) goto L_0x0047;
    L_0x0046:
        goto L_0x004f;
    L_0x0047:
        r9 = r14.c;
        r11 = r2 + 2;
        r9 = r9[r11];
        r9 = r9 & r10;
        goto L_0x0050;
    L_0x004f:
        r9 = 0;
    L_0x0050:
        r11 = 0;
    L_0x0051:
        r12 = defpackage.anzh.i(r6);
        switch(r8) {
            case 0: goto L_0x04ed;
            case 1: goto L_0x04e3;
            case 2: goto L_0x04d5;
            case 3: goto L_0x04c7;
            case 4: goto L_0x04b9;
            case 5: goto L_0x04af;
            case 6: goto L_0x04a5;
            case 7: goto L_0x049b;
            case 8: goto L_0x047f;
            case 9: goto L_0x046e;
            case 10: goto L_0x045f;
            case 11: goto L_0x0452;
            case 12: goto L_0x0445;
            case 13: goto L_0x043c;
            case 14: goto L_0x0433;
            case 15: goto L_0x0426;
            case 16: goto L_0x0419;
            case 17: goto L_0x0404;
            case 18: goto L_0x03f7;
            case 19: goto L_0x03ec;
            case 20: goto L_0x03e1;
            case 21: goto L_0x03d6;
            case 22: goto L_0x03cb;
            case 23: goto L_0x03c0;
            case 24: goto L_0x03b5;
            case 25: goto L_0x03aa;
            case 26: goto L_0x039f;
            case 27: goto L_0x0390;
            case 28: goto L_0x0384;
            case 29: goto L_0x0378;
            case 30: goto L_0x036c;
            case 31: goto L_0x0360;
            case 32: goto L_0x0354;
            case 33: goto L_0x0348;
            case 34: goto L_0x033c;
            case 35: goto L_0x031b;
            case 36: goto L_0x02fe;
            case 37: goto L_0x02e1;
            case 38: goto L_0x02c4;
            case 39: goto L_0x02a6;
            case 40: goto L_0x0288;
            case 41: goto L_0x026a;
            case 42: goto L_0x024c;
            case 43: goto L_0x022e;
            case 44: goto L_0x0210;
            case 45: goto L_0x01f2;
            case 46: goto L_0x01d4;
            case 47: goto L_0x01b6;
            case 48: goto L_0x0198;
            case 49: goto L_0x0188;
            case 50: goto L_0x0178;
            case 51: goto L_0x016c;
            case 52: goto L_0x0160;
            case 53: goto L_0x0150;
            case 54: goto L_0x0140;
            case 55: goto L_0x0130;
            case 56: goto L_0x0124;
            case 57: goto L_0x0118;
            case 58: goto L_0x010c;
            case 59: goto L_0x00ee;
            case 60: goto L_0x00da;
            case 61: goto L_0x00c8;
            case 62: goto L_0x00b8;
            case 63: goto L_0x00a8;
            case 64: goto L_0x009c;
            case 65: goto L_0x0090;
            case 66: goto L_0x0080;
            case 67: goto L_0x0070;
            case 68: goto L_0x005a;
            default: goto L_0x0058;
        };
    L_0x0058:
        goto L_0x04f7;
    L_0x005a:
        r6 = r14.a(r15, r7, r2);
        if (r6 == 0) goto L_0x04f7;
    L_0x0060:
        r6 = r0.getObject(r15, r12);
        r6 = (defpackage.anze) r6;
        r8 = r14.a(r2);
        r6 = defpackage.anwm.b(r7, r6, r8);
        goto L_0x0401;
    L_0x0070:
        r6 = r14.a(r15, r7, r2);
        if (r6 == 0) goto L_0x04f7;
    L_0x0076:
        r8 = defpackage.anzh.e(r15, r12);
        r6 = defpackage.anwm.f(r7, r8);
        goto L_0x0401;
    L_0x0080:
        r6 = r14.a(r15, r7, r2);
        if (r6 == 0) goto L_0x04f7;
    L_0x0086:
        r6 = defpackage.anzh.d(r15, r12);
        r6 = defpackage.anwm.i(r7, r6);
        goto L_0x0401;
    L_0x0090:
        r6 = r14.a(r15, r7, r2);
        if (r6 == 0) goto L_0x04f7;
    L_0x0096:
        r6 = defpackage.anwm.k(r7);
        goto L_0x0401;
    L_0x009c:
        r6 = r14.a(r15, r7, r2);
        if (r6 == 0) goto L_0x04f7;
    L_0x00a2:
        r6 = defpackage.anwm.i(r7);
        goto L_0x0401;
    L_0x00a8:
        r6 = r14.a(r15, r7, r2);
        if (r6 == 0) goto L_0x04f7;
    L_0x00ae:
        r6 = defpackage.anzh.d(r15, r12);
        r6 = defpackage.anwm.j(r7, r6);
        goto L_0x0401;
    L_0x00b8:
        r6 = r14.a(r15, r7, r2);
        if (r6 == 0) goto L_0x04f7;
    L_0x00be:
        r6 = defpackage.anzh.d(r15, r12);
        r6 = defpackage.anwm.h(r7, r6);
        goto L_0x0401;
    L_0x00c8:
        r6 = r14.a(r15, r7, r2);
        if (r6 == 0) goto L_0x04f7;
    L_0x00ce:
        r6 = r0.getObject(r15, r12);
        r6 = (defpackage.anvu) r6;
        r6 = defpackage.anwm.c(r7, r6);
        goto L_0x0401;
    L_0x00da:
        r6 = r14.a(r15, r7, r2);
        if (r6 == 0) goto L_0x04f7;
    L_0x00e0:
        r6 = r0.getObject(r15, r12);
        r8 = r14.a(r2);
        r6 = defpackage.aoab.a(r7, r6, r8);
        goto L_0x0401;
    L_0x00ee:
        r6 = r14.a(r15, r7, r2);
        if (r6 == 0) goto L_0x04f7;
    L_0x00f4:
        r6 = r0.getObject(r15, r12);
        r8 = r6 instanceof defpackage.anvu;
        if (r8 == 0) goto L_0x0104;
    L_0x00fc:
        r6 = (defpackage.anvu) r6;
        r6 = defpackage.anwm.c(r7, r6);
        goto L_0x0401;
    L_0x0104:
        r6 = (java.lang.String) r6;
        r6 = defpackage.anwm.b(r7, r6);
        goto L_0x0401;
    L_0x010c:
        r6 = r14.a(r15, r7, r2);
        if (r6 == 0) goto L_0x04f7;
    L_0x0112:
        r6 = defpackage.anwm.n(r7);
        goto L_0x0401;
    L_0x0118:
        r6 = r14.a(r15, r7, r2);
        if (r6 == 0) goto L_0x04f7;
    L_0x011e:
        r6 = defpackage.anwm.h(r7);
        goto L_0x0401;
    L_0x0124:
        r6 = r14.a(r15, r7, r2);
        if (r6 == 0) goto L_0x04f7;
    L_0x012a:
        r6 = defpackage.anwm.j(r7);
        goto L_0x0401;
    L_0x0130:
        r6 = r14.a(r15, r7, r2);
        if (r6 == 0) goto L_0x04f7;
    L_0x0136:
        r6 = defpackage.anzh.d(r15, r12);
        r6 = defpackage.anwm.g(r7, r6);
        goto L_0x0401;
    L_0x0140:
        r6 = r14.a(r15, r7, r2);
        if (r6 == 0) goto L_0x04f7;
    L_0x0146:
        r8 = defpackage.anzh.e(r15, r12);
        r6 = defpackage.anwm.e(r7, r8);
        goto L_0x0401;
    L_0x0150:
        r6 = r14.a(r15, r7, r2);
        if (r6 == 0) goto L_0x04f7;
    L_0x0156:
        r8 = defpackage.anzh.e(r15, r12);
        r6 = defpackage.anwm.d(r7, r8);
        goto L_0x0401;
    L_0x0160:
        r6 = r14.a(r15, r7, r2);
        if (r6 == 0) goto L_0x04f7;
    L_0x0166:
        r6 = defpackage.anwm.l(r7);
        goto L_0x0401;
    L_0x016c:
        r6 = r14.a(r15, r7, r2);
        if (r6 == 0) goto L_0x04f7;
    L_0x0172:
        r6 = defpackage.anwm.m(r7);
        goto L_0x0401;
    L_0x0178:
        r6 = r14.s;
        r8 = r0.getObject(r15, r12);
        r9 = r14.b(r2);
        r6 = r6.a(r7, r8, r9);
        goto L_0x0401;
    L_0x0188:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r8 = r14.a(r2);
        r6 = defpackage.aoab.b(r7, r6, r8);
        goto L_0x0401;
    L_0x0198:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.c(r6);
        if (r6 <= 0) goto L_0x04f7;
    L_0x01a4:
        r8 = r14.k;
        if (r8 == 0) goto L_0x01ac;
    L_0x01a8:
        r8 = (long) r9;
        r0.putInt(r15, r8, r6);
    L_0x01ac:
        r7 = defpackage.anwm.o(r7);
        r8 = defpackage.anwm.q(r6);
        goto L_0x0337;
    L_0x01b6:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.g(r6);
        if (r6 <= 0) goto L_0x04f7;
    L_0x01c2:
        r8 = r14.k;
        if (r8 == 0) goto L_0x01ca;
    L_0x01c6:
        r8 = (long) r9;
        r0.putInt(r15, r8, r6);
    L_0x01ca:
        r7 = defpackage.anwm.o(r7);
        r8 = defpackage.anwm.q(r6);
        goto L_0x0337;
    L_0x01d4:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.i(r6);
        if (r6 <= 0) goto L_0x04f7;
    L_0x01e0:
        r8 = r14.k;
        if (r8 == 0) goto L_0x01e8;
    L_0x01e4:
        r8 = (long) r9;
        r0.putInt(r15, r8, r6);
    L_0x01e8:
        r7 = defpackage.anwm.o(r7);
        r8 = defpackage.anwm.q(r6);
        goto L_0x0337;
    L_0x01f2:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.h(r6);
        if (r6 <= 0) goto L_0x04f7;
    L_0x01fe:
        r8 = r14.k;
        if (r8 == 0) goto L_0x0206;
    L_0x0202:
        r8 = (long) r9;
        r0.putInt(r15, r8, r6);
    L_0x0206:
        r7 = defpackage.anwm.o(r7);
        r8 = defpackage.anwm.q(r6);
        goto L_0x0337;
    L_0x0210:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.d(r6);
        if (r6 <= 0) goto L_0x04f7;
    L_0x021c:
        r8 = r14.k;
        if (r8 == 0) goto L_0x0224;
    L_0x0220:
        r8 = (long) r9;
        r0.putInt(r15, r8, r6);
    L_0x0224:
        r7 = defpackage.anwm.o(r7);
        r8 = defpackage.anwm.q(r6);
        goto L_0x0337;
    L_0x022e:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.f(r6);
        if (r6 <= 0) goto L_0x04f7;
    L_0x023a:
        r8 = r14.k;
        if (r8 == 0) goto L_0x0242;
    L_0x023e:
        r8 = (long) r9;
        r0.putInt(r15, r8, r6);
    L_0x0242:
        r7 = defpackage.anwm.o(r7);
        r8 = defpackage.anwm.q(r6);
        goto L_0x0337;
    L_0x024c:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.j(r6);
        if (r6 <= 0) goto L_0x04f7;
    L_0x0258:
        r8 = r14.k;
        if (r8 == 0) goto L_0x0260;
    L_0x025c:
        r8 = (long) r9;
        r0.putInt(r15, r8, r6);
    L_0x0260:
        r7 = defpackage.anwm.o(r7);
        r8 = defpackage.anwm.q(r6);
        goto L_0x0337;
    L_0x026a:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.h(r6);
        if (r6 <= 0) goto L_0x04f7;
    L_0x0276:
        r8 = r14.k;
        if (r8 == 0) goto L_0x027e;
    L_0x027a:
        r8 = (long) r9;
        r0.putInt(r15, r8, r6);
    L_0x027e:
        r7 = defpackage.anwm.o(r7);
        r8 = defpackage.anwm.q(r6);
        goto L_0x0337;
    L_0x0288:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.i(r6);
        if (r6 <= 0) goto L_0x04f7;
    L_0x0294:
        r8 = r14.k;
        if (r8 == 0) goto L_0x029c;
    L_0x0298:
        r8 = (long) r9;
        r0.putInt(r15, r8, r6);
    L_0x029c:
        r7 = defpackage.anwm.o(r7);
        r8 = defpackage.anwm.q(r6);
        goto L_0x0337;
    L_0x02a6:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.e(r6);
        if (r6 <= 0) goto L_0x04f7;
    L_0x02b2:
        r8 = r14.k;
        if (r8 == 0) goto L_0x02ba;
    L_0x02b6:
        r8 = (long) r9;
        r0.putInt(r15, r8, r6);
    L_0x02ba:
        r7 = defpackage.anwm.o(r7);
        r8 = defpackage.anwm.q(r6);
        goto L_0x0337;
    L_0x02c4:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.b(r6);
        if (r6 <= 0) goto L_0x04f7;
    L_0x02d0:
        r8 = r14.k;
        if (r8 == 0) goto L_0x02d8;
    L_0x02d4:
        r8 = (long) r9;
        r0.putInt(r15, r8, r6);
    L_0x02d8:
        r7 = defpackage.anwm.o(r7);
        r8 = defpackage.anwm.q(r6);
        goto L_0x0337;
    L_0x02e1:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.a(r6);
        if (r6 <= 0) goto L_0x04f7;
    L_0x02ed:
        r8 = r14.k;
        if (r8 == 0) goto L_0x02f5;
    L_0x02f1:
        r8 = (long) r9;
        r0.putInt(r15, r8, r6);
    L_0x02f5:
        r7 = defpackage.anwm.o(r7);
        r8 = defpackage.anwm.q(r6);
        goto L_0x0337;
    L_0x02fe:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.h(r6);
        if (r6 <= 0) goto L_0x04f7;
    L_0x030a:
        r8 = r14.k;
        if (r8 == 0) goto L_0x0312;
    L_0x030e:
        r8 = (long) r9;
        r0.putInt(r15, r8, r6);
    L_0x0312:
        r7 = defpackage.anwm.o(r7);
        r8 = defpackage.anwm.q(r6);
        goto L_0x0337;
    L_0x031b:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.i(r6);
        if (r6 <= 0) goto L_0x04f7;
    L_0x0327:
        r8 = r14.k;
        if (r8 == 0) goto L_0x032f;
    L_0x032b:
        r8 = (long) r9;
        r0.putInt(r15, r8, r6);
    L_0x032f:
        r7 = defpackage.anwm.o(r7);
        r8 = defpackage.anwm.q(r6);
    L_0x0337:
        r7 = r7 + r8;
        r7 = r7 + r6;
        r3 = r3 + r7;
        goto L_0x04f7;
    L_0x033c:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.c(r7, r6);
        goto L_0x0401;
    L_0x0348:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.g(r7, r6);
        goto L_0x0401;
    L_0x0354:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.i(r7, r6);
        goto L_0x0401;
    L_0x0360:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.h(r7, r6);
        goto L_0x0401;
    L_0x036c:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.d(r7, r6);
        goto L_0x0401;
    L_0x0378:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.f(r7, r6);
        goto L_0x0401;
    L_0x0384:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.l(r7, r6);
        goto L_0x0401;
    L_0x0390:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r8 = r14.a(r2);
        r6 = defpackage.aoab.a(r7, r6, r8);
        goto L_0x0401;
    L_0x039f:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.k(r7, r6);
        goto L_0x0401;
    L_0x03aa:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.j(r7, r6);
        goto L_0x0401;
    L_0x03b5:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.h(r7, r6);
        goto L_0x0401;
    L_0x03c0:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.i(r7, r6);
        goto L_0x0401;
    L_0x03cb:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.e(r7, r6);
        goto L_0x0401;
    L_0x03d6:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.b(r7, r6);
        goto L_0x0401;
    L_0x03e1:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.a(r7, r6);
        goto L_0x0401;
    L_0x03ec:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.h(r7, r6);
        goto L_0x0401;
    L_0x03f7:
        r6 = r0.getObject(r15, r12);
        r6 = (java.util.List) r6;
        r6 = defpackage.aoab.i(r7, r6);
    L_0x0401:
        r3 = r3 + r6;
        goto L_0x04f7;
    L_0x0404:
        r6 = r5 & r11;
        if (r6 != 0) goto L_0x040a;
    L_0x0408:
        goto L_0x04f7;
    L_0x040a:
        r6 = r0.getObject(r15, r12);
        r6 = (defpackage.anze) r6;
        r8 = r14.a(r2);
        r6 = defpackage.anwm.b(r7, r6, r8);
        goto L_0x0401;
    L_0x0419:
        r6 = r5 & r11;
        if (r6 == 0) goto L_0x04f7;
    L_0x041d:
        r8 = r0.getLong(r15, r12);
        r6 = defpackage.anwm.f(r7, r8);
        goto L_0x0401;
    L_0x0426:
        r6 = r5 & r11;
        if (r6 == 0) goto L_0x04f7;
    L_0x042a:
        r6 = r0.getInt(r15, r12);
        r6 = defpackage.anwm.i(r7, r6);
        goto L_0x0401;
    L_0x0433:
        r6 = r5 & r11;
        if (r6 == 0) goto L_0x04f7;
    L_0x0437:
        r6 = defpackage.anwm.k(r7);
        goto L_0x0401;
    L_0x043c:
        r6 = r5 & r11;
        if (r6 == 0) goto L_0x04f7;
    L_0x0440:
        r6 = defpackage.anwm.i(r7);
        goto L_0x0401;
    L_0x0445:
        r6 = r5 & r11;
        if (r6 == 0) goto L_0x04f7;
    L_0x0449:
        r6 = r0.getInt(r15, r12);
        r6 = defpackage.anwm.j(r7, r6);
        goto L_0x0401;
    L_0x0452:
        r6 = r5 & r11;
        if (r6 == 0) goto L_0x04f7;
    L_0x0456:
        r6 = r0.getInt(r15, r12);
        r6 = defpackage.anwm.h(r7, r6);
        goto L_0x0401;
    L_0x045f:
        r6 = r5 & r11;
        if (r6 == 0) goto L_0x04f7;
    L_0x0463:
        r6 = r0.getObject(r15, r12);
        r6 = (defpackage.anvu) r6;
        r6 = defpackage.anwm.c(r7, r6);
        goto L_0x0401;
    L_0x046e:
        r6 = r5 & r11;
        if (r6 == 0) goto L_0x04f7;
    L_0x0472:
        r6 = r0.getObject(r15, r12);
        r8 = r14.a(r2);
        r6 = defpackage.aoab.a(r7, r6, r8);
        goto L_0x0401;
    L_0x047f:
        r6 = r5 & r11;
        if (r6 == 0) goto L_0x04f7;
    L_0x0483:
        r6 = r0.getObject(r15, r12);
        r8 = r6 instanceof defpackage.anvu;
        if (r8 == 0) goto L_0x0493;
    L_0x048b:
        r6 = (defpackage.anvu) r6;
        r6 = defpackage.anwm.c(r7, r6);
        goto L_0x0401;
    L_0x0493:
        r6 = (java.lang.String) r6;
        r6 = defpackage.anwm.b(r7, r6);
        goto L_0x0401;
    L_0x049b:
        r6 = r5 & r11;
        if (r6 == 0) goto L_0x04f7;
    L_0x049f:
        r6 = defpackage.anwm.n(r7);
        goto L_0x0401;
    L_0x04a5:
        r6 = r5 & r11;
        if (r6 == 0) goto L_0x04f7;
    L_0x04a9:
        r6 = defpackage.anwm.h(r7);
        goto L_0x0401;
    L_0x04af:
        r6 = r5 & r11;
        if (r6 == 0) goto L_0x04f7;
    L_0x04b3:
        r6 = defpackage.anwm.j(r7);
        goto L_0x0401;
    L_0x04b9:
        r6 = r5 & r11;
        if (r6 == 0) goto L_0x04f7;
    L_0x04bd:
        r6 = r0.getInt(r15, r12);
        r6 = defpackage.anwm.g(r7, r6);
        goto L_0x0401;
    L_0x04c7:
        r6 = r5 & r11;
        if (r6 == 0) goto L_0x04f7;
    L_0x04cb:
        r8 = r0.getLong(r15, r12);
        r6 = defpackage.anwm.e(r7, r8);
        goto L_0x0401;
    L_0x04d5:
        r6 = r5 & r11;
        if (r6 == 0) goto L_0x04f7;
    L_0x04d9:
        r8 = r0.getLong(r15, r12);
        r6 = defpackage.anwm.d(r7, r8);
        goto L_0x0401;
    L_0x04e3:
        r6 = r5 & r11;
        if (r6 == 0) goto L_0x04f7;
    L_0x04e7:
        r6 = defpackage.anwm.l(r7);
        goto L_0x0401;
    L_0x04ed:
        r6 = r5 & r11;
        if (r6 == 0) goto L_0x04f7;
    L_0x04f1:
        r6 = defpackage.anwm.m(r7);
        goto L_0x0401;
    L_0x04f7:
        r2 = r2 + 3;
        goto L_0x0008;
    L_0x04fb:
        r0 = r14.q;
        r0 = defpackage.anzh.a(r0, r15);
        r3 = r3 + r0;
        r0 = r14.h;
        if (r0 == 0) goto L_0x0554;
    L_0x0506:
        r0 = r14.r;
        r15 = r0.a(r15);
        r0 = 0;
    L_0x050d:
        r2 = r15.a;
        r2 = r2.b();
        if (r1 >= r2) goto L_0x052d;
    L_0x0515:
        r2 = r15.a;
        r2 = r2.b(r1);
        r4 = r2.getKey();
        r4 = (defpackage.anxf) r4;
        r2 = r2.getValue();
        r2 = defpackage.anxg.b(r4, r2);
        r0 = r0 + r2;
        r1 = r1 + 1;
        goto L_0x050d;
    L_0x052d:
        r15 = r15.a;
        r15 = r15.c();
        r15 = r15.iterator();
    L_0x0537:
        r1 = r15.hasNext();
        if (r1 == 0) goto L_0x0553;
    L_0x053d:
        r1 = r15.next();
        r1 = (java.util.Map.Entry) r1;
        r2 = r1.getKey();
        r2 = (defpackage.anxf) r2;
        r1 = r1.getValue();
        r1 = defpackage.anxg.b(r2, r1);
        r0 = r0 + r1;
        goto L_0x0537;
    L_0x0553:
        r3 = r3 + r0;
    L_0x0554:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anzh.e(java.lang.Object):int");
    }

    private final int f(java.lang.Object r11) {
        /*
        r10 = this;
        r0 = b;
        r1 = 0;
        r2 = 0;
        r3 = 0;
    L_0x0005:
        r4 = r10.c;
        r4 = r4.length;
        if (r2 >= r4) goto L_0x04d4;
    L_0x000a:
        r4 = r10.e(r2);
        r5 = defpackage.anzh.g(r4);
        r6 = r10.d(r2);
        r7 = defpackage.anzh.i(r4);
        r4 = defpackage.anxi.DOUBLE_LIST_PACKED;
        r4 = r4.d;
        if (r5 < r4) goto L_0x0031;
    L_0x0020:
        r4 = defpackage.anxi.SINT64_LIST_PACKED;
        r4 = r4.d;
        if (r5 > r4) goto L_0x0031;
    L_0x0026:
        r4 = r10.c;
        r9 = r2 + 2;
        r4 = r4[r9];
        r9 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r4 = r4 & r9;
        goto L_0x0032;
    L_0x0031:
        r4 = 0;
    L_0x0032:
        switch(r5) {
            case 0: goto L_0x04c4;
            case 1: goto L_0x04b8;
            case 2: goto L_0x04a8;
            case 3: goto L_0x0498;
            case 4: goto L_0x0488;
            case 5: goto L_0x047c;
            case 6: goto L_0x0470;
            case 7: goto L_0x0464;
            case 8: goto L_0x0446;
            case 9: goto L_0x0432;
            case 10: goto L_0x0421;
            case 11: goto L_0x0412;
            case 12: goto L_0x0403;
            case 13: goto L_0x03f8;
            case 14: goto L_0x03ed;
            case 15: goto L_0x03de;
            case 16: goto L_0x03cf;
            case 17: goto L_0x03ba;
            case 18: goto L_0x03af;
            case 19: goto L_0x03a6;
            case 20: goto L_0x039d;
            case 21: goto L_0x0394;
            case 22: goto L_0x038b;
            case 23: goto L_0x0382;
            case 24: goto L_0x0379;
            case 25: goto L_0x0370;
            case 26: goto L_0x0367;
            case 27: goto L_0x035a;
            case 28: goto L_0x0351;
            case 29: goto L_0x0348;
            case 30: goto L_0x033e;
            case 31: goto L_0x0334;
            case 32: goto L_0x032a;
            case 33: goto L_0x0320;
            case 34: goto L_0x0316;
            case 35: goto L_0x02f6;
            case 36: goto L_0x02d9;
            case 37: goto L_0x02bc;
            case 38: goto L_0x029f;
            case 39: goto L_0x0281;
            case 40: goto L_0x0263;
            case 41: goto L_0x0245;
            case 42: goto L_0x0227;
            case 43: goto L_0x0209;
            case 44: goto L_0x01eb;
            case 45: goto L_0x01cd;
            case 46: goto L_0x01af;
            case 47: goto L_0x0191;
            case 48: goto L_0x0173;
            case 49: goto L_0x0165;
            case 50: goto L_0x0155;
            case 51: goto L_0x0149;
            case 52: goto L_0x013d;
            case 53: goto L_0x012d;
            case 54: goto L_0x011d;
            case 55: goto L_0x010d;
            case 56: goto L_0x0101;
            case 57: goto L_0x00f5;
            case 58: goto L_0x00e9;
            case 59: goto L_0x00cb;
            case 60: goto L_0x00b7;
            case 61: goto L_0x00a5;
            case 62: goto L_0x0095;
            case 63: goto L_0x0085;
            case 64: goto L_0x0079;
            case 65: goto L_0x006d;
            case 66: goto L_0x005d;
            case 67: goto L_0x004d;
            case 68: goto L_0x0037;
            default: goto L_0x0035;
        };
    L_0x0035:
        goto L_0x04d0;
    L_0x0037:
        r4 = r10.a(r11, r6, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x003d:
        r4 = defpackage.aoax.f(r11, r7);
        r4 = (defpackage.anze) r4;
        r5 = r10.a(r2);
        r4 = defpackage.anwm.b(r6, r4, r5);
        goto L_0x03b7;
    L_0x004d:
        r4 = r10.a(r11, r6, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x0053:
        r4 = defpackage.anzh.e(r11, r7);
        r4 = defpackage.anwm.f(r6, r4);
        goto L_0x03b7;
    L_0x005d:
        r4 = r10.a(r11, r6, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x0063:
        r4 = defpackage.anzh.d(r11, r7);
        r4 = defpackage.anwm.i(r6, r4);
        goto L_0x03b7;
    L_0x006d:
        r4 = r10.a(r11, r6, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x0073:
        r4 = defpackage.anwm.k(r6);
        goto L_0x03b7;
    L_0x0079:
        r4 = r10.a(r11, r6, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x007f:
        r4 = defpackage.anwm.i(r6);
        goto L_0x03b7;
    L_0x0085:
        r4 = r10.a(r11, r6, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x008b:
        r4 = defpackage.anzh.d(r11, r7);
        r4 = defpackage.anwm.j(r6, r4);
        goto L_0x03b7;
    L_0x0095:
        r4 = r10.a(r11, r6, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x009b:
        r4 = defpackage.anzh.d(r11, r7);
        r4 = defpackage.anwm.h(r6, r4);
        goto L_0x03b7;
    L_0x00a5:
        r4 = r10.a(r11, r6, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x00ab:
        r4 = defpackage.aoax.f(r11, r7);
        r4 = (defpackage.anvu) r4;
        r4 = defpackage.anwm.c(r6, r4);
        goto L_0x03b7;
    L_0x00b7:
        r4 = r10.a(r11, r6, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x00bd:
        r4 = defpackage.aoax.f(r11, r7);
        r5 = r10.a(r2);
        r4 = defpackage.aoab.a(r6, r4, r5);
        goto L_0x03b7;
    L_0x00cb:
        r4 = r10.a(r11, r6, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x00d1:
        r4 = defpackage.aoax.f(r11, r7);
        r5 = r4 instanceof defpackage.anvu;
        if (r5 == 0) goto L_0x00e1;
    L_0x00d9:
        r4 = (defpackage.anvu) r4;
        r4 = defpackage.anwm.c(r6, r4);
        goto L_0x03b7;
    L_0x00e1:
        r4 = (java.lang.String) r4;
        r4 = defpackage.anwm.b(r6, r4);
        goto L_0x03b7;
    L_0x00e9:
        r4 = r10.a(r11, r6, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x00ef:
        r4 = defpackage.anwm.n(r6);
        goto L_0x03b7;
    L_0x00f5:
        r4 = r10.a(r11, r6, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x00fb:
        r4 = defpackage.anwm.h(r6);
        goto L_0x03b7;
    L_0x0101:
        r4 = r10.a(r11, r6, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x0107:
        r4 = defpackage.anwm.j(r6);
        goto L_0x03b7;
    L_0x010d:
        r4 = r10.a(r11, r6, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x0113:
        r4 = defpackage.anzh.d(r11, r7);
        r4 = defpackage.anwm.g(r6, r4);
        goto L_0x03b7;
    L_0x011d:
        r4 = r10.a(r11, r6, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x0123:
        r4 = defpackage.anzh.e(r11, r7);
        r4 = defpackage.anwm.e(r6, r4);
        goto L_0x03b7;
    L_0x012d:
        r4 = r10.a(r11, r6, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x0133:
        r4 = defpackage.anzh.e(r11, r7);
        r4 = defpackage.anwm.d(r6, r4);
        goto L_0x03b7;
    L_0x013d:
        r4 = r10.a(r11, r6, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x0143:
        r4 = defpackage.anwm.l(r6);
        goto L_0x03b7;
    L_0x0149:
        r4 = r10.a(r11, r6, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x014f:
        r4 = defpackage.anwm.m(r6);
        goto L_0x03b7;
    L_0x0155:
        r4 = r10.s;
        r5 = defpackage.aoax.f(r11, r7);
        r7 = r10.b(r2);
        r4 = r4.a(r6, r5, r7);
        goto L_0x03b7;
    L_0x0165:
        r4 = defpackage.anzh.a(r11, r7);
        r5 = r10.a(r2);
        r4 = defpackage.aoab.b(r6, r4, r5);
        goto L_0x03b7;
    L_0x0173:
        r5 = r0.getObject(r11, r7);
        r5 = (java.util.List) r5;
        r5 = defpackage.aoab.c(r5);
        if (r5 <= 0) goto L_0x04d0;
    L_0x017f:
        r7 = r10.k;
        if (r7 == 0) goto L_0x0187;
    L_0x0183:
        r7 = (long) r4;
        r0.putInt(r11, r7, r5);
    L_0x0187:
        r4 = defpackage.anwm.o(r6);
        r6 = defpackage.anwm.q(r5);
        goto L_0x0312;
    L_0x0191:
        r5 = r0.getObject(r11, r7);
        r5 = (java.util.List) r5;
        r5 = defpackage.aoab.g(r5);
        if (r5 <= 0) goto L_0x04d0;
    L_0x019d:
        r7 = r10.k;
        if (r7 == 0) goto L_0x01a5;
    L_0x01a1:
        r7 = (long) r4;
        r0.putInt(r11, r7, r5);
    L_0x01a5:
        r4 = defpackage.anwm.o(r6);
        r6 = defpackage.anwm.q(r5);
        goto L_0x0312;
    L_0x01af:
        r5 = r0.getObject(r11, r7);
        r5 = (java.util.List) r5;
        r5 = defpackage.aoab.i(r5);
        if (r5 <= 0) goto L_0x04d0;
    L_0x01bb:
        r7 = r10.k;
        if (r7 == 0) goto L_0x01c3;
    L_0x01bf:
        r7 = (long) r4;
        r0.putInt(r11, r7, r5);
    L_0x01c3:
        r4 = defpackage.anwm.o(r6);
        r6 = defpackage.anwm.q(r5);
        goto L_0x0312;
    L_0x01cd:
        r5 = r0.getObject(r11, r7);
        r5 = (java.util.List) r5;
        r5 = defpackage.aoab.h(r5);
        if (r5 <= 0) goto L_0x04d0;
    L_0x01d9:
        r7 = r10.k;
        if (r7 == 0) goto L_0x01e1;
    L_0x01dd:
        r7 = (long) r4;
        r0.putInt(r11, r7, r5);
    L_0x01e1:
        r4 = defpackage.anwm.o(r6);
        r6 = defpackage.anwm.q(r5);
        goto L_0x0312;
    L_0x01eb:
        r5 = r0.getObject(r11, r7);
        r5 = (java.util.List) r5;
        r5 = defpackage.aoab.d(r5);
        if (r5 <= 0) goto L_0x04d0;
    L_0x01f7:
        r7 = r10.k;
        if (r7 == 0) goto L_0x01ff;
    L_0x01fb:
        r7 = (long) r4;
        r0.putInt(r11, r7, r5);
    L_0x01ff:
        r4 = defpackage.anwm.o(r6);
        r6 = defpackage.anwm.q(r5);
        goto L_0x0312;
    L_0x0209:
        r5 = r0.getObject(r11, r7);
        r5 = (java.util.List) r5;
        r5 = defpackage.aoab.f(r5);
        if (r5 <= 0) goto L_0x04d0;
    L_0x0215:
        r7 = r10.k;
        if (r7 == 0) goto L_0x021d;
    L_0x0219:
        r7 = (long) r4;
        r0.putInt(r11, r7, r5);
    L_0x021d:
        r4 = defpackage.anwm.o(r6);
        r6 = defpackage.anwm.q(r5);
        goto L_0x0312;
    L_0x0227:
        r5 = r0.getObject(r11, r7);
        r5 = (java.util.List) r5;
        r5 = defpackage.aoab.j(r5);
        if (r5 <= 0) goto L_0x04d0;
    L_0x0233:
        r7 = r10.k;
        if (r7 == 0) goto L_0x023b;
    L_0x0237:
        r7 = (long) r4;
        r0.putInt(r11, r7, r5);
    L_0x023b:
        r4 = defpackage.anwm.o(r6);
        r6 = defpackage.anwm.q(r5);
        goto L_0x0312;
    L_0x0245:
        r5 = r0.getObject(r11, r7);
        r5 = (java.util.List) r5;
        r5 = defpackage.aoab.h(r5);
        if (r5 <= 0) goto L_0x04d0;
    L_0x0251:
        r7 = r10.k;
        if (r7 == 0) goto L_0x0259;
    L_0x0255:
        r7 = (long) r4;
        r0.putInt(r11, r7, r5);
    L_0x0259:
        r4 = defpackage.anwm.o(r6);
        r6 = defpackage.anwm.q(r5);
        goto L_0x0312;
    L_0x0263:
        r5 = r0.getObject(r11, r7);
        r5 = (java.util.List) r5;
        r5 = defpackage.aoab.i(r5);
        if (r5 <= 0) goto L_0x04d0;
    L_0x026f:
        r7 = r10.k;
        if (r7 == 0) goto L_0x0277;
    L_0x0273:
        r7 = (long) r4;
        r0.putInt(r11, r7, r5);
    L_0x0277:
        r4 = defpackage.anwm.o(r6);
        r6 = defpackage.anwm.q(r5);
        goto L_0x0312;
    L_0x0281:
        r5 = r0.getObject(r11, r7);
        r5 = (java.util.List) r5;
        r5 = defpackage.aoab.e(r5);
        if (r5 <= 0) goto L_0x04d0;
    L_0x028d:
        r7 = r10.k;
        if (r7 == 0) goto L_0x0295;
    L_0x0291:
        r7 = (long) r4;
        r0.putInt(r11, r7, r5);
    L_0x0295:
        r4 = defpackage.anwm.o(r6);
        r6 = defpackage.anwm.q(r5);
        goto L_0x0312;
    L_0x029f:
        r5 = r0.getObject(r11, r7);
        r5 = (java.util.List) r5;
        r5 = defpackage.aoab.b(r5);
        if (r5 <= 0) goto L_0x04d0;
    L_0x02ab:
        r7 = r10.k;
        if (r7 == 0) goto L_0x02b3;
    L_0x02af:
        r7 = (long) r4;
        r0.putInt(r11, r7, r5);
    L_0x02b3:
        r4 = defpackage.anwm.o(r6);
        r6 = defpackage.anwm.q(r5);
        goto L_0x0312;
    L_0x02bc:
        r5 = r0.getObject(r11, r7);
        r5 = (java.util.List) r5;
        r5 = defpackage.aoab.a(r5);
        if (r5 <= 0) goto L_0x04d0;
    L_0x02c8:
        r7 = r10.k;
        if (r7 == 0) goto L_0x02d0;
    L_0x02cc:
        r7 = (long) r4;
        r0.putInt(r11, r7, r5);
    L_0x02d0:
        r4 = defpackage.anwm.o(r6);
        r6 = defpackage.anwm.q(r5);
        goto L_0x0312;
    L_0x02d9:
        r5 = r0.getObject(r11, r7);
        r5 = (java.util.List) r5;
        r5 = defpackage.aoab.h(r5);
        if (r5 <= 0) goto L_0x04d0;
    L_0x02e5:
        r7 = r10.k;
        if (r7 == 0) goto L_0x02ed;
    L_0x02e9:
        r7 = (long) r4;
        r0.putInt(r11, r7, r5);
    L_0x02ed:
        r4 = defpackage.anwm.o(r6);
        r6 = defpackage.anwm.q(r5);
        goto L_0x0312;
    L_0x02f6:
        r5 = r0.getObject(r11, r7);
        r5 = (java.util.List) r5;
        r5 = defpackage.aoab.i(r5);
        if (r5 <= 0) goto L_0x04d0;
    L_0x0302:
        r7 = r10.k;
        if (r7 == 0) goto L_0x030a;
    L_0x0306:
        r7 = (long) r4;
        r0.putInt(r11, r7, r5);
    L_0x030a:
        r4 = defpackage.anwm.o(r6);
        r6 = defpackage.anwm.q(r5);
    L_0x0312:
        r4 = r4 + r6;
        r4 = r4 + r5;
        goto L_0x03b7;
    L_0x0316:
        r4 = defpackage.anzh.a(r11, r7);
        r4 = defpackage.aoab.c(r6, r4);
        goto L_0x03b7;
    L_0x0320:
        r4 = defpackage.anzh.a(r11, r7);
        r4 = defpackage.aoab.g(r6, r4);
        goto L_0x03b7;
    L_0x032a:
        r4 = defpackage.anzh.a(r11, r7);
        r4 = defpackage.aoab.i(r6, r4);
        goto L_0x03b7;
    L_0x0334:
        r4 = defpackage.anzh.a(r11, r7);
        r4 = defpackage.aoab.h(r6, r4);
        goto L_0x03b7;
    L_0x033e:
        r4 = defpackage.anzh.a(r11, r7);
        r4 = defpackage.aoab.d(r6, r4);
        goto L_0x03b7;
    L_0x0348:
        r4 = defpackage.anzh.a(r11, r7);
        r4 = defpackage.aoab.f(r6, r4);
        goto L_0x03b7;
    L_0x0351:
        r4 = defpackage.anzh.a(r11, r7);
        r4 = defpackage.aoab.l(r6, r4);
        goto L_0x03b7;
    L_0x035a:
        r4 = defpackage.anzh.a(r11, r7);
        r5 = r10.a(r2);
        r4 = defpackage.aoab.a(r6, r4, r5);
        goto L_0x03b7;
    L_0x0367:
        r4 = defpackage.anzh.a(r11, r7);
        r4 = defpackage.aoab.k(r6, r4);
        goto L_0x03b7;
    L_0x0370:
        r4 = defpackage.anzh.a(r11, r7);
        r4 = defpackage.aoab.j(r6, r4);
        goto L_0x03b7;
    L_0x0379:
        r4 = defpackage.anzh.a(r11, r7);
        r4 = defpackage.aoab.h(r6, r4);
        goto L_0x03b7;
    L_0x0382:
        r4 = defpackage.anzh.a(r11, r7);
        r4 = defpackage.aoab.i(r6, r4);
        goto L_0x03b7;
    L_0x038b:
        r4 = defpackage.anzh.a(r11, r7);
        r4 = defpackage.aoab.e(r6, r4);
        goto L_0x03b7;
    L_0x0394:
        r4 = defpackage.anzh.a(r11, r7);
        r4 = defpackage.aoab.b(r6, r4);
        goto L_0x03b7;
    L_0x039d:
        r4 = defpackage.anzh.a(r11, r7);
        r4 = defpackage.aoab.a(r6, r4);
        goto L_0x03b7;
    L_0x03a6:
        r4 = defpackage.anzh.a(r11, r7);
        r4 = defpackage.aoab.h(r6, r4);
        goto L_0x03b7;
    L_0x03af:
        r4 = defpackage.anzh.a(r11, r7);
        r4 = defpackage.aoab.i(r6, r4);
    L_0x03b7:
        r3 = r3 + r4;
        goto L_0x04d0;
    L_0x03ba:
        r4 = r10.a(r11, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x03c0:
        r4 = defpackage.aoax.f(r11, r7);
        r4 = (defpackage.anze) r4;
        r5 = r10.a(r2);
        r4 = defpackage.anwm.b(r6, r4, r5);
        goto L_0x03b7;
    L_0x03cf:
        r4 = r10.a(r11, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x03d5:
        r4 = defpackage.aoax.b(r11, r7);
        r4 = defpackage.anwm.f(r6, r4);
        goto L_0x03b7;
    L_0x03de:
        r4 = r10.a(r11, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x03e4:
        r4 = defpackage.aoax.a(r11, r7);
        r4 = defpackage.anwm.i(r6, r4);
        goto L_0x03b7;
    L_0x03ed:
        r4 = r10.a(r11, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x03f3:
        r4 = defpackage.anwm.k(r6);
        goto L_0x03b7;
    L_0x03f8:
        r4 = r10.a(r11, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x03fe:
        r4 = defpackage.anwm.i(r6);
        goto L_0x03b7;
    L_0x0403:
        r4 = r10.a(r11, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x0409:
        r4 = defpackage.aoax.a(r11, r7);
        r4 = defpackage.anwm.j(r6, r4);
        goto L_0x03b7;
    L_0x0412:
        r4 = r10.a(r11, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x0418:
        r4 = defpackage.aoax.a(r11, r7);
        r4 = defpackage.anwm.h(r6, r4);
        goto L_0x03b7;
    L_0x0421:
        r4 = r10.a(r11, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x0427:
        r4 = defpackage.aoax.f(r11, r7);
        r4 = (defpackage.anvu) r4;
        r4 = defpackage.anwm.c(r6, r4);
        goto L_0x03b7;
    L_0x0432:
        r4 = r10.a(r11, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x0438:
        r4 = defpackage.aoax.f(r11, r7);
        r5 = r10.a(r2);
        r4 = defpackage.aoab.a(r6, r4, r5);
        goto L_0x03b7;
    L_0x0446:
        r4 = r10.a(r11, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x044c:
        r4 = defpackage.aoax.f(r11, r7);
        r5 = r4 instanceof defpackage.anvu;
        if (r5 == 0) goto L_0x045c;
    L_0x0454:
        r4 = (defpackage.anvu) r4;
        r4 = defpackage.anwm.c(r6, r4);
        goto L_0x03b7;
    L_0x045c:
        r4 = (java.lang.String) r4;
        r4 = defpackage.anwm.b(r6, r4);
        goto L_0x03b7;
    L_0x0464:
        r4 = r10.a(r11, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x046a:
        r4 = defpackage.anwm.n(r6);
        goto L_0x03b7;
    L_0x0470:
        r4 = r10.a(r11, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x0476:
        r4 = defpackage.anwm.h(r6);
        goto L_0x03b7;
    L_0x047c:
        r4 = r10.a(r11, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x0482:
        r4 = defpackage.anwm.j(r6);
        goto L_0x03b7;
    L_0x0488:
        r4 = r10.a(r11, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x048e:
        r4 = defpackage.aoax.a(r11, r7);
        r4 = defpackage.anwm.g(r6, r4);
        goto L_0x03b7;
    L_0x0498:
        r4 = r10.a(r11, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x049e:
        r4 = defpackage.aoax.b(r11, r7);
        r4 = defpackage.anwm.e(r6, r4);
        goto L_0x03b7;
    L_0x04a8:
        r4 = r10.a(r11, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x04ae:
        r4 = defpackage.aoax.b(r11, r7);
        r4 = defpackage.anwm.d(r6, r4);
        goto L_0x03b7;
    L_0x04b8:
        r4 = r10.a(r11, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x04be:
        r4 = defpackage.anwm.l(r6);
        goto L_0x03b7;
    L_0x04c4:
        r4 = r10.a(r11, r2);
        if (r4 == 0) goto L_0x04d0;
    L_0x04ca:
        r4 = defpackage.anwm.m(r6);
        goto L_0x03b7;
    L_0x04d0:
        r2 = r2 + 3;
        goto L_0x0005;
    L_0x04d4:
        r0 = r10.q;
        r11 = defpackage.anzh.a(r0, r11);
        r3 = r3 + r11;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anzh.f(java.lang.Object):int");
    }

    private static int a(aoar aoar, Object obj) {
        return aoar.f(aoar.b(obj));
    }

    private static List a(Object obj, long j) {
        return (List) aoax.f(obj, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0591  */
    public final void a(java.lang.Object r13, defpackage.aobl r14) {
        /*
        r12 = this;
        r0 = r12.j;
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        r12.b(r13, r14);
        return;
    L_0x0008:
        r0 = r12.h;
        r1 = 0;
        if (r0 == 0) goto L_0x0024;
    L_0x000d:
        r0 = r12.r;
        r0 = r0.a(r13);
        r2 = r0.a();
        if (r2 != 0) goto L_0x0024;
    L_0x0019:
        r0 = r0.d();
        r2 = r0.next();
        r2 = (java.util.Map.Entry) r2;
        goto L_0x0026;
    L_0x0024:
        r0 = r1;
        r2 = r0;
    L_0x0026:
        r3 = r12.c;
        r3 = r3.length;
        r4 = 0;
        r5 = r2;
        r2 = 0;
    L_0x002c:
        if (r2 >= r3) goto L_0x058f;
    L_0x002e:
        r6 = r12.e(r2);
        r7 = r12.d(r2);
    L_0x0036:
        if (r5 == 0) goto L_0x0054;
    L_0x0038:
        r8 = r12.r;
        r8 = r8.a(r5);
        if (r8 > r7) goto L_0x0054;
    L_0x0040:
        r8 = r12.r;
        r8.a(r14, r5);
        r5 = r0.hasNext();
        if (r5 == 0) goto L_0x0052;
    L_0x004b:
        r5 = r0.next();
        r5 = (java.util.Map.Entry) r5;
        goto L_0x0036;
    L_0x0052:
        r5 = r1;
        goto L_0x0036;
    L_0x0054:
        r8 = defpackage.anzh.g(r6);
        r9 = 1;
        switch(r8) {
            case 0: goto L_0x057a;
            case 1: goto L_0x0568;
            case 2: goto L_0x0556;
            case 3: goto L_0x0544;
            case 4: goto L_0x0532;
            case 5: goto L_0x0520;
            case 6: goto L_0x050e;
            case 7: goto L_0x04fb;
            case 8: goto L_0x04e8;
            case 9: goto L_0x04d1;
            case 10: goto L_0x04bc;
            case 11: goto L_0x04a9;
            case 12: goto L_0x0496;
            case 13: goto L_0x0483;
            case 14: goto L_0x0470;
            case 15: goto L_0x045d;
            case 16: goto L_0x044a;
            case 17: goto L_0x0433;
            case 18: goto L_0x0420;
            case 19: goto L_0x040d;
            case 20: goto L_0x03fa;
            case 21: goto L_0x03e7;
            case 22: goto L_0x03d4;
            case 23: goto L_0x03c1;
            case 24: goto L_0x03ae;
            case 25: goto L_0x039b;
            case 26: goto L_0x0388;
            case 27: goto L_0x0371;
            case 28: goto L_0x035e;
            case 29: goto L_0x034b;
            case 30: goto L_0x0338;
            case 31: goto L_0x0325;
            case 32: goto L_0x0312;
            case 33: goto L_0x02ff;
            case 34: goto L_0x02ec;
            case 35: goto L_0x02d9;
            case 36: goto L_0x02c6;
            case 37: goto L_0x02b3;
            case 38: goto L_0x02a0;
            case 39: goto L_0x028d;
            case 40: goto L_0x027a;
            case 41: goto L_0x0267;
            case 42: goto L_0x0254;
            case 43: goto L_0x0241;
            case 44: goto L_0x022e;
            case 45: goto L_0x021b;
            case 46: goto L_0x0208;
            case 47: goto L_0x01f5;
            case 48: goto L_0x01e2;
            case 49: goto L_0x01cb;
            case 50: goto L_0x01be;
            case 51: goto L_0x01ab;
            case 52: goto L_0x0198;
            case 53: goto L_0x0185;
            case 54: goto L_0x0172;
            case 55: goto L_0x015f;
            case 56: goto L_0x014c;
            case 57: goto L_0x0139;
            case 58: goto L_0x0126;
            case 59: goto L_0x0113;
            case 60: goto L_0x00fc;
            case 61: goto L_0x00e7;
            case 62: goto L_0x00d4;
            case 63: goto L_0x00c1;
            case 64: goto L_0x00ae;
            case 65: goto L_0x009b;
            case 66: goto L_0x0088;
            case 67: goto L_0x0075;
            case 68: goto L_0x005e;
            default: goto L_0x005c;
        };
    L_0x005c:
        goto L_0x058b;
    L_0x005e:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x0064:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r8 = r12.a(r2);
        r14.b(r7, r6, r8);
        goto L_0x058b;
    L_0x0075:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x007b:
        r8 = defpackage.anzh.i(r6);
        r8 = defpackage.anzh.e(r13, r8);
        r14.e(r7, r8);
        goto L_0x058b;
    L_0x0088:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x008e:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.anzh.d(r13, r8);
        r14.f(r7, r6);
        goto L_0x058b;
    L_0x009b:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x00a1:
        r8 = defpackage.anzh.i(r6);
        r8 = defpackage.anzh.e(r13, r8);
        r14.b(r7, r8);
        goto L_0x058b;
    L_0x00ae:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x00b4:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.anzh.d(r13, r8);
        r14.a(r7, r6);
        goto L_0x058b;
    L_0x00c1:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x00c7:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.anzh.d(r13, r8);
        r14.b(r7, r6);
        goto L_0x058b;
    L_0x00d4:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x00da:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.anzh.d(r13, r8);
        r14.e(r7, r6);
        goto L_0x058b;
    L_0x00e7:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x00ed:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r6 = (defpackage.anvu) r6;
        r14.a(r7, r6);
        goto L_0x058b;
    L_0x00fc:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x0102:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r8 = r12.a(r2);
        r14.a(r7, r6, r8);
        goto L_0x058b;
    L_0x0113:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x0119:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        defpackage.anzh.a(r7, r6, r14);
        goto L_0x058b;
    L_0x0126:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x012c:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.anzh.f(r13, r8);
        r14.a(r7, r6);
        goto L_0x058b;
    L_0x0139:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x013f:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.anzh.d(r13, r8);
        r14.d(r7, r6);
        goto L_0x058b;
    L_0x014c:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x0152:
        r8 = defpackage.anzh.i(r6);
        r8 = defpackage.anzh.e(r13, r8);
        r14.d(r7, r8);
        goto L_0x058b;
    L_0x015f:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x0165:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.anzh.d(r13, r8);
        r14.c(r7, r6);
        goto L_0x058b;
    L_0x0172:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x0178:
        r8 = defpackage.anzh.i(r6);
        r8 = defpackage.anzh.e(r13, r8);
        r14.c(r7, r8);
        goto L_0x058b;
    L_0x0185:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x018b:
        r8 = defpackage.anzh.i(r6);
        r8 = defpackage.anzh.e(r13, r8);
        r14.a(r7, r8);
        goto L_0x058b;
    L_0x0198:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x019e:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.anzh.c(r13, r8);
        r14.a(r7, r6);
        goto L_0x058b;
    L_0x01ab:
        r8 = r12.a(r13, r7, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x01b1:
        r8 = defpackage.anzh.i(r6);
        r8 = defpackage.anzh.b(r13, r8);
        r14.a(r7, r8);
        goto L_0x058b;
    L_0x01be:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r12.a(r14, r7, r6, r2);
        goto L_0x058b;
    L_0x01cb:
        r7 = r12.d(r2);
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r6 = (java.util.List) r6;
        r8 = r12.a(r2);
        defpackage.aoab.b(r7, r6, r14, r8);
        goto L_0x058b;
    L_0x01e2:
        r7 = r12.d(r2);
        r10 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.aoab.e(r7, r6, r14, r9);
        goto L_0x058b;
    L_0x01f5:
        r7 = r12.d(r2);
        r10 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.aoab.j(r7, r6, r14, r9);
        goto L_0x058b;
    L_0x0208:
        r7 = r12.d(r2);
        r10 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.aoab.g(r7, r6, r14, r9);
        goto L_0x058b;
    L_0x021b:
        r7 = r12.d(r2);
        r10 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.aoab.l(r7, r6, r14, r9);
        goto L_0x058b;
    L_0x022e:
        r7 = r12.d(r2);
        r10 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.aoab.m(r7, r6, r14, r9);
        goto L_0x058b;
    L_0x0241:
        r7 = r12.d(r2);
        r10 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.aoab.i(r7, r6, r14, r9);
        goto L_0x058b;
    L_0x0254:
        r7 = r12.d(r2);
        r10 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.aoab.n(r7, r6, r14, r9);
        goto L_0x058b;
    L_0x0267:
        r7 = r12.d(r2);
        r10 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.aoab.k(r7, r6, r14, r9);
        goto L_0x058b;
    L_0x027a:
        r7 = r12.d(r2);
        r10 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.aoab.f(r7, r6, r14, r9);
        goto L_0x058b;
    L_0x028d:
        r7 = r12.d(r2);
        r10 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.aoab.h(r7, r6, r14, r9);
        goto L_0x058b;
    L_0x02a0:
        r7 = r12.d(r2);
        r10 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.aoab.d(r7, r6, r14, r9);
        goto L_0x058b;
    L_0x02b3:
        r7 = r12.d(r2);
        r10 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.aoab.c(r7, r6, r14, r9);
        goto L_0x058b;
    L_0x02c6:
        r7 = r12.d(r2);
        r10 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.aoab.b(r7, r6, r14, r9);
        goto L_0x058b;
    L_0x02d9:
        r7 = r12.d(r2);
        r10 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r10);
        r6 = (java.util.List) r6;
        defpackage.aoab.a(r7, r6, r14, r9);
        goto L_0x058b;
    L_0x02ec:
        r7 = r12.d(r2);
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.aoab.e(r7, r6, r14, r4);
        goto L_0x058b;
    L_0x02ff:
        r7 = r12.d(r2);
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.aoab.j(r7, r6, r14, r4);
        goto L_0x058b;
    L_0x0312:
        r7 = r12.d(r2);
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.aoab.g(r7, r6, r14, r4);
        goto L_0x058b;
    L_0x0325:
        r7 = r12.d(r2);
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.aoab.l(r7, r6, r14, r4);
        goto L_0x058b;
    L_0x0338:
        r7 = r12.d(r2);
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.aoab.m(r7, r6, r14, r4);
        goto L_0x058b;
    L_0x034b:
        r7 = r12.d(r2);
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.aoab.i(r7, r6, r14, r4);
        goto L_0x058b;
    L_0x035e:
        r7 = r12.d(r2);
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.aoab.b(r7, r6, r14);
        goto L_0x058b;
    L_0x0371:
        r7 = r12.d(r2);
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r6 = (java.util.List) r6;
        r8 = r12.a(r2);
        defpackage.aoab.a(r7, r6, r14, r8);
        goto L_0x058b;
    L_0x0388:
        r7 = r12.d(r2);
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.aoab.a(r7, r6, r14);
        goto L_0x058b;
    L_0x039b:
        r7 = r12.d(r2);
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.aoab.n(r7, r6, r14, r4);
        goto L_0x058b;
    L_0x03ae:
        r7 = r12.d(r2);
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.aoab.k(r7, r6, r14, r4);
        goto L_0x058b;
    L_0x03c1:
        r7 = r12.d(r2);
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.aoab.f(r7, r6, r14, r4);
        goto L_0x058b;
    L_0x03d4:
        r7 = r12.d(r2);
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.aoab.h(r7, r6, r14, r4);
        goto L_0x058b;
    L_0x03e7:
        r7 = r12.d(r2);
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.aoab.d(r7, r6, r14, r4);
        goto L_0x058b;
    L_0x03fa:
        r7 = r12.d(r2);
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.aoab.c(r7, r6, r14, r4);
        goto L_0x058b;
    L_0x040d:
        r7 = r12.d(r2);
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.aoab.b(r7, r6, r14, r4);
        goto L_0x058b;
    L_0x0420:
        r7 = r12.d(r2);
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r6 = (java.util.List) r6;
        defpackage.aoab.a(r7, r6, r14, r4);
        goto L_0x058b;
    L_0x0433:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x0439:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r8 = r12.a(r2);
        r14.b(r7, r6, r8);
        goto L_0x058b;
    L_0x044a:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x0450:
        r8 = defpackage.anzh.i(r6);
        r8 = defpackage.aoax.b(r13, r8);
        r14.e(r7, r8);
        goto L_0x058b;
    L_0x045d:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x0463:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.a(r13, r8);
        r14.f(r7, r6);
        goto L_0x058b;
    L_0x0470:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x0476:
        r8 = defpackage.anzh.i(r6);
        r8 = defpackage.aoax.b(r13, r8);
        r14.b(r7, r8);
        goto L_0x058b;
    L_0x0483:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x0489:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.a(r13, r8);
        r14.a(r7, r6);
        goto L_0x058b;
    L_0x0496:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x049c:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.a(r13, r8);
        r14.b(r7, r6);
        goto L_0x058b;
    L_0x04a9:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x04af:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.a(r13, r8);
        r14.e(r7, r6);
        goto L_0x058b;
    L_0x04bc:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x04c2:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r6 = (defpackage.anvu) r6;
        r14.a(r7, r6);
        goto L_0x058b;
    L_0x04d1:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x04d7:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        r8 = r12.a(r2);
        r14.a(r7, r6, r8);
        goto L_0x058b;
    L_0x04e8:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x04ee:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.f(r13, r8);
        defpackage.anzh.a(r7, r6, r14);
        goto L_0x058b;
    L_0x04fb:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x0501:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.c(r13, r8);
        r14.a(r7, r6);
        goto L_0x058b;
    L_0x050e:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x0514:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.a(r13, r8);
        r14.d(r7, r6);
        goto L_0x058b;
    L_0x0520:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x0526:
        r8 = defpackage.anzh.i(r6);
        r8 = defpackage.aoax.b(r13, r8);
        r14.d(r7, r8);
        goto L_0x058b;
    L_0x0532:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x0538:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.a(r13, r8);
        r14.c(r7, r6);
        goto L_0x058b;
    L_0x0544:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x054a:
        r8 = defpackage.anzh.i(r6);
        r8 = defpackage.aoax.b(r13, r8);
        r14.c(r7, r8);
        goto L_0x058b;
    L_0x0556:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x055c:
        r8 = defpackage.anzh.i(r6);
        r8 = defpackage.aoax.b(r13, r8);
        r14.a(r7, r8);
        goto L_0x058b;
    L_0x0568:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x056e:
        r8 = defpackage.anzh.i(r6);
        r6 = defpackage.aoax.d(r13, r8);
        r14.a(r7, r6);
        goto L_0x058b;
    L_0x057a:
        r8 = r12.a(r13, r2);
        if (r8 == 0) goto L_0x058b;
    L_0x0580:
        r8 = defpackage.anzh.i(r6);
        r8 = defpackage.aoax.e(r13, r8);
        r14.a(r7, r8);
    L_0x058b:
        r2 = r2 + 3;
        goto L_0x002c;
    L_0x058f:
        if (r5 == 0) goto L_0x05a6;
    L_0x0591:
        r2 = r12.r;
        r2.a(r14, r5);
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x05a4;
    L_0x059c:
        r2 = r0.next();
        r5 = r2;
        r5 = (java.util.Map.Entry) r5;
        goto L_0x058f;
    L_0x05a4:
        r5 = r1;
        goto L_0x058f;
    L_0x05a6:
        r0 = r12.q;
        defpackage.anzh.a(r0, r13, r14);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anzh.a(java.lang.Object, aobl):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0527  */
    private final void b(java.lang.Object r18, defpackage.aobl r19) {
        /*
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r19;
        r3 = r0.h;
        if (r3 == 0) goto L_0x0021;
    L_0x000a:
        r3 = r0.r;
        r3 = r3.a(r1);
        r5 = r3.a();
        if (r5 != 0) goto L_0x0021;
    L_0x0016:
        r3 = r3.d();
        r5 = r3.next();
        r5 = (java.util.Map.Entry) r5;
        goto L_0x0023;
    L_0x0021:
        r3 = 0;
        r5 = 0;
    L_0x0023:
        r6 = r0.c;
        r6 = r6.length;
        r7 = b;
        r8 = -1;
        r11 = r5;
        r5 = 0;
        r10 = 0;
    L_0x002c:
        if (r5 >= r6) goto L_0x0525;
    L_0x002e:
        r12 = r0.e(r5);
        r13 = r0.d(r5);
        r14 = defpackage.anzh.g(r12);
        r15 = r0.j;
        if (r15 == 0) goto L_0x0042;
    L_0x003e:
        r16 = r5;
        r9 = 0;
        goto L_0x0063;
    L_0x0042:
        r15 = 17;
        if (r14 > r15) goto L_0x003e;
    L_0x0046:
        r15 = r0.c;
        r16 = r5 + 2;
        r15 = r15[r16];
        r16 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r9 = r15 & r16;
        if (r9 == r8) goto L_0x005c;
    L_0x0053:
        r16 = r5;
        r4 = (long) r9;
        r10 = r7.getInt(r1, r4);
        r8 = r9;
        goto L_0x005e;
    L_0x005c:
        r16 = r5;
    L_0x005e:
        r4 = r15 >>> 20;
        r5 = 1;
        r9 = r5 << r4;
    L_0x0063:
        if (r11 == 0) goto L_0x0082;
    L_0x0065:
        r4 = r0.r;
        r4 = r4.a(r11);
        if (r4 > r13) goto L_0x0082;
    L_0x006d:
        r4 = r0.r;
        r4.a(r2, r11);
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0080;
    L_0x0078:
        r4 = r3.next();
        r11 = r4;
        r11 = (java.util.Map.Entry) r11;
        goto L_0x0063;
    L_0x0080:
        r11 = 0;
        goto L_0x0063;
    L_0x0082:
        r4 = defpackage.anzh.i(r12);
        switch(r14) {
            case 0: goto L_0x0514;
            case 1: goto L_0x0506;
            case 2: goto L_0x04f8;
            case 3: goto L_0x04ea;
            case 4: goto L_0x04dc;
            case 5: goto L_0x04ce;
            case 6: goto L_0x04c0;
            case 7: goto L_0x04b2;
            case 8: goto L_0x04a3;
            case 9: goto L_0x0490;
            case 10: goto L_0x047f;
            case 11: goto L_0x0470;
            case 12: goto L_0x0461;
            case 13: goto L_0x0452;
            case 14: goto L_0x0443;
            case 15: goto L_0x0434;
            case 16: goto L_0x0425;
            case 17: goto L_0x0412;
            case 18: goto L_0x0400;
            case 19: goto L_0x03ee;
            case 20: goto L_0x03dc;
            case 21: goto L_0x03ca;
            case 22: goto L_0x03b8;
            case 23: goto L_0x03a6;
            case 24: goto L_0x0394;
            case 25: goto L_0x0382;
            case 26: goto L_0x0371;
            case 27: goto L_0x035c;
            case 28: goto L_0x034b;
            case 29: goto L_0x0339;
            case 30: goto L_0x0327;
            case 31: goto L_0x0315;
            case 32: goto L_0x0303;
            case 33: goto L_0x02f1;
            case 34: goto L_0x02df;
            case 35: goto L_0x02cd;
            case 36: goto L_0x02bb;
            case 37: goto L_0x02a9;
            case 38: goto L_0x0297;
            case 39: goto L_0x0285;
            case 40: goto L_0x0273;
            case 41: goto L_0x0261;
            case 42: goto L_0x024f;
            case 43: goto L_0x023d;
            case 44: goto L_0x022b;
            case 45: goto L_0x0219;
            case 46: goto L_0x0207;
            case 47: goto L_0x01f5;
            case 48: goto L_0x01e3;
            case 49: goto L_0x01ce;
            case 50: goto L_0x01c3;
            case 51: goto L_0x01b2;
            case 52: goto L_0x01a1;
            case 53: goto L_0x0190;
            case 54: goto L_0x017f;
            case 55: goto L_0x016e;
            case 56: goto L_0x015d;
            case 57: goto L_0x014c;
            case 58: goto L_0x013b;
            case 59: goto L_0x012a;
            case 60: goto L_0x0115;
            case 61: goto L_0x0102;
            case 62: goto L_0x00f2;
            case 63: goto L_0x00e2;
            case 64: goto L_0x00d2;
            case 65: goto L_0x00c2;
            case 66: goto L_0x00b2;
            case 67: goto L_0x00a2;
            case 68: goto L_0x008e;
            default: goto L_0x0089;
        };
    L_0x0089:
        r12 = r16;
    L_0x008b:
        r14 = 0;
        goto L_0x0521;
    L_0x008e:
        r12 = r16;
        r9 = r0.a(r1, r13, r12);
        if (r9 == 0) goto L_0x008b;
    L_0x0096:
        r4 = r7.getObject(r1, r4);
        r5 = r0.a(r12);
        r2.b(r13, r4, r5);
        goto L_0x008b;
    L_0x00a2:
        r12 = r16;
        r9 = r0.a(r1, r13, r12);
        if (r9 == 0) goto L_0x008b;
    L_0x00aa:
        r4 = defpackage.anzh.e(r1, r4);
        r2.e(r13, r4);
        goto L_0x008b;
    L_0x00b2:
        r12 = r16;
        r9 = r0.a(r1, r13, r12);
        if (r9 == 0) goto L_0x008b;
    L_0x00ba:
        r4 = defpackage.anzh.d(r1, r4);
        r2.f(r13, r4);
        goto L_0x008b;
    L_0x00c2:
        r12 = r16;
        r9 = r0.a(r1, r13, r12);
        if (r9 == 0) goto L_0x008b;
    L_0x00ca:
        r4 = defpackage.anzh.e(r1, r4);
        r2.b(r13, r4);
        goto L_0x008b;
    L_0x00d2:
        r12 = r16;
        r9 = r0.a(r1, r13, r12);
        if (r9 == 0) goto L_0x008b;
    L_0x00da:
        r4 = defpackage.anzh.d(r1, r4);
        r2.a(r13, r4);
        goto L_0x008b;
    L_0x00e2:
        r12 = r16;
        r9 = r0.a(r1, r13, r12);
        if (r9 == 0) goto L_0x008b;
    L_0x00ea:
        r4 = defpackage.anzh.d(r1, r4);
        r2.b(r13, r4);
        goto L_0x008b;
    L_0x00f2:
        r12 = r16;
        r9 = r0.a(r1, r13, r12);
        if (r9 == 0) goto L_0x008b;
    L_0x00fa:
        r4 = defpackage.anzh.d(r1, r4);
        r2.e(r13, r4);
        goto L_0x008b;
    L_0x0102:
        r12 = r16;
        r9 = r0.a(r1, r13, r12);
        if (r9 == 0) goto L_0x008b;
    L_0x010a:
        r4 = r7.getObject(r1, r4);
        r4 = (defpackage.anvu) r4;
        r2.a(r13, r4);
        goto L_0x008b;
    L_0x0115:
        r12 = r16;
        r9 = r0.a(r1, r13, r12);
        if (r9 == 0) goto L_0x008b;
    L_0x011d:
        r4 = r7.getObject(r1, r4);
        r5 = r0.a(r12);
        r2.a(r13, r4, r5);
        goto L_0x008b;
    L_0x012a:
        r12 = r16;
        r9 = r0.a(r1, r13, r12);
        if (r9 == 0) goto L_0x008b;
    L_0x0132:
        r4 = r7.getObject(r1, r4);
        defpackage.anzh.a(r13, r4, r2);
        goto L_0x008b;
    L_0x013b:
        r12 = r16;
        r9 = r0.a(r1, r13, r12);
        if (r9 == 0) goto L_0x008b;
    L_0x0143:
        r4 = defpackage.anzh.f(r1, r4);
        r2.a(r13, r4);
        goto L_0x008b;
    L_0x014c:
        r12 = r16;
        r9 = r0.a(r1, r13, r12);
        if (r9 == 0) goto L_0x008b;
    L_0x0154:
        r4 = defpackage.anzh.d(r1, r4);
        r2.d(r13, r4);
        goto L_0x008b;
    L_0x015d:
        r12 = r16;
        r9 = r0.a(r1, r13, r12);
        if (r9 == 0) goto L_0x008b;
    L_0x0165:
        r4 = defpackage.anzh.e(r1, r4);
        r2.d(r13, r4);
        goto L_0x008b;
    L_0x016e:
        r12 = r16;
        r9 = r0.a(r1, r13, r12);
        if (r9 == 0) goto L_0x008b;
    L_0x0176:
        r4 = defpackage.anzh.d(r1, r4);
        r2.c(r13, r4);
        goto L_0x008b;
    L_0x017f:
        r12 = r16;
        r9 = r0.a(r1, r13, r12);
        if (r9 == 0) goto L_0x008b;
    L_0x0187:
        r4 = defpackage.anzh.e(r1, r4);
        r2.c(r13, r4);
        goto L_0x008b;
    L_0x0190:
        r12 = r16;
        r9 = r0.a(r1, r13, r12);
        if (r9 == 0) goto L_0x008b;
    L_0x0198:
        r4 = defpackage.anzh.e(r1, r4);
        r2.a(r13, r4);
        goto L_0x008b;
    L_0x01a1:
        r12 = r16;
        r9 = r0.a(r1, r13, r12);
        if (r9 == 0) goto L_0x008b;
    L_0x01a9:
        r4 = defpackage.anzh.c(r1, r4);
        r2.a(r13, r4);
        goto L_0x008b;
    L_0x01b2:
        r12 = r16;
        r9 = r0.a(r1, r13, r12);
        if (r9 == 0) goto L_0x008b;
    L_0x01ba:
        r4 = defpackage.anzh.b(r1, r4);
        r2.a(r13, r4);
        goto L_0x008b;
    L_0x01c3:
        r12 = r16;
        r4 = r7.getObject(r1, r4);
        r0.a(r2, r13, r4, r12);
        goto L_0x008b;
    L_0x01ce:
        r12 = r16;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        r5 = r0.a(r12);
        defpackage.aoab.b(r9, r4, r2, r5);
        goto L_0x008b;
    L_0x01e3:
        r12 = r16;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        r13 = 1;
        defpackage.aoab.e(r9, r4, r2, r13);
        goto L_0x008b;
    L_0x01f5:
        r12 = r16;
        r13 = 1;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.j(r9, r4, r2, r13);
        goto L_0x008b;
    L_0x0207:
        r12 = r16;
        r13 = 1;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.g(r9, r4, r2, r13);
        goto L_0x008b;
    L_0x0219:
        r12 = r16;
        r13 = 1;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.l(r9, r4, r2, r13);
        goto L_0x008b;
    L_0x022b:
        r12 = r16;
        r13 = 1;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.m(r9, r4, r2, r13);
        goto L_0x008b;
    L_0x023d:
        r12 = r16;
        r13 = 1;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.i(r9, r4, r2, r13);
        goto L_0x008b;
    L_0x024f:
        r12 = r16;
        r13 = 1;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.n(r9, r4, r2, r13);
        goto L_0x008b;
    L_0x0261:
        r12 = r16;
        r13 = 1;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.k(r9, r4, r2, r13);
        goto L_0x008b;
    L_0x0273:
        r12 = r16;
        r13 = 1;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.f(r9, r4, r2, r13);
        goto L_0x008b;
    L_0x0285:
        r12 = r16;
        r13 = 1;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.h(r9, r4, r2, r13);
        goto L_0x008b;
    L_0x0297:
        r12 = r16;
        r13 = 1;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.d(r9, r4, r2, r13);
        goto L_0x008b;
    L_0x02a9:
        r12 = r16;
        r13 = 1;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.c(r9, r4, r2, r13);
        goto L_0x008b;
    L_0x02bb:
        r12 = r16;
        r13 = 1;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.b(r9, r4, r2, r13);
        goto L_0x008b;
    L_0x02cd:
        r12 = r16;
        r13 = 1;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.a(r9, r4, r2, r13);
        goto L_0x008b;
    L_0x02df:
        r12 = r16;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        r13 = 0;
        defpackage.aoab.e(r9, r4, r2, r13);
        goto L_0x008b;
    L_0x02f1:
        r12 = r16;
        r13 = 0;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.j(r9, r4, r2, r13);
        goto L_0x008b;
    L_0x0303:
        r12 = r16;
        r13 = 0;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.g(r9, r4, r2, r13);
        goto L_0x008b;
    L_0x0315:
        r12 = r16;
        r13 = 0;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.l(r9, r4, r2, r13);
        goto L_0x008b;
    L_0x0327:
        r12 = r16;
        r13 = 0;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.m(r9, r4, r2, r13);
        goto L_0x008b;
    L_0x0339:
        r12 = r16;
        r13 = 0;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.i(r9, r4, r2, r13);
        goto L_0x008b;
    L_0x034b:
        r12 = r16;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.b(r9, r4, r2);
        goto L_0x008b;
    L_0x035c:
        r12 = r16;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        r5 = r0.a(r12);
        defpackage.aoab.a(r9, r4, r2, r5);
        goto L_0x008b;
    L_0x0371:
        r12 = r16;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.a(r9, r4, r2);
        goto L_0x008b;
    L_0x0382:
        r12 = r16;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        r14 = 0;
        defpackage.aoab.n(r9, r4, r2, r14);
        goto L_0x0521;
    L_0x0394:
        r12 = r16;
        r14 = 0;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.k(r9, r4, r2, r14);
        goto L_0x0521;
    L_0x03a6:
        r12 = r16;
        r14 = 0;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.f(r9, r4, r2, r14);
        goto L_0x0521;
    L_0x03b8:
        r12 = r16;
        r14 = 0;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.h(r9, r4, r2, r14);
        goto L_0x0521;
    L_0x03ca:
        r12 = r16;
        r14 = 0;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.d(r9, r4, r2, r14);
        goto L_0x0521;
    L_0x03dc:
        r12 = r16;
        r14 = 0;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.c(r9, r4, r2, r14);
        goto L_0x0521;
    L_0x03ee:
        r12 = r16;
        r14 = 0;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.b(r9, r4, r2, r14);
        goto L_0x0521;
    L_0x0400:
        r12 = r16;
        r14 = 0;
        r9 = r0.d(r12);
        r4 = r7.getObject(r1, r4);
        r4 = (java.util.List) r4;
        defpackage.aoab.a(r9, r4, r2, r14);
        goto L_0x0521;
    L_0x0412:
        r12 = r16;
        r14 = 0;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0521;
    L_0x0418:
        r4 = r7.getObject(r1, r4);
        r5 = r0.a(r12);
        r2.b(r13, r4, r5);
        goto L_0x0521;
    L_0x0425:
        r12 = r16;
        r14 = 0;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0521;
    L_0x042b:
        r4 = r7.getLong(r1, r4);
        r2.e(r13, r4);
        goto L_0x0521;
    L_0x0434:
        r12 = r16;
        r14 = 0;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0521;
    L_0x043a:
        r4 = r7.getInt(r1, r4);
        r2.f(r13, r4);
        goto L_0x0521;
    L_0x0443:
        r12 = r16;
        r14 = 0;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0521;
    L_0x0449:
        r4 = r7.getLong(r1, r4);
        r2.b(r13, r4);
        goto L_0x0521;
    L_0x0452:
        r12 = r16;
        r14 = 0;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0521;
    L_0x0458:
        r4 = r7.getInt(r1, r4);
        r2.a(r13, r4);
        goto L_0x0521;
    L_0x0461:
        r12 = r16;
        r14 = 0;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0521;
    L_0x0467:
        r4 = r7.getInt(r1, r4);
        r2.b(r13, r4);
        goto L_0x0521;
    L_0x0470:
        r12 = r16;
        r14 = 0;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0521;
    L_0x0476:
        r4 = r7.getInt(r1, r4);
        r2.e(r13, r4);
        goto L_0x0521;
    L_0x047f:
        r12 = r16;
        r14 = 0;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0521;
    L_0x0485:
        r4 = r7.getObject(r1, r4);
        r4 = (defpackage.anvu) r4;
        r2.a(r13, r4);
        goto L_0x0521;
    L_0x0490:
        r12 = r16;
        r14 = 0;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0521;
    L_0x0496:
        r4 = r7.getObject(r1, r4);
        r5 = r0.a(r12);
        r2.a(r13, r4, r5);
        goto L_0x0521;
    L_0x04a3:
        r12 = r16;
        r14 = 0;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0521;
    L_0x04a9:
        r4 = r7.getObject(r1, r4);
        defpackage.anzh.a(r13, r4, r2);
        goto L_0x0521;
    L_0x04b2:
        r12 = r16;
        r14 = 0;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0521;
    L_0x04b8:
        r4 = defpackage.aoax.c(r1, r4);
        r2.a(r13, r4);
        goto L_0x0521;
    L_0x04c0:
        r12 = r16;
        r14 = 0;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0521;
    L_0x04c6:
        r4 = r7.getInt(r1, r4);
        r2.d(r13, r4);
        goto L_0x0521;
    L_0x04ce:
        r12 = r16;
        r14 = 0;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0521;
    L_0x04d4:
        r4 = r7.getLong(r1, r4);
        r2.d(r13, r4);
        goto L_0x0521;
    L_0x04dc:
        r12 = r16;
        r14 = 0;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0521;
    L_0x04e2:
        r4 = r7.getInt(r1, r4);
        r2.c(r13, r4);
        goto L_0x0521;
    L_0x04ea:
        r12 = r16;
        r14 = 0;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0521;
    L_0x04f0:
        r4 = r7.getLong(r1, r4);
        r2.c(r13, r4);
        goto L_0x0521;
    L_0x04f8:
        r12 = r16;
        r14 = 0;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0521;
    L_0x04fe:
        r4 = r7.getLong(r1, r4);
        r2.a(r13, r4);
        goto L_0x0521;
    L_0x0506:
        r12 = r16;
        r14 = 0;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0521;
    L_0x050c:
        r4 = defpackage.aoax.d(r1, r4);
        r2.a(r13, r4);
        goto L_0x0521;
    L_0x0514:
        r12 = r16;
        r14 = 0;
        r9 = r9 & r10;
        if (r9 == 0) goto L_0x0521;
    L_0x051a:
        r4 = defpackage.aoax.e(r1, r4);
        r2.a(r13, r4);
    L_0x0521:
        r5 = r12 + 3;
        goto L_0x002c;
    L_0x0525:
        if (r11 == 0) goto L_0x053c;
    L_0x0527:
        r4 = r0.r;
        r4.a(r2, r11);
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x053a;
    L_0x0532:
        r4 = r3.next();
        r11 = r4;
        r11 = (java.util.Map.Entry) r11;
        goto L_0x0525;
    L_0x053a:
        r11 = 0;
        goto L_0x0525;
    L_0x053c:
        r3 = r0.q;
        defpackage.anzh.a(r3, r1, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anzh.b(java.lang.Object, aobl):void");
    }

    private final void a(aobl aobl, int i, Object obj, int i2) {
        if (obj != null) {
            anyv e = this.s.e(b(i2));
            Map b = this.s.b(obj);
            anwu anwu = (anwu) aobl;
            boolean z = anwu.a.g;
            for (Entry entry : b.entrySet()) {
                anwu.a.b(i, 2);
                anwu.a.e(anyw.a(e, entry.getKey(), entry.getValue()));
                anyw.a(anwu.a, e, entry.getKey(), entry.getValue());
            }
        }
    }

    private static void a(aoar aoar, Object obj, aobl aobl) {
        aoar.a(aoar.b(obj), aobl);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:118:0x059e */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:118|119|(1:121)|122|(5:173|124|(2:127|125)|255|(2:129|130))(1:251)) */
    /* JADX WARNING: Missing block: B:115:0x0594, code skipped:
            if (r10 == null) goto L_0x062c;
     */
    /* JADX WARNING: Missing block: B:116:0x0596, code skipped:
            r7.b(r13, r10);
     */
    /* JADX WARNING: Missing block: B:119:?, code skipped:
            r7.a();
     */
    /* JADX WARNING: Missing block: B:120:0x05a1, code skipped:
            if (r10 == null) goto L_0x05a3;
     */
    /* JADX WARNING: Missing block: B:121:0x05a3, code skipped:
            r10 = r7.c(r13);
     */
    /* JADX WARNING: Missing block: B:123:0x05ac, code skipped:
            if (r7.a(r10, r14) == false) goto L_0x05ae;
     */
    /* JADX WARNING: Missing block: B:124:0x05ae, code skipped:
            r14 = r12.m;
     */
    /* JADX WARNING: Missing block: B:126:0x05b2, code skipped:
            if (r14 < r12.n) goto L_0x05b4;
     */
    /* JADX WARNING: Missing block: B:127:0x05b4, code skipped:
            r10 = a(r13, r12.l[r14], r10, r7);
            r14 = r14 + 1;
     */
    /* JADX WARNING: Missing block: B:128:0x05bf, code skipped:
            if (r10 != null) goto L_0x05c1;
     */
    /* JADX WARNING: Missing block: B:129:0x05c1, code skipped:
            r7.b(r13, r10);
     */
    /* JADX WARNING: Missing block: B:130:0x05c4, code skipped:
            return;
     */
    public final void a(java.lang.Object r13, defpackage.anzt r14, defpackage.anxa r15) {
        /*
        r12 = this;
        if (r15 == 0) goto L_0x0644;
    L_0x0002:
        r7 = r12.q;
        r8 = r12.r;
        r9 = 0;
        r0 = r9;
        r10 = r0;
    L_0x0009:
        r1 = r14.a();	 Catch:{ all -> 0x059b }
        r2 = r12.j(r1);	 Catch:{ all -> 0x059b }
        if (r2 < 0) goto L_0x05c5;
    L_0x0013:
        r3 = r12.e(r2);	 Catch:{ all -> 0x059b }
        r4 = defpackage.anzh.g(r3);	 Catch:{ anyf -> 0x059e }
        switch(r4) {
            case 0: goto L_0x056c;
            case 1: goto L_0x055c;
            case 2: goto L_0x054c;
            case 3: goto L_0x053c;
            case 4: goto L_0x052c;
            case 5: goto L_0x051c;
            case 6: goto L_0x050c;
            case 7: goto L_0x04fc;
            case 8: goto L_0x04f4;
            case 9: goto L_0x04bd;
            case 10: goto L_0x04ad;
            case 11: goto L_0x049d;
            case 12: goto L_0x047a;
            case 13: goto L_0x046a;
            case 14: goto L_0x045a;
            case 15: goto L_0x044a;
            case 16: goto L_0x043a;
            case 17: goto L_0x0403;
            case 18: goto L_0x03f4;
            case 19: goto L_0x03e5;
            case 20: goto L_0x03d6;
            case 21: goto L_0x03c7;
            case 22: goto L_0x03b8;
            case 23: goto L_0x03a9;
            case 24: goto L_0x039a;
            case 25: goto L_0x038b;
            case 26: goto L_0x0367;
            case 27: goto L_0x0354;
            case 28: goto L_0x0345;
            case 29: goto L_0x0336;
            case 30: goto L_0x031f;
            case 31: goto L_0x0310;
            case 32: goto L_0x0301;
            case 33: goto L_0x02f2;
            case 34: goto L_0x02e3;
            case 35: goto L_0x02d4;
            case 36: goto L_0x02c5;
            case 37: goto L_0x02b6;
            case 38: goto L_0x02a7;
            case 39: goto L_0x0298;
            case 40: goto L_0x0289;
            case 41: goto L_0x027a;
            case 42: goto L_0x026b;
            case 43: goto L_0x025c;
            case 44: goto L_0x0245;
            case 45: goto L_0x0236;
            case 46: goto L_0x0227;
            case 47: goto L_0x0218;
            case 48: goto L_0x0209;
            case 49: goto L_0x01f6;
            case 50: goto L_0x01b1;
            case 51: goto L_0x019d;
            case 52: goto L_0x0189;
            case 53: goto L_0x0175;
            case 54: goto L_0x0161;
            case 55: goto L_0x014d;
            case 56: goto L_0x0139;
            case 57: goto L_0x0125;
            case 58: goto L_0x0111;
            case 59: goto L_0x0109;
            case 60: goto L_0x00d0;
            case 61: goto L_0x00c0;
            case 62: goto L_0x00ac;
            case 63: goto L_0x0085;
            case 64: goto L_0x0072;
            case 65: goto L_0x005f;
            case 66: goto L_0x004c;
            case 67: goto L_0x0039;
            case 68: goto L_0x0026;
            default: goto L_0x001e;
        };	 Catch:{ anyf -> 0x059e }
    L_0x001e:
        if (r10 != 0) goto L_0x057d;
    L_0x0020:
        r1 = r7.b();	 Catch:{ anyf -> 0x059e }
        goto L_0x057c;
    L_0x0026:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r12.a(r2);	 Catch:{ anyf -> 0x059e }
        r5 = r14.b(r5, r15);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r1, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0039:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r14.t();	 Catch:{ anyf -> 0x059e }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r1, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x004c:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r14.s();	 Catch:{ anyf -> 0x059e }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r1, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x005f:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r14.r();	 Catch:{ anyf -> 0x059e }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r1, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0072:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r14.q();	 Catch:{ anyf -> 0x059e }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r1, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0085:
        r4 = r14.p();	 Catch:{ anyf -> 0x059e }
        r5 = r12.c(r2);	 Catch:{ anyf -> 0x059e }
        if (r5 == 0) goto L_0x009c;
    L_0x008f:
        r5 = r5.isInRange(r4);	 Catch:{ anyf -> 0x059e }
        if (r5 == 0) goto L_0x0096;
    L_0x0095:
        goto L_0x009c;
    L_0x0096:
        r10 = defpackage.aoab.a(r1, r4, r10, r7);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x009c:
        r5 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r3 = java.lang.Integer.valueOf(r4);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r5, r3);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r1, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x00ac:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r14.o();	 Catch:{ anyf -> 0x059e }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r1, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x00c0:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r14.n();	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r1, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x00d0:
        r4 = r12.a(r13, r1, r2);	 Catch:{ anyf -> 0x059e }
        if (r4 == 0) goto L_0x00f2;
    L_0x00d6:
        r4 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r4 = defpackage.aoax.f(r13, r4);	 Catch:{ anyf -> 0x059e }
        r5 = r12.a(r2);	 Catch:{ anyf -> 0x059e }
        r5 = r14.a(r5, r15);	 Catch:{ anyf -> 0x059e }
        r4 = defpackage.anxw.a(r4, r5);	 Catch:{ anyf -> 0x059e }
        r5 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r5, r4);	 Catch:{ anyf -> 0x059e }
        goto L_0x0104;
    L_0x00f2:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r12.a(r2);	 Catch:{ anyf -> 0x059e }
        r5 = r14.a(r5, r15);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r2);	 Catch:{ anyf -> 0x059e }
    L_0x0104:
        r12.b(r13, r1, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0109:
        r12.a(r13, r3, r14);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r1, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0111:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r14.k();	 Catch:{ anyf -> 0x059e }
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r1, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0125:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r14.j();	 Catch:{ anyf -> 0x059e }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r1, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0139:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r14.i();	 Catch:{ anyf -> 0x059e }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r1, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x014d:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r14.h();	 Catch:{ anyf -> 0x059e }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r1, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0161:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r14.f();	 Catch:{ anyf -> 0x059e }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r1, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0175:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r14.g();	 Catch:{ anyf -> 0x059e }
        r5 = java.lang.Long.valueOf(r5);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r1, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0189:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r14.e();	 Catch:{ anyf -> 0x059e }
        r5 = java.lang.Float.valueOf(r5);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r1, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x019d:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r14.d();	 Catch:{ anyf -> 0x059e }
        r5 = java.lang.Double.valueOf(r5);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r1, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x01b1:
        r1 = r12.b(r2);	 Catch:{ anyf -> 0x059e }
        r2 = r12.e(r2);	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r2);	 Catch:{ anyf -> 0x059e }
        r4 = defpackage.aoax.f(r13, r2);	 Catch:{ anyf -> 0x059e }
        if (r4 != 0) goto L_0x01cd;
    L_0x01c3:
        r4 = r12.s;	 Catch:{ anyf -> 0x059e }
        r4 = r4.a();	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r2, r4);	 Catch:{ anyf -> 0x059e }
        goto L_0x01e5;
    L_0x01cd:
        r5 = r12.s;	 Catch:{ anyf -> 0x059e }
        r5 = r5.c(r4);	 Catch:{ anyf -> 0x059e }
        if (r5 != 0) goto L_0x01d6;
    L_0x01d5:
        goto L_0x01e5;
    L_0x01d6:
        r5 = r12.s;	 Catch:{ anyf -> 0x059e }
        r5 = r5.a();	 Catch:{ anyf -> 0x059e }
        r6 = r12.s;	 Catch:{ anyf -> 0x059e }
        r6.a(r5, r4);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r2, r5);	 Catch:{ anyf -> 0x059e }
        r4 = r5;
    L_0x01e5:
        r2 = r12.s;	 Catch:{ anyf -> 0x059e }
        r2 = r2.a(r4);	 Catch:{ anyf -> 0x059e }
        r3 = r12.s;	 Catch:{ anyf -> 0x059e }
        r1 = r3.e(r1);	 Catch:{ anyf -> 0x059e }
        r14.a(r2, r1, r15);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x01f6:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r12.a(r2);	 Catch:{ anyf -> 0x059e }
        r2 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = r2.a(r13, r3);	 Catch:{ anyf -> 0x059e }
        r14.b(r2, r1, r15);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0209:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.q(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0218:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.p(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0227:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.o(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0236:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.n(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0245:
        r4 = r12.p;	 Catch:{ anyf -> 0x059e }
        r5 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r3 = r4.a(r13, r5);	 Catch:{ anyf -> 0x059e }
        r14.m(r3);	 Catch:{ anyf -> 0x059e }
        r2 = r12.c(r2);	 Catch:{ anyf -> 0x059e }
        r10 = defpackage.aoab.a(r1, r3, r2, r10, r7);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x025c:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.l(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x026b:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.h(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x027a:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.g(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0289:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.f(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0298:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.e(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x02a7:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.c(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x02b6:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.d(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x02c5:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.b(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x02d4:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.a(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x02e3:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.q(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x02f2:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.p(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0301:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.o(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0310:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.n(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x031f:
        r4 = r12.p;	 Catch:{ anyf -> 0x059e }
        r5 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r3 = r4.a(r13, r5);	 Catch:{ anyf -> 0x059e }
        r14.m(r3);	 Catch:{ anyf -> 0x059e }
        r2 = r12.c(r2);	 Catch:{ anyf -> 0x059e }
        r10 = defpackage.aoab.a(r1, r3, r2, r10, r7);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0336:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.l(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0345:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.k(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0354:
        r1 = r12.a(r2);	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r4 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = r4.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.a(r2, r1, r15);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0367:
        r1 = defpackage.anzh.h(r3);	 Catch:{ anyf -> 0x059e }
        if (r1 == 0) goto L_0x037c;
    L_0x036d:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.j(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x037c:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.i(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x038b:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.h(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x039a:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.g(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x03a9:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.f(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x03b8:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.e(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x03c7:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.c(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x03d6:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.d(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x03e5:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.b(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x03f4:
        r1 = r12.p;	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r1.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        r14.a(r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0403:
        r1 = r12.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        if (r1 == 0) goto L_0x0426;
    L_0x0409:
        r4 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = defpackage.aoax.f(r13, r4);	 Catch:{ anyf -> 0x059e }
        r2 = r12.a(r2);	 Catch:{ anyf -> 0x059e }
        r2 = r14.b(r2, r15);	 Catch:{ anyf -> 0x059e }
        r1 = defpackage.anxw.a(r1, r2);	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r2, r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0426:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r12.a(r2);	 Catch:{ anyf -> 0x059e }
        r1 = r14.b(r1, r15);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r1);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x043a:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r14.t();	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x044a:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r14.s();	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r1);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x045a:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r14.r();	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x046a:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r14.q();	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r1);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x047a:
        r4 = r14.p();	 Catch:{ anyf -> 0x059e }
        r5 = r12.c(r2);	 Catch:{ anyf -> 0x059e }
        if (r5 == 0) goto L_0x0491;
    L_0x0484:
        r5 = r5.isInRange(r4);	 Catch:{ anyf -> 0x059e }
        if (r5 == 0) goto L_0x048b;
    L_0x048a:
        goto L_0x0491;
    L_0x048b:
        r10 = defpackage.aoab.a(r1, r4, r10, r7);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x0491:
        r5 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r5, r4);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x049d:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r14.o();	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r1);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x04ad:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r14.n();	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r1);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x04bd:
        r1 = r12.a(r13, r2);	 Catch:{ anyf -> 0x059e }
        if (r1 == 0) goto L_0x04e0;
    L_0x04c3:
        r4 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = defpackage.aoax.f(r13, r4);	 Catch:{ anyf -> 0x059e }
        r2 = r12.a(r2);	 Catch:{ anyf -> 0x059e }
        r2 = r14.a(r2, r15);	 Catch:{ anyf -> 0x059e }
        r1 = defpackage.anxw.a(r1, r2);	 Catch:{ anyf -> 0x059e }
        r2 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r2, r1);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x04e0:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r12.a(r2);	 Catch:{ anyf -> 0x059e }
        r1 = r14.a(r1, r15);	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r1);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x04f4:
        r12.a(r13, r3, r14);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x04fc:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r14.k();	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r1);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x050c:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r14.j();	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r1);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x051c:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r14.i();	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x052c:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r14.h();	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r1);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x053c:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r14.f();	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x054c:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r14.g();	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x055c:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r1 = r14.e();	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r1);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x056c:
        r3 = defpackage.anzh.i(r3);	 Catch:{ anyf -> 0x059e }
        r5 = r14.d();	 Catch:{ anyf -> 0x059e }
        defpackage.aoax.a(r13, r3, r5);	 Catch:{ anyf -> 0x059e }
        r12.b(r13, r2);	 Catch:{ anyf -> 0x059e }
        goto L_0x0009;
    L_0x057c:
        r10 = r1;
    L_0x057d:
        r1 = r7.a(r10, r14);	 Catch:{ anyf -> 0x059e }
        if (r1 != 0) goto L_0x0009;
    L_0x0583:
        r14 = r12.m;
    L_0x0585:
        r15 = r12.n;
        if (r14 >= r15) goto L_0x0594;
    L_0x0589:
        r15 = r12.l;
        r15 = r15[r14];
        r10 = r12.a(r13, r15, r10, r7);
        r14 = r14 + 1;
        goto L_0x0585;
    L_0x0594:
        if (r10 == 0) goto L_0x062c;
    L_0x0596:
        r7.b(r13, r10);
        goto L_0x062c;
    L_0x059b:
        r14 = move-exception;
        goto L_0x062d;
    L_0x059e:
        r7.a();	 Catch:{ all -> 0x059b }
        if (r10 != 0) goto L_0x05a8;
    L_0x05a3:
        r1 = r7.c(r13);	 Catch:{ all -> 0x059b }
        r10 = r1;
    L_0x05a8:
        r1 = r7.a(r10, r14);	 Catch:{ all -> 0x059b }
        if (r1 != 0) goto L_0x0009;
    L_0x05ae:
        r14 = r12.m;
    L_0x05b0:
        r15 = r12.n;
        if (r14 >= r15) goto L_0x05bf;
    L_0x05b4:
        r15 = r12.l;
        r15 = r15[r14];
        r10 = r12.a(r13, r15, r10, r7);
        r14 = r14 + 1;
        goto L_0x05b0;
    L_0x05bf:
        if (r10 == 0) goto L_0x062c;
    L_0x05c1:
        r7.b(r13, r10);
        return;
    L_0x05c5:
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r1 == r2) goto L_0x0616;
    L_0x05ca:
        r2 = r12.h;	 Catch:{ all -> 0x059b }
        if (r2 == 0) goto L_0x05d6;
    L_0x05ce:
        r2 = r12.g;	 Catch:{ all -> 0x059b }
        r1 = r8.a(r15, r2, r1);	 Catch:{ all -> 0x059b }
        r2 = r1;
        goto L_0x05d7;
    L_0x05d6:
        r2 = r9;
    L_0x05d7:
        if (r2 != 0) goto L_0x0602;
    L_0x05d9:
        r7.a();	 Catch:{ all -> 0x059b }
        if (r10 != 0) goto L_0x05e3;
    L_0x05de:
        r1 = r7.c(r13);	 Catch:{ all -> 0x059b }
        r10 = r1;
    L_0x05e3:
        r1 = r7.a(r10, r14);	 Catch:{ all -> 0x059b }
        if (r1 == 0) goto L_0x05eb;
    L_0x05e9:
        goto L_0x0009;
    L_0x05eb:
        r14 = r12.m;
    L_0x05ed:
        r15 = r12.n;
        if (r14 >= r15) goto L_0x05fc;
    L_0x05f1:
        r15 = r12.l;
        r15 = r15[r14];
        r10 = r12.a(r13, r15, r10, r7);
        r14 = r14 + 1;
        goto L_0x05ed;
    L_0x05fc:
        if (r10 == 0) goto L_0x062c;
    L_0x05fe:
        r7.b(r13, r10);
        return;
    L_0x0602:
        if (r0 != 0) goto L_0x0608;
    L_0x0604:
        r0 = r8.b(r13);	 Catch:{ all -> 0x059b }
    L_0x0608:
        r11 = r0;
        r0 = r8;
        r1 = r14;
        r3 = r15;
        r4 = r11;
        r5 = r10;
        r6 = r7;
        r10 = r0.a(r1, r2, r3, r4, r5, r6);	 Catch:{ all -> 0x059b }
        r0 = r11;
        goto L_0x0009;
    L_0x0616:
        r14 = r12.m;
    L_0x0618:
        r15 = r12.n;
        if (r14 >= r15) goto L_0x0627;
    L_0x061c:
        r15 = r12.l;
        r15 = r15[r14];
        r10 = r12.a(r13, r15, r10, r7);
        r14 = r14 + 1;
        goto L_0x0618;
    L_0x0627:
        if (r10 == 0) goto L_0x062c;
    L_0x0629:
        r7.b(r13, r10);
    L_0x062c:
        return;
    L_0x062d:
        r15 = r12.m;
    L_0x062f:
        r0 = r12.n;
        if (r15 >= r0) goto L_0x063e;
    L_0x0633:
        r0 = r12.l;
        r0 = r0[r15];
        r10 = r12.a(r13, r0, r10, r7);
        r15 = r15 + 1;
        goto L_0x062f;
    L_0x063e:
        if (r10 == 0) goto L_0x0643;
    L_0x0640:
        r7.b(r13, r10);
    L_0x0643:
        throw r14;
    L_0x0644:
        r13 = new java.lang.NullPointerException;
        r13.<init>();
        goto L_0x064b;
    L_0x064a:
        throw r13;
    L_0x064b:
        goto L_0x064a;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anzh.a(java.lang.Object, anzt, anxa):void");
    }

    private static aoau g(Object obj) {
        anxl anxl = (anxl) obj;
        aoau aoau = anxl.unknownFields;
        if (aoau != aoau.a) {
            return aoau;
        }
        aoau = aoau.a();
        anxl.unknownFields = aoau;
        return aoau;
    }

    /* JADX WARNING: Missing block: B:22:?, code skipped:
            return r2 + 8;
     */
    /* JADX WARNING: Missing block: B:31:?, code skipped:
            return r2 + 4;
     */
    private static int a(byte[] r1, int r2, int r3, defpackage.aobm r4, java.lang.Class r5, defpackage.anvo r6) {
        /*
        r4 = r4.ordinal();
        switch(r4) {
            case 0: goto L_0x009c;
            case 1: goto L_0x008f;
            case 2: goto L_0x0082;
            case 3: goto L_0x0082;
            case 4: goto L_0x0075;
            case 5: goto L_0x006a;
            case 6: goto L_0x005f;
            case 7: goto L_0x0049;
            case 8: goto L_0x0044;
            case 9: goto L_0x0007;
            case 10: goto L_0x0039;
            case 11: goto L_0x0033;
            case 12: goto L_0x0075;
            case 13: goto L_0x0075;
            case 14: goto L_0x005f;
            case 15: goto L_0x006a;
            case 16: goto L_0x0021;
            case 17: goto L_0x000f;
            default: goto L_0x0007;
        };
    L_0x0007:
        r1 = new java.lang.RuntimeException;
        r2 = "unsupported field type.";
        r1.<init>(r2);
        throw r1;
    L_0x000f:
        r1 = defpackage.anvl.b(r1, r2, r6);
        r2 = r6.b;
        r2 = defpackage.anwf.a(r2);
        r2 = java.lang.Long.valueOf(r2);
        r6.c = r2;
        goto L_0x00a8;
    L_0x0021:
        r1 = defpackage.anvl.a(r1, r2, r6);
        r2 = r6.a;
        r2 = defpackage.anwf.f(r2);
        r2 = java.lang.Integer.valueOf(r2);
        r6.c = r2;
        goto L_0x00a8;
    L_0x0033:
        r1 = defpackage.anvl.e(r1, r2, r6);
        goto L_0x00a8;
    L_0x0039:
        r4 = defpackage.anzs.a;
        r4 = r4.a(r5);
        r1 = defpackage.anvl.a(r4, r1, r2, r3, r6);
        goto L_0x00a8;
    L_0x0044:
        r1 = defpackage.anvl.d(r1, r2, r6);
        goto L_0x00a8;
    L_0x0049:
        r1 = defpackage.anvl.b(r1, r2, r6);
        r2 = r6.b;
        r4 = 0;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x0057;
    L_0x0055:
        r2 = 1;
        goto L_0x0058;
    L_0x0057:
        r2 = 0;
    L_0x0058:
        r2 = java.lang.Boolean.valueOf(r2);
        r6.c = r2;
        goto L_0x00a8;
    L_0x005f:
        r1 = defpackage.anvl.a(r1, r2);
        r1 = java.lang.Integer.valueOf(r1);
        r6.c = r1;
        goto L_0x0099;
    L_0x006a:
        r3 = defpackage.anvl.b(r1, r2);
        r1 = java.lang.Long.valueOf(r3);
        r6.c = r1;
        goto L_0x00a6;
    L_0x0075:
        r1 = defpackage.anvl.a(r1, r2, r6);
        r2 = r6.a;
        r2 = java.lang.Integer.valueOf(r2);
        r6.c = r2;
        goto L_0x00a8;
    L_0x0082:
        r1 = defpackage.anvl.b(r1, r2, r6);
        r2 = r6.b;
        r2 = java.lang.Long.valueOf(r2);
        r6.c = r2;
        goto L_0x00a8;
    L_0x008f:
        r1 = defpackage.anvl.d(r1, r2);
        r1 = java.lang.Float.valueOf(r1);
        r6.c = r1;
    L_0x0099:
        r1 = r2 + 4;
        goto L_0x00a8;
    L_0x009c:
        r3 = defpackage.anvl.c(r1, r2);
        r1 = java.lang.Double.valueOf(r3);
        r6.c = r1;
    L_0x00a6:
        r1 = r2 + 8;
    L_0x00a8:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anzh.a(byte[], int, int, aobm, java.lang.Class, anvo):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:94:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0153  */
    /* JADX WARNING: Missing block: B:154:0x02ab, code skipped:
            r1 = r2;
     */
    /* JADX WARNING: Missing block: B:242:0x0431, code skipped:
            return r1;
     */
    private final int a(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, defpackage.anvo r29) {
        /*
        r15 = this;
        r0 = r15;
        r1 = r16;
        r3 = r17;
        r4 = r18;
        r5 = r19;
        r2 = r20;
        r6 = r22;
        r8 = r23;
        r9 = r27;
        r7 = r29;
        r11 = b;
        r11 = r11.getObject(r1, r9);
        r11 = (defpackage.anyd) r11;
        r12 = r11.a();
        if (r12 != 0) goto L_0x0034;
    L_0x0021:
        r12 = r11.size();
        if (r12 == 0) goto L_0x0029;
    L_0x0027:
        r12 = r12 + r12;
        goto L_0x002b;
    L_0x0029:
        r12 = 10;
    L_0x002b:
        r11 = r11.a(r12);
        r12 = b;
        r12.putObject(r1, r9, r11);
    L_0x0034:
        r9 = 5;
        r12 = 0;
        r10 = 1;
        r14 = 2;
        switch(r26) {
            case 18: goto L_0x03d0;
            case 19: goto L_0x0390;
            case 20: goto L_0x034e;
            case 21: goto L_0x034e;
            case 22: goto L_0x0333;
            case 23: goto L_0x02f3;
            case 24: goto L_0x02b3;
            case 25: goto L_0x025a;
            case 26: goto L_0x01a7;
            case 27: goto L_0x018c;
            case 28: goto L_0x0131;
            case 29: goto L_0x0333;
            case 30: goto L_0x00fa;
            case 31: goto L_0x02b3;
            case 32: goto L_0x02f3;
            case 33: goto L_0x00ac;
            case 34: goto L_0x005e;
            case 35: goto L_0x03d0;
            case 36: goto L_0x0390;
            case 37: goto L_0x034e;
            case 38: goto L_0x034e;
            case 39: goto L_0x0333;
            case 40: goto L_0x02f3;
            case 41: goto L_0x02b3;
            case 42: goto L_0x025a;
            case 43: goto L_0x0333;
            case 44: goto L_0x00fa;
            case 45: goto L_0x02b3;
            case 46: goto L_0x02f3;
            case 47: goto L_0x00ac;
            case 48: goto L_0x005e;
            default: goto L_0x003c;
        };
    L_0x003c:
        r1 = 3;
        if (r6 != r1) goto L_0x0430;
    L_0x003f:
        r1 = r15.a(r8);
        r6 = r2 & -8;
        r6 = r6 | 4;
        r21 = r1;
        r22 = r17;
        r23 = r18;
        r24 = r19;
        r25 = r6;
        r26 = r29;
        r4 = defpackage.anvl.a(r21, r22, r23, r24, r25, r26);
        r8 = r7.c;
        r11.add(r8);
        goto L_0x040f;
    L_0x005e:
        if (r6 == r14) goto L_0x008a;
    L_0x0060:
        if (r6 != 0) goto L_0x0430;
    L_0x0062:
        r11 = (defpackage.anys) r11;
        r1 = defpackage.anvl.b(r3, r4, r7);
        r8 = r7.b;
        r8 = defpackage.anwf.a(r8);
        r11.a(r8);
    L_0x0071:
        if (r1 >= r5) goto L_0x0089;
    L_0x0073:
        r4 = defpackage.anvl.a(r3, r1, r7);
        r6 = r7.a;
        if (r2 != r6) goto L_0x0089;
    L_0x007b:
        r1 = defpackage.anvl.b(r3, r4, r7);
        r8 = r7.b;
        r8 = defpackage.anwf.a(r8);
        r11.a(r8);
        goto L_0x0071;
    L_0x0089:
        return r1;
    L_0x008a:
        r11 = (defpackage.anys) r11;
        r1 = defpackage.anvl.a(r3, r4, r7);
        r2 = r7.a;
        r2 = r2 + r1;
    L_0x0093:
        if (r1 >= r2) goto L_0x00a3;
    L_0x0095:
        r1 = defpackage.anvl.b(r3, r1, r7);
        r4 = r7.b;
        r4 = defpackage.anwf.a(r4);
        r11.a(r4);
        goto L_0x0093;
    L_0x00a3:
        if (r1 != r2) goto L_0x00a7;
    L_0x00a5:
        goto L_0x0431;
    L_0x00a7:
        r1 = defpackage.anyg.a();
        throw r1;
    L_0x00ac:
        if (r6 != r14) goto L_0x00d0;
    L_0x00ae:
        r11 = (defpackage.anxt) r11;
        r1 = defpackage.anvl.a(r3, r4, r7);
        r2 = r7.a;
        r2 = r2 + r1;
    L_0x00b7:
        if (r1 >= r2) goto L_0x00c7;
    L_0x00b9:
        r1 = defpackage.anvl.a(r3, r1, r7);
        r4 = r7.a;
        r4 = defpackage.anwf.f(r4);
        r11.d(r4);
        goto L_0x00b7;
    L_0x00c7:
        if (r1 != r2) goto L_0x00cb;
    L_0x00c9:
        goto L_0x0431;
    L_0x00cb:
        r1 = defpackage.anyg.a();
        throw r1;
    L_0x00d0:
        if (r6 != 0) goto L_0x0430;
    L_0x00d2:
        r11 = (defpackage.anxt) r11;
        r1 = defpackage.anvl.a(r3, r4, r7);
        r4 = r7.a;
        r4 = defpackage.anwf.f(r4);
        r11.d(r4);
    L_0x00e1:
        if (r1 >= r5) goto L_0x00f9;
    L_0x00e3:
        r4 = defpackage.anvl.a(r3, r1, r7);
        r6 = r7.a;
        if (r2 != r6) goto L_0x00f9;
    L_0x00eb:
        r1 = defpackage.anvl.a(r3, r4, r7);
        r4 = r7.a;
        r4 = defpackage.anwf.f(r4);
        r11.d(r4);
        goto L_0x00e1;
    L_0x00f9:
        return r1;
    L_0x00fa:
        if (r6 != r14) goto L_0x0101;
    L_0x00fc:
        r2 = defpackage.anvl.a(r3, r4, r11, r7);
        goto L_0x0112;
    L_0x0101:
        if (r6 != 0) goto L_0x0430;
    L_0x0103:
        r2 = r20;
        r3 = r17;
        r4 = r18;
        r5 = r19;
        r6 = r11;
        r7 = r29;
        r2 = defpackage.anvl.a(r2, r3, r4, r5, r6, r7);
    L_0x0112:
        r1 = (defpackage.anxl) r1;
        r3 = r1.unknownFields;
        r4 = defpackage.aoau.a;
        if (r3 == r4) goto L_0x011b;
    L_0x011a:
        goto L_0x011c;
    L_0x011b:
        r3 = 0;
    L_0x011c:
        r4 = r15.c(r8);
        r5 = r0.q;
        r6 = r21;
        r3 = defpackage.aoab.a(r6, r11, r4, r3, r5);
        r3 = (defpackage.aoau) r3;
        if (r3 != 0) goto L_0x012e;
    L_0x012c:
        goto L_0x02ab;
    L_0x012e:
        r1.unknownFields = r3;
        return r2;
    L_0x0131:
        if (r6 == r14) goto L_0x0135;
    L_0x0133:
        goto L_0x0430;
    L_0x0135:
        r1 = defpackage.anvl.a(r3, r4, r7);
        r4 = r7.a;
        if (r4 < 0) goto L_0x0187;
    L_0x013d:
        r6 = r3.length;
        r6 = r6 - r1;
        if (r4 > r6) goto L_0x0182;
    L_0x0141:
        if (r4 != 0) goto L_0x0149;
    L_0x0143:
        r4 = defpackage.anvu.a;
        r11.add(r4);
        goto L_0x0151;
    L_0x0149:
        r6 = defpackage.anvu.a(r3, r1, r4);
        r11.add(r6);
    L_0x0150:
        r1 = r1 + r4;
    L_0x0151:
        if (r1 >= r5) goto L_0x0181;
    L_0x0153:
        r4 = defpackage.anvl.a(r3, r1, r7);
        r6 = r7.a;
        if (r2 != r6) goto L_0x0181;
    L_0x015b:
        r1 = defpackage.anvl.a(r3, r4, r7);
        r4 = r7.a;
        if (r4 < 0) goto L_0x017c;
    L_0x0163:
        r6 = r3.length;
        r6 = r6 - r1;
        if (r4 > r6) goto L_0x0177;
    L_0x0167:
        if (r4 != 0) goto L_0x016f;
    L_0x0169:
        r4 = defpackage.anvu.a;
        r11.add(r4);
        goto L_0x0151;
    L_0x016f:
        r6 = defpackage.anvu.a(r3, r1, r4);
        r11.add(r6);
        goto L_0x0150;
    L_0x0177:
        r1 = defpackage.anyg.a();
        throw r1;
    L_0x017c:
        r1 = defpackage.anyg.b();
        throw r1;
    L_0x0181:
        return r1;
    L_0x0182:
        r1 = defpackage.anyg.a();
        throw r1;
    L_0x0187:
        r1 = defpackage.anyg.b();
        throw r1;
    L_0x018c:
        if (r6 == r14) goto L_0x0190;
    L_0x018e:
        goto L_0x0430;
    L_0x0190:
        r1 = r15.a(r8);
        r21 = r1;
        r22 = r20;
        r23 = r17;
        r24 = r18;
        r25 = r19;
        r26 = r11;
        r27 = r29;
        r1 = defpackage.anvl.a(r21, r22, r23, r24, r25, r26, r27);
        return r1;
    L_0x01a7:
        if (r6 != r14) goto L_0x0430;
    L_0x01a9:
        r8 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r8 = r24 & r8;
        r1 = "";
        r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
        if (r6 == 0) goto L_0x0214;
    L_0x01b4:
        r4 = defpackage.anvl.a(r3, r4, r7);
        r6 = r7.a;
        if (r6 < 0) goto L_0x020f;
    L_0x01bc:
        if (r6 != 0) goto L_0x01c2;
    L_0x01be:
        r11.add(r1);
        goto L_0x01d5;
    L_0x01c2:
        r8 = r4 + r6;
        r9 = defpackage.aobd.a(r3, r4, r8);
        if (r9 == 0) goto L_0x020a;
    L_0x01ca:
        r9 = new java.lang.String;
        r10 = defpackage.anxw.a;
        r9.<init>(r3, r4, r6, r10);
        r11.add(r9);
    L_0x01d4:
        r4 = r8;
    L_0x01d5:
        if (r4 >= r5) goto L_0x0430;
    L_0x01d7:
        r6 = defpackage.anvl.a(r3, r4, r7);
        r8 = r7.a;
        if (r2 != r8) goto L_0x0430;
    L_0x01df:
        r4 = defpackage.anvl.a(r3, r6, r7);
        r6 = r7.a;
        if (r6 < 0) goto L_0x0205;
    L_0x01e7:
        if (r6 != 0) goto L_0x01ed;
    L_0x01e9:
        r11.add(r1);
        goto L_0x01d5;
    L_0x01ed:
        r8 = r4 + r6;
        r9 = defpackage.aobd.a(r3, r4, r8);
        if (r9 == 0) goto L_0x0200;
    L_0x01f5:
        r9 = new java.lang.String;
        r10 = defpackage.anxw.a;
        r9.<init>(r3, r4, r6, r10);
        r11.add(r9);
        goto L_0x01d4;
    L_0x0200:
        r1 = defpackage.anyg.j();
        throw r1;
    L_0x0205:
        r1 = defpackage.anyg.b();
        throw r1;
    L_0x020a:
        r1 = defpackage.anyg.j();
        throw r1;
    L_0x020f:
        r1 = defpackage.anyg.b();
        throw r1;
    L_0x0214:
        r4 = defpackage.anvl.a(r3, r4, r7);
        r6 = r7.a;
        if (r6 < 0) goto L_0x0255;
    L_0x021c:
        if (r6 == 0) goto L_0x022a;
    L_0x021e:
        r8 = new java.lang.String;
        r9 = defpackage.anxw.a;
        r8.<init>(r3, r4, r6, r9);
        r11.add(r8);
    L_0x0228:
        r4 = r4 + r6;
        goto L_0x022d;
    L_0x022a:
        r11.add(r1);
    L_0x022d:
        if (r4 >= r5) goto L_0x0430;
    L_0x022f:
        r6 = defpackage.anvl.a(r3, r4, r7);
        r8 = r7.a;
        if (r2 != r8) goto L_0x0430;
    L_0x0237:
        r4 = defpackage.anvl.a(r3, r6, r7);
        r6 = r7.a;
        if (r6 < 0) goto L_0x0250;
    L_0x023f:
        if (r6 == 0) goto L_0x024c;
    L_0x0241:
        r8 = new java.lang.String;
        r9 = defpackage.anxw.a;
        r8.<init>(r3, r4, r6, r9);
        r11.add(r8);
        goto L_0x0228;
    L_0x024c:
        r11.add(r1);
        goto L_0x022d;
    L_0x0250:
        r1 = defpackage.anyg.b();
        throw r1;
    L_0x0255:
        r1 = defpackage.anyg.b();
        throw r1;
    L_0x025a:
        r1 = 0;
        if (r6 == r14) goto L_0x028d;
    L_0x025d:
        if (r6 != 0) goto L_0x0430;
    L_0x025f:
        r11 = (defpackage.anvs) r11;
        r4 = defpackage.anvl.b(r3, r4, r7);
        r8 = r7.b;
        r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
        if (r6 == 0) goto L_0x026d;
    L_0x026b:
        r6 = 1;
        goto L_0x026e;
    L_0x026d:
        r6 = 0;
    L_0x026e:
        r11.a(r6);
    L_0x0271:
        if (r4 >= r5) goto L_0x028c;
    L_0x0273:
        r6 = defpackage.anvl.a(r3, r4, r7);
        r8 = r7.a;
        if (r2 != r8) goto L_0x028c;
    L_0x027b:
        r4 = defpackage.anvl.b(r3, r6, r7);
        r8 = r7.b;
        r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
        if (r6 == 0) goto L_0x0287;
    L_0x0285:
        r6 = 1;
        goto L_0x0288;
    L_0x0287:
        r6 = 0;
    L_0x0288:
        r11.a(r6);
        goto L_0x0271;
    L_0x028c:
        return r4;
    L_0x028d:
        r11 = (defpackage.anvs) r11;
        r2 = defpackage.anvl.a(r3, r4, r7);
        r4 = r7.a;
        r4 = r4 + r2;
    L_0x0296:
        if (r2 >= r4) goto L_0x02a9;
    L_0x0298:
        r2 = defpackage.anvl.b(r3, r2, r7);
        r5 = r7.b;
        r8 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1));
        if (r8 == 0) goto L_0x02a4;
    L_0x02a2:
        r5 = 1;
        goto L_0x02a5;
    L_0x02a4:
        r5 = 0;
    L_0x02a5:
        r11.a(r5);
        goto L_0x0296;
    L_0x02a9:
        if (r2 != r4) goto L_0x02ae;
    L_0x02ab:
        r1 = r2;
        goto L_0x0431;
    L_0x02ae:
        r1 = defpackage.anyg.a();
        throw r1;
    L_0x02b3:
        if (r6 != r14) goto L_0x02d3;
    L_0x02b5:
        r11 = (defpackage.anxt) r11;
        r1 = defpackage.anvl.a(r3, r4, r7);
        r2 = r7.a;
        r2 = r2 + r1;
    L_0x02be:
        if (r1 >= r2) goto L_0x02ca;
    L_0x02c0:
        r4 = defpackage.anvl.a(r3, r1);
        r11.d(r4);
        r1 = r1 + 4;
        goto L_0x02be;
    L_0x02ca:
        if (r1 != r2) goto L_0x02ce;
    L_0x02cc:
        goto L_0x0431;
    L_0x02ce:
        r1 = defpackage.anyg.a();
        throw r1;
    L_0x02d3:
        if (r6 != r9) goto L_0x0430;
    L_0x02d5:
        r11 = (defpackage.anxt) r11;
        r1 = defpackage.anvl.a(r17, r18);
        r11.d(r1);
    L_0x02de:
        r1 = r4 + 4;
        if (r1 >= r5) goto L_0x02f2;
    L_0x02e2:
        r4 = defpackage.anvl.a(r3, r1, r7);
        r6 = r7.a;
        if (r2 != r6) goto L_0x02f2;
    L_0x02ea:
        r1 = defpackage.anvl.a(r3, r4);
        r11.d(r1);
        goto L_0x02de;
    L_0x02f2:
        return r1;
    L_0x02f3:
        if (r6 != r14) goto L_0x0313;
    L_0x02f5:
        r11 = (defpackage.anys) r11;
        r1 = defpackage.anvl.a(r3, r4, r7);
        r2 = r7.a;
        r2 = r2 + r1;
    L_0x02fe:
        if (r1 >= r2) goto L_0x030a;
    L_0x0300:
        r4 = defpackage.anvl.b(r3, r1);
        r11.a(r4);
        r1 = r1 + 8;
        goto L_0x02fe;
    L_0x030a:
        if (r1 != r2) goto L_0x030e;
    L_0x030c:
        goto L_0x0431;
    L_0x030e:
        r1 = defpackage.anyg.a();
        throw r1;
    L_0x0313:
        if (r6 != r10) goto L_0x0430;
    L_0x0315:
        r11 = (defpackage.anys) r11;
        r8 = defpackage.anvl.b(r17, r18);
        r11.a(r8);
    L_0x031e:
        r1 = r4 + 8;
        if (r1 >= r5) goto L_0x0332;
    L_0x0322:
        r4 = defpackage.anvl.a(r3, r1, r7);
        r6 = r7.a;
        if (r2 != r6) goto L_0x0332;
    L_0x032a:
        r8 = defpackage.anvl.b(r3, r4);
        r11.a(r8);
        goto L_0x031e;
    L_0x0332:
        return r1;
    L_0x0333:
        if (r6 != r14) goto L_0x033b;
    L_0x0335:
        r1 = defpackage.anvl.a(r3, r4, r11, r7);
        goto L_0x0431;
    L_0x033b:
        if (r6 == 0) goto L_0x033f;
    L_0x033d:
        goto L_0x0430;
    L_0x033f:
        r21 = r17;
        r22 = r18;
        r23 = r19;
        r24 = r11;
        r25 = r29;
        r1 = defpackage.anvl.a(r20, r21, r22, r23, r24, r25);
        return r1;
    L_0x034e:
        if (r6 == r14) goto L_0x0372;
    L_0x0350:
        if (r6 != 0) goto L_0x0430;
    L_0x0352:
        r11 = (defpackage.anys) r11;
        r1 = defpackage.anvl.b(r3, r4, r7);
        r8 = r7.b;
        r11.a(r8);
    L_0x035d:
        if (r1 >= r5) goto L_0x0371;
    L_0x035f:
        r4 = defpackage.anvl.a(r3, r1, r7);
        r6 = r7.a;
        if (r2 != r6) goto L_0x0371;
    L_0x0367:
        r1 = defpackage.anvl.b(r3, r4, r7);
        r8 = r7.b;
        r11.a(r8);
        goto L_0x035d;
    L_0x0371:
        return r1;
    L_0x0372:
        r11 = (defpackage.anys) r11;
        r1 = defpackage.anvl.a(r3, r4, r7);
        r2 = r7.a;
        r2 = r2 + r1;
    L_0x037b:
        if (r1 >= r2) goto L_0x0387;
    L_0x037d:
        r1 = defpackage.anvl.b(r3, r1, r7);
        r4 = r7.b;
        r11.a(r4);
        goto L_0x037b;
    L_0x0387:
        if (r1 != r2) goto L_0x038b;
    L_0x0389:
        goto L_0x0431;
    L_0x038b:
        r1 = defpackage.anyg.a();
        throw r1;
    L_0x0390:
        if (r6 != r14) goto L_0x03b0;
    L_0x0392:
        r11 = (defpackage.anxk) r11;
        r1 = defpackage.anvl.a(r3, r4, r7);
        r2 = r7.a;
        r2 = r2 + r1;
    L_0x039b:
        if (r1 >= r2) goto L_0x03a7;
    L_0x039d:
        r4 = defpackage.anvl.d(r3, r1);
        r11.a(r4);
        r1 = r1 + 4;
        goto L_0x039b;
    L_0x03a7:
        if (r1 != r2) goto L_0x03ab;
    L_0x03a9:
        goto L_0x0431;
    L_0x03ab:
        r1 = defpackage.anyg.a();
        throw r1;
    L_0x03b0:
        if (r6 != r9) goto L_0x0430;
    L_0x03b2:
        r11 = (defpackage.anxk) r11;
        r1 = defpackage.anvl.d(r17, r18);
        r11.a(r1);
    L_0x03bb:
        r1 = r4 + 4;
        if (r1 >= r5) goto L_0x03cf;
    L_0x03bf:
        r4 = defpackage.anvl.a(r3, r1, r7);
        r6 = r7.a;
        if (r2 != r6) goto L_0x03cf;
    L_0x03c7:
        r1 = defpackage.anvl.d(r3, r4);
        r11.a(r1);
        goto L_0x03bb;
    L_0x03cf:
        return r1;
    L_0x03d0:
        if (r6 != r14) goto L_0x03ef;
    L_0x03d2:
        r11 = (defpackage.anwt) r11;
        r1 = defpackage.anvl.a(r3, r4, r7);
        r2 = r7.a;
        r2 = r2 + r1;
    L_0x03db:
        if (r1 >= r2) goto L_0x03e7;
    L_0x03dd:
        r4 = defpackage.anvl.c(r3, r1);
        r11.a(r4);
        r1 = r1 + 8;
        goto L_0x03db;
    L_0x03e7:
        if (r1 != r2) goto L_0x03ea;
    L_0x03e9:
        goto L_0x0431;
    L_0x03ea:
        r1 = defpackage.anyg.a();
        throw r1;
    L_0x03ef:
        if (r6 != r10) goto L_0x0430;
    L_0x03f1:
        r11 = (defpackage.anwt) r11;
        r8 = defpackage.anvl.c(r17, r18);
        r11.a(r8);
    L_0x03fa:
        r1 = r4 + 8;
        if (r1 >= r5) goto L_0x040e;
    L_0x03fe:
        r4 = defpackage.anvl.a(r3, r1, r7);
        r6 = r7.a;
        if (r2 != r6) goto L_0x040e;
    L_0x0406:
        r8 = defpackage.anvl.c(r3, r4);
        r11.a(r8);
        goto L_0x03fa;
    L_0x040e:
        return r1;
    L_0x040f:
        if (r4 >= r5) goto L_0x042f;
    L_0x0411:
        r8 = defpackage.anvl.a(r3, r4, r7);
        r9 = r7.a;
        if (r2 != r9) goto L_0x042f;
    L_0x0419:
        r21 = r1;
        r22 = r17;
        r23 = r8;
        r24 = r19;
        r25 = r6;
        r26 = r29;
        r4 = defpackage.anvl.a(r21, r22, r23, r24, r25, r26);
        r8 = r7.c;
        r11.add(r8);
        goto L_0x040f;
    L_0x042f:
        return r4;
    L_0x0430:
        r1 = r4;
    L_0x0431:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anzh.a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, anvo):int");
    }

    private final int a(Object obj, byte[] bArr, int i, int i2, int i3, long j, anvo anvo) {
        Unsafe unsafe = b;
        Object b = b(i3);
        Object object = unsafe.getObject(obj, j);
        if (this.s.c(object)) {
            Object a = this.s.a();
            this.s.a(a, object);
            unsafe.putObject(obj, j, a);
            object = a;
        }
        anyv e = this.s.e(b);
        Map a2 = this.s.a(object);
        i = anvl.a(bArr, i, anvo);
        int i4 = anvo.a;
        if (i4 < 0 || i4 > i2 - i) {
            throw anyg.a();
        }
        i4 += i;
        Object obj2 = e.b;
        Object obj3 = e.d;
        while (i < i4) {
            int i5 = i + 1;
            i = bArr[i];
            if (i < 0) {
                i5 = anvl.a(i, bArr, i5, anvo);
                i = anvo.a;
            }
            int i6 = i5;
            i5 = i & 7;
            int i7 = i >>> 3;
            aobm aobm;
            if (i7 == 1) {
                aobm = e.a;
                if (i5 == aobm.j) {
                    i = anzh.a(bArr, i6, i2, aobm, null, anvo);
                    obj2 = anvo.c;
                }
            } else if (i7 == 2) {
                aobm = e.c;
                if (i5 == aobm.j) {
                    i = anzh.a(bArr, i6, i2, aobm, e.d.getClass(), anvo);
                    obj3 = anvo.c;
                }
            }
            i = anvl.a(i, bArr, i6, i2, anvo);
        }
        if (i == i4) {
            a2.put(obj2, obj3);
            return i4;
        }
        throw anyg.i();
    }

    private final int a(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, defpackage.anvo r29) {
        /*
        r16 = this;
        r0 = r16;
        r1 = r17;
        r3 = r18;
        r4 = r19;
        r2 = r21;
        r8 = r22;
        r5 = r23;
        r9 = r26;
        r6 = r28;
        r11 = r29;
        r12 = b;
        r7 = r0.c;
        r13 = r6 + 2;
        r7 = r7[r13];
        r13 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r7 = r7 & r13;
        r13 = (long) r7;
        r7 = 5;
        r15 = 2;
        switch(r25) {
            case 51: goto L_0x01ba;
            case 52: goto L_0x01a6;
            case 53: goto L_0x0192;
            case 54: goto L_0x0192;
            case 55: goto L_0x017e;
            case 56: goto L_0x0169;
            case 57: goto L_0x0154;
            case 58: goto L_0x0138;
            case 59: goto L_0x0104;
            case 60: goto L_0x00d6;
            case 61: goto L_0x00c5;
            case 62: goto L_0x017e;
            case 63: goto L_0x0096;
            case 64: goto L_0x0154;
            case 65: goto L_0x0169;
            case 66: goto L_0x007d;
            case 67: goto L_0x0064;
            case 68: goto L_0x0028;
            default: goto L_0x0026;
        };
    L_0x0026:
        goto L_0x01cf;
    L_0x0028:
        r7 = 3;
        if (r5 == r7) goto L_0x002d;
    L_0x002b:
        goto L_0x01cf;
    L_0x002d:
        r5 = r0.a(r6);
        r2 = r2 & -8;
        r6 = r2 | 4;
        r2 = r5;
        r3 = r18;
        r4 = r19;
        r5 = r20;
        r7 = r29;
        r2 = defpackage.anvl.a(r2, r3, r4, r5, r6, r7);
        r3 = r12.getInt(r1, r13);
        if (r3 != r8) goto L_0x004d;
    L_0x0048:
        r15 = r12.getObject(r1, r9);
        goto L_0x004e;
    L_0x004d:
        r15 = 0;
    L_0x004e:
        if (r15 != 0) goto L_0x0056;
    L_0x0050:
        r3 = r11.c;
        r12.putObject(r1, r9, r3);
        goto L_0x005f;
    L_0x0056:
        r3 = r11.c;
        r3 = defpackage.anxw.a(r15, r3);
        r12.putObject(r1, r9, r3);
    L_0x005f:
        r12.putInt(r1, r13, r8);
        goto L_0x01d0;
    L_0x0064:
        if (r5 == 0) goto L_0x0068;
    L_0x0066:
        goto L_0x01cf;
    L_0x0068:
        r2 = defpackage.anvl.b(r3, r4, r11);
        r3 = r11.b;
        r3 = defpackage.anwf.a(r3);
        r3 = java.lang.Long.valueOf(r3);
        r12.putObject(r1, r9, r3);
        r12.putInt(r1, r13, r8);
        return r2;
    L_0x007d:
        if (r5 == 0) goto L_0x0081;
    L_0x007f:
        goto L_0x01cf;
    L_0x0081:
        r2 = defpackage.anvl.a(r3, r4, r11);
        r3 = r11.a;
        r3 = defpackage.anwf.f(r3);
        r3 = java.lang.Integer.valueOf(r3);
        r12.putObject(r1, r9, r3);
        r12.putInt(r1, r13, r8);
        return r2;
    L_0x0096:
        if (r5 != 0) goto L_0x01cf;
    L_0x0098:
        r3 = defpackage.anvl.a(r3, r4, r11);
        r4 = r11.a;
        r5 = r0.c(r6);
        if (r5 == 0) goto L_0x00b8;
    L_0x00a4:
        r5 = r5.isInRange(r4);
        if (r5 == 0) goto L_0x00ab;
    L_0x00aa:
        goto L_0x00b8;
    L_0x00ab:
        r1 = defpackage.anzh.g(r17);
        r4 = (long) r4;
        r4 = java.lang.Long.valueOf(r4);
        r1.a(r2, r4);
        goto L_0x00c2;
    L_0x00b8:
        r2 = java.lang.Integer.valueOf(r4);
        r12.putObject(r1, r9, r2);
        r12.putInt(r1, r13, r8);
    L_0x00c2:
        r2 = r3;
        goto L_0x01d0;
    L_0x00c5:
        if (r5 == r15) goto L_0x00c9;
    L_0x00c7:
        goto L_0x01cf;
    L_0x00c9:
        r2 = defpackage.anvl.e(r3, r4, r11);
        r3 = r11.c;
        r12.putObject(r1, r9, r3);
        r12.putInt(r1, r13, r8);
        return r2;
    L_0x00d6:
        if (r5 != r15) goto L_0x01cf;
    L_0x00d8:
        r2 = r0.a(r6);
        r5 = r20;
        r2 = defpackage.anvl.a(r2, r3, r4, r5, r11);
        r3 = r12.getInt(r1, r13);
        if (r3 != r8) goto L_0x00ed;
    L_0x00e8:
        r15 = r12.getObject(r1, r9);
        goto L_0x00ee;
    L_0x00ed:
        r15 = 0;
    L_0x00ee:
        if (r15 != 0) goto L_0x00f6;
    L_0x00f0:
        r3 = r11.c;
        r12.putObject(r1, r9, r3);
        goto L_0x00ff;
    L_0x00f6:
        r3 = r11.c;
        r3 = defpackage.anxw.a(r15, r3);
        r12.putObject(r1, r9, r3);
    L_0x00ff:
        r12.putInt(r1, r13, r8);
        goto L_0x01d0;
    L_0x0104:
        if (r5 != r15) goto L_0x01cf;
    L_0x0106:
        r2 = defpackage.anvl.a(r3, r4, r11);
        r4 = r11.a;
        if (r4 != 0) goto L_0x0114;
    L_0x010e:
        r3 = "";
        r12.putObject(r1, r9, r3);
        goto L_0x0133;
    L_0x0114:
        r5 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r5 = r24 & r5;
        if (r5 == 0) goto L_0x0128;
    L_0x011a:
        r5 = r2 + r4;
        r5 = defpackage.aobd.a(r3, r2, r5);
        if (r5 == 0) goto L_0x0123;
    L_0x0122:
        goto L_0x0128;
    L_0x0123:
        r1 = defpackage.anyg.j();
        throw r1;
    L_0x0128:
        r5 = new java.lang.String;
        r6 = defpackage.anxw.a;
        r5.<init>(r3, r2, r4, r6);
        r12.putObject(r1, r9, r5);
        r2 = r2 + r4;
    L_0x0133:
        r12.putInt(r1, r13, r8);
        goto L_0x01d0;
    L_0x0138:
        if (r5 != 0) goto L_0x01cf;
    L_0x013a:
        r2 = defpackage.anvl.b(r3, r4, r11);
        r3 = r11.b;
        r5 = 0;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x0148;
    L_0x0146:
        r15 = 1;
        goto L_0x0149;
    L_0x0148:
        r15 = 0;
    L_0x0149:
        r3 = java.lang.Boolean.valueOf(r15);
        r12.putObject(r1, r9, r3);
        r12.putInt(r1, r13, r8);
        return r2;
    L_0x0154:
        if (r5 == r7) goto L_0x0158;
    L_0x0156:
        goto L_0x01cf;
    L_0x0158:
        r2 = defpackage.anvl.a(r18, r19);
        r2 = java.lang.Integer.valueOf(r2);
        r12.putObject(r1, r9, r2);
        r12.putInt(r1, r13, r8);
        r1 = r4 + 4;
        return r1;
    L_0x0169:
        r2 = 1;
        if (r5 == r2) goto L_0x016d;
    L_0x016c:
        goto L_0x01cf;
    L_0x016d:
        r2 = defpackage.anvl.b(r18, r19);
        r2 = java.lang.Long.valueOf(r2);
        r12.putObject(r1, r9, r2);
        r12.putInt(r1, r13, r8);
        r1 = r4 + 8;
        return r1;
    L_0x017e:
        if (r5 == 0) goto L_0x0181;
    L_0x0180:
        goto L_0x01cf;
    L_0x0181:
        r2 = defpackage.anvl.a(r3, r4, r11);
        r3 = r11.a;
        r3 = java.lang.Integer.valueOf(r3);
        r12.putObject(r1, r9, r3);
        r12.putInt(r1, r13, r8);
        return r2;
    L_0x0192:
        if (r5 == 0) goto L_0x0195;
    L_0x0194:
        goto L_0x01cf;
    L_0x0195:
        r2 = defpackage.anvl.b(r3, r4, r11);
        r3 = r11.b;
        r3 = java.lang.Long.valueOf(r3);
        r12.putObject(r1, r9, r3);
        r12.putInt(r1, r13, r8);
        return r2;
    L_0x01a6:
        if (r5 == r7) goto L_0x01a9;
    L_0x01a8:
        goto L_0x01cf;
    L_0x01a9:
        r2 = defpackage.anvl.d(r18, r19);
        r2 = java.lang.Float.valueOf(r2);
        r12.putObject(r1, r9, r2);
        r12.putInt(r1, r13, r8);
        r1 = r4 + 4;
        return r1;
    L_0x01ba:
        r2 = 1;
        if (r5 == r2) goto L_0x01be;
    L_0x01bd:
        goto L_0x01cf;
    L_0x01be:
        r2 = defpackage.anvl.c(r18, r19);
        r2 = java.lang.Double.valueOf(r2);
        r12.putObject(r1, r9, r2);
        r12.putInt(r1, r13, r8);
        r1 = r4 + 8;
        return r1;
    L_0x01cf:
        r2 = r4;
    L_0x01d0:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anzh.a(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, anvo):int");
    }

    private final anzz a(int i) {
        i /= 3;
        i += i;
        anzz anzz = (anzz) this.d[i];
        if (anzz != null) {
            return anzz;
        }
        anzz = anzs.a.a((Class) this.d[i + 1]);
        this.d[i] = anzz;
        return anzz;
    }

    private final Object b(int i) {
        i /= 3;
        return this.d[i + i];
    }

    private final anxx c(int i) {
        i /= 3;
        return (anxx) this.d[(i + i) + 1];
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:25:0x0087, code skipped:
            r12 = r34;
            r11 = r36;
            r5 = r4;
            r35 = r7;
            r13 = r18;
            r27 = r23;
            r23 = r1;
     */
    /* JADX WARNING: Missing block: B:51:0x0163, code skipped:
            r6 = r6 | r25;
     */
    /* JADX WARNING: Missing block: B:52:0x0165, code skipped:
            r11 = r37;
            r1 = r7;
            r2 = r8;
            r3 = r13;
            r7 = r35;
            r13 = r36;
     */
    /* JADX WARNING: Missing block: B:53:0x0170, code skipped:
            r11 = r36;
            r5 = r4;
            r27 = r7;
            r23 = r8;
     */
    /* JADX WARNING: Missing block: B:75:0x01f8, code skipped:
            r6 = r6 | r25;
            r1 = r7;
            r2 = r8;
            r3 = r13;
            r7 = r35;
     */
    /* JADX WARNING: Missing block: B:76:0x0201, code skipped:
            r5 = r4;
            r27 = r7;
            r23 = r8;
     */
    /* JADX WARNING: Missing block: B:83:0x0248, code skipped:
            r5 = r4;
     */
    /* JADX WARNING: Missing block: B:97:0x02c9, code skipped:
            r6 = r6 | r25;
            r7 = r35;
            r3 = r13;
     */
    /* JADX WARNING: Missing block: B:98:0x02ce, code skipped:
            r2 = r23;
            r1 = r27;
     */
    /* JADX WARNING: Missing block: B:99:0x02d2, code skipped:
            r13 = r11;
     */
    /* JADX WARNING: Missing block: B:100:0x02d3, code skipped:
            r11 = r37;
     */
    /* JADX WARNING: Missing block: B:101:0x02d7, code skipped:
            r22 = r35;
            r2 = r5;
            r28 = r6;
            r8 = r10;
            r7 = r14;
            r9 = r15;
            r24 = r23;
            r10 = r27;
            r18 = true;
            r6 = r37;
            r23 = r13;
     */
    /* JADX WARNING: Missing block: B:107:0x0337, code skipped:
            if (r0 == r15) goto L_0x0339;
     */
    /* JADX WARNING: Missing block: B:109:0x0346, code skipped:
            r15 = r32;
            r14 = r33;
            r12 = r34;
            r13 = r36;
            r11 = r37;
            r9 = r38;
            r7 = r22;
            r3 = r23;
            r2 = r24;
            r1 = r27;
            r6 = r28;
            r10 = r31;
     */
    /* JADX WARNING: Missing block: B:113:0x0394, code skipped:
            if (r0 == r15) goto L_0x0339;
     */
    /* JADX WARNING: Missing block: B:117:0x03af, code skipped:
            if (r0 == r15) goto L_0x0339;
     */
    /* JADX WARNING: Missing block: B:153:0x04bb, code skipped:
            r0 = r17;
     */
    /* JADX WARNING: Missing block: B:173:0x059a, code skipped:
            r2 = r2 + 4;
     */
    /* JADX WARNING: Missing block: B:175:0x05aa, code skipped:
            r2 = r2 + 8;
     */
    public final int a(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, defpackage.anvo r38) {
        /*
        r32 = this;
        r15 = r32;
        r14 = r33;
        r12 = r34;
        r13 = r36;
        r11 = r37;
        r9 = r38;
        r10 = b;
        r16 = 0;
        r0 = r35;
        r1 = 0;
        r2 = -1;
        r3 = 0;
        r6 = 0;
        r7 = -1;
    L_0x0017:
        r17 = 0;
        if (r0 >= r13) goto L_0x05fe;
    L_0x001b:
        r1 = r0 + 1;
        r0 = r12[r0];
        if (r0 >= 0) goto L_0x002a;
    L_0x0021:
        r0 = defpackage.anvl.a(r0, r12, r1, r9);
        r1 = r9.a;
        r4 = r0;
        r5 = r1;
        goto L_0x002c;
    L_0x002a:
        r5 = r0;
        r4 = r1;
    L_0x002c:
        r1 = r5 >>> 3;
        r0 = r5 & 7;
        r8 = 3;
        if (r1 <= r2) goto L_0x0039;
    L_0x0033:
        r3 = r3 / r8;
        r2 = r15.a(r1, r3);
        goto L_0x003d;
    L_0x0039:
        r2 = r15.j(r1);
    L_0x003d:
        r3 = r2;
        r19 = 0;
        r2 = -1;
        if (r3 == r2) goto L_0x0420;
    L_0x0043:
        r2 = r15.c;
        r22 = r3 + 1;
        r2 = r2[r22];
        r8 = defpackage.anzh.g(r2);
        r11 = defpackage.anzh.i(r2);
        r23 = r5;
        r5 = 17;
        r24 = r2;
        if (r8 > r5) goto L_0x02eb;
    L_0x0059:
        r5 = r15.c;
        r25 = r3 + 2;
        r5 = r5[r25];
        r25 = r5 >>> 20;
        r22 = 1;
        r25 = r22 << r25;
        r26 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r5 = r5 & r26;
        if (r5 != r7) goto L_0x0070;
    L_0x006c:
        r18 = r3;
        r13 = -1;
        goto L_0x0083;
    L_0x0070:
        r13 = -1;
        if (r7 != r13) goto L_0x0076;
    L_0x0073:
        r18 = r3;
        goto L_0x007c;
    L_0x0076:
        r18 = r3;
        r2 = (long) r7;
        r10.putInt(r14, r2, r6);
    L_0x007c:
        r2 = (long) r5;
        r2 = r10.getInt(r14, r2);
        r6 = r2;
        r7 = r5;
    L_0x0083:
        r2 = 5;
        switch(r8) {
            case 0: goto L_0x02ad;
            case 1: goto L_0x028f;
            case 2: goto L_0x0268;
            case 3: goto L_0x0268;
            case 4: goto L_0x024b;
            case 5: goto L_0x0224;
            case 6: goto L_0x0208;
            case 7: goto L_0x01d8;
            case 8: goto L_0x01b2;
            case 9: goto L_0x017c;
            case 10: goto L_0x014d;
            case 11: goto L_0x024b;
            case 12: goto L_0x011d;
            case 13: goto L_0x0208;
            case 14: goto L_0x0224;
            case 15: goto L_0x0103;
            case 16: goto L_0x00d7;
            case 17: goto L_0x0099;
            default: goto L_0x0087;
        };
    L_0x0087:
        r12 = r34;
        r11 = r36;
        r5 = r4;
        r35 = r7;
        r13 = r18;
        r27 = r23;
        r4 = 1;
        r18 = -1;
        r23 = r1;
        goto L_0x02d7;
    L_0x0099:
        r3 = 3;
        if (r0 == r3) goto L_0x009d;
    L_0x009c:
        goto L_0x0087;
    L_0x009d:
        r3 = r18;
        r0 = r15.a(r3);
        r2 = r1 << 3;
        r5 = r2 | 4;
        r8 = r1;
        r1 = r34;
        r2 = r4;
        r4 = r3;
        r3 = r36;
        r13 = r4;
        r4 = r5;
        r35 = r7;
        r7 = r23;
        r5 = r38;
        r0 = defpackage.anvl.a(r0, r1, r2, r3, r4, r5);
        r1 = r6 & r25;
        if (r1 != 0) goto L_0x00c4;
    L_0x00be:
        r1 = r9.c;
        r10.putObject(r14, r11, r1);
        goto L_0x00d1;
    L_0x00c4:
        r1 = r10.getObject(r14, r11);
        r2 = r9.c;
        r1 = defpackage.anxw.a(r1, r2);
        r10.putObject(r14, r11, r1);
    L_0x00d1:
        r6 = r6 | r25;
        r12 = r34;
        goto L_0x0165;
    L_0x00d7:
        r8 = r1;
        r35 = r7;
        r13 = r18;
        r7 = r23;
        if (r0 != 0) goto L_0x00ff;
    L_0x00e0:
        r2 = r11;
        r12 = r34;
        r11 = defpackage.anvl.b(r12, r4, r9);
        r0 = r9.b;
        r4 = defpackage.anwf.a(r0);
        r0 = r10;
        r1 = r33;
        r0.putLong(r1, r2, r4);
        r6 = r6 | r25;
        r1 = r7;
        r2 = r8;
        r0 = r11;
        r3 = r13;
        r7 = r35;
        r13 = r36;
        goto L_0x02d3;
    L_0x00ff:
        r12 = r34;
        goto L_0x0170;
    L_0x0103:
        r8 = r1;
        r35 = r7;
        r2 = r11;
        r13 = r18;
        r7 = r23;
        r12 = r34;
        if (r0 != 0) goto L_0x0170;
    L_0x010f:
        r0 = defpackage.anvl.a(r12, r4, r9);
        r1 = r9.a;
        r1 = defpackage.anwf.f(r1);
        r10.putInt(r14, r2, r1);
        goto L_0x0163;
    L_0x011d:
        r8 = r1;
        r35 = r7;
        r2 = r11;
        r13 = r18;
        r7 = r23;
        r12 = r34;
        if (r0 != 0) goto L_0x0170;
    L_0x0129:
        r0 = defpackage.anvl.a(r12, r4, r9);
        r1 = r9.a;
        r4 = r15.c(r13);
        if (r4 == 0) goto L_0x0149;
    L_0x0135:
        r4 = r4.isInRange(r1);
        if (r4 == 0) goto L_0x013c;
    L_0x013b:
        goto L_0x0149;
    L_0x013c:
        r2 = defpackage.anzh.g(r33);
        r3 = (long) r1;
        r1 = java.lang.Long.valueOf(r3);
        r2.a(r7, r1);
        goto L_0x0165;
    L_0x0149:
        r10.putInt(r14, r2, r1);
        goto L_0x0163;
    L_0x014d:
        r8 = r1;
        r35 = r7;
        r2 = r11;
        r13 = r18;
        r7 = r23;
        r1 = 2;
        r12 = r34;
        if (r0 != r1) goto L_0x0170;
    L_0x015a:
        r0 = defpackage.anvl.e(r12, r4, r9);
        r1 = r9.c;
        r10.putObject(r14, r2, r1);
    L_0x0163:
        r6 = r6 | r25;
    L_0x0165:
        r11 = r37;
        r1 = r7;
        r2 = r8;
        r3 = r13;
        r7 = r35;
        r13 = r36;
        goto L_0x0017;
    L_0x0170:
        r11 = r36;
        r5 = r4;
        r27 = r7;
        r23 = r8;
        r4 = 1;
        r18 = -1;
        goto L_0x02d7;
    L_0x017c:
        r8 = r1;
        r35 = r7;
        r2 = r11;
        r13 = r18;
        r7 = r23;
        r1 = 2;
        r12 = r34;
        if (r0 != r1) goto L_0x01ad;
    L_0x0189:
        r0 = r15.a(r13);
        r11 = r36;
        r18 = -1;
        r0 = defpackage.anvl.a(r0, r12, r4, r11, r9);
        r1 = r6 & r25;
        if (r1 != 0) goto L_0x019f;
    L_0x0199:
        r1 = r9.c;
        r10.putObject(r14, r2, r1);
        goto L_0x01f8;
    L_0x019f:
        r1 = r10.getObject(r14, r2);
        r4 = r9.c;
        r1 = defpackage.anxw.a(r1, r4);
        r10.putObject(r14, r2, r1);
        goto L_0x01f8;
    L_0x01ad:
        r11 = r36;
        r18 = -1;
        goto L_0x0201;
    L_0x01b2:
        r8 = r1;
        r35 = r7;
        r2 = r11;
        r13 = r18;
        r7 = r23;
        r1 = 2;
        r18 = -1;
        r12 = r34;
        r11 = r36;
        if (r0 != r1) goto L_0x0201;
    L_0x01c3:
        r0 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r0 = r24 & r0;
        if (r0 == 0) goto L_0x01ce;
    L_0x01c9:
        r0 = defpackage.anvl.d(r12, r4, r9);
        goto L_0x01d2;
    L_0x01ce:
        r0 = defpackage.anvl.c(r12, r4, r9);
    L_0x01d2:
        r1 = r9.c;
        r10.putObject(r14, r2, r1);
        goto L_0x01f8;
    L_0x01d8:
        r8 = r1;
        r35 = r7;
        r2 = r11;
        r13 = r18;
        r7 = r23;
        r18 = -1;
        r12 = r34;
        r11 = r36;
        if (r0 != 0) goto L_0x0201;
    L_0x01e8:
        r0 = defpackage.anvl.b(r12, r4, r9);
        r4 = r9.b;
        r1 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1));
        if (r1 == 0) goto L_0x01f4;
    L_0x01f2:
        r1 = 1;
        goto L_0x01f5;
    L_0x01f4:
        r1 = 0;
    L_0x01f5:
        defpackage.aoax.a(r14, r2, r1);
    L_0x01f8:
        r6 = r6 | r25;
        r1 = r7;
        r2 = r8;
        r3 = r13;
        r7 = r35;
        goto L_0x02d2;
    L_0x0201:
        r5 = r4;
        r27 = r7;
        r23 = r8;
        goto L_0x02ab;
    L_0x0208:
        r35 = r7;
        r7 = r11;
        r13 = r18;
        r27 = r23;
        r18 = -1;
        r12 = r34;
        r11 = r36;
        r23 = r1;
        if (r0 != r2) goto L_0x0248;
    L_0x0219:
        r0 = defpackage.anvl.a(r12, r4);
        r10.putInt(r14, r7, r0);
        r0 = r4 + 4;
        goto L_0x02c9;
    L_0x0224:
        r35 = r7;
        r7 = r11;
        r13 = r18;
        r27 = r23;
        r18 = -1;
        r12 = r34;
        r11 = r36;
        r23 = r1;
        r1 = 1;
        if (r0 != r1) goto L_0x0248;
    L_0x0236:
        r19 = defpackage.anvl.b(r12, r4);
        r0 = r10;
        r1 = r33;
        r2 = r7;
        r7 = r4;
        r4 = r19;
        r0.putLong(r1, r2, r4);
        r0 = r7 + 8;
        goto L_0x02c9;
    L_0x0248:
        r5 = r4;
        goto L_0x02ab;
    L_0x024b:
        r5 = r4;
        r35 = r7;
        r7 = r11;
        r13 = r18;
        r27 = r23;
        r18 = -1;
        r12 = r34;
        r11 = r36;
        r23 = r1;
        if (r0 != 0) goto L_0x02ab;
    L_0x025d:
        r0 = defpackage.anvl.a(r12, r5, r9);
        r1 = r9.a;
        r10.putInt(r14, r7, r1);
        goto L_0x02c9;
    L_0x0268:
        r5 = r4;
        r35 = r7;
        r7 = r11;
        r13 = r18;
        r27 = r23;
        r18 = -1;
        r12 = r34;
        r11 = r36;
        r23 = r1;
        if (r0 != 0) goto L_0x02ab;
    L_0x027a:
        r17 = defpackage.anvl.b(r12, r5, r9);
        r4 = r9.b;
        r0 = r10;
        r1 = r33;
        r2 = r7;
        r0.putLong(r1, r2, r4);
        r6 = r6 | r25;
        r7 = r35;
        r3 = r13;
        r0 = r17;
        goto L_0x02ce;
    L_0x028f:
        r5 = r4;
        r35 = r7;
        r7 = r11;
        r13 = r18;
        r27 = r23;
        r18 = -1;
        r12 = r34;
        r11 = r36;
        r23 = r1;
        if (r0 != r2) goto L_0x02ab;
    L_0x02a1:
        r0 = defpackage.anvl.d(r12, r5);
        defpackage.aoax.a(r14, r7, r0);
        r0 = r5 + 4;
        goto L_0x02c9;
    L_0x02ab:
        r4 = 1;
        goto L_0x02d7;
    L_0x02ad:
        r5 = r4;
        r35 = r7;
        r7 = r11;
        r13 = r18;
        r27 = r23;
        r4 = 1;
        r18 = -1;
        r12 = r34;
        r11 = r36;
        r23 = r1;
        if (r0 != r4) goto L_0x02d7;
    L_0x02c0:
        r0 = defpackage.anvl.c(r12, r5);
        defpackage.aoax.a(r14, r7, r0);
        r0 = r5 + 8;
    L_0x02c9:
        r6 = r6 | r25;
        r7 = r35;
        r3 = r13;
    L_0x02ce:
        r2 = r23;
        r1 = r27;
    L_0x02d2:
        r13 = r11;
    L_0x02d3:
        r11 = r37;
        goto L_0x0017;
    L_0x02d7:
        r22 = r35;
        r2 = r5;
        r28 = r6;
        r8 = r10;
        r7 = r14;
        r9 = r15;
        r24 = r23;
        r10 = r27;
        r18 = 1;
        r6 = r37;
        r23 = r13;
        goto L_0x0432;
    L_0x02eb:
        r5 = r4;
        r22 = r7;
        r2 = r8;
        r7 = r11;
        r11 = r13;
        r27 = r23;
        r4 = 1;
        r18 = -1;
        r12 = r34;
        r13 = r3;
        r3 = r1;
        r1 = 27;
        if (r2 == r1) goto L_0x03b2;
    L_0x02fe:
        r1 = 49;
        if (r2 > r1) goto L_0x0360;
    L_0x0302:
        r23 = r10;
        r1 = r24;
        r9 = (long) r1;
        r1 = r0;
        r0 = r32;
        r35 = r1;
        r1 = r33;
        r21 = r2;
        r2 = r34;
        r24 = r3;
        r3 = r5;
        r25 = 1;
        r4 = r36;
        r15 = r5;
        r5 = r27;
        r28 = r6;
        r6 = r24;
        r29 = r7;
        r8 = r27;
        r7 = r35;
        r18 = 1;
        r8 = r13;
        r31 = r23;
        r11 = r21;
        r23 = r13;
        r12 = r29;
        r14 = r38;
        r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14);
        if (r0 != r15) goto L_0x0346;
    L_0x0339:
        r9 = r32;
        r7 = r33;
        r6 = r37;
        r2 = r0;
        r10 = r27;
        r8 = r31;
        goto L_0x0432;
    L_0x0346:
        r15 = r32;
        r14 = r33;
        r12 = r34;
        r13 = r36;
        r11 = r37;
        r9 = r38;
        r7 = r22;
        r3 = r23;
        r2 = r24;
        r1 = r27;
        r6 = r28;
        r10 = r31;
        goto L_0x0017;
    L_0x0360:
        r35 = r0;
        r21 = r2;
        r15 = r5;
        r28 = r6;
        r29 = r7;
        r31 = r10;
        r23 = r13;
        r1 = r24;
        r18 = 1;
        r24 = r3;
        r0 = 50;
        r9 = r21;
        if (r9 == r0) goto L_0x0397;
    L_0x0379:
        r0 = r32;
        r2 = r1;
        r1 = r33;
        r8 = r2;
        r2 = r34;
        r3 = r15;
        r4 = r36;
        r5 = r27;
        r6 = r24;
        r7 = r35;
        r10 = r29;
        r12 = r23;
        r13 = r38;
        r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13);
        if (r0 != r15) goto L_0x0346;
    L_0x0396:
        goto L_0x0339;
    L_0x0397:
        r0 = r35;
        r1 = 2;
        if (r0 != r1) goto L_0x040f;
    L_0x039c:
        r0 = r32;
        r1 = r33;
        r2 = r34;
        r3 = r15;
        r4 = r36;
        r5 = r23;
        r6 = r29;
        r8 = r38;
        r0 = r0.a(r1, r2, r3, r4, r5, r6, r8);
        if (r0 != r15) goto L_0x0346;
    L_0x03b1:
        goto L_0x0339;
    L_0x03b2:
        r24 = r3;
        r15 = r5;
        r28 = r6;
        r29 = r7;
        r31 = r10;
        r23 = r13;
        r1 = 2;
        r18 = 1;
        if (r0 != r1) goto L_0x040f;
    L_0x03c2:
        r7 = r33;
        r0 = r29;
        r8 = r31;
        r2 = r8.getObject(r7, r0);
        r2 = (defpackage.anyd) r2;
        r3 = r2.a();
        if (r3 != 0) goto L_0x03e5;
    L_0x03d4:
        r3 = r2.size();
        if (r3 == 0) goto L_0x03dc;
    L_0x03da:
        r3 = r3 + r3;
        goto L_0x03de;
    L_0x03dc:
        r3 = 10;
    L_0x03de:
        r2 = r2.a(r3);
        r8.putObject(r7, r0, r2);
    L_0x03e5:
        r9 = r32;
        r5 = r2;
        r3 = r15;
        r10 = r23;
        r0 = r9.a(r10);
        r1 = r27;
        r2 = r34;
        r4 = r36;
        r6 = r38;
        r0 = defpackage.anvl.a(r0, r1, r2, r3, r4, r5, r6);
        r12 = r34;
        r13 = r36;
        r11 = r37;
        r14 = r7;
        r15 = r9;
        r3 = r10;
        r7 = r22;
        r2 = r24;
        r6 = r28;
        r9 = r38;
        r10 = r8;
        goto L_0x0017;
    L_0x040f:
        r9 = r32;
        r7 = r33;
        r3 = r15;
        r10 = r23;
        r8 = r31;
        r6 = r37;
        r2 = r3;
        r23 = r10;
        r10 = r27;
        goto L_0x0432;
    L_0x0420:
        r24 = r1;
        r3 = r4;
        r28 = r6;
        r22 = r7;
        r8 = r10;
        r7 = r14;
        r9 = r15;
        r18 = 1;
        r6 = r37;
        r2 = r3;
        r10 = r5;
        r23 = 0;
    L_0x0432:
        if (r10 == r6) goto L_0x0435;
    L_0x0434:
        goto L_0x043b;
    L_0x0435:
        if (r6 == 0) goto L_0x043b;
    L_0x0437:
        r12 = r36;
        goto L_0x0609;
    L_0x043b:
        r0 = r9.h;
        if (r0 == 0) goto L_0x05d7;
    L_0x043f:
        r11 = r38;
        r0 = r11.d;
        r1 = defpackage.anxa.b();
        if (r0 == r1) goto L_0x05d2;
    L_0x0449:
        r0 = r9.g;
        r1 = r9.q;
        r3 = r11.d;
        r12 = r24;
        r13 = r3.a(r0, r12);
        if (r13 != 0) goto L_0x046e;
    L_0x0457:
        r4 = defpackage.anzh.g(r33);
        r0 = r10;
        r1 = r34;
        r3 = r36;
        r5 = r38;
        r0 = defpackage.anvl.a(r0, r1, r2, r3, r4, r5);
        r15 = r34;
    L_0x0468:
        r24 = r12;
        r12 = r36;
        goto L_0x05ec;
    L_0x046e:
        r0 = r7;
        r0 = (defpackage.anxp) r0;
        r0.a();
        r14 = r0.h;
        r3 = r13.c();
        r4 = defpackage.aobm.ENUM;
        if (r3 != r4) goto L_0x04aa;
    L_0x047e:
        r15 = r34;
        r2 = defpackage.anvl.a(r15, r2, r11);
        r3 = r13.d;
        r3 = r3.a;
        r4 = r11.a;
        r3 = r3.findValueByNumber(r4);
        if (r3 != 0) goto L_0x04a3;
    L_0x0490:
        r3 = r0.unknownFields;
        r4 = defpackage.aoau.a;
        if (r3 != r4) goto L_0x049c;
    L_0x0496:
        r3 = defpackage.aoau.a();
        r0.unknownFields = r3;
    L_0x049c:
        r0 = r11.a;
        defpackage.aoab.a(r12, r0, r3, r1);
        r0 = r2;
        goto L_0x0468;
    L_0x04a3:
        r0 = r11.a;
        r17 = java.lang.Integer.valueOf(r0);
        goto L_0x04dc;
    L_0x04aa:
        r15 = r34;
        r0 = r13.c();
        r0 = r0.ordinal();
        switch(r0) {
            case 0: goto L_0x059e;
            case 1: goto L_0x058e;
            case 2: goto L_0x057e;
            case 3: goto L_0x057e;
            case 4: goto L_0x056e;
            case 5: goto L_0x0561;
            case 6: goto L_0x0554;
            case 7: goto L_0x053d;
            case 8: goto L_0x0531;
            case 9: goto L_0x050e;
            case 10: goto L_0x04f5;
            case 11: goto L_0x04e9;
            case 12: goto L_0x056e;
            case 13: goto L_0x04e1;
            case 14: goto L_0x0554;
            case 15: goto L_0x0561;
            case 16: goto L_0x04ce;
            case 17: goto L_0x04bf;
            default: goto L_0x04b7;
        };
    L_0x04b7:
        r24 = r12;
        r12 = r36;
    L_0x04bb:
        r0 = r17;
        goto L_0x05ae;
    L_0x04bf:
        r2 = defpackage.anvl.b(r15, r2, r11);
        r0 = r11.b;
        r0 = defpackage.anwf.a(r0);
        r17 = java.lang.Long.valueOf(r0);
        goto L_0x04dc;
    L_0x04ce:
        r2 = defpackage.anvl.a(r15, r2, r11);
        r0 = r11.a;
        r0 = defpackage.anwf.f(r0);
        r17 = java.lang.Integer.valueOf(r0);
    L_0x04dc:
        r24 = r12;
        r0 = r17;
        goto L_0x04f1;
    L_0x04e1:
        r0 = new java.lang.IllegalStateException;
        r1 = "Shouldn't reach here.";
        r0.<init>(r1);
        throw r0;
    L_0x04e9:
        r2 = defpackage.anvl.e(r15, r2, r11);
        r0 = r11.c;
        r24 = r12;
    L_0x04f1:
        r12 = r36;
        goto L_0x05ae;
    L_0x04f5:
        r0 = defpackage.anzs.a;
        r1 = r13.c;
        r1 = r1.getClass();
        r0 = r0.a(r1);
        r5 = r36;
        r2 = defpackage.anvl.a(r0, r15, r2, r5, r11);
        r0 = r11.c;
        r24 = r12;
        r12 = r5;
        goto L_0x05ae;
    L_0x050e:
        r5 = r36;
        r0 = defpackage.anzs.a;
        r1 = r13.c;
        r1 = r1.getClass();
        r0 = r0.a(r1);
        r1 = r12 << 3;
        r4 = r1 | 4;
        r1 = r34;
        r3 = r36;
        r24 = r12;
        r12 = r5;
        r5 = r38;
        r2 = defpackage.anvl.a(r0, r1, r2, r3, r4, r5);
        r0 = r11.c;
        goto L_0x05ae;
    L_0x0531:
        r24 = r12;
        r12 = r36;
        r2 = defpackage.anvl.c(r15, r2, r11);
        r0 = r11.c;
        goto L_0x05ae;
    L_0x053d:
        r24 = r12;
        r12 = r36;
        r2 = defpackage.anvl.b(r15, r2, r11);
        r0 = r11.b;
        r3 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1));
        if (r3 == 0) goto L_0x054c;
    L_0x054b:
        goto L_0x054e;
    L_0x054c:
        r18 = 0;
    L_0x054e:
        r17 = java.lang.Boolean.valueOf(r18);
        goto L_0x04bb;
    L_0x0554:
        r24 = r12;
        r12 = r36;
        r0 = defpackage.anvl.a(r15, r2);
        r17 = java.lang.Integer.valueOf(r0);
        goto L_0x059a;
    L_0x0561:
        r24 = r12;
        r12 = r36;
        r0 = defpackage.anvl.b(r15, r2);
        r17 = java.lang.Long.valueOf(r0);
        goto L_0x05aa;
    L_0x056e:
        r24 = r12;
        r12 = r36;
        r2 = defpackage.anvl.a(r15, r2, r11);
        r0 = r11.a;
        r17 = java.lang.Integer.valueOf(r0);
        goto L_0x04bb;
    L_0x057e:
        r24 = r12;
        r12 = r36;
        r2 = defpackage.anvl.b(r15, r2, r11);
        r0 = r11.b;
        r17 = java.lang.Long.valueOf(r0);
        goto L_0x04bb;
    L_0x058e:
        r24 = r12;
        r12 = r36;
        r0 = defpackage.anvl.d(r15, r2);
        r17 = java.lang.Float.valueOf(r0);
    L_0x059a:
        r2 = r2 + 4;
        goto L_0x04bb;
    L_0x059e:
        r24 = r12;
        r12 = r36;
        r0 = defpackage.anvl.c(r15, r2);
        r17 = java.lang.Double.valueOf(r0);
    L_0x05aa:
        r2 = r2 + 8;
        goto L_0x04bb;
    L_0x05ae:
        r1 = r13.c();
        r1 = r1.ordinal();
        r3 = 9;
        if (r1 == r3) goto L_0x05bf;
    L_0x05ba:
        r3 = 10;
        if (r1 == r3) goto L_0x05bf;
    L_0x05be:
        goto L_0x05cb;
    L_0x05bf:
        r1 = r13.d;
        r1 = r14.b(r1);
        if (r1 == 0) goto L_0x05cb;
    L_0x05c7:
        r0 = defpackage.anxw.a(r1, r0);
    L_0x05cb:
        r1 = r13.d;
        r14.a(r1, r0);
        r0 = r2;
        goto L_0x05ec;
    L_0x05d2:
        r15 = r34;
        r12 = r36;
        goto L_0x05dd;
    L_0x05d7:
        r15 = r34;
        r12 = r36;
        r11 = r38;
    L_0x05dd:
        r4 = defpackage.anzh.g(r33);
        r0 = r10;
        r1 = r34;
        r3 = r36;
        r5 = r38;
        r0 = defpackage.anvl.a(r0, r1, r2, r3, r4, r5);
    L_0x05ec:
        r14 = r7;
        r1 = r10;
        r13 = r12;
        r12 = r15;
        r7 = r22;
        r3 = r23;
        r2 = r24;
        r10 = r8;
        r15 = r9;
        r9 = r11;
        r11 = r6;
        r6 = r28;
        goto L_0x0017;
    L_0x05fe:
        r28 = r6;
        r22 = r7;
        r8 = r10;
        r6 = r11;
        r12 = r13;
        r7 = r14;
        r9 = r15;
        r2 = r0;
        r10 = r1;
    L_0x0609:
        r0 = r22;
        r1 = r28;
        r3 = -1;
        if (r0 != r3) goto L_0x0611;
    L_0x0610:
        goto L_0x0615;
    L_0x0611:
        r3 = (long) r0;
        r8.putInt(r7, r3, r1);
    L_0x0615:
        r0 = r9.m;
        r1 = r17;
    L_0x0619:
        r3 = r9.n;
        if (r0 >= r3) goto L_0x062c;
    L_0x061d:
        r3 = r9.l;
        r3 = r3[r0];
        r4 = r9.q;
        r1 = r9.a(r7, r3, r1, r4);
        r1 = (defpackage.aoau) r1;
        r0 = r0 + 1;
        goto L_0x0619;
    L_0x062c:
        if (r1 == 0) goto L_0x0633;
    L_0x062e:
        r0 = r9.q;
        r0.b(r7, r1);
    L_0x0633:
        if (r6 != 0) goto L_0x063d;
    L_0x0635:
        if (r2 != r12) goto L_0x0638;
    L_0x0637:
        goto L_0x0641;
    L_0x0638:
        r0 = defpackage.anyg.i();
        throw r0;
    L_0x063d:
        if (r2 > r12) goto L_0x0642;
    L_0x063f:
        if (r10 != r6) goto L_0x0642;
    L_0x0641:
        return r2;
    L_0x0642:
        r0 = defpackage.anyg.i();
        goto L_0x0648;
    L_0x0647:
        throw r0;
    L_0x0648:
        goto L_0x0647;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anzh.a(java.lang.Object, byte[], int, int, int, anvo):int");
    }

    /* JADX WARNING: Missing block: B:20:0x005b, code skipped:
            r10 = r4;
     */
    /* JADX WARNING: Missing block: B:21:0x005c, code skipped:
            r24 = r7;
            r3 = r8;
            r8 = r9;
            r7 = r14;
            r9 = r15;
     */
    /* JADX WARNING: Missing block: B:55:0x010c, code skipped:
            r2 = r4;
            r1 = r7;
     */
    /* JADX WARNING: Missing block: B:65:0x013e, code skipped:
            r0 = r6;
     */
    /* JADX WARNING: Missing block: B:72:0x015a, code skipped:
            r0 = r8 + 8;
     */
    /* JADX WARNING: Missing block: B:73:0x015c, code skipped:
            r1 = r7;
            r2 = r10;
     */
    /* JADX WARNING: Missing block: B:80:0x0196, code skipped:
            if (r0 == r15) goto L_0x0198;
     */
    /* JADX WARNING: Missing block: B:82:0x01a3, code skipped:
            r15 = r26;
            r14 = r27;
            r12 = r28;
            r2 = r29;
            r13 = r30;
            r11 = r31;
            r1 = r24;
            r9 = r25;
     */
    /* JADX WARNING: Missing block: B:86:0x01e3, code skipped:
            if (r0 == r15) goto L_0x0198;
     */
    /* JADX WARNING: Missing block: B:90:0x01fd, code skipped:
            if (r0 == r15) goto L_0x0198;
     */
    private final int b(java.lang.Object r27, byte[] r28, int r29, int r30, defpackage.anvo r31) {
        /*
        r26 = this;
        r15 = r26;
        r14 = r27;
        r12 = r28;
        r13 = r30;
        r11 = r31;
        r9 = b;
        r10 = -1;
        r16 = 0;
        r0 = r29;
        r1 = -1;
        r2 = 0;
    L_0x0013:
        if (r0 < r13) goto L_0x001d;
    L_0x0015:
        if (r0 != r13) goto L_0x0018;
    L_0x0017:
        return r0;
    L_0x0018:
        r0 = defpackage.anyg.i();
        throw r0;
    L_0x001d:
        r3 = r0 + 1;
        r0 = r12[r0];
        if (r0 >= 0) goto L_0x002d;
    L_0x0023:
        r0 = defpackage.anvl.a(r0, r12, r3, r11);
        r3 = r11.a;
        r8 = r0;
        r17 = r3;
        goto L_0x0030;
    L_0x002d:
        r17 = r0;
        r8 = r3;
    L_0x0030:
        r7 = r17 >>> 3;
        r6 = r17 & 7;
        if (r7 <= r1) goto L_0x003d;
    L_0x0036:
        r2 = r2 / 3;
        r0 = r15.a(r7, r2);
        goto L_0x0041;
    L_0x003d:
        r0 = r15.j(r7);
    L_0x0041:
        r4 = r0;
        if (r4 == r10) goto L_0x0253;
    L_0x0044:
        r0 = r15.c;
        r1 = r4 + 1;
        r5 = r0[r1];
        r3 = defpackage.anzh.g(r5);
        r1 = defpackage.anzh.i(r5);
        r0 = 17;
        r10 = 2;
        if (r3 > r0) goto L_0x0161;
    L_0x0057:
        r0 = 1;
        switch(r3) {
            case 0: goto L_0x014f;
            case 1: goto L_0x0140;
            case 2: goto L_0x012e;
            case 3: goto L_0x012e;
            case 4: goto L_0x0120;
            case 5: goto L_0x0110;
            case 6: goto L_0x00ff;
            case 7: goto L_0x00e9;
            case 8: goto L_0x00d2;
            case 9: goto L_0x00b1;
            case 10: goto L_0x00a4;
            case 11: goto L_0x0120;
            case 12: goto L_0x0095;
            case 13: goto L_0x00ff;
            case 14: goto L_0x0110;
            case 15: goto L_0x0082;
            case 16: goto L_0x0066;
            default: goto L_0x005b;
        };
    L_0x005b:
        r10 = r4;
    L_0x005c:
        r24 = r7;
        r3 = r8;
        r8 = r9;
        r7 = r14;
        r9 = r15;
        r18 = -1;
        goto L_0x0251;
    L_0x0066:
        if (r6 == 0) goto L_0x0069;
    L_0x0068:
        goto L_0x005b;
    L_0x0069:
        r6 = defpackage.anvl.b(r12, r8, r11);
        r19 = r1;
        r0 = r11.b;
        r21 = defpackage.anwf.a(r0);
        r0 = r9;
        r2 = r19;
        r1 = r27;
        r10 = r4;
        r4 = r21;
        r0.putLong(r1, r2, r4);
        goto L_0x013e;
    L_0x0082:
        r2 = r1;
        r10 = r4;
        if (r6 != 0) goto L_0x005c;
    L_0x0086:
        r0 = defpackage.anvl.a(r12, r8, r11);
        r1 = r11.a;
        r1 = defpackage.anwf.f(r1);
        r9.putInt(r14, r2, r1);
        goto L_0x015c;
    L_0x0095:
        r2 = r1;
        r10 = r4;
        if (r6 != 0) goto L_0x005c;
    L_0x0099:
        r0 = defpackage.anvl.a(r12, r8, r11);
        r1 = r11.a;
        r9.putInt(r14, r2, r1);
        goto L_0x015c;
    L_0x00a4:
        r2 = r1;
        if (r6 != r10) goto L_0x005b;
    L_0x00a7:
        r0 = defpackage.anvl.e(r12, r8, r11);
        r1 = r11.c;
        r9.putObject(r14, r2, r1);
        goto L_0x010c;
    L_0x00b1:
        r2 = r1;
        if (r6 != r10) goto L_0x005b;
    L_0x00b4:
        r0 = r15.a(r4);
        r0 = defpackage.anvl.a(r0, r12, r8, r13, r11);
        r1 = r9.getObject(r14, r2);
        if (r1 != 0) goto L_0x00c8;
    L_0x00c2:
        r1 = r11.c;
        r9.putObject(r14, r2, r1);
        goto L_0x010c;
    L_0x00c8:
        r5 = r11.c;
        r1 = defpackage.anxw.a(r1, r5);
        r9.putObject(r14, r2, r1);
        goto L_0x010c;
    L_0x00d2:
        r2 = r1;
        if (r6 != r10) goto L_0x005b;
    L_0x00d5:
        r0 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r0 = r0 & r5;
        if (r0 == 0) goto L_0x00df;
    L_0x00da:
        r0 = defpackage.anvl.d(r12, r8, r11);
        goto L_0x00e3;
    L_0x00df:
        r0 = defpackage.anvl.c(r12, r8, r11);
    L_0x00e3:
        r1 = r11.c;
        r9.putObject(r14, r2, r1);
        goto L_0x010c;
    L_0x00e9:
        r2 = r1;
        if (r6 != 0) goto L_0x005b;
    L_0x00ec:
        r1 = defpackage.anvl.b(r12, r8, r11);
        r5 = r11.b;
        r19 = 0;
        r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1));
        if (r8 == 0) goto L_0x00f9;
    L_0x00f8:
        goto L_0x00fa;
    L_0x00f9:
        r0 = 0;
    L_0x00fa:
        defpackage.aoax.a(r14, r2, r0);
        r0 = r1;
        goto L_0x010c;
    L_0x00ff:
        r2 = r1;
        r0 = 5;
        if (r6 != r0) goto L_0x005b;
    L_0x0103:
        r0 = defpackage.anvl.a(r12, r8);
        r9.putInt(r14, r2, r0);
        r0 = r8 + 4;
    L_0x010c:
        r2 = r4;
        r1 = r7;
        goto L_0x015e;
    L_0x0110:
        r2 = r1;
        if (r6 != r0) goto L_0x005b;
    L_0x0113:
        r5 = defpackage.anvl.b(r12, r8);
        r0 = r9;
        r1 = r27;
        r10 = r4;
        r4 = r5;
        r0.putLong(r1, r2, r4);
        goto L_0x015a;
    L_0x0120:
        r2 = r1;
        r10 = r4;
        if (r6 != 0) goto L_0x005c;
    L_0x0124:
        r0 = defpackage.anvl.a(r12, r8, r11);
        r1 = r11.a;
        r9.putInt(r14, r2, r1);
        goto L_0x015c;
    L_0x012e:
        r2 = r1;
        r10 = r4;
        if (r6 != 0) goto L_0x005c;
    L_0x0132:
        r6 = defpackage.anvl.b(r12, r8, r11);
        r4 = r11.b;
        r0 = r9;
        r1 = r27;
        r0.putLong(r1, r2, r4);
    L_0x013e:
        r0 = r6;
        goto L_0x015c;
    L_0x0140:
        r2 = r1;
        r10 = r4;
        r0 = 5;
        if (r6 != r0) goto L_0x005c;
    L_0x0145:
        r0 = defpackage.anvl.d(r12, r8);
        defpackage.aoax.a(r14, r2, r0);
        r0 = r8 + 4;
        goto L_0x015c;
    L_0x014f:
        r2 = r1;
        r10 = r4;
        if (r6 != r0) goto L_0x005c;
    L_0x0153:
        r0 = defpackage.anvl.c(r12, r8);
        defpackage.aoax.a(r14, r2, r0);
    L_0x015a:
        r0 = r8 + 8;
    L_0x015c:
        r1 = r7;
        r2 = r10;
    L_0x015e:
        r10 = -1;
        goto L_0x0013;
    L_0x0161:
        r0 = 27;
        if (r3 == r0) goto L_0x0200;
    L_0x0165:
        r0 = 49;
        if (r3 > r0) goto L_0x01b4;
    L_0x0169:
        r19 = r9;
        r9 = (long) r5;
        r0 = r26;
        r20 = r1;
        r1 = r27;
        r2 = r28;
        r5 = r3;
        r3 = r8;
        r29 = r4;
        r4 = r30;
        r22 = r5;
        r5 = r17;
        r23 = r6;
        r6 = r7;
        r24 = r7;
        r7 = r23;
        r15 = r8;
        r8 = r29;
        r25 = r19;
        r18 = -1;
        r11 = r22;
        r12 = r20;
        r14 = r31;
        r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14);
        if (r0 != r15) goto L_0x01a3;
    L_0x0198:
        r9 = r26;
        r7 = r27;
        r10 = r29;
        r2 = r0;
        r8 = r25;
        goto L_0x025d;
    L_0x01a3:
        r15 = r26;
        r14 = r27;
        r12 = r28;
        r2 = r29;
        r13 = r30;
        r11 = r31;
        r1 = r24;
        r9 = r25;
        goto L_0x015e;
    L_0x01b4:
        r20 = r1;
        r22 = r3;
        r29 = r4;
        r23 = r6;
        r24 = r7;
        r15 = r8;
        r25 = r9;
        r18 = -1;
        r0 = 50;
        r9 = r22;
        if (r9 == r0) goto L_0x01e6;
    L_0x01c9:
        r0 = r26;
        r1 = r27;
        r2 = r28;
        r3 = r15;
        r4 = r30;
        r8 = r5;
        r5 = r17;
        r6 = r24;
        r7 = r23;
        r10 = r20;
        r12 = r29;
        r13 = r31;
        r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13);
        if (r0 != r15) goto L_0x01a3;
    L_0x01e5:
        goto L_0x0198;
    L_0x01e6:
        r0 = r23;
        if (r0 != r10) goto L_0x0248;
    L_0x01ea:
        r0 = r26;
        r1 = r27;
        r2 = r28;
        r3 = r15;
        r4 = r30;
        r5 = r29;
        r6 = r20;
        r8 = r31;
        r0 = r0.a(r1, r2, r3, r4, r5, r6, r8);
        if (r0 != r15) goto L_0x01a3;
    L_0x01ff:
        goto L_0x0198;
    L_0x0200:
        r20 = r1;
        r29 = r4;
        r0 = r6;
        r24 = r7;
        r15 = r8;
        r25 = r9;
        r18 = -1;
        if (r0 != r10) goto L_0x0248;
    L_0x020e:
        r7 = r27;
        r0 = r20;
        r8 = r25;
        r2 = r8.getObject(r7, r0);
        r2 = (defpackage.anyd) r2;
        r3 = r2.a();
        if (r3 != 0) goto L_0x0231;
    L_0x0220:
        r3 = r2.size();
        if (r3 == 0) goto L_0x0228;
    L_0x0226:
        r3 = r3 + r3;
        goto L_0x022a;
    L_0x0228:
        r3 = 10;
    L_0x022a:
        r2 = r2.a(r3);
        r8.putObject(r7, r0, r2);
    L_0x0231:
        r9 = r26;
        r10 = r29;
        r5 = r2;
        r3 = r15;
        r0 = r9.a(r10);
        r1 = r17;
        r2 = r28;
        r4 = r30;
        r6 = r31;
        r0 = defpackage.anvl.a(r0, r1, r2, r3, r4, r5, r6);
        goto L_0x026d;
    L_0x0248:
        r9 = r26;
        r7 = r27;
        r10 = r29;
        r3 = r15;
        r8 = r25;
    L_0x0251:
        r2 = r3;
        goto L_0x025d;
    L_0x0253:
        r24 = r7;
        r3 = r8;
        r8 = r9;
        r7 = r14;
        r9 = r15;
        r18 = -1;
        r2 = r3;
        r10 = 0;
    L_0x025d:
        r4 = defpackage.anzh.g(r27);
        r0 = r17;
        r1 = r28;
        r3 = r30;
        r5 = r31;
        r0 = defpackage.anvl.a(r0, r1, r2, r3, r4, r5);
    L_0x026d:
        r12 = r28;
        r13 = r30;
        r11 = r31;
        r14 = r7;
        r15 = r9;
        r2 = r10;
        r1 = r24;
        r10 = -1;
        r9 = r8;
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anzh.b(java.lang.Object, byte[], int, int, anvo):int");
    }

    public final void a(Object obj, byte[] bArr, int i, int i2, anvo anvo) {
        if (this.j) {
            b(obj, bArr, i, i2, anvo);
        } else {
            a(obj, bArr, i, i2, 0, anvo);
        }
    }

    public final void c(Object obj) {
        int i;
        int i2 = this.m;
        while (true) {
            i = this.n;
            if (i2 >= i) {
                break;
            }
            long i3 = anzh.i(e(this.l[i2]));
            Object f = aoax.f(obj, i3);
            if (f != null) {
                aoax.a(obj, i3, this.s.d(f));
            }
            i2++;
        }
        i2 = this.l.length;
        while (i < i2) {
            this.p.b(obj, (long) this.l[i]);
            i++;
        }
        this.q.d(obj);
        if (this.h) {
            this.r.c(obj);
        }
    }

    private final Object a(Object obj, int i, Object obj2, aoar aoar) {
        int d = d(i);
        obj = aoax.f(obj, anzh.i(e(i)));
        if (obj != null) {
            anxx c = c(i);
            if (c != null) {
                Map a = this.s.a(obj);
                anyv e = this.s.e(b(i));
                Iterator it = a.entrySet().iterator();
                while (it.hasNext()) {
                    Entry entry = (Entry) it.next();
                    if (!c.isInRange(((Integer) entry.getValue()).intValue())) {
                        if (obj2 == null) {
                            obj2 = aoar.b();
                        }
                        anwc c2 = anvu.c(anyw.a(e, entry.getKey(), entry.getValue()));
                        try {
                            anyw.a(c2.a, e, entry.getKey(), entry.getValue());
                            aoar.a(obj2, d, c2.a());
                            it.remove();
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                }
            }
        }
        return obj2;
    }

    public final boolean d(Object obj) {
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < this.m; i3++) {
            int i4;
            int i5;
            int i6 = this.l[i3];
            int d = d(i6);
            int e = e(i6);
            if (this.j) {
                i4 = 0;
            } else {
                i5 = this.c[i6 + 2];
                int i7 = 1048575 & i5;
                i4 = 1 << (i5 >>> 20);
                if (i7 != i2) {
                    i = b.getInt(obj, (long) i7);
                    i2 = i7;
                }
            }
            if ((268435456 & e) != 0 && !a(obj, i6, i, i4)) {
                return false;
            }
            i5 = anzh.g(e);
            if (i5 != 9 && i5 != 17) {
                if (i5 != 27) {
                    if (i5 == 60 || i5 == 68) {
                        if (a(obj, d, i6) && !anzh.a(obj, e, a(i6))) {
                            return false;
                        }
                    } else if (i5 != 49) {
                        if (i5 != 50) {
                            continue;
                        } else {
                            Map b = this.s.b(aoax.f(obj, anzh.i(e)));
                            if (b.isEmpty()) {
                                continue;
                            } else {
                                if (this.s.e(b(i6)).c.k == 9) {
                                    anzz anzz = null;
                                    for (Object next : b.values()) {
                                        if (anzz == null) {
                                            anzz = anzs.a.a(next.getClass());
                                        }
                                        if (!anzz.d(next)) {
                                            return false;
                                        }
                                    }
                                    continue;
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
                List list = (List) aoax.f(obj, anzh.i(e));
                if (list.isEmpty()) {
                    continue;
                } else {
                    anzz a = a(i6);
                    for (d = 0; d < list.size(); d++) {
                        if (!a.d(list.get(d))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (a(obj, i6, i, i4) && !anzh.a(obj, e, a(i6))) {
                return false;
            }
        }
        return !this.h || this.r.a(obj).e();
    }

    private static boolean a(Object obj, int i, anzz anzz) {
        return anzz.d(aoax.f(obj, anzh.i(i)));
    }

    private static void a(int i, Object obj, aobl aobl) {
        if (obj instanceof String) {
            aobl.a(i, (String) obj);
        } else {
            aobl.a(i, (anvu) obj);
        }
    }

    private final void a(Object obj, int i, anzt anzt) {
        if (anzh.h(i)) {
            aoax.a(obj, anzh.i(i), anzt.m());
        } else if (this.i) {
            aoax.a(obj, anzh.i(i), anzt.l());
        } else {
            aoax.a(obj, anzh.i(i), anzt.n());
        }
    }

    private final int d(int i) {
        return this.c[i];
    }

    private final int e(int i) {
        return this.c[i + 1];
    }

    private final int f(int i) {
        return this.c[i + 2];
    }

    private static double b(Object obj, long j) {
        return ((Double) aoax.f(obj, j)).doubleValue();
    }

    private static float c(Object obj, long j) {
        return ((Float) aoax.f(obj, j)).floatValue();
    }

    private static int d(Object obj, long j) {
        return ((Integer) aoax.f(obj, j)).intValue();
    }

    private static long e(Object obj, long j) {
        return ((Long) aoax.f(obj, j)).longValue();
    }

    private static boolean f(Object obj, long j) {
        return ((Boolean) aoax.f(obj, j)).booleanValue();
    }

    private final boolean c(Object obj, Object obj2, int i) {
        return a(obj, i) == a(obj2, i);
    }

    private final boolean a(Object obj, int i, int i2, int i3) {
        if (this.j) {
            return a(obj, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean a(Object obj, int i) {
        if (this.j) {
            int isEmpty;
            i = e(i);
            long i2 = anzh.i(i);
            switch (anzh.g(i)) {
                case 0:
                    return aoax.e(obj, i2) != 0.0d;
                case 1:
                    return aoax.d(obj, i2) != 0.0f;
                case 2:
                    return aoax.b(obj, i2) != 0;
                case 3:
                    return aoax.b(obj, i2) != 0;
                case 4:
                    return aoax.a(obj, i2) != 0;
                case 5:
                    return aoax.b(obj, i2) != 0;
                case 6:
                    return aoax.a(obj, i2) != 0;
                case 7:
                    return aoax.c(obj, i2);
                case 8:
                    obj = aoax.f(obj, i2);
                    if (obj instanceof String) {
                        isEmpty = ((String) obj).isEmpty();
                        break;
                    } else if (obj instanceof anvu) {
                        isEmpty = anvu.a.equals(obj);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    return aoax.f(obj, i2) != null;
                case 10:
                    isEmpty = anvu.a.equals(aoax.f(obj, i2));
                    break;
                case 11:
                    return aoax.a(obj, i2) != 0;
                case 12:
                    return aoax.a(obj, i2) != 0;
                case 13:
                    return aoax.a(obj, i2) != 0;
                case 14:
                    return aoax.b(obj, i2) != 0;
                case 15:
                    return aoax.a(obj, i2) != 0;
                case 16:
                    return aoax.b(obj, i2) != 0;
                case 17:
                    return aoax.f(obj, i2) != null;
                default:
                    throw new IllegalArgumentException();
            }
            return isEmpty ^ 1;
        }
        i = f(i);
        return (aoax.a(obj, (long) (1048575 & i)) & (1 << (i >>> 20))) != 0;
    }

    private final void b(Object obj, int i) {
        if (!this.j) {
            i = f(i);
            long j = (long) (1048575 & i);
            aoax.a(obj, j, (1 << (i >>> 20)) | aoax.a(obj, j));
        }
    }

    private final boolean a(Object obj, int i, int i2) {
        return aoax.a(obj, (long) (f(i2) & 1048575)) == i;
    }

    private final void b(Object obj, int i, int i2) {
        aoax.a(obj, (long) (f(i2) & 1048575), i);
    }

    private final int j(int i) {
        return (i < this.e || i > this.f) ? -1 : b(i, 0);
    }

    private final int a(int i, int i2) {
        return (i < this.e || i > this.f) ? -1 : b(i, i2);
    }

    private final int b(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int d = d(i4);
            if (i == d) {
                return i4;
            }
            if (i >= d) {
                i2 = i3 + 1;
            } else {
                length = i3 - 1;
            }
        }
        return -1;
    }
}
