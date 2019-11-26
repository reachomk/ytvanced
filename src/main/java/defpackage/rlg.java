package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: rlg */
public final class rlg extends rlk {
    private final /* synthetic */ Activity a;
    private final /* synthetic */ rle b;

    public rlg(rle rle, Activity activity) {
        this.b = rle;
        this.a = activity;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a() {
        rle.a(this.a, "ad_overlay");
        return null;
    }

    public final /* synthetic */ Object b() {
        String str = "Could not create remote AdOverlay.";
        qle qle = this.b.c;
        Context context = this.a;
        try {
            IBinder a = ((qlf) qle.a(context)).a(qct.a((Object) context));
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof qld) {
                return (qld) queryLocalInterface;
            }
            return new qlg(a);
        } catch (RemoteException e) {
            qml.b(str, e);
            return null;
        } catch (qcv e2) {
            qml.b(str, e2);
            return null;
        }
    }

    public final /* synthetic */ Object a(rmm rmm) {
        return rmm.a(qct.a(this.a));
    }
}
