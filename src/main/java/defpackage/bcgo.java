package defpackage;

import android.content.ComponentName;
import android.os.RemoteException;

/* renamed from: bcgo */
final class bcgo extends auf {
    private final /* synthetic */ bcgl a;

    bcgo(bcgl bcgl) {
        this.a = bcgl;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        bcgn.a("CustomTabsService is disconnected", new Object[0]);
        b(null);
    }

    public final void a(aub aub) {
        bcgn.a("CustomTabsService is connected", new Object[0]);
        try {
            aub.a.a();
        } catch (RemoteException unused) {
        }
        b(aub);
    }

    private final void b(aub aub) {
        this.a.a.set(aub);
        this.a.b.countDown();
    }
}
