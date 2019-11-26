package defpackage;

/* renamed from: qvj */
final class qvj {
    public static qut a;

    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00f9 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:55|56|57) */
    /* JADX WARNING: Missing block: B:11:0x0031, code skipped:
            if (r0 != null) goto L_0x0033;
     */
    /* JADX WARNING: Missing block: B:57:0x0100, code skipped:
            throw new java.security.GeneralSecurityException("invalid keyset");
     */
    static boolean a(defpackage.qui r8) {
        /*
        r0 = a;
        r1 = 1;
        if (r0 != 0) goto L_0x0102;
    L_0x0005:
        r0 = defpackage.roe.k;
        r2 = defpackage.rlj.d();
        r0 = r2.a(r0);
        r0 = (java.lang.String) r0;
        r2 = 0;
        if (r0 == 0) goto L_0x001b;
    L_0x0014:
        r3 = r0.length();
        if (r3 == 0) goto L_0x001b;
    L_0x001a:
        goto L_0x0033;
    L_0x001b:
        r0 = 0;
        if (r8 == 0) goto L_0x0031;
    L_0x001e:
        r3 = "9HLYIA0MTQ+kt02LQhTJe6EsimGIeu/yQK1cr4EFCom5qsu0wtmZFzCQFxlveGI0";
        r4 = "Ge34DDT1G72DhC7p+2goHXZfFkX2J6BDC/aHGKBx82s=";
        r8 = r8.a(r3, r4);
        if (r8 == 0) goto L_0x0031;
    L_0x0028:
        r3 = new java.lang.Object[r2];
        r8 = r8.invoke(r0, r3);
        r8 = (java.lang.String) r8;
        r0 = r8;
    L_0x0031:
        if (r0 == 0) goto L_0x0101;
    L_0x0033:
        r8 = defpackage.qri.a(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0101 }
        r0 = defpackage.qzf.zzrzv;	 Catch:{ rfk -> 0x00f9 }
        r8 = defpackage.reu.a(r0, r8);	 Catch:{ rfk -> 0x00f9 }
        r8 = (defpackage.qzf) r8;	 Catch:{ rfk -> 0x00f9 }
        r0 = r8.zzrzu;	 Catch:{ rfk -> 0x00f9 }
        r0 = r0.iterator();	 Catch:{ rfk -> 0x00f9 }
    L_0x0045:
        r3 = r0.hasNext();	 Catch:{ rfk -> 0x00f9 }
        if (r3 == 0) goto L_0x007e;
    L_0x004b:
        r3 = r0.next();	 Catch:{ rfk -> 0x00f9 }
        r3 = (defpackage.qzh) r3;	 Catch:{ rfk -> 0x00f9 }
        r4 = r3.a();	 Catch:{ rfk -> 0x00f9 }
        r4 = r4.a();	 Catch:{ rfk -> 0x00f9 }
        r5 = defpackage.qyw.UNKNOWN_KEYMATERIAL;	 Catch:{ rfk -> 0x00f9 }
        if (r4 == r5) goto L_0x0076;
    L_0x005d:
        r4 = r3.a();	 Catch:{ rfk -> 0x00f9 }
        r4 = r4.a();	 Catch:{ rfk -> 0x00f9 }
        r5 = defpackage.qyw.SYMMETRIC;	 Catch:{ rfk -> 0x00f9 }
        if (r4 == r5) goto L_0x0076;
    L_0x0069:
        r3 = r3.a();	 Catch:{ rfk -> 0x00f9 }
        r3 = r3.a();	 Catch:{ rfk -> 0x00f9 }
        r4 = defpackage.qyw.ASYMMETRIC_PRIVATE;	 Catch:{ rfk -> 0x00f9 }
        if (r3 == r4) goto L_0x0076;
    L_0x0075:
        goto L_0x0045;
    L_0x0076:
        r8 = new java.security.GeneralSecurityException;	 Catch:{ rfk -> 0x00f9 }
        r0 = "keyset contains secret key material";
        r8.<init>(r0);	 Catch:{ rfk -> 0x00f9 }
        throw r8;	 Catch:{ rfk -> 0x00f9 }
    L_0x007e:
        r0 = r8.a();	 Catch:{ rfk -> 0x00f9 }
        if (r0 <= 0) goto L_0x00f1;
    L_0x0084:
        r0 = new quv;	 Catch:{ rfk -> 0x00f9 }
        r0.<init>(r8);	 Catch:{ rfk -> 0x00f9 }
        r8 = defpackage.qvs.a;	 Catch:{  }
        r8 = r8.zzsau;	 Catch:{  }
        r8 = r8.iterator();	 Catch:{  }
    L_0x0091:
        r3 = r8.hasNext();	 Catch:{  }
        if (r3 == 0) goto L_0x00e5;
    L_0x0097:
        r3 = r8.next();	 Catch:{  }
        r3 = (defpackage.qze) r3;	 Catch:{  }
        r4 = r3.zzryv;	 Catch:{  }
        r4 = r4.isEmpty();	 Catch:{  }
        if (r4 != 0) goto L_0x00dd;
    L_0x00a5:
        r4 = r3.zzrzo;	 Catch:{  }
        r4 = r4.isEmpty();	 Catch:{  }
        if (r4 != 0) goto L_0x00d5;
    L_0x00ad:
        r4 = r3.zzrzr;	 Catch:{  }
        r4 = r4.isEmpty();	 Catch:{  }
        if (r4 != 0) goto L_0x00cd;
    L_0x00b5:
        r4 = r3.zzrzr;	 Catch:{  }
        r4 = defpackage.qvb.a(r4);	 Catch:{  }
        r5 = r3.zzryv;	 Catch:{  }
        r6 = r3.zzrzo;	 Catch:{  }
        r7 = r3.zzrzp;	 Catch:{  }
        r4 = r4.a(r5, r6, r7);	 Catch:{  }
        r5 = r3.zzryv;	 Catch:{  }
        r3 = r3.zzrzq;	 Catch:{  }
        defpackage.qvb.a(r5, r4, r3);	 Catch:{  }
        goto L_0x0091;
    L_0x00cd:
        r8 = new java.security.GeneralSecurityException;	 Catch:{  }
        r0 = "Missing catalogue_name.";
        r8.<init>(r0);	 Catch:{  }
        throw r8;	 Catch:{  }
    L_0x00d5:
        r8 = new java.security.GeneralSecurityException;	 Catch:{  }
        r0 = "Missing primitive_name.";
        r8.<init>(r0);	 Catch:{  }
        throw r8;	 Catch:{  }
    L_0x00dd:
        r8 = new java.security.GeneralSecurityException;	 Catch:{  }
        r0 = "Missing type_url.";
        r8.<init>(r0);	 Catch:{  }
        throw r8;	 Catch:{  }
    L_0x00e5:
        r8 = defpackage.qvt.a(r0);	 Catch:{  }
        a = r8;	 Catch:{  }
        r8 = a;
        if (r8 != 0) goto L_0x00f0;
    L_0x00ef:
        return r2;
    L_0x00f0:
        return r1;
    L_0x00f1:
        r8 = new java.security.GeneralSecurityException;	 Catch:{ rfk -> 0x00f9 }
        r0 = "empty keyset";
        r8.<init>(r0);	 Catch:{ rfk -> 0x00f9 }
        throw r8;	 Catch:{ rfk -> 0x00f9 }
    L_0x00f9:
        r8 = new java.security.GeneralSecurityException;	 Catch:{  }
        r0 = "invalid keyset";
        r8.<init>(r0);	 Catch:{  }
        throw r8;	 Catch:{  }
    L_0x0101:
        return r2;
    L_0x0102:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qvj.a(qui):boolean");
    }
}
