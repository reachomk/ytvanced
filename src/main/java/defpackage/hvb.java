package defpackage;

/* renamed from: hvb */
final /* synthetic */ class hvb implements bcvk {
    private final huz a;

    hvb(huz huz) {
        this.a = huz;
    }

    public final void a(Object obj) {
        huz huz = this.a;
        ahkn ahkn = (ahkn) obj;
        aakj aakj = ahkn.b;
        if (aakj != null && ahkn.a == airi.PLAYBACK_LOADED) {
            for (apxu a : aakj.a.u) {
                huz.a.a(a, null);
            }
        }
    }
}
