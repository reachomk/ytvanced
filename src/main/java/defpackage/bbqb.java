package defpackage;

/* renamed from: bbqb */
public final class bbqb extends bblt {
    private final Runnable a;

    public bbqb(Runnable runnable) {
        this.a = runnable;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(bblv bblv) {
        bbnc a = bbnb.a();
        bblv.a(a);
        try {
            this.a.run();
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
