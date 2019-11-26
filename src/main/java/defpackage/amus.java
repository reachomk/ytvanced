package defpackage;

import java.util.List;

/* renamed from: amus */
final class amus extends amul {
    private final transient int a;
    private final transient int b;
    private final /* synthetic */ amul c;

    amus(amul amul, int i, int i2) {
        this.c = amul;
        this.a = i;
        this.b = i2;
    }

    /* Access modifiers changed, original: final */
    public final boolean f() {
        return true;
    }

    public final int size() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final Object[] b() {
        return this.c.b();
    }

    /* Access modifiers changed, original: final */
    public final int c() {
        return this.c.c() + this.a;
    }

    /* Access modifiers changed, original: final */
    public final int d() {
        return (this.c.c() + this.a) + this.b;
    }

    public final Object get(int i) {
        amqw.a(i, this.b);
        return this.c.get(i + this.a);
    }

    public final amul a(int i, int i2) {
        amqw.a(i, i2, this.b);
        amul amul = this.c;
        int i3 = this.a;
        return (amul) amul.subList(i + i3, i2 + i3);
    }

    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
