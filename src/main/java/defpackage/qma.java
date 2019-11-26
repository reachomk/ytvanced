package defpackage;

import android.os.IBinder;
import android.os.IInterface;

@qlp
/* renamed from: qma */
public final class qma extends qcw {
    public qma() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        if (queryLocalInterface instanceof qlu) {
            return (qlu) queryLocalInterface;
        }
        return new qlt(iBinder);
    }
}
