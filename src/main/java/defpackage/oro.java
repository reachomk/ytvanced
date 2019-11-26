package defpackage;

/* renamed from: oro */
final class oro implements orl {
    oro() {
    }

    public final boolean a(nzw nzw) {
        String str = nzw.i;
        return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str);
    }

    public final defpackage.orj b(defpackage.nzw r3) {
        /*
        r2 = this;
        r0 = r3.i;
        r1 = r0.hashCode();
        switch(r1) {
            case -1351681404: goto L_0x0072;
            case -1248334819: goto L_0x0067;
            case -1026075066: goto L_0x005d;
            case -1004728940: goto L_0x0053;
            case 691401887: goto L_0x0049;
            case 822864842: goto L_0x003f;
            case 930165504: goto L_0x0035;
            case 1566015601: goto L_0x002b;
            case 1566016562: goto L_0x0020;
            case 1668750253: goto L_0x0016;
            case 1693976202: goto L_0x000b;
            default: goto L_0x0009;
        };
    L_0x0009:
        goto L_0x007d;
    L_0x000b:
        r1 = "application/ttml+xml";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x007d;
    L_0x0013:
        r1 = 3;
        goto L_0x007e;
    L_0x0016:
        r1 = "application/x-subrip";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x007d;
    L_0x001e:
        r1 = 4;
        goto L_0x007e;
    L_0x0020:
        r1 = "application/cea-708";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x007d;
    L_0x0028:
        r1 = 8;
        goto L_0x007e;
    L_0x002b:
        r1 = "application/cea-608";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x007d;
    L_0x0033:
        r1 = 6;
        goto L_0x007e;
    L_0x0035:
        r1 = "application/x-mp4-cea-608";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x007d;
    L_0x003d:
        r1 = 7;
        goto L_0x007e;
    L_0x003f:
        r1 = "text/x-ssa";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x007d;
    L_0x0047:
        r1 = 1;
        goto L_0x007e;
    L_0x0049:
        r1 = "application/x-quicktime-tx3g";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x007d;
    L_0x0051:
        r1 = 5;
        goto L_0x007e;
    L_0x0053:
        r1 = "text/vtt";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x007d;
    L_0x005b:
        r1 = 0;
        goto L_0x007e;
    L_0x005d:
        r1 = "application/x-mp4-vtt";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x007d;
    L_0x0065:
        r1 = 2;
        goto L_0x007e;
    L_0x0067:
        r1 = "application/pgs";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x007d;
    L_0x006f:
        r1 = 10;
        goto L_0x007e;
    L_0x0072:
        r1 = "application/dvbsubs";
        r1 = r0.equals(r1);
        if (r1 == 0) goto L_0x007d;
    L_0x007a:
        r1 = 9;
        goto L_0x007e;
    L_0x007d:
        r1 = -1;
    L_0x007e:
        switch(r1) {
            case 0: goto L_0x00cb;
            case 1: goto L_0x00c3;
            case 2: goto L_0x00bd;
            case 3: goto L_0x00b7;
            case 4: goto L_0x00b1;
            case 5: goto L_0x00a9;
            case 6: goto L_0x00a1;
            case 7: goto L_0x00a1;
            case 8: goto L_0x0097;
            case 9: goto L_0x008f;
            case 10: goto L_0x0089;
            default: goto L_0x0081;
        };
    L_0x0081:
        r3 = new java.lang.IllegalArgumentException;
        r0 = "Attempted to create decoder for unsupported format";
        r3.<init>(r0);
        throw r3;
    L_0x0089:
        r3 = new osq;
        r3.<init>();
        return r3;
    L_0x008f:
        r0 = new osd;
        r3 = r3.k;
        r0.<init>(r3);
        return r0;
    L_0x0097:
        r0 = new orv;
        r1 = r3.B;
        r3 = r3.k;
        r0.<init>(r1);
        return r0;
    L_0x00a1:
        r1 = new orr;
        r3 = r3.B;
        r1.<init>(r0, r3);
        return r1;
    L_0x00a9:
        r0 = new otd;
        r3 = r3.k;
        r0.<init>(r3);
        return r0;
    L_0x00b1:
        r3 = new ost;
        r3.<init>();
        return r3;
    L_0x00b7:
        r3 = new osv;
        r3.<init>();
        return r3;
    L_0x00bd:
        r3 = new oti;
        r3.<init>();
        return r3;
    L_0x00c3:
        r0 = new osr;
        r3 = r3.k;
        r0.<init>(r3);
        return r0;
    L_0x00cb:
        r3 = new otp;
        r3.<init>();
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oro.b(nzw):orj");
    }
}
