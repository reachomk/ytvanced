package defpackage;

import java.util.Comparator;

/* renamed from: ahb */
public final class ahb {
    private static final Comparator a = new aha();

    /* JADX WARNING: Removed duplicated region for block: B:112:0x00e2 A:{SYNTHETIC, EDGE_INSN: B:112:0x00e2->B:30:0x00e2 ?: BREAK  , EDGE_INSN: B:112:0x00e2->B:30:0x00e2 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d9 A:{LOOP_END, LOOP:4: B:24:0x00be->B:29:0x00d9} */
    /* JADX WARNING: Missing block: B:20:0x00a9, code skipped:
            if (r1[r7 - 1] < r1[r7 + 1]) goto L_0x00ab;
     */
    /* JADX WARNING: Missing block: B:45:0x0145, code skipped:
            if (r2[r3 - 1] < r2[r3 + 1]) goto L_0x0147;
     */
    public static defpackage.ahc a(defpackage.ahd r26) {
        /*
        r0 = r26;
        r1 = r26.a();
        r2 = r26.b();
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = new ahe;
        r5.<init>(r1, r2);
        r4.add(r5);
        r5 = r1 + r2;
        r1 = r1 - r2;
        r1 = java.lang.Math.abs(r1);
        r5 = r5 + r1;
        r1 = r5 + r5;
        r2 = new int[r1];
        r1 = new int[r1];
        r6 = new java.util.ArrayList;
        r6.<init>();
    L_0x002f:
        r7 = r4.isEmpty();
        if (r7 != 0) goto L_0x0264;
    L_0x0035:
        r7 = r4.size();
        r7 = r7 + -1;
        r7 = r4.remove(r7);
        r7 = (defpackage.ahe) r7;
        r8 = r7.a;
        r9 = r7.b;
        r10 = r7.c;
        r9 = r9 - r8;
        r11 = r7.d;
        r11 = r11 - r10;
        r12 = 0;
        r13 = 1;
        if (r9 > 0) goto L_0x0059;
    L_0x004f:
        r22 = r3;
        r17 = r4;
        r19 = r6;
        r20 = r7;
        goto L_0x01b2;
    L_0x0059:
        if (r11 <= 0) goto L_0x004f;
    L_0x005b:
        r12 = r9 - r11;
        r14 = r9 + r11;
        r14 = r14 + r13;
        r14 = r14 / 2;
        r15 = r5 - r14;
        r15 = r15 + -1;
        r16 = r5 + r14;
        r17 = r4;
        r4 = r16 + 1;
        r13 = 0;
        java.util.Arrays.fill(r2, r15, r4, r13);
        r15 = r15 + r12;
        r4 = r4 + r12;
        java.util.Arrays.fill(r1, r15, r4, r9);
        r4 = r12 % 2;
        r15 = 0;
    L_0x0078:
        if (r15 > r14) goto L_0x01aa;
    L_0x007a:
        r13 = -r15;
        r18 = r14;
        r14 = r13;
    L_0x007e:
        if (r14 <= r15) goto L_0x0129;
    L_0x0080:
        r14 = r13;
    L_0x0081:
        if (r14 > r15) goto L_0x0118;
    L_0x0083:
        r19 = r6;
        r6 = r14 + r12;
        r20 = r7;
        r7 = r15 + r12;
        if (r6 != r7) goto L_0x0092;
    L_0x008d:
        r22 = r3;
        r16 = 1;
        goto L_0x00ab;
    L_0x0092:
        r7 = r13 + r12;
        if (r6 != r7) goto L_0x009b;
    L_0x0096:
        r22 = r3;
        r16 = 1;
        goto L_0x00b3;
    L_0x009b:
        r7 = r5 + r6;
        r21 = r7 + -1;
        r22 = r3;
        r3 = r1[r21];
        r16 = 1;
        r7 = r7 + 1;
        r7 = r1[r7];
        if (r3 >= r7) goto L_0x00b3;
    L_0x00ab:
        r3 = r5 + r6;
        r3 = r3 + -1;
        r3 = r1[r3];
        r7 = 0;
        goto L_0x00bc;
    L_0x00b3:
        r3 = r5 + r6;
        r3 = r3 + 1;
        r3 = r1[r3];
        r3 = r3 + -1;
        r7 = 1;
    L_0x00bc:
        r21 = r3 - r6;
    L_0x00be:
        if (r3 > 0) goto L_0x00c5;
    L_0x00c0:
        r25 = r10;
        r24 = r12;
        goto L_0x00e2;
    L_0x00c5:
        if (r21 <= 0) goto L_0x00c0;
    L_0x00c7:
        r23 = r8 + r3;
        r24 = r12;
        r12 = r23 + -1;
        r23 = r10 + r21;
        r25 = r10;
        r10 = r23 + -1;
        r10 = r0.a(r12, r10);
        if (r10 == 0) goto L_0x00e2;
    L_0x00d9:
        r3 = r3 + -1;
        r21 = r21 + -1;
        r12 = r24;
        r10 = r25;
        goto L_0x00be;
    L_0x00e2:
        r10 = r5 + r6;
        r1[r10] = r3;
        if (r4 == 0) goto L_0x00e9;
    L_0x00e8:
        goto L_0x010a;
    L_0x00e9:
        if (r6 < r13) goto L_0x010a;
    L_0x00eb:
        if (r6 > r15) goto L_0x010a;
    L_0x00ed:
        r12 = r2[r10];
        if (r12 < r3) goto L_0x010a;
    L_0x00f1:
        r12 = new ahh;
        r12.<init>();
        r3 = r1[r10];
        r12.a = r3;
        r4 = r3 - r6;
        r12.b = r4;
        r4 = r2[r10];
        r4 = r4 - r3;
        r12.c = r4;
        r12.d = r7;
        r3 = 1;
        r12.e = r3;
        goto L_0x01b2;
    L_0x010a:
        r14 = r14 + 2;
        r6 = r19;
        r7 = r20;
        r3 = r22;
        r12 = r24;
        r10 = r25;
        goto L_0x0081;
    L_0x0118:
        r22 = r3;
        r19 = r6;
        r20 = r7;
        r25 = r10;
        r24 = r12;
        r15 = r15 + 1;
        r14 = r18;
        r13 = 0;
        goto L_0x0078;
    L_0x0129:
        r22 = r3;
        r19 = r6;
        r20 = r7;
        r25 = r10;
        r24 = r12;
        if (r14 != r13) goto L_0x0137;
    L_0x0135:
        r7 = 1;
        goto L_0x0147;
    L_0x0137:
        if (r14 != r15) goto L_0x013b;
    L_0x0139:
        r7 = 1;
        goto L_0x014e;
    L_0x013b:
        r3 = r5 + r14;
        r6 = r3 + -1;
        r6 = r2[r6];
        r7 = 1;
        r3 = r3 + r7;
        r3 = r2[r3];
        if (r6 >= r3) goto L_0x014e;
    L_0x0147:
        r3 = r5 + r14;
        r3 = r3 + r7;
        r3 = r2[r3];
        r6 = 0;
        goto L_0x0156;
    L_0x014e:
        r3 = r5 + r14;
        r3 = r3 + -1;
        r3 = r2[r3];
        r3 = r3 + r7;
        r6 = 1;
    L_0x0156:
        r7 = r3 - r14;
    L_0x0158:
        if (r3 < r9) goto L_0x015b;
    L_0x015a:
        goto L_0x016c;
    L_0x015b:
        if (r7 >= r11) goto L_0x016c;
    L_0x015d:
        r10 = r8 + r3;
        r12 = r25 + r7;
        r10 = r0.a(r10, r12);
        if (r10 == 0) goto L_0x016c;
    L_0x0167:
        r3 = r3 + 1;
        r7 = r7 + 1;
        goto L_0x0158;
    L_0x016c:
        r7 = r5 + r14;
        r2[r7] = r3;
        if (r4 == 0) goto L_0x019b;
    L_0x0172:
        r12 = r24 - r15;
        r10 = 1;
        r12 = r12 + r10;
        if (r14 < r12) goto L_0x019b;
    L_0x0178:
        r12 = r24 + r15;
        r12 = r12 + -1;
        if (r14 <= r12) goto L_0x017f;
    L_0x017e:
        goto L_0x019b;
    L_0x017f:
        r10 = r1[r7];
        if (r3 < r10) goto L_0x019b;
    L_0x0183:
        r12 = new ahh;
        r12.<init>();
        r3 = r1[r7];
        r12.a = r3;
        r4 = r3 - r14;
        r12.b = r4;
        r4 = r2[r7];
        r4 = r4 - r3;
        r12.c = r4;
        r12.d = r6;
        r3 = 0;
        r12.e = r3;
        goto L_0x01b2;
    L_0x019b:
        r3 = 0;
        r14 = r14 + 2;
        r6 = r19;
        r7 = r20;
        r3 = r22;
        r12 = r24;
        r10 = r25;
        goto L_0x007e;
    L_0x01aa:
        r0 = new java.lang.IllegalStateException;
        r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.";
        r0.<init>(r1);
        throw r0;
    L_0x01b2:
        if (r12 == 0) goto L_0x0256;
    L_0x01b4:
        r3 = r12.c;
        if (r3 <= 0) goto L_0x01be;
    L_0x01b8:
        r3 = r22;
        r3.add(r12);
        goto L_0x01c0;
    L_0x01be:
        r3 = r22;
    L_0x01c0:
        r4 = r12.a;
        r7 = r20;
        r6 = r7.a;
        r4 = r4 + r6;
        r12.a = r4;
        r4 = r12.b;
        r6 = r7.c;
        r4 = r4 + r6;
        r12.b = r4;
        r4 = r19.isEmpty();
        if (r4 == 0) goto L_0x01de;
    L_0x01d6:
        r4 = new ahe;
        r4.<init>();
        r6 = r19;
        goto L_0x01ec;
    L_0x01de:
        r4 = r19.size();
        r4 = r4 + -1;
        r6 = r19;
        r4 = r6.remove(r4);
        r4 = (defpackage.ahe) r4;
    L_0x01ec:
        r8 = r7.a;
        r4.a = r8;
        r8 = r7.c;
        r4.c = r8;
        r8 = r12.e;
        if (r8 == 0) goto L_0x0203;
    L_0x01f8:
        r8 = r12.a;
        r4.b = r8;
        r8 = r12.b;
        r4.d = r8;
    L_0x0200:
        r8 = r17;
        goto L_0x021d;
    L_0x0203:
        r8 = r12.d;
        if (r8 == 0) goto L_0x0212;
    L_0x0207:
        r8 = r12.a;
        r8 = r8 + -1;
        r4.b = r8;
        r8 = r12.b;
        r4.d = r8;
        goto L_0x0200;
    L_0x0212:
        r8 = r12.a;
        r4.b = r8;
        r8 = r12.b;
        r8 = r8 + -1;
        r4.d = r8;
        goto L_0x0200;
    L_0x021d:
        r8.add(r4);
        r4 = r12.e;
        if (r4 == 0) goto L_0x0246;
    L_0x0224:
        r4 = r12.d;
        if (r4 == 0) goto L_0x0237;
    L_0x0228:
        r4 = r12.a;
        r9 = r12.c;
        r4 = r4 + r9;
        r10 = 1;
        r4 = r4 + r10;
        r7.a = r4;
        r4 = r12.b;
        r4 = r4 + r9;
        r7.c = r4;
        goto L_0x0252;
    L_0x0237:
        r4 = r12.a;
        r9 = r12.c;
        r4 = r4 + r9;
        r7.a = r4;
        r4 = r12.b;
        r4 = r4 + r9;
        r9 = 1;
        r4 = r4 + r9;
        r7.c = r4;
        goto L_0x0252;
    L_0x0246:
        r4 = r12.a;
        r9 = r12.c;
        r4 = r4 + r9;
        r7.a = r4;
        r4 = r12.b;
        r4 = r4 + r9;
        r7.c = r4;
    L_0x0252:
        r8.add(r7);
        goto L_0x0261;
    L_0x0256:
        r8 = r17;
        r6 = r19;
        r7 = r20;
        r3 = r22;
        r6.add(r7);
    L_0x0261:
        r4 = r8;
        goto L_0x002f;
    L_0x0264:
        r4 = a;
        java.util.Collections.sort(r3, r4);
        r4 = new ahc;
        r4.<init>(r0, r3, r2, r1);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahb.a(ahd):ahc");
    }
}
