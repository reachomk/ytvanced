package defpackage;

import java.util.Map;

/* renamed from: zk */
final class zk extends zt {
    private final /* synthetic */ zl c;

    zk(zl zlVar) {
        this.c = zlVar;
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        return this.c.b;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object a(int i, int i2) {
        return this.c.a[i];
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(Object obj) {
        return this.c.a(obj);
    }

    /* Access modifiers changed, original: protected|final */
    public final int b(Object obj) {
        return this.c.a(obj);
    }

    /* Access modifiers changed, original: protected|final */
    public final Map b() {
        throw new UnsupportedOperationException("not a map");
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Object obj, Object obj2) {
        this.c.add(obj);
    }

    /* Access modifiers changed, original: protected|final */
    public final Object a(int i, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i) {
        this.c.b(i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        this.c.clear();
    }
}
