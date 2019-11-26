package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: qqj */
public final class qqj extends riy implements qqk {
    qqj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.droidguard.internal.IDroidGuardService");
    }

    public final qqi a() {
        qqi qqh;
        Parcel a = a(2, aX_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
            qqh = queryLocalInterface instanceof qqi ? (qqi) queryLocalInterface : new qqh(readStrongBinder);
        } else {
            qqh = null;
        }
        a.recycle();
        return qqh;
    }
}
