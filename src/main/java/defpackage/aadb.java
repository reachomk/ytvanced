package defpackage;

/* renamed from: aadb */
final class aadb extends aadk {
    private final String a;
    private final String b;
    private final aadq c;
    private final int d;

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final aadq c() {
        return this.c;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.d;
        String valueOf = String.valueOf(i == 0 ? "null" : arga.b(i));
        String valueOf2 = String.valueOf(this.c);
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 70) + String.valueOf(str2).length()) + valueOf.length()) + valueOf2.length());
        stringBuilder.append("InternalEntityMutation{entityKey=");
        stringBuilder.append(str);
        stringBuilder.append(", deletedEntityKey=");
        stringBuilder.append(str2);
        stringBuilder.append(", type=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", payload=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aadk) {
            aadk aadk = (aadk) obj;
            if (this.a.equals(aadk.a())) {
                String str = this.b;
                if (str == null ? aadk.b() != null : !str.equals(aadk.b())) {
                    int i = this.d;
                    int d = aadk.d();
                    if (i == 0) {
                        throw null;
                    } else if (i == d) {
                        aadq aadq = this.c;
                        if (aadq == null ? aadk.c() == null : aadq.equals(aadk.c())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        hashCode = (hashCode ^ (str != null ? str.hashCode() : 0)) * 1000003;
        int i2 = this.d;
        if (i2 != 0) {
            hashCode = (hashCode ^ i2) * 1000003;
            aadq aadq = this.c;
            if (aadq != null) {
                i = aadq.hashCode();
            }
            return hashCode ^ i;
        }
        throw null;
    }

    public final int d() {
        return this.d;
    }

    /* synthetic */ aadb(String str, String str2, int i, aadq aadq) {
        this.a = str;
        this.b = str2;
        this.d = i;
        this.c = aadq;
    }
}
