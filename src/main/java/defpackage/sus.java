package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: sus */
public final class sus {
    public final bbzt a = bbzt.b();
    public final AtomicReference b;

    public sus(amqp amqp) {
        this.b = new AtomicReference(amqp);
    }

    public final void a(amqp amqp, boolean z) {
        this.b.set(amqp);
        if (z) {
            this.a.b_(amqp);
        }
    }
}
