package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: qkm */
public final class qkm extends riy implements qkj {
    qkm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    public final void a(String str) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        b(3, aX_);
    }
}
