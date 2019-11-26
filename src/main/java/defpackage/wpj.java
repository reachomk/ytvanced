package defpackage;

/* renamed from: wpj */
final class wpj implements afsw {
    private final asmw a;
    private final /* synthetic */ atqe b;
    private final /* synthetic */ wph c;

    wpj(wph wph, atqe atqe) {
        asmw d;
        this.c = wph;
        this.b = atqe;
        if ((this.b.a & 4096) != 0) {
            wpp wpp = new wpp();
            wpp.a(this.b.m.d());
            wpp.a = 3;
            d = wpp.d();
        } else {
            d = null;
        }
        this.a = d;
    }

    public final void a(bqn bqn) {
        asmw asmw = this.a;
        if (asmw != null) {
            this.c.h.a(asmw);
        }
        this.c.a((Throwable) bqn);
    }
}
