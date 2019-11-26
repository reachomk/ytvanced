package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;

/* renamed from: psk */
public final class psk {
    private static psk b;
    public final Context a;

    private psk(Context context) {
        this.a = context.getApplicationContext();
    }

    public static psk a(Context context) {
        pzr.a((Object) context);
        synchronized (psk.class) {
            if (b == null) {
                qbq.a(context);
                b = new psk(context);
            }
        }
        return b;
    }

    public static boolean a(PackageInfo packageInfo, boolean z) {
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            qbs a;
            if (z) {
                a = psk.a(packageInfo, qbt.a);
            } else {
                a = psk.a(packageInfo, qbt.a[0]);
            }
            if (a != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (psk.a(packageInfo, false)) {
            return true;
        }
        if (psk.a(packageInfo, true)) {
            if (psl.b(this.a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    private static qbs a(PackageInfo packageInfo, qbs... qbsArr) {
        if (packageInfo.signatures != null) {
            if (packageInfo.signatures.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            int i = 0;
            qbr qbr = new qbr(packageInfo.signatures[0].toByteArray());
            while (i < qbsArr.length) {
                if (qbsArr[i].equals(qbr)) {
                    return qbsArr[i];
                }
                i++;
            }
        }
        return null;
    }
}
