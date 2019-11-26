package defpackage;

import android.os.IBinder;
import android.os.IInterface;

@qlp
/* renamed from: qle */
public final class qle extends qcw {
    public qle() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof qlf) {
            return (qlf) queryLocalInterface;
        }
        return new qli(iBinder);
    }
}
