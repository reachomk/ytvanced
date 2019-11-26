package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;

/* renamed from: hgv */
public final class hgv implements ebj, t, xcp {
    private final fjg a;
    private final eif b;
    private final eld c;
    private final zyw d;
    private final aizy e;
    private final lud f;
    private final jle g;
    private final xci h;
    private final ajam i;
    private bcuo j;
    private volatile int k = 0;

    public hgv(fjg fjg, eif eif, eld eld, zyw zyw, aizy aizy, lud lud, jle jle, xci xci, ajam ajam) {
        this.a = fjg;
        this.b = eif;
        this.c = eld;
        this.d = zyw;
        this.e = aizy;
        this.f = lud;
        this.g = jle;
        this.h = xci;
        this.i = ajam;
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void a(boolean z) {
        if (z) {
            this.g.c(false);
            return;
        }
        boolean z2 = true;
        this.g.c(true);
        if (this.a.a() != null) {
            this.a.k();
            gub gub;
            if (this.a.b() instanceof gub) {
                gub = (gub) this.a.b();
                if (gub.F_() && gub.z() != null && gub.ak()) {
                    gub.z().postDelayed(new hgu(gub), 50);
                }
            } else if (this.a.b() instanceof gwd) {
                gwd gwd = (gwd) this.a.b();
                if (gwd.F_() && gwd.K != null && gwd.ak()) {
                    gwd.K.postDelayed(new hgx(gwd), 50);
                }
            } else if (this.a.b() instanceof gwl) {
                gub = (gub) ((gwl) this.a.b()).ak();
                if (gub != null && gub.F_() && gub.z() != null && gub.ak()) {
                    View z3 = gub.z();
                    gub.getClass();
                    z3.postDelayed(new gwm(gub), 50);
                }
            }
            if (this.b.c().b()) {
                if (!(this.k == 8 || this.k == 4)) {
                    z2 = false;
                }
                lui lui;
                if (this.b.c().b() && z2) {
                    lui = this.f.a;
                    if (lui == null || lui.k() != 2) {
                        this.c.d();
                        this.e.b();
                        return;
                    }
                    this.e.d();
                    this.e.b();
                    return;
                }
                apxn a = this.d.a();
                if (a != null) {
                    aulu aulu = a.e;
                    if (aulu == null) {
                        aulu = aulu.bw;
                    }
                    if (aulu.bn) {
                        lui = this.f.a;
                        if (!(lui == null || lui.l() == null)) {
                            aafv e = this.f.a.l().e();
                            if (e != null) {
                                apxu apxu = e.c;
                                if (apxu != null) {
                                    anxr access$000 = anxl.checkIsLite(OfflineWatchEndpointOuterClass.offlineWatchEndpoint);
                                    apxu.a(access$000);
                                    if (apxu.h.a(access$000.d)) {
                                        this.e.e();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void B_() {
        if (foh.x(this.d)) {
            this.j = this.i.Q().d.f().a(emg.a(this.d, 8589934592L)).a(new hgw(this), hgz.a);
        } else {
            this.h.a((Object) this);
        }
    }

    public final void C_() {
        if (foh.x(this.d)) {
            this.j.b();
            this.j = null;
            return;
        }
        this.h.b(this);
    }

    public final void a(ahkr ahkr) {
        this.k = ahkr.a;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkr.class};
        } else if (i == 0) {
            a((ahkr) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
