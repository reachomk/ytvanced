package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: qjl */
public abstract class qjl extends rjn implements qjm {
    public static qjm a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        if (queryLocalInterface instanceof qjm) {
            return (qjm) queryLocalInterface;
        }
        return new qjo(iBinder);
    }
}
