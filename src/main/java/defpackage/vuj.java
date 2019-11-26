package defpackage;

import java.util.List;

/* renamed from: vuj */
public final class vuj implements afsd {
    private final List a;

    public vuj(List list) {
        this.a = (List) amqw.a((Object) list);
    }

    public final boolean a(aulc aulc) {
        for (aula aula : this.a) {
            aulc a = aulc.a(aula.b);
            if (a == null) {
                a = aulc.UNKNOWN;
                continue;
            }
            if (a == aulc) {
                return true;
            }
        }
        return false;
    }
}
