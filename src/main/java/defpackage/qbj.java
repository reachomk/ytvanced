package defpackage;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: qbj */
public final class qbj {
    public static boolean a(Context context, int i, String str) {
        try {
            ((AppOpsManager) qph.a(context).a.getSystemService("appops")).checkPackage(i, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
