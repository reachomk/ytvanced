package defpackage;

/* renamed from: opi */
final class opi {
    public final boolean a;
    private final int b;

    public opi(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            opi opi = (opi) obj;
            return this.b == opi.b && this.a == opi.a;
        }
    }

    public final int hashCode() {
        return (this.b * 31) + this.a;
    }
}
