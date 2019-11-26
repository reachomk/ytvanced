package defpackage;

/* renamed from: xio */
class xio extends xiv {
    public final xgp a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final boolean e;
    private final xax f;
    private final Boolean g;

    xio(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, boolean z, xax xax, xgp xgp) {
        if (bcaa != null) {
            this.b = bcaa;
            if (bcaa2 != null) {
                this.c = bcaa2;
                if (bcaa3 != null) {
                    this.d = bcaa3;
                    this.e = z;
                    if (xax != null) {
                        this.f = xax;
                        if (xgp != null) {
                            this.a = xgp;
                            this.g = null;
                            return;
                        }
                        throw new NullPointerException("Null httpClientConfig");
                    }
                    throw new NullPointerException("Null commonConfigs");
                }
                throw new NullPointerException("Null uriRewriter");
            }
            throw new NullPointerException("Null headerDecoratorProvider");
        }
        throw new NullPointerException("Null cronetEngineProvider");
    }

    /* Access modifiers changed, original: final */
    public final Boolean g() {
        return null;
    }

    public final bcaa a() {
        return this.b;
    }

    public final bcaa b() {
        return this.c;
    }

    public final bcaa c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final xax e() {
        return this.f;
    }

    /* Access modifiers changed, original: final */
    public final xgp f() {
        return this.a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        boolean z = this.e;
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.a);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int length4 = valueOf4.length();
        String str = "null";
        StringBuilder stringBuilder = new StringBuilder((((((length + 164) + length2) + length3) + length4) + valueOf5.length()) + str.length());
        stringBuilder.append("CronetHttpClientConfig{cronetEngineProvider=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", headerDecoratorProvider=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", uriRewriter=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", useObscura=");
        stringBuilder.append(z);
        stringBuilder.append(", commonConfigs=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", httpClientConfig=");
        stringBuilder.append(valueOf5);
        stringBuilder.append(", disableCacheForRequests=");
        stringBuilder.append(str);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xiv) {
            xiv xiv = (xiv) obj;
            return this.b.equals(xiv.a()) && this.c.equals(xiv.b()) && this.d.equals(xiv.c()) && this.e == xiv.d() && this.f.equals(xiv.e()) && this.a.equals(xiv.f()) && xiv.g() == null;
        }
    }

    public final int hashCode() {
        return (((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (!this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003;
    }
}
