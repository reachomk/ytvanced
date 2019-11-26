package defpackage;

import java.util.Iterator;

/* renamed from: ampz */
final class ampz implements Iterable {
    public final /* synthetic */ Iterable a;
    public final /* synthetic */ amqa b;

    ampz(amqa amqa, Iterable iterable) {
        this.b = amqa;
        this.a = iterable;
    }

    public final Iterator iterator() {
        return new amqc(this);
    }
}
