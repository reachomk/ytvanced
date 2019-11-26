package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbnx */
public final class bbnx extends AtomicReference implements bbnc {
    public static final long serialVersionUID = 5718521705281392066L;

    public bbnx(bbnt bbnt) {
        super(bbnt);
    }

    public final boolean c() {
        return get() == null;
    }

    public final void bK_() {
        if (get() != null) {
            bbnt bbnt = (bbnt) getAndSet(null);
            if (bbnt != null) {
                try {
                    bbnt.a();
                } catch (Exception e) {
                    bbnm.a(e);
                    bbzf.a(e);
                }
            }
        }
    }
}
