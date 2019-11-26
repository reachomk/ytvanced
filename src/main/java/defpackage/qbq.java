package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: qbq */
public final class qbq {
    private static volatile pze a;
    private static final Object b = new Object();
    private static Context c;

    /* JADX WARNING: Missing block: B:11:0x001a, code skipped:
            return;
     */
    static synchronized void a(android.content.Context r2) {
        /*
        r0 = defpackage.qbq.class;
        monitor-enter(r0);
        r1 = c;	 Catch:{ all -> 0x001b }
        if (r1 == 0) goto L_0x000f;
    L_0x0007:
        r2 = "GoogleCertificates";
        r1 = "GoogleCertificates has been initialized already";
        android.util.Log.w(r2, r1);	 Catch:{ all -> 0x001b }
        goto L_0x0019;
    L_0x000f:
        if (r2 == 0) goto L_0x0019;
    L_0x0011:
        r2 = r2.getApplicationContext();	 Catch:{ all -> 0x001b }
        c = r2;	 Catch:{ all -> 0x001b }
        monitor-exit(r0);
        return;
    L_0x0019:
        monitor-exit(r0);
        return;
    L_0x001b:
        r2 = move-exception;
        monitor-exit(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbq.a(android.content.Context):void");
    }

    public static qca a(String str, qbs qbs, boolean z) {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            qca b = qbq.b(str, qbs, z);
            return b;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static qca b(String str, qbs qbs, boolean z) {
        try {
            if (a == null) {
                pzr.a(c);
                synchronized (b) {
                    if (a == null) {
                        pze pze;
                        IBinder a = DynamiteModule.a(c, DynamiteModule.b, "com.google.android.gms.googlecertificates").a("com.google.android.gms.common.GoogleCertificatesImpl");
                        if (a == null) {
                            pze = null;
                        } else {
                            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                            if (queryLocalInterface instanceof pze) {
                                pze = (pze) queryLocalInterface;
                            } else {
                                pze = new pzh(a);
                            }
                        }
                        a = pze;
                    }
                }
            }
            pzr.a(c);
            try {
                if (a.a(new qby(str, qbs, z), qct.a(c.getPackageManager()))) {
                    return qca.a;
                }
                return qca.a(new qbp(z, str, qbs));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                return qca.b("module call");
            }
        } catch (qda e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            str = String.valueOf(e2.getMessage());
            String str2 = "module init: ";
            if (str.length() == 0) {
                str = new String(str2);
            } else {
                str = str2.concat(str);
            }
            return qca.b(str);
        }
    }
}
