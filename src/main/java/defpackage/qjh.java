package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: qjh */
public abstract class qjh extends rjn implements qji {
    public qjh() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        IInterface a;
        if (i == 1) {
            a = a(parcel.readString());
            parcel2.writeNoException();
            rjz.a(parcel2, a);
        } else if (i == 2) {
            boolean b = b(parcel.readString());
            parcel2.writeNoException();
            rjz.a(parcel2, b);
        } else if (i != 3) {
            return false;
        } else {
            a = c(parcel.readString());
            parcel2.writeNoException();
            rjz.a(parcel2, a);
        }
        return true;
    }
}
