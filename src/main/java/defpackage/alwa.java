package defpackage;

/* renamed from: alwa */
final class alwa extends udg {
    private final /* synthetic */ alxs b;
    private final /* synthetic */ alwb c;

    alwa(alwb alwb, alxs alxs) {
        this.c = alwb;
        this.b = alxs;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(bcfe bcfe) {
        int i = this.b.b;
        boolean z = false;
        if (!(bcfe == null || (bcfe.a & 64) == 0)) {
            z = true;
        }
        alwi alwi = new alwi(i, bcfe, z);
        if (alwi.c) {
            this.c.b.c(alwi);
        } else {
            this.c.b.d(alwi);
        }
    }
}
