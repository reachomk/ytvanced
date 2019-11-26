package defpackage;

/* renamed from: koh */
final class koh extends kpl {
    private final boolean a;
    private final arml b;
    private final apxu c;

    koh(boolean z, arml arml, apxu apxu) {
        this.a = z;
        this.b = arml;
        this.c = apxu;
    }

    public final boolean a() {
        return this.a;
    }

    public final arml b() {
        return this.b;
    }

    public final apxu c() {
        return this.c;
    }

    public final String toString() {
        boolean z = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 65) + valueOf2.length());
        stringBuilder.append("RulesetValidationResult{isValid=");
        stringBuilder.append(z);
        stringBuilder.append(", errorText=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", errorCommand=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kpl) {
            kpl kpl = (kpl) obj;
            if (this.a == kpl.a()) {
                arml arml = this.b;
                if (arml == null ? kpl.b() != null : !arml.equals(kpl.b())) {
                    apxu apxu = this.c;
                    if (apxu == null ? kpl.c() == null : apxu.equals(kpl.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((!this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        arml arml = this.b;
        int i2 = 0;
        i = (i ^ (arml != null ? arml.hashCode() : 0)) * 1000003;
        apxu apxu = this.c;
        if (apxu != null) {
            i2 = apxu.hashCode();
        }
        return i ^ i2;
    }
}
