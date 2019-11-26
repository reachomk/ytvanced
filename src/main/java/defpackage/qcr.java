package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: qcr */
public class qcr extends rjn implements qcs {
    public qcr() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static qcs a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof qcs) {
            return (qcs) queryLocalInterface;
        }
        return new qcu(iBinder);
    }
}
