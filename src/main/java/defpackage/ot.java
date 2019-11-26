package defpackage;

import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: ot */
final class ot {
    private static final int[] a = new int[]{0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    private static final pc b = (VERSION.SDK_INT >= 21 ? new oz() : null);
    private static final pc c;

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x044d A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0407  */
    static void a(defpackage.nv r39, java.util.ArrayList r40, java.util.ArrayList r41, int r42, int r43, boolean r44) {
        /*
        r0 = r39;
        r1 = r40;
        r2 = r41;
        r3 = r43;
        r4 = r44;
        r5 = r0.j;
        if (r5 <= 0) goto L_0x0461;
    L_0x000e:
        r5 = new android.util.SparseArray;
        r5.<init>();
        r6 = r42;
    L_0x0015:
        r7 = 1;
        r8 = 0;
        if (r6 >= r3) goto L_0x0065;
    L_0x0019:
        r9 = r1.get(r6);
        r9 = (defpackage.my) r9;
        r10 = r2.get(r6);
        r10 = (java.lang.Boolean) r10;
        r10 = r10.booleanValue();
        if (r10 != 0) goto L_0x0042;
    L_0x002b:
        r7 = r9.d;
        r7 = r7.size();
        r10 = 0;
    L_0x0032:
        if (r10 >= r7) goto L_0x0062;
    L_0x0034:
        r11 = r9.d;
        r11 = r11.get(r10);
        r11 = (defpackage.oq) r11;
        defpackage.ot.a(r9, r11, r5, r8, r4);
        r10 = r10 + 1;
        goto L_0x0032;
    L_0x0042:
        r8 = r9.a;
        r8 = r8.l;
        r8 = r8.a();
        if (r8 == 0) goto L_0x0062;
    L_0x004c:
        r8 = r9.d;
        r8 = r8.size();
    L_0x0052:
        r8 = r8 + -1;
        if (r8 < 0) goto L_0x0062;
    L_0x0056:
        r10 = r9.d;
        r10 = r10.get(r8);
        r10 = (defpackage.oq) r10;
        defpackage.ot.a(r9, r10, r5, r7, r4);
        goto L_0x0052;
    L_0x0062:
        r6 = r6 + 1;
        goto L_0x0015;
    L_0x0065:
        r6 = r5.size();
        if (r6 == 0) goto L_0x0461;
    L_0x006b:
        r6 = new android.view.View;
        r9 = r0.k;
        r9 = r9.b;
        r6.<init>(r9);
        r15 = r5.size();
        r14 = 0;
    L_0x0079:
        if (r14 >= r15) goto L_0x0461;
    L_0x007b:
        r9 = r5.keyAt(r14);
        r13 = new zj;
        r13.<init>();
        r10 = r3 + -1;
        r12 = r42;
    L_0x0088:
        if (r10 < r12) goto L_0x00f3;
    L_0x008a:
        r11 = r1.get(r10);
        r11 = (defpackage.my) r11;
        r16 = r11.b(r9);
        if (r16 == 0) goto L_0x00e8;
    L_0x0096:
        r16 = r2.get(r10);
        r16 = (java.lang.Boolean) r16;
        r16 = r16.booleanValue();
        r7 = r11.q;
        if (r7 != 0) goto L_0x00a5;
    L_0x00a4:
        goto L_0x00e8;
    L_0x00a5:
        r7 = r7.size();
        if (r16 == 0) goto L_0x00b0;
    L_0x00ab:
        r8 = r11.q;
        r11 = r11.r;
        goto L_0x00b9;
    L_0x00b0:
        r8 = r11.q;
        r11 = r11.r;
        r38 = r11;
        r11 = r8;
        r8 = r38;
    L_0x00b9:
        r1 = 0;
    L_0x00ba:
        if (r1 >= r7) goto L_0x00e8;
    L_0x00bc:
        r16 = r11.get(r1);
        r2 = r16;
        r2 = (java.lang.String) r2;
        r16 = r8.get(r1);
        r3 = r16;
        r3 = (java.lang.String) r3;
        r16 = r13.remove(r3);
        r17 = r7;
        r7 = r16;
        r7 = (java.lang.String) r7;
        if (r7 == 0) goto L_0x00dc;
    L_0x00d8:
        r13.put(r2, r7);
        goto L_0x00df;
    L_0x00dc:
        r13.put(r2, r3);
    L_0x00df:
        r1 = r1 + 1;
        r2 = r41;
        r3 = r43;
        r7 = r17;
        goto L_0x00ba;
    L_0x00e8:
        r10 = r10 + -1;
        r1 = r40;
        r2 = r41;
        r3 = r43;
        r7 = 1;
        r8 = 0;
        goto L_0x0088;
    L_0x00f3:
        r1 = r5.valueAt(r14);
        r1 = (defpackage.ow) r1;
        if (r4 == 0) goto L_0x02e3;
    L_0x00fb:
        r3 = r0.l;
        r3 = r3.a();
        if (r3 == 0) goto L_0x010c;
    L_0x0103:
        r3 = r0.l;
        r3 = r3.a(r9);
        r3 = (android.view.ViewGroup) r3;
        goto L_0x010d;
    L_0x010c:
        r3 = 0;
    L_0x010d:
        if (r3 == 0) goto L_0x02db;
    L_0x010f:
        r7 = r1.a;
        r8 = r1.d;
        r9 = defpackage.ot.a(r8, r7);
        if (r9 == 0) goto L_0x02db;
    L_0x0119:
        r10 = r1.b;
        r11 = r1.e;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r4 = new java.util.ArrayList;
        r4.<init>();
        r31 = r5;
        r5 = defpackage.ot.a(r9, r7, r10);
        r11 = defpackage.ot.b(r9, r8, r11);
        r12 = r1.a;
        r32 = r14;
        r14 = r1.d;
        r33 = r15;
        if (r12 == 0) goto L_0x0143;
    L_0x013b:
        r15 = r12.A();
        r0 = 0;
        r15.setVisibility(r0);
    L_0x0143:
        if (r12 != 0) goto L_0x0150;
    L_0x0145:
        r36 = r2;
        r34 = r7;
        r30 = r10;
    L_0x014b:
        r35 = r13;
        r15 = 0;
        goto L_0x01ec;
    L_0x0150:
        if (r14 != 0) goto L_0x0153;
    L_0x0152:
        goto L_0x0145;
    L_0x0153:
        r0 = r1.b;
        r15 = r13.isEmpty();
        if (r15 != 0) goto L_0x0162;
    L_0x015b:
        r15 = defpackage.ot.a(r9, r12, r14, r0);
        r30 = r10;
        goto L_0x0165;
    L_0x0162:
        r30 = r10;
        r15 = 0;
    L_0x0165:
        r10 = defpackage.ot.b(r9, r13, r15, r1);
        r34 = r7;
        r7 = defpackage.ot.a(r9, r13, r15, r1);
        r16 = r13.isEmpty();
        if (r16 != 0) goto L_0x0188;
    L_0x0175:
        r16 = r15;
        r15 = r13.keySet();
        defpackage.ot.a(r4, r10, r15);
        r15 = r13.values();
        defpackage.ot.a(r2, r7, r15);
        r15 = r16;
        goto L_0x0193;
    L_0x0188:
        if (r10 == 0) goto L_0x018d;
    L_0x018a:
        r10.clear();
    L_0x018d:
        if (r7 == 0) goto L_0x0192;
    L_0x018f:
        r7.clear();
    L_0x0192:
        r15 = 0;
    L_0x0193:
        if (r5 == 0) goto L_0x0196;
    L_0x0195:
        goto L_0x019d;
    L_0x0196:
        if (r11 != 0) goto L_0x019d;
    L_0x0198:
        if (r15 != 0) goto L_0x019d;
    L_0x019a:
        r36 = r2;
        goto L_0x014b;
    L_0x019d:
        defpackage.ot.a(r12, r14, r0, r10);
        if (r15 == 0) goto L_0x01d2;
    L_0x01a2:
        r2.add(r6);
        r9.a(r15, r6, r4);
        r35 = r13;
        r13 = r1.e;
        r36 = r2;
        r2 = r1.f;
        r16 = r9;
        r17 = r15;
        r18 = r11;
        r19 = r10;
        r20 = r13;
        r21 = r2;
        defpackage.ot.a(r16, r17, r18, r19, r20, r21);
        r2 = new android.graphics.Rect;
        r2.<init>();
        r1 = defpackage.ot.a(r7, r1, r5, r0);
        if (r1 == 0) goto L_0x01cd;
    L_0x01ca:
        r9.a(r5, r2);
    L_0x01cd:
        r28 = r1;
        r29 = r2;
        goto L_0x01da;
    L_0x01d2:
        r36 = r2;
        r35 = r13;
        r28 = 0;
        r29 = 0;
    L_0x01da:
        r1 = new ou;
        r23 = r1;
        r24 = r12;
        r25 = r14;
        r26 = r0;
        r27 = r7;
        r23.<init>(r24, r25, r26, r27, r28, r29);
        defpackage.abd.a(r3, r1);
    L_0x01ec:
        if (r5 != 0) goto L_0x01f4;
    L_0x01ee:
        if (r15 != 0) goto L_0x01f4;
    L_0x01f0:
        if (r11 != 0) goto L_0x01f4;
    L_0x01f2:
        goto L_0x0447;
    L_0x01f4:
        r0 = defpackage.ot.a(r9, r11, r8, r4, r6);
        r1 = r34;
        r2 = r36;
        r7 = defpackage.ot.a(r9, r5, r1, r2, r6);
        r10 = 4;
        defpackage.ot.a(r7, r10);
        r16 = r9;
        r17 = r5;
        r18 = r11;
        r19 = r15;
        r20 = r1;
        r21 = r30;
        r1 = defpackage.ot.a(r16, r17, r18, r19, r20, r21);
        if (r1 == 0) goto L_0x0447;
    L_0x0216:
        if (r8 == 0) goto L_0x023c;
    L_0x0218:
        if (r11 == 0) goto L_0x023c;
    L_0x021a:
        r10 = r8.o;
        if (r10 == 0) goto L_0x023c;
    L_0x021e:
        r10 = r8.C;
        if (r10 == 0) goto L_0x023c;
    L_0x0222:
        r10 = r8.Q;
        if (r10 == 0) goto L_0x023c;
    L_0x0226:
        r14 = 1;
        r8.e(r14);
        r10 = r8.z();
        r9.b(r11, r10, r0);
        r8 = r8.J;
        r10 = new os;
        r10.<init>(r0);
        defpackage.abd.a(r8, r10);
        goto L_0x023d;
    L_0x023c:
        r14 = 1;
    L_0x023d:
        r8 = new java.util.ArrayList;
        r8.<init>();
        r10 = r2.size();
        r12 = 0;
    L_0x0247:
        if (r12 >= r10) goto L_0x025e;
    L_0x0249:
        r13 = r2.get(r12);
        r13 = (android.view.View) r13;
        r14 = defpackage.abe.s(r13);
        r8.add(r14);
        r14 = 0;
        defpackage.abe.a(r13, r14);
        r12 = r12 + 1;
        r14 = 1;
        goto L_0x0247;
    L_0x025e:
        r23 = r9;
        r24 = r1;
        r25 = r5;
        r26 = r7;
        r27 = r11;
        r28 = r0;
        r29 = r15;
        r30 = r2;
        r23.a(r24, r25, r26, r27, r28, r29, r30);
        r9.a(r3, r1);
        r0 = r2.size();
        r1 = new java.util.ArrayList;
        r1.<init>();
        r5 = 0;
    L_0x027e:
        if (r5 >= r0) goto L_0x02be;
    L_0x0280:
        r10 = r4.get(r5);
        r10 = (android.view.View) r10;
        r11 = defpackage.abe.s(r10);
        r1.add(r11);
        if (r11 == 0) goto L_0x02b7;
    L_0x028f:
        r14 = 0;
        defpackage.abe.a(r10, r14);
        r13 = r35;
        r10 = r13.get(r11);
        r10 = (java.lang.String) r10;
        r12 = 0;
    L_0x029c:
        if (r12 < r0) goto L_0x029f;
    L_0x029e:
        goto L_0x02b9;
    L_0x029f:
        r14 = r8.get(r12);
        r14 = r10.equals(r14);
        if (r14 == 0) goto L_0x02b3;
    L_0x02a9:
        r10 = r2.get(r12);
        r10 = (android.view.View) r10;
        defpackage.abe.a(r10, r11);
        goto L_0x02b9;
    L_0x02b3:
        r12 = r12 + 1;
        r14 = 0;
        goto L_0x029c;
    L_0x02b7:
        r13 = r35;
    L_0x02b9:
        r5 = r5 + 1;
        r35 = r13;
        goto L_0x027e;
    L_0x02be:
        r5 = new pf;
        r16 = r5;
        r17 = r0;
        r18 = r2;
        r19 = r8;
        r20 = r4;
        r21 = r1;
        r16.<init>(r17, r18, r19, r20, r21);
        defpackage.abd.a(r3, r5);
        r0 = 0;
        defpackage.ot.a(r7, r0);
        r9.a(r15, r4, r2);
        goto L_0x0447;
    L_0x02db:
        r31 = r5;
        r22 = r14;
        r27 = r15;
        goto L_0x044b;
    L_0x02e3:
        r2 = r0;
        r31 = r5;
        r32 = r14;
        r33 = r15;
        r0 = 0;
        r3 = r2.l;
        r3 = r3.a();
        if (r3 == 0) goto L_0x02fc;
    L_0x02f3:
        r3 = r2.l;
        r3 = r3.a(r9);
        r3 = (android.view.ViewGroup) r3;
        goto L_0x02fd;
    L_0x02fc:
        r3 = 0;
    L_0x02fd:
        if (r3 == 0) goto L_0x0447;
    L_0x02ff:
        r4 = r1.a;
        r5 = r1.d;
        r15 = defpackage.ot.a(r5, r4);
        if (r15 == 0) goto L_0x0447;
    L_0x0309:
        r7 = r1.b;
        r8 = r1.e;
        r14 = defpackage.ot.a(r15, r4, r7);
        r12 = defpackage.ot.b(r15, r5, r8);
        r11 = new java.util.ArrayList;
        r11.<init>();
        r10 = new java.util.ArrayList;
        r10.<init>();
        r9 = r1.a;
        r8 = r1.d;
        if (r9 != 0) goto L_0x033c;
    L_0x0325:
        r23 = r4;
        r24 = r5;
        r25 = r10;
        r2 = r11;
        r37 = r12;
        r5 = r13;
        r8 = r14;
        r0 = r15;
        r22 = r32;
        r27 = r33;
        r7 = 0;
        r20 = 0;
        r26 = 1;
        goto L_0x03d6;
    L_0x033c:
        if (r8 != 0) goto L_0x033f;
    L_0x033e:
        goto L_0x0325;
    L_0x033f:
        r7 = r1.b;
        r16 = r13.isEmpty();
        if (r16 != 0) goto L_0x034e;
    L_0x0347:
        r16 = defpackage.ot.a(r15, r9, r8, r7);
        r0 = r16;
        goto L_0x034f;
    L_0x034e:
        r0 = 0;
    L_0x034f:
        r2 = defpackage.ot.b(r15, r13, r0, r1);
        r16 = r13.isEmpty();
        if (r16 != 0) goto L_0x0365;
    L_0x0359:
        r16 = r0;
        r0 = r2.values();
        r11.addAll(r0);
        r0 = r16;
        goto L_0x0366;
    L_0x0365:
        r0 = 0;
    L_0x0366:
        if (r14 == 0) goto L_0x0369;
    L_0x0368:
        goto L_0x036e;
    L_0x0369:
        if (r12 != 0) goto L_0x036e;
    L_0x036b:
        if (r0 != 0) goto L_0x036e;
    L_0x036d:
        goto L_0x0325;
    L_0x036e:
        defpackage.ot.a(r9, r8, r7, r2);
        if (r0 == 0) goto L_0x03a1;
    L_0x0373:
        r23 = r4;
        r4 = new android.graphics.Rect;
        r4.<init>();
        r15.a(r0, r6, r11);
        r16 = r11;
        r11 = r1.e;
        r24 = r5;
        r5 = r1.f;
        r18 = r7;
        r7 = r15;
        r17 = r8;
        r8 = r0;
        r19 = r9;
        r9 = r12;
        r25 = r10;
        r10 = r2;
        r2 = r16;
        r37 = r12;
        r12 = r5;
        defpackage.ot.a(r7, r8, r9, r10, r11, r12);
        if (r14 == 0) goto L_0x039e;
    L_0x039b:
        r15.a(r14, r4);
    L_0x039e:
        r21 = r4;
        goto L_0x03b2;
    L_0x03a1:
        r23 = r4;
        r24 = r5;
        r18 = r7;
        r17 = r8;
        r19 = r9;
        r25 = r10;
        r2 = r11;
        r37 = r12;
        r21 = 0;
    L_0x03b2:
        r4 = new ox;
        r9 = r4;
        r10 = r15;
        r11 = r13;
        r12 = r0;
        r5 = r13;
        r13 = r1;
        r8 = r14;
        r22 = r32;
        r7 = 0;
        r26 = 1;
        r14 = r25;
        r28 = r0;
        r0 = r15;
        r27 = r33;
        r15 = r6;
        r16 = r19;
        r19 = r2;
        r20 = r8;
        r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
        defpackage.abd.a(r3, r4);
        r20 = r28;
    L_0x03d6:
        if (r8 == 0) goto L_0x03dd;
    L_0x03d8:
        r9 = r24;
        r4 = r37;
        goto L_0x03e7;
    L_0x03dd:
        r4 = r37;
        if (r20 != 0) goto L_0x03e5;
    L_0x03e1:
        if (r4 != 0) goto L_0x03e5;
    L_0x03e3:
        goto L_0x044d;
    L_0x03e5:
        r9 = r24;
    L_0x03e7:
        r2 = defpackage.ot.a(r0, r4, r9, r2, r6);
        if (r2 == 0) goto L_0x03f4;
    L_0x03ed:
        r9 = r2.isEmpty();
        if (r9 != 0) goto L_0x03f4;
    L_0x03f3:
        goto L_0x03f5;
    L_0x03f4:
        r4 = r7;
    L_0x03f5:
        r0.b(r8, r6);
        r12 = r1.b;
        r7 = r0;
        r1 = r8;
        r9 = r4;
        r10 = r20;
        r11 = r23;
        r7 = defpackage.ot.a(r7, r8, r9, r10, r11, r12);
        if (r7 == 0) goto L_0x044d;
    L_0x0407:
        r8 = new java.util.ArrayList;
        r8.<init>();
        r14 = r0;
        r15 = r7;
        r16 = r1;
        r17 = r8;
        r18 = r4;
        r19 = r2;
        r21 = r25;
        r14.a(r15, r16, r17, r18, r19, r20, r21);
        r15 = new ov;
        r9 = r15;
        r10 = r1;
        r11 = r0;
        r12 = r6;
        r13 = r23;
        r14 = r25;
        r1 = r15;
        r15 = r8;
        r16 = r2;
        r17 = r4;
        r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17);
        defpackage.abd.a(r3, r1);
        r1 = new pe;
        r2 = r25;
        r1.<init>(r2, r5);
        defpackage.abd.a(r3, r1);
        r0.a(r3, r7);
        r0 = new ph;
        r0.<init>(r2, r5);
        defpackage.abd.a(r3, r0);
        goto L_0x044d;
    L_0x0447:
        r22 = r32;
        r27 = r33;
    L_0x044b:
        r26 = 1;
    L_0x044d:
        r14 = r22 + 1;
        r0 = r39;
        r1 = r40;
        r2 = r41;
        r3 = r43;
        r4 = r44;
        r15 = r27;
        r5 = r31;
        r7 = 1;
        r8 = 0;
        goto L_0x0079;
    L_0x0461:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ot.a(nv, java.util.ArrayList, java.util.ArrayList, int, int, boolean):void");
    }

    private static pc a(nf nfVar, nf nfVar2) {
        Object K;
        List arrayList = new ArrayList();
        if (nfVar != null) {
            nfVar.H();
            Object G = nfVar.G();
            if (G != null) {
                arrayList.add(G);
            }
            K = nfVar.K();
            if (K != null) {
                arrayList.add(K);
            }
        }
        if (nfVar2 != null) {
            nfVar2.F();
            K = nfVar2.I();
            if (K != null) {
                arrayList.add(K);
            }
            nfVar2.J();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        pc pcVar = b;
        if (pcVar != null && ot.a(pcVar, arrayList)) {
            return b;
        }
        pcVar = c;
        if (pcVar != null && ot.a(pcVar, arrayList)) {
            return c;
        }
        if (b == null && c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    private static boolean a(pc pcVar, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!pcVar.a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static Object a(pc pcVar, nf nfVar, nf nfVar2, boolean z) {
        Object K;
        if (z) {
            K = nfVar2.K();
        } else {
            K = nfVar.J();
        }
        return pcVar.c(pcVar.b(K));
    }

    private static Object a(pc pcVar, nf nfVar, boolean z) {
        if (nfVar == null) {
            return null;
        }
        Object I;
        if (z) {
            I = nfVar.I();
        } else {
            I = nfVar.F();
        }
        return pcVar.b(I);
    }

    private static Object b(pc pcVar, nf nfVar, boolean z) {
        if (nfVar == null) {
            return null;
        }
        Object G;
        if (z) {
            G = nfVar.G();
        } else {
            G = nfVar.H();
        }
        return pcVar.b(G);
    }

    private static void a(ArrayList arrayList, zj zjVar, Collection collection) {
        int i = zjVar.b;
        while (true) {
            i--;
            if (i >= 0) {
                View view = (View) zjVar.c(i);
                if (collection.contains(abe.s(view))) {
                    arrayList.add(view);
                }
            } else {
                return;
            }
        }
    }

    private static zj b(pc pcVar, zj zjVar, Object obj, ow owVar) {
        if (zjVar.isEmpty() || obj == null) {
            zjVar.clear();
            return null;
        }
        Collection collection;
        nf nfVar = owVar.d;
        Map zjVar2 = new zj();
        pcVar.a(zjVar2, nfVar.A());
        my myVar = owVar.f;
        if (owVar.e) {
            nfVar.P();
            collection = myVar.r;
        } else {
            nfVar.Q();
            collection = myVar.q;
        }
        zt.a(zjVar2, collection);
        zt.a((Map) zjVar, zjVar2.keySet());
        return zjVar2;
    }

    static zj a(pc pcVar, zj zjVar, Object obj, ow owVar) {
        nf nfVar = owVar.a;
        View z = nfVar.z();
        if (zjVar.isEmpty() || obj == null || z == null) {
            zjVar.clear();
            return null;
        }
        Collection collection;
        Map zjVar2 = new zj();
        pcVar.a(zjVar2, z);
        my myVar = owVar.c;
        if (owVar.b) {
            nfVar.Q();
            collection = myVar.q;
        } else {
            nfVar.P();
            collection = myVar.r;
        }
        if (collection != null) {
            zt.a(zjVar2, collection);
            zt.a(zjVar2, zjVar.values());
        }
        int i = zjVar.b;
        while (true) {
            i--;
            if (i < 0) {
                return zjVar2;
            }
            if (!zjVar2.containsKey((String) zjVar.c(i))) {
                zjVar.d(i);
            }
        }
    }

    static View a(zj zjVar, ow owVar, Object obj, boolean z) {
        my myVar = owVar.c;
        if (!(obj == null || zjVar == null)) {
            ArrayList arrayList = myVar.q;
            if (!(arrayList == null || arrayList.isEmpty())) {
                Object obj2;
                if (z) {
                    obj2 = (String) myVar.q.get(0);
                } else {
                    obj2 = (String) myVar.r.get(0);
                }
                return (View) zjVar.get(obj2);
            }
        }
        return null;
    }

    private static void a(pc pcVar, Object obj, Object obj2, zj zjVar, boolean z, my myVar) {
        ArrayList arrayList = myVar.q;
        if (arrayList != null && !arrayList.isEmpty()) {
            Object obj3;
            if (z) {
                obj3 = (String) myVar.r.get(0);
            } else {
                obj3 = (String) myVar.q.get(0);
            }
            View view = (View) zjVar.get(obj3);
            pcVar.a(obj, view);
            if (obj2 != null) {
                pcVar.a(obj2, view);
            }
        }
    }

    static void a(nf nfVar, nf nfVar2, boolean z, zj zjVar) {
        if (z) {
            nfVar2.P();
        } else {
            nfVar.P();
        }
    }

    static ArrayList a(pc pcVar, Object obj, nf nfVar, ArrayList arrayList, View view) {
        ArrayList arrayList2;
        if (obj == null) {
            arrayList2 = null;
        } else {
            ArrayList arrayList3 = new ArrayList();
            View z = nfVar.z();
            if (z != null) {
                pcVar.a(arrayList3, z);
            }
            if (arrayList != null) {
                arrayList3.removeAll(arrayList);
            }
            if (arrayList3.isEmpty()) {
                arrayList2 = arrayList3;
            } else {
                arrayList3.add(view);
                pcVar.a(obj, arrayList3);
                return arrayList3;
            }
        }
        return arrayList2;
    }

    static void a(ArrayList arrayList, int i) {
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((View) arrayList.get(size)).setVisibility(i);
                } else {
                    return;
                }
            }
        }
    }

    private static Object a(pc pcVar, Object obj, Object obj2, Object obj3, nf nfVar, boolean z) {
        if (!(obj == null || obj2 == null || nfVar == null)) {
            ng ngVar;
            if (z) {
                ngVar = nfVar.O;
            } else {
                ngVar = nfVar.O;
            }
        }
        return pcVar.a(obj2, obj, obj3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A:{SYNTHETIC, RETURN, SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00e2 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00e2 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A:{SYNTHETIC, RETURN, SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A:{SYNTHETIC, RETURN, SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00e2 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00e2 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A:{SYNTHETIC, RETURN, SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A:{SYNTHETIC, RETURN, SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00e2 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00e2 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A:{SYNTHETIC, RETURN, SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A:{SYNTHETIC, RETURN, SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00e2 A:{SKIP} */
    /* JADX WARNING: Missing block: B:28:0x003b, code skipped:
            if (r6.o != false) goto L_0x0089;
     */
    /* JADX WARNING: Missing block: B:48:0x006b, code skipped:
            if (r6.R >= 0.0f) goto L_0x0077;
     */
    /* JADX WARNING: Missing block: B:52:0x0074, code skipped:
            if (r6.C == false) goto L_0x0077;
     */
    /* JADX WARNING: Missing block: B:53:0x0077, code skipped:
            r12 = 1;
     */
    /* JADX WARNING: Missing block: B:60:0x0086, code skipped:
            if (r6.C == false) goto L_0x0089;
     */
    /* JADX WARNING: Missing block: B:61:0x0089, code skipped:
            r12 = true;
     */
    private static void a(defpackage.my r11, defpackage.oq r12, android.util.SparseArray r13, boolean r14, boolean r15) {
        /*
        r6 = r12.b;
        if (r6 == 0) goto L_0x00ec;
    L_0x0004:
        r7 = r6.A;
        if (r7 == 0) goto L_0x00ec;
    L_0x0008:
        if (r14 == 0) goto L_0x0011;
    L_0x000a:
        r0 = a;
        r12 = r12.a;
        r12 = r0[r12];
        goto L_0x0013;
    L_0x0011:
        r12 = r12.a;
    L_0x0013:
        r0 = 1;
        r1 = 0;
        if (r12 == r0) goto L_0x007e;
    L_0x0017:
        r2 = 3;
        if (r12 == r2) goto L_0x0056;
    L_0x001a:
        r2 = 4;
        if (r12 == r2) goto L_0x003e;
    L_0x001d:
        r2 = 5;
        if (r12 == r2) goto L_0x002b;
    L_0x0020:
        r2 = 6;
        if (r12 == r2) goto L_0x0056;
    L_0x0023:
        r2 = 7;
        if (r12 == r2) goto L_0x007e;
    L_0x0026:
        r12 = 0;
        r0 = 0;
    L_0x0028:
        r8 = 0;
        goto L_0x0092;
    L_0x002b:
        if (r15 != 0) goto L_0x0031;
    L_0x002d:
        r12 = r6.C;
        goto L_0x008f;
    L_0x0031:
        r12 = r6.Q;
        if (r12 == 0) goto L_0x008b;
    L_0x0035:
        r12 = r6.C;
        if (r12 != 0) goto L_0x008b;
    L_0x0039:
        r12 = r6.o;
        if (r12 != 0) goto L_0x0089;
    L_0x003d:
        goto L_0x008b;
    L_0x003e:
        if (r15 == 0) goto L_0x004d;
    L_0x0040:
        r12 = r6.Q;
        if (r12 == 0) goto L_0x0079;
    L_0x0044:
        r12 = r6.o;
        if (r12 == 0) goto L_0x0079;
    L_0x0048:
        r12 = r6.C;
        if (r12 != 0) goto L_0x0077;
    L_0x004c:
        goto L_0x0079;
    L_0x004d:
        r12 = r6.o;
        if (r12 == 0) goto L_0x0079;
    L_0x0051:
        r12 = r6.C;
        if (r12 == 0) goto L_0x0077;
    L_0x0055:
        goto L_0x0079;
    L_0x0056:
        if (r15 == 0) goto L_0x006e;
    L_0x0058:
        r12 = r6.o;
        if (r12 != 0) goto L_0x0079;
    L_0x005c:
        r12 = r6.K;
        if (r12 == 0) goto L_0x0079;
    L_0x0060:
        r12 = r12.getVisibility();
        if (r12 != 0) goto L_0x0079;
    L_0x0066:
        r12 = r6.R;
        r2 = 0;
        r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1));
        if (r12 >= 0) goto L_0x0077;
    L_0x006d:
        goto L_0x0079;
    L_0x006e:
        r12 = r6.o;
        if (r12 == 0) goto L_0x0079;
    L_0x0072:
        r12 = r6.C;
        if (r12 == 0) goto L_0x0077;
    L_0x0076:
        goto L_0x0079;
    L_0x0077:
        r12 = 1;
        goto L_0x007a;
    L_0x0079:
        r12 = 0;
    L_0x007a:
        r8 = r12;
        r12 = 1;
        r0 = 0;
        goto L_0x0092;
    L_0x007e:
        if (r15 != 0) goto L_0x008d;
    L_0x0080:
        r12 = r6.o;
        if (r12 != 0) goto L_0x008b;
    L_0x0084:
        r12 = r6.C;
        if (r12 == 0) goto L_0x0089;
    L_0x0088:
        goto L_0x008b;
    L_0x0089:
        r12 = 1;
        goto L_0x008f;
    L_0x008b:
        r12 = 0;
        goto L_0x008f;
    L_0x008d:
        r12 = r6.P;
    L_0x008f:
        r1 = r12;
        r12 = 0;
        goto L_0x0028;
    L_0x0092:
        r2 = r13.get(r7);
        r2 = (defpackage.ow) r2;
        if (r1 == 0) goto L_0x00a4;
    L_0x009a:
        r2 = defpackage.ot.a(r2, r13, r7);
        r2.a = r6;
        r2.b = r14;
        r2.c = r11;
    L_0x00a4:
        r9 = r2;
        r10 = 0;
        if (r15 != 0) goto L_0x00cb;
    L_0x00a8:
        if (r0 == 0) goto L_0x00cb;
    L_0x00aa:
        if (r9 == 0) goto L_0x00b2;
    L_0x00ac:
        r0 = r9.d;
        if (r0 != r6) goto L_0x00b2;
    L_0x00b0:
        r9.d = r10;
    L_0x00b2:
        r0 = r11.a;
        r1 = r6.e;
        if (r1 > 0) goto L_0x00cb;
    L_0x00b8:
        r1 = r0.j;
        if (r1 <= 0) goto L_0x00cb;
    L_0x00bc:
        r1 = r11.s;
        if (r1 != 0) goto L_0x00cb;
    L_0x00c0:
        r0.e(r6);
        r2 = 1;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r1 = r6;
        r0.a(r1, r2, r3, r4, r5);
    L_0x00cb:
        if (r8 != 0) goto L_0x00ce;
    L_0x00cd:
        goto L_0x00e0;
    L_0x00ce:
        if (r9 != 0) goto L_0x00d1;
    L_0x00d0:
        goto L_0x00d6;
    L_0x00d1:
        r0 = r9.d;
        if (r0 == 0) goto L_0x00d6;
    L_0x00d5:
        goto L_0x00e0;
    L_0x00d6:
        r9 = defpackage.ot.a(r9, r13, r7);
        r9.d = r6;
        r9.e = r14;
        r9.f = r11;
    L_0x00e0:
        if (r15 != 0) goto L_0x00ec;
    L_0x00e2:
        if (r12 == 0) goto L_0x00ec;
    L_0x00e4:
        if (r9 == 0) goto L_0x00ec;
    L_0x00e6:
        r11 = r9.a;
        if (r11 != r6) goto L_0x00ec;
    L_0x00ea:
        r9.a = r10;
    L_0x00ec:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ot.a(my, oq, android.util.SparseArray, boolean, boolean):void");
    }

    private static ow a(ow owVar, SparseArray sparseArray, int i) {
        if (owVar != null) {
            return owVar;
        }
        owVar = new ow();
        sparseArray.put(i, owVar);
        return owVar;
    }

    static {
        pc pcVar;
        try {
            pcVar = (pc) Class.forName("bge").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            pcVar = null;
        }
        c = pcVar;
    }
}
