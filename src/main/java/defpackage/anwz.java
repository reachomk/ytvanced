package defpackage;

/* renamed from: anwz */
final class anwz {
    private final Object a;
    private final int b;

    anwz(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anwz) {
            anwz anwz = (anwz) obj;
            if (this.a == anwz.a && this.b == anwz.b) {
                return true;
            }
        }
        return false;
    }
}
