package defpackage;

import android.net.Uri;
import java.security.MessageDigest;

/* renamed from: uwv */
public final class uwv {
    public final Uri a;
    public final MessageDigest b;
    public final long c;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003d  */
    public static defpackage.uwv a(android.content.ContentResolver r6, android.net.Uri r7) {
        /*
        r0 = "SHA-1";
        r0 = java.security.MessageDigest.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0041 }
        r1 = new java.io.BufferedInputStream;
        r6 = r6.openInputStream(r7);
        r2 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r1.<init>(r6, r2);
        r6 = 0;
        r3 = new java.security.DigestInputStream;	 Catch:{ all -> 0x0033 }
        r3.<init>(r1, r0);	 Catch:{ all -> 0x0033 }
        r0 = new byte[r2];	 Catch:{ all -> 0x0031 }
        r1 = 0;
    L_0x001b:
        r4 = r3.read(r0);	 Catch:{ all -> 0x0031 }
        if (r4 < 0) goto L_0x0024;
    L_0x0021:
        r4 = (long) r4;	 Catch:{ all -> 0x0031 }
        r1 = r1 + r4;
        goto L_0x001b;
    L_0x0024:
        r0 = new uwv;	 Catch:{ all -> 0x0031 }
        r4 = r3.getMessageDigest();	 Catch:{ all -> 0x0031 }
        r0.<init>(r7, r4, r1);	 Catch:{ all -> 0x0031 }
        r3.close();
        return r0;
    L_0x0031:
        r7 = move-exception;
        goto L_0x0036;
    L_0x0033:
        r7 = move-exception;
        r3 = r6;
        r6 = r1;
    L_0x0036:
        if (r6 == 0) goto L_0x003b;
    L_0x0038:
        r6.close();
    L_0x003b:
        if (r3 == 0) goto L_0x0040;
    L_0x003d:
        r3.close();
    L_0x0040:
        throw r7;
    L_0x0041:
        r6 = move-exception;
        r7 = new java.lang.IllegalStateException;
        r7.<init>(r6);
        goto L_0x0049;
    L_0x0048:
        throw r7;
    L_0x0049:
        goto L_0x0048;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwv.a(android.content.ContentResolver, android.net.Uri):uwv");
    }

    private uwv(Uri uri, MessageDigest messageDigest, long j) {
        this.b = messageDigest;
        this.a = uri;
        this.c = j;
    }
}
