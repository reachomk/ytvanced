package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: qju */
public abstract class qju extends rjn implements qjr {
    public qju() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        String a;
        IInterface d;
        boolean p;
        switch (i) {
            case 2:
                a = a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 3:
                List b = b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                break;
            case 4:
                a = c();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 5:
                d = d();
                parcel2.writeNoException();
                rjz.a(parcel2, d);
                break;
            case 6:
                a = e();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 7:
                a = f();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 8:
                double g = g();
                parcel2.writeNoException();
                parcel2.writeDouble(g);
                break;
            case 9:
                a = h();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 10:
                a = i();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 11:
                d = j();
                parcel2.writeNoException();
                rjz.a(parcel2, d);
                break;
            case 12:
                k();
                parcel2.writeNoException();
                rjz.a(parcel2, null);
                break;
            case 13:
                l();
                parcel2.writeNoException();
                rjz.a(parcel2, null);
                break;
            case 14:
                m();
                parcel2.writeNoException();
                rjz.a(parcel2, null);
                break;
            case 15:
                d = n();
                parcel2.writeNoException();
                rjz.a(parcel2, d);
                break;
            case 16:
                Bundle o = o();
                parcel2.writeNoException();
                rjz.b(parcel2, o);
                break;
            case 17:
                p = p();
                parcel2.writeNoException();
                rjz.a(parcel2, p);
                break;
            case 18:
                p = q();
                parcel2.writeNoException();
                rjz.a(parcel2, p);
                break;
            case 19:
                r();
                parcel2.writeNoException();
                break;
            case 20:
                a(qcr.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 21:
                a(qcr.a(parcel.readStrongBinder()), qcr.a(parcel.readStrongBinder()), qcr.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 22:
                b(qcr.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
