package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

/* renamed from: yf */
public final class yf implements Parcelable {
    public static final Creator CREATOR = new ye();
    public final Handler a = null;
    private yb b;

    public final void a(int i, Bundle bundle) {
        yb ybVar = this.b;
        if (ybVar != null) {
            try {
                ybVar.a(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.b == null) {
                this.b = new yh(this);
            }
            parcel.writeStrongBinder(this.b.asBinder());
        }
    }

    yf(Parcel parcel) {
        yb ybVar = null;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof yb)) {
                ybVar = new yd(readStrongBinder);
            } else {
                ybVar = (yb) queryLocalInterface;
            }
        }
        this.b = ybVar;
    }
}
