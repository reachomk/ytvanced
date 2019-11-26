package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: qkk */
public final class qkk extends riy implements qkh {
    qkk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    public final void a(String str) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        b(2, aX_);
    }
}
