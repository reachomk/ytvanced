package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: rkj */
public final class rkj extends riy implements rkk {
    public rkj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final String a() {
        Parcel a = a(1, aX_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final boolean b() {
        Parcel aX_ = aX_();
        rjz.a(aX_, true);
        aX_ = a(2, aX_);
        boolean a = rjz.a(aX_);
        aX_.recycle();
        return a;
    }
}
