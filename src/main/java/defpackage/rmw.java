package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: rmw */
public abstract class rmw extends rjn implements rmt {
    public rmw() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static rmt a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        if (queryLocalInterface instanceof rmt) {
            return (rmt) queryLocalInterface;
        }
        return new rmv(iBinder);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        boolean d;
        float f;
        switch (i) {
            case 1:
                a();
                parcel2.writeNoException();
                break;
            case 2:
                b();
                parcel2.writeNoException();
                break;
            case 3:
                rjz.a(parcel);
                c();
                parcel2.writeNoException();
                break;
            case 4:
                d = d();
                parcel2.writeNoException();
                rjz.a(parcel2, d);
                break;
            case 5:
                i = e();
                parcel2.writeNoException();
                parcel2.writeInt(i);
                break;
            case 6:
                f = f();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                break;
            case 7:
                f = g();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                break;
            case 8:
                rmy rna;
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    rna = queryLocalInterface instanceof rmy ? (rmy) queryLocalInterface : new rna(readStrongBinder);
                } else {
                    rna = null;
                }
                a(rna);
                parcel2.writeNoException();
                break;
            case 9:
                f = i();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                break;
            case 10:
                d = j();
                parcel2.writeNoException();
                rjz.a(parcel2, d);
                break;
            case 11:
                IInterface h = h();
                parcel2.writeNoException();
                rjz.a(parcel2, h);
                break;
            case 12:
                d = k();
                parcel2.writeNoException();
                rjz.a(parcel2, d);
                break;
            default:
                return false;
        }
        return true;
    }
}
