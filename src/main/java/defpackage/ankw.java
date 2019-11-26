package defpackage;

import java.util.concurrent.Callable;

/* renamed from: ankw */
final class ankw extends anjt {
    private final Callable a;
    private final /* synthetic */ anku b;

    ankw(anku anku, Callable callable) {
        this.b = anku;
        this.a = (Callable) amqw.a((Object) callable);
    }

    /* Access modifiers changed, original: final */
    public final boolean c() {
        return this.b.isDone();
    }

    /* Access modifiers changed, original: final */
    public final Object b() {
        return this.a.call();
    }

    /* Access modifiers changed, original: final */
    public final void a(Object obj, Throwable th) {
        if (th != null) {
            this.b.a(th);
        } else {
            this.b.a_(obj);
        }
    }

    /* Access modifiers changed, original: final */
    public final String a() {
        return this.a.toString();
    }
}
