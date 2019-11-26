package defpackage;

import android.content.ComponentName;
import android.content.pm.PackageManager;

/* renamed from: dpv */
final class dpv implements Runnable {
    private final /* synthetic */ dos a;

    dpv(dos dos) {
        this.a = dos;
    }

    public final void run() {
        if (((xhv) this.a.ae.get()).i()) {
            ComponentName componentName = new ComponentName(this.a.aD, "com.google.android.youtube.ManageNetworkUsageActivity");
            PackageManager packageManager = this.a.aD.getPackageManager();
            if (packageManager.getComponentEnabledSetting(componentName) != 1) {
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }
}
