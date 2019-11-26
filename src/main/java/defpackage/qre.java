package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qre */
public final class qre extends riy implements qrb {
    qre(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService");
    }

    public final void a(qhl qhl) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) qhl);
        b(1, aX_);
    }
}
