package defpackage;

import android.content.pm.IPackageStatsObserver;
import com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture.PackageStatsInvocation;

/* renamed from: ucr */
public final class ucr extends PackageStatsInvocation {
    public ucr(String str, Class[] clsArr) {
        super(str, clsArr);
    }

    /* Access modifiers changed, original: final */
    public final Object[] a(String str, int i, IPackageStatsObserver iPackageStatsObserver) {
        return new Object[]{str, iPackageStatsObserver};
    }
}
