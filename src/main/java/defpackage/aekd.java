package defpackage;

/* renamed from: aekd */
public final class aekd implements aajz {
    private final afhg a;
    private final aajk b;
    private final afjj c;

    public aekd(afhg afhg, aajk aajk, afjj afjj) {
        this.a = afhg;
        this.b = aajk;
        this.c = afjj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0220  */
    public final defpackage.aajs a(defpackage.aajs r20, java.lang.String r21) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r20;
        r2 = r20.x();
        if (r2 == 0) goto L_0x031a;
    L_0x000a:
        r2 = new aeke;
        r3 = r1.c;
        r4 = r20.j();
        r5 = r21;
        r2.<init>(r3, r5, r4);
        r3 = new aejy;
        r4 = r0.a;
        r5 = r0.b;
        r5 = r5.get();
        r5 = (defpackage.aajj) r5;
        r6 = 0;
        r3.<init>(r4, r5, r2, r6);
        r2 = r0.c;
        r2 = r2.a;
        r4 = new aegl;
        r4.<init>();
        r2.a(r4);
        r2 = r3.call();
        r2 = (defpackage.aaiz) r2;
        if (r2 == 0) goto L_0x031a;
    L_0x003b:
        r3 = r0.c;
        r3 = r3.a;
        r4 = new aegm;
        r4.<init>();
        r3.a(r4);
        r3 = r2.l;
        r3 = (defpackage.npf) r3;
        if (r3 == 0) goto L_0x031a;
    L_0x004d:
        r4 = r3.b();
        if (r4 == 0) goto L_0x031a;
    L_0x0053:
        r4 = 0;
        r5 = r3.a(r4);
        if (r5 == 0) goto L_0x031a;
    L_0x005a:
        r5 = r5.b;
        if (r5 == 0) goto L_0x031a;
    L_0x005e:
        r5 = new java.util.ArrayList;
        r5.<init>();
        r7 = r3.a(r4);
        r7 = r7.b;
        r7 = r7.iterator();
    L_0x006d:
        r8 = r7.hasNext();
        r10 = 1;
        if (r8 == 0) goto L_0x027f;
    L_0x0074:
        r8 = r7.next();
        r8 = (defpackage.npe) r8;
        r11 = r8.a;
        if (r11 != r10) goto L_0x007f;
    L_0x007e:
        goto L_0x0081;
    L_0x007f:
        if (r11 != 0) goto L_0x006d;
    L_0x0081:
        r11 = r8.b;
        r11 = r11.iterator();
    L_0x0087:
        r12 = r11.hasNext();
        if (r12 == 0) goto L_0x006d;
    L_0x008d:
        r12 = r11.next();
        r12 = (defpackage.npm) r12;
        r13 = defpackage.arlv.E;
        r13 = r13.createBuilder();
        r13 = (defpackage.arlx) r13;
        r14 = r12.b;
        r14 = r14.a;
        r14 = defpackage.aajy.a(r14);
        r13.a(r14);
        r14 = r12.b;
        r14 = r14.a;
        r14 = defpackage.aajy.b(r14);
        r13.c(r14);
        r14 = r12.b;
        r14 = r14.b;
        r13.b(r14);
        r14 = r12.b;
        r14 = r14.c;
        r13.b(r14);
        r14 = r12.b;
        r14 = r14.d;
        r14 = java.lang.Math.max(r4, r14);
        r13.c(r14);
        r14 = r12.b;
        r14 = r14.e;
        r14 = java.lang.Math.max(r4, r14);
        r13.d(r14);
        r14 = r12.b;
        r14 = r14.f;
        r14 = java.lang.Math.round(r14);
        r13.copyOnWrite();
        r15 = r13.instance;
        r15 = (defpackage.arlv) r15;
        r9 = r15.a;
        r9 = r9 | 512;
        r15.a = r9;
        r15.k = r14;
        r14 = r12.a;
        r16 = -1;
        r9 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1));
        if (r9 == 0) goto L_0x00f5;
    L_0x00f4:
        goto L_0x00f7;
    L_0x00f5:
        r14 = 0;
    L_0x00f7:
        r13.a(r14);
        r9 = r8.a();
        r14 = 3;
        if (r9 == 0) goto L_0x0156;
    L_0x0101:
        r13.e(r14);
        r9 = r8.c;
        r9 = r9.iterator();
    L_0x010a:
        r15 = r9.hasNext();
        if (r15 == 0) goto L_0x015a;
    L_0x0110:
        r15 = r9.next();
        r15 = (defpackage.npd) r15;
        r14 = r15 instanceof defpackage.aekf;
        if (r14 == 0) goto L_0x0154;
    L_0x011a:
        r15 = (defpackage.aekf) r15;
        r14 = r15.d;
        r15 = 0;
    L_0x011f:
        r4 = r14.size();
        if (r15 >= r4) goto L_0x0153;
    L_0x0125:
        r4 = r14.keyAt(r15);
        r4 = defpackage.atzi.a(r4);
        if (r4 != 0) goto L_0x0130;
    L_0x012f:
        goto L_0x014e;
    L_0x0130:
        r13.copyOnWrite();
        r6 = r13.instance;
        r6 = (defpackage.arlv) r6;
        r10 = r6.s;
        r10 = r10.a();
        if (r10 != 0) goto L_0x0147;
    L_0x013f:
        r10 = r6.s;
        r10 = defpackage.anxl.mutableCopy(r10);
        r6.s = r10;
    L_0x0147:
        r6 = r6.s;
        r4 = r4.c;
        r6.d(r4);
    L_0x014e:
        r15 = r15 + 1;
        r6 = 0;
        r10 = 1;
        goto L_0x011f;
    L_0x0153:
        r4 = 0;
    L_0x0154:
        r14 = 3;
        goto L_0x010a;
    L_0x0156:
        r4 = 1;
        r13.e(r4);
    L_0x015a:
        r4 = r8 instanceof defpackage.aekg;
        if (r4 == 0) goto L_0x021b;
    L_0x015e:
        r4 = r8;
        r4 = (defpackage.aekg) r4;
        r6 = r4.g;
        r9 = "equirectangular";
        r6 = r9.equals(r6);
        r9 = "layout_top_bottom";
        if (r6 == 0) goto L_0x017c;
    L_0x016d:
        r6 = r4.h;
        if (r6 == 0) goto L_0x017a;
    L_0x0171:
        r6 = r9.equals(r6);
        if (r6 != 0) goto L_0x0178;
    L_0x0177:
        goto L_0x017c;
    L_0x0178:
        r10 = 4;
        goto L_0x0189;
    L_0x017a:
        r10 = 3;
        goto L_0x0189;
    L_0x017c:
        r6 = r4.g;
        r10 = "mesh";
        r6 = r10.equals(r6);
        if (r6 != 0) goto L_0x0188;
    L_0x0186:
        r10 = 1;
        goto L_0x0189;
    L_0x0188:
        r10 = 5;
    L_0x0189:
        r13.copyOnWrite();
        r6 = r13.instance;
        r6 = (defpackage.arlv) r6;
        r14 = r6.a;
        r15 = 16777216; // 0x1000000 float:2.3509887E-38 double:8.289046E-317;
        r14 = r14 | r15;
        r6.a = r14;
        r10 = r10 + -1;
        r6.v = r10;
        r6 = r4.h;
        if (r6 == 0) goto L_0x01b6;
    L_0x019f:
        r10 = "layout_left_right";
        r6 = r10.equals(r6);
        if (r6 != 0) goto L_0x01b3;
    L_0x01a7:
        r6 = r4.h;
        r6 = r9.equals(r6);
        if (r6 != 0) goto L_0x01b0;
    L_0x01af:
        goto L_0x01b6;
    L_0x01b0:
        r18 = 3;
        goto L_0x01b8;
    L_0x01b3:
        r18 = 2;
        goto L_0x01b8;
    L_0x01b6:
        r18 = 1;
    L_0x01b8:
        r13.copyOnWrite();
        r6 = r13.instance;
        r6 = (defpackage.arlv) r6;
        r9 = r6.a;
        r10 = 67108864; // 0x4000000 float:1.5046328E-36 double:3.31561842E-316;
        r9 = r9 | r10;
        r6.a = r9;
        r9 = r18 + -1;
        r6.w = r9;
        r6 = r4.a;
        r9 = 1;
        if (r6 == r9) goto L_0x01d1;
    L_0x01cf:
        r6 = 0;
        goto L_0x01f5;
    L_0x01d1:
        r6 = defpackage.aoyg.e;
        r6 = r6.createBuilder();
        r6 = (defpackage.aoyf) r6;
        r9 = r4.d;
        if (r9 == 0) goto L_0x01e0;
    L_0x01dd:
        r6.b(r9);
    L_0x01e0:
        r9 = r4.e;
        if (r9 == 0) goto L_0x01e7;
    L_0x01e4:
        r6.a(r9);
    L_0x01e7:
        r4 = r4.f;
        r6.a(r4);
        r4 = r6.build();
        r4 = (defpackage.anxl) r4;
        r6 = r4;
        r6 = (defpackage.aoyg) r6;
    L_0x01f5:
        if (r6 == 0) goto L_0x0208;
    L_0x01f7:
        r13.copyOnWrite();
        r4 = r13.instance;
        r4 = (defpackage.arlv) r4;
        r4.x = r6;
        r6 = r4.a;
        r9 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r6 = r6 | r9;
        r4.a = r6;
        goto L_0x021b;
    L_0x0208:
        r13.copyOnWrite();
        r4 = r13.instance;
        r4 = (defpackage.arlv) r4;
        r6 = 0;
        r4.x = r6;
        r9 = r4.a;
        r10 = -268435457; // 0xffffffffefffffff float:-1.5845632E29 double:NaN;
        r9 = r9 & r10;
        r4.a = r9;
        goto L_0x021c;
    L_0x021b:
        r6 = 0;
    L_0x021c:
        r4 = r12 instanceof defpackage.npo;
        if (r4 == 0) goto L_0x026b;
    L_0x0220:
        r12 = (defpackage.npo) r12;
        r4 = r12.g;
        r4 = r4.toString();
        r13.a(r4);
        r4 = r12.f;
        r9 = defpackage.armb.d;
        r9 = r9.createBuilder();
        r9 = (defpackage.arma) r9;
        r14 = r4.a;
        r9.a(r14);
        r14 = r4.a;
        r10 = r7;
        r6 = r4.b;
        r14 = r14 + r6;
        r14 = r14 + r16;
        r9.b(r14);
        r13.a(r9);
        r4 = r12.i;
        r6 = defpackage.armb.d;
        r6 = r6.createBuilder();
        r6 = (defpackage.arma) r6;
        r14 = r4.a;
        r6.a(r14);
        r14 = r4.a;
        r9 = r8;
        r7 = r4.b;
        r14 = r14 + r7;
        r14 = r14 + r16;
        r6.b(r14);
        r13.b(r6);
        r6 = r12.h;
        r13.b(r6);
        goto L_0x026d;
    L_0x026b:
        r10 = r7;
        r9 = r8;
    L_0x026d:
        r4 = r13.build();
        r4 = (defpackage.anxl) r4;
        r4 = (defpackage.arlv) r4;
        r5.add(r4);
        r8 = r9;
        r7 = r10;
        r4 = 0;
        r6 = 0;
        r10 = 1;
        goto L_0x0087;
    L_0x027f:
        r4 = new java.util.ArrayList;
        r4.<init>();
        r6 = 0;
        r3 = r3.a(r6);
        r3 = r3.b;
        r3 = r3.iterator();
    L_0x028f:
        r7 = r3.hasNext();
        if (r7 == 0) goto L_0x0316;
    L_0x0295:
        r7 = r3.next();
        r7 = (defpackage.npe) r7;
        r8 = r7.a();
        if (r8 == 0) goto L_0x028f;
    L_0x02a1:
        r7 = r7.c;
        r7 = r7.iterator();
    L_0x02a7:
        r8 = r7.hasNext();
        if (r8 == 0) goto L_0x028f;
    L_0x02ad:
        r8 = r7.next();
        r8 = (defpackage.npd) r8;
        r9 = r8 instanceof defpackage.aekf;
        if (r9 == 0) goto L_0x02a7;
    L_0x02b7:
        r8 = (defpackage.aekf) r8;
        r8 = r8.d;
        r9 = 0;
    L_0x02bc:
        r10 = r8.size();
        if (r9 >= r10) goto L_0x02a7;
    L_0x02c2:
        r10 = r8.keyAt(r9);
        r10 = defpackage.atzi.a(r10);
        r11 = defpackage.atzg.e;
        r11 = r11.createBuilder();
        r11 = (defpackage.atzf) r11;
        r11.copyOnWrite();
        r12 = r11.instance;
        r12 = (defpackage.atzg) r12;
        if (r10 == 0) goto L_0x0310;
    L_0x02db:
        r13 = r12.a;
        r14 = 1;
        r13 = r13 | r14;
        r12.a = r13;
        r10 = r10.c;
        r12.b = r10;
        r10 = r8.get(r10);
        r10 = (java.lang.String) r10;
        r11.copyOnWrite();
        r12 = r11.instance;
        r12 = (defpackage.atzg) r12;
        if (r10 == 0) goto L_0x030a;
    L_0x02f4:
        r13 = r12.a;
        r15 = 2;
        r13 = r13 | r15;
        r12.a = r13;
        r12.c = r10;
        r10 = r11.build();
        r10 = (defpackage.anxl) r10;
        r10 = (defpackage.atzg) r10;
        r4.add(r10);
        r9 = r9 + 1;
        goto L_0x02bc;
    L_0x030a:
        r1 = new java.lang.NullPointerException;
        r1.<init>();
        throw r1;
    L_0x0310:
        r1 = new java.lang.NullPointerException;
        r1.<init>();
        throw r1;
    L_0x0316:
        r1 = r1.a(r5, r4, r2);
    L_0x031a:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aekd.a(aajs, java.lang.String):aajs");
    }
}
