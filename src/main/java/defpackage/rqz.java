package defpackage;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rqz */
public final class rqz extends riy implements rqw {
    rqz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    public final void a(rrj rrj) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) rrj);
        b(59, aX_);
    }

    public final Location a(String str) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        Parcel a = a(21, aX_);
        Location location = (Location) rjz.a(a, Location.CREATOR);
        a.recycle();
        return location;
    }

    public final void a(rrr rrr) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) rrr);
        b(75, aX_);
    }
}
