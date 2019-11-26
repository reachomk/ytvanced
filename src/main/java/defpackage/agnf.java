package defpackage;

import android.content.Context;

/* renamed from: agnf */
public final class agnf {
    private final agmk a;
    private final Context b;

    public agnf(agmk agmk, Context context) {
        this.a = agmk;
        this.b = context;
    }

    /* JADX WARNING: Missing block: B:20:0x003c, code skipped:
            if (r6 != null) goto L_0x003f;
     */
    /* JADX WARNING: Missing block: B:22:?, code skipped:
            defpackage.agnf.a(r1, r6);
     */
    /* JADX WARNING: Missing block: B:29:?, code skipped:
            defpackage.agnf.a(r1, r4);
     */
    public final defpackage.agmm a(android.net.Uri r11, boolean r12) {
        /*
        r10 = this;
        r0 = r11.getPath();
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x00ce;
    L_0x000a:
        r1 = 4;
        r2 = new byte[r1];
        r3 = new byte[r1];
        r4 = r10.b;	 Catch:{ FileNotFoundException -> 0x0050 }
        r4 = r4.getContentResolver();	 Catch:{ FileNotFoundException -> 0x0050 }
        r5 = "r";
        r4 = r4.openAssetFileDescriptor(r11, r5);	 Catch:{ FileNotFoundException -> 0x0050 }
        r5 = 0;
        if (r4 == 0) goto L_0x004a;
    L_0x001e:
        r6 = r4.createInputStream();	 Catch:{ all -> 0x0043 }
        r7 = 12;
        r8 = new byte[r7];	 Catch:{ all -> 0x0039 }
        r9 = r6.read(r8);	 Catch:{ all -> 0x0039 }
        if (r9 != r7) goto L_0x0035;
    L_0x002c:
        r7 = 0;
        java.lang.System.arraycopy(r8, r7, r2, r7, r1);	 Catch:{ all -> 0x0039 }
        r9 = 8;
        java.lang.System.arraycopy(r8, r9, r3, r7, r1);	 Catch:{ all -> 0x0039 }
    L_0x0035:
        defpackage.agnf.a(r5, r6);	 Catch:{ all -> 0x0043 }
        goto L_0x004a;
    L_0x0039:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x003b }
    L_0x003b:
        r5 = move-exception;
        if (r6 != 0) goto L_0x003f;
    L_0x003e:
        goto L_0x0042;
    L_0x003f:
        defpackage.agnf.a(r1, r6);	 Catch:{ all -> 0x0043 }
    L_0x0042:
        throw r5;	 Catch:{ all -> 0x0043 }
    L_0x0043:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0045 }
    L_0x0045:
        r5 = move-exception;
        defpackage.agnf.a(r1, r4);	 Catch:{ FileNotFoundException -> 0x0050 }
        throw r5;	 Catch:{ FileNotFoundException -> 0x0050 }
    L_0x004a:
        if (r4 == 0) goto L_0x0051;
    L_0x004c:
        defpackage.agnf.a(r5, r4);	 Catch:{ FileNotFoundException -> 0x0050 }
        goto L_0x0051;
    L_0x0051:
        r1 = new agni;
        r1.<init>(r2, r3);
        r2 = r1.b;
        r3 = defpackage.agol.a;
        r2 = java.util.Arrays.equals(r2, r3);
        if (r2 != 0) goto L_0x00c1;
    L_0x0060:
        r1 = r1.a;
        r2 = defpackage.agpd.a;
        r1 = java.util.Arrays.equals(r1, r2);
        if (r1 != 0) goto L_0x00a8;
    L_0x006a:
        if (r12 == 0) goto L_0x00a0;
    L_0x006c:
        r12 = defpackage.xvt.a(r11);
        if (r12 == 0) goto L_0x0098;
    L_0x0072:
        r12 = new java.io.File;
        r12.<init>(r0);
        r0 = r10.a;
        r0 = r0.a(r11);
        r0 = r0.c();
        if (r0 == 0) goto L_0x00a0;
    L_0x0083:
        r0 = new agog;
        r1 = new agmi;
        r12 = defpackage.agmn.a(r12);
        r1.<init>(r12);
        r12 = r10.a;
        r11 = r12.a(r11);
        r0.<init>(r1, r11);
        return r0;
    L_0x0098:
        r11 = new java.io.IOException;
        r12 = "Partial YTB not supported with content URIs";
        r11.<init>(r12);
        throw r11;
    L_0x00a0:
        r11 = new java.io.IOException;
        r12 = "Failed to open YTB from content URI";
        r11.<init>(r12);
        throw r11;
    L_0x00a8:
        r11 = defpackage.xvt.a(r11);
        if (r11 == 0) goto L_0x00b9;
    L_0x00ae:
        r11 = new java.io.File;
        r11.<init>(r0);
        r12 = new agpg;
        r12.<init>(r11);
        return r12;
    L_0x00b9:
        r11 = new java.io.IOException;
        r12 = "Zip based YTB not supported with content URIs";
        r11.<init>(r12);
        throw r11;
    L_0x00c1:
        r12 = new agmg;
        r0 = r10.b;
        r12.<init>(r0, r11);
        r11 = new agoo;
        r11.<init>(r12);
        return r11;
    L_0x00ce:
        r11 = new java.io.IOException;
        r12 = "Received URI with no path";
        r11.<init>(r12);
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agnf.a(android.net.Uri, boolean):agmm");
    }
}
