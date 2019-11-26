package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: pts */
public abstract class pts extends BasePendingResult implements ptu {
    public final pss b;
    public final pso c;

    protected pts(pso pso, ptd ptd) {
        super((ptd) pzr.a((Object) ptd, (Object) "GoogleApiClient must not be null"));
        pzr.a((Object) pso, (Object) "Api must not be null");
        this.b = pso.b();
        this.c = pso;
    }

    public abstract void a(psp psp);

    public final void b(psp psp) {
        if (psp instanceof pzx) {
            psp = pzx.d();
        }
        try {
            a(psp);
        } catch (DeadObjectException e) {
            a(e);
            throw e;
        } catch (RemoteException e2) {
            a(e2);
        }
    }

    public final void b(Status status) {
        pzr.b(status.b() ^ 1, "Failed result must not be success");
        a(a(status));
    }

    private final void a(RemoteException remoteException) {
        b(new Status(8, remoteException.getLocalizedMessage(), null));
    }
}
