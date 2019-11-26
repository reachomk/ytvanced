package defpackage;

/* renamed from: bbre */
public final class bbre extends bbqu {
    private final bbnv c;

    public bbre(bbmc bbmc, bbnv bbnv) {
        super(bbmc);
        this.c = bbnv;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(bcto bcto) {
        if (bcto instanceof bboy) {
            this.b.a(new bbrd((bboy) bcto, this.c));
        } else {
            this.b.a(new bbrg(bcto, this.c));
        }
    }
}
