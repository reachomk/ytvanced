package defpackage;

/* renamed from: amfr */
final class amfr extends amjg {
    public String a;
    private amuw b;
    private amqp c = ampo.a;

    amfr() {
    }

    /* Access modifiers changed, original: final */
    public final amjg a(amuw amuw) {
        if (amuw != null) {
            this.b = amuw;
            return this;
        }
        throw new NullPointerException("Null unmetRequirements");
    }

    /* Access modifiers changed, original: final */
    public final amjg a(amqp amqp) {
        if (amqp != null) {
            this.c = amqp;
            return this;
        }
        throw new NullPointerException("Null retryTime");
    }

    /* Access modifiers changed, original: final */
    public final amjd a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" id");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" unmetRequirements");
        }
        if (str.isEmpty()) {
            return new amfs(this.a, this.b, this.c);
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }
}
