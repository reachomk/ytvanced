package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;

/* renamed from: aant */
public final class aant {
    private final zyw a;
    private final PackageManager b;

    public aant(zyw zyw, PackageManager packageManager) {
        this.a = zyw;
        this.b = packageManager;
    }

    public final amul a() {
        apxn a = this.a.a();
        if (a != null) {
            aorv aorv = a.g;
            if (aorv == null) {
                aorv = aorv.b;
            }
            if (aorv.a.size() > 0) {
                aorv aorv2 = a.g;
                if (aorv2 == null) {
                    aorv2 = aorv.b;
                }
                anyd<aorx> anyd = aorv2.a;
                amuo amuo = new amuo();
                for (aorx aorx : anyd) {
                    if (!this.b.queryIntentActivities(new Intent().setPackage(aorx.c), 65536).isEmpty()) {
                        amuo.c(Integer.valueOf(aorx.b));
                    }
                }
                return amuo.a();
            }
        }
        return amul.g();
    }
}
