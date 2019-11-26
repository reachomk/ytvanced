package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: tdb */
final class tdb implements tde {
    private final plw a;

    tdb(plw plw) {
        Collections.synchronizedMap(new HashMap());
        this.a = plw;
    }

    public final tev a() {
        return new tfv(this.a.c(), tda.a);
    }

    public final tev b() {
        return new tfv(this.a.b(), tdd.a);
    }

    public final tev a(double d) {
        ptg s;
        plw plw = this.a;
        pzr.b("Must be called from the main thread.");
        if (!plw.r()) {
            s = plw.s();
        } else if (Double.isInfinite(d) || Double.isNaN(d)) {
            StringBuilder stringBuilder = new StringBuilder(41);
            stringBuilder.append("Volume cannot be ");
            stringBuilder.append(d);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            s = plw.a(new pmo(plw, plw.e, d));
        }
        return new tfv(s, tdc.a);
    }
}
