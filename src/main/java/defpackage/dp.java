package defpackage;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: dp */
public abstract class dp extends Binder implements dm {
    public dp() {
        attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = "android.support.customtabs.ICustomTabsCallback";
        if (i == 2) {
            parcel.enforceInterface(str);
            parcel.readInt();
            if (parcel.readInt() != 0) {
                Bundle.CREATOR.createFromParcel(parcel);
            }
            a();
            parcel2.writeNoException();
            return true;
        } else if (i == 3) {
            parcel.enforceInterface(str);
            parcel.readString();
            if (parcel.readInt() != 0) {
                Bundle.CREATOR.createFromParcel(parcel);
            }
            b();
            parcel2.writeNoException();
            return true;
        } else if (i == 4) {
            parcel.enforceInterface(str);
            if (parcel.readInt() != 0) {
                Bundle.CREATOR.createFromParcel(parcel);
            }
            c();
            parcel2.writeNoException();
            return true;
        } else if (i == 5) {
            parcel.enforceInterface(str);
            parcel.readString();
            if (parcel.readInt() != 0) {
                Bundle.CREATOR.createFromParcel(parcel);
            }
            d();
            parcel2.writeNoException();
            return true;
        } else if (i == 6) {
            parcel.enforceInterface(str);
            parcel.readInt();
            if (parcel.readInt() != 0) {
                Uri.CREATOR.createFromParcel(parcel);
            }
            parcel.readInt();
            if (parcel.readInt() != 0) {
                Bundle.CREATOR.createFromParcel(parcel);
            }
            e();
            parcel2.writeNoException();
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString(str);
            return true;
        }
    }
}
