package defpackage;

/* renamed from: vxo */
final class vxo extends vxg {
    private final aphg a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public final aphg c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public final boolean e() {
        return this.c;
    }

    public final boolean f() {
        return this.d;
    }

    public final boolean g() {
        return this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 111);
        stringBuilder.append("AdReEngagementState{renderer=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", enabled=");
        stringBuilder.append(z);
        stringBuilder.append(", fullscreen=");
        stringBuilder.append(z2);
        stringBuilder.append(", annotationEnabled=");
        stringBuilder.append(z3);
        stringBuilder.append(", appPromoEnabled=");
        stringBuilder.append(z4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vxg) {
            vxg vxg = (vxg) obj;
            return this.a.equals(vxg.c()) && this.b == vxg.d() && this.c == vxg.e() && this.d == vxg.f() && this.e == vxg.g();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231)) * 1000003) ^ (!this.c ? 1237 : 1231)) * 1000003) ^ (!this.d ? 1237 : 1231)) * 1000003;
        if (this.e) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    /* synthetic */ vxo(aphg aphg, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = aphg;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }
}
