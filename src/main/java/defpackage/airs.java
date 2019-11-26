package defpackage;

/* renamed from: airs */
final class airs extends aish {
    private final aiqq a;
    private final aiqw b;
    private final String c;
    private final int d;
    private final boolean e;

    airs(aiqq aiqq, aiqw aiqw, String str) {
        if (aiqq != null) {
            this.a = aiqq;
            if (aiqw != null) {
                this.b = aiqw;
                if (str != null) {
                    this.c = str;
                    this.d = -1;
                    this.e = true;
                    return;
                }
                throw new NullPointerException("Null cpn");
            }
            throw new NullPointerException("Null playbackStartParameters");
        }
        throw new NullPointerException("Null playbackStartDescriptor");
    }

    public final aiqq a() {
        return this.a;
    }

    public final aiqw b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        int i = this.d;
        boolean z = this.e;
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 150) + valueOf2.length()) + String.valueOf(str).length());
        stringBuilder.append("PlayerFetcherDescriptor{playbackStartDescriptor=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", playbackStartParameters=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", cpn=");
        stringBuilder.append(str);
        stringBuilder.append(", dataExpiredForSeconds=");
        stringBuilder.append(i);
        stringBuilder.append(", synchronousRequestCreation=");
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aish) {
            aish aish = (aish) obj;
            return this.a.equals(aish.a()) && this.b.equals(aish.b()) && this.c.equals(aish.c()) && this.d == aish.d() && this.e == aish.e();
        }
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ (!this.e ? 1237 : 1231);
    }
}
