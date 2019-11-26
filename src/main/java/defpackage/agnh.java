package defpackage;

/* renamed from: agnh */
public final class agnh {
    /* JADX WARNING: Missing block: B:21:0x0049, code skipped:
            if (r2 != null) goto L_0x004b;
     */
    /* JADX WARNING: Missing block: B:23:?, code skipped:
            r2.close();
     */
    public static defpackage.amqp a(java.io.File r2, java.lang.String r3, java.lang.String r4, defpackage.agnf r5, defpackage.azrd r6) {
        /*
        r3 = defpackage.agnd.a(r3, r4);
        r4 = new java.io.File;
        r4.<init>(r2, r3);
        r0 = r4.getParentFile();
        r1 = 1;
        if (r0 == 0) goto L_0x00aa;
    L_0x0010:
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x00aa;
    L_0x0016:
        r2 = r4.getName();
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x00aa;
    L_0x0020:
        r2 = r4.isHidden();
        if (r2 != 0) goto L_0x00aa;
    L_0x0026:
        r2 = r4.exists();
        if (r2 == 0) goto L_0x006a;
    L_0x002c:
        r2 = android.net.Uri.fromFile(r4);	 Catch:{ IOException -> 0x0054 }
        r0 = 0;
        r2 = r5.a(r2, r0);	 Catch:{ IOException -> 0x0054 }
        r5 = defpackage.ampo.a;	 Catch:{ all -> 0x0046 }
        r0 = 3;
        r0 = defpackage.agnh.a(r3, r0, r1);	 Catch:{ all -> 0x0046 }
        r5 = defpackage.agnk.a(r5, r0);	 Catch:{ all -> 0x0046 }
        if (r2 == 0) goto L_0x00b5;
    L_0x0042:
        r2.close();	 Catch:{ IOException -> 0x0054 }
        goto L_0x00b5;
    L_0x0046:
        r5 = move-exception;
        throw r5;	 Catch:{ all -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        if (r2 == 0) goto L_0x0053;
    L_0x004b:
        r2.close();	 Catch:{ all -> 0x004f }
        goto L_0x0053;
    L_0x004f:
        r2 = move-exception;
        defpackage.ankx.a(r5, r2);	 Catch:{ IOException -> 0x0054 }
    L_0x0053:
        throw r0;	 Catch:{ IOException -> 0x0054 }
        defpackage.agmn.c(r4);
        r2 = r4.exists();
        if (r2 == 0) goto L_0x006a;
    L_0x005e:
        r2 = defpackage.ampo.a;
        r4 = 4;
        r3 = defpackage.agnh.a(r3, r4, r1);
        r5 = defpackage.agnk.a(r2, r3);
        goto L_0x00b5;
    L_0x006a:
        r2 = new java.io.RandomAccessFile;	 Catch:{ IOException -> 0x009e }
        r5 = "rw";
        r2.<init>(r4, r5);	 Catch:{ IOException -> 0x009e }
        r2.close();	 Catch:{ IOException -> 0x009e }
        r2 = defpackage.agmn.a(r4);
        r5 = r4.renameTo(r2);
        if (r5 != 0) goto L_0x008d;
    L_0x007e:
        r4.delete();
        r2 = defpackage.ampo.a;
        r4 = 5;
        r3 = defpackage.agnh.a(r3, r4, r1);
        r5 = defpackage.agnk.a(r2, r3);
        goto L_0x00b5;
    L_0x008d:
        r2.renameTo(r4);
        r2 = defpackage.amqp.b(r4);
        r4 = 7;
        r3 = defpackage.agnh.a(r3, r4, r1);
        r5 = defpackage.agnk.a(r2, r3);
        goto L_0x00b5;
    L_0x009e:
        r2 = defpackage.ampo.a;
        r4 = 6;
        r3 = defpackage.agnh.a(r3, r4, r1);
        r5 = defpackage.agnk.a(r2, r3);
        goto L_0x00b5;
    L_0x00aa:
        r2 = defpackage.ampo.a;
        r4 = 2;
        r3 = defpackage.agnh.a(r3, r4, r1);
        r5 = defpackage.agnk.a(r2, r3);
    L_0x00b5:
        r2 = r5.a();
        r2 = r2.a();
        if (r2 == 0) goto L_0x00c4;
    L_0x00bf:
        r2 = r5.a();
        return r2;
    L_0x00c4:
        r2 = r5.b();
        r6.copyOnWrite();
        r3 = r6.instance;
        r3 = (defpackage.azra) r3;
        if (r2 == 0) goto L_0x00e9;
    L_0x00d1:
        r4 = r3.c;
        r4 = r4.a();
        if (r4 != 0) goto L_0x00e1;
    L_0x00d9:
        r4 = r3.c;
        r4 = defpackage.anxl.mutableCopy(r4);
        r3.c = r4;
    L_0x00e1:
        r3 = r3.c;
        r3.add(r2);
        r2 = defpackage.ampo.a;
        return r2;
    L_0x00e9:
        r2 = new java.lang.NullPointerException;
        r2.<init>();
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agnh.a(java.io.File, java.lang.String, java.lang.String, agnf, azrd):amqp");
    }

    public static void a(acum acum, azra azra) {
        asmz asmz = (asmz) asmw.f.createBuilder();
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        if (azra != null) {
            asmw.c = azra;
            asmw.b = 276;
            acum.a((asmw) ((anxl) asmz.build()));
            return;
        }
        throw new NullPointerException();
    }

    private static azrc a(String str, int i, int i2) {
        azrf azrf = (azrf) azrc.f.createBuilder();
        int a = amrt.a(str);
        azrf.copyOnWrite();
        azrc azrc = (azrc) azrf.instance;
        azrc.a |= 1;
        azrc.b = a;
        int length = str.length();
        azrf.copyOnWrite();
        azrc azrc2 = (azrc) azrf.instance;
        azrc2.a |= 2;
        azrc2.c = length;
        azrf.copyOnWrite();
        azrc azrc3 = (azrc) azrf.instance;
        azrc3.a |= 4;
        azrc3.d = i - 1;
        azrf.copyOnWrite();
        azrc3 = (azrc) azrf.instance;
        azrc3.a |= 8;
        azrc3.e = 0;
        return (azrc) ((anxl) azrf.build());
    }
}
