package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: qjs */
public abstract class qjs extends rjn implements qjp {
    public qjs() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        String a;
        IInterface d;
        boolean h;
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
                g();
                parcel2.writeNoException();
                break;
            case 9:
                a(qcr.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 10:
                b(qcr.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 11:
                h = h();
                parcel2.writeNoException();
                rjz.a(parcel2, h);
                break;
            case 12:
                h = i();
                parcel2.writeNoException();
                rjz.a(parcel2, h);
                break;
            case 13:
                Bundle j = j();
                parcel2.writeNoException();
                rjz.b(parcel2, j);
                break;
            case 14:
                c(qcr.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 15:
                k();
                parcel2.writeNoException();
                rjz.a(parcel2, null);
                break;
            case 16:
                d = l();
                parcel2.writeNoException();
                rjz.a(parcel2, d);
                break;
            case 19:
                m();
                parcel2.writeNoException();
                rjz.a(parcel2, null);
                break;
            case 20:
                n();
                parcel2.writeNoException();
                rjz.a(parcel2, null);
                break;
            case 21:
                o();
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
