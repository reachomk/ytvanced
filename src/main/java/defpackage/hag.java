package defpackage;

/* renamed from: hag */
public final class hag implements aapv {
    private final zzl a;
    private final bcaa b;
    private final bcaa c;

    public hag(zzl zzl, bcaa bcaa, bcaa bcaa2) {
        this.a = zzl;
        this.b = bcaa;
        this.c = bcaa2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x014b  */
    public final void a(defpackage.aaps r13) {
        /*
        r12 = this;
        r0 = defpackage.avsu.e;
        r0 = r0.createBuilder();
        r0 = (defpackage.avsx) r0;
        r1 = r13.b;
        r2 = r12.a;
        r2 = r2.b();
        r3 = 1;
        r4 = 0;
        if (r2 != 0) goto L_0x0017;
    L_0x0014:
        r1 = 0;
        goto L_0x0140;
    L_0x0017:
        r2 = r2.e;
        if (r2 != 0) goto L_0x001d;
    L_0x001b:
        r2 = defpackage.aume.af;
    L_0x001d:
        r2 = r2.V;
        r1 = r2.contains(r1);
        if (r1 != 0) goto L_0x0026;
    L_0x0025:
        goto L_0x0014;
    L_0x0026:
        r1 = r12.b;
        r1 = r1.get();
        r1 = (defpackage.eki) r1;
        r1 = r1.b();
        if (r1 == 0) goto L_0x0014;
    L_0x0034:
        r1 = r12.c;
        r1 = r1.get();
        r1 = (defpackage.agwc) r1;
        r1 = r1.b();
        r2 = r1.n();
        r5 = r1.k();
        r2 = r2.a();
        r2 = r2.iterator();
    L_0x0050:
        r6 = r2.hasNext();
        if (r6 == 0) goto L_0x00fa;
    L_0x0056:
        r6 = r2.next();
        r6 = (defpackage.agqk) r6;
        r7 = defpackage.avsw.e;
        r7 = r7.createBuilder();
        r7 = (defpackage.avsz) r7;
        r8 = r6.a;
        r8 = r8.a;
        r7.copyOnWrite();
        r9 = r7.instance;
        r9 = (defpackage.avsw) r9;
        if (r8 == 0) goto L_0x00f4;
    L_0x0071:
        r10 = r9.a;
        r10 = r10 | r3;
        r9.a = r10;
        r9.b = r8;
        r8 = r6.a;
        r8 = r8.i;
        r8 = r8.h;
        r7.copyOnWrite();
        r10 = r7.instance;
        r10 = (defpackage.avsw) r10;
        r11 = r10.a;
        r11 = r11 | 2;
        r10.a = r11;
        r10.d = r8;
        r6 = r6.b;
        r6 = r6.iterator();
    L_0x0093:
        r8 = r6.hasNext();
        if (r8 == 0) goto L_0x00ce;
    L_0x0099:
        r8 = r6.next();
        r8 = (java.lang.String) r8;
        r8 = r5.a(r8);
        if (r8 == 0) goto L_0x0093;
    L_0x00a5:
        r8 = defpackage.hag.a(r8);
        r7.copyOnWrite();
        r9 = r7.instance;
        r9 = (defpackage.avsw) r9;
        if (r8 == 0) goto L_0x00c8;
    L_0x00b2:
        r10 = r9.c;
        r10 = r10.a();
        if (r10 != 0) goto L_0x00c2;
    L_0x00ba:
        r10 = r9.c;
        r10 = defpackage.anxl.mutableCopy(r10);
        r9.c = r10;
    L_0x00c2:
        r9 = r9.c;
        r9.add(r8);
        goto L_0x0093;
    L_0x00c8:
        r13 = new java.lang.NullPointerException;
        r13.<init>();
        throw r13;
    L_0x00ce:
        r0.copyOnWrite();
        r6 = r0.instance;
        r6 = (defpackage.avsu) r6;
        r8 = r6.c;
        r8 = r8.a();
        if (r8 != 0) goto L_0x00e5;
    L_0x00dd:
        r8 = r6.c;
        r8 = defpackage.anxl.mutableCopy(r8);
        r6.c = r8;
    L_0x00e5:
        r6 = r6.c;
        r7 = r7.build();
        r7 = (defpackage.anxl) r7;
        r7 = (defpackage.avsw) r7;
        r6.add(r7);
        goto L_0x0050;
    L_0x00f4:
        r13 = new java.lang.NullPointerException;
        r13.<init>();
        throw r13;
    L_0x00fa:
        r1 = r1.k();
        r1 = r1.a();
        r1 = r1.iterator();
    L_0x0106:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x013f;
    L_0x010c:
        r2 = r1.next();
        r2 = (defpackage.agqy) r2;
        r5 = r2.e;
        if (r5 == 0) goto L_0x0106;
    L_0x0116:
        r2 = defpackage.hag.a(r2);
        r0.copyOnWrite();
        r5 = r0.instance;
        r5 = (defpackage.avsu) r5;
        if (r2 == 0) goto L_0x0139;
    L_0x0123:
        r6 = r5.d;
        r6 = r6.a();
        if (r6 != 0) goto L_0x0133;
    L_0x012b:
        r6 = r5.d;
        r6 = defpackage.anxl.mutableCopy(r6);
        r5.d = r6;
    L_0x0133:
        r5 = r5.d;
        r5.add(r2);
        goto L_0x0106;
    L_0x0139:
        r13 = new java.lang.NullPointerException;
        r13.<init>();
        throw r13;
    L_0x013f:
        r1 = 1;
    L_0x0140:
        r2 = r12.a;
        r5 = r13.b;
        r2 = r2.b();
        if (r2 != 0) goto L_0x014b;
    L_0x014a:
        goto L_0x0187;
    L_0x014b:
        r2 = r2.e;
        if (r2 != 0) goto L_0x0151;
    L_0x014f:
        r2 = defpackage.aume.af;
    L_0x0151:
        r2 = r2.Y;
        r2 = r2.contains(r5);
        if (r2 != 0) goto L_0x015a;
    L_0x0159:
        goto L_0x0187;
    L_0x015a:
        r2 = r12.b;
        r2 = r2.get();
        r2 = (defpackage.eki) r2;
        r2 = r2.b();
        if (r2 == 0) goto L_0x0178;
    L_0x0168:
        r2 = r12.b;
        r2 = r2.get();
        r2 = (defpackage.eki) r2;
        r2 = r2.g();
        if (r2 == 0) goto L_0x0177;
    L_0x0176:
        goto L_0x0178;
    L_0x0177:
        r4 = 1;
    L_0x0178:
        r0.copyOnWrite();
        r2 = r0.instance;
        r2 = (defpackage.avsu) r2;
        r5 = r2.a;
        r5 = r5 | r3;
        r2.a = r5;
        r2.b = r4;
        r4 = 1;
    L_0x0187:
        if (r1 != 0) goto L_0x018c;
    L_0x0189:
        if (r4 != 0) goto L_0x018c;
    L_0x018b:
        goto L_0x01b4;
    L_0x018c:
        r1 = defpackage.asbo.c;
        r1 = r1.createBuilder();
        r1 = (defpackage.asbr) r1;
        r1.copyOnWrite();
        r2 = r1.instance;
        r2 = (defpackage.asbo) r2;
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.avsu) r0;
        r2.b = r0;
        r0 = r2.a;
        r0 = r0 | r3;
        r2.a = r0;
        r0 = r1.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.asbo) r0;
        r13.t = r0;
    L_0x01b4:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hag.a(aaps):void");
    }

    private static avsy a(agqy agqy) {
        avtb avtb = (avtb) avsy.d.createBuilder();
        String a = agqy.a();
        avtb.copyOnWrite();
        avsy avsy = (avsy) avtb.instance;
        if (a != null) {
            int i = 1;
            avsy.a |= 1;
            avsy.b = a;
            atdv atdv = agqy.k;
            if (atdv != null) {
                int a2 = awah.a(atdv.b);
                if (a2 == 0 || a2 == 1) {
                    i = 2;
                }
            }
            avtb.copyOnWrite();
            avsy avsy2 = (avsy) avtb.instance;
            avsy2.a = 2 | avsy2.a;
            avsy2.c = i - 1;
            return (avsy) ((anxl) avtb.build());
        }
        throw new NullPointerException();
    }
}
