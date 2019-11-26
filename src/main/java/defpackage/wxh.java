package defpackage;

import java.util.concurrent.Executor;

/* renamed from: wxh */
public final class wxh extends wxs {
    private final Executor b;

    private wxh(Executor executor, wxg wxg) {
        super(wxg);
        this.b = (Executor) amqw.a((Object) executor);
    }

    public static wxh a(Executor executor, wxg wxg) {
        return new wxh(executor, wxg);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Runnable runnable) {
        this.b.execute(runnable);
    }
}
