package defpackage;

import android.content.Context;

/* renamed from: qpf */
public final class qpf {
    private static Context a;
    private static Boolean b;

    public static synchronized boolean a(Context context) {
        synchronized (qpf.class) {
            boolean booleanValue;
            Context applicationContext = context.getApplicationContext();
            if (!(a == null || b == null)) {
                if (a == applicationContext) {
                    booleanValue = b.booleanValue();
                    return booleanValue;
                }
            }
            b = null;
            if (qbf.c()) {
                b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    b = Boolean.valueOf(true);
                } catch (ClassNotFoundException unused) {
                    b = Boolean.valueOf(false);
                }
            }
            a = applicationContext;
            booleanValue = b.booleanValue();
            return booleanValue;
        }
    }
}
