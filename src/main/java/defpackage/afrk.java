package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: afrk */
public final class afrk implements afsk {
    public final afsk a;
    private final Executor b;

    public static afrk a(Executor executor, afsk afsk) {
        amqw.a((Object) executor);
        amqw.a((Object) afsk);
        return new afrk(executor, afsk);
    }

    private afrk(Executor executor, afsk afsk) {
        this.b = executor;
        this.a = afsk;
    }

    public final void a(Object obj, wxg wxg) {
        amqw.a(obj);
        amqw.a((Object) wxg);
        try {
            this.b.execute(new afrn(this, obj, wxg));
        } catch (RejectedExecutionException e) {
            wxg.a(obj, e);
        }
    }
}
