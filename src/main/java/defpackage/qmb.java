package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: qmb */
public abstract class qmb extends rjn implements qmc {
    public static qmc a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        if (queryLocalInterface instanceof qmc) {
            return (qmc) queryLocalInterface;
        }
        return new qme(iBinder);
    }
}
