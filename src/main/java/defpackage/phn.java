package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: phn */
public final class phn extends riy implements pho {
    phn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
    }

    public final void a(phq phq, anmv[] anmvArr) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) phq);
        aX_.writeTypedArray(anmvArr, 0);
        b(7, aX_);
    }
}
