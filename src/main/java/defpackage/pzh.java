package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: pzh */
public final class pzh extends riy implements pze {
    public pzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean a(qby qby, qcs qcs) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) qby);
        rjz.a(aX_, (IInterface) qcs);
        Parcel a = a(5, aX_);
        boolean a2 = rjz.a(a);
        a.recycle();
        return a2;
    }
}
