package defpackage;

/* renamed from: acvm */
final class acvm {
    private final Object a;
    private final acwc b;
    private final int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acvm) {
            acvm acvm = (acvm) obj;
            if (this.c == acvm.c) {
                Object obj2 = this.a;
                if (!obj2 == null ? obj2.equals(acvm.a) : acvm.a == null) {
                    return false;
                }
                if (this.b == acvm.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        acwc acwc = this.b;
        return ((acwc != null ? acwc.hashCode() : 0) * 31) + this.c;
    }

    /* synthetic */ acvm(Object obj, acwc acwc, int i) {
        this.a = obj;
        this.b = acwc;
        this.c = i;
    }
}
