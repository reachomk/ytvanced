package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: mjn */
public final class mjn implements exv {
    private final aaas a;
    private final egz b;

    public mjn(aaas aaas, aaas aaas2, exu exu) {
        this.a = aaas;
        this.b = (egz) aaas2;
        if (exu.a) {
            a();
        }
    }

    public final void a() {
        this.b.a = new WeakReference(this.a);
    }

    public final void b() {
        egz egz = this.b;
        aaas aaas = this.a;
        WeakReference weakReference = egz.a;
        if (weakReference != null && weakReference.get() == aaas) {
            egz.a = null;
        }
    }
}
