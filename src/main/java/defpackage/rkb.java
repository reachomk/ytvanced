package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: rkb */
public abstract class rkb extends rjn implements rkc {
    public static rkc a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        if (queryLocalInterface instanceof rkc) {
            return (rkc) queryLocalInterface;
        }
        return new rke(iBinder);
    }
}
