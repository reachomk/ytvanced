package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bdah */
public final class bdah extends AtomicBoolean implements bcuc {
    public static final long serialVersionUID = -3353584923995471404L;
    private final bcup a;
    private final Object b;

    public bdah(bcup bcup, Object obj) {
        this.a = bcup;
        this.b = obj;
    }

    public final void a(long j) {
        if (j >= 0) {
            if (j != 0 && compareAndSet(false, true)) {
                bcup bcup = this.a;
                if (!bcup.c()) {
                    Object obj = this.b;
                    try {
                        bcup.e_(obj);
                        if (!bcup.c()) {
                            bcup.bM_();
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        bcva.a(th, bcup, obj);
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("n >= 0 required");
    }
}
