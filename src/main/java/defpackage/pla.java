package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* renamed from: pla */
public abstract class pla {
    public static final pon i = new pon("Session");
    private final plc a = new plc(this);
    public final poc j;

    protected pla(Context context, String str, String str2) {
        poc a;
        try {
            a = qnh.a(context).a(str, str2, this.a);
        } catch (RemoteException unused) {
            qnh.a.b("Unable to call %s on %s.", "newSessionImpl", qnm.class.getSimpleName());
            a = null;
        }
        this.j = a;
    }

    /* Access modifiers changed, original: protected */
    public void a(Bundle bundle) {
    }

    public abstract void a(boolean z);

    /* Access modifiers changed, original: protected */
    public void b(Bundle bundle) {
    }

    public long c() {
        throw null;
    }

    public abstract void c(Bundle bundle);

    public abstract void d(Bundle bundle);

    public final boolean d() {
        pzr.b("Must be called from the main thread.");
        try {
            return this.j.b();
        } catch (RemoteException unused) {
            i.b("Unable to call %s on %s.", "isConnected", poc.class.getSimpleName());
            return false;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(int i) {
        try {
            this.j.a(i);
        } catch (RemoteException unused) {
            i.b("Unable to call %s on %s.", "notifySessionEnded", poc.class.getSimpleName());
        }
    }

    public final qcs e() {
        try {
            return this.j.a();
        } catch (RemoteException unused) {
            i.b("Unable to call %s on %s.", "getWrappedObject", poc.class.getSimpleName());
            return null;
        }
    }
}
