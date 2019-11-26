package defpackage;

/* renamed from: tfg */
final class tfg implements teg {
    private final psa a;

    public tfg(psa psa) {
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
