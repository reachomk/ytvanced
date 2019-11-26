package defpackage;

import java.util.List;

/* renamed from: sgs */
final class sgs implements amqd {
    private final /* synthetic */ sgr a;

    sgs(sgr sgr) {
        this.a = sgr;
    }

    public final /* synthetic */ Object a(Object obj) {
        for (sge sge : (List) obj) {
            if (this.a.a.i.equals(sge.a)) {
                return sge;
            }
        }
        return null;
    }
}
