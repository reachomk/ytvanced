package defpackage;

/* renamed from: vgi */
final /* synthetic */ class vgi implements bcvk {
    private final vge a;

    vgi(vge vge) {
        this.a = vge;
    }

    public final void a(Object obj) {
        vge vge = this.a;
        int R = ((ahkq) obj).b.R();
        vgd vgd = vge.m;
        if (vgd != null && vgd.a()) {
            vgd = vge.m;
            if (vgd.i == -1) {
                vgd.i = R;
                return;
            }
            vge.h.d(new vpr());
            vge.m.i = R;
        }
    }
}
