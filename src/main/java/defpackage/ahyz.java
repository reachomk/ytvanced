package defpackage;

/* renamed from: ahyz */
public final class ahyz implements ajan, xcp {
    private final /* synthetic */ ahys a;

    public ahyz(ahys ahys) {
        this.a = ahys;
    }

    public final long e() {
        return 1024;
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkn ahkn) {
        ahys ahys = this.a;
        ahys.p = ahkn.e;
        ahys.q = ahkn.f;
        int ordinal = ahkn.a.ordinal();
        if (ordinal == 0) {
            this.a.f();
        } else if (ordinal != 5) {
            if (ordinal == 8) {
                this.a.a(ahkn.d, ahkn.b);
            } else if (ordinal == 9) {
                ahys ahys2 = this.a;
                if (ahys2.j) {
                    ahys2.j = false;
                    ahys2.j();
                    this.a.k();
                }
            }
        } else {
            this.a.a(ahkn.d, ahkn.c);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(ahjn ahjn) {
        int ordinal = ahjn.a.ordinal();
        if ((ordinal == 0 || ordinal == 2) && !this.a.i.isEmpty()) {
            ahzw ahzw = this.a.n;
            if (ahzw != null) {
                ahzw.f = ahjn.b;
            }
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 1024)).a(ajcg.a(ajam.O(), 1024, 1)).a(new ahzc(this), ahzb.a), ajam.P().b.a(ajcg.b(ajam.O(), 1024)).a(ajcg.a(ajam.O(), 1024, 0)).a(new ahze(this), ahzd.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjn.class, ahkn.class};
        } else if (i == 0) {
            a((ahjn) obj);
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
