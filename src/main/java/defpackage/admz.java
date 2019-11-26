package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: admz */
public final class admz implements ajmq {
    public aakj a;
    private final WeakReference b;

    public admz(ajlj ajlj) {
        amqw.b(true);
        this.b = new WeakReference((ajlj) amqw.a((Object) ajlj));
    }

    public final long c() {
        return 0;
    }

    public final ajmv e() {
        return null;
    }

    public final ajoz f() {
        return null;
    }

    public final ajqi g() {
        return null;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.b.clear();
    }

    public final aakj b() {
        return this.a;
    }

    public final long d() {
        ajlj ajlj = (ajlj) this.b.get();
        if (ajlj == null) {
            return 0;
        }
        return ajlj.m();
    }
}
