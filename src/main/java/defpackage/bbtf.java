package defpackage;

/* renamed from: bbtf */
public final class bbtf extends bbmi {
    private final bbmk a;

    public bbtf(bbmk bbmk) {
        this.a = bbmk;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bbmo bbmo) {
        bbnc bbti = new bbti(bbmo);
        bbmo.a(bbti);
        try {
            this.a.a(bbti);
        } catch (Throwable th) {
            bbnm.a(th);
            bbti.a(th);
        }
    }
}
