package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

@qlp
/* renamed from: rkw */
public final class rkw extends qcw {
    public rkw() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final rlz a(Context context, rkz rkz, String str, qji qji, int i) {
        try {
            IBinder a = ((rme) a(context)).a(qct.a((Object) context), rkz, str, qji, i);
            if (a != null) {
                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (queryLocalInterface instanceof rlz) {
                    return (rlz) queryLocalInterface;
                }
                return new rmb(a);
            }
        } catch (RemoteException | qcv unused) {
        }
        return null;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof rme) {
            return (rme) queryLocalInterface;
        }
        return new rmd(iBinder);
    }
}
