package defpackage;

import java.util.concurrent.Callable;

/* renamed from: tzf */
final class tzf implements Callable {
    private final /* synthetic */ Callable a;
    private final /* synthetic */ tzd b;

    tzf(tzd tzd, Callable callable) {
        this.b = tzd;
        this.a = callable;
    }

    public final Object call() {
        try {
            return this.a.call();
        } catch (Throwable th) {
            this.b.a.a(th);
        }
    }
}
