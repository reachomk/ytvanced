package defpackage;

import android.os.IBinder;
import android.os.IInterface;

@qlp
/* renamed from: rpz */
public final class rpz extends qcw {
    public rpz() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof rot) {
            return (rot) queryLocalInterface;
        }
        return new row(iBinder);
    }
}
