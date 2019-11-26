package defpackage;

import java.util.concurrent.Future;

/* renamed from: bbgi */
final class bbgi {
    public boolean a;
    private final Object b;
    private Future c;

    bbgi(Object obj) {
        this.b = obj;
    }

    /* Access modifiers changed, original: final */
    public final void a(Future future) {
        synchronized (this.b) {
            if (!this.a) {
                this.c = future;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final Future a() {
        this.a = true;
        return this.c;
    }
}
