package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rmd */
public final class rmd extends riy implements rme {
    rmd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder a(qcs qcs, rkz rkz, String str, qji qji, int i) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        rjz.a(aX_, (Parcelable) rkz);
        aX_.writeString(str);
        rjz.a(aX_, (IInterface) qji);
        aX_.writeInt(psl.a);
        aX_.writeInt(i);
        Parcel a = a(2, aX_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
