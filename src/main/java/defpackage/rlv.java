package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: rlv */
public abstract class rlv extends rjn implements rlw {
    public rlv() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        rlq rlq = null;
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        switch (i) {
            case 1:
                IInterface a = a();
                parcel2.writeNoException();
                rjz.a(parcel2, a);
                break;
            case 2:
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
            case 3:
                rpg rpg;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
                    if (queryLocalInterface instanceof rpg) {
                        rpg = (rpg) queryLocalInterface;
                    } else {
                        rpg = new rpi(readStrongBinder);
                    }
                }
                a(rpg);
                parcel2.writeNoException();
                break;
            case 4:
                rph rph;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
                    if (queryLocalInterface instanceof rph) {
                        rph = (rph) queryLocalInterface;
                    } else {
                        rph = new rpj(readStrongBinder);
                    }
                }
                a(rph);
                parcel2.writeNoException();
                break;
            case 5:
                rpn rpp;
                rpm rpm;
                String readString = parcel.readString();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
                    rpp = queryLocalInterface2 instanceof rpn ? (rpn) queryLocalInterface2 : new rpp(readStrongBinder2);
                } else {
                    rpp = null;
                }
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                    if (queryLocalInterface3 instanceof rpm) {
                        rpm = (rpm) queryLocalInterface3;
                    } else {
                        rpm = new rpo(readStrongBinder3);
                    }
                }
                a(readString, rpp, rpm);
                parcel2.writeNoException();
                break;
            case 6:
                a((roh) rjz.a(parcel, roh.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                readStrongBinder = parcel.readStrongBinder();
                if (!(readStrongBinder == null || (readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider") instanceof rmo))) {
                    rmn rmn = new rmn(readStrongBinder);
                }
                b();
                parcel2.writeNoException();
                break;
            case 8:
                readStrongBinder = parcel.readStrongBinder();
                if (!(readStrongBinder == null || (readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener") instanceof rps))) {
                    rpr rpr = new rpr(readStrongBinder);
                }
                rjz.a(parcel, rkz.CREATOR);
                c();
                parcel2.writeNoException();
                break;
            case 9:
                rjz.a(parcel, pcs.CREATOR);
                d();
                parcel2.writeNoException();
                break;
            case 10:
                rpu rpu;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
                    if (queryLocalInterface instanceof rpu) {
                        rpu = (rpu) queryLocalInterface;
                    } else {
                        rpu = new rpw(readStrongBinder);
                    }
                }
                a(rpu);
                parcel2.writeNoException();
                break;
            case 11:
                readStrongBinder = parcel.readStrongBinder();
                if (!(readStrongBinder == null || (readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdListener") instanceof rqh))) {
                    rqk rqk = new rqk(readStrongBinder);
                }
                e();
                parcel2.writeNoException();
                break;
            case 12:
                rjz.a(parcel, rqf.CREATOR);
                f();
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
