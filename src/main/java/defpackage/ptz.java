package defpackage;

import android.util.Log;
import java.util.Set;

/* renamed from: ptz */
final class ptz implements pwo, pye {
    public final psw a;
    public final pxd b;
    public boolean c = false;
    public final /* synthetic */ pty d;
    private pyy e = null;
    private Set f = null;

    public ptz(pty pty, psw psw, pxd pxd) {
        this.d = pty;
        this.a = psw;
        this.b = pxd;
    }

    public final void a(psa psa) {
        this.d.m.post(new pwa(this, psa));
    }

    public final void b(psa psa) {
        ptx ptx = (ptx) this.d.j.get(this.b);
        pzr.a(ptx.h.m);
        ptx.b.e();
        ptx.a(psa);
    }

    public final void a(pyy pyy, Set set) {
        if (pyy == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new psa(4));
            return;
        }
        this.e = pyy;
        this.f = set;
        a();
    }

    public final void a() {
        if (this.c) {
            pyy pyy = this.e;
            if (pyy != null) {
                this.a.a(pyy, this.f);
            }
        }
    }
}
