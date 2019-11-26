package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cny */
public final class cny extends cqs implements cpy {
    private final AtomicInteger c = new AtomicInteger(0);
    private final int d;

    public cny(int i) {
        super(i);
        this.d = i;
    }

    public final Object a(Context context, cmm cmm) {
        Object a = super.a();
        if (a != null) {
            return a;
        }
        this.c.incrementAndGet();
        return cmm.a(context);
    }

    public final Object a() {
        throw new UnsupportedOperationException("Call acquire(ComponentContext, ComponentLifecycle)");
    }

    public final void b(Context context, cmm cmm) {
        if (this.b < this.a && this.c.getAndIncrement() < this.d) {
            a(cmm.a(context));
        }
    }
}
