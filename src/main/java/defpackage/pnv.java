package defpackage;

import android.os.Parcel;

/* renamed from: pnv */
public abstract class pnv extends rjn implements pns {
    public pnv() {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
        } else if (i == 2) {
            a(parcel.readString(), (pjr) rjz.a(parcel, pjr.CREATOR));
            parcel2.writeNoException();
        } else if (i == 3) {
            a(parcel.readString());
            parcel2.writeNoException();
        } else if (i == 4) {
            a(parcel.readInt());
            parcel2.writeNoException();
        } else if (i != 5) {
            return false;
        } else {
            a();
            parcel2.writeNoException();
            parcel2.writeInt(13280009);
        }
        return true;
    }
}
