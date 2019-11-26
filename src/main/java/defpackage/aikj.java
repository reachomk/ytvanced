package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: aikj */
final class aikj implements aike {
    public final Set a = new CopyOnWriteArraySet();
    private final /* synthetic */ aikk b;

    aikj(aikk aikk) {
        this.b = aikk;
    }

    public final void a(int i, int i2, int i3) {
        synchronized (this.b) {
            i = this.b.b(i, i2);
            this.b.a();
            a(i, i3);
        }
    }

    public final void a(int i) {
        synchronized (this.b) {
            int b = this.b.b(1, 0);
            i = this.b.b(0, i);
            this.b.a();
            if (b != i) {
                for (xbz f_ : this.a) {
                    f_.f_(b, i);
                }
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        synchronized (this.b) {
            i = this.b.b(i, i2);
            this.b.a();
            b(i, i3);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, int i2) {
        for (xbz e_ : this.a) {
            e_.e_(i, i2);
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(int i, int i2) {
        for (xbz g_ : this.a) {
            g_.g_(i, i2);
        }
    }
}
