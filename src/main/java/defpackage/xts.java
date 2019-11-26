package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: xts */
final class xts extends xtp {
    public final Object b;
    public final xts c;
    private final float d;
    private List e;

    public final int b() {
        return 1;
    }

    public final List d() {
        if (this.e == null) {
            this.e = Collections.singletonList(this.b);
        }
        return this.e;
    }

    static float a(xts xts) {
        return xts != null ? xts.d : 0.0f;
    }

    xts(int i, Object obj, xts xts) {
        super(i);
        this.b = obj;
        this.c = xts;
        float a = xts.a(xts);
        if (i != 1) {
            a += 1.0f;
        }
        this.d = a;
    }
}
