package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Process;

/* renamed from: rn */
public final class rn {
    private static int a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        str = VERSION.SDK_INT >= 23 ? AppOpsManager.permissionToOp(str) : null;
        if (str == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (VERSION.SDK_INT < 23 || ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2) != 0) {
            return -2;
        }
        return 0;
    }

    public static int a(Context context, String str) {
        return rn.a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static int b(Context context, String str) {
        return rn.a(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }
}
