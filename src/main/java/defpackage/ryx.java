package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ryx */
final class ryx implements rzd {
    public final Object a = new Object();
    public final rye b;
    private final Executor c;

    public ryx(Executor executor, rye rye) {
        this.c = executor;
        this.b = rye;
    }

    public final void a(ryi ryi) {
        synchronized (this.a) {
            if (this.b == null) {
                return;
            }
            this.c.execute(new ryw(this, ryi));
        }
    }
}
