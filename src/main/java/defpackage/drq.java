package defpackage;

/* renamed from: drq */
final /* synthetic */ class drq implements xar {
    private final dro a;

    drq(dro dro) {
        this.a = dro;
    }

    public final void accept(Object obj) {
        dro dro = this.a;
        aybe aybe = (aybe) ajzv.a(((ajvu) obj).a, aybe.class);
        if (aybe != null && (aybe.a & 16) != 0 && dro.ai.c() == ejd.WATCH_WHILE_MAXIMIZED) {
            fcb fcb = dro.ag;
            aybc aybc = aybe.e;
            if (aybc == null) {
                aybc = aybc.f;
            }
            fcb.a(aybc);
        }
    }
}
