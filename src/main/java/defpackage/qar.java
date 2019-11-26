package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

/* renamed from: qar */
public final class qar {
    private static final Object a = new Object();
    private static volatile qar b;

    public static qar a() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new qar();
                }
            }
        }
        return b;
    }

    private qar() {
    }

    public static boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((qph.a(context).a(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (NameNotFoundException unused) {
            }
        }
        return context.bindService(intent, serviceConnection, i);
    }

    public static boolean b(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        context.getClass().getName();
        return qar.a(context, intent, serviceConnection, i);
    }
}
