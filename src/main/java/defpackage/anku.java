package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* renamed from: anku */
public final class anku extends aniz implements RunnableFuture {
    private volatile anjt a;

    public static anku a(anij anij) {
        return new anku(anij);
    }

    static anku a(Callable callable) {
        return new anku(callable);
    }

    static anku a(Runnable runnable, Object obj) {
        return new anku(Executors.callable(runnable, obj));
    }

    private anku(Callable callable) {
        this.a = new ankw(this, callable);
    }

    private anku(anij anij) {
        this.a = new ankt(this, anij);
    }

    public final void run() {
        anjt anjt = this.a;
        if (anjt != null) {
            anjt.run();
        }
        this.a = null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        if (d()) {
            anjt anjt = this.a;
            if (anjt != null) {
                anjt.e();
            }
        }
        this.a = null;
    }

    /* Access modifiers changed, original: protected|final */
    public final String ax_() {
        anjt anjt = this.a;
        if (anjt == null) {
            return super.ax_();
        }
        String valueOf = String.valueOf(anjt);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 7);
        stringBuilder.append("task=[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
