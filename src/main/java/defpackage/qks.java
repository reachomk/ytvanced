package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: qks */
public abstract class qks extends rjn implements qkp {
    public qks() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        qkh qkh = null;
        qlc a;
        String readString;
        qcs a2;
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        switch (i) {
            case 1:
                qcs a3 = qcr.a(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                rjz.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (!(readStrongBinder2 == null || (readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback") instanceof qkr))) {
                    qku qku = new qku(readStrongBinder2);
                }
                a(a3, readString2);
                parcel2.writeNoException();
                break;
            case 2:
                a = a();
                parcel2.writeNoException();
                rjz.b(parcel2, a);
                break;
            case 3:
                a = b();
                parcel2.writeNoException();
                rjz.b(parcel2, a);
                break;
            case 4:
                parcel.readString();
                readString = parcel.readString();
                rjz.a(parcel, Bundle.CREATOR);
                a2 = qcr.a(parcel.readStrongBinder());
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                    if (queryLocalInterface instanceof qkh) {
                        qkh = (qkh) queryLocalInterface;
                    } else {
                        qkh = new qkk(readStrongBinder);
                    }
                }
                qjl.a(parcel.readStrongBinder());
                a(readString, a2, qkh, (rkz) rjz.a(parcel, rkz.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                IInterface c = c();
                parcel2.writeNoException();
                rjz.a(parcel2, c);
                break;
            case 6:
                qkj qkj;
                parcel.readString();
                readString = parcel.readString();
                rjz.a(parcel, Bundle.CREATOR);
                a2 = qcr.a(parcel.readStrongBinder());
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                    if (queryLocalInterface instanceof qkj) {
                        qkj = (qkj) queryLocalInterface;
                    } else {
                        qkj = new qkm(readStrongBinder);
                    }
                }
                qjl.a(parcel.readStrongBinder());
                a(readString, a2, qkj);
                parcel2.writeNoException();
                break;
            case 7:
                d();
                parcel2.writeNoException();
                break;
            case 8:
                qkn qkn;
                parcel.readString();
                readString = parcel.readString();
                rjz.a(parcel, Bundle.CREATOR);
                a2 = qcr.a(parcel.readStrongBinder());
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                    if (queryLocalInterface instanceof qkn) {
                        qkn = (qkn) queryLocalInterface;
                    } else {
                        qkn = new qkq(readStrongBinder);
                    }
                }
                qjl.a(parcel.readStrongBinder());
                a(readString, a2, qkn);
                parcel2.writeNoException();
                break;
            case 9:
                e();
                parcel2.writeNoException();
                break;
            case 10:
                f();
                parcel2.writeNoException();
                break;
            case 11:
                String[] createStringArray = parcel.createStringArray();
                parcel.createTypedArray(Bundle.CREATOR);
                a(createStringArray);
                parcel2.writeNoException();
                break;
            case 12:
                qkl qkl;
                parcel.readString();
                readString = parcel.readString();
                rjz.a(parcel, Bundle.CREATOR);
                a2 = qcr.a(parcel.readStrongBinder());
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                    if (queryLocalInterface instanceof qkl) {
                        qkl = (qkl) queryLocalInterface;
                    } else {
                        qkl = new qko(readStrongBinder);
                    }
                }
                qjl.a(parcel.readStrongBinder());
                a(readString, a2, qkl);
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
