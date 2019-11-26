package defpackage;

import android.content.Context;

/* renamed from: qja */
public final class qja implements qit {
    private static qja a;
    private final Context b;
    private final boolean c = true;

    public static synchronized qja a(Context context) {
        qja qja;
        synchronized (qja.class) {
            context = qiz.a(context);
            if (!(a != null && a.b == context && a.c)) {
                a = new qja(context);
            }
            qja = a;
        }
        return qja;
    }

    private qja(Context context) {
        this.b = context;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0054 */
    public final java.lang.String[] a(int r7) {
        /*
        r6 = this;
        r0 = r6.c;
        if (r0 == 0) goto L_0x0012;
    L_0x0004:
        r0 = r6.b;
        r0 = r0.getPackageManager();
        r0 = r0.getPackagesForUid(r7);
        if (r0 != 0) goto L_0x0011;
    L_0x0010:
        goto L_0x0012;
    L_0x0011:
        return r0;
    L_0x0012:
        r0 = r6.b;
        r0 = defpackage.qiy.a(r0);
        r1 = 0;
        if (r0 == 0) goto L_0x0076;
    L_0x001b:
        r2 = new android.os.Bundle;	 Catch:{ RemoteException -> 0x006e }
        r2.<init>();	 Catch:{ RemoteException -> 0x006e }
        r3 = "uid";
        r2.putInt(r3, r7);	 Catch:{ RemoteException -> 0x006e }
        r7 = "getAppPackageForUid";
        r3 = android.os.Binder.clearCallingIdentity();	 Catch:{ RemoteException -> 0x006e }
        r0 = r0.a;	 Catch:{ IllegalArgumentException -> 0x005f, SecurityException -> 0x0054 }
        r0 = r0.getContentResolver();	 Catch:{ IllegalArgumentException -> 0x005f, SecurityException -> 0x0054 }
        r5 = defpackage.qix.a;	 Catch:{ IllegalArgumentException -> 0x005f, SecurityException -> 0x0054 }
        r7 = r0.call(r5, r7, r1, r2);	 Catch:{ IllegalArgumentException -> 0x005f, SecurityException -> 0x0054 }
        android.os.Binder.restoreCallingIdentity(r3);	 Catch:{ RemoteException -> 0x006e }
        if (r7 == 0) goto L_0x004c;
    L_0x003c:
        r0 = "result";
        r7 = r7.getString(r0);	 Catch:{ RemoteException -> 0x006e }
        if (r7 == 0) goto L_0x004b;
    L_0x0044:
        r0 = 1;
        r0 = new java.lang.String[r0];	 Catch:{ RemoteException -> 0x006e }
        r2 = 0;
        r0[r2] = r7;	 Catch:{ RemoteException -> 0x006e }
        return r0;
    L_0x004b:
        return r1;
    L_0x004c:
        r7 = new android.os.RemoteException;	 Catch:{ RemoteException -> 0x006e }
        r7.<init>();	 Catch:{ RemoteException -> 0x006e }
        throw r7;	 Catch:{ RemoteException -> 0x006e }
    L_0x0052:
        r7 = move-exception;
        goto L_0x006a;
    L_0x0054:
        defpackage.qiy.a();	 Catch:{ all -> 0x0052 }
        r7 = new android.os.RemoteException;	 Catch:{ all -> 0x0052 }
        r0 = "SecurityException: Content provider unavailable. Likely framework issue.";
        r7.<init>(r0);	 Catch:{ all -> 0x0052 }
        throw r7;	 Catch:{ all -> 0x0052 }
    L_0x005f:
        defpackage.qiy.a();	 Catch:{ all -> 0x0052 }
        r7 = new android.os.RemoteException;	 Catch:{ all -> 0x0052 }
        r0 = "IAE: Content provider unavailable. Likely GmsCore down.";
        r7.<init>(r0);	 Catch:{ all -> 0x0052 }
        throw r7;	 Catch:{ all -> 0x0052 }
    L_0x006a:
        android.os.Binder.restoreCallingIdentity(r3);	 Catch:{ RemoteException -> 0x006e }
        throw r7;	 Catch:{ RemoteException -> 0x006e }
    L_0x006e:
        r7 = move-exception;
        r0 = "InstantAppsPMW";
        r2 = "Error getting app package for UID";
        android.util.Log.e(r0, r2, r7);
    L_0x0076:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qja.a(int):java.lang.String[]");
    }
}
