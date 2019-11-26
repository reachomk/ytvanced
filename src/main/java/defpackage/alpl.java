package defpackage;

import java.util.AbstractList;
import java.util.List;

/* renamed from: alpl */
final class alpl extends AbstractList {
    private final List a;
    private final int b;

    alpl(List list, int i) {
        amqw.a((Object) list);
        amqw.a(i > 0);
        this.a = list;
        this.b = i;
    }

    public final int size() {
        double size = (double) this.a.size();
        double d = (double) this.b;
        Double.isNaN(size);
        Double.isNaN(d);
        return (int) Math.ceil(size / d);
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final /* synthetic */ Object get(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = this.b;
        i *= i2;
        return this.a.subList(i, Math.min(i2 + i, this.a.size()));
    }
}
