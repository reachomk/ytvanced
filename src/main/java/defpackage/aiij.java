package defpackage;

/* renamed from: aiij */
public final class aiij implements ajan, xcp {
    private final /* synthetic */ aiii a;

    public aiij(aiii aiii) {
        this.a = aiii;
    }

    public final long e() {
        return 8388608;
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkn ahkn) {
        int ordinal = ahkn.a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 8) {
                aiii aiii = this.a;
                if (!aiii.e) {
                    aiii.a(ahkn.b.a);
                }
            }
            return;
        }
        aiii aiii2 = this.a;
        aiii2.d = false;
        aiii2.e = false;
        aiii2.c.a(false);
    }

    /* Access modifiers changed, original: final */
    public final void a(ahjn ahjn) {
        this.a.c.b(ahjn.b == airc.FULLSCREEN);
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 8388608)).a(ajcg.a(ajam.O(), 8388608, 1)).a(new aiim(this), aiil.a), ajam.P().b.a(ajcg.b(ajam.O(), 8388608)).a(ajcg.a(ajam.O(), 8388608, 0)).a(new aiio(this), aiin.a)};
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
