package defpackage;

/* renamed from: aicv */
final /* synthetic */ class aicv implements bcvk {
    private final aicw a;

    aicv(aicw aicw) {
        this.a = aicw;
    }

    public final void a(Object obj) {
        aicw aicw = this.a;
        atdv atdv = (atdv) obj;
        if (aicw.a(atdv) != null) {
            aicw.f = aicw.a(atdv);
            if (aicw.f != null && !aicw.h) {
                aicw.f();
                aicw.g();
            }
        }
    }
}
