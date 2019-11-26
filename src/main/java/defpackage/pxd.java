package defpackage;

import java.util.Arrays;

/* renamed from: pxd */
public final class pxd {
    private final boolean a = false;
    private final int b;
    private final pso c;
    private final psr d;

    private pxd(pso pso) {
        this.c = pso;
        this.d = null;
        this.b = Arrays.hashCode(new Object[]{this.c, null});
    }

    public static pxd a(pso pso) {
        return new pxd(pso);
    }

    public final String a() {
        return this.c.a;
    }

    public final int hashCode() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pxd) {
            return pzj.a(this.c, ((pxd) obj).c) && pzj.a(null, null);
        }
    }
}
