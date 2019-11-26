package defpackage;

/* renamed from: kof */
final class kof extends kos {
    private final kop a;
    private final arnb b;

    kof(kop kop, arnb arnb) {
        this.a = kop;
        if (arnb != null) {
            this.b = arnb;
            return;
        }
        throw new NullPointerException("Null renderer");
    }

    public final kop a() {
        return this.a;
    }

    public final arnb b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 42) + valueOf2.length());
        stringBuilder.append("InputFieldContainer{presenter=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", renderer=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kos) {
            kos kos = (kos) obj;
            return this.a.equals(kos.a()) && this.b.equals(kos.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
