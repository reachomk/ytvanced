package com.google.android.libraries.performance.primes.metriccapture;

import android.content.Context;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.IPackageStatsObserver.Stub;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Build.VERSION;
import android.os.Process;
import defpackage.tyv;
import defpackage.ucq;
import defpackage.ucr;
import defpackage.ucs;
import defpackage.uct;
import defpackage.uia;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class PackageStatsCapture {
    public static final PackageStatsInvocation[] GETTER_INVOCATIONS;

    final class PackageStatsCallback extends Stub {
        public final Semaphore a = new Semaphore(1);
        public volatile PackageStats b;

        private PackageStatsCallback() {
        }

        public final void onGetStatsCompleted(PackageStats packageStats, boolean z) {
            String str = "PackageStatsCapture";
            if (z) {
                String valueOf = String.valueOf(packageStats);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 30);
                stringBuilder.append("Success getting PackageStats: ");
                stringBuilder.append(valueOf);
                tyv.b(str, stringBuilder.toString(), new Object[0]);
                this.b = packageStats;
            } else {
                tyv.d(str, "Failure getting PackageStats", new Object[0]);
            }
            this.a.release();
        }

        /* synthetic */ PackageStatsCallback(byte b) {
        }
    }

    public abstract class PackageStatsInvocation {
        private final String a;
        private final Class[] b;

        public PackageStatsInvocation(String str, Class[] clsArr) {
            this.a = str;
            this.b = clsArr;
        }

        public abstract Object[] a(String str, int i, IPackageStatsObserver iPackageStatsObserver);

        /* Access modifiers changed, original: 0000 */
        public boolean invoke(PackageManager packageManager, String str, int i, IPackageStatsObserver iPackageStatsObserver) {
            String str2 = "PackageStatsCapture";
            try {
                packageManager.getClass().getMethod(this.a, this.b).invoke(packageManager, a(str, i, iPackageStatsObserver));
                return true;
            } catch (NoSuchMethodException e) {
                tyv.a(str2, "PackageStats getter not found", e, new Object[0]);
                return false;
            } catch (Error | Exception e2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(e2.getClass().getSimpleName());
                stringBuilder.append(" for ");
                stringBuilder.append(this.a);
                stringBuilder.append('(');
                stringBuilder.append(Arrays.asList(this.b));
                stringBuilder.append(") invocation");
                tyv.c(str2, stringBuilder.toString(), new Object[0]);
                return false;
            }
        }
    }

    private PackageStatsCapture() {
    }

    private static boolean a() {
        int i = 0;
        try {
            i = Modifier.isAbstract(PackageStatsCallback.class.getMethod("onGetStatsCompleted", new Class[]{PackageStats.class, Boolean.TYPE}).getModifiers());
            return i ^ 1;
        } catch (Error | Exception e) {
            tyv.a("PackageStatsCapture", "failure", e, new Object[i]);
            return i;
        }
    }

    static PackageStats getPackageStatsUsingInternalAPI(Context context, long j, PackageStatsInvocation... packageStatsInvocationArr) {
        PackageStats packageStats = null;
        String str = "PackageStatsCapture";
        if (a()) {
            PackageStatsCallback packageStatsCallback = new PackageStatsCallback();
            try {
                packageStatsCallback.a.acquire();
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                int myUid = Process.myUid();
                for (PackageStatsInvocation invoke : packageStatsInvocationArr) {
                    if (invoke.invoke(packageManager, packageName, myUid, packageStatsCallback)) {
                        tyv.c(str, "Success invoking PackageStats capture.", new Object[0]);
                        if (packageStatsCallback.a.tryAcquire(j, TimeUnit.MILLISECONDS)) {
                            packageStats = packageStatsCallback.b;
                        } else {
                            tyv.d(str, "Timeout while waiting for PackageStats callback", new Object[0]);
                        }
                        return packageStats;
                    }
                }
                tyv.d(str, "Couldn't capture PackageStats.", new Object[0]);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            return null;
        }
        tyv.d(str, "Callback implementation stripped by proguard.", new Object[0]);
        return null;
    }

    public static PackageStats getPackageStats(Context context) {
        String str = "android.permission.GET_PACKAGE_SIZE";
        uia.b();
        if (VERSION.SDK_INT >= 26) {
            return uct.a(context);
        }
        if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0 || context.checkCallingOrSelfPermission(str) == 0) {
            return getPackageStatsUsingInternalAPI(context, 15000, GETTER_INVOCATIONS);
        }
        tyv.d("PackageStatsCapture", "android.permission.GET_PACKAGE_SIZE required", new Object[0]);
        return null;
    }

    static {
        r1 = new PackageStatsInvocation[3];
        String str = "getPackageSizeInfo";
        r1[0] = new ucr(str, new Class[]{String.class, IPackageStatsObserver.class});
        r1[1] = new ucq(str, new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class});
        r1[2] = new ucs("getPackageSizeInfoAsUser", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class});
        GETTER_INVOCATIONS = r1;
    }
}
