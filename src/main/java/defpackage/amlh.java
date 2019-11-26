package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: amlh */
public abstract class amlh extends dhx implements amli {
    public amlh() {
        super("com.google.android.youtube.player.internal.IEmbedFragment");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = "com.google.android.youtube.player.internal.IAsyncResultCallback";
        amlm amlm = null;
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        amle amle;
        switch (i) {
            case 1:
                IInterface b = b();
                parcel2.writeNoException();
                dhw.a(parcel2, b);
                break;
            case 2:
                c();
                parcel2.writeNoException();
                break;
            case 3:
                d();
                parcel2.writeNoException();
                break;
            case 4:
                a(parcel.readString(), dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 5:
                b(parcel.readString(), dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 6:
                a((List) parcel.createStringArrayList(), dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 7:
                i();
                parcel2.writeNoException();
                break;
            case 8:
                a(parcel.readInt());
                parcel2.writeNoException();
                break;
            case 9:
                Bundle k = k();
                parcel2.writeNoException();
                dhw.b(parcel2, k);
                break;
            case 10:
                a((Bundle) dhw.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 11:
                a();
                parcel2.writeNoException();
                break;
            case 12:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IJarEmbedFragmentClient");
                    if (queryLocalInterface instanceof amlm) {
                        amlm = (amlm) queryLocalInterface;
                    } else {
                        amlm = new amlo(readStrongBinder);
                    }
                }
                a(amlm);
                parcel2.writeNoException();
                break;
            case 13:
                l();
                parcel2.writeNoException();
                break;
            case 14:
                a(parcel.readString());
                parcel2.writeNoException();
                break;
            case 15:
                e();
                parcel2.writeNoException();
                break;
            case 16:
                f();
                parcel2.writeNoException();
                break;
            case 17:
                g();
                parcel2.writeNoException();
                break;
            case 18:
                h();
                parcel2.writeNoException();
                break;
            case 19:
                b(parcel.readString());
                parcel2.writeNoException();
                break;
            case 20:
                c(parcel.readString());
                parcel2.writeNoException();
                break;
            case 21:
                a(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 22:
                b(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 23:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface(str);
                    if (queryLocalInterface instanceof amle) {
                        amle = (amle) queryLocalInterface;
                    } else {
                        amle = new amld(readStrongBinder);
                    }
                }
                a(amle);
                parcel2.writeNoException();
                break;
            case 24:
                String readString = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(str);
                    if (queryLocalInterface2 instanceof amle) {
                        amle = (amle) queryLocalInterface2;
                    } else {
                        amle = new amld(readStrongBinder2);
                    }
                }
                a(readString, amle);
                parcel2.writeNoException();
                break;
            case 25:
                d(parcel.readString());
                parcel2.writeNoException();
                break;
            case 26:
                j();
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
