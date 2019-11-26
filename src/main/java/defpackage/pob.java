package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: pob */
public final class pob extends riy implements pny {
    pob(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IDiscoveryManager");
    }

    public final qcs a() {
        Parcel a = a(5, aX_());
        qcs a2 = qcr.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
