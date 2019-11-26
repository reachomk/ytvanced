package defpackage;

import android.os.IBinder;
import android.os.IInterface;

@qlp
/* renamed from: rkt */
public final class rkt extends qcw {
    public rkt() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        if (queryLocalInterface instanceof rlx) {
            return (rlx) queryLocalInterface;
        }
        return new rma(iBinder);
    }
}
