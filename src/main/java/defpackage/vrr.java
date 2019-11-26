package defpackage;

/* renamed from: vrr */
public final class vrr extends vrv {
    private final String a;
    private final akcb b;
    private final aakj c;

    public vrr(String str, akcb akcb, aakj aakj) {
        if (str != null) {
            this.a = str;
            this.b = akcb;
            if (aakj != null) {
                this.c = aakj;
                return;
            }
            throw new NullPointerException("Null contentPlayerResponse");
        }
        throw new NullPointerException("Null layoutId");
    }

    public final String a() {
        return this.a;
    }

    public final akcb b() {
        return this.b;
    }

    public final aakj c() {
        return this.c;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 82) + valueOf.length()) + valueOf2.length());
        stringBuilder.append("CompanionAndImmersiveLayout{layoutId=");
        stringBuilder.append(str);
        stringBuilder.append(", watchNextResponse=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", contentPlayerResponse=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vrv) {
            vrv vrv = (vrv) obj;
            if (this.a.equals(vrv.a())) {
                akcb akcb = this.b;
                if (akcb == null ? vrv.b() == null : akcb.equals(vrv.b())) {
                    if (this.c.equals(vrv.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        akcb akcb = this.b;
        return ((hashCode ^ (akcb != null ? akcb.hashCode() : 0)) * 1000003) ^ this.c.hashCode();
    }
}
