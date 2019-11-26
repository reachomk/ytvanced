package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: pbv */
public final class pbv extends riy implements pbw {
    pbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
    }

    public final IBinder a(String str, qcs qcs) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        rjz.a(aX_, (IInterface) qcs);
        Parcel a = a(1, aX_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }

    public final IBinder b(String str, qcs qcs) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        rjz.a(aX_, (IInterface) qcs);
        Parcel a = a(2, aX_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
