package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;

/* renamed from: puw */
public final class puw implements pvr {
    public final pvq a;
    private boolean b = false;

    public puw(pvq pvq) {
        this.a = pvq;
    }

    public final void a() {
    }

    public final void a(Bundle bundle) {
    }

    public final void a(psa psa, pso pso, boolean z) {
    }

    public final void c() {
    }

    public final pts a(pts pts) {
        return b(pts);
    }

    public final pts b(pts pts) {
        try {
            this.a.m.h.a(pts);
            pvk pvk = this.a.m;
            psp psp = (psw) pvk.f.get(pts.b);
            pzr.a((Object) psp, (Object) "Appropriate Api was not requested.");
            if (psp.i() || !this.a.g.containsKey(pts.b)) {
                if (psp instanceof pzx) {
                    psp = pzx.d();
                }
                pts.b(psp);
                return pts;
            }
            pts.b(new Status(17));
            return pts;
        } catch (DeadObjectException unused) {
            this.a.a(new puz(this, this));
        }
    }

    public final boolean b() {
        pvk pvk = this.a.m;
        pvk.b.lock();
        pvk.b.unlock();
        this.a.a(null);
        return true;
    }

    public final void a(int i) {
        this.a.a(null);
        this.a.n.a(i, false);
    }
}
