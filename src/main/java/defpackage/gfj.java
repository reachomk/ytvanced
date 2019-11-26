package defpackage;

/* renamed from: gfj */
final /* synthetic */ class gfj implements Runnable {
    private final gfg a;
    private final boolean b;
    private final boolean c;

    gfj(gfg gfg, boolean z, boolean z2) {
        this.a = gfg;
        this.b = z;
        this.c = z2;
    }

    public final void run() {
        gfg gfg = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        if (gge.a(gfg.i)) {
            gfg.k.f(z);
            if (gfg.o != z2) {
                gfg.o = z2;
                gfg.j = gfu.a(gfg, z2, gfg.j);
            }
        }
    }
}
