package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: qjj */
public abstract class qjj extends rjn implements qjk {
    public qjj() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        String str = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
        qjm qjm = null;
        qcs a;
        rkz rkz;
        rky rky;
        String readString;
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        IInterface a2;
        IInterface queryLocalInterface2;
        rky rky2;
        String readString2;
        boolean g;
        Bundle j;
        switch (i) {
            case 1:
                a = qcr.a(parcel.readStrongBinder());
                rkz = (rkz) rjz.a(parcel, rkz.CREATOR);
                rky = (rky) rjz.a(parcel, rky.CREATOR);
                readString = parcel.readString();
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface(str);
                    if (queryLocalInterface instanceof qjm) {
                        qjm = (qjm) queryLocalInterface;
                    } else {
                        qjm = new qjo(readStrongBinder);
                    }
                }
                a(a, rkz, rky, readString, qjm);
                parcel2.writeNoException();
                break;
            case 2:
                a2 = a();
                parcel2.writeNoException();
                rjz.a(parcel2, a2);
                break;
            case 3:
                qcs a3 = qcr.a(parcel.readStrongBinder());
                rky rky3 = (rky) rjz.a(parcel, rky.CREATOR);
                String readString3 = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    queryLocalInterface2 = readStrongBinder2.queryLocalInterface(str);
                    if (queryLocalInterface2 instanceof qjm) {
                        qjm = (qjm) queryLocalInterface2;
                    } else {
                        qjm = new qjo(readStrongBinder2);
                    }
                }
                a(a3, rky3, readString3, qjm);
                parcel2.writeNoException();
                break;
            case 4:
                b();
                parcel2.writeNoException();
                break;
            case 5:
                c();
                parcel2.writeNoException();
                break;
            case 6:
                a = qcr.a(parcel.readStrongBinder());
                rkz = (rkz) rjz.a(parcel, rkz.CREATOR);
                rky = (rky) rjz.a(parcel, rky.CREATOR);
                readString = parcel.readString();
                String readString4 = parcel.readString();
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface(str);
                    if (queryLocalInterface instanceof qjm) {
                        qjm = (qjm) queryLocalInterface;
                    } else {
                        qjm = new qjo(readStrongBinder);
                    }
                }
                a(a, rkz, rky, readString, readString4, qjm);
                parcel2.writeNoException();
                break;
            case 7:
                a = qcr.a(parcel.readStrongBinder());
                rky2 = (rky) rjz.a(parcel, rky.CREATOR);
                readString2 = parcel.readString();
                readString = parcel.readString();
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface(str);
                    if (queryLocalInterface instanceof qjm) {
                        qjm = (qjm) queryLocalInterface;
                    } else {
                        qjm = new qjo(readStrongBinder);
                    }
                }
                a(a, rky2, readString2, readString, qjm);
                parcel2.writeNoException();
                break;
            case 8:
                d();
                parcel2.writeNoException();
                break;
            case 9:
                e();
                parcel2.writeNoException();
                break;
            case 10:
                a(qcr.a(parcel.readStrongBinder()), (rky) rjz.a(parcel, rky.CREATOR), parcel.readString(), qmb.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                a((rky) rjz.a(parcel, rky.CREATOR), parcel.readString());
                parcel2.writeNoException();
                break;
            case 12:
                f();
                parcel2.writeNoException();
                break;
            case 13:
                g = g();
                parcel2.writeNoException();
                rjz.a(parcel2, g);
                break;
            case 14:
                a = qcr.a(parcel.readStrongBinder());
                rky2 = (rky) rjz.a(parcel, rky.CREATOR);
                readString2 = parcel.readString();
                readString = parcel.readString();
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface2 = readStrongBinder.queryLocalInterface(str);
                    if (queryLocalInterface2 instanceof qjm) {
                        qjm = (qjm) queryLocalInterface2;
                    } else {
                        qjm = new qjo(readStrongBinder);
                    }
                }
                a(a, rky2, readString2, readString, qjm, (roh) rjz.a(parcel, roh.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                break;
            case 15:
                a2 = h();
                parcel2.writeNoException();
                rjz.a(parcel2, a2);
                break;
            case 16:
                a2 = i();
                parcel2.writeNoException();
                rjz.a(parcel2, a2);
                break;
            case 17:
                j = j();
                parcel2.writeNoException();
                rjz.b(parcel2, j);
                break;
            case 18:
                j = k();
                parcel2.writeNoException();
                rjz.b(parcel2, j);
                break;
            case 19:
                j = l();
                parcel2.writeNoException();
                rjz.b(parcel2, j);
                break;
            case 20:
                a((rky) rjz.a(parcel, rky.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 21:
                a(qcr.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 22:
                g = m();
                parcel2.writeNoException();
                rjz.a(parcel2, g);
                break;
            case 23:
                a(qcr.a(parcel.readStrongBinder()), qmb.a(parcel.readStrongBinder()), (List) parcel.createStringArrayList());
                parcel2.writeNoException();
                break;
            case 24:
                a2 = n();
                parcel2.writeNoException();
                rjz.a(parcel2, a2);
                break;
            case 25:
                a(rjz.a(parcel));
                parcel2.writeNoException();
                break;
            case 26:
                a2 = o();
                parcel2.writeNoException();
                rjz.a(parcel2, a2);
                break;
            case 27:
                a2 = p();
                parcel2.writeNoException();
                rjz.a(parcel2, a2);
                break;
            default:
                return false;
        }
        return true;
    }
}
