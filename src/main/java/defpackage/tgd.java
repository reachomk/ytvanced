package defpackage;

/* renamed from: tgd */
public final class tgd implements teg {
    private final psa a;

    public tgd(psa psa) {
        if (psa != null) {
            this.a = psa;
            return;
        }
        throw new IllegalArgumentException("null connectionResult");
    }

    public final int a() {
        return this.a.b;
    }

    public final String toString() {
        return this.a.toString();
    }
}
