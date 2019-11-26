package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: rcg */
public final class rcg implements Callable {
    private final qui a;
    private final qpa b;

    public rcg(qui qui, qpa qpa) {
        this.a = qui;
        this.b = qpa;
    }

    public final /* synthetic */ Object call() {
        Future future = this.a.k;
        if (future != null) {
            future.get();
        }
        riu riu = this.a.j;
        if (riu != null) {
            try {
                synchronized (this.b) {
                    riu.a(this.b, riu.a(riu));
                }
            } catch (rir unused) {
            }
        }
        return null;
    }
}
