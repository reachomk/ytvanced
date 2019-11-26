package defpackage;

/* renamed from: ypy */
final /* synthetic */ class ypy implements xsd {
    private final ypw a;

    ypy(ypw ypw) {
        this.a = ypw;
    }

    public final void a(Object obj) {
        ypw ypw = this.a;
        yko yko = (yko) obj;
        ypw.f();
        ypw.h = yko.getHeaderKey();
        ypw.i = ypw.e.a(yko.getHeaderKey(), new ypx(ypw), false, ypw.c);
        ypw.j = ypw.e.a(yko.getBodyKey(), new yqa(ypw), false, ypw.c);
    }
}
