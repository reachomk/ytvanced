package defpackage;

/* renamed from: kod */
final class kod extends koo {
    private final boolean a;
    private final apxu b;

    kod(boolean z, apxu apxu) {
        this.a = z;
        this.b = apxu;
    }

    public final boolean a() {
        return this.a;
    }

    public final apxu b() {
        return this.b;
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 51);
        stringBuilder.append("InputValidationResult{isValid=");
        stringBuilder.append(z);
        stringBuilder.append(", errorCommand=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof koo) {
            koo koo = (koo) obj;
            if (this.a == koo.a()) {
                apxu apxu = this.b;
                if (apxu == null ? koo.b() == null : apxu.equals(koo.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((!this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        apxu apxu = this.b;
        return i ^ (apxu != null ? apxu.hashCode() : 0);
    }
}
