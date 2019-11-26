package defpackage;

/* renamed from: aalg */
final class aalg extends aals {
    private final Long a;
    private final String b;
    private final int c;
    private final int d;
    private final amul e;

    public final Long a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final amul e() {
        return this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        int i = this.c;
        int i2 = this.d;
        String valueOf2 = String.valueOf(this.e);
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 144) + String.valueOf(str).length()) + valueOf2.length());
        stringBuilder.append("ExecutedInnerTubeRequestInfo{parsingTimeMillis=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", rpcName=");
        stringBuilder.append(str);
        stringBuilder.append(", responseProtoByteSize=");
        stringBuilder.append(i);
        stringBuilder.append(", retryCount=");
        stringBuilder.append(i2);
        stringBuilder.append(", networkHealthAnnotations=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aals) {
            aals aals = (aals) obj;
            return this.a.equals(aals.a()) && this.b.equals(aals.b()) && this.c == aals.c() && this.d == aals.d() && amvj.a(this.e, aals.e());
        }
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    /* synthetic */ aalg(Long l, String str, int i, int i2, amul amul) {
        this.a = l;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = amul;
    }
}
