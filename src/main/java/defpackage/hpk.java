package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: hpk */
public final class hpk {
    private final eki a;
    private final bcaa b;

    public hpk(eki eki, bcaa bcaa) {
        this.a = eki;
        this.b = bcaa;
    }

    public final amul a() {
        try {
            anjv a;
            if (this.a.c()) {
                a = anja.c(((agwc) this.b.get()).b().k().d()).a(hpn.a, aniv.a);
            } else {
                a = anjf.a(amul.g());
            }
            return (amul) a.get();
        } catch (InterruptedException | ExecutionException e) {
            xtl.a("Exception when trying to fetch single video snapshots", e);
            return amul.g();
        }
    }

    public final amul b() {
        try {
            anjv a;
            if (this.a.d()) {
                a = anja.c(((agwc) this.b.get()).b().n().b()).a(hpm.a, aniv.a);
            } else {
                a = anjf.a(amul.g());
            }
            return (amul) a.get();
        } catch (InterruptedException | ExecutionException e) {
            xtl.a("Exception when trying to fetch playlist snapshots", e);
            return amul.g();
        }
    }

    public final amul c() {
        try {
            anjv a;
            if (this.a.f()) {
                a = anja.c(((agwc) this.b.get()).b().o().c(hpr.b)).a(hpp.a, aniv.a);
            } else {
                a = anjf.a(amul.g());
            }
            return (amul) a.get();
        } catch (InterruptedException | ExecutionException e) {
            xtl.a("Exception when trying to fetch recs video snapshots", e);
            return amul.g();
        }
    }
}
