package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: chg */
public final class chg {
    private static final ConcurrentMap a = new ConcurrentHashMap();

    public static bsm a(Context context) {
        String packageName = context.getPackageName();
        bsm bsm = (bsm) a.get(packageName);
        bsm bsm2;
        if (bsm != null) {
            bsm2 = bsm;
        } else {
            PackageInfo packageInfo;
            Object uuid;
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (NameNotFoundException e) {
                String valueOf = String.valueOf(context.getPackageName());
                String str = "Cannot resolve info for";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                Log.e("AppVersionSignature", valueOf, e);
                packageInfo = null;
            }
            if (packageInfo == null) {
                uuid = UUID.randomUUID().toString();
            } else {
                uuid = String.valueOf(packageInfo.versionCode);
            }
            chi chi = new chi(uuid);
            bsm2 = (bsm) a.putIfAbsent(packageName, chi);
            return bsm2 != null ? bsm2 : chi;
        }
    }
}
