package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: pnl */
public abstract class pnl extends rjn implements pog {
    public pnl() {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
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
                a(qcr.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 3:
                a(qcr.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 4:
                a(qcr.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 5:
                b(qcr.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 6:
                b(qcr.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 7:
                b(qcr.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 8:
                a(qcr.a(parcel.readStrongBinder()), rjz.a(parcel));
                parcel2.writeNoException();
                break;
            case 9:
                c(qcr.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 10:
                d(qcr.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 11:
                a();
                parcel2.writeNoException();
                parcel2.writeInt(13280009);
                break;
            default:
                return false;
        }
        return true;
    }
}
