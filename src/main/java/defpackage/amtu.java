package defpackage;

import java.util.Collection;
import java.util.Queue;

/* renamed from: amtu */
public abstract class amtu extends amtp implements Queue {
    protected amtu() {
    }

    public abstract Queue a();

    /* Access modifiers changed, original: protected|bridge|synthetic */
    public /* bridge */ /* synthetic */ Collection b() {
        throw null;
    }

    public boolean offer(Object obj) {
        return a().offer(obj);
    }

    public final Object poll() {
        return a().poll();
    }

    public final Object remove() {
        return a().remove();
    }

    public final Object peek() {
        return a().peek();
    }

    public final Object element() {
        return a().element();
    }
}
