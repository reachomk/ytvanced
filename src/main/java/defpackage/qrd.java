package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: qrd */
public final class qrd extends qae {
    public qrd(Context context, Looper looper, pyp pyp, pte pte, pth pth) {
        super(context, looper, 50, pyp, pte, pth);
    }

    /* Access modifiers changed, original: protected|final */
    public final String a() {
        return "com.google.android.gms.herrevad.services.LightweightNetworkQualityAndroidService.START";
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return "com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService";
    }

    public final int c() {
        return 12800000;
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.herrevad.internal.ILightweightNetworkQualityService");
        if (queryLocalInterface instanceof qrb) {
            return (qrb) queryLocalInterface;
        }
        return new qre(iBinder);
    }
}
