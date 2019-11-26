package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: acyp */
public final class acyp implements afsd {
    private final Set a;

    private acyp() {
        this.a = new HashSet();
    }

    public acyp(Set set) {
        this();
        if (set != null) {
            this.a.addAll(set);
        }
    }

    public acyp(aula[] aulaArr) {
        this();
        if (aulaArr != null) {
            for (aula aula : aulaArr) {
                Set set = this.a;
                Object a = aulc.a(aula.b);
                if (a == null) {
                    a = aulc.UNKNOWN;
                }
                set.add(a);
            }
        }
    }

    public final boolean a(aulc aulc) {
        Set set = this.a;
        return set != null && set.contains(aulc);
    }
}
