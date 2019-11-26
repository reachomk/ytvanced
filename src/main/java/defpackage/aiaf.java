package defpackage;

/* renamed from: aiaf */
final class aiaf implements ahzz {
    private final /* synthetic */ aiac a;

    public final void b() {
        aiac aiac = this.a;
        if (aiac.o) {
            aiac.k[aiac.l] = true;
            aiac.a(true, true, 0);
        }
    }

    public final void a() {
        aiac aiac = this.a;
        aovq aovq = aiac.m;
        if (aovq != null && (aovq.a & 64) != 0) {
            aaas aaas = aiac.b;
            apxu apxu = aovq.g;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
    }

    public final void c() {
        aiac aiac = this.a;
        int i = aiac.l;
        if (i >= 0) {
            aiac.j[i] = true;
        }
        aovq aovq = aiac.m;
        if (aovq != null) {
            aiac.d.a(aovq.k);
        }
        this.a.a(true);
        aiac = this.a;
        aiac.c.postDelayed(aiac.s, 500);
    }

    public final void d() {
        aiac aiac = this.a;
        if (aiac.o) {
            int i = aiac.l;
            if (i >= 0) {
                aiac.j[i] = true;
            }
            aiac.a(false);
        }
    }

    /* synthetic */ aiaf(aiac aiac) {
        this.a = aiac;
    }
}
