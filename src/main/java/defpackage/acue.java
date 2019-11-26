package defpackage;

/* renamed from: acue */
public final class acue implements zyv {
    private final bcaa a;
    private final xti b;

    public acue(bcaa bcaa, xti xti) {
        this.a = bcaa;
        this.b = xti;
    }

    public final void a(int i, boolean z) {
        boolean a = this.b.a("failsafe_clear_cache_release_13_02", false);
        axtt axtt = (axtt) axtu.e.createBuilder();
        axtt.copyOnWrite();
        axtu axtu = (axtu) axtt.instance;
        axtu.a |= 1;
        axtu.b = z;
        axtt.copyOnWrite();
        axtu axtu2 = (axtu) axtt.instance;
        axtu2.a |= 4;
        axtu2.c = i;
        axtt.copyOnWrite();
        axtu axtu3 = (axtu) axtt.instance;
        axtu3.a |= 8;
        axtu3.d = a;
        axtu3 = (axtu) ((anxl) axtt.build());
        asmz asmz = (asmz) asmw.f.createBuilder();
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        if (axtu3 != null) {
            asmw.c = axtu3;
            asmw.b = 62;
            ((acum) this.a.get()).a((asmw) ((anxl) asmz.build()));
            return;
        }
        throw new NullPointerException();
    }
}
