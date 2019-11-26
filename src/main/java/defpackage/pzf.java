package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: pzf */
final class pzf implements pyz {
    private final IBinder a;

    pzf(IBinder iBinder) {
        this.a = iBinder;
    }

    public final IBinder asBinder() {
        return this.a;
    }

    public final void a(pyx pyx, pyt pyt) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            pyx.asBinder();
            obtain.writeStrongBinder(pyx);
            obtain.writeInt(1);
            pyt.writeToParcel(obtain, 0);
            this.a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
