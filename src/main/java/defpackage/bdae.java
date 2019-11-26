package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bdae */
public final class bdae extends AtomicInteger implements bcuc {
    public static final long serialVersionUID = -2873467947112093874L;
    private final bcup a;
    private Object b;

    public bdae(bcup bcup) {
        this.a = bcup;
    }

    public final void a(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        } else if (j != 0) {
            do {
                int i = get();
                if (i != 0) {
                    if (i == 1 && compareAndSet(1, 3)) {
                        bdae.a(this.a, this.b);
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public final void a(Object obj) {
        do {
            int i = get();
            if (i == 0) {
                this.b = obj;
            } else if (i == 2 && compareAndSet(2, 3)) {
                bdae.a(this.a, obj);
                return;
            } else {
                return;
            }
        } while (!compareAndSet(0, 1));
    }

    private static void a(bcup bcup, Object obj) {
        if (!bcup.c()) {
            try {
                bcup.e_(obj);
                if (!bcup.c()) {
                    bcup.bM_();
                }
            } catch (Throwable th) {
                bcva.a(th, bcup, obj);
            }
        }
    }
}
