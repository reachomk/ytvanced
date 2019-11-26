package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: rui */
public final class rui extends riy implements ruj {
    rui(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.people.internal.IPeopleService");
    }

    public final void a(ruh ruh, boolean z, int i) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) ruh);
        rjz.a(aX_, false);
        rjz.a(aX_, z);
        aX_.writeString(null);
        aX_.writeString(null);
        aX_.writeInt(i);
        b(305, aX_);
    }

    public final Bundle a(ruh ruh) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) ruh);
        rjz.a(aX_, false);
        aX_.writeString(null);
        aX_.writeString(null);
        aX_.writeInt(0);
        Parcel a = a(11, aX_);
        Bundle bundle = (Bundle) rjz.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }
}
