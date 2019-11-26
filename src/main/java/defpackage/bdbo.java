package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bdbo */
public final class bdbo extends AtomicReference implements bcuo {
    public static final long serialVersionUID = 5718521705281392066L;

    public bdbo(bcvo bcvo) {
        super(bcvo);
    }

    public final boolean c() {
        return get() == null;
    }

    public final void b() {
        if (get() != null) {
            bcvo bcvo = (bcvo) getAndSet(null);
            if (bcvo != null) {
                try {
                    bcvo.a();
                } catch (Exception e) {
                    bcva.b(e);
                    bdeh.a(e);
                }
            }
        }
    }
}
