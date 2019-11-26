package defpackage;

/* renamed from: vku */
final class vku extends ajmp {
    private final /* synthetic */ vkt a;

    vku(vkt vkt, long j, long j2, ajms ajms, ajmr ajmr) {
        this.a = vkt;
        super(j, j2, ajms, ajmr, null);
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        vkt vkt = this.a;
        if (!z && !z3) {
            vkt.a.d(new vpf());
            if (!vkt.c.a.isEmpty()) {
                try {
                    vkt.b();
                } catch (vlc e) {
                    vkt.d.a(vkt.b, new vmb(e.toString()));
                }
            }
        }
    }
}
