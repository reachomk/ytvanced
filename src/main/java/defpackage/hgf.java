package defpackage;

/* renamed from: hgf */
final class hgf extends hgh {
    private final String a;
    private final boolean b;

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hgh) {
            hgh hgh = (hgh) obj;
            return this.a.equals(hgh.a()) && this.b == hgh.b();
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231);
    }

    /* synthetic */ hgf(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
