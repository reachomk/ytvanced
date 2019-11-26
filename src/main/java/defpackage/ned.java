package defpackage;

import android.os.RemoteException;

/* renamed from: ned */
final class ned implements mtz {
    private final /* synthetic */ ndt a;

    public final void a(boolean z) {
        if (this.a.d()) {
            ndt ndt = this.a;
            boolean z2 = false;
            try {
                z2 = ndt.a.h();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
            ndt.H = z2;
            this.a.p.a(z);
        }
    }

    public final void b(boolean z) {
        if (this.a.d()) {
            this.a.p.b(z);
        }
    }

    public final void a() {
        this.a.a(true);
    }

    public final void b() {
        ndt ndt = this.a;
        if (ndt.d()) {
            try {
                ndt.a.k();
                return;
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
                return;
            }
        }
        ammj.a("Service was disconnected", new Object[0]);
    }

    /* synthetic */ ned(ndt ndt) {
        this.a = ndt;
    }
}
