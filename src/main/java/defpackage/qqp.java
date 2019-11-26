package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.ErrorReport;

/* renamed from: qqp */
public final class qqp extends riy implements qqq {
    qqp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.feedback.internal.IFeedbackService");
    }

    public final boolean a(ErrorReport errorReport) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) errorReport);
        Parcel a = a(1, aX_);
        boolean a2 = rjz.a(a);
        a.recycle();
        return a2;
    }

    public final boolean b(ErrorReport errorReport) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) errorReport);
        Parcel a = a(3, aX_);
        boolean a2 = rjz.a(a);
        a.recycle();
        return a2;
    }

    public final void a(Bundle bundle, long j) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) bundle);
        aX_.writeLong(j);
        b(4, aX_);
    }

    public final void a(qdx qdx, Bundle bundle, long j) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) qdx);
        rjz.a(aX_, (Parcelable) bundle);
        aX_.writeLong(j);
        b(5, aX_);
    }

    public final void a(ErrorReport errorReport, long j) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) errorReport);
        aX_.writeLong(j);
        c(6, aX_);
    }

    public final boolean a(qdx qdx) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) qdx);
        Parcel a = a(7, aX_);
        boolean a2 = rjz.a(a);
        a.recycle();
        return a2;
    }
}
