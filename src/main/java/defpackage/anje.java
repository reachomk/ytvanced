package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* renamed from: anje */
public abstract class anje extends anjb implements anjv {
    protected anje() {
    }

    public abstract anjv b();

    /* Access modifiers changed, original: protected|bridge|synthetic */
    public /* bridge */ /* synthetic */ Future c() {
        throw null;
    }

    public final void a(Runnable runnable, Executor executor) {
        b().a(runnable, executor);
    }
}
