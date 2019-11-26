package defpackage;

import java.util.concurrent.Future;

/* renamed from: bbup */
public final class bbup extends bbmi {
    private final Future a;

    public bbup(Future future) {
        this.a = future;
    }

    public final void a(bbmo bbmo) {
        bbnc bbpl = new bbpl(bbmo);
        bbmo.a(bbpl);
        if (!bbpl.c()) {
            try {
                bbmo = bbow.a(this.a.get(), "Future returned null");
                bbpl.b(bbmo);
            } catch (Throwable th) {
                bbnm.a(th);
                if (!bbpl.c()) {
                    bbmo.a(th);
                }
            }
        }
    }
}
