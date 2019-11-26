package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bcwq */
abstract class bcwq extends bcwn {
    public static final long serialVersionUID = 4127754106204442833L;

    public bcwq(bcup bcup) {
        super(bcup);
    }

    public abstract void f();

    public void e_(Object obj) {
        if (!this.a.c()) {
            if (get() != 0) {
                this.a.e_(obj);
                bcvu.b((AtomicLong) this, 1);
                return;
            }
            f();
        }
    }
}
