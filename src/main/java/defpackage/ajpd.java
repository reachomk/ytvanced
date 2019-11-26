package defpackage;

/* renamed from: ajpd */
final /* synthetic */ class ajpd implements Runnable {
    private final ajpe a;

    ajpd(ajpe ajpe) {
        this.a = ajpe;
    }

    public final void run() {
        ajpe ajpe = this.a;
        xak.a();
        if (ajpe.e == null && ajpe.d) {
            ajpe.f = (ajpc) ajpe.h.poll();
            if (ajpe.f != null) {
                ajpe.f.b();
                ajpe.e = new ajpn(ajpe);
                if (!ajpe.g) {
                    ajpe.g = true;
                    ajpe.a.a(0);
                }
                ajpe.f.a(ajpe.e);
            } else if (ajpe.g) {
                ajpe.g = false;
                ajpe.a.a();
            }
        }
    }
}
