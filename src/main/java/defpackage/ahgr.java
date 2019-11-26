package defpackage;

/* renamed from: ahgr */
final class ahgr implements aitn {
    private final /* synthetic */ ahgn a;

    ahgr(ahgn ahgn) {
        this.a = ahgn;
    }

    public final void a() {
        Runnable runnable = this.a.k;
        if (runnable != null) {
            runnable.run();
            this.a.k = null;
        }
    }

    public final void b() {
        if (!aipo.h(this.a.f)) {
            this.a.r = false;
        }
    }
}
