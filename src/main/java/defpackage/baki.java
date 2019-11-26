package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: baki */
public final class baki extends dhu implements bakj {
    public baki(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.logging.api.IVrCoreLoggingService");
    }

    public final void a(bakl bakl) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) bakl);
        c(2, aK_);
    }
}
