package defpackage;

import java.util.concurrent.Semaphore;

/* renamed from: abog */
final /* synthetic */ class abog implements bqk {
    private final aboe a;
    private final bqr b;

    abog(aboe aboe, bqr bqr) {
        this.a = aboe;
        this.b = bqr;
    }

    public final void a(bqn bqn) {
        aboe aboe = this.a;
        this.b.a(bqn);
        Semaphore semaphore = aboe.c;
        if (semaphore != null) {
            semaphore.release();
        }
    }
}
