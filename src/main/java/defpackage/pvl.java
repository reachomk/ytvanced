package defpackage;

import android.os.Bundle;
import java.util.Collections;

/* renamed from: pvl */
public final class pvl implements pvr {
    private final pvq a;

    public pvl(pvq pvq) {
        this.a = pvq;
    }

    public final void a(int i) {
    }

    public final void a(Bundle bundle) {
    }

    public final void a(psa psa, pso pso, boolean z) {
    }

    public final boolean b() {
        return true;
    }

    public final void a() {
        for (psw e : this.a.f.values()) {
            e.e();
        }
        this.a.m.g = Collections.emptySet();
    }

    public final pts a(pts pts) {
        this.a.m.e.add(pts);
        return pts;
    }

    public final pts b(pts pts) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void c() {
        pvq pvq = this.a;
        pvq.a.lock();
        try {
            pvq.k = new puy(pvq, pvq.h, pvq.i, pvq.d, pvq.j, pvq.a, pvq.c);
            pvq.k.a();
            pvq.b.signalAll();
        } finally {
            pvq.a.unlock();
        }
    }
}
