package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bcmy */
final class bcmy implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b = false;
    public final /* synthetic */ int c = 0;
    private final /* synthetic */ Executor d;

    bcmy(Executor executor, int i, boolean z, int i2) {
        this.d = executor;
        this.a = i;
    }

    public final void execute(Runnable runnable) {
        this.d.execute(new bcmx(this, runnable));
    }
}
