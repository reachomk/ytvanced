package defpackage;

import android.os.IBinder;
import android.os.IInterface;

@qlp
/* renamed from: rni */
public final class rni extends qcw {
    public rni() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        if (queryLocalInterface instanceof rmq) {
            return (rmq) queryLocalInterface;
        }
        return new rmp(iBinder);
    }
}
