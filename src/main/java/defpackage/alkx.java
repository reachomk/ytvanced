package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* renamed from: alkx */
final class alkx implements Runnable {
    private final /* synthetic */ PackageManager a;
    private final /* synthetic */ alku b;

    alkx(alku alku, PackageManager packageManager) {
        this.b = alku;
        this.a = packageManager;
    }

    public final void run() {
        xak.b();
        List<ResolveInfo> a = xuz.a(this.a);
        synchronized (this.b) {
            for (ResolveInfo resolveInfo : a) {
                this.b.a.add(resolveInfo.activityInfo.applicationInfo.packageName);
            }
        }
    }
}
