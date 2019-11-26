package defpackage;

import android.app.Application;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;

/* renamed from: uaa */
public final class uaa {
    public static boolean a(Application application, String str) {
        try {
            ServiceInfo[] serviceInfoArr = application.getPackageManager().getPackageInfo(application.getPackageName(), 4).services;
            if (serviceInfoArr == null) {
                return false;
            }
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (serviceInfo.name.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (NameNotFoundException e) {
            tyv.a("PrimesJobScheduler", "Failed to find application package", e, new Object[0]);
        }
    }
}
