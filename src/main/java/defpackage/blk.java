package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: blk */
public final class blk implements bku, blm {
    public final boolean a;
    public final blj b;
    public final blj c;
    public final blj d;
    public final int e;
    private final List f = new ArrayList();

    public blk(bnr bnr, bns bns) {
        this.a = bns.e;
        this.e = bns.f;
        this.b = bns.b.a();
        this.c = bns.c.a();
        this.d = bns.d.a();
        bnr.a(this.b);
        bnr.a(this.c);
        bnr.a(this.d);
        this.b.a((blm) this);
        this.c.a((blm) this);
        this.d.a((blm) this);
    }

    public final void a(List list, List list2) {
    }

    public final String b() {
        throw null;
    }

    public final void a() {
        for (int i = 0; i < this.f.size(); i++) {
            ((blm) this.f.get(i)).a();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(blm blm) {
        this.f.add(blm);
    }
}
