package defpackage;

/* renamed from: bbqc */
public final class bbqc extends bblt {
    private final bbnp a;

    public bbqc(bbnp bbnp) {
        this.a = bbnp;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(bblv bblv) {
        bbnc a = bbnb.a();
        bblv.a(a);
        try {
            this.a.a();
            if (!a.c()) {
                bblv.bL_();
            }
        } catch (Throwable th) {
            bbnm.a(th);
            if (!a.c()) {
                bblv.a_(th);
            }
        }
    }
}
