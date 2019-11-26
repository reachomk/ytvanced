package defpackage;

import java.util.concurrent.Semaphore;

/* renamed from: aboh */
final /* synthetic */ class aboh implements bqj {
    private final aboe a;
    private final bqr b;

    aboh(aboe aboe, bqr bqr) {
        this.a = aboe;
        this.b = bqr;
    }

    public final void a(Object obj) {
        aboe aboe = this.a;
        this.b.a((abnq) obj);
        Semaphore semaphore = aboe.c;
        if (semaphore != null) {
            semaphore.release();
        }
    }
}
