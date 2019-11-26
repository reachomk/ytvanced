package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: ya */
public abstract class ya extends Binder implements yb {
    public ya() {
        attachInterface(this, "android.support.v4.os.IResultReceiver");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = "android.support.v4.os.IResultReceiver";
        if (i == 1) {
            parcel.enforceInterface(str);
            a(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString(str);
            return true;
        }
    }
}
