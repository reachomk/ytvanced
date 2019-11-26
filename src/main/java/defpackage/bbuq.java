package defpackage;

import java.util.concurrent.Callable;

/* renamed from: bbuq */
public final class bbuq extends bbmi implements Callable {
    private final Callable a;

    public bbuq(Callable callable) {
        this.a = callable;
    }

    public final void a(bbmo bbmo) {
        bbnc bbpl = new bbpl(bbmo);
        bbmo.a(bbpl);
        if (!bbpl.c()) {
            try {
                bbmo = bbow.a(this.a.call(), "Callable returned null");
                bbpl.b(bbmo);
            } catch (Throwable th) {
                bbnm.a(th);
                if (bbpl.c()) {
                    bbzf.a(th);
                } else {
                    bbmo.a(th);
                }
            }
        }
    }

    public final Object call() {
        return bbow.a(this.a.call(), "The callable returned a null value");
    }
}
