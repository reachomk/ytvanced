package defpackage;

import java.util.Iterator;
import java.util.Set;

/* renamed from: ajll */
public final class ajll {
    public final xci a;
    public final Set b;
    private final bcud c;
    private final bcud d;
    private final bdfg e;
    private final bdfg f;

    public ajll(xci xci, Set set, bcud bcud, bcud bcud2, bdfg bdfg, bdfg bdfg2) {
        this.a = (xci) amqw.a((Object) xci);
        this.b = (Set) amqw.a((Object) set);
        amqw.a((Object) xci);
        this.c = (bcud) amqw.a((Object) bcud);
        this.d = (bcud) amqw.a((Object) bcud2);
        this.e = (bdfg) amqw.a((Object) bdfg);
        this.f = (bdfg) amqw.a((Object) bdfg2);
    }

    public final void a(ajpu ajpu) {
        for (ajps a : this.b) {
            a.a(ajpu.Q());
        }
        this.c.e_(new ahkt(ajpu));
    }

    public final void b(ajpu ajpu) {
        for (ajps c : this.b) {
            c.c(ajpu.Q());
        }
        ajpu.u().bM_();
        ajpu.v().bM_();
        ajpu.x().bM_();
        ajpu.y().bM_();
        ajpu.z().bM_();
        ajpu.A().bM_();
        ajpu.B().bM_();
        ajpu.C().bM_();
        ajpu.D().bM_();
        ajpu.E().bM_();
        ajpu.F().bM_();
        ajpu.G().bM_();
        ajpu.I().bM_();
        ajpu.J().bM_();
        ajpu.K().bM_();
        ajpu.L().bM_();
        ajpu.M().bM_();
        ajpu.P().bM_();
        this.d.e_(new ahks(ajpu));
    }

    public final void c(ajpu ajpu) {
        this.f.e_(new ahkq(ajpu));
    }

    public final void d(ajpu ajpu) {
        this.e.e_(new ahkq(ajpu));
    }

    public final void a() {
        this.f.e_(ahkq.a);
        this.e.e_(ahkq.a);
    }

    public final void a(ahkn ahkn, ajpu ajpu) {
        for (ajps a : this.b) {
            a.a(ahkn);
        }
        if (ajpu != null) {
            ajpu.y().e_(ahkn);
        }
    }

    public final void a(ahkn ahkn) {
        for (ajps a : this.b) {
            a.a(ahkn);
        }
        this.a.d(ahkn);
    }

    public final void a(ahkr ahkr) {
        for (ajps a : this.b) {
            a.a(ahkr);
        }
        this.a.d(ahkr);
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkm ahkm) {
        for (ajps ajps : this.b) {
            if (ajps.f()) {
                ajps.a(ahkm);
            }
        }
    }

    public final void b(ahkm ahkm) {
        for (ajps ajps : this.b) {
            if (!ajps.f()) {
                ajps.a(ahkm);
            }
        }
        this.a.d(ahkm);
    }

    public final void a(aetv aetv, String str) {
        for (ajps b : this.b) {
            b.b(aetv, str);
        }
        this.a.d(aetv);
    }

    public final void a(ahkr ahkr, ajpu ajpu) {
        a(ahkr, 4, ajpu);
    }

    public final void a(ainz ainz, ajpu ajpu) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            it.next();
        }
        ajpu.I().e_(ainz);
    }

    public final void a(afif afif, ajpu ajpu) {
        for (ajps a : this.b) {
            a.a(afif, ajpu.Q());
        }
        ajpu.C().e_(afif);
    }

    public static void a(ahjv ahjv, ajpu ajpu) {
        ajpu.G().e_(ahjv);
    }

    /* Access modifiers changed, original: final */
    public final void a(String str) {
        for (ajps d : this.b) {
            d.d(str);
        }
    }

    public final void b() {
        for (ajps c : this.b) {
            c.c();
        }
    }

    static void a(ahjp ahjp, ajpu ajpu) {
        ajpu.B().e_(ahjp);
    }

    public static void e(ajpu ajpu) {
        ajpu.u().e_(new ahjz());
        Object a = ajpu.a();
        xci xci = a.b;
        if (xci == null) {
            xtl.d("Unexpected eventBus=null in onPlayerResponseLoaded event");
        } else {
            xci.a(a);
        }
    }

    public final void a(ahkr ahkr, int i, ajpu ajpu) {
        if (i == 2 || i == 4) {
            for (ajps a : this.b) {
                a.a(ahkr);
            }
        }
        if (i == 3 || i == 4) {
            if (ajpu == null) {
                this.a.d(ahkr);
            } else {
                ajpu.L().e_(ahkr);
            }
        }
    }

    public final void a(ajpu ajpu, ahkm ahkm, int i) {
        for (ajps ajps : this.b) {
            if (ajps.f()) {
                ajps.a(ahkm);
            }
        }
        if (i == 4) {
            ajpu.w().e_(ahkm);
        }
    }

    public final void b(ajpu ajpu, ahkm ahkm, int i) {
        for (ajps ajps : this.b) {
            if (!ajps.f()) {
                ajps.a(ahkm);
            }
        }
        if (i == 4) {
            ajpu.v().e_(ahkm);
        }
    }

    public final void a(ahjc ahjc, ajpu ajpu, int i) {
        if (i == 2 || i == 4) {
            for (ajps a : this.b) {
                a.a(ahjc);
            }
        }
        if (i == 3 || i == 4) {
            ajpu.P().e_(ahjc);
        }
    }
}
