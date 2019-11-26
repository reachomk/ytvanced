package defpackage;

import java.util.concurrent.Executor;

/* renamed from: anja */
public class anja extends anjn {
    anja() {
    }

    public static anja c(anjv anjv) {
        if (anjv instanceof anja) {
            return (anja) anjv;
        }
        return new anjc(anjv);
    }

    public final anja a(Class cls, amqd amqd, Executor executor) {
        anhm anhm = new anhm(this, cls, amqd);
        a(anhm, ankc.a(executor, anhm));
        return anhm;
    }

    public final anja a(anim anim, Executor executor) {
        return (anja) anic.a((anjv) this, anim, executor);
    }

    public final anja a(amqd amqd, Executor executor) {
        return (anja) anic.a((anjv) this, amqd, executor);
    }
}
