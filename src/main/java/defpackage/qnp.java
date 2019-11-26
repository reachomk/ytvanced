package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qnp */
public final class qnp extends riy implements qnq {
    qnp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
    }

    public final void a(String str, Bundle bundle) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        rjz.a(aX_, (Parcelable) bundle);
        b(1, aX_);
    }

    public final void b(String str, Bundle bundle) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        rjz.a(aX_, (Parcelable) bundle);
        b(2, aX_);
    }

    public final void c(String str, Bundle bundle) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        rjz.a(aX_, (Parcelable) bundle);
        b(3, aX_);
    }

    public final void d(String str, Bundle bundle) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        rjz.a(aX_, (Parcelable) bundle);
        b(4, aX_);
    }

    public final void a(String str, Bundle bundle, int i) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        rjz.a(aX_, (Parcelable) bundle);
        aX_.writeInt(i);
        b(6, aX_);
    }
}
