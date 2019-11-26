package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: annz */
public final class annz implements annp {
    public final List a;
    public final Map b = new HashMap();
    public final anob c = new anob();

    /* JADX WARNING: Missing block: B:14:0x008f, code skipped:
            r1 = r5;
     */
    public annz(java.lang.Iterable r10, defpackage.annn... r11) {
        /*
        r9 = this;
        r9.<init>();
        r0 = new java.util.HashMap;
        r0.<init>();
        r9.b = r0;
        r0 = new anob;
        r0.<init>();
        r9.c = r0;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r9.c;
        r2 = defpackage.anob.class;
        r3 = 2;
        r4 = new java.lang.Class[r3];
        r5 = defpackage.anol.class;
        r6 = 0;
        r4[r6] = r5;
        r5 = defpackage.anoj.class;
        r7 = 1;
        r4[r7] = r5;
        r1 = defpackage.annn.a(r1, r2, r4);
        r0.add(r1);
        r10 = r10.iterator();
    L_0x0032:
        r1 = r10.hasNext();
        if (r1 == 0) goto L_0x0046;
    L_0x0038:
        r1 = r10.next();
        r1 = (defpackage.anns) r1;
        r1 = r1.getComponents();
        r0.addAll(r1);
        goto L_0x0032;
    L_0x0046:
        java.util.Collections.addAll(r0, r11);
        r10 = new java.util.HashMap;
        r11 = r0.size();
        r10.<init>(r11);
        r11 = r0.size();
        r1 = 0;
    L_0x0057:
        if (r1 >= r11) goto L_0x0091;
    L_0x0059:
        r2 = r0.get(r1);
        r2 = (defpackage.annn) r2;
        r4 = new anoc;
        r4.<init>(r2);
        r2 = r2.a;
        r2 = r2.iterator();
    L_0x006a:
        r5 = r1 + 1;
        r8 = r2.hasNext();
        if (r8 == 0) goto L_0x008f;
    L_0x0072:
        r5 = r2.next();
        r5 = (java.lang.Class) r5;
        r8 = r10.put(r5, r4);
        if (r8 != 0) goto L_0x007f;
    L_0x007e:
        goto L_0x006a;
    L_0x007f:
        r10 = new java.lang.IllegalArgumentException;
        r11 = new java.lang.Object[r7];
        r11[r6] = r5;
        r0 = "Multiple components provide %s.";
        r11 = java.lang.String.format(r0, r11);
        r10.<init>(r11);
        throw r10;
    L_0x008f:
        r1 = r5;
        goto L_0x0057;
    L_0x0091:
        r11 = r10.values();
        r11 = r11.iterator();
    L_0x0099:
        r1 = r11.hasNext();
        if (r1 == 0) goto L_0x00ce;
    L_0x009f:
        r1 = r11.next();
        r1 = (defpackage.anoc) r1;
        r2 = r1.a;
        r2 = r2.b;
        r2 = r2.iterator();
    L_0x00ad:
        r4 = r2.hasNext();
        if (r4 == 0) goto L_0x0099;
    L_0x00b3:
        r4 = r2.next();
        r4 = (defpackage.annr) r4;
        r4 = r4.a;
        r4 = r10.get(r4);
        r4 = (defpackage.anoc) r4;
        if (r4 == 0) goto L_0x00ad;
    L_0x00c3:
        r5 = r1.b;
        r5.add(r4);
        r4 = r4.c;
        r4.add(r1);
        goto L_0x00ad;
    L_0x00ce:
        r11 = new java.util.HashSet;
        r10 = r10.values();
        r11.<init>(r10);
        r10 = new java.util.HashSet;
        r10.<init>();
        r1 = r11.iterator();
    L_0x00e0:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x00f6;
    L_0x00e6:
        r2 = r1.next();
        r2 = (defpackage.anoc) r2;
        r4 = r2.a();
        if (r4 == 0) goto L_0x00e0;
    L_0x00f2:
        r10.add(r2);
        goto L_0x00e0;
    L_0x00f6:
        r1 = new java.util.ArrayList;
        r1.<init>();
    L_0x00fb:
        r2 = r10.isEmpty();
        if (r2 != 0) goto L_0x0134;
    L_0x0101:
        r2 = r10.iterator();
        r2 = r2.next();
        r2 = (defpackage.anoc) r2;
        r10.remove(r2);
        r4 = r2.a;
        r1.add(r4);
        r4 = r2.b;
        r4 = r4.iterator();
    L_0x0119:
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x00fb;
    L_0x011f:
        r5 = r4.next();
        r5 = (defpackage.anoc) r5;
        r8 = r5.c;
        r8.remove(r2);
        r8 = r5.a();
        if (r8 == 0) goto L_0x0119;
    L_0x0130:
        r10.add(r5);
        goto L_0x0119;
    L_0x0134:
        r10 = r1.size();
        r0 = r0.size();
        if (r10 != r0) goto L_0x01c5;
    L_0x013e:
        java.util.Collections.reverse(r1);
        r10 = java.util.Collections.unmodifiableList(r1);
        r9.a = r10;
        r10 = r9.a;
        r10 = r10.iterator();
    L_0x014d:
        r11 = r10.hasNext();
        if (r11 == 0) goto L_0x017d;
    L_0x0153:
        r11 = r10.next();
        r11 = (defpackage.annn) r11;
        r0 = new anod;
        r1 = r11.d;
        r2 = new anof;
        r2.<init>(r11, r9);
        r0.<init>(r1, r2);
        r11 = r11.a;
        r11 = r11.iterator();
    L_0x016b:
        r1 = r11.hasNext();
        if (r1 == 0) goto L_0x014d;
    L_0x0171:
        r1 = r11.next();
        r1 = (java.lang.Class) r1;
        r2 = r9.b;
        r2.put(r1, r0);
        goto L_0x016b;
    L_0x017d:
        r10 = r9.a;
        r10 = r10.iterator();
    L_0x0183:
        r11 = r10.hasNext();
        if (r11 == 0) goto L_0x01c4;
    L_0x0189:
        r11 = r10.next();
        r11 = (defpackage.annn) r11;
        r0 = r11.b;
        r0 = r0.iterator();
    L_0x0195:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0183;
    L_0x019b:
        r1 = r0.next();
        r1 = (defpackage.annr) r1;
        r2 = r1.b;
        if (r2 != r7) goto L_0x0195;
    L_0x01a5:
        r2 = r9.b;
        r4 = r1.a;
        r2 = r2.containsKey(r4);
        if (r2 == 0) goto L_0x01b0;
    L_0x01af:
        goto L_0x0195;
    L_0x01b0:
        r10 = new annw;
        r0 = new java.lang.Object[r3];
        r0[r6] = r11;
        r11 = r1.a;
        r0[r7] = r11;
        r11 = "Unsatisfied dependency for component %s: %s";
        r11 = java.lang.String.format(r11, r0);
        r10.<init>(r11);
        throw r10;
    L_0x01c4:
        return;
    L_0x01c5:
        r10 = new java.util.ArrayList;
        r10.<init>();
        r11 = r11.iterator();
    L_0x01ce:
        r0 = r11.hasNext();
        if (r0 == 0) goto L_0x01ee;
    L_0x01d4:
        r0 = r11.next();
        r0 = (defpackage.anoc) r0;
        r1 = r0.a();
        if (r1 != 0) goto L_0x01ce;
    L_0x01e0:
        r1 = r0.b;
        r1 = r1.isEmpty();
        if (r1 != 0) goto L_0x01ce;
    L_0x01e8:
        r0 = r0.a;
        r10.add(r0);
        goto L_0x01ce;
    L_0x01ee:
        r11 = new annu;
        r11.<init>(r10);
        goto L_0x01f5;
    L_0x01f4:
        throw r11;
    L_0x01f5:
        goto L_0x01f4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.annz.<init>(java.lang.Iterable, annn[]):void");
    }

    public final Object a(Class cls) {
        return anno.a(this, cls);
    }
}
