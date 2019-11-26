package defpackage;

/* renamed from: aado */
final class aado extends aadz {
    private final String a;
    private final aadq b;
    private final aadq c;
    private final aadu d;
    private final aadu e;

    public final String a() {
        return this.a;
    }

    public final aadq b() {
        return this.b;
    }

    public final aadq c() {
        return this.c;
    }

    public final aadu d() {
        return this.d;
    }

    public final aadu e() {
        return this.e;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        StringBuilder stringBuilder = new StringBuilder(((((length + 94) + length2) + length3) + valueOf3.length()) + valueOf4.length());
        stringBuilder.append("EntityUpdate{entityKey=");
        stringBuilder.append(str);
        stringBuilder.append(", previousEntity=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", currentEntity=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", previousMetadata=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", currentMetadata=");
        stringBuilder.append(valueOf4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aadz) {
            aadz aadz = (aadz) obj;
            if (this.a.equals(aadz.a())) {
                aadq aadq = this.b;
                if (aadq == null ? aadz.b() != null : !aadq.equals(aadz.b())) {
                    aadq = this.c;
                    if (aadq == null ? aadz.c() == null : aadq.equals(aadz.c())) {
                        return this.d.equals(aadz.d()) && this.e.equals(aadz.e());
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        aadq aadq = this.b;
        int i = 0;
        hashCode = (hashCode ^ (aadq != null ? aadq.hashCode() : 0)) * 1000003;
        aadq = this.c;
        if (aadq != null) {
            i = aadq.hashCode();
        }
        return ((((hashCode ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    /* synthetic */ aado(String str, aadq aadq, aadq aadq2, aadu aadu, aadu aadu2) {
        this.a = str;
        this.b = aadq;
        this.c = aadq2;
        this.d = aadu;
        this.e = aadu2;
    }
}
