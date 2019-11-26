package defpackage;

/* renamed from: afdp */
public final class afdp {
    static afjs a(afjv afjv, afkh afkh) {
        afjs afjs = null;
        if (afkh != null && afkh.n()) {
            afjs = new afjs(afkh.a(), afkh.b());
        }
        return afdp.a(afjv, afjs);
    }

    public static afjs a(afjv afjv, afjs afjs) {
        afjs afjs2 = (afjs) afjv.get();
        if (afjs2.b == -1 || afjs2.c == -1) {
            return afjs == null ? afjs.a : afjs;
        } else {
            return afjs2;
        }
    }

    /* JADX WARNING: Missing block: B:23:0x0051, code skipped:
            if (r9 != 2) goto L_0x0053;
     */
    public static defpackage.afkn a(defpackage.aajs r3, defpackage.afkh r4, defpackage.aajj r5, defpackage.afjc r6, boolean r7, boolean r8, boolean r9) {
        /*
        if (r5 == 0) goto L_0x00a5;
    L_0x0002:
        if (r3 == 0) goto L_0x00a5;
    L_0x0004:
        if (r4 == 0) goto L_0x0024;
    L_0x0006:
        r0 = defpackage.aajs.a;
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0024;
    L_0x000e:
        r0 = r4.o();
        r1 = defpackage.afkn.GL_GVR;
        if (r0 == r1) goto L_0x001e;
    L_0x0016:
        r0 = r4.o();
        r1 = defpackage.afkn.YUV_SURFACE;
        if (r0 != r1) goto L_0x0024;
    L_0x001e:
        r3 = r4.o();
        goto L_0x00ae;
    L_0x0024:
        r4 = 0;
        r0 = 2;
        r1 = 1;
        if (r9 != 0) goto L_0x0054;
    L_0x0029:
        r9 = r3.u();
        r2 = defpackage.aaju.RECTANGULAR_2D;
        if (r9 != r2) goto L_0x0054;
    L_0x0031:
        r9 = r3.u();
        r9 = r5.a(r9);
        if (r9 != 0) goto L_0x0054;
    L_0x003b:
        r9 = r5.c;
        r2 = r9.a;
        r2 = r2 & r0;
        if (r2 == 0) goto L_0x0053;
    L_0x0042:
        r9 = r9.d;
        if (r9 != 0) goto L_0x0048;
    L_0x0046:
        r9 = defpackage.arhh.bv;
    L_0x0048:
        r9 = r9.aP;
        r9 = defpackage.axag.a(r9);
        if (r9 != 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0053;
    L_0x0051:
        if (r9 == r0) goto L_0x0054;
    L_0x0053:
        r1 = 0;
    L_0x0054:
        if (r7 != 0) goto L_0x0057;
    L_0x0056:
        goto L_0x0066;
    L_0x0057:
        r4 = r5.ac();
        if (r4 != 0) goto L_0x0066;
    L_0x005d:
        if (r1 != 0) goto L_0x0066;
    L_0x005f:
        r4 = r3.t;
        if (r4 != 0) goto L_0x0066;
    L_0x0063:
        r3 = defpackage.afkn.YUV_SURFACE;
        goto L_0x00ae;
    L_0x0066:
        r4 = r5.c;
        r9 = r4.a;
        r9 = r9 & r0;
        if (r9 == 0) goto L_0x0089;
    L_0x006d:
        r4 = r4.d;
        if (r4 != 0) goto L_0x0073;
    L_0x0071:
        r4 = defpackage.arhh.bv;
    L_0x0073:
        r4 = r4.V;
        if (r4 == 0) goto L_0x0089;
    L_0x0077:
        if (r1 == 0) goto L_0x007a;
    L_0x0079:
        goto L_0x0089;
    L_0x007a:
        r4 = defpackage.afdp.a(r6, r5, r7);
        if (r4 == 0) goto L_0x0089;
    L_0x0080:
        r4 = defpackage.afdp.a(r3, r8);
        if (r4 == 0) goto L_0x0089;
    L_0x0086:
        r3 = defpackage.afkn.GL_VPX;
        goto L_0x00ae;
    L_0x0089:
        r4 = defpackage.afdp.a(r6, r5, r7);
        if (r4 == 0) goto L_0x0090;
    L_0x008f:
        goto L_0x0092;
    L_0x0090:
        if (r1 == 0) goto L_0x009b;
    L_0x0092:
        r4 = defpackage.afdp.a(r3, r8);
        if (r4 == 0) goto L_0x009b;
    L_0x0098:
        r3 = defpackage.afkn.GL_GVR;
        goto L_0x00ae;
    L_0x009b:
        r3 = r3.t;
        if (r3 != 0) goto L_0x00a2;
    L_0x009f:
        r3 = defpackage.afkn.SURFACE;
        goto L_0x00ae;
    L_0x00a2:
        r3 = defpackage.afkn.SECURE_SURFACE;
        goto L_0x00ae;
    L_0x00a5:
        if (r4 != 0) goto L_0x00aa;
    L_0x00a7:
        r3 = defpackage.afjw.a;
        goto L_0x00ae;
    L_0x00aa:
        r3 = r4.o();
    L_0x00ae:
        r4 = defpackage.afkn.SURFACE;
        if (r3 != r4) goto L_0x00ba;
    L_0x00b2:
        r4 = r6.j();
        if (r4 == 0) goto L_0x00ba;
    L_0x00b8:
        r3 = defpackage.afkn.SECURE_SURFACE;
    L_0x00ba:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afdp.a(aajs, afkh, aajj, afjc, boolean, boolean, boolean):afkn");
    }

    public static boolean a(aajs aajs, boolean z) {
        return aajs != null && ((aajs.equals(aajs.a) || !(aajs.n.isEmpty() || aajs.t)) && !z);
    }

    private static boolean a(afjc afjc, aajj aajj, boolean z) {
        int ordinal = afjc.m().ordinal();
        return ordinal != 0 ? ordinal == 3 : z && aajj.ac();
    }
}
