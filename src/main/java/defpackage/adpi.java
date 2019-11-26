package defpackage;

/* renamed from: adpi */
final /* synthetic */ class adpi implements bcvk {
    private final adpg a;

    adpi(adpg adpg) {
        this.a = adpg;
    }

    public final void a(Object obj) {
        adpg adpg = this.a;
        ahkn ahkn = (ahkn) obj;
        if (ahkn.a.a(airi.NEW, airi.PLAYBACK_LOADED)) {
            adit s = adpg.a.k.s();
            if (ahkn.a == airi.NEW) {
                s.b(false);
                s.c(false);
                s.d(false);
                s.e(false);
            } else {
                s.a(adiw.WATCH);
                s.g(ahkn.b.h());
                s.a(ahkn.b.b());
                adpc adpc = adpg.a;
                if (!adpc.m) {
                    s.h(adpc.k.n() + 1);
                }
                s.a(adpg.a.i.a());
            }
            adpg.a.l.e_(s.a());
        }
    }
}
