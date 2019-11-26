package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: pza */
public abstract class pza extends rjn implements pyx {
    public pza() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) rjz.a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            parcel.readInt();
            rjz.a(parcel, Bundle.CREATOR);
            a();
        } else if (i != 3) {
            return false;
        } else {
            a(parcel.readInt(), parcel.readStrongBinder(), (pyu) rjz.a(parcel, pyu.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
