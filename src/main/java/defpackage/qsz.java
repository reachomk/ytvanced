package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qsz */
public final class qsz extends riy implements qta {
    qsz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void a(int i) {
        Parcel aX_ = aX_();
        aX_.writeInt(i);
        b(7, aX_);
    }

    public final void a(pyy pyy, int i, boolean z) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) pyy);
        aX_.writeInt(i);
        rjz.a(aX_, z);
        b(9, aX_);
    }

    public final void a(qtb qtb, qsy qsy) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) qtb);
        rjz.a(aX_, (IInterface) qsy);
        b(12, aX_);
    }
}
