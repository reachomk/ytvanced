package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: amvc */
final class amvc extends amto {
    private final /* synthetic */ Iterable a;
    private final /* synthetic */ int b;

    amvc(Iterable iterable, int i) {
        this.a = iterable;
        this.b = i;
    }

    public final Iterator iterator() {
        Iterable iterable = this.a;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.b), list.size()).iterator();
        }
        Object it = iterable.iterator();
        int i = this.b;
        amqw.a(it);
        amqw.a(i >= 0, (Object) "numberToAdvance must be nonnegative");
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            it.next();
        }
        return new amvb(it);
    }
}
