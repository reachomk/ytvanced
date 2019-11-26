package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: qnn */
public abstract class qnn extends rjn implements qno {
    public qnn() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        Bundle bundle;
        boolean b;
        switch (i) {
            case 1:
                qnq qnp;
                bundle = (Bundle) rjz.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    qnp = queryLocalInterface instanceof qnq ? (qnq) queryLocalInterface : new qnp(readStrongBinder);
                } else {
                    qnp = null;
                }
                a(bundle, qnp);
                parcel2.writeNoException();
                break;
            case 2:
                a((Bundle) rjz.a(parcel, Bundle.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 3:
                a((Bundle) rjz.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                b = b((Bundle) rjz.a(parcel, Bundle.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                rjz.a(parcel2, b);
                break;
            case 5:
                a(parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                b();
                parcel2.writeNoException();
                break;
            case 7:
                b = c();
                parcel2.writeNoException();
                rjz.a(parcel2, b);
                break;
            case 8:
                bundle = b(parcel.readString());
                parcel2.writeNoException();
                rjz.b(parcel2, bundle);
                break;
            case 9:
                String d = d();
                parcel2.writeNoException();
                parcel2.writeString(d);
                break;
            case 10:
                a();
                parcel2.writeNoException();
                parcel2.writeInt(13280009);
                break;
            case 11:
                e();
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
