package defpackage;

/* renamed from: afqx */
final class afqx implements Runnable {
    private final /* synthetic */ afqs a;
    private final /* synthetic */ afqv b;

    afqx(afqv afqv, afqs afqs) {
        this.b = afqv;
        this.a = afqs;
    }

    public final void run() {
        this.b.a.a(this.a);
        if (this.b.b.c()) {
            this.b.a.a();
        } else if (this.b.c.a()) {
            this.b.d.f.a("ping_flush_one_off", afrd.a, afrd.b - afrd.a, false, 1, false, null, afrd.h, true, false);
        }
    }
}
