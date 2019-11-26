package defpackage;

import java.util.AbstractList;
import java.util.List;

/* renamed from: ckw */
public final class ckw extends AbstractList {
    private final List a;

    public ckw(ckg ckg, cil... cilArr) {
        civ c = ((cis) ckg.e).c();
        if (ckg.e.a(ckl.class).isEmpty()) {
            this.a = new balh(ckg.a().a, c);
        } else {
            this.a = new balj(ckg.a().a, c, cilArr);
        }
    }

    public final int size() {
        return this.a.size();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return (bakz) this.a.get(i);
    }
}
