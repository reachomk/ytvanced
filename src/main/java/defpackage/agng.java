package defpackage;

/* renamed from: agng */
final class agng extends agnk {
    private final amqp a;
    private final azrc b;

    agng(amqp amqp, azrc azrc) {
        if (amqp != null) {
            this.a = amqp;
            if (azrc != null) {
                this.b = azrc;
                return;
            }
            throw new NullPointerException("Null namingAttempt");
        }
        throw new NullPointerException("Null file");
    }

    /* Access modifiers changed, original: final */
    public final amqp a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final azrc b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 42) + valueOf2.length());
        stringBuilder.append("YtbFileNamingResult{file=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", namingAttempt=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof agnk) {
            agnk agnk = (agnk) obj;
            return this.a.equals(agnk.a()) && this.b.equals(agnk.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
