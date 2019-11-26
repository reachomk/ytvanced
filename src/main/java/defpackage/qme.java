package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qme */
public final class qme extends riy implements qmc {
    qme(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public final void a(qcs qcs) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        b(1, aX_);
    }

    public final void b(qcs qcs) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        b(3, aX_);
    }

    public final void c(qcs qcs) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        b(4, aX_);
    }

    public final void d(qcs qcs) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        b(5, aX_);
    }

    public final void e(qcs qcs) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        b(6, aX_);
    }

    public final void a(qcs qcs, qmg qmg) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        rjz.a(aX_, (Parcelable) qmg);
        b(7, aX_);
    }

    public final void a(qcs qcs, int i) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        aX_.writeInt(i);
        b(9, aX_);
    }

    public final void f(qcs qcs) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        b(10, aX_);
    }

    public final void g(qcs qcs) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        b(11, aX_);
    }

    public final void a(Bundle bundle) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) bundle);
        b(12, aX_);
    }
}
