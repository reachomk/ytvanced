package defpackage;

/* renamed from: agod */
final class agod extends agoq {
    private final azqf a;
    private final amqp b;
    private final azqj c;

    agod(azqf azqf, amqp amqp, azqj azqj) {
        if (azqf != null) {
            this.a = azqf;
            if (amqp != null) {
                this.b = amqp;
                if (azqj != null) {
                    this.c = azqj;
                    return;
                }
                throw new NullPointerException("Null signatures");
            }
            throw new NullPointerException("Null clientData");
        }
        throw new NullPointerException("Null offlineFile");
    }

    public final azqf a() {
        return this.a;
    }

    public final amqp b() {
        return this.b;
    }

    public final azqj c() {
        return this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 49) + valueOf2.length()) + valueOf3.length());
        stringBuilder.append("Yt4Protos{offlineFile=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", clientData=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", signatures=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agoq) {
            agoq agoq = (agoq) obj;
            return this.a.equals(agoq.a()) && this.b.equals(agoq.b()) && this.c.equals(agoq.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
