package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: xap */
final class xap implements anjg {
    private final /* synthetic */ xar a;
    private final /* synthetic */ Runnable b;
    private final /* synthetic */ xao c;

    xap(xar xar, Runnable runnable, xao xao) {
        this.a = xar;
        this.b = runnable;
        this.c = xao;
    }

    public final void a(Object obj) {
        this.a.accept(obj);
    }

    public final void a(Throwable th) {
        Runnable runnable = this.b;
        if (runnable == null || !(th instanceof CancellationException)) {
            this.c.accept(th);
        } else {
            runnable.run();
        }
    }
}
