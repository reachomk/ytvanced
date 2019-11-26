package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* renamed from: qfc */
public final class qfc {
    public static int a(Context context) {
        String a = qhu.a(context);
        if (a != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(a, 0);
                if (packageInfo != null) {
                    return packageInfo.versionCode;
                }
            } catch (NameNotFoundException unused) {
            }
        }
        return -1;
    }

    static {
        AtomicInteger atomicInteger = new AtomicInteger(1);
    }
}
