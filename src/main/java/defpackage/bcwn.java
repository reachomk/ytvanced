package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bcwn */
abstract class bcwn extends AtomicLong implements bctx, bcuc, bcuo {
    public static final long serialVersionUID = 7326289992464377023L;
    public final bcup a;
    private final bdfw b = new bdfw();

    public bcwn(bcup bcup) {
        this.a = bcup;
    }

    /* Access modifiers changed, original: 0000 */
    public void d() {
    }

    /* Access modifiers changed, original: 0000 */
    public void e() {
    }

    public void bM_() {
        if (!this.a.c()) {
            try {
                this.a.bM_();
            } finally {
                this.b.b();
            }
        }
    }

    public void a(Throwable th) {
        if (!this.a.c()) {
            try {
                this.a.a(th);
            } finally {
                this.b.b();
            }
        }
    }

    public final void b() {
        this.b.b();
        e();
    }

    public final boolean c() {
        return this.b.c();
    }

    public final void a(long j) {
        if (bcvu.a(j)) {
            bcvu.a((AtomicLong) this, j);
            d();
        }
    }

    public final void a(bcvo bcvo) {
        this.b.a(new bdbo(bcvo));
    }
}
