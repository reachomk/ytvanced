package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: hpd */
public final class hpd {
    public final eki a;
    public final bcaa b;
    public final Executor c;
    public final ExecutorService d;

    public hpd(eki eki, bcaa bcaa, Executor executor, ExecutorService executorService) {
        this.a = eki;
        this.b = bcaa;
        this.c = executor;
        this.d = executorService;
    }

    public final Future a(wxg wxg) {
        return this.d.submit(new hpc(this, wxg));
    }

    public final Future a(String str, wxg wxg) {
        return this.d.submit(new hpi(this, str, wxg));
    }

    public final agvx a() {
        return ((agwc) this.b.get()).b().n();
    }
}
