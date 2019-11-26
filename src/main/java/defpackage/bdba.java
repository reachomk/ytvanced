package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bdba */
final class bdba extends bcue implements bcuo {
    private final bdfs a = new bdfs();

    bdba() {
    }

    public final bcuo a(bcvl bcvl, long j, TimeUnit timeUnit) {
        return a(new bdbl(bcvl, this, System.currentTimeMillis() + timeUnit.toMillis(j)));
    }

    public final bcuo a(bcvl bcvl) {
        bcvl.a();
        return bdfz.a;
    }

    public final void b() {
        this.a.b();
    }

    public final boolean c() {
        return this.a.c();
    }
}
