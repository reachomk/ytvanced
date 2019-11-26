package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: qgi */
public final class qgi extends riy implements qgj {
    qgi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
    }

    public final void a(GoogleHelp googleHelp, Bitmap bitmap, qgh qgh) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) googleHelp);
        rjz.a(aX_, null);
        rjz.a(aX_, (IInterface) qgh);
        b(2, aX_);
    }

    public final void a(Bundle bundle, long j, GoogleHelp googleHelp, qgh qgh) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) bundle);
        aX_.writeLong(j);
        rjz.a(aX_, (Parcelable) googleHelp);
        rjz.a(aX_, (IInterface) qgh);
        c(8, aX_);
    }

    public final void b(Bundle bundle, long j, GoogleHelp googleHelp, qgh qgh) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) bundle);
        aX_.writeLong(j);
        rjz.a(aX_, (Parcelable) googleHelp);
        rjz.a(aX_, (IInterface) qgh);
        c(9, aX_);
    }

    public final void a(qdx qdx, Bundle bundle, long j, GoogleHelp googleHelp, qgh qgh) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) qdx);
        rjz.a(aX_, (Parcelable) bundle);
        aX_.writeLong(j);
        rjz.a(aX_, (Parcelable) googleHelp);
        rjz.a(aX_, (IInterface) qgh);
        c(10, aX_);
    }
}
