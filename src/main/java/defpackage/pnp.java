package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: pnp */
public abstract class pnp extends rjn implements pnm {
    public pnp() {
        super("com.google.android.gms.cast.framework.ISessionProxy");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                IInterface b = b();
                parcel2.writeNoException();
                rjz.a(parcel2, b);
                break;
            case 2:
                b((Bundle) rjz.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 3:
                d((Bundle) rjz.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                a(rjz.a(parcel));
                parcel2.writeNoException();
                break;
            case 5:
                long c = c();
                parcel2.writeNoException();
                parcel2.writeLong(c);
                break;
            case 6:
                a();
                parcel2.writeNoException();
                parcel2.writeInt(13280009);
                break;
            case 7:
                a((Bundle) rjz.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 8:
                c((Bundle) rjz.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
