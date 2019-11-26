package defpackage;

import java.util.Map;

/* renamed from: zi */
final class zi extends zt {
    private final /* synthetic */ zj c;

    zi(zj zjVar) {
        this.c = zjVar;
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        return this.c.b;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object a(int i, int i2) {
        return this.c.a[(i + i) + i2];
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(Object obj) {
        return this.c.a(obj);
    }

    /* Access modifiers changed, original: protected|final */
    public final int b(Object obj) {
        return this.c.b(obj);
    }

    /* Access modifiers changed, original: protected|final */
    public final Map b() {
        return this.c;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Object obj, Object obj2) {
        this.c.put(obj, obj2);
    }

    /* Access modifiers changed, original: protected|final */
    public final Object a(int i, Object obj) {
        return this.c.a(i, obj);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i) {
        this.c.d(i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        this.c.clear();
    }
}
