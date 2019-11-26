package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: prv */
public final class prv extends riy implements prs {
    prv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    public final void a(prq prq, pri pri) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) prq);
        rjz.a(aX_, (Parcelable) pri);
        c(1, aX_);
    }
}
