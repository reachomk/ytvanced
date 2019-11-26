package defpackage;

import java.util.NoSuchElementException;

/* renamed from: bcyu */
final class bcyu extends bcup {
    private final bcup a;
    private final boolean b = false;
    private final Object c = null;
    private Object d;
    private boolean e;
    private boolean f;

    bcyu(bcup bcup) {
        this.a = bcup;
        a(2);
    }

    public final void e_(Object obj) {
        if (!this.f) {
            if (this.e) {
                this.f = true;
                this.a.a(new IllegalArgumentException("Sequence contains too many elements"));
                b();
                return;
            }
            this.d = obj;
            this.e = true;
        }
    }

    public final void bM_() {
        if (!this.f) {
            if (this.e) {
                bcup bcup = this.a;
                bcup.a(new bdah(bcup, this.d));
                return;
            }
            this.a.a(new NoSuchElementException("Sequence contains no elements"));
        }
    }

    public final void a(Throwable th) {
        if (this.f) {
            bdeh.a(th);
        } else {
            this.a.a(th);
        }
    }
}
