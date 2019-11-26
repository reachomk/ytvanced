package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: auf */
public abstract class auf implements ServiceConnection {
    public abstract void a(aub aub);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        do drVar;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            drVar = (queryLocalInterface == null || !(queryLocalInterface instanceof do)) ? new dr(iBinder) : (do) queryLocalInterface;
        } else {
            drVar = null;
        }
        a(new aue(drVar, componentName));
    }
}
