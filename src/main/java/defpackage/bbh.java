package defpackage;

import java.util.Collection;

/* renamed from: bbh */
final class bbh implements bat {
    private final /* synthetic */ bbf a;

    bbh(bbf bbf) {
        this.a = bbf;
    }

    public final void a(bap bap, Collection collection) {
        bbf bbf = this.a;
        if (bap == bbf.l) {
            bbs bbs = bbf.k;
            bbs.t.clear();
            for (bau bau : collection) {
                bbs a = bbs.a.a(bau.a.a());
                if (a != null) {
                    a.s = bau;
                    int i = bau.b;
                    if (i == 2 || i == 3) {
                        bbs.t.add(a);
                    }
                }
            }
            bbb.a.f.a(259, bbs);
        }
    }
}
