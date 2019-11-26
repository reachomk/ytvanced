package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: ajma */
public final class ajma implements ajmq {
    public final WeakReference a;
    public WeakReference b = new WeakReference(null);

    public ajma(ajln ajln) {
        this.a = new WeakReference((ajln) amqw.a((Object) ajln));
    }

    public final aakj b() {
        ajpu ajpu = (ajpu) this.b.get();
        return ajpu != null ? ajpu.Z() : null;
    }

    public final long c() {
        ajlj ajlj = (ajlj) this.a.get();
        if (ajlj == null) {
            return 0;
        }
        return ajlj.n();
    }

    public final long d() {
        ajlj ajlj = (ajlj) this.a.get();
        if (ajlj == null) {
            return 0;
        }
        return ajlj.m();
    }

    public final ajmv e() {
        ajpu ajpu = (ajpu) this.b.get();
        return ajpu != null ? ajpu.V() : null;
    }

    public final ajoz f() {
        ajlj ajlj = (ajlj) this.a.get();
        return ajlj != null ? ajlj.B() : null;
    }

    public final ajqi g() {
        ajln ajln = (ajln) this.a.get();
        return ajln != null ? ajln.g : null;
    }
}
