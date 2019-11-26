package defpackage;

import android.os.Parcel;

/* renamed from: qoe */
public abstract class qoe extends rjn implements qob {
    public qoe() {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a(parcel.readLong(), parcel.readLong());
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            a();
            parcel2.writeNoException();
            parcel2.writeInt(13280009);
        }
        return true;
    }
}
