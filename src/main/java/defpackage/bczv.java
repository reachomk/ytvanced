package defpackage;

import java.util.concurrent.Callable;

/* renamed from: bczv */
public final class bczv implements bcun {
    private final Callable a;

    public bczv(Callable callable) {
        this.a = callable;
    }

    public final /* synthetic */ void a(Object obj) {
        bcum bcum = (bcum) obj;
        try {
            bcum.a(this.a.call());
        } catch (Throwable th) {
            bcva.b(th);
            bcum.a(th);
        }
    }
}
