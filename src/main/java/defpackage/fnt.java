package defpackage;

/* renamed from: fnt */
final class fnt implements ajan, xcp {
    private final /* synthetic */ fnr a;

    fnt(fnr fnr) {
        this.a = fnr;
    }

    public final long e() {
        return 1;
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkn ahkn) {
        synchronized (this.a) {
            int ordinal = ahkn.a.ordinal();
            fnr fnr;
            if (ordinal == 1) {
                fnr = this.a;
                fnr.a = true;
                fnr.a(false, "playback", false);
            } else if (ordinal == 2) {
                fnr = this.a;
                fnr.a = true;
                fnr.a(true, "playback", true);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        synchronized (this.a) {
            this.a.a = false;
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.f().a(emg.a(this.a.e, 2048)).a(new fns(this), fnv.a), ajam.n().f().a(emg.a(this.a.e, 2048, 0)).a(new fnu(this), fnx.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkd.class, ahkn.class};
        } else if (i == 0) {
            a();
            return null;
        } else if (i == 1) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
