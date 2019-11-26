package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: poh */
public final class poh extends riy implements poe {
    poh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    public final qcs a() {
        Parcel a = a(1, aX_());
        qcs a2 = qcr.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void a(pog pog) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) pog);
        b(2, aX_);
    }

    public final void b(pog pog) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) pog);
        b(3, aX_);
    }

    public final void a(boolean z) {
        Parcel aX_ = aX_();
        rjz.a(aX_, true);
        rjz.a(aX_, z);
        b(6, aX_);
    }

    public final qcs b() {
        Parcel a = a(7, aX_());
        qcs a2 = qcr.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void a(Bundle bundle) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) bundle);
        b(9, aX_);
    }
}
