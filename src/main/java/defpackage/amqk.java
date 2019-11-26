package defpackage;

import java.util.Iterator;

/* renamed from: amqk */
final class amqk extends amqh {
    private final /* synthetic */ amqh b;

    amqk(amqh amqh, amqh amqh2) {
        this.b = amqh;
        super(amqh2);
    }

    public final Appendable a(Appendable appendable, Iterator it) {
        Object next;
        amqw.a((Object) appendable, (Object) "appendable");
        amqw.a((Object) it, (Object) "parts");
        while (it.hasNext()) {
            next = it.next();
            if (next != null) {
                appendable.append(amqh.a(next));
                break;
            }
        }
        while (it.hasNext()) {
            next = it.next();
            if (next != null) {
                appendable.append(this.b.a);
                appendable.append(amqh.a(next));
            }
        }
        return appendable;
    }

    public final amqm b(String str) {
        throw new UnsupportedOperationException("can't use .skipNulls() with maps");
    }
}
