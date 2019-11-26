package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: rmc */
public abstract class rmc extends rjn implements rlz {
    public rmc() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        rlq rlq = null;
        IInterface a;
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        switch (i) {
            case 1:
                a = a();
                parcel2.writeNoException();
                rjz.a(parcel2, a);
                break;
            case 2:
                b();
                parcel2.writeNoException();
                break;
            case 3:
                c();
                parcel2.writeNoException();
                rjz.a(parcel2, false);
                break;
            case 4:
                boolean a2 = a((rky) rjz.a(parcel, rky.CREATOR));
                parcel2.writeNoException();
                rjz.a(parcel2, a2);
                break;
            case 5:
                d();
                parcel2.writeNoException();
                break;
            case 6:
                e();
                parcel2.writeNoException();
                break;
            case 7:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    if (queryLocalInterface instanceof rlq) {
                        rlq = (rlq) queryLocalInterface;
                    } else {
                        rlq = new rls(readStrongBinder);
                    }
                }
                a(rlq);
                parcel2.writeNoException();
                break;
            case 8:
                rmh rmh;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if (queryLocalInterface instanceof rmh) {
                        rmh = (rmh) queryLocalInterface;
                    } else {
                        rmh = new rmj(readStrongBinder);
                    }
                }
                a(rmh);
                parcel2.writeNoException();
                break;
            case 9:
                f();
                parcel2.writeNoException();
                break;
            case 10:
                g();
                parcel2.writeNoException();
                break;
            case 11:
                h();
                parcel2.writeNoException();
                break;
            case 12:
                rkz i2 = i();
                parcel2.writeNoException();
                rjz.b(parcel2, i2);
                break;
            case 13:
                a((rkz) rjz.a(parcel, rkz.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                readStrongBinder = parcel.readStrongBinder();
                if (!(readStrongBinder == null || (readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener") instanceof qlh))) {
                    qlk qlk = new qlk(readStrongBinder);
                }
                j();
                parcel2.writeNoException();
                break;
            case 15:
                readStrongBinder = parcel.readStrongBinder();
                if (!(readStrongBinder == null || (readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener") instanceof qlj))) {
                    qlm qlm = new qlm(readStrongBinder);
                }
                parcel.readString();
                k();
                parcel2.writeNoException();
                break;
            case 18:
                l();
                parcel2.writeNoException();
                parcel2.writeString(null);
                break;
            case 19:
                readStrongBinder = parcel.readStrongBinder();
                if (!(readStrongBinder == null || (readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener") instanceof rog))) {
                    rof rof = new rof(readStrongBinder);
                }
                m();
                parcel2.writeNoException();
                break;
            case 20:
                rll rll;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if (queryLocalInterface instanceof rll) {
                        rll = (rll) queryLocalInterface;
                    } else {
                        rll = new rln(readStrongBinder);
                    }
                }
                a(rll);
                parcel2.writeNoException();
                break;
            case 21:
                readStrongBinder = parcel.readStrongBinder();
                if (!(readStrongBinder == null || (readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider") instanceof rmo))) {
                    rmn rmn = new rmn(readStrongBinder);
                }
                n();
                parcel2.writeNoException();
                break;
            case 22:
                rjz.a(parcel);
                o();
                parcel2.writeNoException();
                break;
            case 23:
                p();
                parcel2.writeNoException();
                rjz.a(parcel2, false);
                break;
            case 24:
                qlw qlw;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    if (queryLocalInterface instanceof qlw) {
                        qlw = (qlw) queryLocalInterface;
                    } else {
                        qlw = new qly(readStrongBinder);
                    }
                }
                a(qlw);
                parcel2.writeNoException();
                break;
            case 25:
                parcel.readString();
                q();
                parcel2.writeNoException();
                break;
            case 26:
                a = r();
                parcel2.writeNoException();
                rjz.a(parcel2, a);
                break;
            case 29:
                rjz.a(parcel, rnp.CREATOR);
                s();
                parcel2.writeNoException();
                break;
            case 30:
                rjz.a(parcel, rmz.CREATOR);
                t();
                parcel2.writeNoException();
                break;
            case 31:
                u();
                parcel2.writeNoException();
                parcel2.writeString(null);
                break;
            case 32:
                v();
                parcel2.writeNoException();
                rjz.a(parcel2, null);
                break;
            case 33:
                w();
                parcel2.writeNoException();
                rjz.a(parcel2, null);
                break;
            case 34:
                a(rjz.a(parcel));
                parcel2.writeNoException();
                break;
            case 35:
                x();
                parcel2.writeNoException();
                parcel2.writeString(null);
                break;
            case 36:
                rmg rmg;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    if (queryLocalInterface instanceof rmg) {
                        rmg = (rmg) queryLocalInterface;
                    } else {
                        rmg = new rmi(readStrongBinder);
                    }
                }
                a(rmg);
                parcel2.writeNoException();
                break;
            case 37:
                Bundle y = y();
                parcel2.writeNoException();
                rjz.b(parcel2, y);
                break;
            case 38:
                parcel.readString();
                z();
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
