package defpackage;

/* renamed from: oan */
public final class oan {
    public static final oan a = new oan(0);
    public final int b;

    public oan(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            if (this.b == ((oan) obj).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
