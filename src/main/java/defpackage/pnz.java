package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: pnz */
public final class pnz extends riy implements pnw {
    public pnz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    public final void a(Bundle bundle) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) bundle);
        b(1, aX_);
    }

    public final void a(int i) {
        Parcel aX_ = aX_();
        aX_.writeInt(i);
        b(2, aX_);
    }

    public final void a(psa psa) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) psa);
        b(3, aX_);
    }

    public final void a(pjb pjb, String str, String str2, boolean z) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) pjb);
        aX_.writeString(str);
        aX_.writeString(str2);
        rjz.a(aX_, z);
        b(4, aX_);
    }

    public final void b(int i) {
        Parcel aX_ = aX_();
        aX_.writeInt(i);
        b(5, aX_);
    }

    public final void a(boolean z) {
        Parcel aX_ = aX_();
        rjz.a(aX_, z);
        aX_.writeInt(0);
        b(6, aX_);
    }
}
