package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicBoolean;

@qlp
/* renamed from: rnd */
public final class rnd {
    public final qjf a = new qjf();
    public final pbl b = new pbl();
    public final rlm c = new rng(this);
    public rks d;
    public pbi[] e;
    public pca f;
    public rlz g;
    public String h;
    public final ViewGroup i;

    public rnd(ViewGroup viewGroup) {
        this.i = viewGroup;
        this.g = null;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
    }

    public final rmt a() {
        rlz rlz = this.g;
        if (rlz != null) {
            try {
                return rlz.r();
            } catch (RemoteException e) {
                qml.c("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    public static rkz a(Context context, pbi[] pbiArr) {
        rkz rkz = new rkz(context, pbiArr);
        rkz.d = false;
        return rkz;
    }
}
