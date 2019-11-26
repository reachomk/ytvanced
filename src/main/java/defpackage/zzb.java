package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: zzb */
final class zzb implements Runnable {
    private final /* synthetic */ zyz a;

    zzb(zyz zyz) {
        this.a = zyz;
    }

    public final void run() {
        this.a.f.b = true;
        try {
            if (((Boolean) this.a.e.get()).booleanValue() || this.a.d != 0) {
                zyz zyz = this.a;
                zyz.g.a(zyz.d, ((Boolean) this.a.e.get()).booleanValue());
            }
            this.a.f.b();
        } catch (InterruptedException | ExecutionException unused) {
            afpc.a(2, afpf.initialization, "Failed to log the configuration reset");
        }
    }
}
