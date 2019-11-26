package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

@qlp
/* renamed from: pbu */
public final class pbu extends qcw {
    private static final pbu a = new pbu();

    public static pbp a(String str, Context context, boolean z) {
        if (psh.b(context, 12800000) == 0) {
            IBinder a;
            pbu pbu = a;
            qcs a2 = qct.a((Object) context);
            pbp pbp = null;
            if (z) {
                try {
                    a = ((pbw) pbu.a(context)).a(str, a2);
                } catch (RemoteException | qcv unused) {
                }
            } else {
                a = ((pbw) pbu.a(context)).b(str, a2);
            }
            if (a != null) {
                IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
                pbp = queryLocalInterface instanceof pbp ? (pbp) queryLocalInterface : new pbt(a);
            }
            if (pbp != null) {
                return pbp;
            }
        }
        return new pbr(str, context, z);
    }

    private pbu() {
        super("com.google.android.gms.ads.adshield.AdShieldCreatorImpl");
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
        if (queryLocalInterface instanceof pbw) {
            return (pbw) queryLocalInterface;
        }
        return new pbv(iBinder);
    }
}
