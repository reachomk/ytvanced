package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aguc */
public final class aguc implements ajgv {
    public final agwc a;
    public final afsk b;
    private final ajgv c;
    private final Executor d;
    private final xhv e;

    public aguc(ajgv ajgv, Executor executor, xhv xhv, agwc agwc, afsk afsk) {
        this.c = (ajgv) amqw.a((Object) ajgv);
        this.d = (Executor) amqw.a((Object) executor);
        this.e = (xhv) amqw.a((Object) xhv);
        this.a = (agwc) amqw.a((Object) agwc);
        this.b = (afsk) amqw.a((Object) afsk);
    }

    public final void a(ajgu ajgu, wxg wxg) {
        if (this.e.c()) {
            this.c.a(ajgu, wxg);
        } else {
            this.d.execute(new agub(this, ajgu, wxg));
        }
    }

    public final void b(ajgu ajgu, wxg wxg) {
        this.c.b(ajgu, wxg);
    }
}
