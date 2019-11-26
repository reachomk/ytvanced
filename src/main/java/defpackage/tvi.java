package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;

/* renamed from: tvi */
final class tvi implements tzu {
    private final /* synthetic */ Application a;
    private final /* synthetic */ txw b;

    tvi(Application application, txw txw) {
        this.a = application;
        this.b = txw;
    }

    public final /* synthetic */ Object a() {
        String str;
        int i = 0;
        twd twd = new twd(i);
        twd.a = this.a;
        if (this.b.b().a()) {
            twd.b = ((tys) this.b.b().b()).a;
        }
        Object obj = twd.a;
        tzu tzu = twd.b;
        String packageName = ((Context) uhy.a(obj)).getPackageName();
        String d = ucv.d(obj);
        PackageManager packageManager = obj.getPackageManager();
        try {
            str = packageManager.getPackageInfo(packageName, i).versionName;
        } catch (NameNotFoundException unused) {
            tyv.d("MetricStamper", "Failed to get PackageInfo for: %s", packageName);
            str = null;
        }
        String str2 = str;
        int i2 = 2;
        if (VERSION.SDK_INT >= 20) {
            if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                i2 = 3;
            } else if (VERSION.SDK_INT >= 21 && packageManager.hasSystemFeature("android.software.leanback")) {
                i2 = 4;
            }
        }
        return new twe(packageName, d, str2, i2, udn.a(obj), new tap(obj), tzu);
    }
}
