package defpackage;

import android.os.Build.VERSION;
import android.os.UserManager;

/* renamed from: qtr */
public final class qtr {
    private static volatile UserManager a;
    private static volatile boolean b = (qtr.a() ^ 1);

    private qtr() {
    }

    public static boolean a() {
        return VERSION.SDK_INT >= 24;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0043  */
    public static boolean a(android.content.Context r7) {
        /*
        r0 = b;
        if (r0 != 0) goto L_0x0056;
    L_0x0004:
        r1 = 1;
        r2 = r0;
        r0 = 1;
    L_0x0007:
        r3 = 2;
        r4 = 0;
        if (r0 <= r3) goto L_0x000d;
    L_0x000b:
        r0 = r2;
        goto L_0x0040;
    L_0x000d:
        r3 = a;
        if (r3 != 0) goto L_0x0027;
    L_0x0011:
        r5 = defpackage.qtr.class;
        monitor-enter(r5);
        r3 = a;	 Catch:{ all -> 0x0024 }
        if (r3 != 0) goto L_0x0022;
    L_0x0018:
        r3 = android.os.UserManager.class;
        r3 = r7.getSystemService(r3);	 Catch:{ all -> 0x0024 }
        r3 = (android.os.UserManager) r3;	 Catch:{ all -> 0x0024 }
        a = r3;	 Catch:{ all -> 0x0024 }
    L_0x0022:
        monitor-exit(r5);	 Catch:{ all -> 0x0024 }
        goto L_0x0027;
    L_0x0024:
        r7 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0024 }
        throw r7;
    L_0x0027:
        if (r3 == 0) goto L_0x0053;
    L_0x0029:
        r5 = r3.isUserUnlocked();	 Catch:{ NullPointerException -> 0x0046 }
        if (r5 != 0) goto L_0x003c;
    L_0x002f:
        r5 = android.os.Process.myUserHandle();	 Catch:{ NullPointerException -> 0x0046 }
        r2 = r3.isUserRunning(r5);	 Catch:{ NullPointerException -> 0x0046 }
        if (r2 != 0) goto L_0x003a;
    L_0x0039:
        goto L_0x003c;
    L_0x003a:
        r2 = 0;
        goto L_0x003d;
    L_0x003c:
        r2 = 1;
    L_0x003d:
        b = r2;	 Catch:{ NullPointerException -> 0x0046 }
        goto L_0x000b;
    L_0x0040:
        if (r0 != 0) goto L_0x0043;
    L_0x0042:
        goto L_0x0056;
    L_0x0043:
        a = r4;
        return r1;
    L_0x0046:
        r3 = move-exception;
        r5 = "DirectBootUtils";
        r6 = "Failed to check if user is unlocked";
        android.util.Log.w(r5, r6, r3);
        a = r4;
        r0 = r0 + 1;
        goto L_0x0007;
    L_0x0053:
        b = r1;
        return r1;
    L_0x0056:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qtr.a(android.content.Context):boolean");
    }
}
