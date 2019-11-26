package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: rma */
public final class rma extends riy implements rlx {
    rma(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
    }

    public final IBinder a(qcs qcs, String str, qji qji) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        aX_.writeString(str);
        rjz.a(aX_, (IInterface) qji);
        aX_.writeInt(psl.a);
        Parcel a = a(1, aX_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
