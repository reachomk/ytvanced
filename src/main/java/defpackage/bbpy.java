package defpackage;

/* renamed from: bbpy */
public final class bbpy extends bblt {
    private final bbly a;

    public bbpy(bbly bbly) {
        this.a = bbly;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(bblv bblv) {
        bbpx bbpx = new bbpx(bblv);
        bblv.a(bbpx);
        try {
            this.a.a(bbpx);
        } catch (Throwable th) {
            bbnm.a(th);
            bbpx.a(th);
        }
    }
}
