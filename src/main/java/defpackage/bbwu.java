package defpackage;

import java.util.concurrent.Callable;

/* renamed from: bbwu */
public final class bbwu extends bbms {
    private final Callable a;

    public bbwu(Callable callable) {
        this.a = callable;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(bbmr bbmr) {
        bbnc a = bbnb.a();
        bbmr.a(a);
        if (!a.c()) {
            try {
                Object a2 = bbow.a(this.a.call(), "The callable returned a null value");
                if (!a.c()) {
                    bbmr.d_(a2);
                }
            } catch (Throwable th) {
                bbnm.a(th);
                if (a.c()) {
                    bbzf.a(th);
                } else {
                    bbmr.a_(th);
                }
            }
        }
    }
}
