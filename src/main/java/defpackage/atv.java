package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;

/* renamed from: atv */
public final class atv {
    public final ArrayDeque a;
    private final Runnable b;

    public atv() {
        this(null);
    }

    public atv(Runnable runnable) {
        this.a = new ArrayDeque();
        this.b = runnable;
    }

    public final void a() {
        Iterator descendingIterator = this.a.descendingIterator();
        while (descendingIterator.hasNext()) {
            atw atw = (atw) descendingIterator.next();
            if (atw.a) {
                atw.a();
                return;
            }
        }
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
