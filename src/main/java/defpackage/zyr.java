package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: zyr */
public final class zyr implements aaap {
    public final aavm a;
    private final Executor b;

    public zyr(Executor executor, aavm aavm) {
        this.b = executor;
        this.a = aavm;
    }

    public final void a(apxu apxu, Map map) {
        this.b.execute(new zyq(this));
    }
}
