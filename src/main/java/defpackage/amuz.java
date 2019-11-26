package defpackage;

import java.util.Iterator;

/* renamed from: amuz */
public final class amuz extends amto {
    private final /* synthetic */ Iterable a;
    private final /* synthetic */ amqd b;

    public amuz(Iterable iterable, amqd amqd) {
        this.a = iterable;
        this.b = amqd;
    }

    public final Iterator iterator() {
        return amve.a(this.a.iterator(), this.b);
    }
}
