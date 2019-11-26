package defpackage;

/* renamed from: uyg */
final class uyg implements uyf {
    private final /* synthetic */ uyh a;

    uyg(uyh uyh) {
        this.a = uyh;
    }

    public final void a(aanv aanv) {
        this.a.a(aanv, null);
    }

    public final void a() {
        uyh uyh = this.a;
        if (!((utv) uyh.b.get()).a()) {
            uyh.a(true);
        }
        uyh.a(uyz.CANCELLED, null);
        uyh.f.c(new uyq());
        uyh.d.execute(new uyl(uyh));
    }

    public final void a(Exception exception) {
        this.a.a(exception);
    }
}
