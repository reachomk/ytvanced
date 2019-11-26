package defpackage;

import android.os.RemoteException;
import java.util.Collections;

/* renamed from: pgi */
public final class pgi extends pgb {
    public final pgk a = new pgk(this);
    public pfi b;
    private final pex c;
    private final pfv d;

    protected pgi(pgd pgd) {
        super(pgd);
        this.d = new pfv(pgd.c);
        this.c = new pgh(this, pgd);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
    }

    public final boolean b() {
        pgv.a();
        f();
        return this.b != null;
    }

    public final boolean a(pff pff) {
        pzr.a((Object) pff);
        pgv.a();
        f();
        pfi pfi = this.b;
        if (pfi != null) {
            String f;
            if (pff.d) {
                f = pev.f();
            } else {
                f = pev.g();
            }
            try {
                pfi.a(pff.a, pff.c, f, Collections.emptyList());
                c();
                return true;
            } catch (RemoteException unused) {
                a("Failed to send hits to AnalyticsService");
            }
        }
        return false;
    }

    public final void c() {
        this.d.a();
        this.c.a(((Long) pel.x.a).longValue());
    }

    public final void d() {
        pgv.a();
        f();
        try {
            qar.a();
            i().unbindService(this.a);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.b != null) {
            this.b = null;
            m().b();
        }
    }
}
