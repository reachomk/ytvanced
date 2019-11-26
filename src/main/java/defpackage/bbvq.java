package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbvq */
public final class bbvq extends bbmi {
    public bbvp a;
    private final bbzb b;
    private final int c = 1;

    public bbvq(bbzb bbzb) {
        this.b = bbzb;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bbmo bbmo) {
        bbvp bbvp;
        Object obj;
        synchronized (this) {
            bbvp = this.a;
            if (bbvp == null) {
                bbvp = new bbvp(this);
                this.a = bbvp;
            }
            long j = bbvp.a + 1;
            bbvp.a = j;
            obj = null;
            if (!bbvp.b && j == ((long) this.c)) {
                bbvp.b = true;
                obj = 1;
            }
        }
        this.b.b(new bbvs(bbmo, this, bbvp));
        if (obj != null) {
            this.b.d(bbvp);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(bbvp bbvp) {
        synchronized (this) {
            if (this.a != null) {
                this.a = null;
                bbzb bbzb = this.b;
                if (bbzb instanceof bbnc) {
                    ((bbnc) bbzb).bK_();
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(bbvp bbvp) {
        synchronized (this) {
            if (bbvp.a == 0 && bbvp == this.a) {
                this.a = null;
                bbnz.a((AtomicReference) bbvp);
                bbzb bbzb = this.b;
                if (bbzb instanceof bbnc) {
                    ((bbnc) bbzb).bK_();
                }
            }
        }
    }
}
