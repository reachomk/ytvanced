package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qrc */
public final class qrc extends riy implements qqz {
    qrc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final qqx a(qqv qqv) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) qqv);
        Parcel a = a(1, aX_);
        qqx qqx = (qqx) rjz.a(a, qqx.CREATOR);
        a.recycle();
        return qqx;
    }
}
