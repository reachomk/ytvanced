package defpackage;

/* renamed from: amra */
final class amra extends amqp {
    public static final long serialVersionUID = 0;
    private final Object a;

    amra(Object obj) {
        this.a = obj;
    }

    public final boolean a() {
        return true;
    }

    public final Object b() {
        return this.a;
    }

    public final Object a(Object obj) {
        amqw.a(obj, (Object) "use Optional.orNull() instead of Optional.or(null)");
        return this.a;
    }

    public final amqp a(amqp amqp) {
        amqw.a((Object) amqp);
        return this;
    }

    public final Object a(amro amro) {
        amqw.a((Object) amro);
        return this.a;
    }

    public final Object c() {
        return this.a;
    }

    public final amqp a(amqd amqd) {
        return new amra(amqw.a(amqd.a(this.a), (Object) "the Function passed to Optional.transform() must not return null."));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof amra)) {
            return false;
        }
        return this.a.equals(((amra) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 13);
        stringBuilder.append("Optional.of(");
        stringBuilder.append(valueOf);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
