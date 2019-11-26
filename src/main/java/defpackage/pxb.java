package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: pxb */
public final class pxb extends pwi {
    private final pup a;
    private final ryl b;
    private final pun c;

    public pxb(int i, pup pup, ryl ryl, pun pun) {
        this.b = ryl;
        this.a = pup;
        this.c = pun;
    }

    public final boolean c(ptx ptx) {
        return false;
    }

    public final void a(ptx ptx) {
        try {
            this.a.a(ptx.b, this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(pvm.a(e2));
        } catch (RuntimeException e3) {
            a(e3);
        }
    }

    public final void a(Status status) {
        this.b.b(this.c.a(status));
    }

    public final void a(RuntimeException runtimeException) {
        this.b.b((Exception) runtimeException);
    }

    public final void a(puq puq, boolean z) {
        ryl ryl = this.b;
        puq.b.put(ryl, Boolean.valueOf(z));
        ryl.a.a(new pus(puq, ryl));
    }

    public final psc[] b(ptx ptx) {
        return this.a.a();
    }
}
