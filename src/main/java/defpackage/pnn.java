package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: pnn */
public abstract class pnn extends rjn implements pnk {
    public pnn() {
        super("com.google.android.gms.cast.framework.ISessionProvider");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            IInterface a = a(parcel.readString());
            parcel2.writeNoException();
            rjz.a(parcel2, a);
        } else if (i == 2) {
            boolean b = b();
            parcel2.writeNoException();
            rjz.a(parcel2, b);
        } else if (i == 3) {
            String c = c();
            parcel2.writeNoException();
            parcel2.writeString(c);
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
