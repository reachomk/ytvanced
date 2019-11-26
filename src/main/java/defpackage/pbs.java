package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: pbs */
public abstract class pbs extends rjn implements pbp {
    public pbs() {
        super("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        String a;
        boolean a2;
        IInterface a3;
        switch (i) {
            case 1:
                a = a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 2:
                a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 3:
                a2 = a(qcr.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                rjz.a(parcel2, a2);
                break;
            case 4:
                a2 = b(qcr.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                rjz.a(parcel2, a2);
                break;
            case 5:
                a(parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                a3 = a(qcr.a(parcel.readStrongBinder()), qcr.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                rjz.a(parcel2, a3);
                break;
            case 7:
                a = c(qcr.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 8:
                a = a(qcr.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 9:
                d(qcr.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 10:
                a3 = b(qcr.a(parcel.readStrongBinder()), qcr.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                rjz.a(parcel2, a3);
                break;
            case 11:
                a2 = a(parcel.readString(), rjz.a(parcel));
                parcel2.writeNoException();
                rjz.a(parcel2, a2);
                break;
            case 12:
                a = a(qcr.a(parcel.readStrongBinder()), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            default:
                return false;
        }
        return true;
    }
}
