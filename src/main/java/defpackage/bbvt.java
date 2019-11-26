package defpackage;

import java.util.concurrent.Callable;

/* renamed from: bbvt */
final class bbvt extends bbmi {
    private final Object a;
    private final bbnv b;

    bbvt(Object obj, bbnv bbnv) {
        this.a = obj;
        this.b = bbnv;
    }

    public final void a(bbmo bbmo) {
        try {
            bbmm bbmm = (bbmm) bbow.a(this.b.a(this.a), "The mapper returned a null ObservableSource");
            if (bbmm instanceof Callable) {
                try {
                    Object call = ((Callable) bbmm).call();
                    if (call == null) {
                        bboc.a(bbmo);
                        return;
                    }
                    bbnc bbvu = new bbvu(bbmo, call);
                    bbmo.a(bbvu);
                    bbvu.run();
                    return;
                } catch (Throwable th) {
                    bbnm.a(th);
                    bboc.a(th, bbmo);
                    return;
                }
            }
            bbmm.b(bbmo);
        } catch (Throwable th2) {
            bboc.a(th2, bbmo);
        }
    }
}
