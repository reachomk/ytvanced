package defpackage;

/* renamed from: bbkg */
final class bbkg extends bbko {
    private final boolean a;
    private final bbkx b;

    public final boolean a() {
        return this.a;
    }

    public final bbkx b() {
        return this.b;
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 53);
        stringBuilder.append("EndSpanOptions{sampleToLocalSpanStore=");
        stringBuilder.append(z);
        stringBuilder.append(", status=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bbko) {
            bbko bbko = (bbko) obj;
            if (this.a == bbko.a()) {
                bbkx bbkx = this.b;
                if (bbkx == null ? bbko.b() == null : bbkx.equals(bbko.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((!this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        bbkx bbkx = this.b;
        return i ^ (bbkx != null ? bbkx.hashCode() : 0);
    }

    /* synthetic */ bbkg(boolean z, bbkx bbkx) {
        this.a = z;
        this.b = bbkx;
    }
}
