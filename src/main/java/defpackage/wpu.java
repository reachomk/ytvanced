package defpackage;

/* renamed from: wpu */
final class wpu implements afsw {
    public final /* synthetic */ wpv a;
    private final /* synthetic */ asmw b;
    private final /* synthetic */ asmw c;

    wpu(wpv wpv, asmw asmw, asmw asmw2) {
        this.a = wpv;
        this.b = asmw;
        this.c = asmw2;
    }

    public final void a(bqn bqn) {
        this.a.g.dismiss();
        for (wqr b : this.a.h.a) {
            b.b();
        }
        this.a.d.c(bqn);
        b();
    }

    private final void a() {
        asmw asmw = this.b;
        if (asmw != null) {
            this.a.i.a(asmw);
        }
    }

    private final void b() {
        asmw asmw = this.c;
        if (asmw != null) {
            this.a.i.a(asmw);
        }
    }
}
