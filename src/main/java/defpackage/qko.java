package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: qko */
public final class qko extends riy implements qkl {
    qko(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    public final void a(String str) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        b(2, aX_);
    }
}
