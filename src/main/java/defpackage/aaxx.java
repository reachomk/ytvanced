package defpackage;

/* renamed from: aaxx */
public final class aaxx {
    public final ajwa a;

    public aaxx(ajwa ajwa) {
        this.a = ajwa;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aaxx)) {
            return false;
        }
        return aocf.messageNanoEquals(this.a, ((aaxx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
