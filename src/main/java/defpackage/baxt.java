package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: baxt */
final class baxt implements bbdc {
    private final AtomicLong a = new AtomicLong();

    baxt() {
    }

    public final void a() {
        this.a.getAndAdd(1);
    }
}
