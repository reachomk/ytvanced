package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ryt */
final class ryt implements ryf, ryg, ryh, rzd {
    public final ryc a;
    public final rze b;
    private final Executor c;

    public ryt(Executor executor, ryc ryc, rze rze) {
        this.c = executor;
        this.a = ryc;
        this.b = rze;
    }

    public final void a(ryi ryi) {
        this.c.execute(new rys(this, ryi));
    }

    public final void a(Object obj) {
        this.b.a(obj);
    }

    public final void a(Exception exception) {
        this.b.a(exception);
    }

    public final void a() {
        this.b.f();
    }
}
