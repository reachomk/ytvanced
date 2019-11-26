package defpackage;

import java.util.AbstractMap.SimpleImmutableEntry;

/* renamed from: amwo */
final class amwo extends amul {
    private final /* synthetic */ amwl a;

    amwo(amwl amwl) {
        this.a = amwl;
    }

    public final boolean f() {
        return true;
    }

    public final int size() {
        return this.a.c;
    }

    public final /* synthetic */ Object get(int i) {
        amqw.a(i, this.a.c);
        amwl amwl = this.a;
        Object[] objArr = amwl.a;
        i += i;
        int i2 = amwl.b;
        return new SimpleImmutableEntry(objArr[i + i2], objArr[i + (i2 ^ 1)]);
    }
}
