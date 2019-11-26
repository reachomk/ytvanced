package defpackage;

/* renamed from: xfh */
final class xfh extends xgp {
    private final int a;
    private final int b;
    private final boolean c;
    private final boolean d;

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        StringBuilder stringBuilder = new StringBuilder(135);
        stringBuilder.append("HttpClientConfig{connectionTimeoutMs=");
        stringBuilder.append(i);
        stringBuilder.append(", readTimeoutMs=");
        stringBuilder.append(i2);
        stringBuilder.append(", installSecureRequestEnforcer=");
        stringBuilder.append(z);
        stringBuilder.append(", followRedirects=");
        stringBuilder.append(z2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xgp) {
            xgp xgp = (xgp) obj;
            return this.a == xgp.a() && this.b == xgp.b() && this.c == xgp.c() && this.d == xgp.d();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = (((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (!this.c ? 1237 : 1231)) * 1000003;
        if (this.d) {
            i = 1231;
        }
        return i2 ^ i;
    }

    /* synthetic */ xfh(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }
}
