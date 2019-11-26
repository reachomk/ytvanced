package defpackage;

/* renamed from: igr */
final class igr implements ajan, xcp {
    private final /* synthetic */ igp a;

    igr(igp igp) {
        this.a = igp;
    }

    public final long e() {
        return 1;
    }

    public final void a(ahkl ahkl) {
        igp igp = this.a;
        boolean z = igp.g;
        boolean z2 = true;
        if (!(ahkl.b == 2 || ahkl.a)) {
            z2 = false;
        }
        igp.g = z2;
        if (z != z2) {
            igp.d();
        }
    }

    public final void a(ahkf ahkf) {
        if (airg.a(ahkf.e, 4)) {
            aakj aakj = ahkf.b;
            if (aakj != null) {
                this.a.e = new igq(aakj.b(), aakj.g().d());
                this.a.c();
            }
        }
    }

    public final void a(ahjn ahjn) {
        this.a.f = ahjn.a == airc.REMOTE;
        this.a.d();
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.P().a.f().a(emg.a(this.a.d, 137438953472L, 0)).a(new igu(this), igt.a), ajam.t().f().a(emg.a(this.a.d, 137438953472L, 1)).a(new igw(this), igv.a), ajam.P().b.f().a(emg.a(this.a.d, 137438953472L, 0)).a(new igy(this), igx.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjn.class, ahkf.class, ahkl.class};
        } else if (i == 0) {
            a((ahjn) obj);
            return null;
        } else if (i == 1) {
            a((ahkf) obj);
            return null;
        } else if (i == 2) {
            a((ahkl) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
