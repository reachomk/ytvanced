package defpackage;

/* renamed from: ref */
final class ref {
    private final Object a;
    private final int b;

    ref(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ref) {
            ref ref = (ref) obj;
            if (this.a == ref.a && this.b == ref.b) {
                return true;
            }
        }
        return false;
    }
}
