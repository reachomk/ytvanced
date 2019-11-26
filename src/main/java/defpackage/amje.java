package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: amje */
public final class amje implements anjv {
    public final String a;
    private final amir b;
    private final anjv c;

    public amje(String str, amir amir, anjv anjv) {
        this.a = str;
        this.b = amir;
        this.c = anjv;
    }

    public final void a(Runnable runnable, Executor executor) {
        this.c.a(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.c.cancel(z);
    }

    public final boolean isCancelled() {
        return this.c.isCancelled();
    }

    public final boolean isDone() {
        return this.c.isDone();
    }

    public final amje a(amip amip) {
        amir amir = this.b;
        String str = this.a;
        return new amje(str, amir, anic.a((anjv) this, new amit(amir, str, amip), aniv.a));
    }

    public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        return (amjd) this.c.get(j, timeUnit);
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return (amjd) this.c.get();
    }
}
