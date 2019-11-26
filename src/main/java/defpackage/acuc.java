package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: acuc */
public final class acuc implements UncaughtExceptionHandler {
    private final /* synthetic */ UncaughtExceptionHandler a;
    private final /* synthetic */ actz b;

    public acuc(actz actz, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = actz;
        this.a = uncaughtExceptionHandler;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007d  */
    public final void uncaughtException(java.lang.Thread r8, java.lang.Throwable r9) {
        /*
        r7 = this;
        r0 = r7.b;
        r1 = r7.a;
        r2 = defpackage.actz.a;
        r3 = "APP CRASHED!";
        defpackage.xtl.a(r2, r3, r9);
        r2 = r0.d;
        r2 = r2.get();
        r2 = (android.content.SharedPreferences) r2;
        r3 = "LastCrashTimestamp";
        r4 = -1;
        r2 = r2.getLong(r3, r4);
        r4 = r0.b;
        r4 = r4.a();
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 > 0) goto L_0x0035;
    L_0x0025:
        r4 = r4 - r2;
        r2 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r6 < 0) goto L_0x002d;
    L_0x002c:
        goto L_0x0038;
    L_0x002d:
        r2 = defpackage.actz.a;
        r3 = "APP CRASHED RECENTLY.  Ignore!!!";
        defpackage.xtl.a(r2, r3);
        goto L_0x007b;
    L_0x0035:
        r0.a();
    L_0x0038:
        r2 = r9;
    L_0x0039:
        r3 = r2.getCause();
        if (r3 == 0) goto L_0x0044;
    L_0x003f:
        r2 = r2.getCause();
        goto L_0x0039;
    L_0x0044:
        r3 = r0.d;
        r3 = r3.get();
        r3 = (android.content.SharedPreferences) r3;
        r3 = r3.edit();
        r4 = new java.io.ByteArrayOutputStream;	 Catch:{ IOException -> 0x006a }
        r4.<init>();	 Catch:{ IOException -> 0x006a }
        r5 = new java.io.ObjectOutputStream;	 Catch:{ IOException -> 0x006a }
        r5.<init>(r4);	 Catch:{ IOException -> 0x006a }
        r5.writeObject(r2);	 Catch:{ IOException -> 0x006a }
        r5.flush();	 Catch:{ IOException -> 0x006a }
        r4 = r4.toByteArray();	 Catch:{ IOException -> 0x006a }
        r5 = 0;
        r2 = android.util.Base64.encodeToString(r4, r5);	 Catch:{ IOException -> 0x006a }
        goto L_0x0072;
    L_0x006a:
        r4 = defpackage.actz.a;
        r5 = "Failed to serialize throwable.";
        defpackage.xtl.a(r4, r5, r2);
        r2 = 0;
    L_0x0072:
        r4 = "LastCrashException";
        r2 = r3.putString(r4, r2);
        r2.apply();
    L_0x007b:
        if (r1 == 0) goto L_0x0080;
    L_0x007d:
        r1.uncaughtException(r8, r9);
    L_0x0080:
        r0.a();
        r8 = r0.e;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acuc.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
