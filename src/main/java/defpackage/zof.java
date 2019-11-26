package defpackage;

/* renamed from: zof */
final /* synthetic */ class zof implements Runnable {
    private final zoe a;

    zof(zoe zoe) {
        this.a = zoe;
    }

    public final void run() {
        zoe zoe = this.a;
        if (zoe.a.c() != null) {
            zoq zoq = zoe.c;
            if (zoq != null) {
                boolean z = false;
                if (zoe.b && zoe.a.c().f()) {
                    z = true;
                }
                zoq.a(Boolean.valueOf(z));
            }
        }
    }
}
