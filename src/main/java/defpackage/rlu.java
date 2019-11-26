package defpackage;

import android.os.Parcel;

/* renamed from: rlu */
public abstract class rlu extends rjn implements rlr {
    public rlu() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a((rky) rjz.a(parcel, rky.CREATOR));
            parcel2.writeNoException();
        } else if (i == 2) {
            a();
            parcel2.writeNoException();
            parcel2.writeString(null);
        } else if (i == 3) {
            b();
            parcel2.writeNoException();
            rjz.a(parcel2, false);
        } else if (i == 4) {
            c();
            parcel2.writeNoException();
            parcel2.writeString(null);
        } else if (i != 5) {
            return false;
        } else {
            rjz.a(parcel, rky.CREATOR);
            parcel.readInt();
            d();
            parcel2.writeNoException();
        }
        return true;
    }
}
