package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

/* renamed from: pyw */
public abstract class pyw {
    private static final Object a = new Object();
    private static pyw b;

    public abstract void a(pyv pyv, ServiceConnection serviceConnection);

    public abstract boolean a(pyv pyv, ServiceConnection serviceConnection, String str);

    public static pyw a(Context context) {
        synchronized (a) {
            if (b == null) {
                b = new qal(context.getApplicationContext());
            }
        }
        return b;
    }

    public final void a(String str, String str2, int i, ServiceConnection serviceConnection) {
        a(new pyv(str, str2, 129), serviceConnection);
    }

    public final void a(ComponentName componentName, ServiceConnection serviceConnection) {
        a(new pyv(componentName), serviceConnection);
    }
}
