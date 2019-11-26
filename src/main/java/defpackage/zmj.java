package defpackage;

import java.util.Set;

/* renamed from: zmj */
public final class zmj {
    private final Set a;

    zmj(Set set) {
        this.a = set;
    }

    public final boolean a(ayzc ayzc) {
        Set set = this.a;
        return (set == null || ayzc == null) ? false : set.contains(ayzc);
    }
}
