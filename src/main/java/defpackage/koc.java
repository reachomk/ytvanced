package defpackage;

/* renamed from: koc */
final class koc extends kot {
    public final boolean a;
    public final amul b;

    koc(boolean z, amul amul) {
        this.a = z;
        if (amul != null) {
            this.b = amul;
            return;
        }
        throw new NullPointerException("Null invalidInputCommands");
    }

    public final boolean a() {
        return this.a;
    }

    public final amul b() {
        return this.b;
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 58);
        stringBuilder.append("FormValidationResult{isValid=");
        stringBuilder.append(z);
        stringBuilder.append(", invalidInputCommands=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kot) {
            kot kot = (kot) obj;
            return this.a == kot.a() && amvj.a(this.b, kot.b());
        }
    }

    public final int hashCode() {
        return (((!this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
