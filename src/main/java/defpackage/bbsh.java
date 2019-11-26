package defpackage;

/* renamed from: bbsh */
public final class bbsh extends bbrh {
    private final bbmn b;

    public bbsh(bbmg bbmg, bbmn bbmn) {
        super(bbmg);
        this.b = bbmn;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bbmd bbmd) {
        bbsk bbsk = new bbsk(bbmd);
        bbmd.a(bbsk);
        bbnz.c(bbsk.a, this.b.a(new bbsj(bbsk, this.a)));
    }
}
