package defpackage;

/* renamed from: adjl */
final class adjl extends adlp {
    private final aaft a;
    private final int b;
    private final int c;
    private final boolean d;
    private final arwf e;
    private final wxg f;

    adjl(aaft aaft, int i, int i2, boolean z, arwf arwf, wxg wxg) {
        this.a = aaft;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = arwf;
        this.f = wxg;
    }

    /* Access modifiers changed, original: final */
    public final aaft a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final int b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final int c() {
        return this.c;
    }

    /* Access modifiers changed, original: final */
    public final boolean d() {
        return this.d;
    }

    /* Access modifiers changed, original: final */
    public final arwf e() {
        return this.e;
    }

    /* Access modifiers changed, original: final */
    public final wxg f() {
        return this.f;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        int i2 = this.c;
        boolean z = this.d;
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.f);
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + afy.av) + valueOf2.length()) + valueOf3.length());
        stringBuilder.append("ThumbnailRequestModel{thumbnailDetailsModel=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", width=");
        stringBuilder.append(i);
        stringBuilder.append(", height=");
        stringBuilder.append(i2);
        stringBuilder.append(", isHqImage=");
        stringBuilder.append(z);
        stringBuilder.append(", overlay=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", callback=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adlp) {
            adlp adlp = (adlp) obj;
            if (this.a.equals(adlp.a()) && this.b == adlp.b() && this.c == adlp.c() && this.d == adlp.d()) {
                arwf arwf = this.e;
                if (arwf == null ? adlp.e() == null : arwf.equals(adlp.e())) {
                    if (this.f.equals(adlp.f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (!this.d ? 1237 : 1231)) * 1000003;
        arwf arwf = this.e;
        return ((hashCode ^ (arwf != null ? arwf.hashCode() : 0)) * 1000003) ^ this.f.hashCode();
    }
}
