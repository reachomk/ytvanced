package defpackage;

import android.content.Intent;
import android.os.RemoteException;

/* renamed from: tdf */
public final class tdf extends tck {
    tdf(plb plb) {
        super(plb);
    }

    public final void a(Intent intent) {
        this.a.a(intent);
    }

    public final /* synthetic */ void b(tch tch) {
        this.b.remove(tch);
        if (this.b.isEmpty()) {
            plb plb = this.a;
            ple ple = this.c;
            Object obj = pkq.class;
            pzr.a(obj);
            pzr.b("Must be called from the main thread.");
            if (ple != null) {
                try {
                    plb.b.b(new pno(ple, obj));
                } catch (RemoteException unused) {
                    plb.a.b("Unable to call %s on %s.", "removeSessionManagerListener", poe.class.getSimpleName());
                }
            }
        }
    }
}
