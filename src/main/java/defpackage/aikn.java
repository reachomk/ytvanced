package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: aikn */
final class aikn implements aike {
    public final Set a = new CopyOnWriteArraySet();
    private final int b;

    public aikn(int i) {
        this.b = i;
    }

    public final void a(int i, int i2, int i3) {
        if (this.b == i) {
            for (xbz e_ : this.a) {
                e_.e_(i2, i3);
            }
        }
    }

    public final void a(int i) {
        int i2 = this.b;
        Object obj = i2 != 1 ? null : 1;
        Object obj2 = i2 != 0 ? null : 1;
        if (i2 == 1 || i2 == 0) {
            if (obj != null && obj2 != null) {
                for (xbz f_ : this.a) {
                    f_.f_(0, i);
                }
            } else if (obj != null) {
                for (xbz g_ : this.a) {
                    g_.g_(0, 1);
                }
            } else if (obj2 != null) {
                for (xbz e_ : this.a) {
                    e_.e_(i, 1);
                }
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        if (this.b == i) {
            for (xbz g_ : this.a) {
                g_.g_(i2, i3);
            }
        }
    }
}
