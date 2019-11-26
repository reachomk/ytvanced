package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: txi */
final class txi implements Runnable {
    private final /* synthetic */ ExecutorService a;
    private final /* synthetic */ Runnable b;
    private final /* synthetic */ boolean c = true;
    private final /* synthetic */ txf d;

    txi(txf txf, ExecutorService executorService, Runnable runnable, boolean z) {
        this.d = txf;
        this.a = executorService;
        this.b = runnable;
    }

    public final void run() {
        ExecutorService executorService = this.a;
        txf txf = this.d;
        try {
            executorService.submit(this.b);
        } catch (RuntimeException e) {
            tyv.b("Primes", "Primes failed to initialized", e, new Object[0]);
            txf.a();
        }
        if (this.c) {
            this.a.shutdown();
        }
    }
}
