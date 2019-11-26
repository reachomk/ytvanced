package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bckr */
public abstract class bckr {
    private final Executor a;

    public bckr(Executor executor) {
        if (executor != null) {
            this.a = executor;
            return;
        }
        throw new IllegalStateException("Executor must not be null");
    }

    public abstract void a(bcko bcko);

    public Executor a() {
        return this.a;
    }
}
