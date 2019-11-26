package defpackage;

import java.util.concurrent.Callable;

/* renamed from: bbrv */
public final class bbrv extends bbme implements Callable {
    private final Callable a;

    public bbrv(Callable callable) {
        this.a = callable;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bbmd bbmd) {
        bbnc a = bbnb.a();
        bbmd.a(a);
        if (!a.c()) {
            try {
                Object call = this.a.call();
                if (!a.c()) {
                    if (call != null) {
                        bbmd.d_(call);
                    } else {
                        bbmd.bL_();
                    }
                }
            } catch (Throwable th) {
                bbnm.a(th);
                if (a.c()) {
                    bbzf.a(th);
                } else {
                    bbmd.a_(th);
                }
            }
        }
    }

    public final Object call() {
        return this.a.call();
    }
}
