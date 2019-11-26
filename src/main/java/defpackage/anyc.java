package defpackage;

import java.util.AbstractList;
import java.util.List;

/* renamed from: anyc */
public final class anyc extends AbstractList {
    private final List a;
    private final anyb b;

    public anyc(List list, anyb anyb) {
        this.a = list;
        this.b = anyb;
    }

    public final Object get(int i) {
        return this.b.convert(this.a.get(i));
    }

    public final int size() {
        return this.a.size();
    }
}
