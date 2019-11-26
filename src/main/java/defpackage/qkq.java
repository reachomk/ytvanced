package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: qkq */
public final class qkq extends riy implements qkn {
    qkq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    public final void a(String str) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        b(3, aX_);
    }
}
