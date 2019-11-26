package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: anis */
public final class anis extends anid {
    public anis(amuh amuh, Executor executor, anij anij) {
        a(new aniw(this, amuh, new anir(this, anij, executor)));
    }

    public anis(amuh amuh, Executor executor, Callable callable) {
        a(new aniw(this, amuh, new aniu(this, callable, executor)));
    }
}
