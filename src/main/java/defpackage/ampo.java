package defpackage;

/* renamed from: ampo */
public final class ampo extends amqp {
    public static final ampo a = new ampo();
    public static final long serialVersionUID = 0;

    private ampo() {
    }

    public final boolean a() {
        return false;
    }

    public final Object c() {
        return null;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    public final Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final Object a(Object obj) {
        return amqw.a(obj, (Object) "use Optional.orNull() instead of Optional.or(null)");
    }

    public final amqp a(amqp amqp) {
        return (amqp) amqw.a((Object) amqp);
    }

    public final Object a(amro amro) {
        return amqw.a(amro.get(), (Object) "use Optional.orNull() instead of a Supplier that returns null");
    }

    public final amqp a(amqd amqd) {
        amqw.a((Object) amqd);
        return a;
    }

    private final Object readResolve() {
        return a;
    }
}
