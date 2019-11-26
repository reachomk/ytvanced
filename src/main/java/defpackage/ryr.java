package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ryr */
final class ryr implements rzd {
    public final ryc a;
    public final rze b;
    private final Executor c;

    public ryr(Executor executor, ryc ryc, rze rze) {
        this.c = executor;
        this.a = ryc;
        this.b = rze;
    }

    public final void a(ryi ryi) {
        this.c.execute(new ryq(this, ryi));
    }
}
