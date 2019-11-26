package defpackage;

import java.util.List;

/* renamed from: amuq */
final class amuq extends amul {
    private final transient amul a;

    amuq(amul amul) {
        this.a = amul;
    }

    private final int b(int i) {
        return (size() - 1) - i;
    }

    private final int c(int i) {
        return size() - i;
    }

    public final amul i() {
        return this.a;
    }

    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    public final int indexOf(Object obj) {
        int lastIndexOf = this.a.lastIndexOf(obj);
        if (lastIndexOf < 0) {
            return -1;
        }
        return b(lastIndexOf);
    }

    public final int lastIndexOf(Object obj) {
        int indexOf = this.a.indexOf(obj);
        if (indexOf < 0) {
            return -1;
        }
        return b(indexOf);
    }

    public final amul a(int i, int i2) {
        amqw.a(i, i2, size());
        return ((amul) this.a.subList(c(i2), c(i))).i();
    }

    public final Object get(int i) {
        amqw.a(i, size());
        return this.a.get(b(i));
    }

    public final int size() {
        return this.a.size();
    }

    /* Access modifiers changed, original: final */
    public final boolean f() {
        return this.a.f();
    }

    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
