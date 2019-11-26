package defpackage;

/* renamed from: brq */
final class brq implements ceq {
    private final cfd a;
    private final /* synthetic */ brl b;

    brq(brl brl, cfd cfd) {
        this.b = brl;
        this.a = cfd;
    }

    public final void a(boolean z) {
        if (z) {
            synchronized (this.b) {
                cfd cfd = this.a;
                for (cfz cfz : chv.a(cfd.a)) {
                    if (!(cfz.d() || cfz.f())) {
                        cfz.b();
                        if (cfd.c) {
                            cfd.b.add(cfz);
                        } else {
                            cfz.a();
                        }
                    }
                }
            }
        }
    }
}
