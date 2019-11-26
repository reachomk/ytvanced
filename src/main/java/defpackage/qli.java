package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: qli */
public final class qli extends riy implements qlf {
    qli(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    public final IBinder a(qcs qcs) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        Parcel a = a(1, aX_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }
}
