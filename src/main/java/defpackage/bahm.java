package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;

/* renamed from: bahm */
public final class bahm {
    public static volatile Boolean a;

    public static synchronized boolean a(Context context) {
        boolean booleanValue;
        synchronized (bahm.class) {
            if (a == null) {
                try {
                    a = Boolean.valueOf(bahn.a(context.getPackageManager().getPackageInfo(context.getPackageName(), 64), bahn.c, bahn.d, bahn.b));
                } catch (NameNotFoundException e) {
                    throw new IllegalStateException("Unable to find self package info", e);
                }
            }
            booleanValue = a.booleanValue();
        }
        return booleanValue;
    }
}
