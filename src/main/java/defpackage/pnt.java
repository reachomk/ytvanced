package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: pnt */
public abstract class pnt extends rjn implements pnq {
    public pnt() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            IInterface b = b();
            parcel2.writeNoException();
            rjz.a(parcel2, b);
        } else if (i == 2) {
            c();
            parcel2.writeNoException();
        } else if (i == 3) {
            d();
            parcel2.writeNoException();
        } else if (i != 4) {
            return false;
        } else {
            a();
            parcel2.writeNoException();
            parcel2.writeInt(13280009);
        }
        return true;
    }
}
