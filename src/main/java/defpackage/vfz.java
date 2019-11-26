package defpackage;

/* renamed from: vfz */
final /* synthetic */ class vfz implements Runnable {
    private final vfw a;

    vfz(vfw vfw) {
        this.a = vfw;
    }

    public final void run() {
        vfw vfw = this.a;
        vso vso = vfw.d;
        if (vso != null && vfw.g) {
            vge vge = vfw.a;
            String str = vfw.b;
            vsm vsm = vfw.c;
            if (!wcf.d(vge.i)) {
                ((vjr) vge.a.get()).a(str, vsm, vso, vra.AD_VIDEO_TIMEOUT, -1, -1);
                ((vjr) vge.a.get()).a(str, vsm, vge.m.a);
            } else if (vge.m.a(str) != null) {
                vge.m.a(str).a(vso);
            }
        }
        vfw.a();
    }
}
