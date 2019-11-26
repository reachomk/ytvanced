package defpackage;

/* renamed from: pgj */
final class pgj implements Runnable {
    private final /* synthetic */ pfi a;
    private final /* synthetic */ pgk b;

    pgj(pgk pgk, pfi pfi) {
        this.b = pgk;
        this.a = pfi;
    }

    public final void run() {
        if (!this.b.c.b()) {
            this.b.c.b(3, "Connected to service after a timeout", null, null, null);
            pgi pgi = this.b.c;
            pfi pfi = this.a;
            pgv.a();
            pgi.b = pfi;
            pgi.c();
            pfh m = pgi.m();
            pgv.a();
            m.a.b();
        }
    }
}
