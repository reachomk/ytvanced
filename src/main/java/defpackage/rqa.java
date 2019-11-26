package defpackage;

import android.os.IBinder;
import android.os.IInterface;

@qlp
/* renamed from: rqa */
public final class rqa extends qcw {
    public rqa() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof ror) {
            return (ror) queryLocalInterface;
        }
        return new rou(iBinder);
    }
}
