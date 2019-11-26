package defpackage;

/* renamed from: vxs */
final class vxs extends vya {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final apfy f;
    private final int g;

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final apfy f() {
        return this.f;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        int i = this.g;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "DISLIKE" : "LIKE" : "NONE";
        String valueOf = String.valueOf(this.f);
        StringBuilder stringBuilder = new StringBuilder((str.length() + 142) + valueOf.length());
        stringBuilder.append("BrandInteractionState{hidden=");
        stringBuilder.append(z);
        stringBuilder.append(", enabled=");
        stringBuilder.append(z2);
        stringBuilder.append(", annotationEnabled=");
        stringBuilder.append(z3);
        stringBuilder.append(", appPromoEnabled=");
        stringBuilder.append(z4);
        stringBuilder.append(", fullscreen=");
        stringBuilder.append(z5);
        stringBuilder.append(", activeButton=");
        stringBuilder.append(str);
        stringBuilder.append(", renderer=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vya) {
            vya vya = (vya) obj;
            if (this.a == vya.a() && this.b == vya.b() && this.c == vya.c() && this.d == vya.d() && this.e == vya.e()) {
                int i = this.g;
                int g = vya.g();
                if (i != 0) {
                    return i == g && this.f.equals(vya.f());
                } else {
                    throw null;
                }
            }
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((((((((!this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (!this.b ? 1237 : 1231)) * 1000003) ^ (!this.c ? 1237 : 1231)) * 1000003) ^ (!this.d ? 1237 : 1231)) * 1000003;
        if (this.e) {
            i = 1231;
        }
        i2 = (i2 ^ i) * 1000003;
        i = this.g;
        if (i != 0) {
            return ((i2 ^ i) * 1000003) ^ this.f.hashCode();
        }
        throw null;
    }

    public final int g() {
        return this.g;
    }

    /* synthetic */ vxs(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, apfy apfy) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.g = i;
        this.f = apfy;
    }
}
