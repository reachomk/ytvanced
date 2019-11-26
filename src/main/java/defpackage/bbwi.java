package defpackage;

import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: bbwi */
public final class bbwi extends bbms implements bbpa {
    private final bbmm a;
    private final Callable b = bbod.a();

    public bbwi(bbmm bbmm) {
        this.a = bbmm;
    }

    public final void b(bbmr bbmr) {
        try {
            this.a.b(new bbwh(bbmr, (Collection) bbow.a(this.b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            bbnm.a(th);
            bbmr.a(bboc.INSTANCE);
            bbmr.a_(th);
        }
    }

    public final bbmi bJ_() {
        return new bbwg(this.a, this.b);
    }
}
