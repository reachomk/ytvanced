package defpackage;

import android.view.View;

/* renamed from: vor */
final class vor extends cma {
    @cue(a = 13)
    public aoge a;
    @cue(a = 13)
    public tpu b;
    @cue(a = 10)
    public cma c;
    @cue(a = 13)
    public swf d;

    public vor() {
        super("ActiveViewDisplayContainerType");
    }

    /* Access modifiers changed, original: protected|final */
    public final cma b(cmg cmg) {
        cma cma = this.c;
        ctb a = ctc.a(cmg);
        a.a(cma);
        a.d(cmm.a(cmg, 1749548209, new Object[]{cmg})).e(cmm.a(cmg, -1782007764, new Object[]{cmg}));
        return (ctc) a.c();
    }

    public final Object a(coj coj, Object obj) {
        int i = coj.b;
        vor vor;
        if (i == -1782007764) {
            vor = (vor) coj.a;
            vor.b.a(vor.a.e);
            return null;
        } else if (i == -1048037474) {
            cmm.a((cmg) coj.c[0], (coi) obj);
            return null;
        } else if (i != 1749548209) {
            return null;
        } else {
            csw csw = (csw) obj;
            cor cor = coj.a;
            View view = csw.a;
            vor = (vor) cor;
            swf swf = vor.d;
            tpu tpu = vor.b;
            aoge aoge = vor.a;
            tpu.a(aoge.e, view, new vos(swf, aoge));
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ cma g() {
        vor vor = (vor) super.g();
        cma cma = vor.c;
        vor.c = cma != null ? cma.g() : null;
        return vor;
    }
}
