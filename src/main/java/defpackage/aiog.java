package defpackage;

/* renamed from: aiog */
public final class aiog {
    private final xci a;

    public aiog(xci xci, bctz bctz, aiqh aiqh, aiyg aiyg, bctz bctz2) {
        this.a = xci;
        if (bctz != null) {
            bctz.c().a(new aioj(this));
        }
        if (bctz2 != null) {
            bctz2.a(new aioi(this));
        }
        if (aiqh != null) {
            aiqh.a.c().a(new aiov(this));
            aiqh.b.c().a(new aipe(this));
        }
        if (aiyg != null) {
            aiyg.o().c().a(new aipg(this));
            aiyg.q().c().a(new aipj(this));
            aiyg.v().c().a(new aipi(this));
            aiyg.w().c().a(new aipl(this));
            aiyg.n().c().a(new aipk(this));
            aiyg.p().c().a(new aipn(this));
            aiyg.r().c().a(new aiol(this));
            aiyg.t().c().a(new aiok(this));
            aiyg.u().c().a(new aion(this));
            aiyg.s().c().a(new aiom(this));
        }
    }

    public final void a(Object obj) {
        this.a.d(obj);
    }

    public final void b(Object obj) {
        this.a.c(obj);
    }
}
