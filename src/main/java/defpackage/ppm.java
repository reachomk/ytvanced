package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ppm */
public final class ppm extends riy implements ppn {
    ppm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }

    public final void a() {
        c(1, aX_());
    }

    public final void a(String str) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        c(5, aX_);
    }

    public final void b() {
        c(6, aX_());
    }

    public final void a(double d, double d2, boolean z) {
        Parcel aX_ = aX_();
        aX_.writeDouble(d);
        aX_.writeDouble(d2);
        rjz.a(aX_, z);
        c(7, aX_);
    }

    public final void a(String str, String str2, long j) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        aX_.writeString(str2);
        aX_.writeLong(j);
        c(9, aX_);
    }

    public final void b(String str) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        c(11, aX_);
    }

    public final void c(String str) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        c(12, aX_);
    }

    public final void a(String str, pjr pjr) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        rjz.a(aX_, (Parcelable) pjr);
        c(13, aX_);
    }

    public final void a(String str, String str2, pjo pjo) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        aX_.writeString(str2);
        rjz.a(aX_, (Parcelable) pjo);
        c(14, aX_);
    }
}
