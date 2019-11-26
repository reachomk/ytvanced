package defpackage;

/* renamed from: amtk */
final class amtk extends amti {
    public static final long serialVersionUID = 0;

    amtk(Comparable comparable) {
        super((Comparable) amqw.a((Object) comparable));
    }

    /* Access modifiers changed, original: final */
    public final boolean a(Comparable comparable) {
        return amwi.b(this.b, comparable) < 0;
    }

    /* Access modifiers changed, original: final */
    public final void a(StringBuilder stringBuilder) {
        stringBuilder.append('(');
        stringBuilder.append(this.b);
    }

    /* Access modifiers changed, original: final */
    public final void b(StringBuilder stringBuilder) {
        stringBuilder.append(this.b);
        stringBuilder.append(']');
    }

    public final int hashCode() {
        return this.b.hashCode() ^ -1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 2);
        stringBuilder.append("/");
        stringBuilder.append(valueOf);
        stringBuilder.append("\\");
        return stringBuilder.toString();
    }
}
