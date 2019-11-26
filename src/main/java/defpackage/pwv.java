package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: pwv */
abstract class pwv extends pwi {
    public final ryl a;

    public pwv(int i, ryl ryl) {
        this.a = ryl;
    }

    public void a(puq puq, boolean z) {
    }

    public abstract void d(ptx ptx);

    public void a(Status status) {
        this.a.b(new psx(status));
    }

    public void a(RuntimeException runtimeException) {
        this.a.b((Exception) runtimeException);
    }

    public final void a(ptx ptx) {
        try {
            d(ptx);
        } catch (DeadObjectException e) {
            a(pvm.a(e));
            throw e;
        } catch (RemoteException e2) {
            a(pvm.a(e2));
        } catch (RuntimeException e3) {
            a(e3);
        }
    }
}
