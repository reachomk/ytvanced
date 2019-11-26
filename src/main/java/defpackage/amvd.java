package defpackage;

import java.util.Iterator;

/* renamed from: amvd */
final class amvd extends amrx {
    private final /* synthetic */ Iterator b;
    private final /* synthetic */ amqv c;

    amvd(Iterator it, amqv amqv) {
        this.b = it;
        this.c = amqv;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object a() {
        while (this.b.hasNext()) {
            Object next = this.b.next();
            if (this.c.a(next)) {
                return next;
            }
        }
        this.a = 3;
        return null;
    }
}
