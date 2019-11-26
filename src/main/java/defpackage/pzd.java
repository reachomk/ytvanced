package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: pzd */
public abstract class pzd extends rjn implements pzb {
    public pzd() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            IInterface a = a();
            parcel2.writeNoException();
            rjz.a(parcel2, a);
        } else if (i != 2) {
            return false;
        } else {
            i = b();
            parcel2.writeNoException();
            parcel2.writeInt(i);
        }
        return true;
    }
}
