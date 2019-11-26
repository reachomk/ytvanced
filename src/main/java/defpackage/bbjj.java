package defpackage;

/* renamed from: bbjj */
final class bbjj extends bbjv {
    private final int a;

    public final String toString() {
        int i = this.a;
        String str = i != 1 ? i != 2 ? "null" : "NO_PROPAGATION" : "UNLIMITED_PROPAGATION";
        StringBuilder stringBuilder = new StringBuilder(str.length() + 20);
        stringBuilder.append("TagMetadata{tagTtl=");
        stringBuilder.append(str);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bbjv)) {
            return false;
        }
        bbjv bbjv = (bbjv) obj;
        int i = this.a;
        if (i != bbjv.a()) {
            z = false;
        }
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i ^ 1000003;
        }
        throw null;
    }

    bbjj(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }
}
