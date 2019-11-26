package defpackage;

import java.util.concurrent.Executor;

/* renamed from: wzo */
public final class wzo implements xai {
    private final Executor a;

    public wzo(Executor executor) {
        this.a = executor;
    }

    public final void a() {
    }

    public final void a(Throwable th) {
        if (th != null) {
            xtl.a("Crashing on uncaught exception", th);
            this.a.execute(new wzr(th));
        }
    }
}
