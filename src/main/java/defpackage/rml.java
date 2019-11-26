package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rml */
public final class rml extends riy implements rmm {
    rml(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public final rlz a(qcs qcs, rkz rkz, String str, qji qji) {
        rlz rmb;
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        rjz.a(aX_, (Parcelable) rkz);
        aX_.writeString(str);
        rjz.a(aX_, (IInterface) qji);
        aX_.writeInt(psl.a);
        Parcel a = a(1, aX_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            rmb = queryLocalInterface instanceof rlz ? (rlz) queryLocalInterface : new rmb(readStrongBinder);
        } else {
            rmb = null;
        }
        a.recycle();
        return rmb;
    }

    public final rlz b(qcs qcs, rkz rkz, String str, qji qji) {
        rlz rmb;
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        rjz.a(aX_, (Parcelable) rkz);
        aX_.writeString(str);
        rjz.a(aX_, (IInterface) qji);
        aX_.writeInt(psl.a);
        Parcel a = a(2, aX_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            rmb = queryLocalInterface instanceof rlz ? (rlz) queryLocalInterface : new rmb(readStrongBinder);
        } else {
            rmb = null;
        }
        a.recycle();
        return rmb;
    }

    public final rlw a(qcs qcs, String str, qji qji) {
        rlw rly;
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        aX_.writeString(str);
        rjz.a(aX_, (IInterface) qji);
        aX_.writeInt(psl.a);
        Parcel a = a(3, aX_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            rly = queryLocalInterface instanceof rlw ? (rlw) queryLocalInterface : new rly(readStrongBinder);
        } else {
            rly = null;
        }
        a.recycle();
        return rly;
    }

    public final qld a(qcs qcs) {
        qld qlg;
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        Parcel a = a(8, aX_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            qlg = queryLocalInterface instanceof qld ? (qld) queryLocalInterface : new qlg(readStrongBinder);
        } else {
            qlg = null;
        }
        a.recycle();
        return qlg;
    }

    public final rlz a(qcs qcs, rkz rkz, String str) {
        rlz rmb;
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        rjz.a(aX_, (Parcelable) rkz);
        aX_.writeString(str);
        aX_.writeInt(psl.a);
        Parcel a = a(10, aX_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            rmb = queryLocalInterface instanceof rlz ? (rlz) queryLocalInterface : new rmb(readStrongBinder);
        } else {
            rmb = null;
        }
        a.recycle();
        return rmb;
    }
}
