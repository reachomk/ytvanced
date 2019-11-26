package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import java.io.IOException;

/* renamed from: pku */
final class pku implements pte, pth {
    private final /* synthetic */ pkq a;

    public final void a(Bundle bundle) {
        try {
            plw plw = this.a.g;
            if (plw != null) {
                try {
                    plw.a();
                    this.a.g.d();
                } catch (IOException e) {
                    pkq.a.a(e, "Exception when setting GoogleApiClient.", new Object[0]);
                    this.a.g = null;
                }
            }
            this.a.c.a(bundle);
        } catch (RemoteException unused) {
            pkq.a.b("Unable to call %s on %s.", "onConnected", pnw.class.getSimpleName());
        }
    }

    public final void a(int i) {
        try {
            this.a.c.a(i);
        } catch (RemoteException unused) {
            pkq.a.b("Unable to call %s on %s.", "onConnectionSuspended", pnw.class.getSimpleName());
        }
    }

    public final void a(psa psa) {
        try {
            this.a.c.a(psa);
        } catch (RemoteException unused) {
            pkq.a.b("Unable to call %s on %s.", "onConnectionFailed", pnw.class.getSimpleName());
        }
    }

    /* synthetic */ pku(pkq pkq) {
        this.a = pkq;
    }
}
