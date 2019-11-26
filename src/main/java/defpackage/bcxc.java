package defpackage;

import java.util.NoSuchElementException;

/* renamed from: bcxc */
final class bcxc extends bcup {
    private boolean a;
    private boolean b;
    private Object c;
    private final /* synthetic */ bcum d;

    bcxc(bcum bcum) {
        this.d = bcum;
    }

    public final void d() {
        a(2);
    }

    public final void bM_() {
        if (!this.a) {
            if (this.b) {
                this.d.a(this.c);
            } else {
                this.d.a(new NoSuchElementException("Observable emitted no items"));
            }
        }
    }

    public final void a(Throwable th) {
        this.d.a(th);
        b();
    }

    public final void e_(Object obj) {
        if (this.b) {
            this.a = true;
            this.d.a(new IllegalArgumentException("Observable emitted too many elements"));
            b();
            return;
        }
        this.b = true;
        this.c = obj;
    }
}
