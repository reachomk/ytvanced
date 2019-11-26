package defpackage;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/* renamed from: xtq */
public final class xtq {
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0211 A:{LOOP_END, LOOP:4: B:81:0x020b->B:83:0x0211} */
    public static void a(java.util.List r20, java.util.List r21, defpackage.xtr r22) {
        /*
        defpackage.amqw.a(r22);
        defpackage.amqw.a(r20);
        defpackage.amqw.a(r21);
        r0 = r20.isEmpty();
        r1 = r21.isEmpty();
        r2 = 0;
        if (r0 != 0) goto L_0x0015;
    L_0x0014:
        goto L_0x001c;
    L_0x0015:
        if (r1 == 0) goto L_0x001c;
    L_0x0017:
        r0 = java.util.Collections.emptyList();
        goto L_0x002c;
    L_0x001c:
        r3 = 3;
        if (r0 == 0) goto L_0x002f;
    L_0x001f:
        r0 = new xtt;
        r1 = defpackage.amul.a(r21);
        r0.<init>(r3, r1);
        r0 = java.util.Collections.singletonList(r0);
    L_0x002c:
        r4 = 0;
        goto L_0x0207;
    L_0x002f:
        r0 = 4;
        if (r1 == 0) goto L_0x0040;
    L_0x0032:
        r1 = new xtt;
        r3 = defpackage.amul.a(r20);
        r1.<init>(r0, r3);
        r0 = java.util.Collections.singletonList(r1);
        goto L_0x002c;
    L_0x0040:
        r1 = r20.size();
        r4 = -1;
        r5 = 1;
        if (r1 == r5) goto L_0x0183;
    L_0x0048:
        r1 = r21.size();
        if (r1 == r5) goto L_0x0183;
    L_0x004e:
        r1 = defpackage.xtq.a(r20);
        r6 = defpackage.xtq.a(r21);
        r7 = r1.size();
        r8 = r6.size();
        r9 = new java.util.ArrayList;
        r9.<init>(r8);
        r10 = 0;
        r9.add(r10);
        r10 = 1;
    L_0x0068:
        if (r10 >= r8) goto L_0x0081;
    L_0x006a:
        r11 = new xts;
        r12 = r6.get(r10);
        r13 = r10 + -1;
        r13 = r9.get(r13);
        r13 = (defpackage.xts) r13;
        r11.<init>(r3, r12, r13);
        r9.add(r11);
        r10 = r10 + 1;
        goto L_0x0068;
    L_0x0081:
        r10 = new java.util.ArrayList;
        r10.<init>(r8);
        r11 = r10;
        r10 = r9;
        r9 = 1;
    L_0x0089:
        if (r9 >= r7) goto L_0x0136;
    L_0x008b:
        r11.clear();
        r12 = r10.get(r2);
        r12 = (defpackage.xts) r12;
        r13 = r1.get(r9);
        r14 = new xts;
        r15 = r10.get(r2);
        r15 = (defpackage.xts) r15;
        r14.<init>(r0, r13, r15);
        r11.add(r14);
        r15 = r14;
        r14 = r12;
        r12 = 1;
    L_0x00a9:
        if (r12 < r8) goto L_0x00b3;
    L_0x00ab:
        r9 = r9 + 1;
        r19 = r11;
        r11 = r10;
        r10 = r19;
        goto L_0x0089;
    L_0x00b3:
        r16 = r10.get(r12);
        r16 = (defpackage.xts) r16;
        r0 = r6.get(r12);
        r0 = defpackage.amqq.a(r13, r0);
        r2 = 2;
        if (r0 == 0) goto L_0x00ca;
    L_0x00c4:
        r0 = defpackage.xts.a(r14);
        r14 = 1;
        goto L_0x00d2;
    L_0x00ca:
        r0 = defpackage.xts.a(r14);
        r14 = 1069547520; // 0x3fc00000 float:1.5 double:5.28426686E-315;
        r0 = r0 + r14;
        r14 = 2;
    L_0x00d2:
        r17 = defpackage.xts.a(r15);
        r18 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r17 = r17 + r18;
        r17 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1));
        if (r17 <= 0) goto L_0x00e5;
    L_0x00de:
        r0 = defpackage.xts.a(r15);
        r0 = r0 + r18;
        r14 = 3;
    L_0x00e5:
        r15 = defpackage.xts.a(r16);
        r15 = r15 + r18;
        r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1));
        if (r0 <= 0) goto L_0x00f0;
    L_0x00ef:
        r14 = 4;
    L_0x00f0:
        r0 = r14 + -1;
        if (r0 == r2) goto L_0x0119;
    L_0x00f4:
        if (r0 == r3) goto L_0x0109;
    L_0x00f6:
        r0 = new xts;
        r2 = r6.get(r12);
        r15 = r12 + -1;
        r15 = r10.get(r15);
        r15 = (defpackage.xts) r15;
        r0.<init>(r14, r2, r15);
    L_0x0107:
        r15 = r0;
        goto L_0x012b;
    L_0x0109:
        r0 = new xts;
        r2 = r1.get(r9);
        r15 = r10.get(r12);
        r15 = (defpackage.xts) r15;
        r0.<init>(r14, r2, r15);
        goto L_0x0107;
    L_0x0119:
        r0 = new xts;
        r2 = r6.get(r12);
        r15 = r12 + -1;
        r15 = r11.get(r15);
        r15 = (defpackage.xts) r15;
        r0.<init>(r14, r2, r15);
        goto L_0x0107;
    L_0x012b:
        r11.add(r15);
        r12 = r12 + 1;
        r14 = r16;
        r0 = 4;
        r2 = 0;
        goto L_0x00a9;
    L_0x0136:
        r8 = r8 + r4;
        r0 = r10.get(r8);
        r0 = (defpackage.xts) r0;
        if (r0 != 0) goto L_0x0145;
    L_0x013f:
        r0 = java.util.Collections.emptyList();
        goto L_0x002c;
    L_0x0145:
        r1 = new java.util.ArrayDeque;
        r1.<init>();
        r2 = r0.a;
        r3 = new java.util.ArrayDeque;
        r3.<init>();
    L_0x0151:
        if (r0 == 0) goto L_0x0170;
    L_0x0153:
        r4 = r3.isEmpty();
        if (r4 == 0) goto L_0x015a;
    L_0x0159:
        goto L_0x0168;
    L_0x015a:
        r4 = r0.a;
        if (r2 == r4) goto L_0x0168;
    L_0x015e:
        r2 = defpackage.xtq.a(r2, r3);
        r1.addFirst(r2);
        r3.clear();
    L_0x0168:
        r2 = r0.a;
        r3.addFirst(r0);
        r0 = r0.c;
        goto L_0x0151;
    L_0x0170:
        r0 = r3.isEmpty();
        if (r0 != 0) goto L_0x017d;
    L_0x0176:
        r0 = defpackage.xtq.a(r2, r3);
        r1.addFirst(r0);
    L_0x017d:
        r0 = defpackage.amul.a(r1);
        goto L_0x002c;
    L_0x0183:
        r0 = r20.size();
        if (r0 == r5) goto L_0x018c;
    L_0x0189:
        r1 = r21;
        goto L_0x018e;
    L_0x018c:
        r1 = r20;
    L_0x018e:
        r2 = new java.util.ArrayList;
        r2.<init>(r1);
        if (r0 != r5) goto L_0x0198;
    L_0x0195:
        r1 = r21;
        goto L_0x019a;
    L_0x0198:
        r1 = r20;
    L_0x019a:
        r6 = new java.util.ArrayList;
        r6.<init>(r1);
        r1 = 0;
        r7 = r2.get(r1);
        r1 = r6.indexOf(r7);
        r7 = new java.util.ArrayList;
        r7.<init>(r3);
        if (r1 != r4) goto L_0x01d6;
    L_0x01af:
        if (r0 != r5) goto L_0x01c3;
    L_0x01b1:
        r0 = new xtt;
        r4 = 4;
        r0.<init>(r4, r2);
        r7.add(r0);
        r0 = new xtt;
        r0.<init>(r3, r6);
        r7.add(r0);
        goto L_0x01d4;
    L_0x01c3:
        r4 = 4;
        r0 = new xtt;
        r0.<init>(r4, r6);
        r7.add(r0);
        r0 = new xtt;
        r0.<init>(r3, r2);
        r7.add(r0);
    L_0x01d4:
        r4 = 0;
        goto L_0x0206;
    L_0x01d6:
        r4 = 4;
        if (r0 == r5) goto L_0x01da;
    L_0x01d9:
        r3 = 4;
    L_0x01da:
        if (r1 <= 0) goto L_0x01ea;
    L_0x01dc:
        r0 = new xtt;
        r4 = 0;
        r8 = r6.subList(r4, r1);
        r0.<init>(r3, r8);
        r7.add(r0);
        goto L_0x01eb;
    L_0x01ea:
        r4 = 0;
    L_0x01eb:
        r0 = new xtt;
        r0.<init>(r5, r2);
        r7.add(r0);
        r1 = r1 + r5;
        r0 = r6.size();
        if (r1 >= r0) goto L_0x0206;
    L_0x01fa:
        r2 = new xtt;
        r0 = r6.subList(r1, r0);
        r2.<init>(r3, r0);
        r7.add(r2);
    L_0x0206:
        r0 = r7;
    L_0x0207:
        r0 = r0.iterator();
    L_0x020b:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0222;
    L_0x0211:
        r1 = r0.next();
        r1 = (defpackage.xtu) r1;
        r2 = r22;
        r2.a(r1, r4);
        r1 = r1.a();
        r4 = r4 + r1;
        goto L_0x020b;
    L_0x0222:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xtq.a(java.util.List, java.util.List, xtr):void");
    }

    private static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.add(null);
        arrayList.addAll(list);
        return arrayList;
    }

    private static xtu a(int i, Deque deque) {
        if (deque.size() == 1) {
            return (xtu) deque.getFirst();
        }
        amuo a = amul.a(deque.size());
        for (xts xts : deque) {
            a.c(xts.b);
        }
        return new xtt(i, a.a());
    }
}
