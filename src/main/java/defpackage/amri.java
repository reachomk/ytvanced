package defpackage;

import java.util.Iterator;

/* renamed from: amri */
final class amri implements Iterable {
    private final /* synthetic */ CharSequence a;
    private final /* synthetic */ amqz b;

    amri(amqz amqz, CharSequence charSequence) {
        this.b = amqz;
        this.a = charSequence;
    }

    public final Iterator iterator() {
        return this.b.b(this.a);
    }

    public final String toString() {
        amqh a = amqh.a(", ");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        StringBuilder a2 = a.a(stringBuilder, iterator());
        a2.append(']');
        return a2.toString();
    }
}
