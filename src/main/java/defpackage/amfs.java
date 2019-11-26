package defpackage;

/* renamed from: amfs */
final class amfs extends amjd {
    private final String a;
    private final amuw b;
    private final amqp c;

    /* Access modifiers changed, original: final */
    public final String a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final amuw b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final amqp c() {
        return this.c;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 59) + valueOf.length()) + valueOf2.length());
        stringBuilder.append("UploadTaskFutureResult{id=");
        stringBuilder.append(str);
        stringBuilder.append(", unmetRequirements=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", retryTime=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amjd) {
            amjd amjd = (amjd) obj;
            return this.a.equals(amjd.a()) && this.b.equals(amjd.b()) && this.c.equals(amjd.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    /* synthetic */ amfs(String str, amuw amuw, amqp amqp) {
        this.a = str;
        this.b = amuw;
        this.c = amqp;
    }
}
