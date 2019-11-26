package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: qjq */
public abstract class qjq extends rjn implements qjn {
    public qjq() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        String a;
        IInterface d;
        boolean j;
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
                double f = f();
                parcel2.writeNoException();
                parcel2.writeDouble(f);
                break;
            case 8:
                a = g();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 9:
                a = h();
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            case 10:
                i();
                parcel2.writeNoException();
                break;
            case 11:
                a(qcr.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 12:
                b(qcr.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 13:
                j = j();
                parcel2.writeNoException();
                rjz.a(parcel2, j);
                break;
            case 14:
                j = k();
                parcel2.writeNoException();
                rjz.a(parcel2, j);
                break;
            case 15:
                Bundle l = l();
                parcel2.writeNoException();
                rjz.b(parcel2, l);
                break;
            case 16:
                c(qcr.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 17:
                d = m();
                parcel2.writeNoException();
                rjz.a(parcel2, d);
                break;
            case 18:
                n();
                parcel2.writeNoException();
                rjz.a(parcel2, null);
                break;
            case 19:
                o();
                parcel2.writeNoException();
                rjz.a(parcel2, null);
                break;
            case 20:
                p();
                parcel2.writeNoException();
                rjz.a(parcel2, null);
                break;
            case 21:
                q();
                parcel2.writeNoException();
                rjz.a(parcel2, null);
                break;
            case 22:
                a(qcr.a(parcel.readStrongBinder()), qcr.a(parcel.readStrongBinder()), qcr.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
