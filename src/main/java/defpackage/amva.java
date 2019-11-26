package defpackage;

import java.util.Iterator;

/* renamed from: amva */
final class amva extends amto {
    private final /* synthetic */ Iterable a;
    private final /* synthetic */ amqv b;

    amva(Iterable iterable, amqv amqv) {
        this.a = iterable;
        this.b = amqv;
    }

    public final Iterator iterator() {
        return amve.a(this.a.iterator(), this.b);
    }
}
