package defpackage;

import java.util.Collection;
import java.util.concurrent.Callable;

/* renamed from: bbwg */
public final class bbwg extends bbsp {
    private final Callable b;

    public bbwg(bbmm bbmm, Callable callable) {
        super(bbmm);
        this.b = callable;
    }

    public final void a(bbmo bbmo) {
        try {
            this.a.b(new bbwf(bbmo, (Collection) bbow.a(this.b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            bbnm.a(th);
            bboc.a(th, bbmo);
        }
    }
}
