package defpackage;

import java.util.List;

/* renamed from: abps */
class abps extends akun {
    public final /* synthetic */ abpo a;
    private boolean b;

    abps(abpo abpo, aana aana, xci xci, xoi xoi, acvx acvx) {
        this.a = abpo;
        super(aana, xci, xoi, acvx);
        this.L = new abpv(this, xoi);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aali aali) {
        if (aali instanceof abbd) {
            abbd abbd = (abbd) aali;
            if (this.b) {
                abbd.c = true;
                this.b = false;
            }
            abpo abpo = this.a;
            if (abpo.n && !abpo.m) {
                abbd.b = true;
            }
            abpo.n = false;
        }
    }

    public final void b(List list) {
        super.b(list);
    }

    protected static ajxa b(ajtk ajtk) {
        return (ajtk == null || !ajtk.hasExtension(ajxa.a)) ? null : (ajxa) ajtk.getExtension(ajxa.a);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(ajxa ajxa) {
        this.a.c(ajxa);
    }

    public final void b() {
        this.b = true;
        super.s();
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ void a(Object obj, ajti ajti) {
        a((ajxa) obj);
    }
}
