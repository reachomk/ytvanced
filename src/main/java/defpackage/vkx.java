package defpackage;

/* renamed from: vkx */
final class vkx implements ajpc {
    private final /* synthetic */ vkt a;

    vkx(vkt vkt) {
        this.a = vkt;
    }

    public final int b() {
        return 0;
    }

    public final void a(ajpa ajpa) {
        vkt vkt = this.a;
        vkt.e = ajpa;
        vkt.a.d(new vpe());
        vkt vkt2 = this.a;
        vkt2.d.a(vkt2.b);
        this.a.c.b = this.a.c.b + 1;
        vkt2 = this.a;
        vkt2.a(vkt2.c.b);
    }

    public final void a() {
        vky vky = this.a.c;
        vso a = vky.a(vky.b);
        if (a != null) {
            vkt vkt = this.a;
            vkt.d.a(vkt.b, a, new vlt(5, -1, -1));
        }
        vkt vkt2 = this.a;
        vkt2.e = null;
        vkt2.d();
    }
}
