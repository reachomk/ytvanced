package defpackage;

/* renamed from: amtj */
final class amtj extends amti {
    public static final amtj a = new amtj();
    public static final long serialVersionUID = 0;

    private amtj() {
        super(null);
    }

    public final int a(amti amti) {
        return amti == this ? 0 : -1;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(Comparable comparable) {
        return true;
    }

    public final String toString() {
        return "-∞";
    }

    /* Access modifiers changed, original: final */
    public final Comparable a() {
        throw new IllegalStateException("range unbounded on this side");
    }

    /* Access modifiers changed, original: final */
    public final void a(StringBuilder stringBuilder) {
        stringBuilder.append("(-∞");
    }

    /* Access modifiers changed, original: final */
    public final void b(StringBuilder stringBuilder) {
        throw new AssertionError();
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    private final Object readResolve() {
        return a;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return compareTo((amti) obj);
    }
}
