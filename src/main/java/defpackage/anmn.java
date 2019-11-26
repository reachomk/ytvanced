package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: anmn */
public final class anmn extends riy implements anmk {
    anmn(IBinder iBinder) {
        super(iBinder, "com.google.firebase.appindexing.internal.IAppIndexingService");
    }

    public final anmy a(puc puc, anmo anmo) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) puc);
        rjz.a(aX_, (Parcelable) anmo);
        Parcel a = a(8, aX_);
        anmy anmy = (anmy) rjz.a(a, anmy.CREATOR);
        a.recycle();
        return anmy;
    }
}
