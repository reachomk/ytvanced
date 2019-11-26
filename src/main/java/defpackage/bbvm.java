package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbvm */
public final class bbvm extends bbzb {
    private final bbmm a;
    private final AtomicReference b;
    private final bbmm c;

    public bbvm(bbmm bbmm, bbmm bbmm2, AtomicReference atomicReference) {
        this.c = bbmm;
        this.a = bbmm2;
        this.b = atomicReference;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bbmo bbmo) {
        this.c.b(bbmo);
    }

    public final void d(bbnw bbnw) {
        bbvo bbvo;
        bbvo bbvo2;
        do {
            bbvo = (bbvo) this.b.get();
            if (bbvo != null && !bbvo.c()) {
                break;
            }
            bbvo2 = new bbvo(this.b);
        } while (!this.b.compareAndSet(bbvo, bbvo2));
        bbvo = bbvo2;
        boolean z = false;
        if (!bbvo.c.get() && bbvo.c.compareAndSet(false, true)) {
            z = true;
        }
        try {
            bbnw.accept(bbvo);
            if (z) {
                this.a.b(bbvo);
            }
        } catch (Throwable th) {
            bbnm.a(th);
            RuntimeException a = bbyw.a(th);
        }
    }
}
