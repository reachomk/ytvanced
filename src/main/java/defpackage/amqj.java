package defpackage;

import java.util.AbstractList;

/* renamed from: amqj */
final class amqj extends AbstractList {
    private final /* synthetic */ Object[] a;
    private final /* synthetic */ Object b;
    private final /* synthetic */ Object c;

    amqj(Object[] objArr, Object obj, Object obj2) {
        this.a = objArr;
        this.b = obj;
        this.c = obj2;
    }

    public final int size() {
        return this.a.length + 2;
    }

    public final Object get(int i) {
        if (i == 0) {
            return this.b;
        }
        if (i != 1) {
            return this.a[i - 2];
        }
        return this.c;
    }
}
