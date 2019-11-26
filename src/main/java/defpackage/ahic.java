package defpackage;

/* renamed from: ahic */
final /* synthetic */ class ahic implements bcvk {
    private final ahhu a;

    ahic(ahhu ahhu) {
        this.a = ahhu;
    }

    public final void a(Object obj) {
        ahhu ahhu = this.a;
        ahkn ahkn = (ahkn) obj;
        if (ahkn.a == airi.PLAYBACK_LOADED && ahhu.b.get() != null) {
            ((acxt) ahhu.b.get()).a("gv");
            atyl atyl = (atyl) atyi.l.createBuilder();
            atyl.b(ahkn.e);
            if (!ahkn.b.b().isEmpty()) {
                String b = ahkn.b.b();
                atyl.copyOnWrite();
                atyi atyi = (atyi) atyl.instance;
                if (b != null) {
                    atyi.a |= 4194304;
                    atyi.h = b;
                } else {
                    throw new NullPointerException();
                }
            }
            ((acxt) ahhu.b.get()).a((atyi) ((anxl) atyl.build()));
        }
    }
}
